package login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginsystem.R;

public class Login_system extends AppCompatActivity {

    EditText usernameedt, passwordedt;
    Button loginbtn,registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_system);

        usernameedt=findViewById(R.id.username);
        passwordedt=findViewById(R.id.password);

        loginbtn=findViewById(R.id.login);
        registerbtn=findViewById(R.id.register);

        Intent intent=getIntent();

        String username=intent.getStringExtra("username");
        String email=intent.getStringExtra("email");
        String phone=intent.getStringExtra("phone");
        String password=intent.getStringExtra("password");

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernameedt.getText().toString().equals(username)==true && passwordedt.getText().toString().compareTo(password)==0){
                    Intent intent1=new Intent(Login_system.this,Home_page.class);
                    intent1.putExtra("myusername",username);
                    intent1.putExtra("myemail",email);
                    intent1.putExtra("myphone",phone);
                    startActivity(intent1);
                    Toast.makeText(Login_system.this, "Login Sucessfully", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(Login_system.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                }

            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login_system.this,Register_system.class);
                startActivity(intent);
            }
        });

    }
}