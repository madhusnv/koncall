package yr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.n */
/* loaded from: classes3.dex */
public final class C8755n extends AbstractC8761t {

    /* renamed from: a */
    public final String f42374a;

    public C8755n(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f42374a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8755n) && AbstractC4154l.m8918a(this.f42374a, ((C8755n) obj).f42374a);
    }

    public final int hashCode() {
        return this.f42374a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("NumberChange(phoneNumber=", this.f42374a, ")");
    }
}
