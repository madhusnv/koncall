package rv;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a */
    public final String f31902a;

    public s0(String str) {
        this.f31902a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && AbstractC4154l.m8918a(this.f31902a, ((s0) obj).f31902a);
    }

    public final int hashCode() {
        return this.f31902a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("NavigateScreen(screenName=", this.f31902a, ")");
    }
}
