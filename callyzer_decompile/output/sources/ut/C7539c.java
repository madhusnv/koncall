package ut;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.f0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.c */
/* loaded from: classes3.dex */
public final class C7539c extends f0 {

    /* renamed from: a */
    public final int f36299a;

    public C7539c(int i10) {
        this.f36299a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7539c) && this.f36299a == ((C7539c) obj).f36299a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36299a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f36299a, "OnSocialIconClick(iconId=", ")");
    }
}
