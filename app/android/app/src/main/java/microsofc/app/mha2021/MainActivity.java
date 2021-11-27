package microsofc.app.mha2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
                    Toast toast1 = Toast.makeText(getApplicationContext(),"Register",Toast.LENGTH_SHORT);
                    toast1.show();
                    break;
            }

        };
        btnLogIn.setOnClickListener(btnListener);
        btnRegister.setOnClickListener(btnListener);
    }
}