package com.example.exploreformore;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String PLACES_TABLE = "PLACES_TABLE";
    public static final String ID = "ID";
    public static final String NAME = "NAME";
    public static final String ADDRESS = "ADDRESS";
    public static final String LATITUDE = "LATITUDE";
    public static final String LONGITUDE = "LONGITUDE";
    public static final String EMAIL = "EMAIL";
    public static final String TEL = "TEL";
    public static final String WEB = "WEB";
    public static final String CATEGORY = "CATEGORY";
    private SQLiteDatabase db;

    public DatabaseHelper(@Nullable Context context) {
        super(context, "Places.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create table
        String tablePlaces = "CREATE TABLE " + PLACES_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + NAME + " TEXT NOT NULL , "
                + ADDRESS + " TEXT NOT NULL , " + LATITUDE + " TEXT NOT NULL , " + LONGITUDE + " TEXT NOT NULL , " + EMAIL + " TEXT NOT NULL , "
                + TEL + " TEXT NOT NULL , " + WEB + " TEXT NOT NULL , " + CATEGORY + " TEXT NOT NULL )";
        db.execSQL(tablePlaces);

        //Insert data
        db.execSQL("INSERT INTO "+PLACES_TABLE+"("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+") "+
                "VALUES ('IМ Мobile shop exclusive','Vancho Prke 59a,Shtip 2000','41.7376','22.1919','immobileshop@gmail.com','070270418','www.immobileshopexclusive.mk','Services')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+", "+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+", "+WEB+","+CATEGORY+")" +
                "VALUES ('ANEL Computers','Vancho Prke,Shtip 2000','41.7375','22.1912','anelcomputers@gmail.com','032389459','www.anelcomputers.mk','Services')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+", "+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+", "+WEB+","+CATEGORY+")" +
                "VALUES ('Avto Services Busar', 'Bregalnichka 55, Shtip','41.761004','22.18456','busar@yahoo.com','032388543','www.busar.mk','Services' )");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+", "+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+", "+WEB+","+CATEGORY+")" + " VALUES('Tapacerski Servis JO-IG','Nikola Vapcarov 16, Shtip','41.7599','22.2076','jo_ig@gmail.com','078371750','www.joig.mk','Services')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+", "+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+", "+WEB+","+CATEGORY+")" +
                "VALUES ('A1 Handy','91 Vancho Prkje, Shtip 2000','41.7375','22.1923','a1handy@gmail.com','032397380','www.a1handy.mk','Services')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+", "+WEB+","+CATEGORY+")" +
                "VALUES ('Mont-Termo-S','Pirinska, Shtip 2000','41.7475','22.1813','monttermos@gmail.com','032608352','www.monttermos.mk','Services')");

        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Niko Fun Club','Sremski Front, Shtip 2000','41.7575','22.2012','nikofunclub@gmail.com','077459007','www.nikofunclub.mk','Fun')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Night Club Clique','Partizanska 35, Shtip 2000','41.7472','22.1820','nightclubclique@gmail.com','071434343','www.nightclubclique.mk','Fun')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Studio Dior Stip','19- 2, 4-ta Makedonska brigada, Shtip','41.7471','22.1815','studiodior@gmail.com','032383175','www.studiodior.mk','Fun')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Naroden Teatar - Stip','General Mihajlo Apostolski 21, Shtip 2000','41.7372','22.1920','narodenteatarstip@gmail.com','078745774','www.narodenteatarstip.mk','Fun')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Sportski Centar Avtokomanda','Panche Karagiozov, Shtip 2000','41.7362','22.1713','sportskicentaravtokomanda@gmail.com','075223335','www.spavtokomanda.mk','Fun')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Tornado lounge bar','Nobelova 12, Shtip 2000','41.7664','22.1910','tornadostip@gmail.com','078631100','www.tornadostip.mk','Fun')");

        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('VEIT MAK DOOEL','Bul. Goce Delchev 34, 2000 Shtip','41.7671','22.2102','veitmak@gmail.com','032394775','www.veitmak.mk','Industry')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('MK Linea','Astibo, Shtip 2000','41.7563','22.1619','linea@gmail.com','032391711','www.linea.mk','Industry')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('EAM T-Shirts Industry','Industriska zona Makedonka br.54, Shtip 2000','41.7759','22.2012','eam@gmail.com','07856442','www.eam.mk','Industry')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Bargala','Vancho Prke, Shtip 2000','41.7376','22.1919','bargala@gmail.com','077459007','www.bargala.mk','Industry')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Avto Cajka Stip','Industriska zona Sever, Shtip 2000','41.761004','22.18456','avtocajka@gmail.com','032500312','www.avtocajka.mk','Industry')");

        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Goce Delcev University of Shtip','Krste Misirkov 10-A, Shtip 2000','41.7573','22.1912','ugd@info.com','032550000','www.ugd.edu.mk','Education')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Helen Doron Stip','Kozjak Planina 2, Shtip 2000','41.7472','22.1820','helendoron@gmail.com','075434343','www.helendoron.mk','Education')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('PoliProekt','Dobre Radosavlev 1А, Shtip 2000','41.7471','22.1815','poliproekt@gmail.com','032383175','www.poliproekt.mk','Education')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Eviva','Vancho Prke, Shtip 2000','41.7372','22.1920','eviva@gmail.com','078745774','www.eviva.mk','Education')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Slavco Stojmenski-Gimnazija','Vasil Glavinov 4, Shtip 2000','41.7362','22.1713','slavcostojmenski@gmail.com','032600630','www.slavcostojmenskistip.mk','Education')");
        db.execSQL("INSERT INTO " + PLACES_TABLE + "("+NAME+","+ADDRESS+","+LATITUDE+","+LONGITUDE+","+EMAIL+","+TEL+","+WEB+","+CATEGORY+")" +
                "VALUES ('Big-ben','Engelsova 6/37, Shtip 2000','41.7664','22.1910','big_ben@gmail.com','070236500','www.bigben.mk','Education')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop existing table
        db.execSQL("DROP TABLE IF EXISTS " + PLACES_TABLE);
        onCreate(db);
    }

    public boolean insertPlace(String name, String address, String latitude, String longitude, String email, String tel, String web, String category) {
        db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(NAME, name);
        cv.put(ADDRESS, address);
        cv.put(LATITUDE, latitude);
        cv.put(LONGITUDE, longitude);
        cv.put(EMAIL, email);
        cv.put(TEL, tel);
        cv.put(WEB, web);
        cv.put(CATEGORY, category);
        long result = db.insert(PLACES_TABLE, null, cv);
        if (result != -1) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Places> getServices() {
        ArrayList<Places> arrayList = new ArrayList<>();
        String queryServices = "SELECT * FROM PLACES_TABLE WHERE CATEGORY='Services'";
        SQLiteDatabase dbServices = this.getReadableDatabase();
        Cursor cursorServices = dbServices.rawQuery(queryServices, null);

        while (cursorServices.moveToNext()) {
            String name = cursorServices.getString(1);
            String address = cursorServices.getString(2);
            String email = cursorServices.getString(5);
            String tel = cursorServices.getString(6);
            String web = cursorServices.getString(7);
            Places places = new Places();

            places.setName(name);
            places.setAddress(address);
            places.setEmail(email);
            places.setTel(tel);
            places.setWeb(web);
            arrayList.add(places);
        }
        return arrayList;
    }

    public ArrayList<Places> getFun() {
        ArrayList<Places> arrayList = new ArrayList<>();
        String queryFun = "SELECT * FROM PLACES_TABLE WHERE CATEGORY='Fun'";
        SQLiteDatabase dbFun = this.getReadableDatabase();
        Cursor cursorFun = dbFun.rawQuery(queryFun, null);

        while (cursorFun.moveToNext()) {
            String name = cursorFun.getString(1);
            String address = cursorFun.getString(2);
            String email = cursorFun.getString(5);
            String tel = cursorFun.getString(6);
            String web = cursorFun.getString(7);
            Places places = new Places();

            places.setName(name);
            places.setAddress(address);
            places.setEmail(email);
            places.setTel(tel);
            places.setWeb(web);
            arrayList.add(places);
        }
        return arrayList;
    }

    public ArrayList<Places> getIndustry() {
        ArrayList<Places> arrayList = new ArrayList<>();
        String queryIndustry = "SELECT * FROM PLACES_TABLE WHERE CATEGORY='Industry'";
        SQLiteDatabase dbIndustry = this.getReadableDatabase();
        Cursor cursorIndustry = dbIndustry.rawQuery(queryIndustry, null);
        while (cursorIndustry.moveToNext()) {
            String name = cursorIndustry.getString(1);
            String address = cursorIndustry.getString(2);
            String email = cursorIndustry.getString(5);
            String tel = cursorIndustry.getString(6);
            String web = cursorIndustry.getString(7);
            Places places = new Places();

            places.setName(name);
            places.setAddress(address);
            places.setEmail(email);
            places.setTel(tel);
            places.setWeb(web);
            arrayList.add(places);
        }
        return arrayList;
    }

    public ArrayList<Places> getEducation() {
        ArrayList<Places> arrayList = new ArrayList<>();
        String queryEducation = "SELECT * FROM PLACES_TABLE WHERE CATEGORY='Education'";
        SQLiteDatabase dbEducation = this.getReadableDatabase();
        Cursor cursorEducation = dbEducation.rawQuery(queryEducation, null);
        while (cursorEducation.moveToNext()) {
            String name = cursorEducation.getString(1);
            String address = cursorEducation.getString(2);
            String email = cursorEducation.getString(5);
            String tel = cursorEducation.getString(6);
            String web = cursorEducation.getString(7);
            Places places = new Places();

            places.setName(name);
            places.setAddress(address);
            places.setEmail(email);
            places.setTel(tel);
            places.setWeb(web);
            arrayList.add(places);
        }
        return arrayList;
    }
}

