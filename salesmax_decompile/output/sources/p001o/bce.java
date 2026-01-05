package p001o;

import java.util.NoSuchElementException;
import p001o.il8;

/* loaded from: classes6.dex */
public abstract class bce extends ace {
    /* renamed from: c */
    public static final float m18600c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: d */
    public static final int m18601d(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: e */
    public static final long m18602e(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: f */
    public static final float m18603f(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: g */
    public static final int m18604g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: h */
    public static final long m18605h(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: i */
    public static final double m18606i(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* renamed from: j */
    public static final float m18607j(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* renamed from: k */
    public static final int m18608k(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: l */
    public static final int m18609l(int i, xb3 xb3Var) {
        sq8.m48649h(xb3Var, "range");
        if (xb3Var instanceof wb3) {
            return ((Number) m18612o(Integer.valueOf(i), (wb3) xb3Var)).intValue();
        }
        if (!xb3Var.isEmpty()) {
            return i < ((Number) xb3Var.getStart()).intValue() ? ((Number) xb3Var.getStart()).intValue() : i > ((Number) xb3Var.getEndInclusive()).intValue() ? ((Number) xb3Var.getEndInclusive()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + xb3Var + '.');
    }

    /* renamed from: m */
    public static final long m18610m(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* renamed from: n */
    public static final long m18611n(long j, xb3 xb3Var) {
        sq8.m48649h(xb3Var, "range");
        if (xb3Var instanceof wb3) {
            return ((Number) m18612o(Long.valueOf(j), (wb3) xb3Var)).longValue();
        }
        if (!xb3Var.isEmpty()) {
            return j < ((Number) xb3Var.getStart()).longValue() ? ((Number) xb3Var.getStart()).longValue() : j > ((Number) xb3Var.getEndInclusive()).longValue() ? ((Number) xb3Var.getEndInclusive()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + xb3Var + '.');
    }

    /* renamed from: o */
    public static final Comparable m18612o(Comparable comparable, wb3 wb3Var) {
        sq8.m48649h(comparable, "<this>");
        sq8.m48649h(wb3Var, "range");
        if (!wb3Var.isEmpty()) {
            return (!wb3Var.mo52504d(comparable, wb3Var.getStart()) || wb3Var.mo52504d(wb3Var.getStart(), comparable)) ? (!wb3Var.mo52504d(wb3Var.getEndInclusive(), comparable) || wb3Var.mo52504d(comparable, wb3Var.getEndInclusive())) ? comparable : wb3Var.getEndInclusive() : wb3Var.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + wb3Var + '.');
    }

    /* renamed from: p */
    public static final il8 m18613p(int i, int i2) {
        return il8.f28814d.m32264a(i, i2, -1);
    }

    /* renamed from: q */
    public static final int m18614q(kl8 kl8Var, vbe vbeVar) {
        sq8.m48649h(kl8Var, "<this>");
        sq8.m48649h(vbeVar, "random");
        try {
            return ybe.m57475e(vbeVar, kl8Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: r */
    public static final il8 m18615r(il8 il8Var, int i) {
        sq8.m48649h(il8Var, "<this>");
        ace.m16884a(i > 0, Integer.valueOf(i));
        il8.C14312a c14312a = il8.f28814d;
        int iM32260e = il8Var.m32260e();
        int iM32261j = il8Var.m32261j();
        if (il8Var.m32262n() <= 0) {
            i = -i;
        }
        return c14312a.m32264a(iM32260e, iM32261j, i);
    }

    /* renamed from: s */
    public static final kl8 m18616s(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? kl8.f32367e.m35832a() : new kl8(i, i2 - 1);
    }
}
