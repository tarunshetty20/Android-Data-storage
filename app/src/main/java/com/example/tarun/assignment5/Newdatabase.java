package com.example.tarun.assignment5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Newdatabase extends SQLiteOpenHelper {

    private static final String databasename = "productdetails.db";
    private static final String tablename = "listofproducts";
    private static final String iidno= "id";
    private static final String ipriced = "price";
    private static final String ireviewd = "review";
    private static final String inamed = "name";
    private static final String idescripd = "description";
    private static final int dataversion = 1;

    public Newdatabase(Context context)
    {
        super(context, databasename, null, dataversion);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String storetable = "CREATE TABLE " + tablename+ "(" + iidno+ " INTEGER PRIMARY KEY," + inamed + " TEXT," + idescripd + " TEXT," + ipriced + " TEXT," + ireviewd + " TEXT" + ")";
        db.execSQL(storetable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + tablename);
        onCreate(db);

    }

    void addItem(Item item) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues result = new ContentValues();
        result.put(inamed, item.getIname3());
        result.put(idescripd, item.getIdescrip3());
        result.put(ipriced, item.getIprice3());
        result.put(ireviewd, item.getIreview3());
        db.insert(tablename, null, result);
        db.close();
    }

    Item getItem(String name) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(tablename, new String[] {iidno, inamed, idescripd, ipriced, ireviewd }, inamed + "=?", new String[] { String.valueOf(name) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Item list = new Item(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        return list;
    }
}
