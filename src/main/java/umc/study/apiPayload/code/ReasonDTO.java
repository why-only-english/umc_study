package umc.study.apiPayload.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ReasonDTO {
    private final String code;
    private final String message;
}
