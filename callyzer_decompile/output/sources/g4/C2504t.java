package g4;

import com.sun.mail.util.AbstractC1452a;
import o4.C5288d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.t */
/* loaded from: classes.dex */
public final class C2504t {

    /* renamed from: a */
    public final C5288d f13716a;

    /* renamed from: b */
    public final int f13717b;

    /* renamed from: c */
    public final int f13718c;

    public C2504t(C5288d c5288d, int i10, int i11) {
        this.f13716a = c5288d;
        this.f13717b = i10;
        this.f13718c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2504t)) {
            return false;
        }
        C2504t c2504t = (C2504t) obj;
        return this.f13716a.equals(c2504t.f13716a) && this.f13717b == c2504t.f13717b && this.f13718c == c2504t.f13718c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13718c) + AbstractC1452a.m4556c(this.f13717b, this.f13716a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f13716a);
        sb2.append(", startIndex=");
        sb2.append(this.f13717b);
        sb2.append(", endIndex=");
        return AbstractC1452a.m4563j(sb2, this.f13718c, ')');
    }
}
