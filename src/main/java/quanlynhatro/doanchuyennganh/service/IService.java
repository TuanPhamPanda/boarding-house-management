package quanlynhatro.doanchuyennganh.service;

import org.springframework.stereotype.Service;

import quanlynhatro.doanchuyennganh.dto.response.Response;

import java.util.List;
@Service
public interface IService<S> {
    public Response<List<S>> getAll();

    public Response<S> insert(S s);

    public Response<S> update(S s);
}
