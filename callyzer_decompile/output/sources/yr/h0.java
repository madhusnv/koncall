package yr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 extends k0 {

    /* renamed from: a */
    public final String f42365a;

    public h0(String text) {
        AbstractC4154l.m8923f(text, "text");
        this.f42365a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && AbstractC4154l.m8918a(this.f42365a, ((h0) obj).f42365a);
    }

    public final int hashCode() {
        return this.f42365a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OnSearch(text=", this.f42365a, ")");
    }
}
