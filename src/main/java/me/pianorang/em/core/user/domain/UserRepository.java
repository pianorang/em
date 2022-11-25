package me.pianorang.em.core.user.domain;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUserAccount(String userAccount);

    User save(User user);
}
