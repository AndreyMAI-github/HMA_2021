package microsofc.app.mha2021;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRegOrLogData {
    @SerializedName("email") //TODO CHANGE IT
    @Expose
    private String name;
    @SerializedName("email2")
    @Expose
    private String email;
    @Expose
    @SerializedName("password")
    private String passw;
    @Expose
    @SerializedName("token")
    private String token;
    public UserRegOrLogData(String name, String passw, @Nullable String email) {
        this.name = name;
        this.passw = passw;
        this.email = email;
    }

    @Override
    public String toString(){
        String formedString = new String("name:"+ name + "password:" + passw);
        if(email!=null) {
            formedString = formedString + "email:" + email;
        }
        return formedString;
    }
}
