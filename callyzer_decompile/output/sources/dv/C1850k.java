package dv;

import og.id;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dv.k */
/* loaded from: classes3.dex */
public final class C1850k extends id {

    /* renamed from: b */
    public final int f8829b;

    public C1850k(int i10) {
        this.f8829b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1850k) && this.f8829b == ((C1850k) obj).f8829b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8829b);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f8829b, "TemplateClickCount(id=", ")");
    }
}
