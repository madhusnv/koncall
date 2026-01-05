package yr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.x */
/* loaded from: classes3.dex */
public final class C8765x extends a0 {

    /* renamed from: a */
    public final String f42383a;

    public C8765x(String searchText) {
        AbstractC4154l.m8923f(searchText, "searchText");
        this.f42383a = searchText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8765x) && AbstractC4154l.m8918a(this.f42383a, ((C8765x) obj).f42383a);
    }

    public final int hashCode() {
        return this.f42383a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SearchEmployee(searchText=", this.f42383a, ")");
    }
}
