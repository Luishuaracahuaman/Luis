package pe.edu.vallegrande.luis.huaraca.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.luis.huaraca.model.Persona;
import pe.edu.vallegrande.luis.huaraca.repository.PersonaRepository;
import pe.edu.vallegrande.luis.huaraca.service.PersonaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository repository;

    @Override
    public Flux<Persona> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Mono<Persona> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Persona> guardar(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Mono<Persona> actualizar(Long id, Persona persona) {
        return repository.findById(id)
                .flatMap(existing -> {
                    existing.setNombre(persona.getNombre());
                    existing.setApellido(persona.getApellido());
                    existing.setEmail(persona.getEmail());
                    return repository.save(existing);
                });
    }

    @Override
    public Mono<Void> eliminar(Long id) {
        return repository.deleteById(id);
    }
}