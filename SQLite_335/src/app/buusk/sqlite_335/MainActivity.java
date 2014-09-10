package app.buusk.sqlite_335;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	SQLiteDatabase db;
	private  Button btninsert;
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		control335DB control335db = new control335DB(this);
		control335db.getWritableDatabase();
		
		btninsert = (Button) findViewById(R.in.btn_insert);
		btninsert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationCon)
			}
		});
	}

	
}
