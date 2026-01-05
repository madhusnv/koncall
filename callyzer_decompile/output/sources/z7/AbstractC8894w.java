package z7;

import al.C0182j;
import android.os.Looper;
import b0.C0512d;
import b3.C0575g;
import b8.InterfaceC0607b;
import c9.C0910e;
import d9.ExecutorC1668m;
import dx.AbstractC1851a;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import l8.InterfaceC4427a;
import l8.InterfaceC4431e;
import lx.InterfaceC4564c;
import nx.AbstractC5185w;
import og.a1;
import og.mb;
import og.pe;
import ot.C5737e;
import pg.a9;
import qw.C6360j;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6668r;
import rw.C6669s;
import rw.C6670t;
import tx.InterfaceC7266z;
import uw.InterfaceC7564h;
import ww.AbstractC8193c;
import y7.AbstractC8586u;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.w */
/* loaded from: classes.dex */
public abstract class AbstractC8894w {

    /* renamed from: a */
    public C8810d f42831a;

    /* renamed from: b */
    public InterfaceC7564h f42832b;

    /* renamed from: c */
    public Executor f42833c;

    /* renamed from: d */
    public ExecutorC1668m f42834d;

    /* renamed from: e */
    public C0512d f42835e;

    /* renamed from: f */
    public C8881j f42836f;

    /* renamed from: h */
    public boolean f42838h;

    /* renamed from: g */
    public final C0910e f42837g = new C0910e(new C0575g(0, this, AbstractC8894w.class, "onClosed", "onClosed()V", 0, 13));

    /* renamed from: i */
    public final ThreadLocal f42839i = new ThreadLocal();

    /* renamed from: j */
    public final LinkedHashMap f42840j = new LinkedHashMap();

    /* renamed from: k */
    public boolean f42841k = true;

