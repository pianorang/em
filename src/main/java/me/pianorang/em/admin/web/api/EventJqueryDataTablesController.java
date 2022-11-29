package me.pianorang.em.admin.web.api;

import me.pianorang.em.admin.common.AdminRestController;
import me.pianorang.em.common.application.JqueryDataTablesRequest;
import me.pianorang.em.common.application.JqueryDataTablesResponse;
import me.pianorang.em.common.application.LoadJqueryDataTablesPort;
import org.springframework.web.bind.annotation.GetMapping;

@AdminRestController
public class EventJqueryDataTablesController {

    private final LoadJqueryDataTablesPort loadJqueryDataTablesPort;

    public EventJqueryDataTablesController(LoadJqueryDataTablesPort loadJqueryDataTablesPort) {
        this.loadJqueryDataTablesPort = loadJqueryDataTablesPort;
    }

    @GetMapping("/event/getList")
    public JqueryDataTablesResponse getList(JqueryDataTablesRequest request){
        return loadJqueryDataTablesPort.loadDataTables(request);
    }


}
