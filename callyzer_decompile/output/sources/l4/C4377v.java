package l4;

import com.sun.mail.util.AbstractC1452a;
import fm.C2322a;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.v */
/* loaded from: classes.dex */
public final class C4377v implements InterfaceC4362g {

    /* renamed from: a */
    public final int f21937a;

    /* renamed from: b */
    public final int f21938b;

    public C4377v(int i10, int i11) {
        this.f21937a = i10;
        this.f21938b = i11;
    }

    @Override // l4.InterfaceC4362g
    /* renamed from: a */
    public final void mo9068a(C4363h c4363h) {
        boolean z6 = c4363h.f21905d != -1;
        C2322a c2322a = c4363h.f21902a;
        if (z6) {
            c4363h.f21905d = -1;
            c4363h.f21906e = -1;
        }
        int iM11912c = w9.m11912c(this.f21937a, 0, c2322a.m5992b());
        int iM11912c2 = w9.m11912c(this.f21938b, 0, c2322a.m5992b());
        if (iM11912c != iM11912c2) {
            if (iM11912c < iM11912c2) {
                c4363h.m9108e(iM11912c, iM11912c2);
            } else {
                c4363h.m9108e(iM11912c2, iM11912c);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4377v)) {
            return false;
        }
        C4377v c4377v = (C4377v) obj;
        return this.f21937a == c4377v.f21937a && this.f21938b == c4377v.f21938b;
    }

    public final int hashCode() {
        return (this.f21937a * 31) + this.f21938b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f21937a);
        sb2.append(", end=");
        return AbstractC1452a.m4563j(sb2, this.f21938b, ')');
    }
}
