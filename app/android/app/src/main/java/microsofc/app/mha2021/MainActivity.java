package microsofc.app.mha2021;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class MainActivity extends AppCompatActivity {

    Button btnLogIn;
    Button btnRegister;
    EditText editTextLogin;
    EditText editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogIn = findViewById(R.id.buttonLogIn);
        btnRegister = findViewById(R.id.buttonRegister);
        editTextLogin = findViewById(R.id.loginTextView);
        editTextPass = findViewById(R.id.passwordTextView);

        View.OnClickListener btnListener = view -> {
            switch (view.getId()){
                case R.id.buttonLogIn:
                    UserRegOrLogData user = new UserRegOrLogData(editTextLogin.toString(),editTextPass.toString(),null);

                    GsonBuilder gsonBuilder = new GsonBuilder();
                    Gson gson = gsonBuilder.create();

                    ServerAPI serverAPI = NetworkSingleton.getInstance().getServerAPI();
                    serverAPI.tryLogin(gson.toJson(user));

                    Toast toast = Toast.makeText(getApplicationContext(),gson.toJson(user),Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                case R.id.buttonRegister:
                    Intent regIntent = new Intent(getApplicationContext(), RegisterActivity.class);
                    startActivity(regIntent);
                    break;
            }

        };
        btnLogIn.setOnClickListener(btnListener);
        btnRegister.setOnClickListener(btnListener);
    }
}