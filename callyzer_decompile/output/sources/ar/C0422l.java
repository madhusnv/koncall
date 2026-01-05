package ar;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ar.l */
/* loaded from: classes3.dex */
public final class C0422l extends AbstractC0427q {

    /* renamed from: a */
    public final String f3142a;

    public C0422l(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f3142a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0422l) && AbstractC4154l.m8918a(this.f3142a, ((C0422l) obj).f3142a);
    }

    public final int hashCode() {
        return this.f3142a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SendTextMessage(phoneNumber=", this.f3142a, ")");
    }
}
