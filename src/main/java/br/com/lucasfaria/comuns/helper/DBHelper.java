package br.com.lucasfaria.comuns.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public static int VERSION = 1;
    public static String NAME_DB = "DB_PAROQUIA_ADM";
    private static String TABELA_PARAMETROS = "TBPARAMETROS";
//    public static Fac NAME = "App";


    public DBHelper(Context context) {
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA_PARAMETROS +
                " (CD_PARAMETRO TEXT PRIMARY KEY, " +
                " VALOR TEXT NOT NULL);";
        try {
            db.execSQL(sql);
            Log.i("INFO DB", "Sucesso ao criar tabela!");
        } catch (Exception e) {
            Log.e("INFO DB", "Erro ao criar tabela: " + e.getMessage(), e);

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String sql = "DROP TABLE IF EXISTS " + TABELA_PARAMETROS;
        try {
            db.execSQL(sql);
            onCreate(db);
            Log.i("INFO DB", "Sucesso ao atualizar tabela! versão:" + VERSION);
        } catch (Exception e) {
            Log.e("INFO DB", "Erro ao criar tabela: " + e.getMessage(), e);

        }
    }

}
