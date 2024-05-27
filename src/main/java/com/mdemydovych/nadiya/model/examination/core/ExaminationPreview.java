package com.mdemydovych.nadiya.model.examination.core;

import com.mdemydovych.nadiya.model.user.UserDto;
import lombok.Data;

@Data
public class ExaminationPreview {

  private String id;

  private String title;

  private UserDto teacher;
}
