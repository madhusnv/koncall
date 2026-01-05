package im;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.t6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends t6 {

    /* renamed from: a */
    public final String f17547a;

    public e0(String str) {
        this.f17547a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && AbstractC4154l.m8918a(this.f17547a, ((e0) obj).f17547a);
    }

    public final int hashCode() {
        return this.f17547a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SIMListEmpty(message=", this.f17547a, ")");
    }
}
