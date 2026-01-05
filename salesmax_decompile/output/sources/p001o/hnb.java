package p001o;

import androidx.media3.common.C2181a;
import p001o.hyh;
import p001o.inb;

/* loaded from: classes2.dex */
public final class hnb implements n46 {

    /* renamed from: a */
    public final zwc f27208a;

    /* renamed from: b */
    public final inb.C14334a f27209b;

    /* renamed from: c */
    public final String f27210c;

    /* renamed from: d */
    public final int f27211d;

    /* renamed from: e */
    public uth f27212e;

    /* renamed from: f */
    public String f27213f;

    /* renamed from: g */
    public int f27214g;

    /* renamed from: h */
    public int f27215h;

    /* renamed from: i */
    public boolean f27216i;

    /* renamed from: j */
    public boolean f27217j;

    /* renamed from: k */
    public long f27218k;

    /* renamed from: l */
    public int f27219l;

    /* renamed from: m */
    public long f27220m;

    public hnb() {
        this(null, 0);
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        op0.m42519i(this.f27212e);
        while (zwcVar.m60020a() > 0) {
            int i = this.f27214g;
            if (i == 0) {
                m30850f(zwcVar);
            } else if (i == 1) {
                m30852h(zwcVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                m30851g(zwcVar);
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f27214g = 0;
        this.f27215h = 0;
        this.f27217j = false;
        this.f27220m = -9223372036854775807L;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f27213f = c14129d.m31295b();
        this.f27212e = vq6Var.mo32487f(c14129d.m31296c(), 1);
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f27220m = j;
    }

    /* renamed from: f */
    public final void m30850f(zwc zwcVar) {
        byte[] bArrM60024e = zwcVar.m60024e();
        int iM60026g = zwcVar.m60026g();
        for (int iM60025f = zwcVar.m60025f(); iM60025f < iM60026g; iM60025f++) {
            byte b = bArrM60024e[iM60025f];
            boolean z = (b & 255) == 255;
            boolean z2 = this.f27217j && (b & 224) == 224;
            this.f27217j = z;
            if (z2) {
                zwcVar.m60017U(iM60025f + 1);
                this.f27217j = false;
                this.f27208a.m60024e()[1] = bArrM60024e[iM60025f];
                this.f27215h = 2;
                this.f27214g = 1;
                return;
            }
        }
        zwcVar.m60017U(iM60026g);
    }

    /* renamed from: g */
    public final void m30851g(zwc zwcVar) {
        int iMin = Math.min(zwcVar.m60020a(), this.f27219l - this.f27215h);
        this.f27212e.m52027e(zwcVar, iMin);
        int i = this.f27215h + iMin;
        this.f27215h = i;
        if (i < this.f27219l) {
            return;
        }
        op0.m42517g(this.f27220m != -9223372036854775807L);
        this.f27212e.mo7071a(this.f27220m, 1, this.f27219l, 0, null);
        this.f27220m += this.f27218k;
        this.f27215h = 0;
        this.f27214g = 0;
    }

    /* renamed from: h */
    public final void m30852h(zwc zwcVar) {
        int iMin = Math.min(zwcVar.m60020a(), 4 - this.f27215h);
        zwcVar.m60031l(this.f27208a.m60024e(), this.f27215h, iMin);
        int i = this.f27215h + iMin;
        this.f27215h = i;
        if (i < 4) {
            return;
        }
        this.f27208a.m60017U(0);
        if (!this.f27209b.m32454a(this.f27208a.m60036q())) {
            this.f27215h = 0;
            this.f27214g = 1;
            return;
        }
        this.f27219l = this.f27209b.f28965c;
        if (!this.f27216i) {
            this.f27218k = (r8.f28969g * 1000000) / r8.f28966d;
            this.f27212e.mo7072b(new C2181a.b().a0(this.f27213f).o0(this.f27209b.f28964b).f0(4096).m6751N(this.f27209b.f28967e).p0(this.f27209b.f28966d).e0(this.f27210c).m0(this.f27211d).m6748K());
            this.f27216i = true;
        }
        this.f27208a.m60017U(0);
        this.f27212e.m52027e(this.f27208a, 4);
        this.f27214g = 2;
    }

    public hnb(String str, int i) {
        this.f27214g = 0;
        zwc zwcVar = new zwc(4);
        this.f27208a = zwcVar;
        zwcVar.m60024e()[0] = -1;
        this.f27209b = new inb.C14334a();
        this.f27220m = -9223372036854775807L;
        this.f27210c = str;
        this.f27211d = i;
    }
}
