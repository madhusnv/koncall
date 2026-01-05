package p001o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
public final class mbf extends zq1 {

    /* renamed from: f */
    public final transient byte[][] f35123f;

    /* renamed from: g */
    public final transient int[] f35124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbf(byte[][] bArr, int[] iArr) {
        super(zq1.f57498e.m59700j());
        sq8.m48649h(bArr, "segments");
        sq8.m48649h(iArr, "directory");
        this.f35123f = bArr;
        this.f35124g = iArr;
    }

    private final Object writeReplace() {
        zq1 zq1VarM38693V = m38693V();
        sq8.m48647f(zq1VarM38693V, "null cannot be cast to non-null type java.lang.Object");
        return zq1VarM38693V;
    }

    @Override // p001o.zq1
    /* renamed from: B */
    public int mo38684B(byte[] bArr, int i) {
        sq8.m48649h(bArr, "other");
        return m38693V().mo38684B(bArr, i);
    }

    @Override // p001o.zq1
    /* renamed from: E */
    public boolean mo38685E(int i, zq1 zq1Var, int i2, int i3) {
        sq8.m48649h(zq1Var, "other");
        if (i < 0 || i > m59694L() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM23985b = AbstractC13066e.m23985b(this, i);
        while (i < i4) {
            int i5 = iM23985b == 0 ? 0 : m38691T()[iM23985b - 1];
            int i6 = m38691T()[iM23985b] - i5;
            int i7 = m38691T()[m38692U().length + iM23985b];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!zq1Var.mo38686F(i2, m38692U()[iM23985b], i7 + (i - i5), iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM23985b++;
        }
        return true;
    }

    @Override // p001o.zq1
    /* renamed from: F */
    public boolean mo38686F(int i, byte[] bArr, int i2, int i3) {
        sq8.m48649h(bArr, "other");
        if (i < 0 || i > m59694L() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM23985b = AbstractC13066e.m23985b(this, i);
        while (i < i4) {
            int i5 = iM23985b == 0 ? 0 : m38691T()[iM23985b - 1];
            int i6 = m38691T()[iM23985b] - i5;
            int i7 = m38691T()[m38692U().length + iM23985b];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!AbstractC13298f.m25884a(m38692U()[iM23985b], i7 + (i - i5), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM23985b++;
        }
        return true;
    }

    @Override // p001o.zq1
    /* renamed from: N */
    public zq1 mo38687N(int i, int i2) {
        int iM25888e = AbstractC13298f.m25888e(this, i2);
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (!(iM25888e <= m59694L())) {
            throw new IllegalArgumentException(("endIndex=" + iM25888e + " > length(" + m59694L() + ')').toString());
        }
        int i3 = iM25888e - i;
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + iM25888e + " < beginIndex=" + i).toString());
        }
        if (i == 0 && iM25888e == m59694L()) {
            return this;
        }
        if (i == iM25888e) {
            return zq1.f57498e;
        }
        int iM23985b = AbstractC13066e.m23985b(this, i);
        int iM23985b2 = AbstractC13066e.m23985b(this, iM25888e - 1);
        byte[][] bArr = (byte[][]) fp0.m27266o(m38692U(), iM23985b, iM23985b2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iM23985b <= iM23985b2) {
            int i4 = 0;
            int i5 = iM23985b;
            while (true) {
                iArr[i4] = Math.min(m38691T()[i5] - i, i3);
                int i6 = i4 + 1;
                iArr[i4 + bArr.length] = m38691T()[m38692U().length + i5];
                if (i5 == iM23985b2) {
                    break;
                }
                i5++;
                i4 = i6;
            }
        }
        int i7 = iM23985b != 0 ? m38691T()[iM23985b - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i7);
        return new mbf(bArr, iArr);
    }

    @Override // p001o.zq1
    /* renamed from: P */
    public zq1 mo38688P() {
        return m38693V().mo38688P();
    }

    @Override // p001o.zq1
    /* renamed from: Q */
    public byte[] mo38689Q() {
        byte[] bArr = new byte[m59694L()];
        int length = m38692U().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m38691T()[length + i];
            int i5 = m38691T()[i];
            int i6 = i5 - i2;
            fp0.m27256e(m38692U()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p001o.zq1
    /* renamed from: S */
    public void mo38690S(rl1 rl1Var, int i, int i2) {
        sq8.m48649h(rl1Var, "buffer");
        int i3 = i + i2;
        int iM23985b = AbstractC13066e.m23985b(this, i);
        while (i < i3) {
            int i4 = iM23985b == 0 ? 0 : m38691T()[iM23985b - 1];
            int i5 = m38691T()[iM23985b] - i4;
            int i6 = m38691T()[m38692U().length + iM23985b];
            int iMin = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            hbf hbfVar = new hbf(m38692U()[iM23985b], i7, i7 + iMin, true, false);
            hbf hbfVar2 = rl1Var.f43757a;
            if (hbfVar2 == null) {
                hbfVar.f26593g = hbfVar;
                hbfVar.f26592f = hbfVar;
                rl1Var.f43757a = hbfVar;
            } else {
                sq8.m48646e(hbfVar2);
                hbf hbfVar3 = hbfVar2.f26593g;
                sq8.m48646e(hbfVar3);
                hbfVar3.m30155c(hbfVar);
            }
            i += iMin;
            iM23985b++;
        }
        rl1Var.m46911Y(rl1Var.f0() + i2);
    }

    /* renamed from: T */
    public final int[] m38691T() {
        return this.f35124g;
    }

    /* renamed from: U */
    public final byte[][] m38692U() {
        return this.f35123f;
    }

    /* renamed from: V */
    public final zq1 m38693V() {
        return new zq1(mo38689Q());
    }

    @Override // p001o.zq1
    /* renamed from: a */
    public String mo38694a() {
        return m38693V().mo38694a();
    }

    @Override // p001o.zq1
    /* renamed from: d */
    public zq1 mo38695d(String str) throws NoSuchAlgorithmException {
        sq8.m48649h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m38692U().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m38691T()[length + i];
            int i4 = m38691T()[i];
            messageDigest.update(m38692U()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        sq8.m48646e(bArrDigest);
        return new zq1(bArrDigest);
    }

    @Override // p001o.zq1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zq1) {
            zq1 zq1Var = (zq1) obj;
            if (zq1Var.m59694L() == m59694L() && mo38685E(0, zq1Var, 0, m59694L())) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.zq1
    public int hashCode() {
        int iM59701m = m59701m();
        if (iM59701m != 0) {
            return iM59701m;
        }
        int length = m38692U().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = m38691T()[length + i];
            int i5 = m38691T()[i];
            byte[] bArr = m38692U()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        m59690G(i2);
        return i2;
    }

    @Override // p001o.zq1
    /* renamed from: o */
    public int mo38696o() {
        return m38691T()[m38692U().length - 1];
    }

    @Override // p001o.zq1
    /* renamed from: s */
    public String mo38697s() {
        return m38693V().mo38697s();
    }

    @Override // p001o.zq1
    public String toString() {
        return m38693V().toString();
    }

    @Override // p001o.zq1
    /* renamed from: u */
    public int mo38698u(byte[] bArr, int i) {
        sq8.m48649h(bArr, "other");
        return m38693V().mo38698u(bArr, i);
    }

    @Override // p001o.zq1
    /* renamed from: y */
    public byte[] mo38699y() {
        return mo38689Q();
    }

    @Override // p001o.zq1
    /* renamed from: z */
    public byte mo38700z(int i) {
        AbstractC13298f.m25885b(m38691T()[m38692U().length - 1], i, 1L);
        int iM23985b = AbstractC13066e.m23985b(this, i);
        return m38692U()[iM23985b][(i - (iM23985b == 0 ? 0 : m38691T()[iM23985b - 1])) + m38691T()[m38692U().length + iM23985b]];
    }
}
