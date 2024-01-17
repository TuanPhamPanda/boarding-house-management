package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.TienIch;
import quanlynhatro.doanchuyennganh.service.TienIchService;

import java.util.List;

@RestController
@RequestMapping("/TienIch")
public class TienIchController implements IController<TienIch> {
    @Autowired
    private TienIchService tienIchService;

    @Override
    @GetMapping("/")
    public Response<List<TienIch>> getAll() {
        return tienIchService.getAll();
    }

    @Override
    @PostMapping("/")
    public Response<TienIch> insert(TienIch tienIch) {
        return tienIchService.insert(tienIch);
    }

    @Override
    @PutMapping("/")
    public Response<TienIch> update(TienIch tienIch) {
        return tienIchService.update(tienIch);
    }
}
