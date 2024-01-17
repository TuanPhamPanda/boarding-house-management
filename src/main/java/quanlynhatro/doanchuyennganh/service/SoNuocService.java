package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.dto.request.SoDienNuocRquestDTO;
import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.Phong;
import quanlynhatro.doanchuyennganh.entity.SoNuoc;
import quanlynhatro.doanchuyennganh.repository.IPhongRepository;
import quanlynhatro.doanchuyennganh.repository.ISoNuocRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SoNuocService implements IService<SoNuoc> {
    @Autowired
    private ISoNuocRepository soNuocRepository;
    @Autowired
    private IPhongRepository phongRepository;

    @Override
    public Response<List<SoNuoc>> getAll() {
        try {
            return new Response<List<SoNuoc>>(soNuocRepository.findAll());
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<SoNuoc> insert(SoNuoc soNuoc) {
        return null;
    }

    public Response<SoNuoc> insert(SoDienNuocRquestDTO soNuocDTO) {
        try {
            Optional<Phong> phong = phongRepository.findByMaPhong(soNuocDTO.getMaphong());
            SoNuoc soNuoc = SoNuoc.builder()
                    .ngayNhap(new Date())
                    .donGia(3500)
                    .so(soNuocDTO.getSo())
                    .phong(phong.get())
                    .build();
            return new Response<SoNuoc>(soNuocRepository.save(soNuoc));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<SoNuoc> update(SoNuoc soNuoc) {
        try {
            return new Response<SoNuoc>(soNuocRepository.save(soNuoc));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }
}
