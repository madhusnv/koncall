package qz;

import iz.C3389v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import okhttp3.internal.http2.StreamResetException;
import rz.C6691a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.x */
/* loaded from: classes3.dex */
public final class C6406x {

    /* renamed from: a */
    public final int f30897a;

    /* renamed from: b */
    public final C6398p f30898b;

    /* renamed from: c */
    public final C6691a f30899c;

    /* renamed from: d */
    public long f30900d;

    /* renamed from: e */
    public long f30901e;

    /* renamed from: f */
    public final ArrayDeque f30902f;

    /* renamed from: g */
    public boolean f30903g;

    /* renamed from: h */
    public final C6404v f30904h;

    /* renamed from: i */
    public final C6403u f30905i;

    /* renamed from: j */
    public final C6405w f30906j;

    /* renamed from: k */
    public final C6405w f30907k;

    /* renamed from: l */
    public EnumC6384b f30908l;

    /* renamed from: m */
    public IOException f30909m;

    public C6406x(int i10, C6398p connection, boolean z6, boolean z10, C3389v c3389v) {
        AbstractC4154l.m8923f(connection, "connection");
        this.f30897a = i10;
        this.f30898b = connection;
        this.f30899c = new C6691a(i10);
        this.f30901e = connection.f30863v.m12369a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f30902f = arrayDeque;
        this.f30904h = new C6404v(this, connection.f30862t.m12369a(), z10);
        this.f30905i = new C6403u(this, z6);
        this.f30906j = new C6405w(this);
        this.f30907k = new C6405w(this);
        if (c3389v == null) {
            if (!m12408g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m12408g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c3389v);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12402a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = kz.AbstractC4299e.f21707a
            monitor-enter(r2)
            qz.v r0 = r2.f30904h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f30891b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f30894e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            qz.u r0 = r2.f30905i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f30886a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f30888c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.m12409h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            qz.b r0 = qz.EnumC6384b.CANCEL
            r1 = 0
            r2.m12404c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            qz.p r0 = r2.f30898b
            int r1 = r2.f30897a
            r0.m12390n(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C6406x.m12402a():void");
    }

    /* renamed from: b */
    public final void m12403b() throws IOException {
        C6403u c6403u = this.f30905i;
        if (c6403u.f30888c) {
            throw new IOException("stream closed");
        }
        if (c6403u.f30886a) {
            throw new IOException("stream finished");
        }
        if (m12407f() != null) {
            IOException iOException = this.f30909m;
            if (iOException != null) {
                throw iOException;
            }
            EnumC6384b enumC6384bM12407f = m12407f();
            AbstractC4154l.m8920c(enumC6384bM12407f);
            throw new StreamResetException(enumC6384bM12407f);
        }
    }

    /* renamed from: c */
    public final void m12404c(EnumC6384b rstStatusCode, IOException iOException) {
        AbstractC4154l.m8923f(rstStatusCode, "rstStatusCode");
        if (m12405d(rstStatusCode, iOException)) {
            C6398p c6398p = this.f30898b;
            c6398p.getClass();
            c6398p.f30842B.m12411A(this.f30897a, rstStatusCode);
        }
    }

    /* renamed from: d */
    public final boolean m12405d(EnumC6384b enumC6384b, IOException iOException) {
        TimeZone timeZone = AbstractC4299e.f21707a;
        synchronized (this) {
            if (m12407f() != null) {
                return false;
            }
            this.f30908l = enumC6384b;
            this.f30909m = iOException;
            notifyAll();
            if (this.f30904h.f30891b) {
                if (this.f30905i.f30886a) {
                    return false;
                }
            }
            this.f30898b.m12390n(this.f30897a);
            return true;
        }
    }

    /* renamed from: e */
    public final void m12406e(EnumC6384b errorCode) {
        AbstractC4154l.m8923f(errorCode, "errorCode");
        if (m12405d(errorCode, null)) {
            this.f30898b.m12386A(this.f30897a, errorCode);
        }
    }

    /* renamed from: f */
    public final EnumC6384b m12407f() {
        EnumC6384b enumC6384b;
        synchronized (this) {
            enumC6384b = this.f30908l;
        }
        return enumC6384b;
    }

    /* renamed from: g */
    public final boolean m12408g() {
        boolean z6 = (this.f30897a & 1) == 1;
        this.f30898b.getClass();
        return true == z6;
    }

    /* renamed from: h */
    public final boolean m12409h() {
        synchronized (this) {
            try {
                if (m12407f() != null) {
                    return false;
                }
                C6404v c6404v = this.f30904h;
                if (c6404v.f30891b || c6404v.f30894e) {
                    C6403u c6403u = this.f30905i;
                    if (c6403u.f30886a || c6403u.f30888c) {
                        if (this.f30903g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final void m12410i(C3389v headers, boolean z6) {
        boolean zM12409h;
        AbstractC4154l.m8923f(headers, "headers");
        TimeZone timeZone = AbstractC4299e.f21707a;
        synchronized (this) {
            try {
                if (this.f30903g && headers.m7787b(":status") == null && headers.m7787b(":method") == null) {
                    this.f30904h.getClass();
                } else {
                    this.f30903g = true;
                    this.f30902f.add(headers);
                }
                if (z6) {
                    this.f30904h.f30891b = true;
                }
                zM12409h = m12409h();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zM12409h) {
            return;
        }
        this.f30898b.m12390n(this.f30897a);
    }
}
