package atmempresaconsultoria.livroandroid.com.contservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    // criando botao quem somos
    private ImageView botaoquemsomos;
    // criando botao nossos serviços
    private  ImageView botaonossosservicos;
    // criando toolbar
    private Toolbar toolbar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        // criando atributo para o botao e o id para o codigo identificar ele
        botaoquemsomos = (ImageView) findViewById(R.id.imageView5);

        //esse codigo diferente porque ele vai abrir outra tela para contatos, emails, whatsapp
        botaoquemsomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, QuemSomosActivity.class));
            }
        });


                // criando atributo para o botao e o id para o codigo identificar ele
                botaonossosservicos = (ImageView) findViewById(R.id.imageView6);

                //esse codigo diferente porque ele vai abrir outra tela para contatos, emails, whatsapp
                botaonossosservicos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(MainActivity.this, NossosServicosActivity.class));
                    }
                });}



    // conecta e abre a primeira pagina internet a partir de um botao
                    public void browser1(View view) {

                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nfstock.alterdata.com.br/"));

                        startActivity(browserIntent);
                    }

                    // conecta e abre a primeira pagina internet a partir de um botao
                    public void browser2(View view) {

                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com.br/"));

                        startActivity(browserIntent);
                    }

                    // conecta e abre a primeira pagina internet a partir de um botao
                    public void browser3(View view) {

                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://faceebook.com/"));

                        startActivity(browserIntent);
                    }

                    // conecta e abre a primeira pagina internet a partir de um botao
                    public void browser4(View view) {

                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bol.com.br"));

                        startActivity(browserIntent);
                    }









                }





