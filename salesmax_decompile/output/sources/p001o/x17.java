package p001o;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class x17 extends tf7 {

    /* renamed from: b */
    public final long f53057b;

    /* renamed from: c */
    public final boolean f53058c;

    /* renamed from: d */
    public long f53059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x17(lzf lzfVar, long j, boolean z) {
        super(lzfVar);
        sq8.m48649h(lzfVar, "delegate");
        this.f53057b = j;
        this.f53058c = z;
    }

    @Override // p001o.tf7, p001o.lzf
    public long N0(rl1 rl1Var, long j) throws IOException {
        sq8.m48649h(rl1Var, "sink");
        long j2 = this.f53059d;
        long j3 = this.f53057b;
        if (j2 > j3) {
            j = 0;
        } else if (this.f53058c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jN0 = super.N0(rl1Var, j);
        if (jN0 != -1) {
            this.f53059d += jN0;
        }
        long j5 = this.f53059d;
        long j6 = this.f53057b;
        if ((j5 >= j6 || jN0 != -1) && j5 <= j6) {
            return jN0;
        }
        if (jN0 > 0 && j5 > j6) {
            m55550c(rl1Var, rl1Var.f0() - (this.f53059d - this.f53057b));
        }
        throw new IOException("expected " + this.f53057b + " bytes but got " + this.f53059d);
    }

    /* renamed from: c */
    public final void m55550c(rl1 rl1Var, long j) throws EOFException {
        rl1 rl1Var2 = new rl1();
        rl1Var2.p0(rl1Var);
        rl1Var.M0(rl1Var2, j);
        rl1Var2.clear();
    }
}
