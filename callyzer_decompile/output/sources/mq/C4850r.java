package mq;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.r */
/* loaded from: classes3.dex */
public final class C4850r extends AbstractC4854v {

    /* renamed from: a */
    public final String f24314a;

    public C4850r(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f24314a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4850r) && AbstractC4154l.m8918a(this.f24314a, ((C4850r) obj).f24314a);
    }

    public final int hashCode() {
        return this.f24314a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SendTextMessage(phoneNumber=", this.f24314a, ")");
    }
}
