package com.mdemydovych.nadiya.model.examination.core;

import java.util.List;
import lombok.Data;

@Data
public class ExaminationAo {

  private String id;

  private String title;

  private String teacherId;

  private List<QuestionAo> questions;
}
