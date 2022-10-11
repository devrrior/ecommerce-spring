package com.devrrior.ecommercespring.services.interfaces;

import com.devrrior.ecommercespring.controllers.dtos.requests.CreateAddressRequest;
import com.devrrior.ecommercespring.controllers.dtos.requests.UpdateAddressRequest;
import com.devrrior.ecommercespring.controllers.dtos.responses.BaseResponse;

public interface IAddresService {

    BaseResponse get(Long id);

    BaseResponse listAllByUserId(Long userId);

    BaseResponse create(CreateAddressRequest request);

    BaseResponse update(UpdateAddressRequest request, Long id);

    BaseResponse delete(Long id);

}
