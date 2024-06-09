package com.mdemydovych.nadiya.model.examination.core;

import com.mdemydovych.nadiya.model.user.UserDto;
import java.util.Set;
import lombok.Data;

@Data
public class ExaminationDto {

  private String id;

  private String title;

  private UserDto teacher;

  private boolean enabled;

  private Set<QuestionDto> questions;
}
