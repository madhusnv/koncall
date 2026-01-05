package im;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h1 extends k1 {

    /* renamed from: a */
    public final String f17560a;

    public h1(String errorMessage) {
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        this.f17560a = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && AbstractC4154l.m8918a(this.f17560a, ((h1) obj).f17560a);
    }

    public final int hashCode() {
        return this.f17560a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("FailureMessage(errorMessage=", this.f17560a, ")");
    }
}
