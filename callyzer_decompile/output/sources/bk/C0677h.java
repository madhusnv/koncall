package bk;

import a1.RunnableC0024w;
import af.EnumC0136c;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import d6.C1612b;
import ef.C2046f;
import ef.C2049i;
import ef.InterfaceC2044d;
import ef.InterfaceC2047g;
import ff.InterfaceC2282a;
import gf.InterfaceC2585a;
import io.C3328c;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.AbstractC4308h;
import pg.t8;
import qj.InterfaceC6236a;
import qj.InterfaceC6237b;
import ti.C7162b;
import x4.C8299i;
import x4.InterfaceC8300j;
import xe.C8357i;
import yg.C8656m;
import yg.InterfaceC8644a;
import zh.InterfaceFutureC8957d;
import zi.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0677h implements InterfaceC8644a, InterfaceC2282a, InterfaceC2047g, InterfaceC8300j, InterfaceC6236a {

    /* renamed from: a */
    public final /* synthetic */ long f4264a;

    /* renamed from: b */
    public final /* synthetic */ Object f4265b;

    /* renamed from: c */
    public final /* synthetic */ Object f4266c;

    public /* synthetic */ C0677h(Object obj, long j6, Object obj2) {
        this.f4265b = obj;
        this.f4264a = j6;
        this.f4266c = obj2;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(final C8299i c8299i) {
        final InterfaceFutureC8957d interfaceFutureC8957d = (InterfaceFutureC8957d) this.f4265b;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f4266c;
        AbstractC4308h.m9035e(interfaceFutureC8957d, c8299i);
        if (!interfaceFutureC8957d.isDone()) {
            final long j6 = this.f4264a;
            interfaceFutureC8957d.mo9026a(new RunnableC0024w(22, scheduledExecutorService.schedule(new Callable() { // from class: l0.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(c8299i.m15509d(new TimeoutException("Future[" + interfaceFutureC8957d + "] is not done within " + j6 + " ms.")));
                }
            }, j6, TimeUnit.MILLISECONDS)), t8.m11872a());
        }
        return "TimeoutFuture[" + interfaceFutureC8957d + "]";
    }

    @Override // ef.InterfaceC2047g
    public Object apply(Object obj) throws SQLException {
        String str = (String) this.f4265b;
        EnumC0136c enumC0136c = (EnumC0136c) this.f4266c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean zBooleanValue = ((Boolean) C2049i.m5770H(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC0136c.getNumber())}), new C1612b(24))).booleanValue();
        long j6 = this.f4264a;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC0136c.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC0136c.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j6));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // ff.InterfaceC2282a
    /* renamed from: b */
    public Object mo17b() {
        C3328c c3328c = (C3328c) this.f4265b;
        C8357i c8357i = (C8357i) this.f4266c;
        InterfaceC2044d interfaceC2044d = (InterfaceC2044d) c3328c.f17611c;
        long time = ((InterfaceC2585a) c3328c.f17615g).getTime() + this.f4264a;
        C2049i c2049i = (C2049i) interfaceC2044d;
        c2049i.getClass();
        c2049i.m5773n(new C2046f(time, c8357i));
        return null;
    }

    @Override // qj.InterfaceC6236a
    /* renamed from: e */
    public void mo19e(InterfaceC6237b interfaceC6237b) {
        String str = (String) this.f4265b;
        k1 k1Var = (k1) this.f4266c;
        C7162b c7162b = (C7162b) interfaceC6237b.get();
        c7162b.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        c7162b.f34411a.m12249a(new C0677h(str, this.f4264a, k1Var));
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) {
        return ((C0681l) this.f4265b).m1957b(c8656m, this.f4264a, (HashMap) this.f4266c);
    }

    public /* synthetic */ C0677h(Object obj, Object obj2, long j6) {
        this.f4265b = obj;
        this.f4266c = obj2;
        this.f4264a = j6;
    }
}
