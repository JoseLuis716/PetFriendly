package ing.agarcia1803.outlook.es;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void abrirLogin(View v)
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
