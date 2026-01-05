package i9;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.d6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.r */
/* loaded from: classes.dex */
public final class C3200r extends d6 {

    /* renamed from: a */
    public final String f17249a;

    /* renamed from: b */
    public final String f17250b;

    public C3200r(String str, String str2) {
        this.f17249a = str;
        this.f17250b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3200r)) {
            return false;
        }
        C3200r c3200r = (C3200r) obj;
        return AbstractC4154l.m8918a(this.f17249a, c3200r.f17249a) && AbstractC4154l.m8918a(this.f17250b, c3200r.f17250b);
    }

    public final int hashCode() {
        String str = this.f17249a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17250b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(code=");
        sb2.append(this.f17249a);
        sb2.append(", message=");
        return AbstractC0030c.m123n(sb2, this.f17250b, ')');
    }
}
