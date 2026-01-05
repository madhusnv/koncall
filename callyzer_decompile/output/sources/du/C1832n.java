package du;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: du.n */
/* loaded from: classes3.dex */
public final class C1832n extends AbstractC1839u {

    /* renamed from: a */
    public final String f8809a;

    public C1832n(String str) {
        this.f8809a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1832n) && AbstractC4154l.m8918a(this.f8809a, ((C1832n) obj).f8809a);
    }

    public final int hashCode() {
        return this.f8809a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OnSaveFolderPathInPrefs(pathUri=", this.f8809a, ")");
    }
}
