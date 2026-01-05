package zu;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.q */
/* loaded from: classes3.dex */
public final class C9087q extends AbstractC9092v {

    /* renamed from: a */
    public final String f43620a;

    public C9087q(String str) {
        this.f43620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9087q) && AbstractC4154l.m8918a(this.f43620a, ((C9087q) obj).f43620a);
    }

    public final int hashCode() {
        return this.f43620a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SecChange(sec=", this.f43620a, ")");
    }
}
