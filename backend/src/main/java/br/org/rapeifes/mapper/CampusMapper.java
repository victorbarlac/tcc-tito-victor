package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Campus;
import br.org.rapeifes.dto.CampusDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CursoResumoMapper.class})
public interface CampusMapper extends GenericMapper<CampusDTO, Campus> {
}
