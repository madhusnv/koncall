package p001o;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p001o.lnd;

/* loaded from: classes2.dex */
public abstract class mnd {
    /* renamed from: a */
    public static lnd m39389a(byte[] bArr, int i) {
        ArrayList arrayListM39394f;
        zwc zwcVar = new zwc(bArr);
        try {
            arrayListM39394f = m39391c(zwcVar) ? m39394f(zwcVar) : m39393e(zwcVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListM39394f = null;
        }
        if (arrayListM39394f == null) {
            return null;
        }
        int size = arrayListM39394f.size();
        if (size == 1) {
            return new lnd((lnd.C15111a) arrayListM39394f.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new lnd((lnd.C15111a) arrayListM39394f.get(0), (lnd.C15111a) arrayListM39394f.get(1), i);
    }

    /* renamed from: b */
    public static int m39390b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: c */
    public static boolean m39391c(zwc zwcVar) {
        zwcVar.m60018V(4);
        int iM60036q = zwcVar.m60036q();
        zwcVar.m60017U(0);
        return iM60036q == 1886547818;
    }

    /* renamed from: d */
    public static lnd.C15111a m39392d(zwc zwcVar) {
        int iM60036q = zwcVar.m60036q();
        if (iM60036q > 10000) {
            return null;
        }
        float[] fArr = new float[iM60036q];
        for (int i = 0; i < iM60036q; i++) {
            fArr[i] = zwcVar.m60035p();
        }
        int iM60036q2 = zwcVar.m60036q();
        if (iM60036q2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(iM60036q * 2.0d) / dLog);
        ywc ywcVar = new ywc(zwcVar.m60024e());
        int i2 = 8;
        ywcVar.m58452p(zwcVar.m60025f() * 8);
        float[] fArr2 = new float[iM60036q2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < iM60036q2) {
            int i6 = 0;
            while (i6 < i3) {
                int iM39390b = iArr[i6] + m39390b(ywcVar.m58444h(iCeil));
                if (iM39390b >= iM60036q || iM39390b < 0) {
                    return null;
                }
                fArr2[i5] = fArr[iM39390b];
                iArr[i6] = iM39390b;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        ywcVar.m58452p((ywcVar.m58441e() + 7) & (-8));
        int i7 = 32;
        int iM58444h = ywcVar.m58444h(32);
        lnd.C15112b[] c15112bArr = new lnd.C15112b[iM58444h];
        int i8 = 0;
        while (i8 < iM58444h) {
            int iM58444h2 = ywcVar.m58444h(i2);
            int iM58444h3 = ywcVar.m58444h(i2);
            int iM58444h4 = ywcVar.m58444h(i7);
            if (iM58444h4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(iM60036q2 * d) / dLog);
            float[] fArr3 = new float[iM58444h4 * 3];
            float[] fArr4 = new float[iM58444h4 * 2];
            int iM39390b2 = 0;
            for (int i9 = 0; i9 < iM58444h4; i9++) {
                iM39390b2 += m39390b(ywcVar.m58444h(iCeil2));
                if (iM39390b2 < 0 || iM39390b2 >= iM60036q2) {
                    return null;
                }
                int i10 = i9 * 3;
                int i11 = iM39390b2 * 5;
                fArr3[i10] = fArr2[i11];
                fArr3[i10 + 1] = fArr2[i11 + 1];
                fArr3[i10 + 2] = fArr2[i11 + 2];
                int i12 = i9 * 2;
                fArr4[i12] = fArr2[i11 + 3];
                fArr4[i12 + 1] = fArr2[i11 + 4];
            }
            c15112bArr[i8] = new lnd.C15112b(iM58444h2, fArr3, fArr4, iM58444h3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new lnd.C15111a(c15112bArr);
    }

    /* renamed from: e */
    public static ArrayList m39393e(zwc zwcVar) {
        if (zwcVar.m60004H() != 0) {
            return null;
        }
        zwcVar.m60018V(7);
        int iM60036q = zwcVar.m60036q();
        if (iM60036q == 1684433976) {
            zwc zwcVar2 = new zwc();
            Inflater inflater = new Inflater(true);
            try {
                if (!sqi.A0(zwcVar, zwcVar2, inflater)) {
                    return null;
                }
                inflater.end();
                zwcVar = zwcVar2;
            } finally {
                inflater.end();
            }
        } else if (iM60036q != 1918990112) {
            return null;
        }
        return m39395g(zwcVar);
    }

    /* renamed from: f */
    public static ArrayList m39394f(zwc zwcVar) {
        int iM60036q;
        zwcVar.m60018V(8);
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        while (iM60025f < iM60026g && (iM60036q = zwcVar.m60036q() + iM60025f) > iM60025f && iM60036q <= iM60026g) {
            int iM60036q2 = zwcVar.m60036q();
            if (iM60036q2 == 2037673328 || iM60036q2 == 1836279920) {
                zwcVar.m60016T(iM60036q);
                return m39393e(zwcVar);
            }
            zwcVar.m60017U(iM60036q);
            iM60025f = iM60036q;
        }
        return null;
    }

    /* renamed from: g */
    public static ArrayList m39395g(zwc zwcVar) {
        ArrayList arrayList = new ArrayList();
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        while (iM60025f < iM60026g) {
            int iM60036q = zwcVar.m60036q() + iM60025f;
            if (iM60036q <= iM60025f || iM60036q > iM60026g) {
                return null;
            }
            if (zwcVar.m60036q() == 1835365224) {
                lnd.C15111a c15111aM39392d = m39392d(zwcVar);
                if (c15111aM39392d == null) {
                    return null;
                }
                arrayList.add(c15111aM39392d);
            }
            zwcVar.m60017U(iM60036q);
            iM60025f = iM60036q;
        }
        return arrayList;
    }
}
