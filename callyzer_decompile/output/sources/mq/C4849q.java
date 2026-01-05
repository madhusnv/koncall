package mq;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.q */
/* loaded from: classes3.dex */
public final class C4849q extends AbstractC4854v {

    /* renamed from: a */
    public final String f24312a;

    public C4849q(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f24312a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4849q) && AbstractC4154l.m8918a(this.f24312a, ((C4849q) obj).f24312a);
    }

    public final int hashCode() {
        return this.f24312a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("PlaceCall(phoneNumber=", this.f24312a, ")");
    }
}
