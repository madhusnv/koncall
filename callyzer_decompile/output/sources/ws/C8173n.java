package ws;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.n */
/* loaded from: classes3.dex */
public final class C8173n extends AbstractC8175p {

    /* renamed from: a */
    public final String f39097a;

    public C8173n(String str) {
        this.f39097a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8173n) && AbstractC4154l.m8918a(this.f39097a, ((C8173n) obj).f39097a);
    }

    public final int hashCode() {
        String str = this.f39097a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateCallType(callType=", this.f39097a, ")");
    }
}
