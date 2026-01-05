package p001o;

/* loaded from: classes6.dex */
public final class m46 {

    /* renamed from: e */
    public static final C15218a f34772e = new C15218a(null);

    /* renamed from: f */
    public static final long[] f34773f = new long[0];

    /* renamed from: a */
    public final uef f34774a;

    /* renamed from: b */
    public final nl7 f34775b;

    /* renamed from: c */
    public long f34776c;

    /* renamed from: d */
    public final long[] f34777d;

    /* renamed from: o.m46$a */
    public static final class C15218a {
        public C15218a() {
        }

        public /* synthetic */ C15218a(id5 id5Var) {
            this();
        }
    }

    public m46(uef uefVar, nl7 nl7Var) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(nl7Var, "readIfAbsent");
        this.f34774a = uefVar;
        this.f34775b = nl7Var;
        int iMo16762d = uefVar.mo16762d();
        if (iMo16762d <= 64) {
            this.f34776c = iMo16762d != 64 ? (-1) << iMo16762d : 0L;
            this.f34777d = f34773f;
        } else {
            this.f34776c = 0L;
            this.f34777d = m38343e(iMo16762d);
        }
    }

    /* renamed from: a */
    public final void m38339a(int i) {
        if (i < 64) {
            this.f34776c |= 1 << i;
        } else {
            m38340b(i);
        }
    }

    /* renamed from: b */
    public final void m38340b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f34777d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    /* renamed from: c */
    public final int m38341c() {
        int length = this.f34777d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f34777d[i];
            while (j != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << iNumberOfTrailingZeros;
                int i4 = iNumberOfTrailingZeros + i3;
                if (((Boolean) this.f34775b.invoke(this.f34774a, Integer.valueOf(i4))).booleanValue()) {
                    this.f34777d[i] = j;
                    return i4;
                }
            }
            this.f34777d[i] = j;
            i = i2;
        }
        return -1;
    }

    /* renamed from: d */
    public final int m38342d() {
        int iNumberOfTrailingZeros;
        int iMo16762d = this.f34774a.mo16762d();
        do {
            long j = this.f34776c;
            if (j == -1) {
                if (iMo16762d > 64) {
                    return m38341c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.f34776c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f34775b.invoke(this.f34774a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    /* renamed from: e */
    public final long[] m38343e(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[gp0.b0(jArr)] = (-1) << i;
        }
        return jArr;
    }
}
