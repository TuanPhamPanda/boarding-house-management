package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.HopDongThuePhong;
import quanlynhatro.doanchuyennganh.service.HopDongThuePhongService;

import java.util.List;

@RestController
@RequestMapping("/HopDongThuePhong")
public class HopDongThuePhongController implements IController<HopDongThuePhong> {
    @Autowired
    private HopDongThuePhongService hopDongThuePhongService;

    @Override
    @GetMapping("/")
    public Response<List<HopDongThuePhong>> getAll() {
        return hopDongThuePhongService.getAll();
    }

    @Override
    @PostMapping("/")
    public Response<HopDongThuePhong> insert(HopDongThuePhong hopDongThuePhong) {
        return hopDongThuePhongService.insert(hopDongThuePhong);
    }

    @Override
    @PutMapping("/")
    public Response<HopDongThuePhong> update(HopDongThuePhong hopDongThuePhong) {
        return hopDongThuePhongService.update(hopDongThuePhong);
    }
}
