package pe.edu.vallegrande.luis.huaraca.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("persona")
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
}