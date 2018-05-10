package componentes.example.omen.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn1;
        final TextView tv1;
        ProgressBar progressBar;
        Integer counter = 1;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        btn1 = (Button) findViewById(R.id.button);
        tv1 = (TextView) findViewById(R.id.textView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressBar.setVisibility(View.VISIBLE);
                ProgressBar.setProgress(0);
                switch (view.getId()){
                    case R.id.btn1Progress: new MyAsyncTask().execute(10);
                    break;
                }
                 String tabla = "";
                    Toast.makeText(PrincipalActivity.this, "Generando tabla del 5", Toast.LENGTH_SHORT).show();
                    for (int i = 1; i <10; i++){
                        tabla += "5 X "+i+" = "+5*i+"\n";
                    }
                    tv1.setText(tabla);
                }
            });
        }
    }

