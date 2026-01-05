package wt;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wt.a */
/* loaded from: classes3.dex */
public final class C8183a {

    /* renamed from: a */
    public final int f39139a;

    /* renamed from: b */
    public final String f39140b;

    /* renamed from: c */
    public final String f39141c;

    /* renamed from: d */
    public final String f39142d;

    public C8183a(String extensionName, int i10, String lastActiveTime, String qrCode) {
        AbstractC4154l.m8923f(extensionName, "extensionName");
        AbstractC4154l.m8923f(lastActiveTime, "lastActiveTime");
        AbstractC4154l.m8923f(qrCode, "qrCode");
        this.f39139a = i10;
        this.f39140b = extensionName;
        this.f39141c = lastActiveTime;
        this.f39142d = qrCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8183a)) {
            return false;
        }
        C8183a c8183a = (C8183a) obj;
        return this.f39139a == c8183a.f39139a && AbstractC4154l.m8918a(this.f39140b, c8183a.f39140b) && AbstractC4154l.m8918a(this.f39141c, c8183a.f39141c) && AbstractC4154l.m8918a(this.f39142d, c8183a.f39142d);
    }

    public final int hashCode() {
        return this.f39142d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f39139a) * 31, 31, this.f39140b), 31, this.f39141c);
    }

    public final String toString() {
        return AbstractC0030c.m124o(a1.m14337q(this.f39139a, "ExtensionData(id=", ", extensionName=", this.f39140b, ", lastActiveTime="), this.f39141c, ", qrCode=", this.f39142d, ")");
    }
}
