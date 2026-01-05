package p001o;

import java.io.IOException;
import java.util.ArrayList;
import p001o.lmh;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class gb3 extends xcj {

    /* renamed from: H */
    public final long f24844H;

    /* renamed from: L */
    public final long f24845L;

    /* renamed from: M */
    public final boolean f24846M;

    /* renamed from: Q */
    public final boolean f24847Q;

    /* renamed from: X */
    public final boolean f24848X;

    /* renamed from: Y */
    public final ArrayList f24849Y;

    /* renamed from: Z */
    public final lmh.C15106c f24850Z;
    public C13663a h0;
    public C13664b i0;
    public long j0;
    public long k0;

    /* renamed from: o.gb3$a */
    public static final class C13663a extends uf7 {

        /* renamed from: f */
        public final long f24851f;

        /* renamed from: g */
        public final long f24852g;

        /* renamed from: h */
        public final long f24853h;

        /* renamed from: i */
        public final boolean f24854i;

        public C13663a(lmh lmhVar, long j, long j2) throws C13664b {
            super(lmhVar);
            boolean z = false;
            if (lmhVar.mo6951i() != 1) {
                throw new C13664b(0);
            }
            lmh.C15106c c15106cM37476n = lmhVar.m37476n(0, new lmh.C15106c());
            long jMax = Math.max(0L, j);
            if (!c15106cM37476n.f34090k && jMax != 0 && !c15106cM37476n.f34087h) {
                throw new C13664b(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? c15106cM37476n.f34092m : Math.max(0L, j2);
            long j3 = c15106cM37476n.f34092m;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new C13664b(2);
                }
            }
            this.f24851f = jMax;
            this.f24852g = jMax2;
            this.f24853h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (c15106cM37476n.f34088i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f24854i = z;
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: g */
        public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
            this.f48879e.mo6950g(0, c15105b, z);
            long jM37492n = c15105b.m37492n() - this.f24851f;
            long j = this.f24853h;
            return c15105b.m37497s(c15105b.f34057a, c15105b.f34058b, 0, j == -9223372036854775807L ? -9223372036854775807L : j - jM37492n, jM37492n);
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: o */
        public lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
            this.f48879e.mo6953o(0, c15106c, 0L);
            long j2 = c15106c.f34095p;
            long j3 = this.f24851f;
            c15106c.f34095p = j2 + j3;
            c15106c.f34092m = this.f24853h;
            c15106c.f34088i = this.f24854i;
            long j4 = c15106c.f34091l;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                c15106c.f34091l = jMax;
                long j5 = this.f24852g;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                c15106c.f34091l = jMax - this.f24851f;
            }
            long jQ1 = sqi.q1(this.f24851f);
            long j6 = c15106c.f34084e;
            if (j6 != -9223372036854775807L) {
                c15106c.f34084e = j6 + jQ1;
            }
            long j7 = c15106c.f34085f;
            if (j7 != -9223372036854775807L) {
                c15106c.f34085f = j7 + jQ1;
            }
            return c15106c;
        }
    }

    /* renamed from: o.gb3$b */
    public static final class C13664b extends IOException {

        /* renamed from: a */
        public final int f24855a;

        public C13664b(int i) {
            super("Illegal clipping: " + m28299a(i));
            this.f24855a = i;
        }

        /* renamed from: a */
        public static String m28299a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public gb3(x8b x8bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((x8b) op0.m42515e(x8bVar));
        op0.m42511a(j >= 0);
        this.f24844H = j;
        this.f24845L = j2;
        this.f24846M = z;
        this.f24847Q = z2;
        this.f24848X = z3;
        this.f24849Y = new ArrayList();
        this.f24850Z = new lmh.C15106c();
    }

    @Override // p001o.oo3, p001o.be1
    /* renamed from: D */
    public void mo6920D() {
        super.mo6920D();
        this.i0 = null;
        this.h0 = null;
    }

    @Override // p001o.xcj
    /* renamed from: S */
    public void mo21778S(lmh lmhVar) {
        if (this.i0 != null) {
            return;
        }
        m28298V(lmhVar);
    }

    /* renamed from: V */
    public final void m28298V(lmh lmhVar) {
        long j;
        long j2;
        lmhVar.m37476n(0, this.f24850Z);
        long jM37503e = this.f24850Z.m37503e();
        if (this.h0 == null || this.f24849Y.isEmpty() || this.f24847Q) {
            long j3 = this.f24844H;
            long j4 = this.f24845L;
            if (this.f24848X) {
                long jM37501c = this.f24850Z.m37501c();
                j3 += jM37501c;
                j4 += jM37501c;
            }
            this.j0 = jM37503e + j3;
            this.k0 = this.f24845L != Long.MIN_VALUE ? jM37503e + j4 : Long.MIN_VALUE;
            int size = this.f24849Y.size();
            for (int i = 0; i < size; i++) {
                ((fb3) this.f24849Y.get(i)).m26370r(this.j0, this.k0);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.j0 - jM37503e;
            j2 = this.f24845L != Long.MIN_VALUE ? this.k0 - jM37503e : Long.MIN_VALUE;
            j = j5;
        }
        try {
            C13663a c13663a = new C13663a(lmhVar, j, j2);
            this.h0 = c13663a;
            m18729C(c13663a);
        } catch (C13664b e) {
            this.i0 = e;
            for (int i2 = 0; i2 < this.f24849Y.size(); i2++) {
                ((fb3) this.f24849Y.get(i2)).m26369o(this.i0);
            }
        }
    }

    @Override // p001o.x8b
    /* renamed from: a */
    public x4b mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        fb3 fb3Var = new fb3(this.f53537x.mo6931a(c18076b, ob0Var, j), this.f24846M, this.j0, this.k0);
        this.f24849Y.add(fb3Var);
        return fb3Var;
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        op0.m42517g(this.f24849Y.remove(x4bVar));
        this.f53537x.mo6933e(((fb3) x4bVar).f23078a);
        if (!this.f24849Y.isEmpty() || this.f24847Q) {
            return;
        }
        m28298V(((C13663a) op0.m42515e(this.h0)).f48879e);
    }

    @Override // p001o.oo3, p001o.x8b
    /* renamed from: j */
    public void mo6934j() throws C13664b {
        C13664b c13664b = this.i0;
        if (c13664b != null) {
            throw c13664b;
        }
        super.mo6934j();
    }
}
