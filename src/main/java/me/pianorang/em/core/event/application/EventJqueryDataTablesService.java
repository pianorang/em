package me.pianorang.em.core.event.application;

import lombok.extern.slf4j.Slf4j;
import me.pianorang.em.common.application.JqueryDataTablesRequest;
import me.pianorang.em.common.application.JqueryDataTablesResponse;
import me.pianorang.em.common.application.LoadJqueryDataTablesPort;
import me.pianorang.em.core.event.domain.Event;
import me.pianorang.em.core.event.domain.EventRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class EventJqueryDataTablesService implements LoadJqueryDataTablesPort {

    private final EventRepository eventRepository;

    public EventJqueryDataTablesService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public JqueryDataTablesResponse loadDataTables(JqueryDataTablesRequest request) {
        Page<Event> eventPage = eventRepository.findAll(request.getPageable());

        log.debug("!! {}", eventPage);
        return new JqueryDataTablesResponse(
                    request.getDraw(),
                    eventPage.getTotalElements(),
                    eventPage.getTotalElements(),
                    eventPage.getContent()
                );
    }
}
