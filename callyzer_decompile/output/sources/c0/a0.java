package c0;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c */
    public static final a0 f5034c = new a0(0, 0);

    /* renamed from: d */
    public static final a0 f5035d = new a0(1, 8);

    /* renamed from: e */
    public static final a0 f5036e = new a0(3, 10);

    /* renamed from: f */
    public static final a0 f5037f = new a0(4, 10);

    /* renamed from: g */
    public static final a0 f5038g = new a0(5, 10);

    /* renamed from: h */
    public static final a0 f5039h = new a0(6, 10);

    /* renamed from: i */
    public static final a0 f5040i = new a0(6, 8);

    /* renamed from: a */
    public final int f5041a;

    /* renamed from: b */
    public final int f5042b;

    public a0(int i10, int i11) {
        this.f5041a = i10;
        this.f5042b = i11;
    }

    /* renamed from: a */
    public final boolean m2138a() {
        return m2139b() && this.f5041a != 1 && this.f5042b == 10;
    }

    /* renamed from: b */
    public final boolean m2139b() {
        int i10 = this.f5041a;
        return (i10 == 0 || i10 == 2 || this.f5042b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f5041a == a0Var.f5041a && this.f5042b == a0Var.f5042b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5041a ^ 1000003) * 1000003) ^ this.f5042b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.f5041a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return AbstractC5601a.m11233d(this.f5042b, "}", sb2);
    }
}
