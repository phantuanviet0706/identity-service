package com.vietphan.identity_service.mapper;

import com.vietphan.identity_service.dto.request.UserCreationRequest;
import com.vietphan.identity_service.dto.request.UserUpdateRequest;
import com.vietphan.identity_service.dto.response.UserResponse;
import com.vietphan.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

//    @Mapping(target = "lastName", ignore = true)
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
