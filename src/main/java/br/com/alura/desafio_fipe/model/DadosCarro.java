package br.com.alura.desafio_fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosCarro(@JsonAlias String codigo,
                         @JsonAlias String marca) {
}
