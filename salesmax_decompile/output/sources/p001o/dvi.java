package p001o;

import androidx.media3.common.C2181a;
import p001o.zig;

/* loaded from: classes2.dex */
public final class dvi extends zig {

    /* renamed from: b */
    public final zwc f20582b;

    /* renamed from: c */
    public final zwc f20583c;

    /* renamed from: d */
    public int f20584d;

    /* renamed from: e */
    public boolean f20585e;

    /* renamed from: f */
    public boolean f20586f;

    /* renamed from: g */
    public int f20587g;

    public dvi(uth uthVar) {
        super(uthVar);
        this.f20582b = new zwc(irb.f29113a);
        this.f20583c = new zwc(4);
    }

    @Override // p001o.zig
    /* renamed from: b */
    public boolean mo23894b(zwc zwcVar) throws zig.C18653a {
        int iM60004H = zwcVar.m60004H();
        int i = (iM60004H >> 4) & 15;
        int i2 = iM60004H & 15;
        if (i2 == 7) {
            this.f20587g = i;
            return i != 5;
        }
        throw new zig.C18653a("Video format not supported: " + i2);
    }

    @Override // p001o.zig
    /* renamed from: c */
    public boolean mo23895c(zwc zwcVar, long j) throws byc {
        int iM60004H = zwcVar.m60004H();
        long jM60037r = j + (zwcVar.m60037r() * 1000);
        if (iM60004H == 0 && !this.f20585e) {
            zwc zwcVar2 = new zwc(new byte[zwcVar.m60020a()]);
            zwcVar.m60031l(zwcVar2.m60024e(), 0, zwcVar.m60020a());
            w61 w61VarM54001b = w61.m54001b(zwcVar2);
            this.f20584d = w61VarM54001b.f51524b;
            this.f57261a.mo7072b(new C2181a.b().o0("video/avc").m6752O(w61VarM54001b.f51534l).v0(w61VarM54001b.f51525c).m6762Y(w61VarM54001b.f51526d).k0(w61VarM54001b.f51533k).b0(w61VarM54001b.f51523a).m6748K());
            this.f20585e = true;
            return false;
        }
        if (iM60004H != 1 || !this.f20585e) {
            return false;
        }
        int i = this.f20587g == 1 ? 1 : 0;
        if (!this.f20586f && i == 0) {
            return false;
        }
        byte[] bArrM60024e = this.f20583c.m60024e();
        bArrM60024e[0] = 0;
        bArrM60024e[1] = 0;
        bArrM60024e[2] = 0;
        int i2 = 4 - this.f20584d;
        int i3 = 0;
        while (zwcVar.m60020a() > 0) {
            zwcVar.m60031l(this.f20583c.m60024e(), i2, this.f20584d);
            this.f20583c.m60017U(0);
            int iM60008L = this.f20583c.m60008L();
            this.f20582b.m60017U(0);
            this.f57261a.m52027e(this.f20582b, 4);
            this.f57261a.m52027e(zwcVar, iM60008L);
            i3 = i3 + 4 + iM60008L;
        }
        this.f57261a.mo7071a(jM60037r, i, i3, 0, null);
        this.f20586f = true;
        return true;
    }
}