    /* renamed from: a */
    public final void m16387a() {
        if (this.f42838h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public final void m16388b() {
        if (m16393p() && !m16394q() && this.f42839i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: c */
    public final void m16389c() {
        m16387a();
        m16387a();
        InterfaceC4427a interfaceC4427aMo9273O = m16392k().mo9273O();
        if (!interfaceC4427aMo9273O.d0()) {
            a1.m10523a(new C8880i(m16391j(), null, 2));
        }
        if (interfaceC4427aMo9273O.k0()) {
            interfaceC4427aMo9273O.mo9260I();
        } else {
            interfaceC4427aMo9273O.mo9262k();
        }
    }

    /* renamed from: d */
    public List mo5020d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC6674x.m12776d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(AbstractC1851a.m5483b((InterfaceC4564c) entry.getKey()), entry.getValue());
        }
        return mo1375h(linkedHashMap2);
    }

    /* renamed from: e */
    public abstract C8881j mo1373e();

    /* renamed from: f */
    public AbstractC8586u mo5021f() {
        throw new C6360j();
    }

    /* renamed from: g */
    public InterfaceC4431e mo1374g(C8873b config) {
        AbstractC4154l.m8923f(config, "config");
        throw new C6360j();
    }

    /* renamed from: h */
    public List mo1375h(LinkedHashMap linkedHashMap) {
        return C6668r.f31943a;
    }

    /* renamed from: i */
    public final InterfaceC7266z m16390i() {
        C8810d c8810d = this.f42831a;
        if (c8810d != null) {
            return c8810d;
        }
        AbstractC4154l.m8928k("coroutineScope");
        throw null;
    }

    /* renamed from: j */
    public final C8881j m16391j() {
        C8881j c8881j = this.f42836f;
        if (c8881j != null) {
            return c8881j;
        }
        AbstractC4154l.m8928k("internalTracker");
        throw null;
    }

    /* renamed from: k */
    public final InterfaceC4431e m16392k() {
        C0512d c0512d = this.f42835e;
        if (c0512d == null) {
            AbstractC4154l.m8928k("connectionManager");
            throw null;
        }
        InterfaceC4431e interfaceC4431eM1508c = c0512d.m1508c();
        if (interfaceC4431eM1508c != null) {
            return interfaceC4431eM1508c;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    /* renamed from: l */
    public Set mo5022l() {
        Set<Class> setMo1376m = mo1376m();
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(setMo1376m, 10));
        for (Class cls : setMo1376m) {
            AbstractC4154l.m8923f(cls, "<this>");
            arrayList.add(kotlin.jvm.internal.a0.m8901a(cls));
        }
        return AbstractC6663m.g0(arrayList);
    }

    /* renamed from: m */
    public Set mo1376m() {
        return C6670t.f31945a;
    }

    /* renamed from: n */
    public LinkedHashMap mo5023n() {
        Set<Map.Entry> setEntrySet = mo1377o().entrySet();
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(setEntrySet, 10));
        if (iM12776d < 16) {
            iM12776d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            AbstractC4154l.m8923f(cls, "<this>");
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(cls);
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
            for (Class cls2 : list) {
                AbstractC4154l.m8923f(cls2, "<this>");
                arrayList.add(kotlin.jvm.internal.a0.m8901a(cls2));
            }
            linkedHashMap.put(c4147eM8901a, arrayList);
        }
        return linkedHashMap;
    }

    /* renamed from: o */
    public Map mo1377o() {
        return C6669s.f31944a;
    }

    /* renamed from: p */
    public final boolean m16393p() {
        C0512d c0512d = this.f42835e;
        if (c0512d != null) {
            return c0512d.m1508c() != null;
        }
        AbstractC4154l.m8928k("connectionManager");
        throw null;
    }

    /* renamed from: q */
    public final boolean m16394q() {
        return m16397t() && m16392k().mo9273O().d0();
    }

    /* renamed from: r */
    public final void m16395r() {
        m16392k().mo9273O().mo9261T();
        if (m16394q()) {
            return;
        }
        C8881j c8881jM16391j = m16391j();
        c8881jM16391j.f42748b.m16381e(c8881jM16391j.f42751e, c8881jM16391j.f42752f);
    }

    /* renamed from: s */
    public final void m16396s(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        C8881j c8881jM16391j = m16391j();
        n0 n0Var = c8881jM16391j.f42748b;
        n0Var.getClass();
        InterfaceC4026c interfaceC4026cY0 = connection.y0("PRAGMA query_only");
        try {
            interfaceC4026cY0.r0();
            boolean z6 = interfaceC4026cY0.getLong(0) != 0;
            mb.m10760a(interfaceC4026cY0, null);
            if (!z6) {
                a9.m11538a(connection, "PRAGMA temp_store = MEMORY");
                a9.m11538a(connection, "PRAGMA recursive_triggers = 1");
                a9.m11538a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (n0Var.f42787d) {
                    a9.m11538a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    a9.m11538a(connection, AbstractC5185w.m10136r("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                C0182j c0182j = n0Var.f42791h;
                ReentrantLock reentrantLock = (ReentrantLock) c0182j.f555b;
                reentrantLock.lock();
                try {
                    c0182j.f554a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (c8881jM16391j.f42754h) {
            }
        } finally {
        }
    }

    /* renamed from: t */
    public final boolean m16397t() {
        C0512d c0512d = this.f42835e;
        if (c0512d == null) {
            AbstractC4154l.m8928k("connectionManager");
            throw null;
        }
        InterfaceC4427a interfaceC4427a = (InterfaceC4427a) c0512d.f3580g;
        if (interfaceC4427a != null) {
            return interfaceC4427a.isOpen();
        }
        return false;
    }

    /* renamed from: u */
    public final Object m16398u(InterfaceC2137a interfaceC2137a) {
        if (!m16393p()) {
            return pe.m10837l(this, false, true, new C5737e(5, interfaceC2137a));
        }
        m16389c();
        try {
            Object objInvoke = interfaceC2137a.invoke();
            m16399v();
            return objInvoke;
        } finally {
            m16395r();
        }
    }

    /* renamed from: v */
    public final void m16399v() {
        m16392k().mo9273O().mo9259F();
    }

    /* renamed from: w */
    public final Object m16400w(boolean z6, InterfaceC2141e interfaceC2141e, AbstractC8193c abstractC8193c) {
        C0512d c0512d = this.f42835e;
        if (c0512d != null) {
            return ((InterfaceC0607b) c0512d.f3579f).mo1767s(z6, interfaceC2141e, abstractC8193c);
        }
        AbstractC4154l.m8928k("connectionManager");
        throw null;
    }
}
