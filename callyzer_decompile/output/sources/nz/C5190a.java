package nz;

import iz.f0;
import iz.o0;
import java.io.IOException;
import java.net.Socket;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import oz.C5783f;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.a */
/* loaded from: classes3.dex */
public final class C5190a {

    /* renamed from: a */
    public final C5205p f25297a;

    /* renamed from: b */
    public final C5194e f25298b;

    /* renamed from: c */
    public final C5783f f25299c;

    public C5190a(C5205p c5205p, C5194e c5194e, C5783f c5783f) {
        this.f25297a = c5205p;
        this.f25298b = c5194e;
        this.f25299c = c5783f;
    }

    /* renamed from: a */
    public final void m10150a(C5206q connection) {
        AbstractC4154l.m8923f(connection, "connection");
        TimeZone timeZone = AbstractC4299e.f21707a;
        C5205p c5205p = this.f25297a;
        if (c5205p.f25367j != null) {
            throw new IllegalStateException("Check failed.");
        }
        c5205p.f25367j = connection;
        connection.f25394t.add(new C5203n(c5205p, c5205p.f25365g));
    }

    /* renamed from: b */
    public final void m10151b(C5193d c5193d) {
        this.f25297a.f25375s.add(c5193d);
    }

    /* renamed from: c */
    public final void m10152c(o0 route, f0 f0Var) {
        AbstractC4154l.m8923f(route, "route");
        C5205p c5205p = this.f25297a;
        c5205p.f25362d.mo7765g(c5205p, route.f17971c, route.f17970b, f0Var);
    }

    /* renamed from: d */
    public final C5206q m10153d() {
        return this.f25297a.f25367j;
    }

    /* renamed from: e */
    public final void m10154e(o0 route, IOException iOException) {
        AbstractC4154l.m8923f(route, "route");
        C5205p c5205p = this.f25297a;
        c5205p.f25362d.mo7766h(c5205p, route.f17971c, route.f17970b, iOException);
    }

    /* renamed from: f */
    public final void m10155f(o0 route) {
        AbstractC4154l.m8923f(route, "route");
        C5205p c5205p = this.f25297a;
        c5205p.f25362d.mo7767i(c5205p, route.f17971c, route.f17970b);
    }

    /* renamed from: g */
    public final void m10156g(C5206q connection) {
        AbstractC4154l.m8923f(connection, "connection");
        C5205p c5205p = this.f25297a;
        c5205p.f25362d.mo7768j(c5205p, connection);
    }

    /* renamed from: h */
    public final void m10157h(C5206q connection) {
        AbstractC4154l.m8923f(connection, "connection");
        connection.f25386l.getClass();
        C5205p call = this.f25297a;
        AbstractC4154l.m8923f(call, "call");
    }

    /* renamed from: k */
    public final boolean m10160k() {
        return !AbstractC4154l.m8918a((String) ((x0) this.f25299c.f28358i).f36755c, "GET");
    }

    /* renamed from: l */
    public final boolean m10161l() {
        return this.f25297a.f25373q;
    }

    /* renamed from: n */
    public final Socket m10163n() {
        return this.f25297a.m10196g();
    }

    /* renamed from: o */
    public final void m10164o(C5193d c5193d) {
        this.f25297a.f25375s.remove(c5193d);
    }

    /* renamed from: i */
    public final void m10158i(C5206q c5206q) {
    }

    /* renamed from: j */
    public final void m10159j(C5206q c5206q) {
    }

    /* renamed from: m */
    public final void m10162m(C5206q c5206q) {
    }
}
