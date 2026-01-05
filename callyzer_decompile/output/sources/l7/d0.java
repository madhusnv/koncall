package l7;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final boolean f22016a;

    /* renamed from: b */
    public final boolean f22017b;

    /* renamed from: c */
    public final int f22018c;

    /* renamed from: d */
    public final boolean f22019d;

    /* renamed from: e */
    public final boolean f22020e;

    /* renamed from: f */
    public final int f22021f;

    /* renamed from: g */
    public final int f22022g;

    /* renamed from: h */
    public final int f22023h;

    /* renamed from: i */
    public final int f22024i;

    /* renamed from: j */
    public String f22025j;

    public d0(boolean z6, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, int i13, int i14) {
        this.f22016a = z6;
        this.f22017b = z10;
        this.f22018c = i10;
        this.f22019d = z11;
        this.f22020e = z12;
        this.f22021f = i11;
        this.f22022g = i12;
        this.f22023h = i13;
        this.f22024i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f22016a == d0Var.f22016a && this.f22017b == d0Var.f22017b && this.f22018c == d0Var.f22018c && AbstractC4154l.m8918a(this.f22025j, d0Var.f22025j) && this.f22019d == d0Var.f22019d && this.f22020e == d0Var.f22020e && this.f22021f == d0Var.f22021f && this.f22022g == d0Var.f22022g && this.f22023h == d0Var.f22023h && this.f22024i == d0Var.f22024i;
    }

    public final int hashCode() {
        int i10 = (((((this.f22016a ? 1 : 0) * 31) + (this.f22017b ? 1 : 0)) * 31) + this.f22018c) * 31;
        String str = this.f22025j;
        return ((((((((((((i10 + (str != null ? str.hashCode() : 0)) * 29791) + (this.f22019d ? 1 : 0)) * 31) + (this.f22020e ? 1 : 0)) * 31) + this.f22021f) * 31) + this.f22022g) * 31) + this.f22023h) * 31) + this.f22024i;
    }

    public final String toString() {
        String str = this.f22025j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d0.class.getSimpleName());
        sb2.append("(");
        if (this.f22016a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f22017b) {
            sb2.append("restoreState ");
        }
        if ((str != null || this.f22018c != -1) && str != null) {
            sb2.append("popUpTo(");
            sb2.append(str);
            if (this.f22019d) {
                sb2.append(" inclusive");
            }
            if (this.f22020e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        int i10 = this.f22024i;
        int i11 = this.f22023h;
        int i12 = this.f22022g;
        int i13 = this.f22021f;
        if (i13 != -1 || i12 != -1 || i11 != -1 || i10 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i13));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(")");
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
