package p001o;

import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.asm.Opcodes;
import p001o.c18;

/* loaded from: classes6.dex */
public final class k18 implements Closeable {

    /* renamed from: g */
    public static final C14701a f31363g = new C14701a(null);

    /* renamed from: h */
    public static final Logger f31364h = Logger.getLogger(f18.class.getName());

    /* renamed from: a */
    public final gm1 f31365a;

    /* renamed from: b */
    public final boolean f31366b;

    /* renamed from: c */
    public final rl1 f31367c;

    /* renamed from: d */
    public int f31368d;

    /* renamed from: e */
    public boolean f31369e;

    /* renamed from: f */
    public final c18.C12532b f31370f;

    /* renamed from: o.k18$a */
    public static final class C14701a {
        public C14701a() {
        }

        public /* synthetic */ C14701a(id5 id5Var) {
            this();
        }
    }

    public k18(gm1 gm1Var, boolean z) {
        sq8.m48649h(gm1Var, "sink");
        this.f31365a = gm1Var;
        this.f31366b = z;
        rl1 rl1Var = new rl1();
        this.f31367c = rl1Var;
        this.f31368d = Opcodes.ACC_ENUM;
        this.f31370f = new c18.C12532b(0, false, rl1Var, 3, null);
    }

    /* renamed from: C */
    public final synchronized void m34902C(int i, long j) {
        if (this.f31369e) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        Logger logger = f31364h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(f18.f22532a.m25937d(false, i, 4, j));
        }
        m34908g(i, 4, 8, 0);
        this.f31365a.mo29023I((int) j);
        this.f31365a.flush();
    }

    /* renamed from: D */
    public final void m34903D(int i, long j) {
        while (j > 0) {
            long jMin = Math.min(this.f31368d, j);
            j -= jMin;
            m34908g(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.f31365a.M0(this.f31367c, jMin);
        }
    }

    /* renamed from: a */
    public final synchronized void m34904a(tif tifVar) {
        sq8.m48649h(tifVar, "peerSettings");
        if (this.f31369e) {
            throw new IOException("closed");
        }
        this.f31368d = tifVar.m49943e(this.f31368d);
        if (tifVar.m49940b() != -1) {
            this.f31370f.m20063e(tifVar.m49940b());
        }
        m34908g(0, 0, 4, 1);
        this.f31365a.flush();
    }

    /* renamed from: c */
    public final synchronized void m34905c() {
        if (this.f31369e) {
            throw new IOException("closed");
        }
        if (this.f31366b) {
            Logger logger = f31364h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(jgj.m33815i(">> CONNECTION " + f18.f22533b.mo38697s(), new Object[0]));
            }
            this.f31365a.M2(f18.f22533b);
            this.f31365a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f31369e = true;
        this.f31365a.close();
    }

    /* renamed from: d */
    public final synchronized void m34906d(boolean z, int i, rl1 rl1Var, int i2) {
        if (this.f31369e) {
            throw new IOException("closed");
        }
        m34907f(i, z ? 1 : 0, rl1Var, i2);
    }

    /* renamed from: f */
    public final void m34907f(int i, int i2, rl1 rl1Var, int i3) {
        m34908g(i, i3, 0, i2);
        if (i3 > 0) {
            gm1 gm1Var = this.f31365a;
            sq8.m48646e(rl1Var);
            gm1Var.M0(rl1Var, i3);
        }
    }

    public final synchronized void flush() {
        if (this.f31369e) {
            throw new IOException("closed");
        }
        this.f31365a.flush();
    }

    /* renamed from: g */
    public final void m34908g(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Logger logger = f31364h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f18.f22532a.m25936c(false, i, i2, i3, i4));
            }
        }
        if (!(i2 <= this.f31368d)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f31368d + ": " + i2).toString());
        }
        if (!((Integer.MIN_VALUE & i) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        ggj.m28620I(this.f31365a, i2);
        this.f31365a.T1(i3 & Constants.MAX_HOST_LENGTH);
        this.f31365a.T1(i4 & Constants.MAX_HOST_LENGTH);
        this.f31365a.mo29023I(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: h */
    public final synchronized void m34909h(int i, fj6 fj6Var, byte[] bArr) {
        sq8.m48649h(fj6Var, "errorCode");
        sq8.m48649h(bArr, "debugData");
        if (this.f31369e) {
            throw new IOException("closed");
        }
        if (!(fj6Var.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        m34908g(0, bArr.length + 8, 7, 0);
        this.f31365a.mo29023I(i);
        this.f31365a.mo29023I(fj6Var.getHttpCode());
        if (!(bArr.length == 0)) {
            this.f31365a.write(bArr);
        }
        this.f31365a.flush();
    }

    /* renamed from: k */
    public final synchronized void m34910k(boolean z, int i, List list) {
        sq8.m48649h(list, "headerBlock");
        if (this.f31369e) {
            throw new IOException("closed");
        }
        this.f31370f.m20065g(list);
        long jF0 = this.f31367c.f0();
        long jMin = Math.min(this.f31368d, jF0);
        int i2 = jF0 == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m34908g(i, (int) jMin, 1, i2);
        this.f31365a.M0(this.f31367c, jMin);
        if (jF0 > jMin) {
            m34903D(i, jF0 - jMin);
        }
    }

    /* renamed from: o */
    public final int m34911o() {
        return this.f31368d;
    }

    /* renamed from: r */
    public final synchronized void m34912r(boolean z, int i, int i2) {
        if (this.f31369e) {
            throw new IOException("closed");
        }
        m34908g(0, 8, 6, z ? 1 : 0);
        this.f31365a.mo29023I(i);
        this.f31365a.mo29023I(i2);
        this.f31365a.flush();
    }

    /* renamed from: s */
    public final synchronized void m34913s(int i, int i2, List list) {
        sq8.m48649h(list, "requestHeaders");
        if (this.f31369e) {
            throw new IOException("closed");
        }
        this.f31370f.m20065g(list);
        long jF0 = this.f31367c.f0();
        int iMin = (int) Math.min(this.f31368d - 4, jF0);
        long j = iMin;
        m34908g(i, iMin + 4, 5, jF0 == j ? 4 : 0);
        this.f31365a.mo29023I(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f31365a.M0(this.f31367c, j);
        if (jF0 > j) {
            m34903D(i, jF0 - j);
        }
    }

    /* renamed from: t */
    public final synchronized void m34914t(int i, fj6 fj6Var) {
        sq8.m48649h(fj6Var, "errorCode");
        if (this.f31369e) {
            throw new IOException("closed");
        }
        if (!(fj6Var.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        m34908g(i, 4, 3, 0);
        this.f31365a.mo29023I(fj6Var.getHttpCode());
        this.f31365a.flush();
    }

    /* renamed from: u */
    public final synchronized void m34915u(tif tifVar) {
        sq8.m48649h(tifVar, "settings");
        if (this.f31369e) {
            throw new IOException("closed");
        }
        int i = 0;
        m34908g(0, tifVar.m49947i() * 6, 4, 0);
        while (i < 10) {
            if (tifVar.m49944f(i)) {
                this.f31365a.E1(i != 4 ? i != 7 ? i : 4 : 3);
                this.f31365a.mo29023I(tifVar.m49939a(i));
            }
            i++;
        }
        this.f31365a.flush();
    }
}
