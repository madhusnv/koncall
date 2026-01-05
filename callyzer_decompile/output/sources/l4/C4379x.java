package l4;

import com.sun.mail.util.AbstractC1452a;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.x */
/* loaded from: classes.dex */
public final class C4379x implements InterfaceC4362g {

    /* renamed from: a */
    public final int f21941a;

    /* renamed from: b */
    public final int f21942b;

    public C4379x(int i10, int i11) {
        this.f21941a = i10;
        this.f21942b = i11;
    }

    @Override // l4.InterfaceC4362g
    /* renamed from: a */
    public final void mo9068a(C4363h c4363h) {
        int iM11912c = w9.m11912c(this.f21941a, 0, c4363h.f21902a.m5992b());
        int iM11912c2 = w9.m11912c(this.f21942b, 0, c4363h.f21902a.m5992b());
        if (iM11912c < iM11912c2) {
            c4363h.m9109f(iM11912c, iM11912c2);
        } else {
            c4363h.m9109f(iM11912c2, iM11912c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4379x)) {
            return false;
        }
        C4379x c4379x = (C4379x) obj;
        return this.f21941a == c4379x.f21941a && this.f21942b == c4379x.f21942b;
    }

    public final int hashCode() {
        return (this.f21941a * 31) + this.f21942b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f21941a);
        sb2.append(", end=");
        return AbstractC1452a.m4563j(sb2, this.f21942b, ')');
    }
}
