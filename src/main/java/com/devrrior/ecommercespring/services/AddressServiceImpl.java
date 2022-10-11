package com.devrrior.ecommercespring.services;

import com.devrrior.ecommercespring.controllers.dtos.requests.CreateAddressRequest;
import com.devrrior.ecommercespring.controllers.dtos.requests.UpdateAddressRequest;
import com.devrrior.ecommercespring.controllers.dtos.responses.BaseResponse;
import com.devrrior.ecommercespring.controllers.dtos.responses.CreateAddressResponse;
import com.devrrior.ecommercespring.controllers.dtos.responses.GetAddressResponse;
import com.devrrior.ecommercespring.entities.Address;
import com.devrrior.ecommercespring.entities.User;
import com.devrrior.ecommercespring.repositories.IAddressRepository;
import com.devrrior.ecommercespring.services.interfaces.IAddresService;
import com.devrrior.ecommercespring.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.stream.Collectors;

public class AddressServiceImpl implements IAddresService {

    @Autowired
    private IAddressRepository repository;

    @Autowired
    private IUserService userService;

    @Override
    public BaseResponse get(Long id) {
        Address address = repository.findById(id).orElseThrow();
        return BaseResponse.builder()
                .data(toGetAddressResponse(address))
                .message("Address found successfully")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK).build();
    }

    @Override
    public BaseResponse listAllByUserId(Long userId) {
        List<GetAddressResponse> addresses = repository.findAllByUserId(userId)
                .stream()
                .map(this::toGetAddressResponse)
                .collect(Collectors.toList());
        return BaseResponse.builder()
                .data(addresses)
                .message("All addresses found")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK).build();
    }

    @Override
    public BaseResponse create(CreateAddressRequest request) {
        User user = userService.findAndEnsureExist(request.getUserId());
        Address address = repository.save(from(request, user));

        return BaseResponse.builder()
                .data(toCreateAddressResponse(address))
                .message("Address created successful")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED).build();
    }

    @Override
    public BaseResponse update(UpdateAddressRequest request, Long id) {
        Address address = repository.save(from(request, id));

        return BaseResponse.builder()
                .data(address)
                .message("Address updated successful")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK).build();
    }

    @Override
    public BaseResponse delete(Long id) {
        repository.deleteById(id);

        return BaseResponse.builder()
                .message("Address deleted successful")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.NO_CONTENT).build();
    }

    private GetAddressResponse toGetAddressResponse(Address address) {
        return GetAddressResponse.builder()
                .street(address.getStreet())
                .zipcode(address.getZipcode())
                .state(address.getState())
                .country(address.getCountry())
                .userId(address.getUser().getId()).build();
    }

    private CreateAddressResponse toCreateAddressResponse(Address address) {
        return CreateAddressResponse.builder()
                .street(address.getStreet())
                .zipcode(address.getZipcode())
                .state(address.getState())
                .country(address.getCountry())
                .userId(address.getUser().getId()).build();
    }

    private Address from(CreateAddressRequest request, User user) {
        return Address.builder()
                .street(request.getStreet())
                .zipcode(request.getZipcode())
                .state(request.getState())
                .country(request.getCountry())
                .user(user).build();
    }

    private Address from(UpdateAddressRequest request, Long id) {
        return Address.builder()
                .id(id)
                .street(request.getStreet())
                .zipcode(request.getZipcode())
                .state(request.getState())
                .country(request.getCountry()).build();
    }
}
