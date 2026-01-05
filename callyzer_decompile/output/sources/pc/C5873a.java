package pc;

import iz.AbstractC3386s;
import iz.C3388u;
import iz.C3391x;
import iz.f0;
import iz.k0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nz.C5205p;
import nz.C5206q;
import p020v.x0;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.a */
/* loaded from: classes.dex */
public final class C5873a extends AbstractC3386s {

    /* renamed from: b */
    public final ArrayList f28653b;

    /* renamed from: c */
    public final List f28654c;

    public C5873a(ArrayList arrayList) {
        this.f28653b = arrayList;
        this.f28654c = AbstractC6663m.m12758V(arrayList);
    }

    @Override // iz.AbstractC3386s
    /* renamed from: A */
    public final void mo7757A(C5205p c5205p, C3388u c3388u) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7757A(c5205p, c3388u);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: B */
    public final void mo7758B(C5205p c5205p) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7758B(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: a */
    public final void mo7759a(C5205p c5205p, k0 cachedResponse) {
        AbstractC4154l.m8923f(cachedResponse, "cachedResponse");
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7759a(c5205p, cachedResponse);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: b */
    public final void mo7760b(C5205p c5205p, k0 k0Var) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7760b(c5205p, k0Var);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: c */
    public final void mo7761c(C5205p c5205p) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7761c(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: d */
    public final void mo7762d(C5205p c5205p, IOException iOException) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7762d(c5205p, iOException);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: e */
    public final void mo7763e(C5205p c5205p) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7763e(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: f */
    public final void mo7764f(C5205p c5205p) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7764f(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: g */
    public final void mo7765g(C5205p c5205p, InetSocketAddress inetSocketAddress, Proxy proxy, f0 f0Var) {
        AbstractC4154l.m8923f(inetSocketAddress, "inetSocketAddress");
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7765g(c5205p, inetSocketAddress, proxy, f0Var);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: h */
    public final void mo7766h(C5205p c5205p, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        AbstractC4154l.m8923f(inetSocketAddress, "inetSocketAddress");
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7766h(c5205p, inetSocketAddress, proxy, iOException);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: i */
    public final void mo7767i(C5205p c5205p, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC4154l.m8923f(inetSocketAddress, "inetSocketAddress");
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7767i(c5205p, inetSocketAddress, proxy);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: j */
    public final void mo7768j(C5205p c5205p, C5206q connection) {
        AbstractC4154l.m8923f(connection, "connection");
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7768j(c5205p, connection);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: k */
    public final void mo7769k(C5205p c5205p, C5206q connection) {
        AbstractC4154l.m8923f(connection, "connection");
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7769k(c5205p, connection);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: l */
    public final void mo7770l(C5205p c5205p, String str, List list) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7770l(c5205p, str, list);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: m */
    public final void mo7771m(C5205p c5205p, String str) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7771m(c5205p, str);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: n */
    public final void mo7772n(C5205p c5205p, C3391x url, List list) {
        AbstractC4154l.m8923f(url, "url");
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7772n(c5205p, url, list);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: o */
    public final void mo7773o(C5205p c5205p, C3391x url) {
        AbstractC4154l.m8923f(url, "url");
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7773o(c5205p, url);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: p */
    public final void mo7774p(C5205p c5205p, long j6) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7774p(c5205p, j6);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: q */
    public final void mo7775q(C5205p c5205p) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7775q(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: r */
    public final void mo7776r(C5205p c5205p, IOException ioe) {
        AbstractC4154l.m8923f(ioe, "ioe");
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7776r(c5205p, ioe);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: s */
    public final void mo7777s(C5205p c5205p, x0 request) {
        AbstractC4154l.m8923f(request, "request");
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7777s(c5205p, request);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: t */
    public final void mo7778t(C5205p c5205p) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7778t(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: u */
    public final void mo7779u(C5205p c5205p, long j6) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7779u(c5205p, j6);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: v */
    public final void mo7780v(C5205p c5205p) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7780v(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: w */
    public final void mo7781w(C5205p c5205p, IOException ioe) {
        AbstractC4154l.m8923f(ioe, "ioe");
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7781w(c5205p, ioe);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: x */
    public final void mo7782x(C5205p c5205p, k0 k0Var) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7782x(c5205p, k0Var);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: y */
    public final void mo7783y(C5205p c5205p) {
        ArrayList arrayList = this.f28653b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC3386s) obj).mo7783y(c5205p);
        }
    }

    @Override // iz.AbstractC3386s
    /* renamed from: z */
    public final void mo7784z(C5205p c5205p, k0 k0Var) {
        Iterator it = this.f28654c.iterator();
        while (it.hasNext()) {
            ((AbstractC3386s) it.next()).mo7784z(c5205p, k0Var);
        }
    }
}
