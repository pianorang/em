package me.pianorang.em.data;

import me.pianorang.em.core.event.application.EventCommand;
import me.pianorang.em.core.event.application.EventCrudPort;
import me.pianorang.em.core.user.application.UserRegistrationPort;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@ConditionalOnProperty(name = "user.data.initialize", havingValue = "true")
public class EventDataInitializer implements InitializingBean {
    private final EventCrudPort eventCrudPort;

    public EventDataInitializer(EventCrudPort eventCrudPort) {
        this.eventCrudPort = eventCrudPort;

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        eventCrudPort.save(new EventCommand(null,"Event111", "광고설명111",
                LocalDateTime.of(2022, 11,1, 0, 0),
                LocalDateTime.of(2022, 12,1, 0, 0), true ));
        eventCrudPort.save(new EventCommand(null,"Event222", "광고설명222",
                LocalDateTime.of(2022, 11,1, 0, 0),
                LocalDateTime.of(2022, 12,1, 0, 0), true ));
        eventCrudPort.save(new EventCommand(null,"Event333", "광고설명333",
                LocalDateTime.of(2022, 11,1, 0, 0),
                LocalDateTime.of(2022, 12,1, 0, 0), true ));
    }
}
