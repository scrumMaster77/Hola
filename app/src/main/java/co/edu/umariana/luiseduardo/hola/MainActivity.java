package co.edu.umariana.luiseduardo.hola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_name;
    private EditText et_name2;
    private TextView tv_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name= (EditText) findViewById(R.id.et_name2);
        et_name2= (EditText) findViewById(R.id.et_name2);
        tv_resultado= (TextView) findViewById(R.id.tv_resultado);
    }
    public void saludar(View view)
        {
            String valor1=et_name.getText().toString();
            String valor2=et_name2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int area=(nro1*nro2)/2;
            String resu=String.valueOf(area);
            tv_resultado.setText(resu);
        }
}
