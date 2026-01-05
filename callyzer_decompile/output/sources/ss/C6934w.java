package ss;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.w */
/* loaded from: classes3.dex */
public final class C6934w extends a0 {

    /* renamed from: a */
    public final String f33510a;

    public C6934w(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f33510a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6934w) && AbstractC4154l.m8918a(this.f33510a, ((C6934w) obj).f33510a);
    }

    public final int hashCode() {
        return this.f33510a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SetCallLogData(phoneNumber=", this.f33510a, ")");
    }
}
