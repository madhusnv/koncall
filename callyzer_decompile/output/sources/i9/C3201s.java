package i9;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.d6;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.s */
/* loaded from: classes.dex */
public final class C3201s extends d6 {

    /* renamed from: a */
    public final String f17260a;

    /* renamed from: b */
    public final String f17261b;

    /* renamed from: c */
    public final String f17262c;

    /* renamed from: d */
    public final C7126c f17263d;

    /* renamed from: e */
    public final String f17264e;

    public C3201s(String str, String str2, String str3, C7126c c7126c, String str4) {
        this.f17260a = str;
        this.f17261b = str2;
        this.f17262c = str3;
        this.f17263d = c7126c;
        this.f17264e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3201s)) {
            return false;
        }
        C3201s c3201s = (C3201s) obj;
        return AbstractC4154l.m8918a(this.f17260a, c3201s.f17260a) && AbstractC4154l.m8918a(this.f17261b, c3201s.f17261b) && AbstractC4154l.m8918a(this.f17262c, c3201s.f17262c) && AbstractC4154l.m8918a(this.f17263d, c3201s.f17263d) && AbstractC4154l.m8918a(this.f17264e, c3201s.f17264e);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(this.f17260a.hashCode() * 31, 31, this.f17261b), 31, this.f17262c);
        C7126c c7126c = this.f17263d;
        int iHashCode = (iM113d + (c7126c == null ? 0 : c7126c.f34346a.hashCode())) * 31;
        String str = this.f17264e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionCredentials(accessKeyId=");
        sb2.append(this.f17260a);
        sb2.append(", secretAccessKey=");
        sb2.append(this.f17261b);
        sb2.append(", sessionToken=");
        sb2.append(this.f17262c);
        sb2.append(", expiration=");
        sb2.append(this.f17263d);
        sb2.append(", accountId=");
        return AbstractC0030c.m123n(sb2, this.f17264e, ')');
    }
}
