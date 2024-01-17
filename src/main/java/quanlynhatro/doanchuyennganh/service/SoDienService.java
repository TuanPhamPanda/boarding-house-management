package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.dto.request.SoDienNuocRquestDTO;
import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.Phong;
import quanlynhatro.doanchuyennganh.entity.SoDien;
import quanlynhatro.doanchuyennganh.repository.IPhongRepository;
import quanlynhatro.doanchuyennganh.repository.ISoDienRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SoDienService implements IService<SoDien> {
    @Autowired
    private ISoDienRepository soDienRepository;
    @Autowired
    private IPhongRepository phongRepository;

    @Override
    public Response<List<SoDien>> getAll() {
        return new Response<List<SoDien>>(soDienRepository.findAll());
    }

    @Override
    public Response<SoDien> insert(SoDien soDien) {
        return new Response<SoDien>(soDienRepository.save(soDien));
    }

    public Response<SoDien> insert(SoDienNuocRquestDTO soDienDTO) {
        try {
            Optional<Phong> phong = phongRepository.findByMaPhong(soDienDTO.getMaphong());
            SoDien soDien = SoDien.builder()
                    .ngayNhap(new Date())
                    .donGia(3500)
                    .so(soDienDTO.getSo())
                    .phong(phong.get())
                    .build();
            return new Response<SoDien>(soDienRepository.save(soDien));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<SoDien> update(SoDien soDien) {
        try {
            return new Response<SoDien>(soDienRepository.save(soDien));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }
}
