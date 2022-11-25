package me.pianorang.em.core.user.application;

import me.pianorang.em.core.user.domain.User;
import me.pianorang.em.core.user.domain.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserRegistrationPort {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }



    @Override
    public User join(String userName, String userAccount, String userPassword) {
        return userRepository.save(User.create(userName, userAccount, passwordEncoder.encode(userPassword)));
    }
}
