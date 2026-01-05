package p001o;

import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import org.objectweb.asm.Opcodes;
import p001o.rl1;

/* loaded from: classes6.dex */
public final class g6j implements Closeable {

    /* renamed from: a */
    public final boolean f24657a;

    /* renamed from: b */
    public final gm1 f24658b;

    /* renamed from: c */
    public final Random f24659c;

    /* renamed from: d */
    public final boolean f24660d;

    /* renamed from: e */
    public final boolean f24661e;

    /* renamed from: f */
    public final long f24662f;

    /* renamed from: g */
    public final rl1 f24663g;

    /* renamed from: h */
    public final rl1 f24664h;

    /* renamed from: q */
    public boolean f24665q;

    /* renamed from: s */
    public rbb f24666s;

    /* renamed from: x */
    public final byte[] f24667x;

    /* renamed from: y */
    public final rl1.C16621b f24668y;

    public g6j(boolean z, gm1 gm1Var, Random random, boolean z2, boolean z3, long j) {
        sq8.m48649h(gm1Var, "sink");
        sq8.m48649h(random, "random");
        this.f24657a = z;
        this.f24658b = gm1Var;
        this.f24659c = random;
        this.f24660d = z2;
        this.f24661e = z3;
        this.f24662f = j;
        this.f24663g = new rl1();
        this.f24664h = gm1Var.getBuffer();
        this.f24667x = z ? new byte[4] : null;
        this.f24668y = z ? new rl1.C16621b() : null;
    }

    /* renamed from: a */
    public final void m28106a(int i, zq1 zq1Var) {
        zq1 zq1VarM46906O = zq1.f57498e;
        if (i != 0 || zq1Var != null) {
            if (i != 0) {
                e6j.f21070a.m24423c(i);
            }
            rl1 rl1Var = new rl1();
            rl1Var.E1(i);
            if (zq1Var != null) {
                rl1Var.M2(zq1Var);
            }
            zq1VarM46906O = rl1Var.m46906O();
        }
        try {
            m28107c(8, zq1VarM46906O);
        } finally {
            this.f24665q = true;
        }
    }

    /* renamed from: c */
    public final void m28107c(int i, zq1 zq1Var) throws IOException {
        if (this.f24665q) {
            throw new IOException("closed");
        }
        int iM59694L = zq1Var.m59694L();
        if (!(((long) iM59694L) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f24664h.T1(i | 128);
        if (this.f24657a) {
            this.f24664h.T1(iM59694L | 128);
            Random random = this.f24659c;
            byte[] bArr = this.f24667x;
            sq8.m48646e(bArr);
            random.nextBytes(bArr);
            this.f24664h.write(this.f24667x);
            if (iM59694L > 0) {
                long jF0 = this.f24664h.f0();
                this.f24664h.M2(zq1Var);
                rl1 rl1Var = this.f24664h;
                rl1.C16621b c16621b = this.f24668y;
                sq8.m48646e(c16621b);
                rl1Var.m46905J(c16621b);
                this.f24668y.m46924f(jF0);
                e6j.f21070a.m24422b(this.f24668y, this.f24667x);
                this.f24668y.close();
            }
        } else {
            this.f24664h.T1(iM59694L);
            this.f24664h.M2(zq1Var);
        }
        this.f24658b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        rbb rbbVar = this.f24666s;
        if (rbbVar != null) {
            rbbVar.close();
        }
    }

    /* renamed from: d */
    public final void m28108d(int i, zq1 zq1Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(zq1Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (this.f24665q) {
            throw new IOException("closed");
        }
        this.f24663g.M2(zq1Var);
        int i2 = i | 128;
        if (this.f24660d && zq1Var.m59694L() >= this.f24662f) {
            rbb rbbVar = this.f24666s;
            if (rbbVar == null) {
                rbbVar = new rbb(this.f24661e);
                this.f24666s = rbbVar;
            }
            rbbVar.m46487a(this.f24663g);
            i2 |= 64;
        }
        long jF0 = this.f24663g.f0();
        this.f24664h.T1(i2);
        int i3 = this.f24657a ? 128 : 0;
        if (jF0 <= 125) {
            this.f24664h.T1(((int) jF0) | i3);
        } else if (jF0 <= 65535) {
            this.f24664h.T1(i3 | 126);
            this.f24664h.E1((int) jF0);
        } else {
            this.f24664h.T1(i3 | Opcodes.LAND);
            this.f24664h.P0(jF0);
        }
        if (this.f24657a) {
            Random random = this.f24659c;
            byte[] bArr = this.f24667x;
            sq8.m48646e(bArr);
            random.nextBytes(bArr);
            this.f24664h.write(this.f24667x);
            if (jF0 > 0) {
                rl1 rl1Var = this.f24663g;
                rl1.C16621b c16621b = this.f24668y;
                sq8.m48646e(c16621b);
                rl1Var.m46905J(c16621b);
                this.f24668y.m46924f(0L);
                e6j.f21070a.m24422b(this.f24668y, this.f24667x);
                this.f24668y.close();
            }
        }
        this.f24664h.M0(this.f24663g, jF0);
        this.f24658b.mo29024b();
    }

    /* renamed from: f */
    public final void m28109f(zq1 zq1Var) {
        sq8.m48649h(zq1Var, "payload");
        m28107c(9, zq1Var);
    }

    /* renamed from: g */
    public final void m28110g(zq1 zq1Var) throws IOException {
        sq8.m48649h(zq1Var, "payload");
        m28107c(10, zq1Var);
    }
}
