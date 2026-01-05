package zu;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.l */
/* loaded from: classes3.dex */
public final class C9082l extends AbstractC9092v {

    /* renamed from: a */
    public final int f43614a;

    public C9082l(int i10) {
        this.f43614a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9082l) && this.f43614a == ((C9082l) obj).f43614a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43614a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f43614a, "OnTemplateSelected(id=", ")");
    }
}
