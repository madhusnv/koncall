package k2;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a */
    public final v1 f20577a;

    /* renamed from: b */
    public final int[] f20578b;

    /* renamed from: c */
    public final int f20579c;

    /* renamed from: d */
    public final Object[] f20580d;

    /* renamed from: e */
    public final int f20581e;

    /* renamed from: f */
    public boolean f20582f;

    /* renamed from: g */
    public int f20583g;

    /* renamed from: h */
    public int f20584h;

    /* renamed from: i */
    public int f20585i;

    /* renamed from: j */
    public final l0 f20586j;

    /* renamed from: k */
    public int f20587k;

    /* renamed from: l */
    public int f20588l;

    /* renamed from: m */
    public int f20589m;

    /* renamed from: n */
    public boolean f20590n;

    public u1(v1 v1Var) {
        this.f20577a = v1Var;
        this.f20578b = v1Var.f20593a;
        int i10 = v1Var.f20594b;
        this.f20579c = i10;
        this.f20580d = v1Var.f20595c;
        this.f20581e = v1Var.f20596d;
        this.f20584h = i10;
        this.f20585i = -1;
        this.f20586j = new l0();
    }

    /* renamed from: a */
    public final C3952a m8682a(int i10) {
        ArrayList arrayList = this.f20577a.f20601j;
        int iM8709e = x1.m8709e(arrayList, i10, this.f20579c);
        if (iM8709e >= 0) {
            return (C3952a) arrayList.get(iM8709e);
        }
        C3952a c3952a = new C3952a(i10);
        arrayList.add(-(iM8709e + 1), c3952a);
        return c3952a;
    }

    /* renamed from: b */
    public final Object m8683b(int i10, int[] iArr) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f20580d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return C3961j.f20408a;
    }

    /* renamed from: c */
    public final void m8684c() {
        this.f20582f = true;
        v1 v1Var = this.f20577a;
        v1Var.getClass();
        if (this.f20577a != v1Var || v1Var.f20597e <= 0) {
            AbstractC3967p.m8636c("Unexpected reader close()");
        }
        v1Var.f20597e--;
    }

    /* renamed from: d */
    public final void m8685d() {
        if (this.f20587k == 0) {
            if (!(this.f20583g == this.f20584h)) {
                AbstractC3967p.m8636c("endGroup() not called at the end of a group");
            }
            int i10 = (this.f20585i * 5) + 2;
            int[] iArr = this.f20578b;
            int i11 = iArr[i10];
            this.f20585i = i11;
            int i12 = this.f20579c;
            this.f20584h = i11 < 0 ? i12 : x1.m8705a(i11, iArr) + i11;
            int iM8548b = this.f20586j.m8548b();
            if (iM8548b < 0) {
                this.f20588l = 0;
                this.f20589m = 0;
            } else {
                this.f20588l = iM8548b;
                this.f20589m = i11 >= i12 - 1 ? this.f20581e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    /* renamed from: e */
    public final Object m8686e() {
        int i10 = this.f20583g;
        if (i10 < this.f20584h) {
            return m8683b(i10, this.f20578b);
        }
        return 0;
    }

    /* renamed from: f */
    public final int m8687f() {
        int i10 = this.f20583g;
        if (i10 >= this.f20584h) {
            return 0;
        }
        return this.f20578b[i10 * 5];
    }

    /* renamed from: g */
    public final Object m8688g(int i10, int i11) {
        int[] iArr = this.f20578b;
        int iM8707c = x1.m8707c(i10, iArr);
        int i12 = i10 + 1;
        int i13 = iM8707c + i11;
        return i13 < (i12 < this.f20579c ? iArr[(i12 * 5) + 4] : this.f20581e) ? this.f20580d[i13] : C3961j.f20408a;
    }

    /* renamed from: h */
    public final boolean m8689h(int i10) {
        return (this.f20578b[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* renamed from: i */
    public final boolean m8690i(int i10) {
        return (this.f20578b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    /* renamed from: j */
    public final Object m8691j() {
        int i10;
        if (this.f20587k > 0 || (i10 = this.f20588l) >= this.f20589m) {
            this.f20590n = false;
            return C3961j.f20408a;
        }
        this.f20590n = true;
        this.f20588l = i10 + 1;
        return this.f20580d[i10];
    }

    /* renamed from: k */
    public final Object m8692k(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f20578b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 0) {
            return C3961j.f20408a;
        }
        return this.f20580d[iArr[i11 + 4]];
    }

    /* renamed from: l */
    public final int m8693l(int i10) {
        return this.f20578b[(i10 * 5) + 1] & 67108863;
    }

    /* renamed from: m */
    public final Object m8694m(int i10, int[] iArr) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f20580d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    /* renamed from: n */
    public final int m8695n(int i10) {
        return this.f20578b[(i10 * 5) + 2];
    }

    /* renamed from: o */
    public final void m8696o(int i10) {
        if (!(this.f20587k == 0)) {
            AbstractC3967p.m8636c("Cannot reposition while in an empty region");
        }
        this.f20583g = i10;
        int[] iArr = this.f20578b;
        int i11 = this.f20579c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        this.f20585i = i12;
        if (i12 < 0) {
            this.f20584h = i11;
        } else {
            this.f20584h = x1.m8705a(i12, iArr) + i12;
        }
        this.f20588l = 0;
        this.f20589m = 0;
    }

    /* renamed from: p */
    public final int m8697p() {
        if (!(this.f20587k == 0)) {
            AbstractC3967p.m8636c("Cannot skip while in an empty region");
        }
        int i10 = this.f20583g;
        int[] iArr = this.f20578b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f20583g = x1.m8705a(i10, iArr) + i10;
        return i11;
    }

    /* renamed from: q */
    public final void m8698q() {
        if (!(this.f20587k == 0)) {
            AbstractC3967p.m8636c("Cannot skip the enclosing group while in an empty region");
        }
        this.f20583g = this.f20584h;
        this.f20588l = 0;
        this.f20589m = 0;
    }

    /* renamed from: r */
    public final void m8699r() {
        if (this.f20587k <= 0) {
            int i10 = this.f20585i;
            int i11 = this.f20583g;
            int[] iArr = this.f20578b;
            if (!(iArr[(i11 * 5) + 2] == i10)) {
                j1.m8542a("Invalid slot table detected");
            }
            int i12 = this.f20588l;
            int i13 = this.f20589m;
            l0 l0Var = this.f20586j;
            if (i12 == 0 && i13 == 0) {
                l0Var.m8549c(-1);
            } else {
                l0Var.m8549c(i12);
            }
            this.f20585i = i11;
            this.f20584h = x1.m8705a(i11, iArr) + i11;
            int i14 = i11 + 1;
            this.f20583g = i14;
            this.f20588l = x1.m8707c(i11, iArr);
            this.f20589m = i11 >= this.f20579c - 1 ? this.f20581e : iArr[(i14 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f20583g);
        sb2.append(", key=");
        sb2.append(m8687f());
        sb2.append(", parent=");
        sb2.append(this.f20585i);
        sb2.append(", end=");
        return AbstractC1452a.m4563j(sb2, this.f20584h, ')');
    }
}
