package br.com.alura.desafio_fipe.principal;

import br.com.alura.desafio_fipe.service.ConsumoApi;

public class Principal {
    public static void main(String[] args) {
        ConsumoApi consumoApi = new ConsumoApi();
        String json = consumoApi.obterDados("https://parallelum.com.br/fipe/api/v1/carros/marcas");
        System.out.println(json);
    }
}
