package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import androidx.media3.exoplayer.dash.C2204b;
import androidx.media3.exoplayer.dash.C2206d;
import androidx.media3.exoplayer.dash.InterfaceC2203a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001o.abf;
import p001o.br8;
import p001o.dr4;
import p001o.e9b;
import p001o.fga;
import p001o.fsa;
import p001o.g3d;
import p001o.gf1;
import p001o.jbd;
import p001o.juh;
import p001o.ko6;
import p001o.lef;
import p001o.mk6;
import p001o.mz5;
import p001o.nf8;
import p001o.nz5;
import p001o.ob0;
import p001o.oe3;
import p001o.ol7;
import p001o.p66;
import p001o.p93;
import p001o.qo3;
import p001o.qth;
import p001o.rm5;
import p001o.sga;
import p001o.sqi;
import p001o.sth;
import p001o.t0f;
import p001o.tle;
import p001o.tv;
import p001o.uk6;
import p001o.x4b;
import p001o.zga;

/* renamed from: androidx.media3.exoplayer.dash.b */
/* loaded from: classes2.dex */
public final class C2204b implements x4b, lef.InterfaceC15066a, p93.InterfaceC16035b {
    public static final Pattern m0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern n0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: H */
    public final C2206d f8220H;

    /* renamed from: M */
    public final e9b.C13130a f8222M;

    /* renamed from: Q */
    public final mz5.C15451a f8223Q;

    /* renamed from: X */
    public final jbd f8224X;

    /* renamed from: Y */
    public x4b.InterfaceC18049a f8225Y;

    /* renamed from: a */
    public final int f8227a;

    /* renamed from: b */
    public final InterfaceC2203a.a f8228b;

    /* renamed from: c */
    public final juh f8229c;

    /* renamed from: d */
    public final nz5 f8230d;

    /* renamed from: e */
    public final sga f8231e;

    /* renamed from: f */
    public final gf1 f8232f;

    /* renamed from: g */
    public final long f8233g;

    /* renamed from: h */
    public final zga f8234h;
    public lef i0;
    public dr4 j0;
    public int k0;
    public List l0;

    /* renamed from: q */
    public final ob0 f8235q;

    /* renamed from: s */
    public final sth f8236s;

    /* renamed from: x */
    public final a[] f8237x;

    /* renamed from: y */
    public final qo3 f8238y;

    /* renamed from: Z */
    public p93[] f8226Z = m6982G(0);
    public mk6[] h0 = new mk6[0];

    /* renamed from: L */
    public final IdentityHashMap f8221L = new IdentityHashMap();

    /* renamed from: androidx.media3.exoplayer.dash.b$a */
    public static final class a {

        /* renamed from: a */
        public final int[] f8239a;

        /* renamed from: b */
        public final int f8240b;

        /* renamed from: c */
        public final int f8241c;

        /* renamed from: d */
        public final int f8242d;

        /* renamed from: e */
        public final int f8243e;

        /* renamed from: f */
        public final int f8244f;

        /* renamed from: g */
        public final int f8245g;

        /* renamed from: h */
        public final nf8 f8246h;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, nf8 nf8Var) {
            this.f8240b = i;
            this.f8239a = iArr;
            this.f8241c = i2;
            this.f8243e = i3;
            this.f8244f = i4;
            this.f8245g = i5;
            this.f8242d = i6;
            this.f8246h = nf8Var;
        }

        /* renamed from: a */
        public static a m7017a(int[] iArr, int i, nf8 nf8Var) {
            return new a(3, 1, iArr, i, -1, -1, -1, nf8Var);
        }

        /* renamed from: b */
        public static a m7018b(int[] iArr, int i) {
            return new a(5, 1, iArr, i, -1, -1, -1, nf8.m40499E());
        }

        /* renamed from: c */
        public static a m7019c(int i) {
            return new a(5, 2, new int[0], -1, -1, -1, i, nf8.m40499E());
        }

