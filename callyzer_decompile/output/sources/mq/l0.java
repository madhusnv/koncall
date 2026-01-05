package mq;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 extends s0 {

    /* renamed from: a */
    public final String f24301a;

    public l0(String number) {
        AbstractC4154l.m8923f(number, "number");
        this.f24301a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && AbstractC4154l.m8918a(this.f24301a, ((l0) obj).f24301a);
    }

    public final int hashCode() {
        return this.f24301a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("CopyNumber(number=", this.f24301a, ")");
    }
}
