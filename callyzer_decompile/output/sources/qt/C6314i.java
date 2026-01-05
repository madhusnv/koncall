package qt;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.kd;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.i */
/* loaded from: classes3.dex */
public final class C6314i extends kd {

    /* renamed from: a */
    public final String f30644a;

    /* renamed from: b */
    public final String f30645b;

    /* renamed from: c */
    public final int f30646c;

    public C6314i(String clientNumber, String cc2, int i10) {
        AbstractC4154l.m8923f(clientNumber, "clientNumber");
        AbstractC4154l.m8923f(cc2, "cc");
        this.f30644a = clientNumber;
        this.f30645b = cc2;
        this.f30646c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6314i)) {
            return false;
        }
        C6314i c6314i = (C6314i) obj;
        return AbstractC4154l.m8918a(this.f30644a, c6314i.f30644a) && AbstractC4154l.m8918a(this.f30645b, c6314i.f30645b) && this.f30646c == c6314i.f30646c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30646c) + AbstractC0030c.m113d(this.f30644a.hashCode() * 31, 31, this.f30645b);
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.f30646c, ")", AbstractC0030c.m127r("UpdateCallLogObject(clientNumber=", this.f30644a, ", cc=", this.f30645b, ", index="));
    }
}
