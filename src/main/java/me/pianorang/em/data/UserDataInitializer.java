package me.pianorang.em.data;

import me.pianorang.em.core.user.application.UserCommand;
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
        userRegistrationPort.join(new UserCommand("전성한", "jsh", "wjstjdgks", "jsh@test.com"));
        userRegistrationPort.join(new UserCommand("전이루", "jyr", "wjstjdgks", "jyr@test.com"));
        userRegistrationPort.join(new UserCommand("전리라", "jrr", "wjstjdgks", "jrr@test.com"));
    }
}
