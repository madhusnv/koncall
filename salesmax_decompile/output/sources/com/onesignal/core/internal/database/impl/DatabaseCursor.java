package com.onesignal.core.internal.database.impl;

import android.database.Cursor;
import com.onesignal.core.internal.database.ICursor;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class DatabaseCursor implements ICursor {
    private final Cursor _cursor;

    public DatabaseCursor(Cursor cursor) {
        sq8.m48649h(cursor, "_cursor");
        this._cursor = cursor;
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public float getFloat(String str) {
        sq8.m48649h(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(str));
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public int getInt(String str) {
        sq8.m48649h(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public long getLong(String str) {
        sq8.m48649h(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public Float getOptFloat(String str) {
        sq8.m48649h(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public Integer getOptInt(String str) {
        sq8.m48649h(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public Long getOptLong(String str) {
        sq8.m48649h(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public String getOptString(String str) {
        sq8.m48649h(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public String getString(String str) {
        sq8.m48649h(str, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(str));
        sq8.m48648g(string, "_cursor.getString(_cursor.getColumnIndex(column))");
        return string;
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // com.onesignal.core.internal.database.ICursor
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
