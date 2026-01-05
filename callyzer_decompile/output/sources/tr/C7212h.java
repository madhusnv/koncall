package tr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tr.h */
/* loaded from: classes3.dex */
public final class C7212h extends AbstractC7213i {

    /* renamed from: a */
    public final String f34506a;

    public C7212h(String newVal) {
        AbstractC4154l.m8923f(newVal, "newVal");
        this.f34506a = newVal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7212h) && AbstractC4154l.m8918a(this.f34506a, ((C7212h) obj).f34506a);
    }

    public final int hashCode() {
        return this.f34506a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateStringValue(newVal=", this.f34506a, ")");
    }
}
