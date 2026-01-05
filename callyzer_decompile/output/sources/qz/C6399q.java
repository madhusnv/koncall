package qz;

import a2.AbstractC0030c;
import b00.C0529n;
import b00.h0;
import b00.i0;
import iz.C3389v;
import iz.C3391x;
import iz.d0;
import iz.f0;
import iz.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import nz.C5206q;
import okhttp3.internal.http2.ConnectionShutdownException;
import oz.AbstractC5782e;
import oz.C5783f;
import oz.InterfaceC5780c;
import oz.InterfaceC5781d;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.q */
/* loaded from: classes3.dex */
public final class C6399q implements InterfaceC5781d {

    /* renamed from: g */
    public static final List f30868g = AbstractC4299e.m9022k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h */
    public static final List f30869h = AbstractC4299e.m9022k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a */
    public final C5206q f30870a;

    /* renamed from: b */
    public final C5783f f30871b;

    /* renamed from: c */
    public final C6398p f30872c;

    /* renamed from: d */
    public volatile C6406x f30873d;

    /* renamed from: e */
    public final f0 f30874e;

    /* renamed from: f */
    public volatile boolean f30875f;

    public C6399q(d0 d0Var, C5206q c5206q, C5783f c5783f, C6398p http2Connection) {
        AbstractC4154l.m8923f(http2Connection, "http2Connection");
        this.f30870a = c5206q;
        this.f30871b = c5783f;
        this.f30872c = http2Connection;
        List list = d0Var.f17851r;
        f0 f0Var = f0.H2_PRIOR_KNOWLEDGE;
        this.f30874e = list.contains(f0Var) ? f0Var : f0.HTTP_2;
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: a */
    public final long mo11313a(k0 k0Var) {
        if (AbstractC5782e.m11322a(k0Var)) {
            return AbstractC4299e.m9016e(k0Var);
        }
        return 0L;
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: b */
    public final void mo11314b() {
        C6406x c6406x = this.f30873d;
        AbstractC4154l.m8920c(c6406x);
        c6406x.f30905i.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // oz.InterfaceC5781d
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo11315c() {
        /*
            r5 = this;
            qz.x r0 = r5.f30873d
            r1 = 0
            if (r0 == 0) goto L21
            monitor-enter(r0)
            qz.v r2 = r0.f30904h     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.f30891b     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            b00.k r2 = r2.f30893d     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.mo1545e()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = r4
            goto L1a
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r2 = r1
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L1e
            return r4
        L1e:
            return r1
        L1f:
            monitor-exit(r0)
            throw r1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C6399q.mo11315c():boolean");
    }

    @Override // oz.InterfaceC5781d
    public final void cancel() {
        this.f30875f = true;
        C6406x c6406x = this.f30873d;
        if (c6406x != null) {
            c6406x.m12406e(EnumC6384b.CANCEL);
        }
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: d */
    public final h0 mo11316d(x0 request, long j6) {
        AbstractC4154l.m8923f(request, "request");
        C6406x c6406x = this.f30873d;
        AbstractC4154l.m8920c(c6406x);
        return c6406x.f30905i;
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: e */
    public final i0 mo11317e(k0 k0Var) {
        C6406x c6406x = this.f30873d;
        AbstractC4154l.m8920c(c6406x);
        return c6406x.f30904h;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // oz.InterfaceC5781d
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final iz.j0 mo11318f(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C6399q.mo11318f(boolean):iz.j0");
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: g */
    public final void mo11319g() {
        this.f30872c.flush();
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: h */
    public final InterfaceC5780c mo11320h() {
        return this.f30870a;
    }

    @Override // oz.InterfaceC5781d
    /* renamed from: i */
    public final void mo11321i(x0 request) throws IOException {
        int i10;
        C6406x c6406x;
        boolean z6;
        AbstractC4154l.m8923f(request, "request");
        if (this.f30873d != null) {
            return;
        }
        boolean z10 = ((iz.i0) request.f36757e) != null;
        C3389v c3389v = (C3389v) request.f36756d;
        ArrayList arrayList = new ArrayList(c3389v.size() + 4);
        arrayList.add(new C6386d(C6386d.f30796f, (String) request.f36755c));
        C0529n c0529n = C6386d.f30797g;
        C3391x url = (C3391x) request.f36754b;
        AbstractC4154l.m8923f(url, "url");
        String strM7797b = url.m7797b();
        String strM7799d = url.m7799d();
        if (strM7799d != null) {
            strM7797b = AbstractC0030c.m115f('?', strM7797b, strM7799d);
        }
        arrayList.add(new C6386d(c0529n, strM7797b));
        String strM7787b = ((C3389v) request.f36756d).m7787b("Host");
        if (strM7787b != null) {
            arrayList.add(new C6386d(C6386d.f30799i, strM7787b));
        }
        arrayList.add(new C6386d(C6386d.f30798h, url.f17991a));
        int size = c3389v.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strM7788h = c3389v.m7788h(i11);
            Locale US = Locale.US;
            AbstractC4154l.m8922e(US, "US");
            String lowerCase = strM7788h.toLowerCase(US);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            if (!f30868g.contains(lowerCase) || (lowerCase.equals("te") && c3389v.m7790q(i11).equals("trailers"))) {
                arrayList.add(new C6386d(lowerCase, c3389v.m7790q(i11)));
            }
        }
        C6398p c6398p = this.f30872c;
        c6398p.getClass();
        boolean z11 = !z10;
        synchronized (c6398p.f30842B) {
            synchronized (c6398p) {
                try {
                    if (c6398p.f30849e > 1073741823) {
                        c6398p.m12391u(EnumC6384b.REFUSED_STREAM);
                    }
                    if (c6398p.f30850f) {
                        throw new ConnectionShutdownException();
                    }
                    i10 = c6398p.f30849e;
                    c6398p.f30849e = i10 + 2;
                    c6406x = new C6406x(i10, c6398p, z11, false, null);
                    z6 = !z10 || c6398p.f30865x >= c6398p.f30866y || c6406x.f30900d >= c6406x.f30901e;
                    if (c6406x.m12409h()) {
                        c6398p.f30846b.put(Integer.valueOf(i10), c6406x);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c6398p.f30842B.m12417w(z11, i10, arrayList);
        }
        if (z6) {
            c6398p.f30842B.flush();
        }
        this.f30873d = c6406x;
        if (this.f30875f) {
            C6406x c6406x2 = this.f30873d;
            AbstractC4154l.m8920c(c6406x2);
            c6406x2.m12406e(EnumC6384b.CANCEL);
            throw new IOException("Canceled");
        }
        C6406x c6406x3 = this.f30873d;
        AbstractC4154l.m8920c(c6406x3);
        C6405w c6405w = c6406x3.f30906j;
        long j6 = this.f30871b.f28353d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6405w.mo1585g(j6);
        C6406x c6406x4 = this.f30873d;
        AbstractC4154l.m8920c(c6406x4);
        c6406x4.f30907k.mo1585g(this.f30871b.f28354e);
    }
}
