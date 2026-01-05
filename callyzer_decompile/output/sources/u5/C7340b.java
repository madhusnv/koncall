package u5;

import android.graphics.Insets;
import b9.AbstractC0630b;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u5.b */
/* loaded from: classes.dex */
public final class C7340b {

    /* renamed from: e */
    public static final C7340b f34956e = new C7340b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f34957a;

    /* renamed from: b */
    public final int f34958b;

    /* renamed from: c */
    public final int f34959c;

    /* renamed from: d */
    public final int f34960d;

    public C7340b(int i10, int i11, int i12, int i13) {
        this.f34957a = i10;
        this.f34958b = i11;
        this.f34959c = i12;
        this.f34960d = i13;
    }

    /* renamed from: a */
    public static C7340b m13735a(C7340b c7340b, C7340b c7340b2) {
        return m13736b(Math.max(c7340b.f34957a, c7340b2.f34957a), Math.max(c7340b.f34958b, c7340b2.f34958b), Math.max(c7340b.f34959c, c7340b2.f34959c), Math.max(c7340b.f34960d, c7340b2.f34960d));
    }

    /* renamed from: b */
    public static C7340b m13736b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f34956e : new C7340b(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static C7340b m13737c(Insets insets) {
        return m13736b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: d */
    public final Insets m13738d() {
        return AbstractC0630b.m1797f(this.f34957a, this.f34958b, this.f34959c, this.f34960d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7340b.class != obj.getClass()) {
            return false;
        }
        C7340b c7340b = (C7340b) obj;
        return this.f34960d == c7340b.f34960d && this.f34957a == c7340b.f34957a && this.f34959c == c7340b.f34959c && this.f34958b == c7340b.f34958b;
    }

    public final int hashCode() {
        return (((((this.f34957a * 31) + this.f34958b) * 31) + this.f34959c) * 31) + this.f34960d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f34957a);
        sb2.append(", top=");
        sb2.append(this.f34958b);
        sb2.append(", right=");
        sb2.append(this.f34959c);
        sb2.append(", bottom=");
        return AbstractC1452a.m4563j(sb2, this.f34960d, '}');
    }
}
