package p001o;

/* loaded from: classes6.dex */
public final class eo7 {

    /* renamed from: a */
    public final do7 f21985a;

    /* renamed from: b */
    public final int[] f21986b;

    public eo7(do7 do7Var, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f21985a = do7Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f21986b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f21986b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f21986b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    public eo7 m25372a(eo7 eo7Var) {
        if (!this.f21985a.equals(eo7Var.f21985a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m25377f()) {
            return eo7Var;
        }
        if (eo7Var.m25377f()) {
            return this;
        }
        int[] iArr = this.f21986b;
        int[] iArr2 = eo7Var.f21986b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = do7.m23641a(iArr2[i - length], iArr[i]);
        }
        return new eo7(this.f21985a, iArr3);
    }

    /* renamed from: b */
    public eo7[] m25373b(eo7 eo7Var) {
        if (!this.f21985a.equals(eo7Var.f21985a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (eo7Var.m25377f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        eo7 eo7VarM23645e = this.f21985a.m23645e();
        int iM23646f = this.f21985a.m23646f(eo7Var.m25374c(eo7Var.m25376e()));
        eo7 eo7VarM25372a = this;
        while (eo7VarM25372a.m25376e() >= eo7Var.m25376e() && !eo7VarM25372a.m25377f()) {
            int iM25376e = eo7VarM25372a.m25376e() - eo7Var.m25376e();
            int iM23648h = this.f21985a.m23648h(eo7VarM25372a.m25374c(eo7VarM25372a.m25376e()), iM23646f);
            eo7 eo7VarM25379h = eo7Var.m25379h(iM25376e, iM23648h);
            eo7VarM23645e = eo7VarM23645e.m25372a(this.f21985a.m23642b(iM25376e, iM23648h));
            eo7VarM25372a = eo7VarM25372a.m25372a(eo7VarM25379h);
        }
        return new eo7[]{eo7VarM23645e, eo7VarM25372a};
    }

    /* renamed from: c */
    public int m25374c(int i) {
        return this.f21986b[(r0.length - 1) - i];
    }

    /* renamed from: d */
    public int[] m25375d() {
        return this.f21986b;
    }

    /* renamed from: e */
    public int m25376e() {
        return this.f21986b.length - 1;
    }

    /* renamed from: f */
    public boolean m25377f() {
        return this.f21986b[0] == 0;
    }

    /* renamed from: g */
    public eo7 m25378g(eo7 eo7Var) {
        if (!this.f21985a.equals(eo7Var.f21985a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m25377f() || eo7Var.m25377f()) {
            return this.f21985a.m23645e();
        }
        int[] iArr = this.f21986b;
        int length = iArr.length;
        int[] iArr2 = eo7Var.f21986b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = do7.m23641a(iArr3[i4], this.f21985a.m23648h(i2, iArr2[i3]));
            }
        }
        return new eo7(this.f21985a, iArr3);
    }

    /* renamed from: h */
    public eo7 m25379h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f21985a.m23645e();
        }
        int length = this.f21986b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f21985a.m23648h(this.f21986b[i3], i2);
        }
        return new eo7(this.f21985a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m25376e() * 8);
        for (int iM25376e = m25376e(); iM25376e >= 0; iM25376e--) {
            int iM25374c = m25374c(iM25376e);
            if (iM25374c != 0) {
                if (iM25374c < 0) {
                    sb.append(" - ");
                    iM25374c = -iM25374c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM25376e == 0 || iM25374c != 1) {
                    int iM23647g = this.f21985a.m23647g(iM25374c);
                    if (iM23647g == 0) {
                        sb.append('1');
                    } else if (iM23647g == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM23647g);
                    }
                }
                if (iM25376e != 0) {
                    if (iM25376e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM25376e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
