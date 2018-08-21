package tina.com.tiaopiaopiao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(that,"-------->",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(that, SecondActivity.class));
                startService(new Intent(that, OneService.class));
            }
        });
    }

}
