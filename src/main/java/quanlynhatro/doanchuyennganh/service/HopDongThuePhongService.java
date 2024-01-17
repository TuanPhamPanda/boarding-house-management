package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.HopDongThuePhong;
import quanlynhatro.doanchuyennganh.repository.IHopDongThuePhongRepository;

import java.util.List;

@Service
public class HopDongThuePhongService implements IService<HopDongThuePhong> {
    @Autowired
    private IHopDongThuePhongRepository hopDongThuePhongRepository;

    @Override
    public Response<List<HopDongThuePhong>> getAll() {
        try {
            return new Response<List<HopDongThuePhong>>(hopDongThuePhongRepository.findAll());
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<HopDongThuePhong> insert(HopDongThuePhong hopDongThuePhong) {
        try {
            return new Response<HopDongThuePhong>(hopDongThuePhongRepository.save(hopDongThuePhong));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<HopDongThuePhong> update(HopDongThuePhong hopDongThuePhong) {
        try {
            return new Response<HopDongThuePhong>(hopDongThuePhongRepository.save(hopDongThuePhong));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }
}
