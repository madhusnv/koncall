package p001o;

import androidx.media3.common.C2181a;

/* loaded from: classes2.dex */
public final class quf implements tq6 {

    /* renamed from: a */
    public final int f42456a;

    /* renamed from: b */
    public final int f42457b;

    /* renamed from: c */
    public final String f42458c;

    /* renamed from: d */
    public int f42459d;

    /* renamed from: e */
    public int f42460e;

    /* renamed from: f */
    public vq6 f42461f;

    /* renamed from: g */
    public uth f42462g;

    public quf(int i, int i2, String str) {
        this.f42456a = i;
        this.f42457b = i2;
        this.f42458c = str;
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        if (j == 0 || this.f42460e == 1) {
            this.f42460e = 1;
            this.f42459d = 0;
        }
    }

    /* renamed from: b */
    public final void m45860b(String str) {
        uth uthVarMo32487f = this.f42461f.mo32487f(1024, 4);
        this.f42462g = uthVarMo32487f;
        uthVarMo32487f.mo7072b(new C2181a.b().o0(str).m6748K());
        this.f42461f.mo32489p();
        this.f42461f.mo32490r(new uuf(-9223372036854775807L));
        this.f42460e = 1;
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        op0.m42517g((this.f42456a == -1 || this.f42457b == -1) ? false : true);
        zwc zwcVar = new zwc(this.f42457b);
        uq6Var.mo40498m(zwcVar.m60024e(), 0, this.f42457b);
        return zwcVar.m60010N() == this.f42456a;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f42461f = vq6Var;
        m45860b(this.f42458c);
    }

    /* renamed from: e */
    public final void m45861e(uq6 uq6Var) {
        int iM52026c = ((uth) op0.m42515e(this.f42462g)).m52026c(uq6Var, 1024, true);
        if (iM52026c != -1) {
            this.f42459d += iM52026c;
            return;
        }
        this.f42460e = 2;
        this.f42462g.mo7071a(0L, 1, this.f42459d, 0, null);
        this.f42459d = 0;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        int i = this.f42460e;
        if (i == 1) {
            m45861e(uq6Var);
            return 0;
        }
        if (i == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // p001o.tq6
    public void release() {
    }
}
