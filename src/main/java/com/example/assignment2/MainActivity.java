package com.example.assignment2;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView viewText;
    String FinalText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= (EditText) findViewById(R.id.PersonName);
        viewText= (TextView) findViewById(R.id.ViewName);

        findViewById(R.id.Clickbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewText.setText("Hello, "+editText.getText().toString().toUpperCase()+".");
            }

        });
    }
}