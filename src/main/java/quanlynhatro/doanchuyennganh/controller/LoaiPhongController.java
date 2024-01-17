package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.LoaiPhong;
import quanlynhatro.doanchuyennganh.service.LoaiPhongService;

import java.util.List;

@RestController
@RequestMapping("/LoaiPhong")
public class LoaiPhongController implements IController<LoaiPhong> {
    @Autowired
    private LoaiPhongService loaiPhongService;

    @Override
    @GetMapping("/")
    public Response<List<LoaiPhong>> getAll() {

        try {
            return loaiPhongService.getAll();
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }

    //chỉ admin
    @PostMapping("/")
    @Override
    public Response<LoaiPhong> insert(LoaiPhong loaiPhong) {
        return loaiPhongService.insert(loaiPhong);
    }

    //chỉ admin
    @PutMapping("/")
    @Override
    public Response<LoaiPhong> update(LoaiPhong loaiPhong) {
        return loaiPhongService.insert(loaiPhong);
    }
}
