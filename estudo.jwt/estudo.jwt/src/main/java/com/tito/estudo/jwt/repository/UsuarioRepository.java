package com.tito.estudo.jwt.repository;

import org.springframework.data.repository.CrudRepository;

import com.tito.estudo.jwt.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}