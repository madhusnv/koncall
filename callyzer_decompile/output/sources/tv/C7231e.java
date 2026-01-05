package tv;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tv.e */
/* loaded from: classes3.dex */
public final class C7231e extends AbstractC7236j {

    /* renamed from: a */
    public final String f34583a;

    public C7231e(String str) {
        this.f34583a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7231e) && AbstractC4154l.m8918a(this.f34583a, ((C7231e) obj).f34583a);
    }

    public final int hashCode() {
        return this.f34583a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("DccCodeChange(dccCode=", this.f34583a, ")");
    }
}
