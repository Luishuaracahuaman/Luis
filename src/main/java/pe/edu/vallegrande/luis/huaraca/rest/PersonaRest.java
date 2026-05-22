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
        return personaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Mono<Persona> obtenerPorId(@PathVariable Long id) {
        return personaService.obtenerPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Persona> guardar(@RequestBody Persona persona) {
        return personaService.guardar(persona);
    }

    @PutMapping("/{id}")
    public Mono<Persona> actualizar(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.actualizar(id, persona);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> eliminar(@PathVariable Long id) {
        return personaService.eliminar(id);
    }
}
