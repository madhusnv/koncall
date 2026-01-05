package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.zue;

/* loaded from: classes2.dex */
public abstract class vlf {
    /* renamed from: a */
    public static final zue m52949a(zue.C18710a c18710a) {
        sq8.m48649h(c18710a, "<this>");
        return m52952d(c18710a, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    /* renamed from: b */
    public static final zue m52950b(zue.C18710a c18710a, int i) {
        sq8.m48649h(c18710a, "<this>");
        return m52952d(c18710a, i, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: c */
    public static final zue m52951c(zue.C18710a c18710a, int i, float f, float f2, float f3) {
        sq8.m48649h(c18710a, "<this>");
        if (i >= 3) {
            return ave.m17878d(i, f / ((float) Math.cos(gri.m29420g() / i)), f2, f3, new m74(f, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    /* renamed from: d */
    public static /* synthetic */ zue m52952d(zue.C18710a c18710a, int i, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        return m52951c(c18710a, i, f, f2, f3);
    }

    /* renamed from: e */
    public static final zue m52953e(zue.C18710a c18710a, float f, float f2, m74 m74Var, List list, float f3, float f4) {
        sq8.m48649h(c18710a, "<this>");
        sq8.m48649h(m74Var, "rounding");
        float f5 = 2;
        float f6 = f / f5;
        float f7 = f3 - f6;
        float f8 = f2 / f5;
        float f9 = f4 - f8;
        float f10 = f6 + f3;
        float f11 = f8 + f4;
        return ave.m17877c(new float[]{f10, f11, f7, f11, f7, f9, f10, f9}, m74Var, list, f3, f4);
    }

    /* renamed from: f */
    public static final zue m52954f(zue.C18710a c18710a, int i, float f, float f2, m74 m74Var) {
        sq8.m48649h(c18710a, "<this>");
        sq8.m48649h(m74Var, "rounding");
        return m52956h(c18710a, i, f, f2, m74Var, null, null, 0.0f, 0.0f, 240, null);
    }

    /* renamed from: g */
    public static final zue m52955g(zue.C18710a c18710a, int i, float f, float f2, m74 m74Var, m74 m74Var2, List list, float f3, float f4) {
        sq8.m48649h(c18710a, "<this>");
        sq8.m48649h(m74Var, "rounding");
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f2 >= f) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        if (list == null && m74Var2 != null) {
            kl8 kl8VarM18616s = bce.m18616s(0, i);
            list = new ArrayList();
            Iterator it = kl8VarM18616s.iterator();
            while (it.hasNext()) {
                ((dl8) it).mo23412a();
                hh3.m30441A(list, ch3.m21249n(m74Var, m74Var2));
            }
        }
        return ave.m17877c(m52957i(i, f, f2, f3, f4), m74Var, list, f3, f4);
    }

    /* renamed from: h */
    public static /* synthetic */ zue m52956h(zue.C18710a c18710a, int i, float f, float f2, m74 m74Var, m74 m74Var2, List list, float f3, float f4, int i2, Object obj) {
        return m52955g(c18710a, i, (i2 & 2) != 0 ? 1.0f : f, (i2 & 4) != 0 ? 0.5f : f2, (i2 & 8) != 0 ? m74.f34920d : m74Var, (i2 & 16) != 0 ? null : m74Var2, (i2 & 32) == 0 ? list : null, (i2 & 64) != 0 ? 0.0f : f3, (i2 & 128) == 0 ? f4 : 0.0f);
    }

    /* renamed from: i */
    public static final float[] m52957i(int i, float f, float f2, float f3, float f4) {
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f5 = i;
            long jM29425l = gri.m29425l(f, (gri.m29420g() / f5) * 2 * i3, 0L, 4, null);
            int i4 = i2 + 1;
            fArr[i2] = gcd.m28436g(jM29425l) + f3;
            int i5 = i4 + 1;
            fArr[i4] = gcd.m28437h(jM29425l) + f4;
            long jM29425l2 = gri.m29425l(f2, (gri.m29420g() / f5) * ((i3 * 2) + 1), 0L, 4, null);
            int i6 = i5 + 1;
            fArr[i5] = gcd.m28436g(jM29425l2) + f3;
            i2 = i6 + 1;
            fArr[i6] = gcd.m28437h(jM29425l2) + f4;
        }
        return fArr;
    }
}
