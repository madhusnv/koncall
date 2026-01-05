package ak;

import android.app.Application;
import android.content.Context;
import bk.C0674e;
import bk.C0681l;
import bk.C0682m;
import bk.C0687r;
import bk.C0688s;
import c9.C0908c;
import c9.C0910e;
import c9.C0927v;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import dk.InterfaceC1732a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import ji.C3773g;
import ki.C4079b;
import p020v.a1;
import pg.l8;
import qj.InterfaceC6237b;
import rf.ComponentCallbacks2C6498c;
import rj.InterfaceC6558d;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.j */
/* loaded from: classes.dex */
public final class C0171j implements InterfaceC1732a {

    /* renamed from: j */
    public static final Random f521j = new Random();

    /* renamed from: k */
    public static final HashMap f522k = new HashMap();

    /* renamed from: b */
    public final Context f524b;

    /* renamed from: c */
    public final ScheduledExecutorService f525c;

    /* renamed from: d */
    public final C3773g f526d;

    /* renamed from: e */
    public final InterfaceC6558d f527e;

    /* renamed from: f */
    public final C4079b f528f;

    /* renamed from: g */
    public final InterfaceC6237b f529g;

    /* renamed from: h */
    public final String f530h;

    /* renamed from: a */
    public final HashMap f523a = new HashMap();

    /* renamed from: i */
    public final HashMap f531i = new HashMap();

    public C0171j(Context context, ScheduledExecutorService scheduledExecutorService, C3773g c3773g, InterfaceC6558d interfaceC6558d, C4079b c4079b, InterfaceC6237b interfaceC6237b) {
        this.f524b = context;
        this.f525c = scheduledExecutorService;
        this.f526d = c3773g;
        this.f527e = interfaceC6558d;
        this.f528f = c4079b;
        this.f529g = interfaceC6237b;
        c3773g.m8293a();
        this.f530h = c3773g.f19664c.f19678b;
        AtomicReference atomicReference = C0170i.f520a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = C0170i.f520a;
        if (atomicReference2.get() == null) {
            C0170i c0170i = new C0170i();
            while (true) {
                if (atomicReference2.compareAndSet(null, c0170i)) {
                    ComponentCallbacks2C6498c.m12509b(application);
                    ComponentCallbacks2C6498c.f31211e.m12510a(c0170i);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        l8.m11762c(scheduledExecutorService, new CallableC0167f(0, this));
    }

    /* renamed from: a */
    public final synchronized C0165d m386a() {
        try {
            try {
                C0674e c0674eM388c = m388c("fetch");
                C0674e c0674eM388c2 = m388c("activate");
                C0674e c0674eM388c3 = m388c("defaults");
                C0687r c0687r = new C0687r(this.f524b.getSharedPreferences("frc_" + this.f530h + "_firebase_settings", 0));
                C0682m c0682m = new C0682m(this.f525c, c0674eM388c2, c0674eM388c3);
                C3773g c3773g = this.f526d;
                InterfaceC6237b interfaceC6237b = this.f529g;
                c3773g.m8293a();
                C0910e c0910e = c3773g.f19663b.equals("[DEFAULT]") ? new C0910e(interfaceC6237b) : null;
                if (c0910e != null) {
                    C0168g c0168g = new C0168g(c0910e);
                    synchronized (c0682m.f4285a) {
                        c0682m.f4285a.add(c0168g);
                    }
                }
                C0927v c0927v = new C0927v(1, false);
                c0927v.f5668b = c0674eM388c2;
                c0927v.f5669c = c0674eM388c3;
                ScheduledExecutorService scheduledExecutorService = this.f525c;
                C8090p c8090p = new C8090p();
                c8090p.f38726d = Collections.newSetFromMap(new ConcurrentHashMap());
                c8090p.f38723a = c0674eM388c2;
                c8090p.f38724b = c0927v;
                c8090p.f38725c = scheduledExecutorService;
                return m387b(this.f526d, this.f527e, this.f528f, this.f525c, c0674eM388c, c0674eM388c2, c0674eM388c3, m389d(c0674eM388c, c0687r), c0682m, c0687r, c8090p);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized C0165d m387b(C3773g c3773g, InterfaceC6558d interfaceC6558d, C4079b c4079b, Executor executor, C0674e c0674e, C0674e c0674e2, C0674e c0674e3, C0681l c0681l, C0682m c0682m, C0687r c0687r, C8090p c8090p) {
        if (!this.f523a.containsKey("firebase")) {
            c3773g.m8293a();
            C4079b c4079b2 = c3773g.f19663b.equals("[DEFAULT]") ? c4079b : null;
            Context context = this.f524b;
            synchronized (this) {
                C0165d c0165d = new C0165d(c4079b2, executor, c0674e, c0674e2, c0674e3, c0681l, c0682m, c0687r, new C0908c(c3773g, interfaceC6558d, c0681l, c0674e2, context, c0687r, this.f525c), c8090p);
                c0674e2.m1948b();
                c0674e3.m1948b();
                c0674e.m1948b();
                this.f523a.put("firebase", c0165d);
                f522k.put("firebase", c0165d);
            }
        }
        return (C0165d) this.f523a.get("firebase");
    }

    /* renamed from: c */
    public final C0674e m388c(String str) {
        C0688s c0688s;
        C0674e c0674e;
        String strM14333m = a1.m14333m("frc_", this.f530h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f525c;
        Context context = this.f524b;
        HashMap map = C0688s.f4320c;
        synchronized (C0688s.class) {
            try {
                HashMap map2 = C0688s.f4320c;
                if (!map2.containsKey(strM14333m)) {
                    map2.put(strM14333m, new C0688s(context, strM14333m));
                }
                c0688s = (C0688s) map2.get(strM14333m);
            } finally {
            }
        }
        HashMap map3 = C0674e.f4245d;
        synchronized (C0674e.class) {
            try {
                String str2 = c0688s.f4322b;
                HashMap map4 = C0674e.f4245d;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new C0674e(scheduledExecutorService, c0688s));
                }
                c0674e = (C0674e) map4.get(str2);
            } finally {
            }
        }
        return c0674e;
    }

    /* renamed from: d */
    public final synchronized C0681l m389d(C0674e c0674e, C0687r c0687r) {
        InterfaceC6558d interfaceC6558d;
        InterfaceC6237b c0169h;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        C3773g c3773g;
        try {
            interfaceC6558d = this.f527e;
            C3773g c3773g2 = this.f526d;
            c3773g2.m8293a();
            c0169h = c3773g2.f19663b.equals("[DEFAULT]") ? this.f529g : new C0169h(0);
            scheduledExecutorService = this.f525c;
            random = f521j;
            C3773g c3773g3 = this.f526d;
            c3773g3.m8293a();
            str = c3773g3.f19664c.f19677a;
            c3773g = this.f526d;
            c3773g.m8293a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new C0681l(interfaceC6558d, c0169h, scheduledExecutorService, random, c0674e, new ConfigFetchHttpClient(this.f524b, c3773g.f19664c.f19678b, str, c0687r.f4316a.getLong("fetch_timeout_in_seconds", 60L), c0687r.f4316a.getLong("fetch_timeout_in_seconds", 60L)), c0687r, this.f531i);
    }
}
