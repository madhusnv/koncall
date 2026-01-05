package androidx.compose.foundation.layout;

import o1.C5253l;
import v3.a1;
import w2.AbstractC7878q;
import w2.C7871j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class BoxChildDataElement extends a1 {

    /* renamed from: a */
    public final C7871j f1940a;

    /* renamed from: b */
    public final boolean f1941b;

    public BoxChildDataElement(C7871j c7871j, boolean z6) {
        this.f1940a = c7871j;
        this.f1941b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.f1940a.equals(boxChildDataElement.f1940a) && this.f1941b == boxChildDataElement.f1941b;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C5253l c5253l = new C5253l();
        c5253l.f25778q = this.f1940a;
        c5253l.f25779r = this.f1941b;
        return c5253l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1941b) + (this.f1940a.hashCode() * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C5253l c5253l = (C5253l) abstractC7878q;
        c5253l.f25778q = this.f1940a;
        c5253l.f25779r = this.f1941b;
    }
}
