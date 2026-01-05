package nz;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import l4.d0;
import mz.C4920d;
import og.md;
import p020v.a1;
import sf.AbstractC6840z;
import ug.C7448s;
import ug.l4;
import ug.n1;
import ug.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.l */
/* loaded from: classes3.dex */
public final class C5201l implements InterfaceC5198i {

    /* renamed from: a */
    public final /* synthetic */ int f25347a = 0;

    /* renamed from: b */
    public final long f25348b;

    /* renamed from: c */
    public long f25349c;

    /* renamed from: d */
    public final Object f25350d;

    /* renamed from: e */
    public final Object f25351e;

    /* renamed from: f */
    public final Serializable f25352f;

    /* renamed from: g */
    public final Iterable f25353g;

    public C5201l(n1 n1Var, String str, String str2, String str3, long j6, long j10, Bundle bundle) {
        C7448s c7448s;
        AbstractC6840z.m13033d(str2);
        AbstractC6840z.m13033d(str3);
        this.f25350d = str2;
        this.f25351e = str3;
        this.f25352f = true == TextUtils.isEmpty(str) ? null : str;
        this.f25348b = j6;
        this.f25349c = j10;
        if (j10 != 0 && j10 > j6) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(v0.m14157U(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c7448s = new C7448s(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    v0 v0Var2 = n1Var.f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35862f.m14140a("Param name can't be null");
                    it.remove();
                } else {
                    l4 l4Var = n1Var.f35672j;
                    n1.m14083i(l4Var);
                    Object objM14031T = l4Var.m14031T(bundle2.get(next), next);
                    if (objM14031T == null) {
                        v0 v0Var3 = n1Var.f35669f;
                        n1.m14085m(v0Var3);
                        v0Var3.f35865j.m14141b(n1Var.f35673k.m14114b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        l4 l4Var2 = n1Var.f35672j;
                        n1.m14083i(l4Var2);
                        l4Var2.b0(bundle2, next, objM14031T);
                    }
                }
            }
            c7448s = new C7448s(bundle2);
        }
        this.f25353g = c7448s;
    }

    @Override // nz.InterfaceC5198i
    /* renamed from: a */
    public C5206q mo9079a() throws IOException {
        C5210u c5210uM10188d;
        long j6;
        C5210u c5210u;
        InterfaceC5212w interfaceC5212w = (InterfaceC5212w) this.f25350d;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f25352f;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !interfaceC5212w.mo8775p(null)) {
                    m10187c();
                    AbstractC4154l.m8920c(iOException);
                    throw iOException;
                }
                if (interfaceC5212w.mo8767h()) {
                    throw new IOException("Canceled");
                }
                d0 d0Var = ((C4920d) this.f25351e).f24473a;
                long jNanoTime = System.nanoTime();
                long j10 = this.f25349c - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j10 <= 0) {
                    c5210uM10188d = m10188d();
                    j6 = this.f25348b;
                    this.f25349c = jNanoTime + j6;
                } else {
                    j6 = j10;
                    c5210uM10188d = null;
                }
                if (c5210uM10188d == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (c5210u = (C5210u) ((LinkedBlockingDeque) this.f25353g).poll(j6, timeUnit)) == null) {
                        c5210uM10188d = null;
                    } else {
                        copyOnWriteArrayList.remove(c5210u.f25420a);
                        c5210uM10188d = c5210u;
                    }
                    if (c5210uM10188d == null) {
                    }
                }
                InterfaceC5211v interfaceC5211v = c5210uM10188d.f25420a;
                boolean z6 = false;
                if (c5210uM10188d.f25421b == null && c5210uM10188d.f25422c == null) {
                    m10187c();
                    if (!interfaceC5211v.mo10169d()) {
                        c5210uM10188d = interfaceC5211v.mo10172g();
                    }
                    if (c5210uM10188d.f25421b == null && c5210uM10188d.f25422c == null) {
                        z6 = true;
                    }
                    if (z6) {
                        return c5210uM10188d.f25420a.mo10168c();
                    }
                }
                Throwable th2 = c5210uM10188d.f25422c;
                if (th2 != null) {
                    if (!(th2 instanceof IOException)) {
                        throw th2;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th2;
                    } else {
                        md.m10764a(iOException, th2);
                    }
                }
                InterfaceC5211v interfaceC5211v2 = c5210uM10188d.f25421b;
                if (interfaceC5211v2 != null) {
                    interfaceC5212w.mo8771l().addFirst(interfaceC5211v2);
                }
            } finally {
                m10187c();
            }
        }
    }

    @Override // nz.InterfaceC5198i
    /* renamed from: b */
    public InterfaceC5212w mo9080b() {
        return (InterfaceC5212w) this.f25350d;
    }

    /* renamed from: c */
    public void m10187c() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f25352f;
        Iterator it = copyOnWriteArrayList.iterator();
        AbstractC4154l.m8922e(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC5211v interfaceC5211v = (InterfaceC5211v) it.next();
            interfaceC5211v.cancel();
            InterfaceC5211v interfaceC5211vMo10166a = interfaceC5211v.mo10166a();
            if (interfaceC5211vMo10166a != null) {
                ((InterfaceC5212w) this.f25350d).mo8771l().addLast(interfaceC5211vMo10166a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* renamed from: d */
    public C5210u m10188d() {
        InterfaceC5211v c5199j;
        InterfaceC5212w interfaceC5212w = (InterfaceC5212w) this.f25350d;
        if (interfaceC5212w.mo8775p(null)) {
            try {
                c5199j = interfaceC5212w.mo8772m();
            } catch (Throwable th2) {
                c5199j = new C5199j(th2);
            }
            if (c5199j.mo10169d()) {
                return new C5210u(c5199j, null, null, 6);
            }
            if (c5199j instanceof C5199j) {
                return ((C5199j) c5199j).f25344a;
            }
            ((CopyOnWriteArrayList) this.f25352f).add(c5199j);
            ((C4920d) this.f25351e).m9824d().m9818d(new C5200k(AbstractC4299e.f21708b + " connect " + interfaceC5212w.mo8768i().f17780h.m7802g(), c5199j, this), 0L);
        }
        return null;
    }

    /* renamed from: e */
    public C5201l m10189e(n1 n1Var, long j6) {
        return new C5201l(n1Var, (String) this.f25352f, (String) this.f25350d, (String) this.f25351e, this.f25348b, j6, (C7448s) this.f25353g);
    }

    public String toString() {
        switch (this.f25347a) {
            case 1:
                String string = ((C7448s) this.f25353g).toString();
                String str = (String) this.f25350d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f25351e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
                a1.m14319B(sb2, "Event{appId='", str, "', name='", str2);
                return a1.m14335o(sb2, "', params=", string, "}");
            default:
                return super.toString();
        }
    }

    public C5201l(n1 n1Var, String str, String str2, String str3, long j6, long j10, C7448s c7448s) {
        AbstractC6840z.m13033d(str2);
        AbstractC6840z.m13033d(str3);
        AbstractC6840z.m13036g(c7448s);
        this.f25350d = str2;
        this.f25351e = str3;
        this.f25352f = true == TextUtils.isEmpty(str) ? null : str;
        this.f25348b = j6;
        this.f25349c = j10;
        if (j10 != 0 && j10 > j6) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14142c("Event created with reverse previous/current timestamps. appId, name", v0.m14157U(str2), v0.m14157U(str3));
        }
        this.f25353g = c7448s;
    }

    public C5201l(InterfaceC5212w interfaceC5212w, C4920d taskRunner) {
        AbstractC4154l.m8923f(taskRunner, "taskRunner");
        this.f25350d = interfaceC5212w;
        this.f25351e = taskRunner;
        this.f25348b = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f25349c = Long.MIN_VALUE;
        this.f25352f = new CopyOnWriteArrayList();
        this.f25353g = new LinkedBlockingDeque();
    }
}
