package df;

import af.EnumC0136c;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import ef.C2046f;
import ef.C2049i;
import ef.InterfaceC2044d;
import ff.InterfaceC2282a;
import gf.InterfaceC2585a;
import io.C3328c;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l1.C4327p;
import ri.CallableC6547e;
import ri.InterfaceC6549g;
import ri.RunnableC6546d;
import ri.ScheduledExecutorServiceC6548f;
import xe.C8357i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: df.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C1709h implements InterfaceC2282a, InterfaceC6549g {

    /* renamed from: a */
    public final /* synthetic */ int f8324a;

    /* renamed from: b */
    public final /* synthetic */ long f8325b;

    /* renamed from: c */
    public final /* synthetic */ Object f8326c;

    /* renamed from: d */
    public final /* synthetic */ Object f8327d;

    /* renamed from: e */
    public final /* synthetic */ Object f8328e;

    public /* synthetic */ C1709h(C3328c c3328c, Iterable iterable, C8357i c8357i, long j6) {
        this.f8324a = 0;
        this.f8326c = c3328c;
        this.f8327d = iterable;
        this.f8328e = c8357i;
        this.f8325b = j6;
    }

    @Override // ri.InterfaceC6549g
    /* renamed from: a */
    public ScheduledFuture mo5398a(C4327p c4327p) {
        switch (this.f8324a) {
            case 1:
                ScheduledExecutorServiceC6548f scheduledExecutorServiceC6548f = (ScheduledExecutorServiceC6548f) this.f8326c;
                Runnable runnable = (Runnable) this.f8327d;
                return scheduledExecutorServiceC6548f.f31399b.schedule(new RunnableC6546d(scheduledExecutorServiceC6548f, runnable, c4327p, 1), this.f8325b, (TimeUnit) this.f8328e);
            default:
                ScheduledExecutorServiceC6548f scheduledExecutorServiceC6548f2 = (ScheduledExecutorServiceC6548f) this.f8326c;
                Callable callable = (Callable) this.f8327d;
                return scheduledExecutorServiceC6548f2.f31399b.schedule(new CallableC6547e(0, scheduledExecutorServiceC6548f2, callable, c4327p), this.f8325b, (TimeUnit) this.f8328e);
        }
    }

    @Override // ff.InterfaceC2282a
    /* renamed from: b */
    public Object mo17b() {
        C3328c c3328c = (C3328c) this.f8326c;
        Iterable iterable = (Iterable) this.f8327d;
        C8357i c8357i = (C8357i) this.f8328e;
        C2049i c2049i = (C2049i) ((InterfaceC2044d) c3328c.f17611c);
        c2049i.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C2049i.m5769A(iterable);
            SQLiteDatabase sQLiteDatabaseM5772h = c2049i.m5772h();
            sQLiteDatabaseM5772h.beginTransaction();
            try {
                sQLiteDatabaseM5772h.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM5772h.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c2049i.m5775w(cursorRawQuery.getInt(0), EnumC0136c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM5772h.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM5772h.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseM5772h.endTransaction();
            }
        }
        c2049i.m5773n(new C2046f(((InterfaceC2585a) c3328c.f17615g).getTime() + this.f8325b, c8357i));
        return null;
    }

    public /* synthetic */ C1709h(ScheduledExecutorServiceC6548f scheduledExecutorServiceC6548f, Object obj, long j6, TimeUnit timeUnit, int i10) {
        this.f8324a = i10;
        this.f8326c = scheduledExecutorServiceC6548f;
        this.f8327d = obj;
        this.f8325b = j6;
        this.f8328e = timeUnit;
    }
}
