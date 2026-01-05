package gd;

import a2.AbstractC0030c;
import fd.InterfaceC2265c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gd.f */
/* loaded from: classes.dex */
public final class C2568f implements InterfaceC2265c {

    /* renamed from: a */
    public final String f13979a;

    /* renamed from: b */
    public final String f13980b;

    public C2568f(String str, String str2) {
        this.f13979a = str;
        this.f13980b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2568f)) {
            return false;
        }
        C2568f c2568f = (C2568f) obj;
        return AbstractC4154l.m8918a(this.f13979a, c2568f.f13979a) && AbstractC4154l.m8918a(this.f13980b, c2568f.f13980b);
    }

    public final int hashCode() {
        return this.f13980b.hashCode() + (this.f13979a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QueryLiteral(key=");
        sb2.append(this.f13979a);
        sb2.append(", value=");
        return AbstractC0030c.m123n(sb2, this.f13980b, ')');
    }
}
