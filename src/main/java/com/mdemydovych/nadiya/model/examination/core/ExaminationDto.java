package com.mdemydovych.nadiya.model.examination.core;

import java.util.Set;
import lombok.Data;

@Data
public class ExaminationDto {

  private String id;

  private String title;

  private String teacherId;

  private Set<QuestionDto> questions;
}
