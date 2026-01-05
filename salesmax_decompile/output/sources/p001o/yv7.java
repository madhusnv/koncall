package p001o;

import android.util.SparseArray;
import androidx.media3.common.C2181a;
import java.util.ArrayList;
import java.util.Arrays;
import p001o.hyh;
import p001o.irb;
import p001o.ph3;

/* loaded from: classes2.dex */
public final class yv7 implements n46 {

    /* renamed from: a */
    public final nbf f56092a;

    /* renamed from: b */
    public final boolean f56093b;

    /* renamed from: c */
    public final boolean f56094c;

    /* renamed from: g */
    public long f56098g;

    /* renamed from: i */
    public String f56100i;

    /* renamed from: j */
    public uth f56101j;

    /* renamed from: k */
    public C18501b f56102k;

    /* renamed from: l */
    public boolean f56103l;

    /* renamed from: n */
    public boolean f56105n;

    /* renamed from: h */
    public final boolean[] f56099h = new boolean[3];

    /* renamed from: d */
    public final hrb f56095d = new hrb(7, 128);

    /* renamed from: e */
    public final hrb f56096e = new hrb(8, 128);

    /* renamed from: f */
    public final hrb f56097f = new hrb(6, 128);

    /* renamed from: m */
    public long f56104m = -9223372036854775807L;

    /* renamed from: o */
    public final zwc f56106o = new zwc();

    /* renamed from: o.yv7$b */
    public static final class C18501b {

        /* renamed from: a */
        public final uth f56107a;

        /* renamed from: b */
        public final boolean f56108b;

        /* renamed from: c */
        public final boolean f56109c;

        /* renamed from: d */
        public final SparseArray f56110d = new SparseArray();

        /* renamed from: e */
        public final SparseArray f56111e = new SparseArray();

        /* renamed from: f */
        public final axc f56112f;

        /* renamed from: g */
        public byte[] f56113g;

        /* renamed from: h */
        public int f56114h;

        /* renamed from: i */
        public int f56115i;

        /* renamed from: j */
        public long f56116j;

        /* renamed from: k */
        public boolean f56117k;

        /* renamed from: l */
        public long f56118l;

        /* renamed from: m */
        public a f56119m;

        /* renamed from: n */
        public a f56120n;

        /* renamed from: o */
        public boolean f56121o;

        /* renamed from: p */
        public long f56122p;

        /* renamed from: q */
        public long f56123q;

        /* renamed from: r */
        public boolean f56124r;

        /* renamed from: s */
        public boolean f56125s;

        /* renamed from: o.yv7$b$a */
        public static final class a {

            /* renamed from: a */
            public boolean f56126a;

            /* renamed from: b */
            public boolean f56127b;

            /* renamed from: c */
            public irb.C14356c f56128c;

            /* renamed from: d */
            public int f56129d;

            /* renamed from: e */
            public int f56130e;

            /* renamed from: f */
            public int f56131f;

            /* renamed from: g */
            public int f56132g;

            /* renamed from: h */
            public boolean f56133h;

            /* renamed from: i */
            public boolean f56134i;

            /* renamed from: j */
            public boolean f56135j;

            /* renamed from: k */
            public boolean f56136k;

            /* renamed from: l */
            public int f56137l;

            /* renamed from: m */
            public int f56138m;

            /* renamed from: n */
            public int f56139n;

            /* renamed from: o */
            public int f56140o;

            /* renamed from: p */
            public int f56141p;

            public a() {
            }

            /* renamed from: b */
            public void m58372b() {
                this.f56127b = false;
                this.f56126a = false;
            }

