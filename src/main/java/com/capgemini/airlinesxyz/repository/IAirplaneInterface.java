package com.capgemini.airlinesxyz.repository;

import com.capgemini.airlinesxyz.model.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Er is geen ID, enkel een naam waarmee de Airplanes worden genoemd.

@Repository
public interface IAirplaneInterface extends CrudRepository<Airplane, String> {
}
