package p001o;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class jf5 implements bac {

    /* renamed from: a */
    public final aac f30340a;

    /* renamed from: b */
    public final long f30341b;

    /* renamed from: c */
    public final long f30342c;

    /* renamed from: d */
    public final a7g f30343d;

    /* renamed from: e */
    public int f30344e;

    /* renamed from: f */
    public long f30345f;

    /* renamed from: g */
    public long f30346g;

    /* renamed from: h */
    public long f30347h;

    /* renamed from: i */
    public long f30348i;

    /* renamed from: j */
    public long f30349j;

    /* renamed from: k */
    public long f30350k;

    /* renamed from: l */
    public long f30351l;

    /* renamed from: o.jf5$b */
    public final class C14521b implements zaf {
        public C14521b() {
        }

        @Override // p001o.zaf
        /* renamed from: e */
        public zaf.C18603a mo25530e(long j) {
            return new zaf.C18603a(new bbf(j, sqi.m48737p((jf5.this.f30341b + BigInteger.valueOf(jf5.this.f30343d.m16565c(j)).multiply(BigInteger.valueOf(jf5.this.f30342c - jf5.this.f30341b)).divide(BigInteger.valueOf(jf5.this.f30345f)).longValue()) - 30000, jf5.this.f30341b, jf5.this.f30342c - 1)));
        }

        @Override // p001o.zaf
        public long getDurationUs() {
            return jf5.this.f30343d.m16564b(jf5.this.f30345f);
        }

        @Override // p001o.zaf
        /* renamed from: h */
        public boolean mo25531h() {
            return true;
        }
    }

    public jf5(a7g a7gVar, long j, long j2, long j3, long j4, boolean z) {
        op0.m42511a(j >= 0 && j2 > j);
        this.f30343d = a7gVar;
        this.f30341b = j;
        this.f30342c = j2;
        if (j3 == j2 - j || z) {
            this.f30345f = j4;
            this.f30344e = 4;
        } else {
            this.f30344e = 0;
        }
        this.f30340a = new aac();
    }

    @Override // p001o.bac
    /* renamed from: a */
    public long mo16576a(uq6 uq6Var) throws IOException {
        int i = this.f30344e;
        if (i == 0) {
            long position = uq6Var.getPosition();
            this.f30346g = position;
            this.f30344e = 1;
            long j = this.f30342c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jM33767i = m33767i(uq6Var);
                if (jM33767i != -1) {
                    return jM33767i;
                }
                this.f30344e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m33769k(uq6Var);
            this.f30344e = 4;
            return -(this.f30350k + 2);
        }
        this.f30345f = m33768j(uq6Var);
        this.f30344e = 4;
        return this.f30346g;
    }

    @Override // p001o.bac
    /* renamed from: c */
    public void mo16578c(long j) {
        this.f30347h = sqi.m48737p(j, 0L, this.f30345f - 1);
        this.f30344e = 2;
        this.f30348i = this.f30341b;
        this.f30349j = this.f30342c;
        this.f30350k = 0L;
        this.f30351l = this.f30345f;
    }

    @Override // p001o.bac
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C14521b mo16577b() {
        if (this.f30345f != 0) {
            return new C14521b();
        }
        return null;
    }

    /* renamed from: i */
    public final long m33767i(uq6 uq6Var) throws IOException {
        if (this.f30348i == this.f30349j) {
            return -1L;
        }
        long position = uq6Var.getPosition();
        if (!this.f30340a.m16771d(uq6Var, this.f30349j)) {
            long j = this.f30348i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f30340a.m16768a(uq6Var, false);
        uq6Var.mo40490c();
        long j2 = this.f30347h;
        aac aacVar = this.f30340a;
        long j3 = aacVar.f14384c;
        long j4 = j2 - j3;
        int i = aacVar.f14389h + aacVar.f14390i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.f30349j = position;
            this.f30351l = j3;
        } else {
            this.f30348i = uq6Var.getPosition() + i;
            this.f30350k = this.f30340a.f14384c;
        }
        long j5 = this.f30349j;
        long j6 = this.f30348i;
        if (j5 - j6 < 100000) {
            this.f30349j = j6;
            return j6;
        }
        long position2 = uq6Var.getPosition() - (i * (j4 <= 0 ? 2L : 1L));
        long j7 = this.f30349j;
        long j8 = this.f30348i;
        return sqi.m48737p(position2 + ((j4 * (j7 - j8)) / (this.f30351l - this.f30350k)), j8, j7 - 1);
    }

    /* renamed from: j */
    public long m33768j(uq6 uq6Var) throws EOFException, byc {
        this.f30340a.m16769b();
        if (!this.f30340a.m16770c(uq6Var)) {
            throw new EOFException();
        }
        this.f30340a.m16768a(uq6Var, false);
        aac aacVar = this.f30340a;
        uq6Var.mo40496k(aacVar.f14389h + aacVar.f14390i);
        long j = this.f30340a.f14384c;
        while (true) {
            aac aacVar2 = this.f30340a;
            if ((aacVar2.f14383b & 4) == 4 || !aacVar2.m16770c(uq6Var) || uq6Var.getPosition() >= this.f30342c || !this.f30340a.m16768a(uq6Var, true)) {
                break;
            }
            aac aacVar3 = this.f30340a;
            if (!wq6.m54807e(uq6Var, aacVar3.f14389h + aacVar3.f14390i)) {
                break;
            }
            j = this.f30340a.f14384c;
        }
        return j;
    }

    /* renamed from: k */
    public final void m33769k(uq6 uq6Var) throws byc {
        while (true) {
            this.f30340a.m16770c(uq6Var);
            this.f30340a.m16768a(uq6Var, false);
            aac aacVar = this.f30340a;
            if (aacVar.f14384c > this.f30347h) {
                uq6Var.mo40490c();
                return;
            } else {
                uq6Var.mo40496k(aacVar.f14389h + aacVar.f14390i);
                this.f30348i = uq6Var.getPosition();
                this.f30350k = this.f30340a.f14384c;
            }
        }
    }
}
