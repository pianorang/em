package me.pianorang.em.core.user.application;

import me.pianorang.em.core.user.domain.User;

public interface UserRegistrationPort {
    User join(String userName, String userAccount, String userPassword);
}
