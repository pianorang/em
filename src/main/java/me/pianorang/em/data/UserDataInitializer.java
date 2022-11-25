package me.pianorang.em.data;

import me.pianorang.em.core.user.application.UserRegistrationPort;
import me.pianorang.em.core.user.domain.User;
import me.pianorang.em.core.user.domain.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@ConditionalOnProperty(name = "user.data.initialize", havingValue = "true")
public class UserDataInitializer implements InitializingBean {
    private final UserRegistrationPort userRegistrationPort;

    public UserDataInitializer(UserRegistrationPort userRegistrationPort) {
        this.userRegistrationPort = userRegistrationPort;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        userRegistrationPort.join("전성한", "jsh", "wjstjdgks");
        userRegistrationPort.join("전이루", "jyr", "wjstjdgks");
        userRegistrationPort.join("전리라", "jrr", "wjstjdgks");
    }
}
