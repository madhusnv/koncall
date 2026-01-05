package p001o;

/* loaded from: classes2.dex */
public final class y16 {

    /* renamed from: c */
    public static final y16 f54702c = new y16(0, 0);

    /* renamed from: d */
    public static final y16 f54703d = new y16(1, 8);

    /* renamed from: e */
    public static final y16 f54704e = new y16(2, 10);

    /* renamed from: f */
    public static final y16 f54705f = new y16(3, 10);

    /* renamed from: g */
    public static final y16 f54706g = new y16(4, 10);

    /* renamed from: h */
    public static final y16 f54707h = new y16(5, 10);

    /* renamed from: i */
    public static final y16 f54708i = new y16(6, 10);

    /* renamed from: j */
    public static final y16 f54709j = new y16(6, 8);

    /* renamed from: a */
    public final int f54710a;

    /* renamed from: b */
    public final int f54711b;

    public y16(int i, int i2) {
        this.f54710a = i;
        this.f54711b = i2;
    }

    /* renamed from: c */
    public static String m57101c(int i) {
        switch (i) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    /* renamed from: a */
    public int m57102a() {
        return this.f54711b;
    }

    /* renamed from: b */
    public int m57103b() {
        return this.f54710a;
    }

    /* renamed from: d */
    public boolean m57104d() {
        return m57105e() && m57103b() != 1 && m57102a() == 10;
    }

    /* renamed from: e */
    public boolean m57105e() {
        return (m57103b() == 0 || m57103b() == 2 || m57102a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y16)) {
            return false;
        }
        y16 y16Var = (y16) obj;
        return this.f54710a == y16Var.m57103b() && this.f54711b == y16Var.m57102a();
    }

    public int hashCode() {
        return ((this.f54710a ^ 1000003) * 1000003) ^ this.f54711b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + m57101c(this.f54710a) + ", bitDepth=" + this.f54711b + "}";
    }
}
