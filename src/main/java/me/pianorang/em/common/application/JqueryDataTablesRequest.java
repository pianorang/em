package me.pianorang.em.common.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class JqueryDataTablesRequest {
    private Pageable pageable;
    private int draw;
}
