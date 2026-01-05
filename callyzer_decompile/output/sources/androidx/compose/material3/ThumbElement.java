package androidx.compose.material3;

import g2.uc;
import h1.AbstractC2773d;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4629k;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class ThumbElement extends a1 {

    /* renamed from: a */
    public final InterfaceC4629k f2070a;

    /* renamed from: b */
    public final boolean f2071b;

    public ThumbElement(InterfaceC4629k interfaceC4629k, boolean z6) {
        this.f2070a = interfaceC4629k;
        this.f2071b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return AbstractC4154l.m8918a(this.f2070a, thumbElement.f2070a) && this.f2071b == thumbElement.f2071b;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        uc ucVar = new uc();
        ucVar.f12904q = this.f2070a;
        ucVar.f12905r = this.f2071b;
        ucVar.f12909w = Float.NaN;
        ucVar.f12910x = Float.NaN;
        return ucVar;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2071b) + (this.f2070a.hashCode() * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        uc ucVar = (uc) abstractC7878q;
        ucVar.f12904q = this.f2070a;
        boolean z6 = ucVar.f12905r;
        boolean z10 = this.f2071b;
        if (z6 != z10) {
            AbstractC7634f.m14553n(ucVar);
        }
        ucVar.f12905r = z10;
        if (ucVar.f12908v == null && !Float.isNaN(ucVar.f12910x)) {
            ucVar.f12908v = AbstractC2773d.m6778a(ucVar.f12910x);
        }
        if (ucVar.f12907t != null || Float.isNaN(ucVar.f12909w)) {
            return;
        }
        ucVar.f12907t = AbstractC2773d.m6778a(ucVar.f12909w);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThumbElement(interactionSource=");
        sb2.append(this.f2070a);
        sb2.append(", checked=");
        return m0.m7382o(sb2, this.f2071b, ')');
    }
}
