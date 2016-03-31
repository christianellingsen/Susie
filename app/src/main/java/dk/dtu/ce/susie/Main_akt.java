package dk.dtu.ce.susie;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.macroyau.thingspeakandroid.TalkBack;
import com.macroyau.thingspeakandroid.ThingSpeakChannel;
import com.macroyau.thingspeakandroid.ThingSpeakService;
import com.macroyau.thingspeakandroid.model.Channel;
import com.macroyau.thingspeakandroid.model.ChannelFeed;
import com.macroyau.thingspeakandroid.model.Feed;
import com.macroyau.thingspeakandroid.model.PublicChannels;
import com.macroyau.thingspeakandroid.model.StatusUpdates;
import com.macroyau.thingspeakandroid.model.TalkBackCommand;

import java.util.List;
import java.util.Map;

import retrofit.Callback;

public class Main_akt extends AppCompatActivity implements View.OnClickListener {

    ThingSpeakChannel tsChannel_write = new ThingSpeakChannel(MyApplication.CHANNEL_ID,MyApplication.WRITE_API_KEY);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    Button button = (Button) findViewById(R.id.button);
    EditText et = (EditText) findViewById(R.id.editText);
    TalkBack tsTalkBack = new TalkBack(7736,"HD2KH3XWI2Y9T4BB");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_akt);

        et.setOnClickListener(this);
        button.setOnClickListener(this);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_akt, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        if(v== button){
            int value = 0;
            value= Integer.parseInt(et.getText().toString());
            uploadValueToTS(value);
        }
        else if (v == et){
            et.setText("");
        }
    }

    private void uploadValueToTS(int value) {

    }
}
