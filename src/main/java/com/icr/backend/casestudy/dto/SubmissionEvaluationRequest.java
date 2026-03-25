package com.icr.backend.casestudy.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubmissionEvaluationRequest {

    private Integer score;
    private String feedback;
    private List<CoScoreRequest> coScores;
}
