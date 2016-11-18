package com.example.dam05.googlefamily;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;


public class Principal extends AppCompatActivity implements View.OnClickListener{
    Boolean GAME = false;
    String NAME ="";
    String ASK = "";
    int MARCADOR = 0;
    int K = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_principal);

        ImageButton chrome = (ImageButton)findViewById(R.id.i1);
        chrome.setOnClickListener(this);
        ImageButton hangouts = (ImageButton) findViewById(R.id.i2);
        hangouts.setOnClickListener(this);
        ImageButton gmaps = (ImageButton) findViewById(R.id.i3);
        gmaps.setOnClickListener(this);
        ImageButton newstand = (ImageButton)findViewById(R.id.i4);
        newstand.setOnClickListener(this);
        ImageButton games = (ImageButton) findViewById(R.id.i5);
        games.setOnClickListener(this);
        ImageButton films = (ImageButton) findViewById(R.id.i6);
        films.setOnClickListener(this);
        ImageButton books = (ImageButton)findViewById(R.id.i7);
        books.setOnClickListener(this);
        ImageButton music = (ImageButton) findViewById(R.id.i8);
        music.setOnClickListener(this);
        ImageButton drive = (ImageButton) findViewById(R.id.i9);
        drive.setOnClickListener(this);
        ImageButton gmail = (ImageButton)findViewById(R.id.i10);
        gmail.setOnClickListener(this);
        ImageButton search = (ImageButton) findViewById(R.id.i11);
        search.setOnClickListener(this);
        ImageButton gplus = (ImageButton) findViewById(R.id.i12);
        gplus.setOnClickListener(this);
        Button gameButtonOn = (Button) findViewById(R.id.buttonGameOn);
        gameButtonOn.setOnClickListener(this);
        Button gameButtonOff = (Button) findViewById(R.id.buttonGameOff);
        gameButtonOff.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Bundle b = new Bundle();
        String link = "";
        String launch = "";
        String desc = "";
        Bitmap img = BitmapFactory.decodeResource(getResources(),R.drawable.google);

        switch (v.getId()) {

            case R.id.i1:
                NAME = "Chrome";
                launch = "2 de Setembre de 2008";
                desc = "Navegador Web compilat de codi obert.";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.chrome);
                link = "https://es.wikipedia.org/wiki/Google_Chrome";
                K++;
                break;

            case R.id.i2:
                NAME = "Hangouts";
                launch = "15 de Maig de 2013";
                desc = "Aplicació multiplataforma de missatgeria instantània.";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.hangouts);
                link = "https://es.wikipedia.org/wiki/Hangouts";
                K++;
                break;

            case R.id.i3:
                NAME = "Google Maps";
                launch = "8 de Febrer de 2005";
                desc = "Servidor d'aplicacions de mapes online.\n" +
                        "Ofereix imatges de mapes desplaçables, així com fotografies per satèl·lit del món i fins i tot la ruta entre diferents ubicacions o imatges a peu de carrer.";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.maps);
                link = "https://es.wikipedia.org/wiki/Google_Maps";
                K++;
                break;
            case R.id.i4:
                NAME = "Youtube";
                launch = "14 de febrero de 2005";
                desc = "Plataforma web que permet als  usuaris pujar, compartir i visualitzar vídeos. \n" +
                        "YouTube usa un reproductor en línia basat en HTML5, que YouTube va incorporar poc després que la W3C el presentés.És suportat pels navegadors web més difosos.";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.youtube);
                link = "https://es.wikipedia.org/wiki/YouTube";
                K++;
                break;

            case R.id.i5:
                NAME = "Games";
                launch = "16 de Maig de 2013";
                desc = "Google Play Games és un servei de jocs en línia per al sistema operatiu Android. El servei permet als desenvolupadors incloure característiques en els seus jocs sense haver de desenvolupar aquestes característiques pròpies. ";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.games);
                link = "";
                K++;
                break;

            case R.id.i6:
                NAME = "Google Translate";
                launch = "2006";
                desc = "Servei multilingüe lliure  de traducció automàtica.\n" +
                        "Permet traduir text, veu o vídeo en temps real d'una llengua a l'altra.";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.gtranslate);
                link="https://es.wikipedia.org/wiki/Traductor_de_Google";
                K++;
                break;
            case R.id.i7:
                NAME = "AdMob";
                launch = "10 d'abril de 2006";
                desc = "És una de les plataformes de publicitat mòbil més grans del món i pretén servir a més de 40 mil milions de banners i anuncis de text per a mòbils al mes en tots els llocs web i aplicacions de telèfons mòbils";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.admob);
                link = "https://en.wikipedia.org/wiki/AdMob";
                K++;
                break;

            case R.id.i8:
                NAME = "AdWords";
                launch = "23 d'Octubre del 2000";
                desc = "Programa de publicitat en línia de Google. A través del qual pots crear anuncis en línia per arribar als usuaris en el moment exacte.";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.adwords);
                link = "https://en.wikipedia.org/wiki/AdWords";
                K++;
                break;

            case R.id.i9:
                NAME = "Drive";
                launch = "24 d'Abril del 2012";
                desc = "Servei d'allotjament d'arxius.\n" +
                        "És el reemplaçament de Google Docs que ha canviat la seva adreça URL, entre d'altres qualitats.\n" +
                        "Cada usuari compta amb 15 gigabytes d'espai gratuït per emmagatzemar els seus arxius, ampliables mitjançant diferents plans de pagament";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.drive);
                link = "https://es.wikipedia.org/wiki/Google_Drive";
                K++;
                break;
            case R.id.i10:
                NAME = "Gmail";
                launch = "1 d'Abril del 2004";
                desc = "Servei de correu electrònic amb possibilitats POP3 i IMAP gratuït";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.gmail);
                link = "https://es.wikipedia.org/wiki/Gmail";
                K++;
                break;

            case R.id.i11:
                NAME = "Search";
                launch = "22 de Setembre del 1997";
                desc = "Sistema de recerca universal que permet a les organitzacions incorporar informació procedent d'una varietat de fonts externes i internes (incloent sistemes d'arxius, intranets, bases de dades, aplicacions, serveis allotjats i sistemes de gestió de continguts). ";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.search);
                link = "https://en.wikipedia.org/wiki/Google_Search";
                K++;
                break;
            case R.id.i12:
                NAME = "Google+";
                launch = "28 de Juny de 2011";
                desc = "És la segona Xarxa social amb més usuaris del Món, no per la seva popularitat sinó per enllaçar-se amb YouTube, obtenint aproximadament 343 milions d'usuaris actius";
                img = BitmapFactory.decodeResource(getResources(),R.drawable.gplus);
                link = "https://es.wikipedia.org/wiki/Google%2B";
                K++;
                break;
            case R.id.buttonGameOn:
                GAME = true;
                break;
            case R.id.buttonGameOff:
                GAME = false;
                break;
            default:
                break;
        }
        TableLayout taula = (TableLayout) findViewById(R.id.googleTable);
        ImageView google = (ImageView)findViewById(R.id.imageView4);
        Button  startGame = (Button)findViewById(R.id.buttonGameOn);
        Button endGame =(Button)findViewById(R.id.buttonGameOff);
        TextView marcador = (TextView) findViewById(R.id.marcador);
        TextView pregunta = (TextView) findViewById(R.id.ask);

        if (GAME){
            K=0;

            startGame.setVisibility(View.INVISIBLE);
            endGame.setVisibility(View.VISIBLE);
            google.setVisibility(View.INVISIBLE);
            if (NAME.equalsIgnoreCase(ASK)){
                MARCADOR++;
            }
            playgame();
        }else{
            marcador.setVisibility(View.INVISIBLE);
            pregunta.setVisibility(View.INVISIBLE);
            startGame.setVisibility(View.VISIBLE);
            endGame.setVisibility(View.INVISIBLE);
            google.setVisibility(View.VISIBLE);
            MARCADOR = 1;

            if(K>0){
                b.putString("Name", NAME);
                b.putString("Launch",launch);
                b.putString("Description",desc);
                b.putParcelable("Image", img);
                b.putString("Link",link);
                Intent intencio = new Intent(Principal.this, Segona.class);
                intencio.putExtras(b);
                startActivity(intencio);
            }
        }
    }
    public void playgame(){

        TextView marcador = (TextView) findViewById(R.id.marcador);
        TextView pregunta = (TextView) findViewById(R.id.ask);


        marcador.setVisibility(View.VISIBLE);
        pregunta.setVisibility(View.VISIBLE);




        marcador.setText("Encerts: " + (MARCADOR-1));
        ASK = getAsk();
        pregunta.setText("Fes click al logo de "+ASK);

    }

    public String getAsk(){
        int i = (int)(Math.random()*11);
        String ask ="";
        switch (i){
            case 0 : ask = "Chrome"; break;
            case 1 : ask = "Hangouts"; break;
            case 2 : ask = "Google Maps"; break;
            case 3 : ask = "Youtube"; break;
            case 4 : ask = "Games"; break;
            case 5 : ask = "Google Translate"; break;
            case 6 : ask = "Admob"; break;
            case 7 : ask = "Adwords"; break;
            case 8 : ask = "Drive"; break;
            case 9 : ask = "Gmail"; break;
            case 10 : ask = "Search"; break;
            case 11 : ask = "Google +"; break;

            default: ask = ""; break;
        }
        return ask;
    }
}

