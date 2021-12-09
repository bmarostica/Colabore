package com.dbc.colabore.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CampanhaEntity {

    private String foto;
    private String tituloCampanha;
    private BigDecimal metaArrecadacao;
    private BigDecimal totalArrecadado;
    private List<String> tagsCategoria;
    private LocalDateTime ultimaAlteracao;
    private StatusCampanha statusCampanha;
    private String descricaoCampanha;
    private Usuario criadorCampanha;
    private List<Usuario> usuariosContribuidores;



}
