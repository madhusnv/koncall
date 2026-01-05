package androidx.compose.ui.draw;

import a3.C0050i;
import c3.C0850e;
import com.sun.mail.util.AbstractC1452a;
import d3.C1559m;
import i3.AbstractC3166c;
import kotlin.jvm.internal.AbstractC4154l;
import t3.InterfaceC7023j;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class PainterElement extends a1 {

    /* renamed from: a */
    public final AbstractC3166c f2092a;

    /* renamed from: b */
    public final InterfaceC7866e f2093b;

    /* renamed from: c */
    public final InterfaceC7023j f2094c;

    /* renamed from: d */
    public final float f2095d;

    /* renamed from: e */
    public final C1559m f2096e;

    public PainterElement(AbstractC3166c abstractC3166c, InterfaceC7866e interfaceC7866e, InterfaceC7023j interfaceC7023j, float f6, C1559m c1559m) {
        this.f2092a = abstractC3166c;
        this.f2093b = interfaceC7866e;
        this.f2094c = interfaceC7023j;
        this.f2095d = f6;
        this.f2096e = c1559m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return AbstractC4154l.m8918a(this.f2092a, painterElement.f2092a) && AbstractC4154l.m8918a(this.f2093b, painterElement.f2093b) && AbstractC4154l.m8918a(this.f2094c, painterElement.f2094c) && Float.compare(this.f2095d, painterElement.f2095d) == 0 && AbstractC4154l.m8918a(this.f2096e, painterElement.f2096e);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0050i c0050i = new C0050i();
        c0050i.f208q = this.f2092a;
        c0050i.f209r = true;
        c0050i.f210s = this.f2093b;
        c0050i.f211t = this.f2094c;
        c0050i.f212v = this.f2095d;
        c0050i.f213w = this.f2096e;
        return c0050i;
    }

    public final int hashCode() {
        int iM4555b = AbstractC1452a.m4555b(this.f2095d, (this.f2094c.hashCode() + ((this.f2093b.hashCode() + AbstractC1452a.m4558e(this.f2092a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C1559m c1559m = this.f2096e;
        return iM4555b + (c1559m == null ? 0 : c1559m.hashCode());
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C0050i c0050i = (C0050i) abstractC7878q;
        boolean z6 = c0050i.f209r;
        AbstractC3166c abstractC3166c = this.f2092a;
        boolean z10 = (z6 && C0850e.m2290a(c0050i.f208q.mo7533h(), abstractC3166c.mo7533h())) ? false : true;
        c0050i.f208q = abstractC3166c;
        c0050i.f209r = true;
        c0050i.f210s = this.f2093b;
        c0050i.f211t = this.f2094c;
        c0050i.f212v = this.f2095d;
        c0050i.f213w = this.f2096e;
        if (z10) {
            AbstractC7634f.m14553n(c0050i);
        }
        AbstractC7634f.m14552m(c0050i);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f2092a + ", sizeToIntrinsics=true, alignment=" + this.f2093b + ", contentScale=" + this.f2094c + ", alpha=" + this.f2095d + ", colorFilter=" + this.f2096e + ')';
    }
}
