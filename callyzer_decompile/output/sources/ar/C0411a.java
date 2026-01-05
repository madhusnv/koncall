package ar;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ar.a */
/* loaded from: classes3.dex */
public final class C0411a extends AbstractC0427q {

    /* renamed from: a */
    public final String f3128a;

    public C0411a(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f3128a = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0411a) && AbstractC4154l.m8918a(this.f3128a, ((C0411a) obj).f3128a);
    }

    public final int hashCode() {
        return this.f3128a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("CopyNumber(phoneNumber=", this.f3128a, ")");
    }
}
