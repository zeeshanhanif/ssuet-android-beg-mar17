package httprequestdemoone.firebasedemo1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        pd = new ProgressDialog(this);
        pd.setMessage("Please wait...");

        final EditText emailEt = findViewById(R.id.userEmailEt);
        final EditText passwordEt = findViewById(R.id.userPasswordEt);
        Button signInBtn = findViewById(R.id.loginBtn);
        Button signUpBtn = findViewById(R.id.signUpBtn);


        if(mAuth.getCurrentUser() != null){
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
            finish();
        }


        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn(emailEt.getText().toString(),passwordEt.getText().toString());
            }
        });
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp(emailEt.getText().toString(),passwordEt.getText().toString());
            }
        });
    }


    private void signIn(String email,String password){
        pd.show();
        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        pd.dismiss();
                        if(task.isSuccessful()){
                            startActivity(new Intent(LoginActivity.this,MainActivity.class));
                            finish();
                        }else{
                            Toast.makeText(LoginActivity.this,"Login Error : "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


    private void signUp(String email,String password){
        pd.show();
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        pd.dismiss();
                        if(task.isSuccessful()){
                            startActivity(new Intent(LoginActivity.this,MainActivity.class));
                            finish();
                        }else{
                            Toast.makeText(LoginActivity.this,"Login Error : "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
