package l4;

import com.sun.mail.util.AbstractC1452a;
import fm.C2322a;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.f */
/* loaded from: classes.dex */
public final class C4361f implements InterfaceC4362g {

    /* renamed from: a */
    public final int f21898a;

    /* renamed from: b */
    public final int f21899b;

    public C4361f(int i10, int i11) {
        this.f21898a = i10;
        this.f21899b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        AbstractC4646a.m9525a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // l4.InterfaceC4362g
    /* renamed from: a */
    public final void mo9068a(C4363h c4363h) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < this.f21898a) {
                int i13 = i12 + 1;
                int i14 = c4363h.f21903b;
                if (i14 <= i13) {
                    i12 = i14;
                    break;
                } else {
                    i12 = (Character.isHighSurrogate(c4363h.m9105b((i14 - i13) + (-1))) && Character.isLowSurrogate(c4363h.m9105b(c4363h.f21903b - i13))) ? i12 + 2 : i13;
                    i11++;
                }
            } else {
                break;
            }
        }
        int iM5992b = 0;
        while (true) {
            if (i10 >= this.f21899b) {
                break;
            }
            int i15 = iM5992b + 1;
            int i16 = c4363h.f21904c;
            C2322a c2322a = c4363h.f21902a;
            if (i16 + i15 >= c2322a.m5992b()) {
                iM5992b = c2322a.m5992b() - c4363h.f21904c;
                break;
            } else {
                iM5992b = (Character.isHighSurrogate(c4363h.m9105b((c4363h.f21904c + i15) + (-1))) && Character.isLowSurrogate(c4363h.m9105b(c4363h.f21904c + i15))) ? iM5992b + 2 : i15;
                i10++;
            }
        }
        int i17 = c4363h.f21904c;
        c4363h.m9104a(i17, iM5992b + i17);
        int i18 = c4363h.f21903b;
        c4363h.m9104a(i18 - i12, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4361f)) {
            return false;
        }
        C4361f c4361f = (C4361f) obj;
        return this.f21898a == c4361f.f21898a && this.f21899b == c4361f.f21899b;
    }

    public final int hashCode() {
        return (this.f21898a * 31) + this.f21899b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f21898a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC1452a.m4563j(sb2, this.f21899b, ')');
    }
}
