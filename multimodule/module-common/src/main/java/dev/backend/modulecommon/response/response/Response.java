package dev.backend.modulecommon.response.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Response {
    SUCCESS("200","000", "success"),
    FAIL("501","999", "fail");

    private String status;
    private String code;
    private String message;
}


