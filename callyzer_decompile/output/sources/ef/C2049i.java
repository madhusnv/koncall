package ef;

import a1.C0013l;
import af.EnumC0136c;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import bk.C0677h;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import ff.InterfaceC2282a;
import ff.InterfaceC2283b;
import gf.InterfaceC2585a;
import hf.AbstractC2919a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import pw.InterfaceC6043a;
import ue.C7421c;
import xe.C8357i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ef.i */
/* loaded from: classes.dex */
public final class C2049i implements InterfaceC2044d, InterfaceC2283b, InterfaceC2043c {

    /* renamed from: f */
    public static final C7421c f9622f = new C7421c("proto");

    /* renamed from: a */
    public final C2052l f9623a;

    /* renamed from: b */
    public final InterfaceC2585a f9624b;

    /* renamed from: c */
    public final InterfaceC2585a f9625c;

    /* renamed from: d */
    public final C2041a f9626d;

    /* renamed from: e */
    public final InterfaceC6043a f9627e;

    public C2049i(InterfaceC2585a interfaceC2585a, InterfaceC2585a interfaceC2585a2, C2041a c2041a, C2052l c2052l, InterfaceC6043a interfaceC6043a) {
        this.f9623a = c2052l;
        this.f9624b = interfaceC2585a;
        this.f9625c = interfaceC2585a2;
        this.f9626d = c2041a;
        this.f9627e = interfaceC6043a;
    }

    /* renamed from: A */
    public static String m5769A(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((C2042b) it.next()).f9613a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: H */
    public static Object m5770H(Cursor cursor, InterfaceC2047g interfaceC2047g) {
        try {
            return interfaceC2047g.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: j */
    public static Long m5771j(SQLiteDatabase sQLiteDatabase, C8357i c8357i) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c8357i.f39998a, String.valueOf(AbstractC2919a.m7025a(c8357i.f40000c))));
        byte[] bArr = c8357i.f39999b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{TransferTable.COLUMN_ID}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9623a.close();
    }

    /* renamed from: h */
    public final SQLiteDatabase m5772h() {
        C2052l c2052l = this.f9623a;
        Objects.requireNonNull(c2052l);
        InterfaceC2585a interfaceC2585a = this.f9625c;
        long time = interfaceC2585a.getTime();
        while (true) {
            try {
                return c2052l.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (interfaceC2585a.getTime() >= this.f9626d.f9610c + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: n */
    public final Object m5773n(InterfaceC2047g interfaceC2047g) {
        SQLiteDatabase sQLiteDatabaseM5772h = m5772h();
        sQLiteDatabaseM5772h.beginTransaction();
        try {
            Object objApply = interfaceC2047g.apply(sQLiteDatabaseM5772h);
            sQLiteDatabaseM5772h.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM5772h.endTransaction();
        }
    }

    /* renamed from: u */
    public final ArrayList m5774u(SQLiteDatabase sQLiteDatabase, C8357i c8357i, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lM5771j = m5771j(sQLiteDatabase, c8357i);
        if (lM5771j == null) {
            return arrayList;
        }
        m5770H(sQLiteDatabase.query("events", new String[]{TransferTable.COLUMN_ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM5771j.toString()}, null, null, null, String.valueOf(i10)), new C0013l(7, this, arrayList, c8357i));
        return arrayList;
    }

    /* renamed from: w */
    public final void m5775w(long j6, EnumC0136c enumC0136c, String str) {
        m5773n(new C0677h(str, enumC0136c, j6));
    }

    /* renamed from: z */
    public final Object m5776z(InterfaceC2282a interfaceC2282a) {
        SQLiteDatabase sQLiteDatabaseM5772h = m5772h();
        InterfaceC2585a interfaceC2585a = this.f9625c;
        long time = interfaceC2585a.getTime();
        while (true) {
            try {
                sQLiteDatabaseM5772h.beginTransaction();
                try {
                    Object objMo17b = interfaceC2282a.mo17b();
                    sQLiteDatabaseM5772h.setTransactionSuccessful();
                    return objMo17b;
                } finally {
                    sQLiteDatabaseM5772h.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (interfaceC2585a.getTime() >= this.f9626d.f9610c + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
