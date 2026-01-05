package ca;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.l */
/* loaded from: classes.dex */
public final class C0940l {

    /* renamed from: a */
    public final String f5695a;

    /* renamed from: b */
    public final EnumC0941m f5696b;

    /* renamed from: c */
    public final String f5697c;

    /* renamed from: d */
    public final String f5698d;

    public C0940l(String str, EnumC0941m enumC0941m, String str2, String str3) {
        this.f5695a = str;
        this.f5696b = enumC0941m;
        this.f5697c = str2;
        this.f5698d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0940l)) {
            return false;
        }
        C0940l c0940l = (C0940l) obj;
        return AbstractC4154l.m8918a(this.f5695a, c0940l.f5695a) && this.f5696b == c0940l.f5696b && AbstractC4154l.m8918a(this.f5697c, c0940l.f5697c) && AbstractC4154l.m8918a(this.f5698d, c0940l.f5698d);
    }

    public final int hashCode() {
        int iHashCode = this.f5695a.hashCode() * 31;
        EnumC0941m enumC0941m = this.f5696b;
        int iHashCode2 = (iHashCode + (enumC0941m == null ? 0 : enumC0941m.hashCode())) * 31;
        String str = this.f5697c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5698d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RoleArn(roleArn=");
        sb2.append(this.f5695a);
        sb2.append(", source=");
        sb2.append(this.f5696b);
        sb2.append(", sessionName=");
        sb2.append(this.f5697c);
        sb2.append(", externalId=");
        return AbstractC0030c.m123n(sb2, this.f5698d, ')');
    }
}
