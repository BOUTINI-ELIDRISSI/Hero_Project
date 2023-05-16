package ma.heros.mapper;

import ma.heros.dtos.HeroDto;
import ma.heros.entities.HeroEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface HeroMapper {

    HeroEntity convertDtoToEntity(HeroDto dto);
    HeroDto convertEntityToDto(HeroEntity entity);
    List<HeroDto> convertToDots(List<HeroEntity> entities);

}
