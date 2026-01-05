package g4;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.f */
/* loaded from: classes.dex */
public final class C2490f {

    /* renamed from: a */
    public final Object f13595a;

    /* renamed from: b */
    public final int f13596b;

    /* renamed from: c */
    public final int f13597c;

    /* renamed from: d */
    public final String f13598d;

    public C2490f(Object obj, int i10, int i11, String str) {
        this.f13595a = obj;
        this.f13596b = i10;
        this.f13597c = i11;
        this.f13598d = str;
        if (i10 <= i11) {
            return;
        }
        AbstractC4646a.m9525a("Reversed range is not supported");
    }

    /* renamed from: a */
    public static C2490f m6430a(C2490f c2490f, C2506v c2506v, int i10, int i11) {
        Object obj = c2506v;
        if ((i11 & 1) != 0) {
            obj = c2490f.f13595a;
        }
        int i12 = c2490f.f13596b;
        if ((i11 & 4) != 0) {
            i10 = c2490f.f13597c;
        }
        return new C2490f(obj, i12, i10, c2490f.f13598d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2490f)) {
            return false;
        }
        C2490f c2490f = (C2490f) obj;
        return AbstractC4154l.m8918a(this.f13595a, c2490f.f13595a) && this.f13596b == c2490f.f13596b && this.f13597c == c2490f.f13597c && AbstractC4154l.m8918a(this.f13598d, c2490f.f13598d);
    }

    public final int hashCode() {
        Object obj = this.f13595a;
        return this.f13598d.hashCode() + AbstractC1452a.m4556c(this.f13597c, AbstractC1452a.m4556c(this.f13596b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f13595a);
        sb2.append(", start=");
        sb2.append(this.f13596b);
        sb2.append(", end=");
        sb2.append(this.f13597c);
        sb2.append(", tag=");
        return AbstractC0030c.m123n(sb2, this.f13598d, ')');
    }

    public C2490f(Object obj, int i10, int i11) {
        this(obj, i10, i11, "");
    }
}
