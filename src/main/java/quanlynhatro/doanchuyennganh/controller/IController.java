package quanlynhatro.doanchuyennganh.controller;

import java.util.List;

import quanlynhatro.doanchuyennganh.dto.response.Response;

public interface IController<C> {
    public Response<List<C>> getAll();

    public Response<C> insert(C c);

    public Response<C> update(C c);
}
