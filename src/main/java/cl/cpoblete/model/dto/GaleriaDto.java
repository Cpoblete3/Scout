package cl.cpoblete.model.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import cl.cpoblete.model.entity.Galeria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Data
public class GaleriaDto {
	private Galeria galeria;
    private List<Galeria> galerias;
}
