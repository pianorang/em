package me.pianorang.em.data;

import me.pianorang.em.core.user.application.UserCommand;
import me.pianorang.em.core.user.application.UserRegistrationUseCase;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "user.data.initialize", havingValue = "true")
public class UserDataInitializer implements InitializingBean {
    private final UserRegistrationUseCase userRegistrationUseCase;

    public UserDataInitializer(UserRegistrationUseCase userRegistrationUseCase) {
        this.userRegistrationUseCase = userRegistrationUseCase;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        userRegistrationUseCase.join(new UserCommand("전성한", "jsh", "wjstjdgks", "jsh@test.com"));
        userRegistrationUseCase.join(new UserCommand("전이루", "jyr", "wjstjdgks", "jyr@test.com"));
        userRegistrationUseCase.join(new UserCommand("전리라", "jrr", "wjstjdgks", "jrr@test.com"));
    }
}
