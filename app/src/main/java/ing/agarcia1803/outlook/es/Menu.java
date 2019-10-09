package ing.agarcia1803.outlook.es;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Menu extends AppCompatActivity
{
    private Toolbar toolbar;

    //Fragment Clases
    private MiMascotaFragment mascotaFrag;
    private MiCuentaFragment cuentaFrag;
    private PrincipalFragment principalFrag;
    private ReportesFragment reportesFrag;
    private LocalizacionFragment localizacionFrag;
    private AyudaFragment ayudaFrag;
    private AcercaFragment acercaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Inicializar los fragments
        mascotaFrag = new MiMascotaFragment();
        cuentaFrag = new MiCuentaFragment();
        principalFrag = new PrincipalFragment();
        reportesFrag = new ReportesFragment();
        localizacionFrag = new LocalizacionFragment();
        ayudaFrag = new AyudaFragment();
        acercaFragment = new AcercaFragment();

        //Incluir mi toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item)
            {
                int id = item.getItemId();

                if(id==R.id.menu)
                {
                    setFragment(acercaFragment);
                }

                if(id==R.id.help)
                {
                    setFragment(ayudaFrag);
                }

                if(id==R.id.exit)
                {
                    Intent cerrarsesion = new Intent(getApplication(), MainActivity.class);
                    startActivity(cerrarsesion);
                }

                return true;
            }
        });


        //BottomNAvigation Cast
        BottomNavigationView navigationView = findViewById(R.id.btm_nav);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                int id = menuItem.getItemId();

                //Se crean los fragmentos
                if(id==R.id.principal)
                {
                    setFragment(principalFrag);
                }

                if(id==R.id.micuenta)
                {
                    setFragment(cuentaFrag);
                }

                if(id==R.id.mimascota)
                {
                    setFragment(mascotaFrag);
                }

                if(id==R.id.localizacion)
                {
                    setFragment(localizacionFrag);
                }

                if(id==R.id.reportes)
                {
                    setFragment(reportesFrag);
                }
                return true;
            }
        });

        //Asignamos al fragment principal que es "principal"
        navigationView.setSelectedItemId(R.id.principal);
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void setFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}
