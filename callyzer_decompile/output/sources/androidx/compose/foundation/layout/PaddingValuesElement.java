package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC4154l;
import o1.h1;
import o1.j1;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class PaddingValuesElement extends a1 {

    /* renamed from: a */
    public final h1 f1954a;

    public PaddingValuesElement(h1 h1Var) {
        this.f1954a = h1Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f1954a, paddingValuesElement.f1954a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        j1 j1Var = new j1();
        j1Var.f25774q = this.f1954a;
        return j1Var;
    }

    public final int hashCode() {
        return this.f1954a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((j1) abstractC7878q).f25774q = this.f1954a;
    }
}
