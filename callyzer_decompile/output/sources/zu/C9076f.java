package zu;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.f */
/* loaded from: classes3.dex */
public final class C9076f extends AbstractC9092v {

    /* renamed from: a */
    public final String f43608a;

    public C9076f(String str) {
        this.f43608a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9076f) && AbstractC4154l.m8918a(this.f43608a, ((C9076f) obj).f43608a);
    }

    public final int hashCode() {
        return this.f43608a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("MinChange(min=", this.f43608a, ")");
    }
}
