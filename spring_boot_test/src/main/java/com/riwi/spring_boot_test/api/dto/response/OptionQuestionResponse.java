package com.riwi.spring_boot_test.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OptionQuestionResponse {
    private Long id;
    private String text;
    private boolean active;
}
