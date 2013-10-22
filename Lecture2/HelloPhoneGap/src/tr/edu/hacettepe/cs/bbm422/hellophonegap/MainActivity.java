package tr.edu.hacettepe.cs.bbm422.hellophonegap;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	EditText editName = null;
	Button enterButton = null;
	TextView welcomeTextView = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = (EditText)  findViewById(R.id.editText1);
        enterButton = (Button)  findViewById(R.id.button1);
        welcomeTextView = (TextView)findViewById(R.id.welcomeTextView);
       }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }



	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		enterButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println( editName.getText().toString());
				
				showDialog(editName.getText().toString());
				//  Intent intent = new Intent(getApplicationContext(), NextActivity.class);
				// startActivity(intent);
			}
		});
		
	}
	
	
	public void showDialog(String text){
		AlertDialog alt_bld = new AlertDialog.Builder(this).create();     
		alt_bld.setMessage("Welcome, "+text);
		alt_bld.show();
	}
    
}