        /* renamed from: d */
        public static a m7020d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1, nf8.m40499E());
        }
    }

    public C2204b(int i, dr4 dr4Var, gf1 gf1Var, int i2, InterfaceC2203a.a aVar, juh juhVar, oe3 oe3Var, nz5 nz5Var, mz5.C15451a c15451a, sga sgaVar, e9b.C13130a c13130a, long j, zga zgaVar, ob0 ob0Var, qo3 qo3Var, C2206d.b bVar, jbd jbdVar) {
        this.f8227a = i;
        this.j0 = dr4Var;
        this.f8232f = gf1Var;
        this.k0 = i2;
        this.f8228b = aVar;
        this.f8229c = juhVar;
        this.f8230d = nz5Var;
        this.f8223Q = c15451a;
        this.f8231e = sgaVar;
        this.f8222M = c13130a;
        this.f8233g = j;
        this.f8234h = zgaVar;
        this.f8235q = ob0Var;
        this.f8238y = qo3Var;
        this.f8224X = jbdVar;
        this.f8220H = new C2206d(dr4Var, bVar, ob0Var);
        this.i0 = qo3Var.mo20938c();
        g3d g3dVarM23691d = dr4Var.m23691d(i2);
        List list = g3dVarM23691d.f24529d;
        this.l0 = list;
        Pair pairM6987r = m6987r(nz5Var, aVar, g3dVarM23691d.f24528c, list);
        this.f8236s = (sth) pairM6987r.first;
        this.f8237x = (a[]) pairM6987r.second;
    }

    /* renamed from: C */
    public static boolean m6978C(List list, int[] iArr) {
        for (int i : iArr) {
            List list2 = ((tv) list.get(i)).f47942c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!((tle) list2.get(i2)).f47378e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public static int m6979D(int i, List list, int[][] iArr, boolean[] zArr, C2181a[][] c2181aArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m6978C(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            C2181a[] c2181aArrM6991y = m6991y(list, iArr[i3]);
            c2181aArr[i3] = c2181aArrM6991y;
            if (c2181aArrM6991y.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: E */
    public static /* synthetic */ List m6980E(p93 p93Var) {
        return nf8.m40500F(Integer.valueOf(p93Var.f39650a));
    }

    /* renamed from: F */
    public static void m6981F(InterfaceC2203a.a aVar, C2181a[] c2181aArr) {
        for (int i = 0; i < c2181aArr.length; i++) {
            c2181aArr[i] = aVar.mo6976c(c2181aArr[i]);
        }
    }

    /* renamed from: G */
    public static p93[] m6982G(int i) {
        return new p93[i];
    }

    /* renamed from: I */
    public static C2181a[] m6983I(rm5 rm5Var, Pattern pattern, C2181a c2181a) throws NumberFormatException {
        String str = rm5Var.f43795b;
        if (str == null) {
            return new C2181a[]{c2181a};
        }
        String[] strArrI1 = sqi.i1(str, ";");
        C2181a[] c2181aArr = new C2181a[strArrI1.length];
        for (int i = 0; i < strArrI1.length; i++) {
            Matcher matcher = pattern.matcher(strArrI1[i]);
            if (!matcher.matches()) {
                return new C2181a[]{c2181a};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            c2181aArr[i] = c2181a.m6707a().a0(c2181a.f7930a + ":" + i2).m6749L(i2).e0(matcher.group(2)).m6748K();
        }
        return c2181aArr;
    }

    /* renamed from: m */
    public static void m6985m(List list, qth[] qthVarArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            uk6 uk6Var = (uk6) list.get(i2);
            qthVarArr[i] = new qth(uk6Var.m51680a() + ":" + i2, new C2181a.b().a0(uk6Var.m51680a()).o0("application/x-emsg").m6748K());
            aVarArr[i] = a.m7019c(i2);
            i2++;
            i++;
        }
    }

    /* renamed from: o */
    public static int m6986o(nz5 nz5Var, InterfaceC2203a.a aVar, List list, int[][] iArr, int i, boolean[] zArr, C2181a[][] c2181aArr, qth[] qthVarArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(((tv) list.get(i6)).f47942c);
            }
            int size = arrayList.size();
            C2181a[] c2181aArr2 = new C2181a[size];
            for (int i7 = 0; i7 < size; i7++) {
                C2181a c2181a = ((tle) arrayList.get(i7)).f47375b;
                c2181aArr2[i7] = c2181a.m6707a().m6755R(nz5Var.mo41293d(c2181a)).m6748K();
            }
            tv tvVar = (tv) list.get(iArr2[0]);
            long j = tvVar.f47940a;
            String string = j != -1 ? Long.toString(j) : "unset:" + i4;
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8 + 1;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (c2181aArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            m6981F(aVar, c2181aArr2);
            qthVarArr[i5] = new qth(string, c2181aArr2);
            aVarArr[i5] = a.m7020d(tvVar.f47941b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                String str = string + ":emsg";
                qthVarArr[i8] = new qth(str, new C2181a.b().a0(str).o0("application/x-emsg").m6748K());
                aVarArr[i8] = a.m7018b(iArr2, i5);
            }
            if (i2 != -1) {
                aVarArr[i2] = a.m7017a(iArr2, i5, nf8.m40512z(c2181aArr[i4]));
                m6981F(aVar, c2181aArr[i4]);
                qthVarArr[i2] = new qth(string + ":cc", c2181aArr[i4]);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    /* renamed from: r */
    public static Pair m6987r(nz5 nz5Var, InterfaceC2203a.a aVar, List list, List list2) {
        int[][] iArrM6992z = m6992z(list);
        int length = iArrM6992z.length;
        boolean[] zArr = new boolean[length];
        C2181a[][] c2181aArr = new C2181a[length][];
        int iM6979D = m6979D(length, list, iArrM6992z, zArr, c2181aArr) + length + list2.size();
        qth[] qthVarArr = new qth[iM6979D];
        a[] aVarArr = new a[iM6979D];
        m6985m(list2, qthVarArr, aVarArr, m6986o(nz5Var, aVar, list, iArrM6992z, length, zArr, c2181aArr, qthVarArr, aVarArr));
        return Pair.create(new sth(qthVarArr), aVarArr);
    }

    /* renamed from: v */
    public static rm5 m6988v(List list) {
        return m6989w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: w */
    public static rm5 m6989w(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            rm5 rm5Var = (rm5) list.get(i);
            if (str.equals(rm5Var.f43794a)) {
                return rm5Var;
            }
        }
        return null;
    }

    /* renamed from: x */
    public static rm5 m6990x(List list) {
        return m6989w(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: y */
    public static C2181a[] m6991y(List list, int[] iArr) {
        for (int i : iArr) {
            tv tvVar = (tv) list.get(i);
            List list2 = ((tv) list.get(i)).f47943d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                rm5 rm5Var = (rm5) list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(rm5Var.f43794a)) {
                    return m6983I(rm5Var, m0, new C2181a.b().o0("application/cea-608").a0(tvVar.f47940a + ":cea608").m6748K());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(rm5Var.f43794a)) {
                    return m6983I(rm5Var, n0, new C2181a.b().o0("application/cea-708").a0(tvVar.f47940a + ":cea708").m6748K());
                }
            }
        }
        return new C2181a[0];
    }

    /* renamed from: z */
    public static int[][] m6992z(List list) {
        rm5 rm5VarM6988v;
        Integer num;
        int size = list.size();
        HashMap mapM27432e = fsa.m27432e(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            mapM27432e.put(Long.valueOf(((tv) list.get(i)).f47940a), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            tv tvVar = (tv) list.get(i2);
            rm5 rm5VarM6990x = m6990x(tvVar.f47944e);
            if (rm5VarM6990x == null) {
                rm5VarM6990x = m6990x(tvVar.f47945f);
            }
            int iIntValue = (rm5VarM6990x == null || (num = (Integer) mapM27432e.get(Long.valueOf(Long.parseLong(rm5VarM6990x.f43795b)))) == null) ? i2 : num.intValue();
            if (iIntValue == i2 && (rm5VarM6988v = m6988v(tvVar.f47945f)) != null) {
                for (String str : sqi.i1(rm5VarM6988v.f43795b, ",")) {
                    Integer num2 = (Integer) mapM27432e.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] iArrM19646m = br8.m19646m((Collection) arrayList.get(i3));
            iArr[i3] = iArrM19646m;
            Arrays.sort(iArrM19646m);
        }
        return iArr;
    }

    /* renamed from: A */
    public final int m6993A(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f8237x[i2].f8243e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f8237x[i5].f8241c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final int[] m6994B(ko6[] ko6VarArr) {
        int[] iArr = new int[ko6VarArr.length];
        for (int i = 0; i < ko6VarArr.length; i++) {
            ko6 ko6Var = ko6VarArr[i];
            if (ko6Var != null) {
                iArr[i] = this.f8236s.m48916d(ko6Var.mo22953m());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    @Override // p001o.lef.InterfaceC15066a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo7010k(p93 p93Var) {
        this.f8225Y.mo7010k(this);
    }

    /* renamed from: J */
    public void m6996J() {
        this.f8220H.m7068o();
        for (p93 p93Var : this.f8226Z) {
            p93Var.m43235P(this);
        }
        this.f8225Y = null;
    }

    /* renamed from: K */
    public final void m6997K(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr) {
        for (int i = 0; i < ko6VarArr.length; i++) {
            if (ko6VarArr[i] == null || !zArr[i]) {
                t0f t0fVar = t0fVarArr[i];
                if (t0fVar instanceof p93) {
                    ((p93) t0fVar).m43235P(this);
                } else if (t0fVar instanceof p93.C16034a) {
                    ((p93.C16034a) t0fVar).m43242c();
                }
                t0fVarArr[i] = null;
            }
        }
    }

    /* renamed from: L */
    public final void m6998L(ko6[] ko6VarArr, t0f[] t0fVarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < ko6VarArr.length; i++) {
            t0f t0fVar = t0fVarArr[i];
            if ((t0fVar instanceof p66) || (t0fVar instanceof p93.C16034a)) {
                int iM6993A = m6993A(i, iArr);
                if (iM6993A == -1) {
                    z = t0fVarArr[i] instanceof p66;
                } else {
                    t0f t0fVar2 = t0fVarArr[i];
                    z = (t0fVar2 instanceof p93.C16034a) && ((p93.C16034a) t0fVar2).f39662a == t0fVarArr[iM6993A];
                }
                if (!z) {
                    t0f t0fVar3 = t0fVarArr[i];
                    if (t0fVar3 instanceof p93.C16034a) {
                        ((p93.C16034a) t0fVar3).m43242c();
                    }
                    t0fVarArr[i] = null;
                }
            }
        }
    }

    /* renamed from: M */
    public final void m6999M(ko6[] ko6VarArr, t0f[] t0fVarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < ko6VarArr.length; i++) {
            ko6 ko6Var = ko6VarArr[i];
            if (ko6Var != null) {
                t0f t0fVar = t0fVarArr[i];
                if (t0fVar == null) {
                    zArr[i] = true;
                    a aVar = this.f8237x[iArr[i]];
                    int i2 = aVar.f8241c;
                    if (i2 == 0) {
                        t0fVarArr[i] = m7012p(aVar, ko6Var, j);
                    } else if (i2 == 2) {
                        t0fVarArr[i] = new mk6((uk6) this.l0.get(aVar.f8242d), ko6Var.mo22953m().m45839a(0), this.j0.f20433d);
                    }
                } else if (t0fVar instanceof p93) {
                    ((InterfaceC2203a) ((p93) t0fVar).m43223D()).mo6972b(ko6Var);
                }
            }
        }
        for (int i3 = 0; i3 < ko6VarArr.length; i3++) {
            if (t0fVarArr[i3] == null && ko6VarArr[i3] != null) {
                a aVar2 = this.f8237x[iArr[i3]];
                if (aVar2.f8241c == 1) {
                    int iM6993A = m6993A(i3, iArr);
                    if (iM6993A == -1) {
                        t0fVarArr[i3] = new p66();
                    } else {
                        t0fVarArr[i3] = ((p93) t0fVarArr[iM6993A]).m43238S(j, aVar2.f8240b);
                    }
                }
            }
        }
    }

    /* renamed from: N */
    public void m7000N(dr4 dr4Var, int i) {
        this.j0 = dr4Var;
        this.k0 = i;
        this.f8220H.m7070q(dr4Var);
        p93[] p93VarArr = this.f8226Z;
        if (p93VarArr != null) {
            for (p93 p93Var : p93VarArr) {
                ((InterfaceC2203a) p93Var.m43223D()).mo6973c(dr4Var, i);
            }
            this.f8225Y.mo7010k(this);
        }
        this.l0 = dr4Var.m23691d(i).f24529d;
        for (mk6 mk6Var : this.h0) {
            Iterator it = this.l0.iterator();
            while (true) {
                if (it.hasNext()) {
                    uk6 uk6Var = (uk6) it.next();
                    if (uk6Var.m51680a().equals(mk6Var.m39270b())) {
                        mk6Var.m39272d(uk6Var, dr4Var.f20433d && i == dr4Var.m23692e() - 1);
                    }
                }
            }
        }
    }

    @Override // p001o.p93.InterfaceC16035b
    /* renamed from: a */
    public synchronized void mo7001a(p93 p93Var) {
        C2206d.c cVar = (C2206d.c) this.f8221L.remove(p93Var);
        if (cVar != null) {
            cVar.m7082n();
        }
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.i0.mo7002b();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        return this.i0.mo7003c(c2213j);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        return this.i0.mo7004d();
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        for (p93 p93Var : this.f8226Z) {
            if (p93Var.f39650a == 2) {
                return p93Var.m43239e(j, abfVar);
            }
        }
        return j;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        return this.i0.mo7006g();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        this.i0.mo7007h(j);
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        for (p93 p93Var : this.f8226Z) {
            p93Var.m43237R(j);
        }
        for (mk6 mk6Var : this.h0) {
            mk6Var.m39271c(j);
        }
        return j;
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        return -9223372036854775807L;
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() {
        this.f8234h.mo6966a();
    }

    /* renamed from: p */
    public final p93 m7012p(a aVar, ko6 ko6Var, long j) {
        int i;
        qth qthVarM48914b;
        int i2;
        int i3 = aVar.f8244f;
        boolean z = i3 != -1;
        C2206d.c cVarM7064k = null;
        if (z) {
            qthVarM48914b = this.f8236s.m48914b(i3);
            i = 1;
        } else {
            i = 0;
            qthVarM48914b = null;
        }
        int i4 = aVar.f8245g;
        nf8 nf8VarM40499E = i4 != -1 ? this.f8237x[i4].f8246h : nf8.m40499E();
        int size = i + nf8VarM40499E.size();
        C2181a[] c2181aArr = new C2181a[size];
        int[] iArr = new int[size];
        if (z) {
            c2181aArr[0] = qthVarM48914b.m45839a(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < nf8VarM40499E.size(); i5++) {
            C2181a c2181a = (C2181a) nf8VarM40499E.get(i5);
            c2181aArr[i2] = c2181a;
            iArr[i2] = 3;
            arrayList.add(c2181a);
            i2++;
        }
        if (this.j0.f20433d && z) {
            cVarM7064k = this.f8220H.m7064k();
        }
        C2206d.c cVar = cVarM7064k;
        p93 p93Var = new p93(aVar.f8240b, iArr, c2181aArr, this.f8228b.mo6977d(this.f8234h, this.j0, this.f8232f, this.k0, aVar.f8239a, ko6Var, aVar.f8240b, this.f8233g, z, arrayList, cVar, this.f8229c, this.f8224X, null), this, this.f8235q, j, this.f8230d, this.f8223Q, this.f8231e, this.f8222M);
        synchronized (this) {
            this.f8221L.put(p93Var, cVar);
        }
        return p93Var;
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        this.f8225Y = interfaceC18049a;
        interfaceC18049a.mo7240f(this);
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return this.f8236s;
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
        for (p93 p93Var : this.f8226Z) {
            p93Var.m43240t(j, z);
        }
    }

    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        int[] iArrM6994B = m6994B(ko6VarArr);
        m6997K(ko6VarArr, zArr, t0fVarArr);
        m6998L(ko6VarArr, t0fVarArr, iArrM6994B);
        m6999M(ko6VarArr, t0fVarArr, zArr2, j, iArrM6994B);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (t0f t0fVar : t0fVarArr) {
            if (t0fVar instanceof p93) {
                arrayList.add((p93) t0fVar);
            } else if (t0fVar instanceof mk6) {
                arrayList2.add((mk6) t0fVar);
            }
        }
        p93[] p93VarArrM6982G = m6982G(arrayList.size());
        this.f8226Z = p93VarArrM6982G;
        arrayList.toArray(p93VarArrM6982G);
        mk6[] mk6VarArr = new mk6[arrayList2.size()];
        this.h0 = mk6VarArr;
        arrayList2.toArray(mk6VarArr);
        this.i0 = this.f8238y.mo20939d(arrayList, fga.m26655k(arrayList, new ol7() { // from class: o.gr4
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return C2204b.m6980E((p93) obj);
            }
        }));
        return j;
    }
}
