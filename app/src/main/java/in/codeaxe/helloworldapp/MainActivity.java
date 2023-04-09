package in.codeaxe.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = (TextView)findViewById(R.id.Text);
        Button bt = (Button) findViewById(R.id.Button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String a = "This a Toast Message while Print";
                String b = "Hello World";
                Toast toast = Toast.makeText(getApplicationContext(),b,Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.END | Gravity.CENTER, 0, 0);
                View toastView = toast.getView();
//                toastView.setBackgroundColor(Color.BLACK);
                toastView.setBackgroundColor(Color.TRANSPARENT);
                toast.show();
            }
        });
    }
}