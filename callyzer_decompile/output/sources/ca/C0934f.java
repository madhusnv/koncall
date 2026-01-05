package ca;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.la;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.f */
/* loaded from: classes.dex */
public final class C0934f extends la {

    /* renamed from: a */
    public final String f5686a;

    /* renamed from: b */
    public final String f5687b;

    /* renamed from: c */
    public final String f5688c;

    public C0934f(String str, String str2, String str3) {
        this.f5686a = str;
        this.f5687b = str2;
        this.f5688c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0934f)) {
            return false;
        }
        C0934f c0934f = (C0934f) obj;
        return AbstractC4154l.m8918a(this.f5686a, c0934f.f5686a) && AbstractC4154l.m8918a(this.f5687b, c0934f.f5687b) && AbstractC4154l.m8918a(this.f5688c, c0934f.f5688c);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.f5686a.hashCode() * 31, 31, this.f5687b);
        String str = this.f5688c;
        return iM113d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebIdentityTokenRole(roleArn=");
        sb2.append(this.f5686a);
        sb2.append(", webIdentityTokenFile=");
        sb2.append(this.f5687b);
        sb2.append(", sessionName=");
        return AbstractC0030c.m123n(sb2, this.f5688c, ')');
    }
}
