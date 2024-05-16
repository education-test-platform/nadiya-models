package com.mdemydovych.nadiya.model.examination.core;

import java.util.List;
import lombok.Data;

@Data
public class QuestionDto {

  private String id;

  private String description;

  private PictureDto picture;

  private List<VariantDto> variants;
}
