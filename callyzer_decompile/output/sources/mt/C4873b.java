package mt;

import kotlin.jvm.internal.AbstractC4154l;
import og.c1;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.b */
/* loaded from: classes3.dex */
public final class C4873b extends c1 {

    /* renamed from: a */
    public final String f24383a;

    public C4873b(String description) {
        AbstractC4154l.m8923f(description, "description");
        this.f24383a = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4873b) && AbstractC4154l.m8918a(this.f24383a, ((C4873b) obj).f24383a);
    }

    public final int hashCode() {
        return this.f24383a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("CopyToClipboard(description=", this.f24383a, ")");
    }
}
