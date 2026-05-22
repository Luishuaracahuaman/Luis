package pe.edu.vallegrande.luis.huaraca.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.luis.huaraca.model.Persona;

public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {
}
