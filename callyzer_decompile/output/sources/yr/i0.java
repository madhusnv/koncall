package yr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i0 extends k0 {

    /* renamed from: a */
    public final String f42367a;

    public i0(String tag) {
        AbstractC4154l.m8923f(tag, "tag");
        this.f42367a = tag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && AbstractC4154l.m8918a(this.f42367a, ((i0) obj).f42367a);
    }

    public final int hashCode() {
        return this.f42367a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OnTagRemove(tag=", this.f42367a, ")");
    }
}
