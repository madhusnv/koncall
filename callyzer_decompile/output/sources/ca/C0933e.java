package ca;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.la;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.e */
/* loaded from: classes.dex */
public final class C0933e extends la {

    /* renamed from: a */
    public final String f5681a;

    /* renamed from: b */
    public final String f5682b;

    /* renamed from: c */
    public final String f5683c;

    /* renamed from: d */
    public final String f5684d;

    /* renamed from: e */
    public final String f5685e;

    public C0933e(String str, String str2, String str3, String str4, String str5) {
        this.f5681a = str;
        this.f5682b = str2;
        this.f5683c = str3;
        this.f5684d = str4;
        this.f5685e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0933e)) {
            return false;
        }
        C0933e c0933e = (C0933e) obj;
        return AbstractC4154l.m8918a(this.f5681a, c0933e.f5681a) && AbstractC4154l.m8918a(this.f5682b, c0933e.f5682b) && AbstractC4154l.m8918a(this.f5683c, c0933e.f5683c) && AbstractC4154l.m8918a(this.f5684d, c0933e.f5684d) && AbstractC4154l.m8918a(this.f5685e, c0933e.f5685e);
    }

    public final int hashCode() {
        return this.f5685e.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f5681a.hashCode() * 31, 31, this.f5682b), 31, this.f5683c), 31, this.f5684d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SsoSession(ssoSessionName=");
        sb2.append(this.f5681a);
        sb2.append(", ssoStartUrl=");
        sb2.append(this.f5682b);
        sb2.append(", ssoRegion=");
        sb2.append(this.f5683c);
        sb2.append(", ssoAccountId=");
        sb2.append(this.f5684d);
        sb2.append(", ssoRoleName=");
        return AbstractC0030c.m123n(sb2, this.f5685e, ')');
    }
}
