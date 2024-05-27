package com.mdemydovych.nadiya.model.examination.result;

import com.mdemydovych.nadiya.model.examination.core.ExaminationDto;
import com.mdemydovych.nadiya.model.user.UserDto;
import java.util.List;
import lombok.Data;

@Data
public class ExaminationResultDto {

  private String id;

  private UserDto student;

  private String score;

  private List<AnswerDto> answers;

  private ExaminationDto examination;
}
