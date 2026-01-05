package ur;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.e */
/* loaded from: classes3.dex */
public final class C7512e extends AbstractC7523p {

    /* renamed from: a */
    public final String f36211a;

    public C7512e(String number) {
        AbstractC4154l.m8923f(number, "number");
        this.f36211a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7512e) && AbstractC4154l.m8918a(this.f36211a, ((C7512e) obj).f36211a);
    }

    public final int hashCode() {
        return this.f36211a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("PlaceCall(number=", this.f36211a, ")");
    }
}
