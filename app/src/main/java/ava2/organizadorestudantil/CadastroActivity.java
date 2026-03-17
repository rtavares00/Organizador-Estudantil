package ava2.organizadorestudantil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    EditText etDisciplina, etHorario;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etDisciplina = findViewById(R.id.etDisciplina);
        etHorario = findViewById(R.id.etHorario);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String disciplina = etDisciplina.getText().toString();
                String horario = etHorario.getText().toString();

                if (disciplina.isEmpty() || horario.isEmpty()) {
                    Toast.makeText(CadastroActivity.this,
                            "Preencha todos os campos",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CadastroActivity.this,
                            "Atividade salva com sucesso!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}