package im;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x1 implements z1 {

    /* renamed from: a */
    public final int f17593a;

    public x1(int i10) {
        this.f17593a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && this.f17593a == ((x1) obj).f17593a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17593a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f17593a, "DeleteTemplate(templateId=", ")");
    }
}
