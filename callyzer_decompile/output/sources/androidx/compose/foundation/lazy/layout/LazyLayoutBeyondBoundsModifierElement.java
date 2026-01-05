package androidx.compose.foundation.lazy.layout;

import com.sun.mail.util.AbstractC1452a;
import k1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import l4.d0;
import s1.C6719n;
import s1.InterfaceC6720o;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends a1 {

    /* renamed from: a */
    public final InterfaceC6720o f1979a;

    /* renamed from: b */
    public final d0 f1980b;

    /* renamed from: c */
    public final x0 f1981c;

    public LazyLayoutBeyondBoundsModifierElement(InterfaceC6720o interfaceC6720o, d0 d0Var, x0 x0Var) {
        this.f1979a = interfaceC6720o;
        this.f1980b = d0Var;
        this.f1981c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return AbstractC4154l.m8918a(this.f1979a, lazyLayoutBeyondBoundsModifierElement.f1979a) && AbstractC4154l.m8918a(this.f1980b, lazyLayoutBeyondBoundsModifierElement.f1980b) && this.f1981c == lazyLayoutBeyondBoundsModifierElement.f1981c;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C6719n c6719n = new C6719n();
        c6719n.f32111q = this.f1979a;
        c6719n.f32112r = this.f1980b;
        c6719n.f32113s = this.f1981c;
        return c6719n;
    }

    public final int hashCode() {
        return this.f1981c.hashCode() + AbstractC1452a.m4558e((this.f1980b.hashCode() + (this.f1979a.hashCode() * 31)) * 31, 31, false);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C6719n c6719n = (C6719n) abstractC7878q;
        c6719n.f32111q = this.f1979a;
        c6719n.f32112r = this.f1980b;
        c6719n.f32113s = this.f1981c;
    }
}
