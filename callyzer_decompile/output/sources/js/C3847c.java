package js;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: js.c */
/* loaded from: classes3.dex */
public final class C3847c extends AbstractC3849e {

    /* renamed from: a */
    public final String f19806a;

    /* renamed from: b */
    public final String f19807b;

    /* renamed from: c */
    public final int f19808c;

    public C3847c(String simNumber, String leadNumber, int i10) {
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(leadNumber, "leadNumber");
        this.f19806a = simNumber;
        this.f19807b = leadNumber;
        this.f19808c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3847c)) {
            return false;
        }
        C3847c c3847c = (C3847c) obj;
        return AbstractC4154l.m8918a(this.f19806a, c3847c.f19806a) && AbstractC4154l.m8918a(this.f19807b, c3847c.f19807b) && this.f19808c == c3847c.f19808c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19808c) + AbstractC0030c.m113d(this.f19806a.hashCode() * 31, 31, this.f19807b);
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.f19808c, ")", AbstractC0030c.m127r("AddLead(simNumber=", this.f19806a, ", leadNumber=", this.f19807b, ", leadCountryCode="));
    }
}
