package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.LoaiPhong;
import quanlynhatro.doanchuyennganh.repository.ILoaiPhongRepository;

import java.util.List;

@Service
public class LoaiPhongService implements IService<LoaiPhong> {
    @Autowired
    private ILoaiPhongRepository loaiPhongRepository;

    @Override
    public Response<List<LoaiPhong>> getAll() {
        try {
            return new Response<List<LoaiPhong>>(loaiPhongRepository.findAll());

        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }

    }

    // chỉ admin
    @Override
    public Response<LoaiPhong> insert(LoaiPhong loaiPhong) {
        try {
            return new Response<LoaiPhong>(loaiPhongRepository.save(loaiPhong));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    // chỉ admin
    @Override
    public Response<LoaiPhong> update(LoaiPhong loaiPhong) {
        try {
            return new Response<LoaiPhong>(loaiPhongRepository.save(loaiPhong));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

}
