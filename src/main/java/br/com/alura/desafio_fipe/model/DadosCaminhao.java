package br.com.alura.desafio_fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosCaminhao(@JsonAlias String codigo,
                            @JsonAlias String marca) {
}
