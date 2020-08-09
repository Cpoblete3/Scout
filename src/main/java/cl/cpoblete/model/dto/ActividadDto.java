package cl.cpoblete.model.dto;

	import java.util.List;

	import cl.cpoblete.model.entity.Actividad;

	import lombok.ToString;


	import org.springframework.stereotype.Component;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;


	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	@Component
	@Data
	public class ActividadDto {
	    private Actividad actividad;
	    private List<Actividad> actividades;
	}

