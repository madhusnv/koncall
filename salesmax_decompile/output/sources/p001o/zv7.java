package p001o;

import androidx.media3.common.C2181a;
import java.util.Collections;
import p001o.hyh;
import p001o.irb;
import p001o.ph3;

/* loaded from: classes2.dex */
public final class zv7 implements n46 {

    /* renamed from: a */
    public final nbf f57759a;

    /* renamed from: b */
    public String f57760b;

    /* renamed from: c */
    public uth f57761c;

    /* renamed from: d */
    public C18720a f57762d;

    /* renamed from: e */
    public boolean f57763e;

    /* renamed from: l */
    public long f57770l;

    /* renamed from: f */
    public final boolean[] f57764f = new boolean[3];

    /* renamed from: g */
    public final hrb f57765g = new hrb(32, 128);

    /* renamed from: h */
    public final hrb f57766h = new hrb(33, 128);

    /* renamed from: i */
    public final hrb f57767i = new hrb(34, 128);

    /* renamed from: j */
    public final hrb f57768j = new hrb(39, 128);

    /* renamed from: k */
    public final hrb f57769k = new hrb(40, 128);

    /* renamed from: m */
    public long f57771m = -9223372036854775807L;

    /* renamed from: n */
    public final zwc f57772n = new zwc();

    /* renamed from: o.zv7$a */
    public static final class C18720a {

        /* renamed from: a */
        public final uth f57773a;

        /* renamed from: b */
        public long f57774b;

        /* renamed from: c */
        public boolean f57775c;

        /* renamed from: d */
        public int f57776d;

        /* renamed from: e */
        public long f57777e;

        /* renamed from: f */
        public boolean f57778f;

        /* renamed from: g */
        public boolean f57779g;

        /* renamed from: h */
        public boolean f57780h;

        /* renamed from: i */
        public boolean f57781i;

        /* renamed from: j */
        public boolean f57782j;

        /* renamed from: k */
        public long f57783k;

        /* renamed from: l */
        public long f57784l;

        /* renamed from: m */
        public boolean f57785m;

        public C18720a(uth uthVar) {
            this.f57773a = uthVar;
        }

        /* renamed from: c */
        public static boolean m59980c(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* renamed from: d */
        public static boolean m59981d(int i) {
            return i < 32 || i == 40;
        }

        /* renamed from: a */
        public void m59982a(long j) {
            this.f57785m = this.f57775c;
            m59984e((int) (j - this.f57774b));
            this.f57783k = this.f57774b;
            this.f57774b = j;
            m59984e(0);
            this.f57781i = false;
        }

        /* renamed from: b */
        public void m59983b(long j, int i, boolean z) {
            if (this.f57782j && this.f57779g) {
                this.f57785m = this.f57775c;
                this.f57782j = false;
            } else if (this.f57780h || this.f57779g) {
                if (z && this.f57781i) {
                    m59984e(i + ((int) (j - this.f57774b)));
                }
                this.f57783k = this.f57774b;
                this.f57784l = this.f57777e;
                this.f57785m = this.f57775c;
                this.f57781i = true;
            }
        }

        /* renamed from: e */
        public final void m59984e(int i) {
            long j = this.f57784l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f57785m;
            this.f57773a.mo7071a(j, z ? 1 : 0, (int) (this.f57774b - this.f57783k), i, null);
        }

        /* renamed from: f */
        public void m59985f(byte[] bArr, int i, int i2) {
            if (this.f57778f) {
                int i3 = this.f57776d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f57776d = i3 + (i2 - i);
                } else {
                    this.f57779g = (bArr[i4] & 128) != 0;
                    this.f57778f = false;
                }
            }
        }

        /* renamed from: g */
        public void m59986g() {
            this.f57778f = false;
            this.f57779g = false;
            this.f57780h = false;
            this.f57781i = false;
            this.f57782j = false;
        }

