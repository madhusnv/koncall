package rv;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.k */
/* loaded from: classes3.dex */
public final class C6635k extends AbstractC6650z {

    /* renamed from: a */
    public final String f31844a;

    public C6635k(String str) {
        this.f31844a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6635k) && AbstractC4154l.m8918a(this.f31844a, ((C6635k) obj).f31844a);
    }

    public final int hashCode() {
        return this.f31844a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("FromDestination(fromScreen=", this.f31844a, ")");
    }
}
