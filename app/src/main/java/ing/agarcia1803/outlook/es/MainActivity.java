package ing.agarcia1803.outlook.es;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrar =  findViewById(R.id.txtMostrar);

    }

    public void abrirRegistro(View v)
    {
        Intent intent=new Intent(this, Registro.class);
        startActivity(intent);
    }

    public void abrirMenu(View v)
    {
        Intent intent=new Intent(this, Menu.class);
        startActivity(intent);
    }
}
