package b2;

import com.sun.mail.util.AbstractC1452a;
import r4.EnumC6455j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.q */
/* loaded from: classes.dex */
public final class C0559q {

    /* renamed from: a */
    public final EnumC6455j f3800a;

    /* renamed from: b */
    public final int f3801b;

    /* renamed from: c */
    public final long f3802c;

    public C0559q(EnumC6455j enumC6455j, int i10, long j6) {
        this.f3800a = enumC6455j;
        this.f3801b = i10;
        this.f3802c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0559q)) {
            return false;
        }
        C0559q c0559q = (C0559q) obj;
        return this.f3800a == c0559q.f3800a && this.f3801b == c0559q.f3801b && this.f3802c == c0559q.f3802c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3802c) + AbstractC1452a.m4556c(this.f3801b, this.f3800a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f3800a + ", offset=" + this.f3801b + ", selectableId=" + this.f3802c + ')';
    }
}
