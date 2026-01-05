package androidx.compose.foundation.relocation;

import kotlin.jvm.internal.AbstractC4154l;
import u1.C7300b;
import u1.C7301c;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends a1 {

    /* renamed from: a */
    public final C7300b f2001a;

    public BringIntoViewRequesterElement(C7300b c7300b) {
        this.f2001a = c7300b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return AbstractC4154l.m8918a(this.f2001a, ((BringIntoViewRequesterElement) obj).f2001a);
        }
        return false;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C7301c c7301c = new C7301c();
        c7301c.f34829q = this.f2001a;
        return c7301c;
    }

    public final int hashCode() {
        return this.f2001a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C7301c c7301c = (C7301c) abstractC7878q;
        C7300b c7300b = c7301c.f34829q;
        if (c7300b != null) {
            c7300b.f34828a.m9514l(c7301c);
        }
        C7300b c7300b2 = this.f2001a;
        if (c7300b2 != null) {
            c7300b2.f34828a.m9506b(c7301c);
        }
        c7301c.f34829q = c7300b2;
    }
}
