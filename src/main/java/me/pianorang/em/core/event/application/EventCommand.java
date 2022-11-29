package me.pianorang.em.core.event.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.pianorang.em.core.event.domain.Event;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventCommand {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean isClosed;

    public Event mapToEntity(){
        return Event.create(id, title, description, startDate, endDate, isClosed);
    }
}
