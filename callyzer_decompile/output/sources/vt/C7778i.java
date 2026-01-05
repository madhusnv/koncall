package vt;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.m6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.i */
/* loaded from: classes3.dex */
public final class C7778i extends m6 {

    /* renamed from: a */
    public final String f37441a;

    public C7778i(String qrCode) {
        AbstractC4154l.m8923f(qrCode, "qrCode");
        this.f37441a = qrCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7778i) && AbstractC4154l.m8918a(this.f37441a, ((C7778i) obj).f37441a);
    }

    public final int hashCode() {
        return this.f37441a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("DisconnectExetension(qrCode=", this.f37441a, ")");
    }
}
