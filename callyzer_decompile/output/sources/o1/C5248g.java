package o1;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6750f;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.g */
/* loaded from: classes.dex */
public final class C5248g implements InterfaceC5247f, InterfaceC5249h {

    /* renamed from: a */
    public final float f25729a;

    /* renamed from: b */
    public final boolean f25730b;

    /* renamed from: c */
    public final InterfaceC2141e f25731c;

    /* renamed from: d */
    public final float f25732d;

    public C5248g(float f6, boolean z6, InterfaceC2141e interfaceC2141e) {
        this.f25729a = f6;
        this.f25730b = z6;
        this.f25731c = interfaceC2141e;
        this.f25732d = f6;
    }

    @Override // o1.InterfaceC5247f, o1.InterfaceC5249h
    /* renamed from: a */
    public final float mo10336a() {
        return this.f25732d;
    }

    @Override // o1.InterfaceC5249h
    /* renamed from: b */
    public final void mo10335b(InterfaceC6747c interfaceC6747c, int i10, int[] iArr, int[] iArr2) {
        mo10316c(interfaceC6747c, i10, iArr, EnumC6757m.Ltr, iArr2);
    }

    @Override // o1.InterfaceC5247f
    /* renamed from: c */
    public final void mo10316c(InterfaceC6747c interfaceC6747c, int i10, int[] iArr, EnumC6757m enumC6757m, int[] iArr2) {
        int i11;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iE0 = interfaceC6747c.e0(this.f25729a);
        boolean z6 = this.f25730b && enumC6757m == EnumC6757m.Rtl;
        C5243b c5243b = AbstractC5251j.f25757a;
        if (z6) {
            i11 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i12 = iArr[length];
                int iMin2 = Math.min(i11, i10 - i12);
                iArr2[length] = iMin2;
                iMin = Math.min(iE0, (i10 - iMin2) - i12);
                i11 = iArr2[length] + i12 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i13 = 0;
            i11 = 0;
            iMin = 0;
            int i14 = 0;
            while (i13 < length2) {
                int i15 = iArr[i13];
                int iMin3 = Math.min(i11, i10 - i15);
                iArr2[i14] = iMin3;
                int iMin4 = Math.min(iE0, (i10 - iMin3) - i15);
                int i16 = iArr2[i14] + i15 + iMin4;
                i13++;
                iMin = iMin4;
                i11 = i16;
                i14++;
            }
        }
        int i17 = i11 - iMin;
        InterfaceC2141e interfaceC2141e = this.f25731c;
        if (interfaceC2141e == null || i17 >= i10) {
            return;
        }
        int iIntValue = ((Number) interfaceC2141e.invoke(Integer.valueOf(i10 - i17), enumC6757m)).intValue();
        int length3 = iArr2.length;
        for (int i18 = 0; i18 < length3; i18++) {
            iArr2[i18] = iArr2[i18] + iIntValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5248g)) {
            return false;
        }
        C5248g c5248g = (C5248g) obj;
        return C6750f.m12935a(this.f25729a, c5248g.f25729a) && this.f25730b == c5248g.f25730b && AbstractC4154l.m8918a(this.f25731c, c5248g.f25731c);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(Float.hashCode(this.f25729a) * 31, 31, this.f25730b);
        InterfaceC2141e interfaceC2141e = this.f25731c;
        return iM4558e + (interfaceC2141e == null ? 0 : interfaceC2141e.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25730b ? "" : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) C6750f.m12936b(this.f25729a));
        sb2.append(", ");
        sb2.append(this.f25731c);
        sb2.append(')');
        return sb2.toString();
    }
}
