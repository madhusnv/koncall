package ao;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.b */
/* loaded from: classes3.dex */
public final class C0363b extends AbstractC0366e {

    /* renamed from: a */
    public final Exception f2916a;

    public C0363b(Exception exc) {
        this.f2916a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0363b) && AbstractC4154l.m8918a(this.f2916a, ((C0363b) obj).f2916a);
    }

    public final int hashCode() {
        return this.f2916a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11237h("Error(exception=", ")", this.f2916a);
    }
}
