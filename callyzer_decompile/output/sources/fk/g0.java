package fk;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final String f10392a;

    /* renamed from: b */
    public final int f10393b;

    /* renamed from: c */
    public final int f10394c;

    /* renamed from: d */
    public final boolean f10395d;

    public g0(String str, int i10, int i11, boolean z6) {
        this.f10392a = str;
        this.f10393b = i10;
        this.f10394c = i11;
        this.f10395d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return AbstractC4154l.m8918a(this.f10392a, g0Var.f10392a) && this.f10393b == g0Var.f10393b && this.f10394c == g0Var.f10394c && this.f10395d == g0Var.f10395d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10395d) + AbstractC1452a.m4556c(this.f10394c, AbstractC1452a.m4556c(this.f10393b, this.f10392a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f10392a);
        sb2.append(", pid=");
        sb2.append(this.f10393b);
        sb2.append(", importance=");
        sb2.append(this.f10394c);
        sb2.append(", isDefaultProcess=");
        return i0.m0.m7382o(sb2, this.f10395d, ')');
    }
}
