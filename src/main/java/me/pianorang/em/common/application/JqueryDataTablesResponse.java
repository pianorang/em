package me.pianorang.em.common.application;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class JqueryDataTablesResponse {
    private Integer draw;
    private Long recordsTotal;
    private Long recordsFiltered;
    private List data;
}
