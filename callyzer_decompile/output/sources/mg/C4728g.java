package mg;

import java.io.Serializable;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.g */
/* loaded from: classes.dex */
public final class C4728g implements Serializable {

    /* renamed from: a */
    public final Object f23642a;

    public C4728g(Object obj) {
        this.f23642a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4728g) {
            return AbstractC4723b.m9606h(this.f23642a, ((C4728g) obj).f23642a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23642a});
    }

    public final String toString() {
        return AbstractC5601a.m11238i("Suppliers.ofInstance(", this.f23642a.toString(), ")");
    }
}
