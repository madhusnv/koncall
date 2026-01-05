package j1;

import k2.C3953b;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j1.j */
/* loaded from: classes.dex */
public final class C3518j {

    /* renamed from: a */
    public final e1 f18408a = C3953b.m8517t(C3515g.f18406a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3518j) {
            return AbstractC4154l.m8918a((AbstractC3517i) ((C3518j) obj).f18408a.getValue(), (AbstractC3517i) this.f18408a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC3517i) this.f18408a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((AbstractC3517i) this.f18408a.getValue()) + ')';
    }
}
