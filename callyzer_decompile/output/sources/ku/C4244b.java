package ku;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.t9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ku.b */
/* loaded from: classes3.dex */
public final class C4244b extends t9 {

    /* renamed from: a */
    public final int f21565a;

    public C4244b(int i10) {
        this.f21565a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4244b) && this.f21565a == ((C4244b) obj).f21565a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21565a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f21565a, "UpdateTheme(position=", ")");
    }
}
