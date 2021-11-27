package microsofc.app.mha2021;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServerAPI {
    @POST("tryLogin")
    public void tryLogin(String UserData);
}
