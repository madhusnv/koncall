package b8;

import dy.AbstractC1856d;
import dy.C1855c;
import dy.InterfaceC1853a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5170h;
import og.md;
import og.pe;
import rw.AbstractC6663m;
import rw.C6668r;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.g */
/* loaded from: classes.dex */
public final class C0612g implements InterfaceC4024a, InterfaceC1853a {

    /* renamed from: a */
    public final InterfaceC4024a f4019a;

    /* renamed from: b */
    public final InterfaceC1853a f4020b;

    /* renamed from: c */
    public InterfaceC7564h f4021c;

    /* renamed from: d */
    public Throwable f4022d;

    public C0612g(InterfaceC4024a delegate) {
        C1855c c1855cM5490a = AbstractC1856d.m5490a();
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f4019a = delegate;
        this.f4020b = c1855cM5490a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f4019a.close();
    }

    @Override // dy.InterfaceC1853a
    /* renamed from: h */
    public final Object mo1768h(InterfaceC7559c interfaceC7559c) {
        return this.f4020b.mo1768h(interfaceC7559c);
    }

    @Override // dy.InterfaceC1853a
    /* renamed from: j */
    public final void mo1769j(Object obj) {
        this.f4020b.mo1769j(null);
    }

    /* renamed from: n */
    public final void m1770n(StringBuilder sb2) {
        List listM10833h;
        if (this.f4021c == null && this.f4022d == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
            return;
        }
        sb2.append("\t\tStatus: Acquired connection");
        sb2.append('\n');
        InterfaceC7564h interfaceC7564h = this.f4021c;
        if (interfaceC7564h != null) {
            sb2.append("\t\tCoroutine: " + interfaceC7564h);
            sb2.append('\n');
        }
        Throwable th2 = this.f4022d;
        if (th2 != null) {
            sb2.append("\t\tAcquired:");
            sb2.append('\n');
            C5170h c5170h = new C5170h(md.m10766c(th2));
            if (c5170h.hasNext()) {
                Object next = c5170h.next();
                if (c5170h.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (c5170h.hasNext()) {
                        arrayList.add(c5170h.next());
                    }
                    listM10833h = arrayList;
                } else {
                    listM10833h = pe.m10833h(next);
                }
            } else {
                listM10833h = C6668r.f31943a;
            }
            Iterator it = AbstractC6663m.m12738B(listM10833h).iterator();
            while (it.hasNext()) {
                sb2.append("\t\t" + ((String) it.next()));
                sb2.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f4019a.toString();
    }

    @Override // k8.InterfaceC4024a
    public final InterfaceC4026c y0(String sql) {
        AbstractC4154l.m8923f(sql, "sql");
        return this.f4019a.y0(sql);
    }
}
