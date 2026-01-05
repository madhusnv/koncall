package xd;

import i3.AbstractC3166c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.f */
/* loaded from: classes.dex */
public final class C8335f extends AbstractC8337h {

    /* renamed from: a */
    public final AbstractC3166c f39930a;

    public C8335f(AbstractC3166c abstractC3166c) {
        this.f39930a = abstractC3166c;
    }

    @Override // xd.AbstractC8337h
    /* renamed from: a */
    public final AbstractC3166c mo15519a() {
        return this.f39930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8335f) && AbstractC4154l.m8918a(this.f39930a, ((C8335f) obj).f39930a);
    }

    public final int hashCode() {
        AbstractC3166c abstractC3166c = this.f39930a;
        if (abstractC3166c == null) {
            return 0;
        }
        return abstractC3166c.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f39930a + ')';
    }
}
