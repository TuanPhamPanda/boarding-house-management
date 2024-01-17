package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.LoaiTienIch;
import quanlynhatro.doanchuyennganh.service.LoaiTienIchService;

import java.util.List;

@RestController
@RequestMapping("/LoaiTienIch")
public class LoaiTienIchController implements IController<LoaiTienIch> {
    @Autowired
    private LoaiTienIchService loaiTienIchService;

    @Override
    @GetMapping("/")
    public Response<List<LoaiTienIch>> getAll() {
        return loaiTienIchService.getAll();
    }

    @Override
    @PostMapping("/")
    public Response<LoaiTienIch> insert(LoaiTienIch loaiTienIch) {
        return loaiTienIchService.insert(loaiTienIch);
    }

    @Override
    @PutMapping("/")
    public Response<LoaiTienIch> update(LoaiTienIch loaiTienIch) {
        return loaiTienIchService.update(loaiTienIch);
    }
}
