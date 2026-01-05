package iu;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iu.b */
/* loaded from: classes3.dex */
public final class C3350b extends AbstractC3353e {

    /* renamed from: a */
    public final int f17732a;

    public C3350b(int i10) {
        this.f17732a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3350b) && this.f17732a == ((C3350b) obj).f17732a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17732a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f17732a, "UploadFailed(message=", ")");
    }
}
