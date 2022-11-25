package me.pianorang.em.security.application;

import me.pianorang.em.core.user.domain.User;
import me.pianorang.em.core.user.domain.UserRepository;
import me.pianorang.em.security.domain.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> dbUser = userRepository.findByUserName(username);
        return new UserDetailsImpl(dbUser.orElseThrow());
    }
}
