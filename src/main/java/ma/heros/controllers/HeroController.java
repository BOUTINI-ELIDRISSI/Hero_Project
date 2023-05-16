package ma.heros.controllers;

import ma.heros.dtos.HeroDto;
import ma.heros.services.HeroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {
    private HeroService service;

    public HeroController(HeroService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Long create (@RequestBody HeroDto dto)
    {
        return service.create(dto);
    }
    @PutMapping("/update")
    public Long update (@RequestBody HeroDto dto)
    {
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") long id)
    {
        return service.delete(id);
    }

    @GetMapping("selectAll")
    public List<HeroDto> selectAll()
    {
        return service.selectAll();
    }
}
