package com.amplifyframework.datastore.storage.sqlite;

/* loaded from: classes5.dex */
public enum SQLiteDataType {
    NULL("NULL"),
    INTEGER("INTEGER"),
    REAL("REAL"),
    TEXT("TEXT"),
    BLOB("BLOB");

    private final String sqliteDataType;

    SQLiteDataType(String str) {
        this.sqliteDataType = str;
    }

    public static SQLiteDataType from(String str) {
        for (SQLiteDataType sQLiteDataType : values()) {
            if (str.equals(sQLiteDataType.getSqliteDataType())) {
                return sQLiteDataType;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value.");
    }

    public String getSqliteDataType() {
        return this.sqliteDataType;
    }
}
