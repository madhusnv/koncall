package cs;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.k */
/* loaded from: classes3.dex */
public final class C1492k extends AbstractC1500s {

    /* renamed from: a */
    public final String f7573a;

    public C1492k(String number) {
        AbstractC4154l.m8923f(number, "number");
        this.f7573a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1492k) && AbstractC4154l.m8918a(this.f7573a, ((C1492k) obj).f7573a);
    }

    public final int hashCode() {
        return this.f7573a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("CopyOnClipboard(number=", this.f7573a, ")");
    }
}
