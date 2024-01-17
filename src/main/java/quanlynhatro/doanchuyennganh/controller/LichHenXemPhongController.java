package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.LichHenXemPhong;
import quanlynhatro.doanchuyennganh.service.LichHenXemPhongService;

import java.util.List;

@RestController
@RequestMapping("/LichHenXemPhong")
public class LichHenXemPhongController implements IController<LichHenXemPhong> {
    @Autowired
    LichHenXemPhongService lichHenXemPhongService;

    @Override
    @GetMapping("/")
    public Response<List<LichHenXemPhong>> getAll() {
        return lichHenXemPhongService.getAll();
    }

    @Override
    @PostMapping("/")
    public Response<LichHenXemPhong> insert(LichHenXemPhong lichHenXemPhong) {
        return lichHenXemPhongService.insert(lichHenXemPhong);
    }

    @Override
    @PutMapping("/")
    public Response<LichHenXemPhong> update(LichHenXemPhong lichHenXemPhong) {
        return lichHenXemPhongService.update(lichHenXemPhong);
    }
}
