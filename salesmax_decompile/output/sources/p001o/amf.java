package p001o;

import java.util.Arrays;
import p001o.vre;

/* loaded from: classes6.dex */
public class amf extends p9 implements zpb, v37, pm7 {

    /* renamed from: e */
    public final int f15002e;

    /* renamed from: f */
    public final int f15003f;

    /* renamed from: g */
    public final wl1 f15004g;

    /* renamed from: h */
    public Object[] f15005h;

    /* renamed from: q */
    public long f15006q;

    /* renamed from: s */
    public long f15007s;

    /* renamed from: x */
    public int f15008x;

    /* renamed from: y */
    public int f15009y;

    /* renamed from: o.amf$a */
    public static final class C12222a implements yu5 {

        /* renamed from: a */
        public final amf f15010a;

        /* renamed from: b */
        public long f15011b;

        /* renamed from: c */
        public final Object f15012c;

        /* renamed from: d */
        public final n64 f15013d;

        public C12222a(amf amfVar, long j, Object obj, n64 n64Var) {
            this.f15010a = amfVar;
            this.f15011b = j;
            this.f15012c = obj;
            this.f15013d = n64Var;
        }

        @Override // p001o.yu5
        public void dispose() {
            this.f15010a.m17504y(this);
        }
    }

    /* renamed from: o.amf$b */
    public /* synthetic */ class C12223b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15014a;

        static {
            int[] iArr = new int[wl1.values().length];
            try {
                iArr[wl1.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wl1.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wl1.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15014a = iArr;
        }
    }

    /* renamed from: o.amf$c */
    public static final class C12224c extends o64 {

        /* renamed from: a */
        public Object f15015a;

        /* renamed from: b */
        public Object f15016b;

        /* renamed from: c */
        public Object f15017c;

        /* renamed from: d */
        public Object f15018d;

        /* renamed from: e */
        public /* synthetic */ Object f15019e;

        /* renamed from: g */
        public int f15021g;

        public C12224c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f15019e = obj;
            this.f15021g |= Integer.MIN_VALUE;
            return amf.m17464A(amf.this, null, this);
        }
    }

