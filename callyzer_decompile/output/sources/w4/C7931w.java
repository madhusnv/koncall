package w4;

import com.sun.mail.util.AbstractC1452a;
import k2.C3977z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.w */
/* loaded from: classes.dex */
public final class C7931w {

    /* renamed from: a */
    public final int f38145a;

    /* renamed from: b */
    public final boolean f38146b;

    /* renamed from: c */
    public final boolean f38147c;

    /* renamed from: d */
    public final boolean f38148d;

    /* renamed from: e */
    public final boolean f38149e;

    public C7931w(int i10, boolean z6, boolean z10, boolean z11) {
        this.f38145a = i10;
        this.f38146b = z6;
        this.f38147c = z10;
        this.f38148d = z11;
        this.f38149e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7931w)) {
            return false;
        }
        C7931w c7931w = (C7931w) obj;
        return this.f38145a == c7931w.f38145a && this.f38146b == c7931w.f38146b && this.f38147c == c7931w.f38147c && this.f38148d == c7931w.f38148d && this.f38149e == c7931w.f38149e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(this.f38145a * 31, 31, this.f38146b), 31, this.f38147c), 31, this.f38148d), 31, this.f38149e);
    }

    public C7931w(int i10) {
        this((i10 & 1) == 0, (i10 & 2) != 0, (i10 & 4) != 0, EnumC7932x.Inherit, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7931w(boolean z6, boolean z10, boolean z11, EnumC7932x enumC7932x, boolean z12) {
        C3977z c3977z = AbstractC7917i.f38098a;
        int i10 = !z6 ? 262152 : 262144;
        i10 = enumC7932x == EnumC7932x.SecureOn ? i10 | 8192 : i10;
        this(z12 ? i10 : i10 | 512, enumC7932x == EnumC7932x.Inherit, z10, z11);
    }
}
