package et;

import kotlin.jvm.internal.AbstractC4154l;
import og.de;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: et.d */
/* loaded from: classes3.dex */
public final class C2132d extends de {

    /* renamed from: a */
    public final String f9965a;

    public C2132d(String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f9965a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2132d) && AbstractC4154l.m8918a(this.f9965a, ((C2132d) obj).f9965a);
    }

    public final int hashCode() {
        return this.f9965a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("NameChanged(name=", this.f9965a, ")");
    }
}
