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
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnLogIn;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogIn = findViewById(R.id.buttonLogIn);
        btnRegister = findViewById(R.id.buttonRegister);

        View.OnClickListener btnListener = view -> {
            switch (view.getId()){
                case R.id.buttonLogIn:
                    Toast toast = Toast.makeText(getApplicationContext(),"LogIn",Toast.LENGTH_SHORT);
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