    public amf(int i, int i2, wl1 wl1Var) {
        this.f15002e = i;
        this.f15003f = i2;
        this.f15004g = wl1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x005e, TryCatch #2 {all -> 0x005e, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:20:0x005a), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.p9] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, o.amf] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.z37] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o.r9] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, o.cmf] */
    /* JADX WARN: Type inference failed for: r9v9, types: [o.cmf] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:16:0x003e). Please report as a decompilation issue!!! */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m17464A(amf amfVar, z37 z37Var, n64 n64Var) throws Throwable {
        C12224c c12224c;
        ?? r5;
        z37 z37Var2;
        p69 p69Var;
        p69 p69Var2;
        z37 z37Var3;
        Object objM17494U;
        cmf cmfVar;
        if (n64Var instanceof C12224c) {
            c12224c = (C12224c) n64Var;
            int i = c12224c.f15021g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12224c.f15021g = i - Integer.MIN_VALUE;
            } else {
                c12224c = amfVar.new C12224c(n64Var);
            }
        }
        Object obj = c12224c.f15019e;
        Object objM51918f = uq8.m51918f();
        int i2 = c12224c.f15021g;
        try {
            try {
                if (i2 == 0) {
                    wre.m54934b(obj);
                    z37Var2 = z37Var;
                    z37Var = (cmf) amfVar.m43196h();
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p69Var2 = (p69) c12224c.f15018d;
                            cmf cmfVar2 = (cmf) c12224c.f15017c;
                            z37Var3 = (z37) c12224c.f15016b;
                            amf amfVar2 = (amf) c12224c.f15015a;
                            wre.m54934b(obj);
                            r5 = amfVar2;
                            z37Var = cmfVar2;
                            do {
                                objM17494U = r5.m17494U(z37Var);
                                if (objM17494U == bmf.f16537a) {
                                }
                            } while (r5.m17503x(z37Var, c12224c) != objM51918f);
                            return objM51918f;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p69Var2 = (p69) c12224c.f15018d;
                        cmf cmfVar3 = (cmf) c12224c.f15017c;
                        z37Var3 = (z37) c12224c.f15016b;
                        amf amfVar3 = (amf) c12224c.f15015a;
                        wre.m54934b(obj);
                        amf amfVar4 = amfVar3;
                        cmf cmfVar4 = cmfVar3;
                        z37Var2 = z37Var3;
                        p69Var = p69Var2;
                        amfVar = amfVar4;
                        cmfVar = cmfVar4;
                        r5 = amfVar;
                        p69Var2 = p69Var;
                        z37Var3 = z37Var2;
                        z37Var = cmfVar;
                        do {
                            objM17494U = r5.m17494U(z37Var);
                            if (objM17494U == bmf.f16537a) {
                                if (p69Var2 != null) {
                                    z69.m58845j(p69Var2);
                                }
                                c12224c.f15015a = r5;
                                c12224c.f15016b = z37Var3;
                                c12224c.f15017c = z37Var;
                                c12224c.f15018d = p69Var2;
                                c12224c.f15021g = 3;
                                amfVar4 = r5;
                                cmfVar4 = z37Var;
                                if (z37Var3.emit(objM17494U, c12224c) == objM51918f) {
                                    return objM51918f;
                                }
                                z37Var2 = z37Var3;
                                p69Var = p69Var2;
                                amfVar = amfVar4;
                                cmfVar = cmfVar4;
                                r5 = amfVar;
                                p69Var2 = p69Var;
                                z37Var3 = z37Var2;
                                z37Var = cmfVar;
                                objM17494U = r5.m17494U(z37Var);
                                if (objM17494U == bmf.f16537a) {
                                    c12224c.f15015a = r5;
                                    c12224c.f15016b = z37Var3;
                                    c12224c.f15017c = z37Var;
                                    c12224c.f15018d = p69Var2;
                                    c12224c.f15021g = 2;
                                }
                            }
                        } while (r5.m17503x(z37Var, c12224c) != objM51918f);
                        return objM51918f;
                    }
                    z37Var = (cmf) c12224c.f15017c;
                    z37 z37Var4 = (z37) c12224c.f15016b;
                    amf amfVar5 = (amf) c12224c.f15015a;
                    try {
                        wre.m54934b(obj);
                        z37Var2 = z37Var4;
                        amfVar = amfVar5;
                        z37Var = z37Var;
                    } catch (Throwable th) {
                        th = th;
                        r5 = amfVar5;
                        r5.m43197k(z37Var);
                        throw th;
                    }
                }
                p69Var = (p69) c12224c.getContext().get(p69.f39399t);
                cmfVar = z37Var;
                r5 = amfVar;
                p69Var2 = p69Var;
                z37Var3 = z37Var2;
                z37Var = cmfVar;
                do {
                    objM17494U = r5.m17494U(z37Var);
                    if (objM17494U == bmf.f16537a) {
                    }
                } while (r5.m17503x(z37Var, c12224c) != objM51918f);
                return objM51918f;
            } catch (Throwable th2) {
                r5 = amfVar;
                th = th2;
                r5.m43197k(z37Var);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: F */
    public static /* synthetic */ Object m17465F(amf amfVar, Object obj, n64 n64Var) {
        if (amfVar.mo17498b(obj)) {
            return y3i.f54824a;
        }
        Object objM17480G = amfVar.m17480G(obj, n64Var);
        return objM17480G == uq8.m51918f() ? objM17480G : y3i.f54824a;
    }

    /* renamed from: B */
    public final void m17476B(long j) {
        r9[] r9VarArr;
        if (this.f39634b != 0 && (r9VarArr = this.f39633a) != null) {
            for (r9 r9Var : r9VarArr) {
                if (r9Var != null) {
                    cmf cmfVar = (cmf) r9Var;
                    long j2 = cmfVar.f18357a;
                    if (j2 >= 0 && j2 < j) {
                        cmfVar.f18357a = j;
                    }
                }
            }
        }
        this.f15007s = j;
    }

    @Override // p001o.p9
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public cmf mo17501i() {
        return new cmf();
    }

    @Override // p001o.p9
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public cmf[] mo17502j(int i) {
        return new cmf[i];
    }

    /* renamed from: E */
    public final void m17479E() {
        Object[] objArr = this.f15005h;
        sq8.m48646e(objArr);
        bmf.m19390g(objArr, m17484K(), null);
        this.f15008x--;
        long jM17484K = m17484K() + 1;
        if (this.f15006q < jM17484K) {
            this.f15006q = jM17484K;
        }
        if (this.f15007s < jM17484K) {
            m17476B(jM17484K);
        }
    }

    /* renamed from: G */
    public final Object m17480G(Object obj, n64 n64Var) {
        n64[] n64VarArrM17482I;
        C12222a c12222a;
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        n64[] n64VarArrM17482I2 = q9.f41501a;
        synchronized (this) {
            if (m17491R(obj)) {
                vre.C17665a c17665a = vre.f50797b;
                zb2Var.resumeWith(vre.m53351b(y3i.f54824a));
                n64VarArrM17482I = m17482I(n64VarArrM17482I2);
                c12222a = null;
            } else {
                C12222a c12222a2 = new C12222a(this, m17489P() + m17484K(), obj, zb2Var);
                m17481H(c12222a2);
                this.f15009y++;
                if (this.f15003f == 0) {
                    n64VarArrM17482I2 = m17482I(n64VarArrM17482I2);
                }
                n64VarArrM17482I = n64VarArrM17482I2;
                c12222a = c12222a2;
            }
        }
        if (c12222a != null) {
            bc2.m18560a(zb2Var, c12222a);
        }
        for (n64 n64Var2 : n64VarArrM17482I) {
            if (n64Var2 != null) {
                vre.C17665a c17665a2 = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    /* renamed from: H */
    public final void m17481H(Object obj) {
        int iM17489P = m17489P();
        Object[] objArrM17490Q = this.f15005h;
        if (objArrM17490Q == null) {
            objArrM17490Q = m17490Q(null, 0, 2);
        } else if (iM17489P >= objArrM17490Q.length) {
            objArrM17490Q = m17490Q(objArrM17490Q, iM17489P, objArrM17490Q.length * 2);
        }
        bmf.m19390g(objArrM17490Q, m17484K() + iM17489P, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: I */
    public final n64[] m17482I(n64[] n64VarArr) {
        r9[] r9VarArr;
        cmf cmfVar;
        n64 n64Var;
        int length = n64VarArr.length;
        if (this.f39634b != 0 && (r9VarArr = this.f39633a) != null) {
            int length2 = r9VarArr.length;
            int i = 0;
            n64VarArr = n64VarArr;
            while (i < length2) {
                r9 r9Var = r9VarArr[i];
                if (r9Var != null && (n64Var = (cmfVar = (cmf) r9Var).f18358b) != null && m17493T(cmfVar) >= 0) {
                    int length3 = n64VarArr.length;
                    n64VarArr = n64VarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(n64VarArr, Math.max(2, n64VarArr.length * 2));
                        sq8.m48648g(CopyOf, "copyOf(...)");
                        n64VarArr = CopyOf;
                    }
                    n64VarArr[length] = n64Var;
                    cmfVar.f18358b = null;
                    length++;
                }
                i++;
                n64VarArr = n64VarArr;
            }
        }
        return n64VarArr;
    }

    /* renamed from: J */
    public final long m17483J() {
        return m17484K() + this.f15008x;
    }

    /* renamed from: K */
    public final long m17484K() {
        return Math.min(this.f15007s, this.f15006q);
    }

    /* renamed from: L */
    public final Object m17485L() {
        Object[] objArr = this.f15005h;
        sq8.m48646e(objArr);
        return bmf.m19389f(objArr, (this.f15006q + m17488O()) - 1);
    }

    /* renamed from: M */
    public final Object m17486M(long j) {
        Object[] objArr = this.f15005h;
        sq8.m48646e(objArr);
        Object objM19389f = bmf.m19389f(objArr, j);
        return objM19389f instanceof C12222a ? ((C12222a) objM19389f).f15012c : objM19389f;
    }

    /* renamed from: N */
    public final long m17487N() {
        return m17484K() + this.f15008x + this.f15009y;
    }

    /* renamed from: O */
    public final int m17488O() {
        return (int) ((m17484K() + this.f15008x) - this.f15006q);
    }

    /* renamed from: P */
    public final int m17489P() {
        return this.f15008x + this.f15009y;
    }

    /* renamed from: Q */
    public final Object[] m17490Q(Object[] objArr, int i, int i2) {
        if (!(i2 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.f15005h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM17484K = m17484K();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + jM17484K;
            bmf.m19390g(objArr2, j, bmf.m19389f(objArr, j));
        }
        return objArr2;
    }

    /* renamed from: R */
    public final boolean m17491R(Object obj) {
        if (m43198l() == 0) {
            return m17492S(obj);
        }
        if (this.f15008x >= this.f15003f && this.f15007s <= this.f15006q) {
            int i = C12223b.f15014a[this.f15004g.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new szb();
            }
        }
        m17481H(obj);
        int i2 = this.f15008x + 1;
        this.f15008x = i2;
        if (i2 > this.f15003f) {
            m17479E();
        }
        if (m17488O() > this.f15002e) {
            m17495V(this.f15006q + 1, this.f15007s, m17483J(), m17487N());
        }
        return true;
    }

    /* renamed from: S */
    public final boolean m17492S(Object obj) {
        if (this.f15002e == 0) {
            return true;
        }
        m17481H(obj);
        int i = this.f15008x + 1;
        this.f15008x = i;
        if (i > this.f15002e) {
            m17479E();
        }
        this.f15007s = m17484K() + this.f15008x;
        return true;
    }

    /* renamed from: T */
    public final long m17493T(cmf cmfVar) {
        long j = cmfVar.f18357a;
        if (j < m17483J()) {
            return j;
        }
        if (this.f15003f <= 0 && j <= m17484K() && this.f15009y != 0) {
            return j;
        }
        return -1L;
    }

    /* renamed from: U */
    public final Object m17494U(cmf cmfVar) {
        Object obj;
        n64[] n64VarArrM17496W = q9.f41501a;
        synchronized (this) {
            long jM17493T = m17493T(cmfVar);
            if (jM17493T < 0) {
                obj = bmf.f16537a;
            } else {
                long j = cmfVar.f18357a;
                Object objM17486M = m17486M(jM17493T);
                cmfVar.f18357a = jM17493T + 1;
                n64VarArrM17496W = m17496W(j);
                obj = objM17486M;
            }
        }
        for (n64 n64Var : n64VarArrM17496W) {
            if (n64Var != null) {
                vre.C17665a c17665a = vre.f50797b;
                n64Var.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }
        return obj;
    }

    /* renamed from: V */
    public final void m17495V(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM17484K = m17484K(); jM17484K < jMin; jM17484K++) {
            Object[] objArr = this.f15005h;
            sq8.m48646e(objArr);
            bmf.m19390g(objArr, jM17484K, null);
        }
        this.f15006q = j;
        this.f15007s = j2;
        this.f15008x = (int) (j3 - jMin);
        this.f15009y = (int) (j4 - j3);
    }

    /* renamed from: W */
    public final n64[] m17496W(long j) {
        long j2;
        long j3;
        long j4;
        r9[] r9VarArr;
        if (j > this.f15007s) {
            return q9.f41501a;
        }
        long jM17484K = m17484K();
        long j5 = this.f15008x + jM17484K;
        if (this.f15003f == 0 && this.f15009y > 0) {
            j5++;
        }
        if (this.f39634b != 0 && (r9VarArr = this.f39633a) != null) {
            for (r9 r9Var : r9VarArr) {
                if (r9Var != null) {
                    long j6 = ((cmf) r9Var).f18357a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.f15007s) {
            return q9.f41501a;
        }
        long jM17483J = m17483J();
        int iMin = m43198l() > 0 ? Math.min(this.f15009y, this.f15003f - ((int) (jM17483J - j5))) : this.f15009y;
        n64[] n64VarArr = q9.f41501a;
        long j7 = this.f15009y + jM17483J;
        if (iMin > 0) {
            n64VarArr = new n64[iMin];
            Object[] objArr = this.f15005h;
            sq8.m48646e(objArr);
            long j8 = jM17483J;
            int i = 0;
            while (true) {
                if (jM17483J >= j7) {
                    j2 = j5;
                    j3 = j7;
                    break;
                }
                Object objM19389f = bmf.m19389f(objArr, jM17483J);
                j2 = j5;
                lgg lggVar = bmf.f16537a;
                if (objM19389f != lggVar) {
                    sq8.m48647f(objM19389f, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C12222a c12222a = (C12222a) objM19389f;
                    int i2 = i + 1;
                    j3 = j7;
                    n64VarArr[i] = c12222a.f15013d;
                    bmf.m19390g(objArr, jM17483J, lggVar);
                    bmf.m19390g(objArr, j8, c12222a.f15012c);
                    j4 = 1;
                    j8++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j3 = j7;
                    j4 = 1;
                }
                jM17483J += j4;
                j5 = j2;
                j7 = j3;
            }
            jM17483J = j8;
        } else {
            j2 = j5;
            j3 = j7;
        }
        int i3 = (int) (jM17483J - jM17484K);
        long j9 = m43198l() == 0 ? jM17483J : j2;
        long jMax = Math.max(this.f15006q, jM17483J - Math.min(this.f15002e, i3));
        if (this.f15003f == 0 && jMax < j3) {
            Object[] objArr2 = this.f15005h;
            sq8.m48646e(objArr2);
            if (sq8.m48644c(bmf.m19389f(objArr2, jMax), bmf.f16537a)) {
                jM17483J++;
                jMax++;
            }
        }
        m17495V(jMax, j9, jM17483J, j3);
        m17505z();
        return (n64VarArr.length == 0) ^ true ? m17482I(n64VarArr) : n64VarArr;
    }

    /* renamed from: X */
    public final long m17497X() {
        long j = this.f15006q;
        if (j < this.f15007s) {
            this.f15007s = j;
        }
        return j;
    }

    @Override // p001o.zlf, p001o.v37
    /* renamed from: a */
    public Object mo9775a(z37 z37Var, n64 n64Var) {
        return m17464A(this, z37Var, n64Var);
    }

    @Override // p001o.zpb
    /* renamed from: b */
    public boolean mo17498b(Object obj) {
        int i;
        boolean z;
        n64[] n64VarArrM17482I = q9.f41501a;
        synchronized (this) {
            if (m17491R(obj)) {
                n64VarArrM17482I = m17482I(n64VarArrM17482I);
                z = true;
            } else {
                z = false;
            }
        }
        for (n64 n64Var : n64VarArrM17482I) {
            if (n64Var != null) {
                vre.C17665a c17665a = vre.f50797b;
                n64Var.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }
        return z;
    }

    @Override // p001o.zpb
    /* renamed from: d */
    public void mo17499d() {
        synchronized (this) {
            m17495V(m17483J(), this.f15007s, m17483J(), m17487N());
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // p001o.pm7
    /* renamed from: e */
    public v37 mo17500e(q74 q74Var, int i, wl1 wl1Var) {
        return bmf.m19388e(this, q74Var, i, wl1Var);
    }

    @Override // p001o.zpb, p001o.z37
    public Object emit(Object obj, n64 n64Var) {
        return m17465F(this, obj, n64Var);
    }

    /* renamed from: x */
    public final Object m17503x(cmf cmfVar, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        synchronized (this) {
            if (m17493T(cmfVar) < 0) {
                cmfVar.f18358b = zb2Var;
            } else {
                vre.C17665a c17665a = vre.f50797b;
                zb2Var.resumeWith(vre.m53351b(y3i.f54824a));
            }
            y3i y3iVar = y3i.f54824a;
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    /* renamed from: y */
    public final void m17504y(C12222a c12222a) {
        synchronized (this) {
            if (c12222a.f15011b < m17484K()) {
                return;
            }
            Object[] objArr = this.f15005h;
            sq8.m48646e(objArr);
            if (bmf.m19389f(objArr, c12222a.f15011b) != c12222a) {
                return;
            }
            bmf.m19390g(objArr, c12222a.f15011b, bmf.f16537a);
            m17505z();
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: z */
    public final void m17505z() {
        if (this.f15003f != 0 || this.f15009y > 1) {
            Object[] objArr = this.f15005h;
            sq8.m48646e(objArr);
            while (this.f15009y > 0 && bmf.m19389f(objArr, (m17484K() + m17489P()) - 1) == bmf.f16537a) {
                this.f15009y--;
                bmf.m19390g(objArr, m17484K() + m17489P(), null);
            }
        }
    }
}
