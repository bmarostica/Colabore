package com.dbc.colabore.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CampanhaDTO extends CampanhaCreateDTO{

    private Integer idCampanha;
    private BigDecimal totalArrecadado;
    private List<Usuario> usuariosContribuidores;
    private LocalDateTime ultimaAlteracao;





}
