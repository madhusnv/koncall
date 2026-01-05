package og;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import fd.C2271i;
import fd.InterfaceC2265c;
import gd.C2565c;
import java.util.Iterator;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class jg {
    /* renamed from: a */
    public static final String m10722a(C2271i c2271i) {
        Object next;
        Iterator it = c2271i.f10280c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2265c) next).getClass() == C2565c.class) {
                break;
            }
        }
        InterfaceC2265c interfaceC2265c = (InterfaceC2265c) next;
        if (interfaceC2265c != null) {
            return ((C2565c) interfaceC2265c).f13973a;
        }
        throw new IllegalArgumentException(("Expected to find trait " + kotlin.jvm.internal.a0.m8901a(C2565c.class) + " in " + c2271i + " but was not present.").toString());
    }

    /* renamed from: b */
    public static void m10723b(Cursor cursor) {
        if (cursor != null) {
            try {
                AbstractC5601a.m11255z(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static long m10724c(Context context, Uri uri, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    m10723b(cursorQuery);
                    return 0L;
                }
                long j6 = cursorQuery.getLong(0);
                m10723b(cursorQuery);
                return j6;
            } catch (Exception e2) {
                e2.toString();
                m10723b(cursorQuery);
                return 0L;
            }
        } catch (Throwable th2) {
            m10723b(cursorQuery);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* renamed from: d */
    public static String m10725d(Context context, Uri uri, String str) throws Throwable {
        ?? r82;
        Throwable th2;
        Exception exc;
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        m10723b(cursorQuery);
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    m10723b(cursorQuery);
                    return string;
                } catch (Exception e2) {
                    exc = e2;
                    exc.toString();
                    m10723b(cursorQuery);
                    return null;
                }
            } catch (Throwable th3) {
                th2 = th3;
                r82 = uri;
                m10723b(r82);
                throw th2;
            }
        } catch (Exception e10) {
            exc = e10;
            cursorQuery = null;
        } catch (Throwable th4) {
            r82 = 0;
            th2 = th4;
            m10723b(r82);
            throw th2;
        }
    }
}
