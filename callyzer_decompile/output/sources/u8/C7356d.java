package u8;

import a1.RunnableC0025x;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import b9.C0629a;
import c9.C0914i;
import c9.C0915j;
import c9.C0922q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import k0.ExecutorC3896f;
import l4.C4367l;
import lv.C4535g;
import og.ng;
import pg.x5;
import qc.C6158d;
import qi.RunnableC6224g;
import ri.CallableC6547e;
import t8.C7056b;
import t8.C7077w;
import tx.AbstractC7262v;
import tx.c0;
import tx.f1;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.d */
/* loaded from: classes.dex */
public final class C7356d {

    /* renamed from: b */
    public final Context f35004b;

    /* renamed from: c */
    public final C7056b f35005c;

    /* renamed from: d */
    public final C0914i f35006d;

    /* renamed from: e */
    public final WorkDatabase f35007e;

    /* renamed from: g */
    public final HashMap f35009g = new HashMap();

    /* renamed from: f */
    public final HashMap f35008f = new HashMap();

    /* renamed from: i */
    public final HashSet f35011i = new HashSet();

    /* renamed from: j */
    public final ArrayList f35012j = new ArrayList();

    /* renamed from: a */
    public PowerManager.WakeLock f35003a = null;

    /* renamed from: k */
    public final Object f35013k = new Object();

    /* renamed from: h */
    public final HashMap f35010h = new HashMap();

    static {
        C7077w.m13372b("Processor");
    }

    public C7356d(Context context, C7056b c7056b, C0914i c0914i, WorkDatabase workDatabase) {
        this.f35004b = context;
        this.f35005c = c7056b;
        this.f35006d = c0914i;
        this.f35007e = workDatabase;
    }

    /* renamed from: d */
    public static boolean m13768d(C7378z c7378z, int i10) {
        if (c7378z == null) {
            C7077w.m13371a().getClass();
            return false;
        }
        c7378z.f35079n.mo13566p(new WorkerStoppedException(i10));
        C7077w.m13371a().getClass();
        return true;
    }

    /* renamed from: a */
    public final void m13769a(InterfaceC7354b interfaceC7354b) {
        synchronized (this.f35013k) {
            this.f35012j.add(interfaceC7354b);
        }
    }

    /* renamed from: b */
    public final C7378z m13770b(String str) {
        C7378z c7378z = (C7378z) this.f35008f.remove(str);
        boolean z6 = c7378z != null;
        if (!z6) {
            c7378z = (C7378z) this.f35009g.remove(str);
        }
        this.f35010h.remove(str);
        if (z6) {
            synchronized (this.f35013k) {
                try {
                    if (this.f35008f.isEmpty()) {
                        Context context = this.f35004b;
                        int i10 = C0629a.f4090k;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f35004b.startService(intent);
                        } catch (Throwable unused) {
                            C7077w.m13371a().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.f35003a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f35003a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return c7378z;
    }

    /* renamed from: c */
    public final C7378z m13771c(String str) {
        C7378z c7378z = (C7378z) this.f35008f.get(str);
        return c7378z == null ? (C7378z) this.f35009g.get(str) : c7378z;
    }

    /* renamed from: e */
    public final void m13772e(InterfaceC7354b interfaceC7354b) {
        synchronized (this.f35013k) {
            this.f35012j.remove(interfaceC7354b);
        }
    }

    /* renamed from: f */
    public final void m13773f(C0915j c0915j) {
        ((ExecutorC3896f) this.f35006d.f5588d).execute(new RunnableC6224g(6, this, c0915j));
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: g */
    public final boolean m13774g(C7361i c7361i, C4367l c4367l) {
        Throwable th2;
        boolean z6;
        C0915j c0915j = c7361i.f35021a;
        String str = c0915j.f5589a;
        ArrayList arrayList = new ArrayList();
        C0922q c0922q = (C0922q) this.f35007e.m16398u(new C6158d(20, new CallableC6547e(1, this, arrayList, str)));
        if (c0922q == null) {
            C7077w c7077wM13371a = C7077w.m13371a();
            c0915j.toString();
            c7077wM13371a.getClass();
            m13773f(c0915j);
            return false;
        }
        synchronized (this.f35013k) {
            try {
                try {
                    synchronized (this.f35013k) {
                        try {
                            z6 = m13771c(str) != null;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                th2 = th;
                throw th2;
            }
            try {
                if (z6) {
                    Set set = (Set) this.f35010h.get(str);
                    if (((C7361i) set.iterator().next()).f35021a.f5590b == c0915j.f5590b) {
                        set.add(c7361i);
                        C7077w c7077wM13371a2 = C7077w.m13371a();
                        c0915j.toString();
                        c7077wM13371a2.getClass();
                    } else {
                        m13773f(c0915j);
                    }
                    return false;
                }
                if (c0922q.f5641t != c0915j.f5590b) {
                    m13773f(c0915j);
                    return false;
                }
                C4535g c4535g = new C4535g(this.f35004b, this.f35005c, this.f35006d, this, this.f35007e, c0922q, arrayList);
                if (c4367l != null) {
                    c4535g.f22545i = c4367l;
                }
                C7378z c7378z = new C7378z(c4535g);
                AbstractC7262v abstractC7262v = (AbstractC7262v) c7378z.f35070e.f5586b;
                f1 f1VarM13480c = c0.m13480c();
                abstractC7262v.getClass();
                C8302l c8302lM10786b = ng.m10786b(x5.m11928d(abstractC7262v, f1VarM13480c), new C7376x(c7378z, null, 1));
                c8302lM10786b.f39850b.mo9026a(new RunnableC0025x(21, this, c8302lM10786b, c7378z), (ExecutorC3896f) this.f35006d.f5588d);
                this.f35009g.put(str, c7378z);
                HashSet hashSet = new HashSet();
                hashSet.add(c7361i);
                this.f35010h.put(str, hashSet);
                C7077w c7077wM13371a3 = C7077w.m13371a();
                c0915j.toString();
                c7077wM13371a3.getClass();
                return true;
            } catch (Throwable th7) {
                th2 = th7;
                throw th2;
            }
        }
    }
}
