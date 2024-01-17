package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.TienIch;
import quanlynhatro.doanchuyennganh.repository.ITienIchRepository;

import java.util.List;

@Service
public class TienIchService implements IService<TienIch> {
    @Autowired
    private ITienIchRepository tienIchRepository;

    @Override
    public Response<List<TienIch>> getAll() {
        try {
            return new Response<List<TienIch>>(tienIchRepository.findAll());
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<TienIch> insert(TienIch tienIch) {
        try {
            return new Response<TienIch>(tienIchRepository.save(tienIch));

        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<TienIch> update(TienIch tienIch) {
        try {
            return new Response<TienIch>(tienIchRepository.save(tienIch));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }
}
