package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    @Size(min = 8, message = "새 비밀번호는 8자 이상이어야 됩니다")
    @Pattern(regexp = "(?=.*[A-Z].*)(?=.*\\d.*)", message = "새 비밀번호는 숫자와 대문자를 포함해야 합니다")
    @NotBlank
    private String newPassword;
}
