package com.dbc.colabore.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class UsuarioEntity {
    private Integer idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String fotoPerfil;
}
