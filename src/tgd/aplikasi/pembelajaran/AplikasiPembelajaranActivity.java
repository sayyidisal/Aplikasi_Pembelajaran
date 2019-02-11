package tgd.aplikasi.pembelajaran;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AplikasiPembelajaranActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tampilmenu();
    }
    public void tampilmenu(){
    	Thread timer = new Thread(){
    		public void run(){
    			try {
    				sleep(3000);
    			} catch (InterruptedException e){
    				e.printStackTrace();
    			}finally {
    				Intent i = new Intent(AplikasiPembelajaranActivity.this,Menu.class);
    				startActivity(i);
    				AplikasiPembelajaranActivity.this.finish();
    			}
    		}
    	};
    	timer.start();
    }
}