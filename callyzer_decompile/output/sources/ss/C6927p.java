package ss;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.p */
/* loaded from: classes3.dex */
public final class C6927p extends a0 {

    /* renamed from: a */
    public final String f33470a;

    public C6927p(String str) {
        this.f33470a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6927p) && AbstractC4154l.m8918a(this.f33470a, ((C6927p) obj).f33470a);
    }

    public final int hashCode() {
        return this.f33470a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OnRCFolderSelectError(error=", this.f33470a, ")");
    }
}
