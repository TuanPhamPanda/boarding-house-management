package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.LoaiTienIch;
import quanlynhatro.doanchuyennganh.repository.ILoaiTienIchRepository;

import java.util.List;

@Service
public class LoaiTienIchService implements IService<LoaiTienIch> {
    @Autowired
    private ILoaiTienIchRepository loaiTienIchRepository;

    @Override
    public Response<List<LoaiTienIch>> getAll() {
        try {
            return new Response<List<LoaiTienIch>>(loaiTienIchRepository.findAll());
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    // chỉ admin
    @Override
    public Response<LoaiTienIch> insert(LoaiTienIch loaiTienIch) {
        try {
            return new Response<LoaiTienIch>(loaiTienIchRepository.save(loaiTienIch));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    // chỉ admin
    @Override
    public Response<LoaiTienIch> update(LoaiTienIch loaiTienIch) {
        try {
            return new Response<LoaiTienIch>(loaiTienIchRepository.save(loaiTienIch));

        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }

    }

}
