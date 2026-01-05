package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.bh3;
import p001o.e9g;
import p001o.geg;
import p001o.leg;
import p001o.oeg;
import p001o.sq8;
import p001o.tb3;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class DBUtil {
    public static final CancellationSignal createCancellationSignal() {
        return geg.m28531b();
    }

    public static final void dropFtsSyncTriggers(leg legVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(legVar, "db");
        List listM18961c = bh3.m18961c();
        Cursor cursorQuery = legVar.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                listM18961c.add(cursorQuery.getString(0));
            } finally {
            }
        }
        y3i y3iVar = y3i.f54824a;
        tb3.m49666a(cursorQuery, null);
        for (String str : bh3.m18959a(listM18961c)) {
            sq8.m48648g(str, "triggerName");
            if (e9g.m24597K(str, "room_fts_content_sync_", false, 2, null)) {
                legVar.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final void foreignKeyCheck(leg legVar, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(legVar, "db");
        sq8.m48649h(str, "tableName");
        Cursor cursorQuery = legVar.query("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            if (cursorQuery.getCount() > 0) {
                throw new SQLiteConstraintException(processForeignKeyCheckFailure(cursorQuery));
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(cursorQuery, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tb3.m49666a(cursorQuery, th);
                throw th2;
            }
        }
    }

    private static final String processForeignKeyCheckFailure(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String string = cursor.getString(3);
            if (!linkedHashMap.containsKey(string)) {
                sq8.m48648g(string, "constraintIndex");
                String string2 = cursor.getString(2);
                sq8.m48648g(string2, "cursor.getString(2)");
                linkedHashMap.put(string, string2);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\n");
        sb.append("Number of rows in violation: ");
        sb.append(count);
        sb.append("\n");
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        String string3 = sb.toString();
        sq8.m48648g(string3, "StringBuilder().apply(builderAction).toString()");
        return string3;
    }

    public static final Cursor query(RoomDatabase roomDatabase, oeg oegVar, boolean z) {
        sq8.m48649h(roomDatabase, "db");
        sq8.m48649h(oegVar, "sqLiteQuery");
        return query(roomDatabase, oegVar, z, null);
    }

    public static final int readVersion(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            tb3.m49666a(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tb3.m49666a(channel, th);
                throw th2;
            }
        }
    }

    public static final Cursor query(RoomDatabase roomDatabase, oeg oegVar, boolean z, CancellationSignal cancellationSignal) {
        sq8.m48649h(roomDatabase, "db");
        sq8.m48649h(oegVar, "sqLiteQuery");
        Cursor cursorQuery = roomDatabase.query(oegVar, cancellationSignal);
        if (!z || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }
}
