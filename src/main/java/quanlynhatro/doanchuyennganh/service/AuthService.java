package quanlynhatro.doanchuyennganh.service;

import quanlynhatro.doanchuyennganh.dto.request.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}