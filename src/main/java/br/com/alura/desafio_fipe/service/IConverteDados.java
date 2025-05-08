package br.com.alura.desafio_fipe.service;

import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
    <T>List<T> obterLista(String json, Class<T> classe);
}
