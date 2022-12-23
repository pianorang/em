package me.pianorang.em.core.user.application;

import me.pianorang.em.core.user.domain.User;

public interface UserRegistrationUseCase {
    /**
     * 사용자 ID로 수정한다.
     *
     * @param user 사용자 개체
     * @return 가입된 사용자 개체
     */
    User join(UserCommand user);
}
