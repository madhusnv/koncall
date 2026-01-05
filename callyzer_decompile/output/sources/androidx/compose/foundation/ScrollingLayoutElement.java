package androidx.compose.foundation;

import com.sun.mail.util.AbstractC1452a;
import i1.m1;
import i1.p1;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends a1 {

    /* renamed from: a */
    public final p1 f1915a;

    /* renamed from: b */
    public final boolean f1916b;

    public ScrollingLayoutElement(p1 p1Var, boolean z6) {
        this.f1915a = p1Var;
        this.f1916b = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return AbstractC4154l.m8918a(this.f1915a, scrollingLayoutElement.f1915a) && this.f1916b == scrollingLayoutElement.f1916b;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        m1 m1Var = new m1();
        m1Var.f16928q = this.f1915a;
        m1Var.f16929r = this.f1916b;
        return m1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1916b) + AbstractC1452a.m4558e(this.f1915a.hashCode() * 31, 31, false);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        m1 m1Var = (m1) abstractC7878q;
        m1Var.f16928q = this.f1915a;
        m1Var.f16929r = this.f1916b;
    }
}
