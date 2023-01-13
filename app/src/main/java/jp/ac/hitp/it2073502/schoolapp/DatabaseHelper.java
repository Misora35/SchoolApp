/*
package jp.ac.hitp.it2073502.schoolapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    //データベース名
    private static final String DATABASE_NAME = "UserClass.db";
    //バージョン情報
    private static final int DATABASE_VERSION = 1;

    //コンストラクタ
    public DatabaseHelper(Context context) {
        //親クラス
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    //テーブル作成
    @Override
    public void onCreate(SQLiteDatabase db) {
        //sqlの作成
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE UserClass (_class TEXT, _ID TEXT PRIMARY KEY, Name TEXT)");
        String sql = sb.toString();

        //sqlの実行
        db.execSQL(sql);

    }

    //アップデート
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
*/