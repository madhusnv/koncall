package mb;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.e */
/* loaded from: classes.dex */
public final class C4689e extends AbstractC4690f {

    /* renamed from: b */
    public final String f23229b;

    public C4689e(String str) {
        this.f23229b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4689e) && AbstractC4154l.m8918a(this.f23229b, ((C4689e) obj).f23229b);
    }

    public final int hashCode() {
        return this.f23229b.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SdkUnknown("), this.f23229b, ')');
    }
}
