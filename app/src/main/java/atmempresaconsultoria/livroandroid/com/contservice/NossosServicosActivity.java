package atmempresaconsultoria.livroandroid.com.contservice;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class NossosServicosActivity extends AppCompatActivity {


    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nossos_servicos);


        //adiciona botao up navigation
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //setUpToolbar();

    }




    //faz parte botao up navigation

    public  boolean onOptionsItemSelect(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {

            //metodo finish() vai encerrrar  essa activity
            finish();
            return (true);
        }

        return super.onOptionsItemSelected(item);
    }

        //configurar toolbar para o jeito que queremos
    private void setToolbar(){

        toolbar = (Toolbar) findViewById(R.id.ic_arrow_back_black_24dp);
        toolbar.setTitle(getResources().getString(R.string.app_name));

        //a toolbar agora é a actionbar do app e botao de voltar tela
        getSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().show();

    }

    private ActionBar getSupportActionBar(Toolbar toolbar) {
        return null;
    }


}
