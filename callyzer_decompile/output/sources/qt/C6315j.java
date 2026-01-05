package qt;

import kotlin.jvm.internal.AbstractC4154l;
import og.kd;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.j */
/* loaded from: classes3.dex */
public final class C6315j extends kd {

    /* renamed from: a */
    public final String f30647a;

    public C6315j(String searchText) {
        AbstractC4154l.m8923f(searchText, "searchText");
        this.f30647a = searchText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6315j) && AbstractC4154l.m8918a(this.f30647a, ((C6315j) obj).f30647a);
    }

    public final int hashCode() {
        return this.f30647a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateSearchText(searchText=", this.f30647a, ")");
    }
}
