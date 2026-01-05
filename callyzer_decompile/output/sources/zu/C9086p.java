package zu;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.p */
/* loaded from: classes3.dex */
public final class C9086p extends AbstractC9092v {

    /* renamed from: a */
    public final String f43619a;

    public C9086p(String title) {
        AbstractC4154l.m8923f(title, "title");
        this.f43619a = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9086p) && AbstractC4154l.m8918a(this.f43619a, ((C9086p) obj).f43619a);
    }

    public final int hashCode() {
        return this.f43619a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SearchTemplatesUseCount(title=", this.f43619a, ")");
    }
}
