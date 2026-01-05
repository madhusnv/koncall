package ss;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.q */
/* loaded from: classes3.dex */
public final class C6928q extends a0 {

    /* renamed from: a */
    public final String f33474a;

    public C6928q(String str) {
        this.f33474a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6928q) && AbstractC4154l.m8918a(this.f33474a, ((C6928q) obj).f33474a);
    }

    public final int hashCode() {
        return this.f33474a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OnSaveFolderPathInPrefs(pathUri=", this.f33474a, ")");
    }
}
