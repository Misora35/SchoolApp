package jp.ac.hitp.it2073502.schoolapp;

import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Calendar.Builder;
import java.util.Date;

public class documents extends AppCompatActivity {

    public static String getDate() {
        final DateFormat df = new SimpleDateFormat("yyyy/MM/dd (EEE)");
        final Date date = new Date(System.currentTimeMillis());
        return df.format(date);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);

        Intent intent = getIntent();

        TextView Class = findViewById(R.id.Class);
        TextView TK = findViewById(R.id.tk);
        TextView Time = findViewById(R.id.time);
        TextView Name = findViewById(R.id.name3);
        TextView IDNumber = findViewById(R.id.number);
        TextView Abs = findViewById(R.id.time2);

        EditText as = findViewById(R.id.reason);

        Button button = findViewById(R.id.bun);

        String time = intent.getStringExtra("date");
        SharedPreferences data = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        String Class1 = data.getString("Class", null);
        String id = data.getString("UserID", null);
        String UserName = data.getString("username", null);

        Time.setText(getDate());
        Abs.setText(" " + time);
        Class.setText(Class1);
        IDNumber.setText(id);
        Name.setText(UserName);

        LinearLayout mon = findViewById(R.id.mon1);
        LinearLayout tue = findViewById(R.id.tue2);
        LinearLayout wed = findViewById(R.id.wed3);
        LinearLayout thu = findViewById(R.id.thu4);
        LinearLayout fri = findViewById(R.id.fri5);

        CheckBox box1 = findViewById(R.id.checkBox);
        CheckBox box2 = findViewById(R.id.checkBox2);
        CheckBox box3 = findViewById(R.id.checkBox3);
        CheckBox box4 = findViewById(R.id.checkBox4);
        CheckBox box5 = findViewById(R.id.checkBox5);
        CheckBox box6 = findViewById(R.id.checkBox6);
        CheckBox box7 = findViewById(R.id.checkBox7);
        CheckBox box8 = findViewById(R.id.checkBox8);
        CheckBox box9 = findViewById(R.id.checkBox9);
        CheckBox box10 = findViewById(R.id.checkBox10);
        CheckBox box11 = findViewById(R.id.checkBox11);
        CheckBox box12 = findViewById(R.id.checkBox12);
        CheckBox box13 = findViewById(R.id.checkBox13);
        CheckBox box14 = findViewById(R.id.checkBox14);
        CheckBox box15 = findViewById(R.id.checkBox15);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd (EEE)");
            Date date = sdf.parse(time);
            Calendar cl = Calendar.getInstance();
            cl.setTime(date);
            switch (cl.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.SUNDAY:     // Calendar.SUNDAY:1 （値。意味はない）
                    //日曜日
                    break;
                case Calendar.MONDAY:     // Calendar.MONDAY:2
                    //月曜日
                    mon.setVisibility(View.VISIBLE);
                    tue.setVisibility(View.GONE);
                    wed.setVisibility(View.GONE);
                    thu.setVisibility(View.GONE);
                    fri.setVisibility(View.GONE);
                    break;
                case Calendar.TUESDAY:    // Calendar.TUESDAY:3
                    //火曜日
                    mon.setVisibility(View.GONE);
                    tue.setVisibility(View.VISIBLE);
                    wed.setVisibility(View.GONE);
                    thu.setVisibility(View.GONE);
                    fri.setVisibility(View.GONE);
                    break;
                case Calendar.WEDNESDAY:  // Calendar.WEDNESDAY:4
                    //水曜日
                    mon.setVisibility(View.GONE);
                    tue.setVisibility(View.GONE);
                    wed.setVisibility(View.VISIBLE);
                    thu.setVisibility(View.GONE);
                    fri.setVisibility(View.GONE);
                    break;
                case Calendar.THURSDAY:   // Calendar.THURSDAY:5
                    //木曜日
                    mon.setVisibility(View.GONE);
                    tue.setVisibility(View.GONE);
                    wed.setVisibility(View.GONE);
                    thu.setVisibility(View.VISIBLE);
                    fri.setVisibility(View.GONE);
                    break;
                case Calendar.FRIDAY:     // Calendar.FRIDAY:6
                    //金曜日
                    mon.setVisibility(View.GONE);
                    tue.setVisibility(View.GONE);
                    wed.setVisibility(View.GONE);
                    thu.setVisibility(View.GONE);
                    fri.setVisibility(View.VISIBLE);
                    break;
                case Calendar.SATURDAY:   // Calendar.SATURDAY:7
                    //土曜日
                    break;
            }
        }catch(ParseException e){

        }


        button.setOnClickListener((View v) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(Class.getText().toString() + "\n");
            sb.append(IDNumber.getText().toString() + Name.getText().toString() + "\n");
            sb.append(Abs.getText().toString() + "\n");
            sb.append(as.getText().toString() + "\n");
            if(box1.isChecked()) sb.append(box1.getText().toString());
            if(box2.isChecked()) sb.append(box2.getText().toString());
            if(box3.isChecked()) sb.append(box3.getText().toString());
            if(box4.isChecked()) sb.append(box4.getText().toString());
            if(box5.isChecked()) sb.append(box5.getText().toString());
            if(box6.isChecked()) sb.append(box6.getText().toString());
            if(box7.isChecked()) sb.append(box7.getText().toString());
            if(box8.isChecked()) sb.append(box8.getText().toString());
            if(box9.isChecked()) sb.append(box9.getText().toString());
            if(box10.isChecked()) sb.append(box10.getText().toString());
            if(box11.isChecked()) sb.append(box11.getText().toString());
            if(box12.isChecked()) sb.append(box12.getText().toString());
            if(box13.isChecked()) sb.append(box13.getText().toString());
            if(box14.isChecked()) sb.append(box14.getText().toString());
            if(box15.isChecked()) sb.append(box15.getText().toString());
            asyncTask a = new asyncTask();
            a.execute("TestUser10S10S","qsrooostuwbxyyxs",TK.getText().toString(),
                    sb.toString());
        });

    }
    private class asyncTask extends android.os.AsyncTask{
        protected String account;
        protected String password;
        protected String title;
        protected String text;

        @Override
        protected Object doInBackground(Object... obj){
            account=(String)obj[0];
            password=(String)obj[1];
            title=(String)obj[2];
            text=(String)obj[3];

            java.util.Properties properties = new java.util.Properties();
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.socketFactory.post", "465");
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

            final javax.mail.Message msg = new javax.mail.internet.MimeMessage(javax.mail.Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(account,password);
                }
            }));

            try {
                msg.setFrom(new javax.mail.internet.InternetAddress(account + "@gmail.com"));
                //自分自身にメールを送信
                msg.setRecipients(javax.mail.Message.RecipientType.TO, javax.mail.internet.InternetAddress.parse(account + "@gmail.com"));
                msg.setSubject(title);
                msg.setText(text);

                javax.mail.Transport.send(msg);

            } catch (Exception e) {
                return (Object)e.toString();
            }

            return (Object)"送信が完了しました";

        }
        @Override
        protected void onPostExecute(Object obj) {
            //画面にメッセージを表示する
            Toast.makeText(documents.this,(String)obj,Toast.LENGTH_LONG).show();
        }
    }
}