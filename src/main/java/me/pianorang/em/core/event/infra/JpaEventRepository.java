package me.pianorang.em.core.event.infra;

import me.pianorang.em.core.event.domain.Event;
import me.pianorang.em.core.event.domain.EventRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEventRepository extends EventRepository, JpaRepository<Event, Long> {

}
