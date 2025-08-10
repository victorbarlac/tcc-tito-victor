package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Campus;
import br.org.rapeifes.dto.CampusResumoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CampusResumoMapper extends GenericMapper<CampusResumoDTO, Campus> {
    @Override
    CampusResumoDTO toDto(Campus entity);

    @Override
    Campus toEntity(CampusResumoDTO dto);
}
