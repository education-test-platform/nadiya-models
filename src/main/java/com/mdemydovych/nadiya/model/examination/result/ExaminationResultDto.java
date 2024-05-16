package com.mdemydovych.nadiya.model.examination.result;

import java.util.List;
import lombok.Data;

@Data
public class ExaminationResultDto {

  private String id;

  private String studentId;

  private String score;

  private List<AnswerDto> answers;

  private String examinationId;
}
