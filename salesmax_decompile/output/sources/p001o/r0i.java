package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class r0i extends rhd {

    /* renamed from: a */
    public long[] f42671a;

    /* renamed from: b */
    public int f42672b;

    public /* synthetic */ r0i(long[] jArr, id5 id5Var) {
        this(jArr);
    }

    @Override // p001o.rhd
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo17041a() {
        return q0i.m44634d(m46017f());
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        if (q0i.m44641y(this.f42671a) < i) {
            long[] jArr = this.f42671a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, bce.m18601d(i, q0i.m44641y(jArr) * 2));
            sq8.m48648g(jArrCopyOf, "copyOf(...)");
            this.f42671a = q0i.m44636j(jArrCopyOf);
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f42672b;
    }

    /* renamed from: e */
    public final void m46016e(long j) {
        rhd.m46778c(this, 0, 1, null);
        long[] jArr = this.f42671a;
        int iMo17043d = mo17043d();
        this.f42672b = iMo17043d + 1;
        q0i.m44632G(jArr, iMo17043d, j);
    }

    /* renamed from: f */
    public long[] m46017f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f42671a, mo17043d());
        sq8.m48648g(jArrCopyOf, "copyOf(...)");
        return q0i.m44636j(jArrCopyOf);
    }

    public r0i(long[] jArr) {
        sq8.m48649h(jArr, "bufferWithData");
        this.f42671a = jArr;
        this.f42672b = q0i.m44641y(jArr);
        mo17042b(10);
    }
}
