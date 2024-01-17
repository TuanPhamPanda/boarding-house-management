package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.request.SoDienNuocRquestDTO;
import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.SoDien;
import quanlynhatro.doanchuyennganh.service.SoDienService;

import java.util.List;

@RestController
@RequestMapping("/SoDien")
public class SoDienController implements IController<SoDien> {
    @Autowired
    private SoDienService soDienService;

    @Override
    @GetMapping("/")
    public Response<List<SoDien>> getAll() {
        return soDienService.getAll();
    }

    @Override
    public Response<SoDien> insert(SoDien soDien) {
        return soDienService.insert(soDien);
    }

    @PostMapping("/")
    public Response<SoDien> insert(@RequestBody SoDienNuocRquestDTO soDien) {
        return soDienService.insert(soDien);
    }

    @Override
    @PutMapping("/")
    public Response<SoDien> update(SoDien soDien) {
        return soDienService.update(soDien);
    }
}
