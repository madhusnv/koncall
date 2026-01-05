package er;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.h */
/* loaded from: classes3.dex */
public final class C2108h extends AbstractC2111k {

    /* renamed from: a */
    public final String f9861a;

    public C2108h(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f9861a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2108h) && AbstractC4154l.m8918a(this.f9861a, ((C2108h) obj).f9861a);
    }

    public final int hashCode() {
        return this.f9861a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SendTextMessage(phoneNumber=", this.f9861a, ")");
    }
}
