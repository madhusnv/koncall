package et;

import kotlin.jvm.internal.AbstractC4154l;
import og.de;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: et.e */
/* loaded from: classes3.dex */
public final class C2133e extends de {

    /* renamed from: a */
    public final String f9966a;

    public C2133e(String contact) {
        AbstractC4154l.m8923f(contact, "contact");
        this.f9966a = contact;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2133e) && AbstractC4154l.m8918a(this.f9966a, ((C2133e) obj).f9966a);
    }

    public final int hashCode() {
        return this.f9966a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("NumberChanged(contact=", this.f9966a, ")");
    }
}
