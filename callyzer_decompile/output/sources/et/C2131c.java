package et;

import kotlin.jvm.internal.AbstractC4154l;
import og.de;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: et.c */
/* loaded from: classes3.dex */
public final class C2131c extends de {

    /* renamed from: a */
    public final String f9964a;

    public C2131c(String message) {
        AbstractC4154l.m8923f(message, "message");
        this.f9964a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2131c) && AbstractC4154l.m8918a(this.f9964a, ((C2131c) obj).f9964a);
    }

    public final int hashCode() {
        return this.f9964a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("MessageChanged(message=", this.f9964a, ")");
    }
}
