package vb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vb.d */
/* loaded from: classes.dex */
public final class C7697d implements InterfaceC7695b {

    /* renamed from: a */
    public final String f37202a;

    /* renamed from: b */
    public final String f37203b;

    /* renamed from: c */
    public final String f37204c;

    public C7697d(String str, String str2, String str3) {
        this.f37202a = str;
        this.f37203b = str2;
        this.f37204c = str3;
    }

    @Override // vb.InterfaceC7695b
    /* renamed from: a */
    public final String mo9303a() {
        return this.f37203b;
    }

    @Override // vb.InterfaceC7695b
    /* renamed from: b */
    public final String mo9304b() {
        return this.f37202a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7697d)) {
            return false;
        }
        C7697d c7697d = (C7697d) obj;
        return AbstractC4154l.m8918a(this.f37202a, c7697d.f37202a) && AbstractC4154l.m8918a(this.f37203b, c7697d.f37203b) && AbstractC4154l.m8918a(this.f37204c, c7697d.f37204c);
    }

    public final int hashCode() {
        String str = this.f37202a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f37203b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f37204c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorDetails(code=");
        sb2.append(this.f37202a);
        sb2.append(", message=");
        sb2.append(this.f37203b);
        sb2.append(", requestId=");
        return AbstractC0030c.m123n(sb2, this.f37204c, ')');
    }
}
