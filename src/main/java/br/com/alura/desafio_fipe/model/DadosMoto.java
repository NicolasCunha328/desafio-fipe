package br.com.alura.desafio_fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosMoto(@JsonAlias String codigo,
                        @JsonAlias String marca) {
}
