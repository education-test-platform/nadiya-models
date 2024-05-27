package com.mdemydovych.nadiya.model.request;

import lombok.Builder;

@Builder
public record AssignStudentRequest(String studentId,
                                   String teacherId) {

}
