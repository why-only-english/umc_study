package umc.study.apiPayload.code;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@Getter
@RequiredArgsConstructor
public class ErrorReasonDTO {
    private final String code;
    private final String message;
    private final boolean isSuccess;
    private final HttpStatus httpStatus;
}
