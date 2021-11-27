package microsofc.app.mha2021;

import androidx.annotation.Nullable;

public class UserRegOrLogData {
    private String name;
    private String email;
    private String passw;

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
