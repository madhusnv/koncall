package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.ht6;

/* loaded from: classes2.dex */
public abstract class ave {
    /* renamed from: a */
    public static final zue m17875a(int i, float f, float f2, float f3, m74 m74Var) {
        sq8.m48649h(m74Var, "rounding");
        return m17878d(i, f, f2, f3, m74Var, null, 32, null);
    }

    /* renamed from: b */
    public static final zue m17876b(int i, float f, float f2, float f3, m74 m74Var, List list) {
        sq8.m48649h(m74Var, "rounding");
        return m17877c(m17880f(i, f, f2, f3), m74Var, list, f2, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0255  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zue m17877c(float[] fArr, m74 m74Var, List list, float f, float f2) {
        long jM17879e;
        m74 m74Var2;
        sq8.m48649h(fArr, "vertices");
        sq8.m48649h(m74Var, "rounding");
        if (fArr.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i = 2;
        int i2 = 1;
        if (fArr.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != fArr.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < length) {
            m74 m74Var3 = (list == null || (m74Var2 = (m74) list.get(i3)) == null) ? m74Var : m74Var2;
            int i4 = (((i3 + length) - i2) % length) * 2;
            int i5 = i3 + 1;
            int i6 = (i5 % length) * 2;
            int i7 = i3 * 2;
            arrayList2.add(new xue(f37.m26029b(fArr[i4], fArr[i4 + i2]), f37.m26029b(fArr[i7], fArr[i7 + i2]), f37.m26029b(fArr[i6], fArr[i6 + i2]), m74Var3, null));
            i3 = i5;
            i2 = 1;
        }
        kl8 kl8VarM18616s = bce.m18616s(0, length);
        ArrayList arrayList3 = new ArrayList(dh3.m23088v(kl8VarM18616s, 10));
        Iterator it = kl8VarM18616s.iterator();
        while (it.hasNext()) {
            int iMo23412a = ((dl8) it).mo23412a();
            int i8 = (iMo23412a + 1) % length;
            float fM56845f = ((xue) arrayList2.get(iMo23412a)).m56845f() + ((xue) arrayList2.get(i8)).m56845f();
            float fM56844e = ((xue) arrayList2.get(iMo23412a)).m56844e() + ((xue) arrayList2.get(i8)).m56844e();
            int i9 = iMo23412a * 2;
            int i10 = i8 * 2;
            float fM29417d = gri.m29417d(fArr[i9] - fArr[i10], fArr[i9 + 1] - fArr[i10 + 1]);
            arrayList3.add(fM56845f > fM29417d ? vyh.m53620a(Float.valueOf(fM29417d / fM56845f), Float.valueOf(0.0f)) : fM56844e > fM29417d ? vyh.m53620a(Float.valueOf(1.0f), Float.valueOf((fM29417d - fM56845f) / (fM56844e - fM56845f))) : vyh.m53620a(Float.valueOf(1.0f), Float.valueOf(1.0f)));
        }
        for (int i11 = 0; i11 < length; i11++) {
            apb apbVar = new apb(2);
            for (int i12 = 0; i12 < 2; i12++) {
                hwc hwcVar = (hwc) arrayList3.get((((i11 + length) - 1) + i12) % length);
                apbVar.m17637h((((xue) arrayList2.get(i11)).m56845f() * ((Number) hwcVar.m31227a()).floatValue()) + ((((xue) arrayList2.get(i11)).m56844e() - ((xue) arrayList2.get(i11)).m56845f()) * ((Number) hwcVar.m31228b()).floatValue()));
            }
            arrayList.add(((xue) arrayList2.get(i11)).m56843d(apbVar.m31461b(0), apbVar.m31461b(1)));
        }
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13 + 1;
            int i15 = i14 % length;
            int i16 = i13 * 2;
            long jM26029b = f37.m26029b(fArr[i16], fArr[i16 + 1]);
            int i17 = (((i13 + length) - 1) % length) * i;
            long jM26029b2 = f37.m26029b(fArr[i17], fArr[i17 + 1]);
            int i18 = i15 * 2;
            arrayList4.add(new ht6.C14063a((List) arrayList.get(i13), jM26029b, ((xue) arrayList2.get(i13)).m56842c(), gcd.m28430a(gcd.m28439j(jM26029b, jM26029b2), gcd.m28439j(f37.m26029b(fArr[i18], fArr[i18 + 1]), jM26029b)), null));
            arrayList4.add(new ht6.C14064b(bh3.m18963e(yc4.f55209b.m57509b(((yc4) kh3.r0((List) arrayList.get(i13))).m57495d(), ((yc4) kh3.r0((List) arrayList.get(i13))).m57496e(), ((yc4) kh3.f0((List) arrayList.get(i15))).m57493b(), ((yc4) kh3.f0((List) arrayList.get(i15))).m57494c()))));
            i13 = i14;
            i = 2;
        }
        if (f == Float.MIN_VALUE) {
            jM17879e = m17879e(fArr);
        } else if (!(f2 == Float.MIN_VALUE)) {
            jM17879e = f37.m26029b(f, f2);
        }
        return new zue(arrayList4, Float.intBitsToFloat((int) (jM17879e >> 32)), Float.intBitsToFloat((int) (jM17879e & 4294967295L)));
    }

    /* renamed from: d */
    public static /* synthetic */ zue m17878d(int i, float f, float f2, float f3, m74 m74Var, List list, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        float f4 = (i2 & 4) != 0 ? 0.0f : f2;
        float f5 = (i2 & 8) == 0 ? f3 : 0.0f;
        if ((i2 & 16) != 0) {
            m74Var = m74.f34920d;
        }
        m74 m74Var2 = m74Var;
        if ((i2 & 32) != 0) {
            list = null;
        }
        return m17876b(i, f, f4, f5, m74Var2, list);
    }

    /* renamed from: e */
    public static final long m17879e(float[] fArr) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i = i2 + 1;
            f2 += fArr[i2];
        }
        float f3 = 2;
        return f37.m26029b((f / fArr.length) / f3, (f2 / fArr.length) / f3);
    }

    /* renamed from: f */
    public static final float[] m17880f(int i, float f, float f2, float f3) {
        float[] fArr = new float[i * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long jM28440k = gcd.m28440k(gri.m29425l(f, (gri.m29420g() / i) * 2 * i3, 0L, 4, null), f37.m26029b(f2, f3));
            int i4 = i2 + 1;
            fArr[i2] = gcd.m28436g(jM28440k);
            i2 = i4 + 1;
            fArr[i4] = gcd.m28437h(jM28440k);
        }
        return fArr;
    }
}
