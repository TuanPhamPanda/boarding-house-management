package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.dto.request.TaiKhoanRequestDTO;
import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.Role;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.repository.IRoleRepository;
import quanlynhatro.doanchuyennganh.repository.ITaiKhoanRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanService implements IService<TaiKhoan> {
    @Autowired
    private ITaiKhoanRepository taiKhoanRepository;
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Response<List<TaiKhoan>> getAll() {
        try {
            return new Response<List<TaiKhoan>>(taiKhoanRepository.findAll());

        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    // ! nếu null thì thông báo username đã tồn tại
    @Override
    public Response<TaiKhoan> insert(TaiKhoan taiKhoan) {
        return null;
    }

    public Response<TaiKhoan> insert(TaiKhoanRequestDTO taiKhoanRequestDTO) {
        try {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            taiKhoanRequestDTO.setPassword(bCryptPasswordEncoder.encode(taiKhoanRequestDTO.getPassword()));
            Optional<Role> role = roleRepository.findByMaRole(3);
            TaiKhoan taiKhoan = new TaiKhoan(
                    taiKhoanRequestDTO.getUsername(),
                    role.get(),
                    null,
                    taiKhoanRequestDTO.getPassword(),
                    null,
                    null);

            return new Response<TaiKhoan>(taiKhoanRepository.save(taiKhoan));
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<TaiKhoan> update(TaiKhoan taiKhoan) {

        try {
            return new Response<>(taiKhoanRepository.save(taiKhoan));

        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }
}
