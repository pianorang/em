package me.pianorang.em.common.application;

import lombok.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Value
public class JqueryDataTablesRequest {
    private int draw;
    private int page;
    private int length;
    private Sort.Direction sortDirection;
    private String sortColumn;
    private Pageable pageable;

    public JqueryDataTablesRequest(int draw, int page, int length, Sort.Direction sortDirection, String sortColumn) {
        this.draw = draw;
        this.page = page;
        this.length = length;
        this.sortDirection = sortDirection == null ? Sort.Direction.DESC : sortDirection;
        this.sortColumn = sortColumn == null ? "id" : sortColumn;
        this.pageable = PageRequest.of(page, length, this.sortDirection, this.sortColumn);
    }
}
