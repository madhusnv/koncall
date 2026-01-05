package androidx.room.util;

import android.database.Cursor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p001o.id5;
import p001o.leg;
import p001o.sq8;
import p001o.tb3;

/* loaded from: classes2.dex */
public final class ViewInfo {
    public static final Companion Companion = new Companion(null);
    public final String name;
    public final String sql;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final ViewInfo read(leg legVar, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            ViewInfo viewInfo;
            sq8.m48649h(legVar, "database");
            sq8.m48649h(str, "viewName");
            Cursor cursorQuery = legVar.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    sq8.m48648g(string, "cursor.getString(0)");
                    viewInfo = new ViewInfo(string, cursorQuery.getString(1));
                } else {
                    viewInfo = new ViewInfo(str, null);
                }
                tb3.m49666a(cursorQuery, null);
                return viewInfo;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    tb3.m49666a(cursorQuery, th);
                    throw th2;
                }
            }
        }
    }

    public ViewInfo(String str, String str2) {
        sq8.m48649h(str, "name");
        this.name = str;
        this.sql = str2;
    }

    public static final ViewInfo read(leg legVar, String str) {
        return Companion.read(legVar, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        if (sq8.m48644c(this.name, viewInfo.name)) {
            String str = this.sql;
            String str2 = viewInfo.sql;
            if (str != null ? sq8.m48644c(str, str2) : str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.sql;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }
}
