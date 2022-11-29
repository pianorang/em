package me.pianorang.em.core.event.application;

import me.pianorang.em.common.application.JqueryDataTablesRequest;
import me.pianorang.em.common.application.JqueryDataTablesResponse;
import me.pianorang.em.common.application.LoadJqueryDataTablesPort;
import org.springframework.stereotype.Service;

@Service
public class EventJqueryDataTablesService implements LoadJqueryDataTablesPort {
    @Override
    public JqueryDataTablesResponse loadDataTables(JqueryDataTablesRequest request) {
        return null;
    }
}
