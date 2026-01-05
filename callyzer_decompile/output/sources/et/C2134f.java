package et;

import kotlin.jvm.internal.AbstractC4154l;
import og.de;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: et.f */
/* loaded from: classes3.dex */
public final class C2134f extends de {

    /* renamed from: a */
    public final String f9967a;

    public C2134f(String type) {
        AbstractC4154l.m8923f(type, "type");
        this.f9967a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2134f) && AbstractC4154l.m8918a(this.f9967a, ((C2134f) obj).f9967a);
    }

    public final int hashCode() {
        return this.f9967a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SelectType(type=", this.f9967a, ")");
    }
}
