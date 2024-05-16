package com.mdemydovych.nadiya.model.user;

import lombok.Data;

@Data
public class UserDto {

  private String id;

  private String username;

  private String email;

  private UserRole role;
}
