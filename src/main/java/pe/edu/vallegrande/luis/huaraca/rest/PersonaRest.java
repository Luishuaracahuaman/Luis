package pe.edu.vallegrande.luis.huaraca.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.luis.huaraca.model.Persona;
import pe.edu.vallegrande.luis.huaraca.service.PersonaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/persona")
@RequiredArgsConstructor
public class PersonaRest {

    private final PersonaService personaService;

    @GetMapping
    public Flux<Persona> listarTodos() {
        return personaService.listarTodos()
                .doOnError(e -> System.err.println("Error al listar: " + e.getMessage()));
    }

    @GetMapping("/{id}")
    public Mono<Persona> obtenerPorId(@PathVariable Long id) {
        return personaService.obtenerPorId(id)
                .doOnError(e -> System.err.println("Error al obtener por ID: " + e.getMessage()));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Persona> guardar(@RequestBody Persona persona) {
        return personaService.guardar(persona)
                .doOnError(e -> System.err.println("Error al guardar: " + e.getMessage()));
    }

    @PutMapping("/{id}")
    public Mono<Persona> actualizar(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.actualizar(id, persona)
                .doOnError(e -> System.err.println("Error al actualizar: " + e.getMessage()));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> eliminar(@PathVariable Long id) {
        return personaService.eliminar(id)
                .doOnError(e -> System.err.println("Error al eliminar: " + e.getMessage()));
    }
}