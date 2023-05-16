package ma.heros.services;


import ma.heros.dtos.HeroDto;

import java.util.List;

public interface HeroService {

    long create(HeroDto dto);
    long update (HeroDto dto);
    boolean delete (long id);
    List<HeroDto> selectAll();
}
