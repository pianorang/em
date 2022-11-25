package me.pianorang.em.core.user.domain;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUserName(String userName);

    User save(User user);
}
