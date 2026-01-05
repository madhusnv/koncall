package c9;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.g */
/* loaded from: classes.dex */
public final class C0912g {

    /* renamed from: a */
    public final String f5581a;

    /* renamed from: b */
    public final int f5582b;

    /* renamed from: c */
    public final int f5583c;

    public C0912g(String workSpecId, int i10, int i11) {
        AbstractC4154l.m8923f(workSpecId, "workSpecId");
        this.f5581a = workSpecId;
        this.f5582b = i10;
        this.f5583c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0912g)) {
            return false;
        }
        C0912g c0912g = (C0912g) obj;
        return AbstractC4154l.m8918a(this.f5581a, c0912g.f5581a) && this.f5582b == c0912g.f5582b && this.f5583c == c0912g.f5583c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5583c) + AbstractC1452a.m4556c(this.f5582b, this.f5581a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f5581a);
        sb2.append(", generation=");
        sb2.append(this.f5582b);
        sb2.append(", systemId=");
        return AbstractC1452a.m4563j(sb2, this.f5583c, ')');
    }
}
