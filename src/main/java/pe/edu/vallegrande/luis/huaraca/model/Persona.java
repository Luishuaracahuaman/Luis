package pe.edu.vallegrande.luis.huaraca.model;

import lombok.AllArgsConstructor; // Este es el import
import lombok.Builder; // Este es el import
import lombok.Data;
import lombok.NoArgsConstructor; // Este es el import
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("PERSONAS") // Cambiado a MAYÚSCULAS
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
}