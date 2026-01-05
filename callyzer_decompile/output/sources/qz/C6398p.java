package qz;

import aw.C0471k;
import b00.InterfaceC0527l;
import b00.InterfaceC0528m;
import bt.w0;
import ex.InterfaceC2137a;
import iz.C3390w;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import kz.AbstractC4299e;
import mz.C4918b;
import mz.C4919c;
import mz.C4920d;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import rz.C6691a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.p */
/* loaded from: classes3.dex */
public final class C6398p implements Closeable {

    /* renamed from: E */
    public static final b0 f30841E;

    /* renamed from: B */
    public final C6407y f30842B;

    /* renamed from: C */
    public final C0471k f30843C;

    /* renamed from: D */
    public final LinkedHashSet f30844D;

    /* renamed from: a */
    public final AbstractC6396n f30845a;

    /* renamed from: b */
    public final LinkedHashMap f30846b = new LinkedHashMap();

    /* renamed from: c */
    public final String f30847c;

    /* renamed from: d */
    public int f30848d;

    /* renamed from: e */
    public int f30849e;

    /* renamed from: f */
    public boolean f30850f;

    /* renamed from: g */
    public final C4920d f30851g;

    /* renamed from: h */
    public final C4919c f30852h;

    /* renamed from: j */
    public final C4919c f30853j;

    /* renamed from: k */
    public final C4919c f30854k;

    /* renamed from: l */
    public final a0 f30855l;

    /* renamed from: m */
    public long f30856m;

    /* renamed from: n */
    public long f30857n;

    /* renamed from: p */
    public long f30858p;

    /* renamed from: q */
    public long f30859q;

    /* renamed from: r */
    public long f30860r;

    /* renamed from: s */
    public final C6385c f30861s;

    /* renamed from: t */
    public final b0 f30862t;

    /* renamed from: v */
    public b0 f30863v;

    /* renamed from: w */
    public final C6691a f30864w;

    /* renamed from: x */
    public long f30865x;

    /* renamed from: y */
    public long f30866y;

    /* renamed from: z */
    public final Socket f30867z;

