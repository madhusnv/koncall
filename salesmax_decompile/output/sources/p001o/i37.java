package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class i37 {

    /* renamed from: a */
    public float[] f27981a;

    /* renamed from: b */
    public int f27982b;

    public /* synthetic */ i37(int i, id5 id5Var) {
        this(i);
    }

    /* renamed from: f */
    public static /* synthetic */ String m31459f(i37 i37Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        return i37Var.m31464e(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    /* renamed from: a */
    public final float m31460a() {
        if (m31463d()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.f27981a[0];
    }

    /* renamed from: b */
    public final float m31461b(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f27982b) {
            z = true;
        }
        if (z) {
            return this.f27981a[i];
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this.f27982b - 1));
    }

    /* renamed from: c */
    public final int m31462c() {
        return this.f27982b;
    }

    /* renamed from: d */
    public final boolean m31463d() {
        return this.f27982b == 0;
    }

    /* renamed from: e */
    public final String m31464e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f27981a;
        int i2 = this.f27982b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append(charSequence3);
                break;
            }
            float f = fArr[i3];
            if (i3 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i3 != 0) {
                sb.append(charSequence);
            }
            sb.append(f);
            i3++;
        }
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i37) {
            i37 i37Var = (i37) obj;
            int i = i37Var.f27982b;
            int i2 = this.f27982b;
            if (i == i2) {
                float[] fArr = this.f27981a;
                float[] fArr2 = i37Var.f27981a;
                kl8 kl8VarM18616s = bce.m18616s(0, i2);
                int iM32260e = kl8VarM18616s.m32260e();
                int iM32261j = kl8VarM18616s.m32261j();
                if (iM32260e <= iM32261j) {
                    while (true) {
                        if (!(fArr[iM32260e] == fArr2[iM32260e])) {
                            return false;
                        }
                        if (iM32260e == iM32261j) {
                            break;
                        }
                        iM32260e++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final float m31465g() {
        if (m31463d()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.f27981a[this.f27982b - 1];
    }

    public int hashCode() {
        float[] fArr = this.f27981a;
        int i = this.f27982b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return m31459f(this, null, "[", "]", 0, null, 25, null);
    }

    public i37(int i) {
        this.f27981a = i == 0 ? o37.m41495a() : new float[i];
    }
}
