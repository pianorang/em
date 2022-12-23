package me.pianorang.em.core.user.application;

import jakarta.transaction.Transactional;
import me.pianorang.em.core.user.domain.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserManager implements UserEditor {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserManager(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void create(UserCommand user) {
        userRepository.save(user.mapToEntity());
    }

    @Override
    public void update(UserCommand user) {

    }

    @Override
    public void delete(Long id) {

    }
}
