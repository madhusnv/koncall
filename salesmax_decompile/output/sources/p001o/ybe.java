package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes6.dex */
public abstract class ybe {
    /* renamed from: a */
    public static final String m57471a(Object obj, Object obj2) {
        sq8.m48649h(obj, Constants.MessagePayloadKeys.FROM);
        sq8.m48649h(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: b */
    public static final void m57472b(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(m57471a(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* renamed from: c */
    public static final void m57473c(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m57471a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: d */
    public static final int m57474d(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: e */
    public static final int m57475e(vbe vbeVar, kl8 kl8Var) {
        sq8.m48649h(vbeVar, "<this>");
        sq8.m48649h(kl8Var, "range");
        if (!kl8Var.isEmpty()) {
            return kl8Var.m32261j() < Integer.MAX_VALUE ? vbeVar.mo18508h(kl8Var.m32260e(), kl8Var.m32261j() + 1) : kl8Var.m32260e() > Integer.MIN_VALUE ? vbeVar.mo18508h(kl8Var.m32260e() - 1, kl8Var.m32261j()) + 1 : vbeVar.mo22612f();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + kl8Var);
    }

    /* renamed from: f */
    public static final int m57476f(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
