package xb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xb.a */
/* loaded from: classes.dex */
public final class C8319a {

    /* renamed from: a */
    public final String f39878a;

    /* renamed from: b */
    public final String f39879b;

    /* renamed from: c */
    public final String f39880c;

    public C8319a(String str, String str2, String str3) {
        this.f39878a = str;
        this.f39879b = str2;
        this.f39880c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8319a)) {
            return false;
        }
        C8319a c8319a = (C8319a) obj;
        return AbstractC4154l.m8918a(this.f39878a, c8319a.f39878a) && AbstractC4154l.m8918a(this.f39879b, c8319a.f39879b) && AbstractC4154l.m8918a(this.f39880c, c8319a.f39880c);
    }

    public final int hashCode() {
        String str = this.f39878a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39879b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39880c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("XmlError(requestId=");
        sb2.append(this.f39878a);
        sb2.append(", code=");
        sb2.append(this.f39879b);
        sb2.append(", message=");
        return AbstractC0030c.m123n(sb2, this.f39880c, ')');
    }
}
