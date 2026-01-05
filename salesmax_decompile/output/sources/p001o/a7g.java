package p001o;

import androidx.media3.common.C2181a;
import p001o.zaf;

/* loaded from: classes2.dex */
public abstract class a7g {

    /* renamed from: b */
    public uth f14245b;

    /* renamed from: c */
    public vq6 f14246c;

    /* renamed from: d */
    public bac f14247d;

    /* renamed from: e */
    public long f14248e;

    /* renamed from: f */
    public long f14249f;

    /* renamed from: g */
    public long f14250g;

    /* renamed from: h */
    public int f14251h;

    /* renamed from: i */
    public int f14252i;

    /* renamed from: k */
    public long f14254k;

    /* renamed from: l */
    public boolean f14255l;

    /* renamed from: m */
    public boolean f14256m;

    /* renamed from: a */
    public final z9c f14244a = new z9c();

    /* renamed from: j */
    public C12107b f14253j = new C12107b();

    /* renamed from: o.a7g$b */
    public static class C12107b {

        /* renamed from: a */
        public C2181a f14257a;

        /* renamed from: b */
        public bac f14258b;
    }

    /* renamed from: o.a7g$c */
    public static final class C12108c implements bac {
        public C12108c() {
        }

        @Override // p001o.bac
        /* renamed from: a */
        public long mo16576a(uq6 uq6Var) {
            return -1L;
        }

        @Override // p001o.bac
        /* renamed from: b */
        public zaf mo16577b() {
            return new zaf.C18604b(-9223372036854775807L);
        }

        @Override // p001o.bac
        /* renamed from: c */
        public void mo16578c(long j) {
        }
    }

    /* renamed from: a */
    public final void m16563a() {
        op0.m42519i(this.f14245b);
        sqi.m48729h(this.f14246c);
    }

    /* renamed from: b */
    public long m16564b(long j) {
        return (j * 1000000) / this.f14252i;
    }

    /* renamed from: c */
    public long m16565c(long j) {
        return (this.f14252i * j) / 1000000;
    }

    /* renamed from: d */
    public void m16566d(vq6 vq6Var, uth uthVar) {
        this.f14246c = vq6Var;
        this.f14245b = uthVar;
        mo16574l(true);
    }

    /* renamed from: e */
    public void mo16567e(long j) {
        this.f14250g = j;
    }

    /* renamed from: f */
    public abstract long mo16568f(zwc zwcVar);

    /* renamed from: g */
    public final int m16569g(uq6 uq6Var, ued uedVar) {
        m16563a();
        int i = this.f14251h;
        if (i == 0) {
            return m16572j(uq6Var);
        }
        if (i == 1) {
            uq6Var.mo40496k((int) this.f14249f);
            this.f14251h = 2;
            return 0;
        }
        if (i == 2) {
            sqi.m48729h(this.f14247d);
            return m16573k(uq6Var, uedVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final boolean m16570h(uq6 uq6Var) {
        while (this.f14244a.m58989d(uq6Var)) {
            this.f14254k = uq6Var.getPosition() - this.f14249f;
            if (!mo16571i(this.f14244a.m58988c(), this.f14249f, this.f14253j)) {
                return true;
            }
            this.f14249f = uq6Var.getPosition();
        }
        this.f14251h = 3;
        return false;
    }

    /* renamed from: i */
    public abstract boolean mo16571i(zwc zwcVar, long j, C12107b c12107b);

    /* renamed from: j */
    public final int m16572j(uq6 uq6Var) {
        if (!m16570h(uq6Var)) {
            return -1;
        }
        C2181a c2181a = this.f14253j.f14257a;
        this.f14252i = c2181a.f7920C;
        if (!this.f14256m) {
            this.f14245b.mo7072b(c2181a);
            this.f14256m = true;
        }
        bac bacVar = this.f14253j.f14258b;
        if (bacVar != null) {
            this.f14247d = bacVar;
        } else if (uq6Var.getLength() == -1) {
            this.f14247d = new C12108c();
        } else {
            aac aacVarM58987b = this.f14244a.m58987b();
            this.f14247d = new jf5(this, this.f14249f, uq6Var.getLength(), aacVarM58987b.f14389h + aacVarM58987b.f14390i, aacVarM58987b.f14384c, (aacVarM58987b.f14383b & 4) != 0);
        }
        this.f14251h = 2;
        this.f14244a.m58991f();
        return 0;
    }

    /* renamed from: k */
    public final int m16573k(uq6 uq6Var, ued uedVar) {
        long jMo16576a = this.f14247d.mo16576a(uq6Var);
        if (jMo16576a >= 0) {
            uedVar.f48772a = jMo16576a;
            return 1;
        }
        if (jMo16576a < -1) {
            mo16567e(-(jMo16576a + 2));
        }
        if (!this.f14255l) {
            this.f14246c.mo32490r((zaf) op0.m42519i(this.f14247d.mo16577b()));
            this.f14255l = true;
        }
        if (this.f14254k <= 0 && !this.f14244a.m58989d(uq6Var)) {
            this.f14251h = 3;
            return -1;
        }
        this.f14254k = 0L;
        zwc zwcVarM58988c = this.f14244a.m58988c();
        long jMo16568f = mo16568f(zwcVarM58988c);
        if (jMo16568f >= 0) {
            long j = this.f14250g;
            if (j + jMo16568f >= this.f14248e) {
                long jM16564b = m16564b(j);
                this.f14245b.m52027e(zwcVarM58988c, zwcVarM58988c.m60026g());
                this.f14245b.mo7071a(jM16564b, 1, zwcVarM58988c.m60026g(), 0, null);
                this.f14248e = -1L;
            }
        }
        this.f14250g += jMo16568f;
        return 0;
    }

    /* renamed from: l */
    public void mo16574l(boolean z) {
        if (z) {
            this.f14253j = new C12107b();
            this.f14249f = 0L;
            this.f14251h = 0;
        } else {
            this.f14251h = 1;
        }
        this.f14248e = -1L;
        this.f14250g = 0L;
    }

    /* renamed from: m */
    public final void m16575m(long j, long j2) {
        this.f14244a.m58990e();
        if (j == 0) {
            mo16574l(!this.f14255l);
        } else if (this.f14251h != 0) {
            this.f14248e = m16565c(j2);
            ((bac) sqi.m48729h(this.f14247d)).mo16578c(this.f14248e);
            this.f14251h = 2;
        }
    }
}
