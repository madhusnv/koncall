package rv;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.b */
/* loaded from: classes3.dex */
public final class C6626b extends AbstractC6650z {

    /* renamed from: a */
    public final String f31821a;

    public C6626b(String str) {
        this.f31821a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6626b) && AbstractC4154l.m8918a(this.f31821a, ((C6626b) obj).f31821a);
    }

    public final int hashCode() {
        return this.f31821a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("AddDCC(dcc=", this.f31821a, ")");
    }
}