    static {
        b0 b0Var = new b0();
        b0Var.m12371c(4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        b0Var.m12371c(5, 16384);
        f30841E = b0Var;
    }

    public C6398p(C3390w c3390w) {
        this.f30845a = (AbstractC6396n) c3390w.f17989h;
        String str = c3390w.f17983b;
        if (str == null) {
            AbstractC4154l.m8928k("connectionName");
            throw null;
        }
        this.f30847c = str;
        this.f30849e = 3;
        C4920d c4920d = (C4920d) c3390w.f17985d;
        this.f30851g = c4920d;
        C4919c c4919cM9824d = c4920d.m9824d();
        this.f30852h = c4919cM9824d;
        this.f30853j = c4920d.m9824d();
        this.f30854k = c4920d.m9824d();
        this.f30855l = a0.f30790a;
        this.f30861s = (C6385c) c3390w.f17990i;
        b0 b0Var = new b0();
        b0Var.m12371c(4, 16777216);
        this.f30862t = b0Var;
        this.f30863v = f30841E;
        this.f30864w = new C6691a(0);
        this.f30866y = r2.m12369a();
        Socket socket = (Socket) c3390w.f17986e;
        if (socket == null) {
            AbstractC4154l.m8928k("socket");
            throw null;
        }
        this.f30867z = socket;
        InterfaceC0527l interfaceC0527l = (InterfaceC0527l) c3390w.f17988g;
        if (interfaceC0527l == null) {
            AbstractC4154l.m8928k("sink");
            throw null;
        }
        this.f30842B = new C6407y(interfaceC0527l);
        InterfaceC0528m interfaceC0528m = (InterfaceC0528m) c3390w.f17987f;
        if (interfaceC0528m == null) {
            AbstractC4154l.m8928k("source");
            throw null;
        }
        this.f30843C = new C0471k(this, new C6402t(interfaceC0528m));
        this.f30844D = new LinkedHashSet();
        int i10 = c3390w.f17984c;
        if (i10 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            String name = str.concat(" ping");
            C6391i c6391i = new C6391i(this, nanos, 0);
            AbstractC4154l.m8923f(name, "name");
            c4919cM9824d.m9818d(new C4918b(1, c6391i, name), nanos);
        }
    }

    /* renamed from: A */
    public final void m12386A(int i10, EnumC6384b errorCode) {
        AbstractC4154l.m8923f(errorCode, "errorCode");
        C4919c.m9815c(this.f30852h, this.f30847c + '[' + i10 + "] writeSynReset", new w0(this, i10, errorCode, 5));
    }

    /* renamed from: H */
    public final void m12387H(final int i10, final long j6) {
        C4919c.m9815c(this.f30852h, this.f30847c + '[' + i10 + "] windowUpdate", new InterfaceC2137a() { // from class: qz.j
            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                C6398p c6398p = this.f30827a;
                try {
                    c6398p.f30842B.m12412H(i10, j6);
                } catch (IOException e2) {
                    EnumC6384b enumC6384b = EnumC6384b.PROTOCOL_ERROR;
                    c6398p.m12388h(enumC6384b, enumC6384b, e2);
                }
                return qw.a0.f30746a;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m12388h(EnumC6384b.NO_ERROR, EnumC6384b.CANCEL, null);
    }

    public final void flush() {
        this.f30842B.flush();
    }

    /* renamed from: h */
    public final void m12388h(EnumC6384b connectionCode, EnumC6384b streamCode, IOException iOException) {
        int i10;
        Object[] array;
        AbstractC4154l.m8923f(connectionCode, "connectionCode");
        AbstractC4154l.m8923f(streamCode, "streamCode");
        TimeZone timeZone = AbstractC4299e.f21707a;
        try {
            m12391u(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f30846b.isEmpty()) {
                array = null;
            } else {
                array = this.f30846b.values().toArray(new C6406x[0]);
                this.f30846b.clear();
            }
        }
        C6406x[] c6406xArr = (C6406x[]) array;
        if (c6406xArr != null) {
            for (C6406x c6406x : c6406xArr) {
                try {
                    c6406x.m12404c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f30842B.close();
        } catch (IOException unused3) {
        }
        try {
            this.f30867z.close();
        } catch (IOException unused4) {
        }
        this.f30852h.m9820f();
        this.f30853j.m9820f();
        this.f30854k.m9820f();
    }

    /* renamed from: j */
    public final C6406x m12389j(int i10) {
        C6406x c6406x;
        synchronized (this) {
            c6406x = (C6406x) this.f30846b.get(Integer.valueOf(i10));
        }
        return c6406x;
    }

    /* renamed from: n */
    public final C6406x m12390n(int i10) {
        C6406x c6406x;
        synchronized (this) {
            c6406x = (C6406x) this.f30846b.remove(Integer.valueOf(i10));
            notifyAll();
        }
        return c6406x;
    }

    /* renamed from: u */
    public final void m12391u(EnumC6384b statusCode) {
        AbstractC4154l.m8923f(statusCode, "statusCode");
        synchronized (this.f30842B) {
            synchronized (this) {
                if (this.f30850f) {
                    return;
                }
                this.f30850f = true;
                this.f30842B.m12416u(this.f30848d, statusCode, AbstractC4297c.f21703a);
            }
        }
    }

    /* renamed from: w */
    public final void m12392w(long j6) {
        synchronized (this) {
            try {
                C6691a.m12828b(this.f30864w, j6, 0L, 2);
                long jM12829a = this.f30864w.m12829a();
                if (jM12829a >= this.f30862t.m12369a() / 2) {
                    m12387H(0, jM12829a);
                    C6691a.m12828b(this.f30864w, 0L, jM12829a, 1);
                }
                C6385c c6385c = this.f30861s;
                C6691a windowCounter = this.f30864w;
                c6385c.getClass();
                AbstractC4154l.m8923f(windowCounter, "windowCounter");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f30842B.f30913c);
        r6 = r2;
        r8.f30865x += r6;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12393z(int r9, boolean r10, b00.C0526k r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            qz.y r12 = r8.f30842B
            r12.m12414j(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f30865x     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f30866y     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f30846b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            qz.y r4 = r8.f30842B     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f30913c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f30865x     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f30865x = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            qz.y r4 = r8.f30842B
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m12414j(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C6398p.m12393z(int, boolean, b00.k, long):void");
    }
}
