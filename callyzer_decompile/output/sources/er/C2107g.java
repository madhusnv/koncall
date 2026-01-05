package er;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.g */
/* loaded from: classes3.dex */
public final class C2107g extends AbstractC2111k {

    /* renamed from: a */
    public final String f9860a;

    public C2107g(String text) {
        AbstractC4154l.m8923f(text, "text");
        this.f9860a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2107g) && AbstractC4154l.m8918a(this.f9860a, ((C2107g) obj).f9860a);
    }

    public final int hashCode() {
        return this.f9860a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SearchText(text=", this.f9860a, ")");
    }
}
