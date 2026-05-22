package pe.edu.vallegrande.luis.huaraca.service;

import pe.edu.vallegrande.luis.huaraca.model.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaService {

    Flux<Persona> listarTodos();

    Mono<Persona> obtenerPorId(Long id);

    Mono<Persona> guardar(Persona persona);

    Mono<Persona> actualizar(Long id, Persona persona);

    Mono<Void> eliminar(Long id);
}
