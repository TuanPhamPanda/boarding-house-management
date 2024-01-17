package quanlynhatro.doanchuyennganh.dto.response;

import lombok.Data;

@Data
public class Response<T> {
    private boolean err;
    private String message;
    private T data;

    public Response(String message) {
        this.err = true;
        this.message = message;
    }

    public Response(T data) {
        this.err = false;
        this.message = null;
        this.data = data;
    }
}
