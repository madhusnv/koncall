package androidx.compose.ui;

import com.sun.mail.util.AbstractC1452a;
import v3.a1;
import w2.AbstractC7878q;
import w2.C7882u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ZIndexElement extends a1 {

    /* renamed from: a */
    public final float f2087a;

    public ZIndexElement(float f6) {
        this.f2087a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f2087a, ((ZIndexElement) obj).f2087a) == 0;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C7882u c7882u = new C7882u();
        c7882u.f37686q = this.f2087a;
        return c7882u;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2087a);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C7882u) abstractC7878q).f37686q = this.f2087a;
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("ZIndexElement(zIndex="), this.f2087a, ')');
    }
}
