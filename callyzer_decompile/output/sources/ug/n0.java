package ug;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends h0 {

    /* renamed from: c */
    public String f35641c;

    /* renamed from: d */
    public String f35642d;

    /* renamed from: e */
    public int f35643e;

    /* renamed from: f */
    public String f35644f;

    /* renamed from: g */
    public String f35645g;

    /* renamed from: h */
    public long f35646h;

    /* renamed from: j */
    public final long f35647j;

    /* renamed from: k */
    public final long f35648k;

    /* renamed from: l */
    public List f35649l;

    /* renamed from: m */
    public String f35650m;

    /* renamed from: n */
    public int f35651n;

    /* renamed from: p */
    public String f35652p;

    /* renamed from: q */
    public String f35653q;

    /* renamed from: r */
    public long f35654r;

    /* renamed from: s */
    public String f35655s;

    public n0(n1 n1Var, long j6, long j10) {
        super(n1Var);
        this.f35654r = 0L;
        this.f35655s = null;
        this.f35647j = j6;
        this.f35648k = j10;
    }

    @Override // ug.h0
    /* renamed from: P */
    public final boolean mo13839P() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.n4 m14078Q(java.lang.String r45) throws java.lang.IllegalAccessException, java.security.NoSuchAlgorithmException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.n0.m14078Q(java.lang.String):ug.n4");
    }

    /* renamed from: R */
    public final void m14079R() {
        String str;
        mo325M();
        n1 n1Var = (n1) this.f482a;
        d1 d1Var = n1Var.f35668e;
        v0 v0Var = n1Var.f35669f;
        n1.m14083i(d1Var);
        if (d1Var.m13864T().m14213i(x1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            l4 l4Var = n1Var.f35672j;
            n1.m14083i(l4Var);
            l4Var.K0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            n1.m14085m(v0Var);
            v0Var.f35869n.m14140a("Analytics Storage consent is not granted");
            str = null;
        }
        n1.m14085m(v0Var);
        v0Var.f35869n.m14140a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f35653q = str;
        n1Var.f35674l.getClass();
        this.f35654r = System.currentTimeMillis();
    }

    /* renamed from: S */
    public final String m14080S() {
        m13936N();
        AbstractC6840z.m13036g(this.f35641c);
        return this.f35641c;
    }

    /* renamed from: T */
    public final String m14081T() {
        mo325M();
        m13936N();
        AbstractC6840z.m13036g(this.f35652p);
        return this.f35652p;
    }
}
