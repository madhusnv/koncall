package ws;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.o */
/* loaded from: classes3.dex */
public final class C8174o extends AbstractC8175p {

    /* renamed from: a */
    public final String f39098a;

    public C8174o(String str) {
        this.f39098a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8174o) && AbstractC4154l.m8918a(this.f39098a, ((C8174o) obj).f39098a);
    }

    public final int hashCode() {
        String str = this.f39098a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateSelectedSIM(simNumber=", this.f39098a, ")");
    }
}
