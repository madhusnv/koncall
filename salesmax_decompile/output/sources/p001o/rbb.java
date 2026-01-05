package p001o;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.Deflater;
import p001o.rl1;

/* loaded from: classes6.dex */
public final class rbb implements Closeable {

    /* renamed from: a */
    public final boolean f43342a;

    /* renamed from: b */
    public final rl1 f43343b;

    /* renamed from: c */
    public final Deflater f43344c;

    /* renamed from: d */
    public final lk5 f43345d;

    public rbb(boolean z) {
        this.f43342a = z;
        rl1 rl1Var = new rl1();
        this.f43343b = rl1Var;
        Deflater deflater = new Deflater(-1, true);
        this.f43344c = deflater;
        this.f43345d = new lk5((dvf) rl1Var, deflater);
    }

    /* renamed from: a */
    public final void m46487a(rl1 rl1Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(rl1Var, "buffer");
        if (!(this.f43343b.f0() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f43342a) {
            this.f43344c.reset();
        }
        this.f43345d.M0(rl1Var, rl1Var.f0());
        this.f43345d.flush();
        if (m46488c(this.f43343b, sbb.f45133a)) {
            long jF0 = this.f43343b.f0() - 4;
            rl1.C16621b c16621bM46901K = rl1.m46901K(this.f43343b, null, 1, null);
            try {
                c16621bM46901K.m46923d(jF0);
                tb3.m49666a(c16621bM46901K, null);
            } finally {
            }
        } else {
            this.f43343b.T1(0);
        }
        rl1 rl1Var2 = this.f43343b;
        rl1Var.M0(rl1Var2, rl1Var2.f0());
    }

    /* renamed from: c */
    public final boolean m46488c(rl1 rl1Var, zq1 zq1Var) {
        return rl1Var.m46903D(rl1Var.f0() - zq1Var.m59694L(), zq1Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f43345d.close();
    }
}
