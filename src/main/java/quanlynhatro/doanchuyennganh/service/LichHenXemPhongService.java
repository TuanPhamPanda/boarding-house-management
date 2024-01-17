package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.LichHenXemPhong;
import quanlynhatro.doanchuyennganh.repository.ILichHenXemPhongRepository;

import java.util.List;

@Service
public class LichHenXemPhongService implements IService<LichHenXemPhong> {
    @Autowired
    ILichHenXemPhongRepository lichHenXemPhongRepository;

    @Override
    public Response<List<LichHenXemPhong>> getAll() {
        try {
            return new Response<>(lichHenXemPhongRepository.findAll());
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<LichHenXemPhong> insert(LichHenXemPhong lichHenXemPhong) {
        try {
            return new Response<LichHenXemPhong>(lichHenXemPhongRepository.save(lichHenXemPhong));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<LichHenXemPhong> update(LichHenXemPhong lichHenXemPhong) {
        try {
            return new Response<LichHenXemPhong>(lichHenXemPhongRepository.save(lichHenXemPhong));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }
}
