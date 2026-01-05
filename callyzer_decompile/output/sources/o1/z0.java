package o1;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public final int f25894a;

    /* renamed from: b */
    public final int f25895b;

    /* renamed from: c */
    public final int f25896c;

    /* renamed from: d */
    public final int f25897d;

    public z0(int i10, int i11, int i12, int i13) {
        this.f25894a = i10;
        this.f25895b = i11;
        this.f25896c = i12;
        this.f25897d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f25894a == z0Var.f25894a && this.f25895b == z0Var.f25895b && this.f25896c == z0Var.f25896c && this.f25897d == z0Var.f25897d;
    }

    public final int hashCode() {
        return (((((this.f25894a * 31) + this.f25895b) * 31) + this.f25896c) * 31) + this.f25897d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f25894a);
        sb2.append(", top=");
        sb2.append(this.f25895b);
        sb2.append(", right=");
        sb2.append(this.f25896c);
        sb2.append(", bottom=");
        return AbstractC1452a.m4563j(sb2, this.f25897d, ')');
    }
}
