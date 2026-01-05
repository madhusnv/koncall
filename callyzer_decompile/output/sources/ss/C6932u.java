package ss;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.u */
/* loaded from: classes3.dex */
public final class C6932u extends a0 {

    /* renamed from: a */
    public final String f33496a;

    public C6932u(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f33496a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6932u) && AbstractC4154l.m8918a(this.f33496a, ((C6932u) obj).f33496a);
    }

    public final int hashCode() {
        return this.f33496a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("PlaceCall(phoneNumber=", this.f33496a, ")");
    }
}
