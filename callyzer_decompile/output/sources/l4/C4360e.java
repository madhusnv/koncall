package l4;

import com.sun.mail.util.AbstractC1452a;
import fm.C2322a;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.e */
/* loaded from: classes.dex */
public final class C4360e implements InterfaceC4362g {

    /* renamed from: a */
    public final int f21882a;

    /* renamed from: b */
    public final int f21883b;

    public C4360e(int i10, int i11) {
        this.f21882a = i10;
        this.f21883b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        AbstractC4646a.m9525a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // l4.InterfaceC4362g
    /* renamed from: a */
    public final void mo9068a(C4363h c4363h) {
        int i10 = c4363h.f21904c;
        C2322a c2322a = c4363h.f21902a;
        int i11 = this.f21883b;
        int iM5992b = i10 + i11;
        if (((i10 ^ iM5992b) & (i11 ^ iM5992b)) < 0) {
            iM5992b = c2322a.m5992b();
        }
        c4363h.m9104a(c4363h.f21904c, Math.min(iM5992b, c2322a.m5992b()));
        int i12 = c4363h.f21903b;
        int i13 = this.f21882a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        c4363h.m9104a(Math.max(0, i14), c4363h.f21903b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4360e)) {
            return false;
        }
        C4360e c4360e = (C4360e) obj;
        return this.f21882a == c4360e.f21882a && this.f21883b == c4360e.f21883b;
    }

    public final int hashCode() {
        return (this.f21882a * 31) + this.f21883b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f21882a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC1452a.m4563j(sb2, this.f21883b, ')');
    }
}
