package a1;

import af.C0134a;
import af.EnumC0136c;
import ak.C0171j;
import an.j2;
import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import bk.C0674e;
import bk.C0679j;
import c0.C0829v;
import c0.f1;
import c0.p1;
import c4.C0861k;
import c6.C0875e;
import c6.InterfaceC0874d;
import c6.v0;
import c9.C0917l;
import com.amplifyframework.devmenu.DeveloperMenu;
import com.amplifyframework.devmenu.DeveloperMenuActivity;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.MainActivity;
import d6.C1612b;
import dk.InterfaceC1732a;
import e6.InterfaceC1964g;
import ef.C2049i;
import ef.InterfaceC2043c;
import ef.InterfaceC2044d;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ff.InterfaceC2282a;
import fk.C2306l;
import fk.q0;
import fk.r0;
import i0.c1;
import i0.d1;
import i0.g0;
import i0.l0;
import io.C3328c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l0.C4310j;
import l8.AbstractC4428b;
import l8.C4429c;
import l8.InterfaceC4430d;
import l8.InterfaceC4431e;
import m8.C4678h;
import mk.AbstractC4785x;
import mk.InterfaceC4777p;
import mq.C4833a;
import nx.AbstractC5163a;
import og.xb;
import org.bouncycastle.iana.AEADAlgorithm;
import p007h.InterfaceC2750b;
import p013o.AbstractC5234t;
import p020v.C7599i;
import pg.i7;
import pg.l8;
import pg.t8;
import pk.AbstractC5973c;
import q0.C6068i;
import q0.C6070k;
import qi.InterfaceC6222e;
import qi.RunnableC6224g;
import qj.InterfaceC6236a;
import qj.InterfaceC6237b;
import r1.C6431p;
import rw.AbstractC6664n;
import ti.C7162b;
import ti.C7163c;
import u2.AbstractC7316m;
import ue.InterfaceC7423e;
import wj.C8090p;
import x4.C8299i;
import x4.C8302l;
import x4.InterfaceC8300j;
import xe.C8357i;
import yg.C8656m;
import yg.InterfaceC8646c;
import yg.InterfaceC8648e;
import yg.InterfaceC8649f;
import zh.InterfaceFutureC8957d;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements InterfaceC8300j, InterfaceC8649f, c0.f0, c1, DeveloperMenu.HideAction, InterfaceC2282a, InterfaceC2750b, InterfaceC7423e, InterfaceC8648e, InterfaceC4777p, InterfaceC6222e, InterfaceC6236a, InterfaceC8646c, InterfaceC4430d {

    /* renamed from: a */
    public final /* synthetic */ int f21a;

    /* renamed from: b */
    public final /* synthetic */ Object f22b;

    public /* synthetic */ c0(int i10, Object obj) {
        this.f21a = i10;
        this.f22b = obj;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        InterfaceFutureC8957d interfaceFutureC8957d;
        switch (this.f21a) {
            case 0:
                ((f0) this.f22b).f48k.set(c8299i);
                return "textureViewImpl_waitForNextFrame";
            case 2:
                C0829v c0829v = (C0829v) this.f22b;
                c0829v.f5240n.m7346e();
                l0 l0Var = c0829v.f5227a;
                synchronized (l0Var.f16515a) {
                    try {
                        if (l0Var.f16516b.isEmpty()) {
                            interfaceFutureC8957d = l0Var.f16518d;
                            if (interfaceFutureC8957d == null) {
                                interfaceFutureC8957d = C4310j.f21736c;
                            }
                        } else {
                            C8302l c8302lM11697b = l0Var.f16518d;
                            if (c8302lM11697b == null) {
                                c8302lM11697b = i7.m11697b(new c0(14, l0Var));
                                l0Var.f16518d = c8302lM11697b;
                            }
                            l0Var.f16517c.addAll(l0Var.f16516b.values());
                            for (g0 g0Var : l0Var.f16516b.values()) {
                                g0Var.mo7308a().mo9026a(new RunnableC0012k(21, l0Var, g0Var), t8.m11872a());
                            }
                            l0Var.f16516b.clear();
                            interfaceFutureC8957d = c8302lM11697b;
                        }
                    } finally {
                    }
                }
                interfaceFutureC8957d.mo9026a(new RunnableC0012k(4, c0829v, c8299i), c0829v.f5230d);
                return "CameraX shutdownInternal";
            case 14:
                l0 l0Var2 = (l0) this.f22b;
                synchronized (l0Var2.f16515a) {
                    l0Var2.f16519e = c8299i;
                }
                return "CameraRepository-deinit";
            case 17:
                C6068i c6068i = (C6068i) this.f22b;
                c6068i.f29590p = c8299i;
                return "SettableFuture hashCode: " + c6068i.hashCode();
            case 18:
                ((C6070k) this.f22b).f29618l = c8299i;
                return "SurfaceOutputImpl close future complete";
            case 21:
                tx.g0 g0Var2 = (tx.g0) this.f22b;
                g0Var2.v0(new C6431p(8, c8299i, g0Var2));
                return "Deferred.asListenableFuture";
            default:
                C7599i c7599i = (C7599i) this.f22b;
                c7599i.f36571c.execute(new RunnableC6224g(9, c7599i, c8299i));
                return "updateSessionConfigAsync";
        }
    }

    @Override // p007h.InterfaceC2750b
    /* renamed from: a */
    public void mo24a(Object obj) {
        ((InterfaceC2139c) ((w0) this.f22b).getValue()).invoke(obj);
    }

    @Override // ue.InterfaceC7423e
    public Object apply(Object obj) throws IOException {
        q0 q0Var = (q0) obj;
        ((C2306l) this.f22b).getClass();
        String strM8776q = r0.f10475b.m8776q(q0Var);
        AbstractC4154l.m8922e(strM8776q, "encode(...)");
        q0Var.f10471a.name();
        byte[] bytes = strM8776q.getBytes(AbstractC5163a.f25245a);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // ff.InterfaceC2282a
    /* renamed from: b */
    public Object mo17b() {
        SQLiteDatabase sQLiteDatabaseM5772h;
        int i10 = this.f21a;
        Object obj = this.f22b;
        switch (i10) {
            case 6:
                C2049i c2049i = (C2049i) ((InterfaceC2043c) obj);
                c2049i.getClass();
                int i11 = C0134a.f433e;
                C8090p c8090p = new C8090p();
                c8090p.f38724b = null;
                c8090p.f38725c = new ArrayList();
                c8090p.f38726d = null;
                c8090p.f38723a = "";
                HashMap map = new HashMap();
                sQLiteDatabaseM5772h = c2049i.m5772h();
                sQLiteDatabaseM5772h.beginTransaction();
                try {
                    C0134a c0134a = (C0134a) C2049i.m5770H(sQLiteDatabaseM5772h.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0013l(8, c2049i, map, c8090p));
                    sQLiteDatabaseM5772h.setTransactionSuccessful();
                    return c0134a;
                } finally {
                }
            case 7:
                C2049i c2049i2 = (C2049i) ((InterfaceC2044d) obj);
                long time = c2049i2.f9624b.getTime() - c2049i2.f9626d.f9611d;
                sQLiteDatabaseM5772h = c2049i2.m5772h();
                sQLiteDatabaseM5772h.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor cursorRawQuery = sQLiteDatabaseM5772h.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c2049i2.m5775w(cursorRawQuery.getInt(0), EnumC0136c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM5772h.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM5772h.setTransactionSuccessful();
                    sQLiteDatabaseM5772h.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 8:
                C2049i c2049i3 = (C2049i) ((InterfaceC2043c) ((C3328c) obj).f17617i);
                sQLiteDatabaseM5772h = c2049i3.m5772h();
                sQLiteDatabaseM5772h.beginTransaction();
                try {
                    sQLiteDatabaseM5772h.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM5772h.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c2049i3.f9624b.getTime()).execute();
                    sQLiteDatabaseM5772h.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                C8090p c8090p2 = (C8090p) obj;
                Iterator it = ((Iterable) ((C2049i) ((InterfaceC2044d) c8090p2.f38724b)).m5773n(new C1612b(23))).iterator();
                while (it.hasNext()) {
                    ((C0005d) c8090p2.f38725c).a0((C8357i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // l8.InterfaceC4430d
    /* renamed from: c */
    public InterfaceC4431e mo25c(C4429c c4429c) {
        Context context = (Context) this.f22b;
        String str = c4429c.f22149b;
        AbstractC4428b callback = c4429c.f22150c;
        AbstractC4154l.m8923f(callback, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C4678h(context, str, callback, true, true);
    }

    @Override // i0.c1
    /* renamed from: d */
    public void mo18d(d1 d1Var) {
        f1 f1Var = (f1) this.f22b;
        synchronized (f1Var.f5085a) {
            f1Var.f5087c++;
        }
        f1Var.m2199f(d1Var);
    }

    @Override // qj.InterfaceC6236a
    /* renamed from: e */
    public void mo19e(InterfaceC6237b interfaceC6237b) {
        switch (this.f21a) {
            case 22:
                C7162b c7162b = (C7162b) this.f22b;
                Log.isLoggable("FirebaseCrashlytics", 3);
                c7162b.f34412b.set((C7162b) interfaceC6237b.get());
                break;
            default:
                C7163c c7163c = (C7163c) this.f22b;
                C8090p c8090p = ((C0171j) ((InterfaceC1732a) interfaceC6237b.get())).m386a().f514j;
                ((Set) c8090p.f38726d).add(c7163c);
                C8656m c8656mM1948b = ((C0674e) c8090p.f38723a).m1948b();
                c8656mM1948b.m15979f((Executor) c8090p.f38725c, new C0013l(5, c8090p, c8656mM1948b, c7163c));
                Log.isLoggable("FirebaseCrashlytics", 3);
                break;
        }
    }

    @Override // c0.f0
    /* renamed from: f */
    public void mo26f(p1 p1Var) {
        ((C0917l) this.f22b).mo26f(p1Var);
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public void mo27g(Object obj) {
        int i10 = this.f21a;
        Object obj2 = this.f22b;
        switch (i10) {
            case 13:
                int i11 = MainActivity.f7256m;
                ((j2) obj2).invoke(obj);
                break;
            default:
                ((C4833a) obj2).invoke(obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05e0 A[Catch: Exception -> 0x0623, TryCatch #7 {Exception -> 0x0623, blocks: (B:126:0x04da, B:129:0x05b2, B:130:0x05b7, B:132:0x05e0, B:134:0x05e8, B:136:0x05f6, B:140:0x0600, B:141:0x0615, B:143:0x061b), top: B:178:0x04da, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05fe  */
    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo21h(p020v.x0 r44) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, android.content.res.Resources.NotFoundException, java.security.NoSuchAlgorithmException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c0.mo21h(v.x0):java.lang.Object");
    }

    @Override // com.amplifyframework.devmenu.DeveloperMenu.HideAction
    public void hideDeveloperMenu() {
        ((DeveloperMenuActivity) this.f22b).finish();
    }

    @Override // mk.InterfaceC4777p
    /* renamed from: i */
    public Object mo28i() {
        int i10 = this.f21a;
        Object obj = this.f22b;
        switch (i10) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    xb xbVar = AbstractC5973c.f29216a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC5973c.m12005b(constructor) + "' with no args", e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC5973c.m12005b(constructor) + "' with no args", e11.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return AbstractC4785x.f23822a.mo9710a(cls);
                } catch (Exception e12) {
                    throw new RuntimeException(AbstractC1452a.m4560g("Unable to create instance of ", cls, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e12);
                }
        }
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m it) throws Exception {
        p1 p1Var = (p1) this.f22b;
        AbstractC4154l.m8923f(it, "it");
        p1Var.close();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* renamed from: k */
    public void m29k() {
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f22b;
        synchronized (AbstractC7316m.f34890b) {
            ?? r22 = AbstractC7316m.f34895g;
            AbstractC4154l.m8923f(r22, "<this>");
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(r22, 10));
            boolean z6 = false;
            for (Object obj : r22) {
                boolean z10 = true;
                if (!z6 && AbstractC4154l.m8918a(obj, interfaceC2141e)) {
                    z6 = true;
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            AbstractC7316m.f34895g = arrayList;
        }
    }

    /* renamed from: l */
    public boolean m30l(C8986c c8986c, int i10, Bundle bundle) {
        InterfaceC0874d c0861k;
        AbstractC5234t abstractC5234t = (AbstractC5234t) this.f22b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((InterfaceC1964g) c8986c.f43336b).mo61c();
                Parcelable parcelable = (Parcelable) ((InterfaceC1964g) c8986c.f43336b).mo69k();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        InterfaceC1964g interfaceC1964g = (InterfaceC1964g) c8986c.f43336b;
        ClipData clipData = new ClipData(interfaceC1964g.mo68j(), new ClipData.Item(interfaceC1964g.mo60b()));
        if (i11 >= 31) {
            c0861k = new C0861k(clipData, 2);
        } else {
            C0875e c0875e = new C0875e();
            c0875e.f5441b = clipData;
            c0875e.f5442c = 2;
            c0861k = c0875e;
        }
        c0861k.mo2304b(interfaceC1964g.mo66h());
        c0861k.setExtras(bundle);
        return v0.m2524f(abstractC5234t, c0861k.build()) == null;
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        return l8.m11765f((C0679j) this.f22b);
    }
}
