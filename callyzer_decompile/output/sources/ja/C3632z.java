package ja;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.z */
/* loaded from: classes.dex */
public final class C3632z implements b0 {

    /* renamed from: a */
    public final String f19273a;

    /* renamed from: b */
    public final EnumC3618l f19274b;

    /* renamed from: c */
    public final boolean f19275c;

    /* renamed from: d */
    public final boolean f19276d;

    public C3632z(String str, EnumC3618l type, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(type, "type");
        this.f19273a = str;
        this.f19274b = type;
        this.f19275c = z6;
        this.f19276d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3632z)) {
            return false;
        }
        C3632z c3632z = (C3632z) obj;
        return AbstractC4154l.m8918a(this.f19273a, c3632z.f19273a) && this.f19274b == c3632z.f19274b && this.f19275c == c3632z.f19275c && this.f19276d == c3632z.f19276d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19276d) + AbstractC1452a.m4558e((this.f19274b.hashCode() + (this.f19273a.hashCode() * 31)) * 31, 31, this.f19275c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Section(name=");
        sb2.append(this.f19273a);
        sb2.append(", type=");
        sb2.append(this.f19274b);
        sb2.append(", hasSectionPrefix=");
        sb2.append(this.f19275c);
        sb2.append(", isValid=");
        return m0.m7382o(sb2, this.f19276d, ')');
    }
}
