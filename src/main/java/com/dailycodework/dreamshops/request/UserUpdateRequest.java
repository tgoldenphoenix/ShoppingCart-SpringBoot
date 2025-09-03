package com.dailycodework.dreamshops.request;

import lombok.Data;

@Data
public class UserUpdateRequest {
    // edit email & password is a different request
    private String firstName;
    private String lastName;
}