            /* renamed from: c */
            public final boolean m58373c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f56126a) {
                    return false;
                }
                if (!aVar.f56126a) {
                    return true;
                }
                irb.C14356c c14356c = (irb.C14356c) op0.m42519i(this.f56128c);
                irb.C14356c c14356c2 = (irb.C14356c) op0.m42519i(aVar.f56128c);
                return (this.f56131f == aVar.f56131f && this.f56132g == aVar.f56132g && this.f56133h == aVar.f56133h && (!this.f56134i || !aVar.f56134i || this.f56135j == aVar.f56135j) && (((i = this.f56129d) == (i2 = aVar.f56129d) || (i != 0 && i2 != 0)) && (((i3 = c14356c.f29150n) != 0 || c14356c2.f29150n != 0 || (this.f56138m == aVar.f56138m && this.f56139n == aVar.f56139n)) && ((i3 != 1 || c14356c2.f29150n != 1 || (this.f56140o == aVar.f56140o && this.f56141p == aVar.f56141p)) && (z = this.f56136k) == aVar.f56136k && (!z || this.f56137l == aVar.f56137l))))) ? false : true;
            }

            /* renamed from: d */
            public boolean m58374d() {
                int i;
                return this.f56127b && ((i = this.f56130e) == 7 || i == 2);
            }

            /* renamed from: e */
            public void m58375e(irb.C14356c c14356c, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f56128c = c14356c;
                this.f56129d = i;
                this.f56130e = i2;
                this.f56131f = i3;
                this.f56132g = i4;
                this.f56133h = z;
                this.f56134i = z2;
                this.f56135j = z3;
                this.f56136k = z4;
                this.f56137l = i5;
                this.f56138m = i6;
                this.f56139n = i7;
                this.f56140o = i8;
                this.f56141p = i9;
                this.f56126a = true;
                this.f56127b = true;
            }

