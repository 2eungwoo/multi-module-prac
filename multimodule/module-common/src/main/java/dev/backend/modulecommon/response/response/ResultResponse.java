package dev.backend.modulecommon.response.response;

import lombok.Getter;

@Getter
public class ResultResponse {

    private final String status;
    private final String code;
    private final String message;
    private final Object data;

    public static ResultResponse of(Response response, Object data) {
        return new ResultResponse(response, data);
    }

    public ResultResponse(Response resultCode, Object data) {
        this.status = resultCode.getStatus();
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }
}