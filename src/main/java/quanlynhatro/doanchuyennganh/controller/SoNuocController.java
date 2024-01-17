package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.request.SoDienNuocRquestDTO;
import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.SoNuoc;
import quanlynhatro.doanchuyennganh.service.SoNuocService;

import java.util.List;

@RestController
@RequestMapping("/SoNuoc")
public class SoNuocController implements IController<SoNuoc> {
    @Autowired
    private SoNuocService soNuocService;

    @Override
    @GetMapping("/")
    public Response<List<SoNuoc>> getAll() {
        return soNuocService.getAll();
    }

    @Override
    public Response<SoNuoc> insert(SoNuoc soNuoc) {
        return null;
    }

    @PostMapping("/")
    public Response<SoNuoc> insert(@RequestBody SoDienNuocRquestDTO soNuoc) {
        return soNuocService.insert(soNuoc);
    }

    @Override
    @PutMapping("/")
    public Response<SoNuoc> update(SoNuoc soNuoc) {
        return soNuocService.update(soNuoc);
    }
}
