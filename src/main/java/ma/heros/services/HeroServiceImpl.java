package ma.heros.services;

import ma.heros.dtos.HeroDto;
import ma.heros.mapper.HeroMapper;
import ma.heros.repositories.HeroRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService{

    private HeroRepository heroRepository;
    private HeroMapper mapper= Mappers.getMapper(HeroMapper.class);

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }


    @Override
    public long create(HeroDto dto) {
        return mapper.convertEntityToDto(heroRepository.save(mapper.convertDtoToEntity(dto))).getId();
    }

    @Override
    public long update(HeroDto dto) {
        return mapper.convertEntityToDto(heroRepository.save(mapper.convertDtoToEntity(dto))).getId();
    }

    @Override
    public boolean delete(long id) {
        heroRepository.deleteById(id);
        return true;
    }

    @Override
    public List<HeroDto> selectAll() {
        return mapper.convertToDots(heroRepository.findAll());
    }
}
