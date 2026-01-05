package im;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s0 extends f1 {

    /* renamed from: a */
    public final String f17580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(String error) {
        super(0);
        AbstractC4154l.m8923f(error, "error");
        this.f17580a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && AbstractC4154l.m8918a(this.f17580a, ((s0) obj).f17580a);
    }

    public final int hashCode() {
        return this.f17580a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("DccNotValid(error=", this.f17580a, ")");
    }
}
