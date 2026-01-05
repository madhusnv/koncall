package p001o;

import android.content.Context;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class jui {

    /* renamed from: a */
    public final InterfaceC14668b f31119a;

    /* renamed from: b */
    public final lui f31120b;

    /* renamed from: c */
    public final long f31121c;

    /* renamed from: d */
    public boolean f31122d;

    /* renamed from: g */
    public long f31125g;

    /* renamed from: j */
    public boolean f31128j;

    /* renamed from: e */
    public int f31123e = 0;

    /* renamed from: f */
    public long f31124f = -9223372036854775807L;

    /* renamed from: h */
    public long f31126h = -9223372036854775807L;

    /* renamed from: i */
    public long f31127i = -9223372036854775807L;

    /* renamed from: k */
    public float f31129k = 1.0f;

    /* renamed from: l */
    public jb3 f31130l = jb3.f30077a;

    /* renamed from: o.jui$a */
    public static class C14667a {

        /* renamed from: a */
        public long f31131a = -9223372036854775807L;

        /* renamed from: b */
        public long f31132b = -9223372036854775807L;

        /* renamed from: f */
        public long m34564f() {
            return this.f31131a;
        }

        /* renamed from: g */
        public long m34565g() {
            return this.f31132b;
        }

        /* renamed from: h */
        public final void m34566h() {
            this.f31131a = -9223372036854775807L;
            this.f31132b = -9223372036854775807L;
        }
    }

    /* renamed from: o.jui$b */
    public interface InterfaceC14668b {
        /* renamed from: I */
        boolean mo34567I(long j, long j2, boolean z);

        /* renamed from: x */
        boolean mo34568x(long j, long j2);

        /* renamed from: z */
        boolean mo34569z(long j, long j2, long j3, boolean z, boolean z2);
    }

    public jui(Context context, InterfaceC14668b interfaceC14668b, long j) {
        this.f31119a = interfaceC14668b;
        this.f31121c = j;
        this.f31120b = new lui(context);
    }

    /* renamed from: a */
    public void m34540a() {
        if (this.f31123e == 0) {
            this.f31123e = 1;
        }
    }

    /* renamed from: b */
    public final long m34541b(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / this.f31129k);
        return this.f31122d ? j4 - (sqi.O0(this.f31130l.elapsedRealtime()) - j2) : j4;
    }

    /* renamed from: c */
    public int m34542c(long j, long j2, long j3, long j4, boolean z, C14667a c14667a) {
        c14667a.m34566h();
        if (this.f31124f == -9223372036854775807L) {
            this.f31124f = j2;
        }
        if (this.f31126h != j) {
            this.f31120b.m37906h(j);
            this.f31126h = j;
        }
        c14667a.f31131a = m34541b(j2, j3, j);
        boolean z2 = false;
        if (m34558s(j2, c14667a.f31131a, j4)) {
            return 0;
        }
        if (!this.f31122d || j2 == this.f31124f) {
            return 5;
        }
        long jNanoTime = this.f31130l.nanoTime();
        c14667a.f31132b = this.f31120b.m37902b((c14667a.f31131a * 1000) + jNanoTime);
        c14667a.f31131a = (c14667a.f31132b - jNanoTime) / 1000;
        if (this.f31127i != -9223372036854775807L && !this.f31128j) {
            z2 = true;
        }
        if (this.f31119a.mo34569z(c14667a.f31131a, j2, j3, z, z2)) {
            return 4;
        }
        return this.f31119a.mo34567I(c14667a.f31131a, j3, z) ? z2 ? 3 : 2 : c14667a.f31131a > 50000 ? 5 : 1;
    }

    /* renamed from: d */
    public boolean m34543d(boolean z) {
        if (z && this.f31123e == 3) {
            this.f31127i = -9223372036854775807L;
            return true;
        }
        if (this.f31127i == -9223372036854775807L) {
            return false;
        }
        if (this.f31130l.elapsedRealtime() < this.f31127i) {
            return true;
        }
        this.f31127i = -9223372036854775807L;
        return false;
    }

    /* renamed from: e */
    public void m34544e(boolean z) {
        this.f31128j = z;
        this.f31127i = this.f31121c > 0 ? this.f31130l.elapsedRealtime() + this.f31121c : -9223372036854775807L;
    }

    /* renamed from: f */
    public final void m34545f(int i) {
        this.f31123e = Math.min(this.f31123e, i);
    }

    /* renamed from: g */
    public void m34546g() {
        m34545f(0);
    }

    /* renamed from: h */
    public void m34547h(boolean z) {
        this.f31123e = z ? 1 : 0;
    }

    /* renamed from: i */
    public boolean m34548i() {
        boolean z = this.f31123e != 3;
        this.f31123e = 3;
        this.f31125g = sqi.O0(this.f31130l.elapsedRealtime());
        return z;
    }

    /* renamed from: j */
    public void m34549j() {
        m34545f(2);
    }

    /* renamed from: k */
    public void m34550k() {
        this.f31122d = true;
        this.f31125g = sqi.O0(this.f31130l.elapsedRealtime());
        this.f31120b.m37909k();
    }

    /* renamed from: l */
    public void m34551l() {
        this.f31122d = false;
        this.f31127i = -9223372036854775807L;
        this.f31120b.m37910l();
    }

    /* renamed from: m */
    public void m34552m() {
        this.f31120b.m37908j();
        this.f31126h = -9223372036854775807L;
        this.f31124f = -9223372036854775807L;
        m34545f(1);
        this.f31127i = -9223372036854775807L;
    }

    /* renamed from: n */
    public void m34553n(int i) {
        this.f31120b.m37913o(i);
    }

    /* renamed from: o */
    public void m34554o(jb3 jb3Var) {
        this.f31130l = jb3Var;
    }

    /* renamed from: p */
    public void m34555p(float f) {
        this.f31120b.m37905g(f);
    }

    /* renamed from: q */
    public void m34556q(Surface surface) {
        this.f31120b.m37911m(surface);
        m34545f(1);
    }

    /* renamed from: r */
    public void m34557r(float f) {
        if (f == this.f31129k) {
            return;
        }
        this.f31129k = f;
        this.f31120b.m37907i(f);
    }

    /* renamed from: s */
    public final boolean m34558s(long j, long j2, long j3) {
        if (this.f31127i != -9223372036854775807L && !this.f31128j) {
            return false;
        }
        int i = this.f31123e;
        if (i == 0) {
            return this.f31122d;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i == 3) {
            return this.f31122d && this.f31119a.mo34568x(j2, sqi.O0(this.f31130l.elapsedRealtime()) - this.f31125g);
        }
        throw new IllegalStateException();
    }
}
