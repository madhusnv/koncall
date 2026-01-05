package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p001o.bj8;
import p001o.e9g;
import p001o.gp0;
import p001o.sq8;
import p001o.tb3;
import p001o.xk7;

/* loaded from: classes2.dex */
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor cursor) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type2 = cursor.getType(i);
                    if (type2 == 0) {
                        objArr[i] = null;
                    } else if (type2 == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type2 == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type2 == 3) {
                        objArr[i] = cursor.getString(i);
                    } else {
                        if (type2 != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = cursor.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            tb3.m49666a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        sq8.m48648g(columnNames, "columnNames");
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(Cursor cursor, String str) {
        sq8.m48649h(cursor, "c");
        sq8.m48649h(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(cursor, str);
    }

    public static final int getColumnIndexOrThrow(Cursor cursor, String str) {
        String strR0;
        sq8.m48649h(cursor, "c");
        sq8.m48649h(str, "name");
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            sq8.m48648g(columnNames, "c.columnNames");
            strR0 = gp0.r0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception unused) {
            strR0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strR0);
    }

    public static final <R> R useCursor(Cursor cursor, xk7 xk7Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(cursor, "<this>");
        sq8.m48649h(xk7Var, "block");
        try {
            R r = (R) xk7Var.invoke(cursor);
            bj8.m19244b(1);
            tb3.m49666a(cursor, null);
            bj8.m19243a(1);
            return r;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] strArr, final int[] iArr) {
        sq8.m48649h(cursor, "cursor");
        sq8.m48649h(strArr, "columnNames");
        sq8.m48649h(iArr, "mapping");
        if (strArr.length == iArr.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String str) {
                    sq8.m48649h(str, "columnName");
                    String[] strArr2 = strArr;
                    int[] iArr2 = iArr;
                    int length = strArr2.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        if (e9g.m24606x(strArr2[i], str, true)) {
                            return iArr2[i2];
                        }
                        i++;
                        i2 = i3;
                    }
                    return super.getColumnIndex(str);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
    }

    public static final int findColumnIndexBySuffix(String[] strArr, String str) {
        sq8.m48649h(strArr, "columnNames");
        sq8.m48649h(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            int i3 = i2 + 1;
            if (str4.length() >= str.length() + 2) {
                if (e9g.m24605w(str4, str2, false, 2, null)) {
                    return i2;
                }
                if (str4.charAt(0) == '`' && e9g.m24605w(str4, str3, false, 2, null)) {
                    return i2;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }
}
