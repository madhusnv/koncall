package ca;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.la;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.b */
/* loaded from: classes.dex */
public final class C0930b extends la {

    /* renamed from: a */
    public final String f5675a;

    /* renamed from: b */
    public final String f5676b;

    /* renamed from: c */
    public final String f5677c;

    /* renamed from: d */
    public final String f5678d;

    public C0930b(String str, String str2, String str3, String str4) {
        this.f5675a = str;
        this.f5676b = str2;
        this.f5677c = str3;
        this.f5678d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0930b)) {
            return false;
        }
        C0930b c0930b = (C0930b) obj;
        return AbstractC4154l.m8918a(this.f5675a, c0930b.f5675a) && AbstractC4154l.m8918a(this.f5676b, c0930b.f5676b) && AbstractC4154l.m8918a(this.f5677c, c0930b.f5677c) && AbstractC4154l.m8918a(this.f5678d, c0930b.f5678d);
    }

    public final int hashCode() {
        return this.f5678d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(this.f5675a.hashCode() * 31, 31, this.f5676b), 31, this.f5677c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LegacySso(ssoStartUrl=");
        sb2.append(this.f5675a);
        sb2.append(", ssoRegion=");
        sb2.append(this.f5676b);
        sb2.append(", ssoAccountId=");
        sb2.append(this.f5677c);
        sb2.append(", ssoRoleName=");
        return AbstractC0030c.m123n(sb2, this.f5678d, ')');
    }
}
