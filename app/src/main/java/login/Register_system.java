package login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.loginsystem.R;

public class Register_system extends AppCompatActivity {

    EditText myusername,myemail,myphone,mypassword;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_system);

        myusername=findViewById(R.id.myusername);
        myemail=findViewById(R.id.myemail);
        myphone=findViewById(R.id.myphone);
        mypassword=findViewById(R.id.mypassword);

        btnregister=findViewById(R.id.register1);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register_system.this,Login_system.class);


                intent.putExtra("username",myusername.getText().toString());
                intent.putExtra("email",myemail.getText().toString());
                intent.putExtra("phone",myphone.getText().toString());
                intent.putExtra("password",mypassword.getText().toString());

                startActivity(intent);


            }
        });
    }
}