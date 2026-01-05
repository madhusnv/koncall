package p001o;

import android.util.SparseArray;
import androidx.media3.common.C2181a;
import java.util.List;
import java.util.Objects;
import p001o.l93;
import p001o.qbg;
import p001o.uth;

/* loaded from: classes2.dex */
public final class jn1 implements vq6, l93 {

    /* renamed from: s */
    public static final C14616b f30756s = new C14616b();

    /* renamed from: x */
    public static final ued f30757x = new ued();

    /* renamed from: a */
    public final tq6 f30758a;

    /* renamed from: b */
    public final int f30759b;

    /* renamed from: c */
    public final C2181a f30760c;

    /* renamed from: d */
    public final SparseArray f30761d = new SparseArray();

    /* renamed from: e */
    public boolean f30762e;

    /* renamed from: f */
    public l93.InterfaceC15043b f30763f;

    /* renamed from: g */
    public long f30764g;

    /* renamed from: h */
    public zaf f30765h;

    /* renamed from: q */
    public C2181a[] f30766q;

    /* renamed from: o.jn1$a */
    public static final class C14615a implements uth {

        /* renamed from: a */
        public final int f30767a;

        /* renamed from: b */
        public final int f30768b;

        /* renamed from: c */
        public final C2181a f30769c;

        /* renamed from: d */
        public final nt5 f30770d = new nt5();

        /* renamed from: e */
        public C2181a f30771e;

        /* renamed from: f */
        public uth f30772f;

        /* renamed from: g */
        public long f30773g;

        public C14615a(int i, int i2, C2181a c2181a) {
            this.f30767a = i;
            this.f30768b = i2;
            this.f30769c = c2181a;
        }

        @Override // p001o.uth
        /* renamed from: a */
        public void mo7071a(long j, int i, int i2, int i3, uth.C17452a c17452a) {
            long j2 = this.f30773g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f30772f = this.f30770d;
            }
            ((uth) sqi.m48729h(this.f30772f)).mo7071a(j, i, i2, i3, c17452a);
        }

        @Override // p001o.uth
        /* renamed from: b */
        public void mo7072b(C2181a c2181a) {
            C2181a c2181a2 = this.f30769c;
            if (c2181a2 != null) {
                c2181a = c2181a.m6711h(c2181a2);
            }
            this.f30771e = c2181a;
            ((uth) sqi.m48729h(this.f30772f)).mo7072b(this.f30771e);
        }

        @Override // p001o.uth
        /* renamed from: d */
        public int mo7073d(pu4 pu4Var, int i, boolean z, int i2) {
            return ((uth) sqi.m48729h(this.f30772f)).m52026c(pu4Var, i, z);
        }

        @Override // p001o.uth
        /* renamed from: f */
        public void mo7074f(zwc zwcVar, int i, int i2) {
            ((uth) sqi.m48729h(this.f30772f)).m52027e(zwcVar, i);
        }

