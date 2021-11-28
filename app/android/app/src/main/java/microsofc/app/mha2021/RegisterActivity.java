package microsofc.app.mha2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RegisterActivity extends AppCompatActivity {

    Button btnConfirmRegister;
    EditText nameEditText;
    EditText emailEditText;
    EditText passEditText;
    EditText passConfirmEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnConfirmRegister = findViewById(R.id.btnConfReg);
        nameEditText = findViewById(R.id.editTextLoginReg);
        emailEditText = findViewById(R.id.editTextEmailReg);
        passEditText = findViewById(R.id.editTextPassReg);
        passConfirmEditText = findViewById(R.id.editTextPassConfirmReg);

        View.OnClickListener btnListener = view -> {
            UserRegOrLogData user = new UserRegOrLogData(nameEditText.getText().toString(),
                    passEditText.getText().toString(),
                    emailEditText.getText().toString());

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();

            ServerAPI serverAPI = NetworkSingleton.getInstance().getServerAPI(); //Magic part
            serverAPI.tryLogin(gson.toJson(user));
            Toast toast = Toast.makeText(getApplicationContext(), gson.toJson(user),Toast.LENGTH_LONG);
            toast.show();
            finish();
        };
        btnConfirmRegister.setOnClickListener(btnListener);
    }
}

//TODO ChekData