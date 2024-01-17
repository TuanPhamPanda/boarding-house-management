package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.Phong;
import quanlynhatro.doanchuyennganh.repository.IPhongRepository;

import java.util.List;

@Service
public class PhongService implements IService<Phong> {

    @Autowired
    private IPhongRepository phongRepository;

    @Override
    public Response<List<Phong>> getAll() {
        try {
            return new Response<List<Phong>>(phongRepository.findAll());
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    // chỉ admin
    @Override
    public Response<Phong> insert(Phong phong) {
        try {
            return new Response<Phong>(phongRepository.save(phong));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<Phong> update(Phong phong) {
        return new Response<Phong>(phongRepository.save(phong));
    }

    public int getNumberOfPhongIsConTrong() {
        return phongRepository.countPhongByConTrongIsTrue();
    }
}