        /* renamed from: g */
        public void m34113g(l93.InterfaceC15043b interfaceC15043b, long j) {
            if (interfaceC15043b == null) {
                this.f30772f = this.f30770d;
                return;
            }
            this.f30773g = j;
            uth uthVarMo16940f = interfaceC15043b.mo16940f(this.f30767a, this.f30768b);
            this.f30772f = uthVarMo16940f;
            C2181a c2181a = this.f30771e;
            if (c2181a != null) {
                uthVarMo16940f.mo7072b(c2181a);
            }
        }
    }

    /* renamed from: o.jn1$b */
    public static final class C14616b implements l93.InterfaceC15042a {

        /* renamed from: a */
        public qbg.InterfaceC16329a f30774a = new uh5();

        /* renamed from: b */
        public boolean f30775b;

        @Override // p001o.l93.InterfaceC15042a
        /* renamed from: c */
        public C2181a mo34116c(C2181a c2181a) {
            String str;
            if (!this.f30775b || !this.f30774a.mo45062a(c2181a)) {
                return c2181a;
            }
            C2181a.b bVarM6756S = c2181a.m6707a().o0("application/x-media3-cues").m6756S(this.f30774a.mo45063b(c2181a));
            StringBuilder sb = new StringBuilder();
            sb.append(c2181a.f7943n);
            if (c2181a.f7939j != null) {
                str = " " + c2181a.f7939j;
            } else {
                str = "";
            }
            sb.append(str);
            return bVarM6756S.m6752O(sb.toString()).s0(Long.MAX_VALUE).m6748K();
        }

        @Override // p001o.l93.InterfaceC15042a
        /* renamed from: d */
        public l93 mo34117d(int i, C2181a c2181a, boolean z, List list, uth uthVar, jbd jbdVar) {
            tq6 tj7Var;
            String str = c2181a.f7942m;
            if (!xeb.m56188p(str)) {
                if (xeb.m56187o(str)) {
                    tj7Var = new xza(this.f30774a, this.f30775b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    tj7Var = new l79(1);
                } else if (Objects.equals(str, "image/png")) {
                    tj7Var = new xbd();
                } else {
                    int i2 = z ? 4 : 0;
                    if (!this.f30775b) {
                        i2 |= 32;
                    }
                    tj7Var = new tj7(this.f30774a, i2, null, null, list, uthVar);
                }
            } else {
                if (!this.f30775b) {
                    return null;
                }
                tj7Var = new lbg(this.f30774a.mo45064c(c2181a), c2181a);
            }
            if (this.f30775b && !xeb.m56188p(str) && !(tj7Var.mo46490f() instanceof tj7) && !(tj7Var.mo46490f() instanceof xza)) {
                tj7Var = new rbg(tj7Var, this.f30774a);
            }
            return new jn1(tj7Var, i, c2181a);
        }

        @Override // p001o.l93.InterfaceC15042a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C14616b mo34115b(boolean z) {
            this.f30775b = z;
            return this;
        }

        @Override // p001o.l93.InterfaceC15042a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C14616b mo34114a(qbg.InterfaceC16329a interfaceC16329a) {
            this.f30774a = (qbg.InterfaceC16329a) op0.m42515e(interfaceC16329a);
            return this;
        }
    }

    public jn1(tq6 tq6Var, int i, C2181a c2181a) {
        this.f30758a = tq6Var;
        this.f30759b = i;
        this.f30760c = c2181a;
    }

    @Override // p001o.l93
    /* renamed from: a */
    public boolean mo34109a(uq6 uq6Var) {
        int iMo17264k = this.f30758a.mo17264k(uq6Var, f30757x);
        op0.m42517g(iMo17264k != 1);
        return iMo17264k == 0;
    }

    @Override // p001o.l93
    /* renamed from: b */
    public void mo34110b(l93.InterfaceC15043b interfaceC15043b, long j, long j2) {
        this.f30763f = interfaceC15043b;
        this.f30764g = j2;
        if (!this.f30762e) {
            this.f30758a.mo17263d(this);
            if (j != -9223372036854775807L) {
                this.f30758a.mo17261a(0L, j);
            }
            this.f30762e = true;
            return;
        }
        tq6 tq6Var = this.f30758a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        tq6Var.mo17261a(0L, j);
        for (int i = 0; i < this.f30761d.size(); i++) {
            ((C14615a) this.f30761d.valueAt(i)).m34113g(interfaceC15043b, j2);
        }
    }

    @Override // p001o.l93
    /* renamed from: c */
    public n93 mo34111c() {
        zaf zafVar = this.f30765h;
        if (zafVar instanceof n93) {
            return (n93) zafVar;
        }
        return null;
    }

    @Override // p001o.l93
    /* renamed from: d */
    public C2181a[] mo34112d() {
        return this.f30766q;
    }

    @Override // p001o.vq6
    /* renamed from: f */
    public uth mo32487f(int i, int i2) {
        C14615a c14615a = (C14615a) this.f30761d.get(i);
        if (c14615a == null) {
            op0.m42517g(this.f30766q == null);
            c14615a = new C14615a(i, i2, i2 == this.f30759b ? this.f30760c : null);
            c14615a.m34113g(this.f30763f, this.f30764g);
            this.f30761d.put(i, c14615a);
        }
        return c14615a;
    }

    @Override // p001o.vq6
    /* renamed from: p */
    public void mo32489p() {
        C2181a[] c2181aArr = new C2181a[this.f30761d.size()];
        for (int i = 0; i < this.f30761d.size(); i++) {
            c2181aArr[i] = (C2181a) op0.m42519i(((C14615a) this.f30761d.valueAt(i)).f30771e);
        }
        this.f30766q = c2181aArr;
    }

    @Override // p001o.vq6
    /* renamed from: r */
    public void mo32490r(zaf zafVar) {
        this.f30765h = zafVar;
    }

    @Override // p001o.l93
    public void release() {
        this.f30758a.release();
    }
}
