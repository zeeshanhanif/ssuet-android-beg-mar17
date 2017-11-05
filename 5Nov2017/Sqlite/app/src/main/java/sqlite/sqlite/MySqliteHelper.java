package sqlite.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class MySqliteHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "MY_DB.db";
    private static final int VERSION = 1;



    public MySqliteHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS contacts( id INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR(50),phone VARCHAR(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long addContact(String name,String phone){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("phone",phone);
        return db.insert("contacts",null,contentValues);
    }


    public ArrayList<Contact> getContacts(){
        ArrayList<Contact> contacts = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query("contacts",new String[]{"id","name","phone"},null,null,null,null,null);
        while (cursor.moveToNext()){
            int idColumnIndex = cursor.getColumnIndex("id");
            int id = cursor.getInt(idColumnIndex);
            int nameColumnIndex = cursor.getColumnIndex("name");
            String name = cursor.getString(nameColumnIndex);
            int phoneColumnIndex = cursor.getColumnIndex("phone");
            String phone = cursor.getString(phoneColumnIndex);
            contacts.add(new Contact(name,phone,id));
        }

        return contacts;
    }
}
