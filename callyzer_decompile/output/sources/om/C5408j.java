package om;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.j */
/* loaded from: classes3.dex */
public final class C5408j {

    /* renamed from: a */
    public final int f27157a;

    /* renamed from: b */
    public final String f27158b;

    /* renamed from: c */
    public final String f27159c;

    /* renamed from: d */
    public final String f27160d;

    public C5408j(String extensionCode, int i10, String extensionName, String lastActiveTime) {
        AbstractC4154l.m8923f(extensionCode, "extensionCode");
        AbstractC4154l.m8923f(extensionName, "extensionName");
        AbstractC4154l.m8923f(lastActiveTime, "lastActiveTime");
        this.f27157a = i10;
        this.f27158b = extensionCode;
        this.f27159c = extensionName;
        this.f27160d = lastActiveTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5408j)) {
            return false;
        }
        C5408j c5408j = (C5408j) obj;
        return this.f27157a == c5408j.f27157a && AbstractC4154l.m8918a(this.f27158b, c5408j.f27158b) && AbstractC4154l.m8918a(this.f27159c, c5408j.f27159c) && AbstractC4154l.m8918a(this.f27160d, c5408j.f27160d);
    }

    public final int hashCode() {
        return this.f27160d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f27157a) * 31, 31, this.f27158b), 31, this.f27159c);
    }

    public final String toString() {
        return AbstractC0030c.m124o(a1.m14337q(this.f27157a, "ExtensionDetails(id=", ", extensionCode=", this.f27158b, ", extensionName="), this.f27159c, ", lastActiveTime=", this.f27160d, ")");
    }
}
