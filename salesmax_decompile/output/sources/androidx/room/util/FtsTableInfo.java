package androidx.room.util;

import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import p001o.e9g;
import p001o.f9g;
import p001o.id5;
import p001o.kh3;
import p001o.leg;
import p001o.mif;
import p001o.nif;
import p001o.sq8;
import p001o.tb3;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final Set<String> columns;
    public final String name;
    public final Set<String> options;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        private final Set<String> readColumns(leg legVar, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            Set setM39135b = mif.m39135b();
            Cursor cursorQuery = legVar.query("PRAGMA table_info(`" + str + "`)");
            try {
                if (cursorQuery.getColumnCount() > 0) {
                    int columnIndex = cursorQuery.getColumnIndex("name");
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        sq8.m48648g(string, "cursor.getString(nameIndex)");
                        setM39135b.add(string);
                    }
                }
                y3i y3iVar = y3i.f54824a;
                tb3.m49666a(cursorQuery, null);
                return mif.m39134a(setM39135b);
            } finally {
            }
        }

        private final Set<String> readOptions(leg legVar, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            Cursor cursorQuery = legVar.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("sql")) : "";
                tb3.m49666a(cursorQuery, null);
                sq8.m48648g(string, "sql");
                return parseOptions(string);
            } finally {
            }
        }

        public final Set<String> parseOptions(String str) {
            boolean z;
            Character ch;
            sq8.m48649h(str, "createStatement");
            if (str.length() == 0) {
                return nif.m40664e();
            }
            String strSubstring = str.substring(f9g.a0(str, '(', 0, false, 6, null) + 1, f9g.g0(str, ')', 0, false, 6, null));
            sq8.m48648g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (i2 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i2);
                int i4 = i3 + 1;
                if ((cCharAt == '\'' || cCharAt == '\"') || cCharAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == cCharAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (cCharAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                } else if (cCharAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                    String strSubstring2 = strSubstring.substring(i + 1, i3);
                    sq8.m48648g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = strSubstring2.length() - 1;
                    int i5 = 0;
                    boolean z2 = false;
                    while (i5 <= length) {
                        boolean z3 = sq8.m48651j(strSubstring2.charAt(!z2 ? i5 : length), 32) <= 0;
                        if (z2) {
                            if (!z3) {
                                break;
                            }
                            length--;
                        } else if (z3) {
                            i5++;
                        } else {
                            z2 = true;
                        }
                    }
                    arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                    i = i3;
                }
                i2++;
                i3 = i4;
            }
            String strSubstring3 = strSubstring.substring(i + 1);
            sq8.m48648g(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(f9g.Z0(strSubstring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str2 = (String) obj;
                String[] strArr = FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        z = false;
                        break;
                    }
                    if (e9g.m24597K(str2, strArr[i6], false, 2, null)) {
                        z = true;
                        break;
                    }
                    i6++;
                }
                if (z) {
                    arrayList2.add(obj);
                }
            }
            return kh3.V0(arrayList2);
        }

        public final FtsTableInfo read(leg legVar, String str) {
            sq8.m48649h(legVar, "database");
            sq8.m48649h(str, "tableName");
            return new FtsTableInfo(str, readColumns(legVar, str), readOptions(legVar, str));
        }
    }

    public FtsTableInfo(String str, Set<String> set, Set<String> set2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(set, "columns");
        sq8.m48649h(set2, "options");
        this.name = str;
        this.columns = set;
        this.options = set2;
    }

    public static final Set<String> parseOptions(String str) {
        return Companion.parseOptions(str);
    }

    public static final FtsTableInfo read(leg legVar, String str) {
        return Companion.read(legVar, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        if (sq8.m48644c(this.name, ftsTableInfo.name) && sq8.m48644c(this.columns, ftsTableInfo.columns)) {
            return sq8.m48644c(this.options, ftsTableInfo.options);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String str, Set<String> set, String str2) {
        this(str, set, Companion.parseOptions(str2));
        sq8.m48649h(str, "name");
        sq8.m48649h(set, "columns");
        sq8.m48649h(str2, "createSql");
    }
}
