package ss;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.z */
/* loaded from: classes3.dex */
public final class C6937z extends a0 {

    /* renamed from: a */
    public final String f33531a;

    public C6937z(String number) {
        AbstractC4154l.m8923f(number, "number");
        this.f33531a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6937z) && AbstractC4154l.m8918a(this.f33531a, ((C6937z) obj).f33531a);
    }

    public final int hashCode() {
        return this.f33531a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("WhatsAppMessage(number=", this.f33531a, ")");
    }
}
