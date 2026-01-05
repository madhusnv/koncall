package uq;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uq.l */
/* loaded from: classes3.dex */
public final class C7506l extends AbstractC7507m {

    /* renamed from: a */
    public final String f36202a;

    public C7506l(String text) {
        AbstractC4154l.m8923f(text, "text");
        this.f36202a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7506l) && AbstractC4154l.m8918a(this.f36202a, ((C7506l) obj).f36202a);
    }

    public final int hashCode() {
        return this.f36202a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SearchText(text=", this.f36202a, ")");
    }
}
