package p001o;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p001o.lmh;
import p001o.s2b;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class mbb extends oo3 {
    public static final s2b j0 = new s2b.C16718c().m47472c("MergingMediaSource").m47470a();

    /* renamed from: H */
    public final x8b[] f35106H;

    /* renamed from: L */
    public final lmh[] f35107L;

    /* renamed from: M */
    public final ArrayList f35108M;

    /* renamed from: Q */
    public final qo3 f35109Q;

    /* renamed from: X */
    public final Map f35110X;

    /* renamed from: Y */
    public final lob f35111Y;

    /* renamed from: Z */
    public int f35112Z;
    public long[][] h0;
    public C15271b i0;

    /* renamed from: x */
    public final boolean f35113x;

    /* renamed from: y */
    public final boolean f35114y;

    /* renamed from: o.mbb$a */
    public static final class C15270a extends uf7 {

        /* renamed from: f */
        public final long[] f35115f;

        /* renamed from: g */
        public final long[] f35116g;

        public C15270a(lmh lmhVar, Map map) {
            super(lmhVar);
            int iMo6954p = lmhVar.mo6954p();
            this.f35116g = new long[lmhVar.mo6954p()];
            lmh.C15106c c15106c = new lmh.C15106c();
            for (int i = 0; i < iMo6954p; i++) {
                this.f35116g[i] = lmhVar.m37476n(i, c15106c).f34092m;
            }
            int iMo6951i = lmhVar.mo6951i();
            this.f35115f = new long[iMo6951i];
            lmh.C15105b c15105b = new lmh.C15105b();
            for (int i2 = 0; i2 < iMo6951i; i2++) {
                lmhVar.mo6950g(i2, c15105b, true);
                long jLongValue = ((Long) op0.m42515e((Long) map.get(c15105b.f34058b))).longValue();
                long[] jArr = this.f35115f;
                jLongValue = jLongValue == Long.MIN_VALUE ? c15105b.f34060d : jLongValue;
                jArr[i2] = jLongValue;
                long j = c15105b.f34060d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f35116g;
                    int i3 = c15105b.f34059c;
                    jArr2[i3] = jArr2[i3] - (j - jLongValue);
                }
            }
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: g */
        public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
            super.mo6950g(i, c15105b, z);
            c15105b.f34060d = this.f35115f[i];
            return c15105b;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // p001o.uf7, p001o.lmh
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
            long jMin;
            super.mo6953o(i, c15106c, j);
            long j2 = this.f35116g[i];
            c15106c.f34092m = j2;
            if (j2 != -9223372036854775807L) {
                long j3 = c15106c.f34091l;
                jMin = j3 == -9223372036854775807L ? c15106c.f34091l : Math.min(j3, j2);
            }
            c15106c.f34091l = jMin;
            return c15106c;
        }
    }

    /* renamed from: o.mbb$b */
    public static final class C15271b extends IOException {

        /* renamed from: a */
        public final int f35117a;

        public C15271b(int i) {
            this.f35117a = i;
        }
    }

    public mbb(x8b... x8bVarArr) {
        this(false, x8bVarArr);
    }

    @Override // p001o.oo3, p001o.be1
    /* renamed from: B */
    public void mo6919B(juh juhVar) {
        super.mo6919B(juhVar);
        for (int i = 0; i < this.f35106H.length; i++) {
            m42493K(Integer.valueOf(i), this.f35106H[i]);
        }
    }

    @Override // p001o.oo3, p001o.be1
    /* renamed from: D */
    public void mo6920D() {
        super.mo6920D();
        Arrays.fill(this.f35107L, (Object) null);
        this.f35112Z = -1;
        this.i0 = null;
        this.f35108M.clear();
        Collections.addAll(this.f35108M, this.f35106H);
    }

    /* renamed from: L */
    public final void m38680L() {
        lmh.C15105b c15105b = new lmh.C15105b();
        for (int i = 0; i < this.f35112Z; i++) {
            long j = -this.f35107L[0].m37473f(i, c15105b).m37492n();
            int i2 = 1;
            while (true) {
                lmh[] lmhVarArr = this.f35107L;
                if (i2 < lmhVarArr.length) {
                    this.h0[i][i2] = j - (-lmhVarArr[i2].m37473f(i, c15105b).m37492n());
                    i2++;
                }
            }
        }
    }

    @Override // p001o.oo3
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public x8b.C18076b mo38678F(Integer num, x8b.C18076b c18076b) {
        if (num.intValue() == 0) {
            return c18076b;
        }
        return null;
    }

    @Override // p001o.oo3
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m42490I(Integer num, x8b x8bVar, lmh lmhVar) {
        if (this.i0 != null) {
            return;
        }
        if (this.f35112Z == -1) {
            this.f35112Z = lmhVar.mo6951i();
        } else if (lmhVar.mo6951i() != this.f35112Z) {
            this.i0 = new C15271b(0);
            return;
        }
        if (this.h0.length == 0) {
            this.h0 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f35112Z, this.f35107L.length);
        }
        this.f35108M.remove(x8bVar);
        this.f35107L[num.intValue()] = lmhVar;
        if (this.f35108M.isEmpty()) {
            if (this.f35113x) {
                m38680L();
            }
            lmh c15270a = this.f35107L[0];
            if (this.f35114y) {
                m38683O();
                c15270a = new C15270a(c15270a, this.f35110X);
            }
            m18729C(c15270a);
        }
    }

    /* renamed from: O */
    public final void m38683O() {
        lmh[] lmhVarArr;
        lmh.C15105b c15105b = new lmh.C15105b();
        for (int i = 0; i < this.f35112Z; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                lmhVarArr = this.f35107L;
                if (i2 >= lmhVarArr.length) {
                    break;
                }
                long jM37488j = lmhVarArr[i2].m37473f(i, c15105b).m37488j();
                if (jM37488j != -9223372036854775807L) {
                    long j2 = jM37488j + this.h0[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object objMo6952m = lmhVarArr[0].mo6952m(i);
            this.f35110X.put(objMo6952m, Long.valueOf(j));
            Iterator it = this.f35111Y.get(objMo6952m).iterator();
            while (it.hasNext()) {
                ((fb3) it.next()).m26370r(0L, j);
            }
        }
    }

    @Override // p001o.x8b
    /* renamed from: a */
    public x4b mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        int length = this.f35106H.length;
        x4b[] x4bVarArr = new x4b[length];
        int iMo6949b = this.f35107L[0].mo6949b(c18076b.f53356a);
        for (int i = 0; i < length; i++) {
            x4bVarArr[i] = this.f35106H[i].mo6931a(c18076b.m55841a(this.f35107L[i].mo6952m(iMo6949b)), ob0Var, j - this.h0[iMo6949b][i]);
        }
        lbb lbbVar = new lbb(this.f35109Q, this.h0[iMo6949b], x4bVarArr);
        if (!this.f35114y) {
            return lbbVar;
        }
        fb3 fb3Var = new fb3(lbbVar, true, 0L, ((Long) op0.m42515e((Long) this.f35110X.get(c18076b.f53356a))).longValue());
        this.f35111Y.put(c18076b.f53356a, fb3Var);
        return fb3Var;
    }

    @Override // p001o.x8b
    /* renamed from: b */
    public s2b mo6932b() {
        x8b[] x8bVarArr = this.f35106H;
        return x8bVarArr.length > 0 ? x8bVarArr[0].mo6932b() : j0;
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        if (this.f35114y) {
            fb3 fb3Var = (fb3) x4bVar;
            Iterator it = this.f35111Y.mo36684b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((fb3) entry.getValue()).equals(fb3Var)) {
                    this.f35111Y.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            x4bVar = fb3Var.f23078a;
        }
        lbb lbbVar = (lbb) x4bVar;
        int i = 0;
        while (true) {
            x8b[] x8bVarArr = this.f35106H;
            if (i >= x8bVarArr.length) {
                return;
            }
            x8bVarArr[i].mo6933e(lbbVar.m36862l(i));
            i++;
        }
    }

    @Override // p001o.oo3, p001o.x8b
    /* renamed from: j */
    public void mo6934j() throws C15271b {
        C15271b c15271b = this.i0;
        if (c15271b != null) {
            throw c15271b;
        }
        super.mo6934j();
    }

    @Override // p001o.x8b
    /* renamed from: n */
    public void mo6935n(s2b s2bVar) {
        this.f35106H[0].mo6935n(s2bVar);
    }

    public mbb(boolean z, x8b... x8bVarArr) {
        this(z, false, x8bVarArr);
    }

    public mbb(boolean z, boolean z2, x8b... x8bVarArr) {
        this(z, z2, new cd5(), x8bVarArr);
    }

    public mbb(boolean z, boolean z2, qo3 qo3Var, x8b... x8bVarArr) {
        this.f35113x = z;
        this.f35114y = z2;
        this.f35106H = x8bVarArr;
        this.f35109Q = qo3Var;
        this.f35108M = new ArrayList(Arrays.asList(x8bVarArr));
        this.f35112Z = -1;
        this.f35107L = new lmh[x8bVarArr.length];
        this.h0 = new long[0][];
        this.f35110X = new HashMap();
        this.f35111Y = mob.m39456a().m39463a().mo39462e();
    }
}