            /* renamed from: f */
            public void m58376f(int i) {
                this.f56130e = i;
                this.f56127b = true;
            }
        }

        public C18501b(uth uthVar, boolean z, boolean z2) {
            this.f56107a = uthVar;
            this.f56108b = z;
            this.f56109c = z2;
            this.f56119m = new a();
            this.f56120n = new a();
            byte[] bArr = new byte[128];
            this.f56113g = bArr;
            this.f56112f = new axc(bArr, 0, 0);
            m58368h();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m58361a(byte[] bArr, int i, int i2) {
            boolean z;
            boolean z2;
            boolean zM17939d;
            boolean z3;
            int iM17943h;
            int i3;
            int i4;
            int iM17942g;
            int i5;
            int iM17942g2;
            if (this.f56117k) {
                int i6 = i2 - i;
                byte[] bArr2 = this.f56113g;
                int length = bArr2.length;
                int i7 = this.f56114h;
                if (length < i7 + i6) {
                    this.f56113g = Arrays.copyOf(bArr2, (i7 + i6) * 2);
                }
                System.arraycopy(bArr, i, this.f56113g, this.f56114h, i6);
                int i8 = this.f56114h + i6;
                this.f56114h = i8;
                this.f56112f.m17944i(this.f56113g, 0, i8);
                if (this.f56112f.m17937b(8)) {
                    this.f56112f.m17946k();
                    int iM17940e = this.f56112f.m17940e(2);
                    this.f56112f.m17947l(5);
                    if (this.f56112f.m17938c()) {
                        this.f56112f.m17943h();
                        if (this.f56112f.m17938c()) {
                            int iM17943h2 = this.f56112f.m17943h();
                            if (!this.f56109c) {
                                this.f56117k = false;
                                this.f56120n.m58376f(iM17943h2);
                                return;
                            }
                            if (this.f56112f.m17938c()) {
                                int iM17943h3 = this.f56112f.m17943h();
                                if (this.f56111e.indexOfKey(iM17943h3) < 0) {
                                    this.f56117k = false;
                                    return;
                                }
                                irb.C14355b c14355b = (irb.C14355b) this.f56111e.get(iM17943h3);
                                irb.C14356c c14356c = (irb.C14356c) this.f56110d.get(c14355b.f29135b);
                                if (c14356c.f29147k) {
                                    if (!this.f56112f.m17937b(2)) {
                                        return;
                                    } else {
                                        this.f56112f.m17947l(2);
                                    }
                                }
                                if (this.f56112f.m17937b(c14356c.f29149m)) {
                                    int iM17940e2 = this.f56112f.m17940e(c14356c.f29149m);
                                    if (c14356c.f29148l) {
                                        z = false;
                                        z2 = false;
                                    } else {
                                        if (!this.f56112f.m17937b(1)) {
                                            return;
                                        }
                                        boolean zM17939d2 = this.f56112f.m17939d();
                                        if (zM17939d2) {
                                            if (this.f56112f.m17937b(1)) {
                                                z = zM17939d2;
                                                z2 = true;
                                                zM17939d = this.f56112f.m17939d();
                                                z3 = this.f56115i != 5;
                                                if (z3) {
                                                    iM17943h = 0;
                                                } else if (!this.f56112f.m17938c()) {
                                                    return;
                                                } else {
                                                    iM17943h = this.f56112f.m17943h();
                                                }
                                                i3 = c14356c.f29150n;
                                                if (i3 != 0) {
                                                    if (!this.f56112f.m17937b(c14356c.f29151o)) {
                                                        return;
                                                    }
                                                    int iM17940e3 = this.f56112f.m17940e(c14356c.f29151o);
                                                    if (c14355b.f29136c && !z) {
                                                        if (this.f56112f.m17938c()) {
                                                            iM17942g = this.f56112f.m17942g();
                                                            i4 = iM17940e3;
                                                            i5 = 0;
                                                            iM17942g2 = i5;
                                                            this.f56120n.m58375e(c14356c, iM17940e, iM17943h2, iM17940e2, iM17943h3, z, z2, zM17939d, z3, iM17943h, i4, iM17942g, i5, iM17942g2);
                                                            this.f56117k = false;
                                                        }
                                                        return;
                                                    }
                                                    i4 = iM17940e3;
                                                    iM17942g = 0;
                                                } else {
                                                    if (i3 == 1 && !c14356c.f29152p) {
                                                        if (this.f56112f.m17938c()) {
                                                            int iM17942g3 = this.f56112f.m17942g();
                                                            if (!c14355b.f29136c || z) {
                                                                i5 = iM17942g3;
                                                                i4 = 0;
                                                                iM17942g = 0;
                                                                iM17942g2 = 0;
                                                            } else {
                                                                if (!this.f56112f.m17938c()) {
                                                                    return;
                                                                }
                                                                iM17942g2 = this.f56112f.m17942g();
                                                                i5 = iM17942g3;
                                                                i4 = 0;
                                                                iM17942g = 0;
                                                            }
                                                            this.f56120n.m58375e(c14356c, iM17940e, iM17943h2, iM17940e2, iM17943h3, z, z2, zM17939d, z3, iM17943h, i4, iM17942g, i5, iM17942g2);
                                                            this.f56117k = false;
                                                        }
                                                        return;
                                                    }
                                                    i4 = 0;
                                                    iM17942g = 0;
                                                }
                                                i5 = iM17942g;
                                                iM17942g2 = i5;
                                                this.f56120n.m58375e(c14356c, iM17940e, iM17943h2, iM17940e2, iM17943h3, z, z2, zM17939d, z3, iM17943h, i4, iM17942g, i5, iM17942g2);
                                                this.f56117k = false;
                                            }
                                            return;
                                        }
                                        z = zM17939d2;
                                        z2 = false;
                                    }
                                    zM17939d = z2;
                                    if (this.f56115i != 5) {
                                    }
                                    if (z3) {
                                    }
                                    i3 = c14356c.f29150n;
                                    if (i3 != 0) {
                                    }
                                    i5 = iM17942g;
                                    iM17942g2 = i5;
                                    this.f56120n.m58375e(c14356c, iM17940e, iM17943h2, iM17940e2, iM17943h3, z, z2, zM17939d, z3, iM17943h, i4, iM17942g, i5, iM17942g2);
                                    this.f56117k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void m58362b(long j) {
            m58369i();
            this.f56116j = j;
            m58365e(0);
            this.f56121o = false;
        }

        /* renamed from: c */
        public boolean m58363c(long j, int i, boolean z) {
            if (this.f56115i == 9 || (this.f56109c && this.f56120n.m58373c(this.f56119m))) {
                if (z && this.f56121o) {
                    m58365e(i + ((int) (j - this.f56116j)));
                }
                this.f56122p = this.f56116j;
                this.f56123q = this.f56118l;
                this.f56124r = false;
                this.f56121o = true;
            }
            m58369i();
            return this.f56124r;
        }

        /* renamed from: d */
        public boolean m58364d() {
            return this.f56109c;
        }

        /* renamed from: e */
        public final void m58365e(int i) {
            long j = this.f56123q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.f56124r;
            this.f56107a.mo7071a(j, z ? 1 : 0, (int) (this.f56116j - this.f56122p), i, null);
        }

        /* renamed from: f */
        public void m58366f(irb.C14355b c14355b) {
            this.f56111e.append(c14355b.f29134a, c14355b);
        }

        /* renamed from: g */
        public void m58367g(irb.C14356c c14356c) {
            this.f56110d.append(c14356c.f29140d, c14356c);
        }

        /* renamed from: h */
        public void m58368h() {
            this.f56117k = false;
            this.f56121o = false;
            this.f56120n.m58372b();
        }

        /* renamed from: i */
        public final void m58369i() {
            boolean zM58374d = this.f56108b ? this.f56120n.m58374d() : this.f56125s;
            boolean z = this.f56124r;
            int i = this.f56115i;
            boolean z2 = true;
            if (i != 5 && (!zM58374d || i != 1)) {
                z2 = false;
            }
            this.f56124r = z | z2;
        }

        /* renamed from: j */
        public void m58370j(long j, int i, long j2, boolean z) {
            this.f56115i = i;
            this.f56118l = j2;
            this.f56116j = j;
            this.f56125s = z;
            if (!this.f56108b || i != 1) {
                if (!this.f56109c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.f56119m;
            this.f56119m = this.f56120n;
            this.f56120n = aVar;
            aVar.m58372b();
            this.f56114h = 0;
            this.f56117k = true;
        }
    }

    public yv7(nbf nbfVar, boolean z, boolean z2) {
        this.f56092a = nbfVar;
        this.f56093b = z;
        this.f56094c = z2;
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        m58357f();
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        byte[] bArrM60024e = zwcVar.m60024e();
        this.f56098g += zwcVar.m60020a();
        this.f56101j.m52027e(zwcVar, zwcVar.m60020a());
        while (true) {
            int iM32614c = irb.m32614c(bArrM60024e, iM60025f, iM60026g, this.f56099h);
            if (iM32614c == iM60026g) {
                m58359h(bArrM60024e, iM60025f, iM60026g);
                return;
            }
            int iM32617f = irb.m32617f(bArrM60024e, iM32614c);
            int i = iM32614c - iM60025f;
            if (i > 0) {
                m58359h(bArrM60024e, iM60025f, iM32614c);
            }
            int i2 = iM60026g - iM32614c;
            long j = this.f56098g - i2;
            m58358g(j, i2, i < 0 ? -i : 0, this.f56104m);
            m58360i(j, iM32617f, this.f56104m);
            iM60025f = iM32614c + 3;
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f56098g = 0L;
        this.f56105n = false;
        this.f56104m = -9223372036854775807L;
        irb.m32612a(this.f56099h);
        this.f56095d.m31017d();
        this.f56096e.m31017d();
        this.f56097f.m31017d();
        C18501b c18501b = this.f56102k;
        if (c18501b != null) {
            c18501b.m58368h();
        }
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
        m58357f();
        if (z) {
            this.f56102k.m58362b(this.f56098g);
        }
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f56100i = c14129d.m31295b();
        uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 2);
        this.f56101j = uthVarMo32487f;
        this.f56102k = new C18501b(uthVarMo32487f, this.f56093b, this.f56094c);
        this.f56092a.m40291b(vq6Var, c14129d);
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f56104m = j;
        this.f56105n |= (i & 2) != 0;
    }

    /* renamed from: f */
    public final void m58357f() {
        op0.m42519i(this.f56101j);
        sqi.m48729h(this.f56102k);
    }

    /* renamed from: g */
    public final void m58358g(long j, int i, int i2, long j2) {
        if (!this.f56103l || this.f56102k.m58364d()) {
            this.f56095d.m31015b(i2);
            this.f56096e.m31015b(i2);
            if (this.f56103l) {
                if (this.f56095d.m31016c()) {
                    hrb hrbVar = this.f56095d;
                    this.f56102k.m58367g(irb.m32623l(hrbVar.f27397d, 3, hrbVar.f27398e));
                    this.f56095d.m31017d();
                } else if (this.f56096e.m31016c()) {
                    hrb hrbVar2 = this.f56096e;
                    this.f56102k.m58366f(irb.m32621j(hrbVar2.f27397d, 3, hrbVar2.f27398e));
                    this.f56096e.m31017d();
                }
            } else if (this.f56095d.m31016c() && this.f56096e.m31016c()) {
                ArrayList arrayList = new ArrayList();
                hrb hrbVar3 = this.f56095d;
                arrayList.add(Arrays.copyOf(hrbVar3.f27397d, hrbVar3.f27398e));
                hrb hrbVar4 = this.f56096e;
                arrayList.add(Arrays.copyOf(hrbVar4.f27397d, hrbVar4.f27398e));
                hrb hrbVar5 = this.f56095d;
                irb.C14356c c14356cM32623l = irb.m32623l(hrbVar5.f27397d, 3, hrbVar5.f27398e);
                hrb hrbVar6 = this.f56096e;
                irb.C14355b c14355bM32621j = irb.m32621j(hrbVar6.f27397d, 3, hrbVar6.f27398e);
                this.f56101j.mo7072b(new C2181a.b().a0(this.f56100i).o0("video/avc").m6752O(hf3.m30318a(c14356cM32623l.f29137a, c14356cM32623l.f29138b, c14356cM32623l.f29139c)).v0(c14356cM32623l.f29142f).m6762Y(c14356cM32623l.f29143g).m6753P(new ph3.C16113b().m43672d(c14356cM32623l.f29153q).m43671c(c14356cM32623l.f29154r).m43673e(c14356cM32623l.f29155s).m43675g(c14356cM32623l.f29145i + 8).m43670b(c14356cM32623l.f29146j + 8).m43669a()).k0(c14356cM32623l.f29144h).b0(arrayList).g0(c14356cM32623l.f29156t).m6748K());
                this.f56103l = true;
                this.f56102k.m58367g(c14356cM32623l);
                this.f56102k.m58366f(c14355bM32621j);
                this.f56095d.m31017d();
                this.f56096e.m31017d();
            }
        }
        if (this.f56097f.m31015b(i2)) {
            hrb hrbVar7 = this.f56097f;
            this.f56106o.m60015S(this.f56097f.f27397d, irb.m32629r(hrbVar7.f27397d, hrbVar7.f27398e));
            this.f56106o.m60017U(4);
            this.f56092a.m40290a(j2, this.f56106o);
        }
        if (this.f56102k.m58363c(j, i, this.f56103l)) {
            this.f56105n = false;
        }
    }

    /* renamed from: h */
    public final void m58359h(byte[] bArr, int i, int i2) {
        if (!this.f56103l || this.f56102k.m58364d()) {
            this.f56095d.m31014a(bArr, i, i2);
            this.f56096e.m31014a(bArr, i, i2);
        }
        this.f56097f.m31014a(bArr, i, i2);
        this.f56102k.m58361a(bArr, i, i2);
    }

    /* renamed from: i */
    public final void m58360i(long j, int i, long j2) {
        if (!this.f56103l || this.f56102k.m58364d()) {
            this.f56095d.m31018e(i);
            this.f56096e.m31018e(i);
        }
        this.f56097f.m31018e(i);
        this.f56102k.m58370j(j, i, j2, this.f56105n);
    }
}