        /* renamed from: h */
        public void m59987h(long j, int i, int i2, long j2, boolean z) {
            this.f57779g = false;
            this.f57780h = false;
            this.f57777e = j2;
            this.f57776d = 0;
            this.f57774b = j;
            if (!m59981d(i2)) {
                if (this.f57781i && !this.f57782j) {
                    if (z) {
                        m59984e(i);
                    }
                    this.f57781i = false;
                }
                if (m59980c(i2)) {
                    this.f57780h = !this.f57782j;
                    this.f57782j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f57775c = z2;
            this.f57778f = z2 || i2 <= 9;
        }
    }

    public zv7(nbf nbfVar) {
        this.f57759a = nbfVar;
    }

    /* renamed from: i */
    public static C2181a m59975i(String str, hrb hrbVar, hrb hrbVar2, hrb hrbVar3) {
        int i = hrbVar.f27398e;
        byte[] bArr = new byte[hrbVar2.f27398e + i + hrbVar3.f27398e];
        System.arraycopy(hrbVar.f27397d, 0, bArr, 0, i);
        System.arraycopy(hrbVar2.f27397d, 0, bArr, hrbVar.f27398e, hrbVar2.f27398e);
        System.arraycopy(hrbVar3.f27397d, 0, bArr, hrbVar.f27398e + hrbVar2.f27398e, hrbVar3.f27398e);
        irb.C14354a c14354aM32619h = irb.m32619h(hrbVar2.f27397d, 3, hrbVar2.f27398e);
        return new C2181a.b().a0(str).o0("video/hevc").m6752O(hf3.m30320c(c14354aM32619h.f29117a, c14354aM32619h.f29118b, c14354aM32619h.f29119c, c14354aM32619h.f29120d, c14354aM32619h.f29124h, c14354aM32619h.f29125i)).v0(c14354aM32619h.f29127k).m6762Y(c14354aM32619h.f29128l).m6753P(new ph3.C16113b().m43672d(c14354aM32619h.f29131o).m43671c(c14354aM32619h.f29132p).m43673e(c14354aM32619h.f29133q).m43675g(c14354aM32619h.f29122f + 8).m43670b(c14354aM32619h.f29123g + 8).m43669a()).k0(c14354aM32619h.f29129m).g0(c14354aM32619h.f29130n).b0(Collections.singletonList(bArr)).m6748K();
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        m59976f();
        while (zwcVar.m60020a() > 0) {
            int iM60025f = zwcVar.m60025f();
            int iM60026g = zwcVar.m60026g();
            byte[] bArrM60024e = zwcVar.m60024e();
            this.f57770l += zwcVar.m60020a();
            this.f57761c.m52027e(zwcVar, zwcVar.m60020a());
            while (iM60025f < iM60026g) {
                int iM32614c = irb.m32614c(bArrM60024e, iM60025f, iM60026g, this.f57764f);
                if (iM32614c == iM60026g) {
                    m59978h(bArrM60024e, iM60025f, iM60026g);
                    return;
                }
                int iM32616e = irb.m32616e(bArrM60024e, iM32614c);
                int i = iM32614c - iM60025f;
                if (i > 0) {
                    m59978h(bArrM60024e, iM60025f, iM32614c);
                }
                int i2 = iM60026g - iM32614c;
                long j = this.f57770l - i2;
                m59977g(j, i2, i < 0 ? -i : 0, this.f57771m);
                m59979j(j, i2, iM32616e, this.f57771m);
                iM60025f = iM32614c + 3;
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f57770l = 0L;
        this.f57771m = -9223372036854775807L;
        irb.m32612a(this.f57764f);
        this.f57765g.m31017d();
        this.f57766h.m31017d();
        this.f57767i.m31017d();
        this.f57768j.m31017d();
        this.f57769k.m31017d();
        C18720a c18720a = this.f57762d;
        if (c18720a != null) {
            c18720a.m59986g();
        }
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
        m59976f();
        if (z) {
            this.f57762d.m59982a(this.f57770l);
        }
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f57760b = c14129d.m31295b();
        uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 2);
        this.f57761c = uthVarMo32487f;
        this.f57762d = new C18720a(uthVarMo32487f);
        this.f57759a.m40291b(vq6Var, c14129d);
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f57771m = j;
    }

    /* renamed from: f */
    public final void m59976f() {
        op0.m42519i(this.f57761c);
        sqi.m48729h(this.f57762d);
    }

    /* renamed from: g */
    public final void m59977g(long j, int i, int i2, long j2) {
        this.f57762d.m59983b(j, i, this.f57763e);
        if (!this.f57763e) {
            this.f57765g.m31015b(i2);
            this.f57766h.m31015b(i2);
            this.f57767i.m31015b(i2);
            if (this.f57765g.m31016c() && this.f57766h.m31016c() && this.f57767i.m31016c()) {
                this.f57761c.mo7072b(m59975i(this.f57760b, this.f57765g, this.f57766h, this.f57767i));
                this.f57763e = true;
            }
        }
        if (this.f57768j.m31015b(i2)) {
            hrb hrbVar = this.f57768j;
            this.f57772n.m60015S(this.f57768j.f27397d, irb.m32629r(hrbVar.f27397d, hrbVar.f27398e));
            this.f57772n.m60018V(5);
            this.f57759a.m40290a(j2, this.f57772n);
        }
        if (this.f57769k.m31015b(i2)) {
            hrb hrbVar2 = this.f57769k;
            this.f57772n.m60015S(this.f57769k.f27397d, irb.m32629r(hrbVar2.f27397d, hrbVar2.f27398e));
            this.f57772n.m60018V(5);
            this.f57759a.m40290a(j2, this.f57772n);
        }
    }

    /* renamed from: h */
    public final void m59978h(byte[] bArr, int i, int i2) {
        this.f57762d.m59985f(bArr, i, i2);
        if (!this.f57763e) {
            this.f57765g.m31014a(bArr, i, i2);
            this.f57766h.m31014a(bArr, i, i2);
            this.f57767i.m31014a(bArr, i, i2);
        }
        this.f57768j.m31014a(bArr, i, i2);
        this.f57769k.m31014a(bArr, i, i2);
    }

    /* renamed from: j */
    public final void m59979j(long j, int i, int i2, long j2) {
        this.f57762d.m59987h(j, i, i2, j2, this.f57763e);
        if (!this.f57763e) {
            this.f57765g.m31018e(i2);
            this.f57766h.m31018e(i2);
            this.f57767i.m31018e(i2);
        }
        this.f57768j.m31018e(i2);
        this.f57769k.m31018e(i2);
    }
}
