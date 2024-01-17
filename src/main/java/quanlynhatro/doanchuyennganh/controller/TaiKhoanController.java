package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.request.TaiKhoanRequestDTO;
import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.service.TaiKhoanService;

import java.util.List;

@RestController
@RequestMapping("/TaiKhoan")
public class TaiKhoanController implements IController<TaiKhoan> {
    @Autowired
    private TaiKhoanService taiKhoanService;

    @Override
    @GetMapping("/")
    public Response<List<TaiKhoan>> getAll() {
        return taiKhoanService.getAll();
    }

    @Override
    public Response<TaiKhoan> insert(TaiKhoan taiKhoan) {
        return null;
    }

    @PostMapping("/")
    public Response<TaiKhoan> insert(@RequestBody TaiKhoanRequestDTO taiKhoanRequestDTO) {

        return taiKhoanService.insert(taiKhoanRequestDTO);
    }

    @Override
    @PutMapping("/")
    public Response<TaiKhoan> update(TaiKhoan taiKhoan) {
        return taiKhoanService.update(taiKhoan);
    }
}
