package androidx.compose.material3;

import com.sun.mail.util.AbstractC1452a;
import g2.kb;
import i0.m0;
import k2.e1;
import k2.h2;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TabIndicatorModifier extends a1 {

    /* renamed from: a */
    public final h2 f2067a;

    /* renamed from: b */
    public final int f2068b;

    /* renamed from: c */
    public final boolean f2069c;

    public TabIndicatorModifier(e1 e1Var, int i10, boolean z6) {
        this.f2067a = e1Var;
        this.f2068b = i10;
        this.f2069c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return AbstractC4154l.m8918a(this.f2067a, tabIndicatorModifier.f2067a) && this.f2068b == tabIndicatorModifier.f2068b && this.f2069c == tabIndicatorModifier.f2069c;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        kb kbVar = new kb();
        kbVar.f11948q = this.f2067a;
        kbVar.f11949r = this.f2068b;
        kbVar.f11950s = this.f2069c;
        return kbVar;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2069c) + AbstractC1452a.m4556c(this.f2068b, this.f2067a.hashCode() * 31, 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        kb kbVar = (kb) abstractC7878q;
        kbVar.f11948q = this.f2067a;
        kbVar.f11949r = this.f2068b;
        kbVar.f11950s = this.f2069c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabIndicatorModifier(tabPositionsState=");
        sb2.append(this.f2067a);
        sb2.append(", selectedTabIndex=");
        sb2.append(this.f2068b);
        sb2.append(", followContentSize=");
        return m0.m7382o(sb2, this.f2069c, ')');
    }
}
