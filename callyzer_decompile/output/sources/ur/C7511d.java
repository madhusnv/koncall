package ur;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.d */
/* loaded from: classes3.dex */
public final class C7511d extends AbstractC7523p {

    /* renamed from: a */
    public final String f36209a;

    public C7511d(String str) {
        this.f36209a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7511d) && AbstractC4154l.m8918a(this.f36209a, ((C7511d) obj).f36209a);
    }

    public final int hashCode() {
        String str = this.f36209a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OpenMultiSelectionScreen(modelId=", this.f36209a, ")");
    }
}
