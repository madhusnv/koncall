package lb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import vb.InterfaceC7695b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lb.c */
/* loaded from: classes.dex */
public final class C4437c implements InterfaceC7695b {

    /* renamed from: a */
    public final String f22162a;

    /* renamed from: b */
    public final String f22163b;

    /* renamed from: c */
    public final String f22164c;

    /* renamed from: d */
    public final String f22165d;

    public C4437c(String str, String str2, String str3, String str4) {
        this.f22162a = str;
        this.f22163b = str2;
        this.f22164c = str3;
        this.f22165d = str4;
    }

    @Override // vb.InterfaceC7695b
    /* renamed from: a */
    public final String mo9303a() {
        return this.f22163b;
    }

    @Override // vb.InterfaceC7695b
    /* renamed from: b */
    public final String mo9304b() {
        return this.f22162a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4437c)) {
            return false;
        }
        C4437c c4437c = (C4437c) obj;
        return AbstractC4154l.m8918a(this.f22162a, c4437c.f22162a) && AbstractC4154l.m8918a(this.f22163b, c4437c.f22163b) && AbstractC4154l.m8918a(this.f22164c, c4437c.f22164c) && AbstractC4154l.m8918a(this.f22165d, c4437c.f22165d);
    }

    public final int hashCode() {
        String str = this.f22162a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22163b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22164c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22165d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("S3ErrorDetails(code=");
        sb2.append(this.f22162a);
        sb2.append(", message=");
        sb2.append(this.f22163b);
        sb2.append(", requestId=");
        sb2.append(this.f22164c);
        sb2.append(", requestId2=");
        return AbstractC0030c.m123n(sb2, this.f22165d, ')');
    }
}
