package microsofc.app.mha2021;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServerAPI {
    @POST("/api/login")
    public Call<UserRegOrLogData> tryLogin(@Body UserRegOrLogData  UserData);
    @POST("tryRegister")
    public Call<UserRegOrLogData> tryRegister(@Body UserRegOrLogData  UserData);
}
