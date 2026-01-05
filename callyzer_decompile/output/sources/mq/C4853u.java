package mq;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.u */
/* loaded from: classes3.dex */
public final class C4853u extends AbstractC4854v {

    /* renamed from: a */
    public final String f24324a;

    public C4853u(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f24324a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4853u) && AbstractC4154l.m8918a(this.f24324a, ((C4853u) obj).f24324a);
    }

    public final int hashCode() {
        return this.f24324a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("WhatsAppMessage(phoneNumber=", this.f24324a, ")");
    }
}
