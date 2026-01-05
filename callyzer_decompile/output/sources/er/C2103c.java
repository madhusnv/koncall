package er;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.c */
/* loaded from: classes3.dex */
public final class C2103c extends AbstractC2111k {

    /* renamed from: a */
    public final String f9855a;

    public C2103c(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f9855a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2103c) && AbstractC4154l.m8918a(this.f9855a, ((C2103c) obj).f9855a);
    }

    public final int hashCode() {
        return this.f9855a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("CopyNumber(phoneNumber=", this.f9855a, ")");
    }
}
