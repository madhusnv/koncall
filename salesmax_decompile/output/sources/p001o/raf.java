package p001o;

import p001o.hyh;

/* loaded from: classes2.dex */
public final class raf implements hyh {

    /* renamed from: a */
    public final qaf f43324a;

    /* renamed from: b */
    public final zwc f43325b = new zwc(32);

    /* renamed from: c */
    public int f43326c;

    /* renamed from: d */
    public int f43327d;

    /* renamed from: e */
    public boolean f43328e;

    /* renamed from: f */
    public boolean f43329f;

    public raf(qaf qafVar) {
        this.f43324a = qafVar;
    }

    @Override // p001o.hyh
    /* renamed from: a */
    public void mo31288a(zwc zwcVar, int i) {
        boolean z = (i & 1) != 0;
        int iM60025f = z ? zwcVar.m60025f() + zwcVar.m60004H() : -1;
        if (this.f43329f) {
            if (!z) {
                return;
            }
            this.f43329f = false;
            zwcVar.m60017U(iM60025f);
            this.f43327d = 0;
        }
        while (zwcVar.m60020a() > 0) {
            int i2 = this.f43327d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM60004H = zwcVar.m60004H();
                    zwcVar.m60017U(zwcVar.m60025f() - 1);
                    if (iM60004H == 255) {
                        this.f43329f = true;
                        return;
                    }
                }
                int iMin = Math.min(zwcVar.m60020a(), 3 - this.f43327d);
                zwcVar.m60031l(this.f43325b.m60024e(), this.f43327d, iMin);
                int i3 = this.f43327d + iMin;
                this.f43327d = i3;
                if (i3 == 3) {
                    this.f43325b.m60017U(0);
                    this.f43325b.m60016T(3);
                    this.f43325b.m60018V(1);
                    int iM60004H2 = this.f43325b.m60004H();
                    int iM60004H3 = this.f43325b.m60004H();
                    this.f43328e = (iM60004H2 & 128) != 0;
                    this.f43326c = (((iM60004H2 & 15) << 8) | iM60004H3) + 3;
                    int iM60021b = this.f43325b.m60021b();
                    int i4 = this.f43326c;
                    if (iM60021b < i4) {
                        this.f43325b.m60022c(Math.min(4098, Math.max(i4, this.f43325b.m60021b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zwcVar.m60020a(), this.f43326c - this.f43327d);
                zwcVar.m60031l(this.f43325b.m60024e(), this.f43327d, iMin2);
                int i5 = this.f43327d + iMin2;
                this.f43327d = i5;
                int i6 = this.f43326c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f43328e) {
                        this.f43325b.m60016T(i6);
                    } else {
                        if (sqi.m48744w(this.f43325b.m60024e(), 0, this.f43326c, -1) != 0) {
                            this.f43329f = true;
                            return;
                        }
                        this.f43325b.m60016T(this.f43326c - 4);
                    }
                    this.f43325b.m60017U(0);
                    this.f43324a.mo29669a(this.f43325b);
                    this.f43327d = 0;
                }
            }
        }
    }

    @Override // p001o.hyh
    /* renamed from: b */
    public void mo31289b() {
        this.f43329f = true;
    }

    @Override // p001o.hyh
    /* renamed from: c */
    public void mo31290c(umh umhVar, vq6 vq6Var, hyh.C14129d c14129d) {
        this.f43324a.mo29670c(umhVar, vq6Var, c14129d);
        this.f43329f = true;
    }
}
