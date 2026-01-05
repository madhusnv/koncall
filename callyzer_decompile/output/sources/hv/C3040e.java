package hv;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hv.e */
/* loaded from: classes3.dex */
public final class C3040e extends AbstractC3049n {

    /* renamed from: a */
    public final String f16371a;

    public C3040e(String str) {
        this.f16371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3040e) && AbstractC4154l.m8918a(this.f16371a, ((C3040e) obj).f16371a);
    }

    public final int hashCode() {
        return this.f16371a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SetDCC(dcc=", this.f16371a, ")");
    }
}
