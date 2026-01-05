package androidx.compose.foundation.text.input.internal;

import b2.y0;
import kotlin.jvm.internal.AbstractC4154l;
import n1.AbstractC4941a;
import v3.a1;
import w2.AbstractC7878q;
import x1.v0;
import z1.C8843c;
import z1.C8850j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends a1 {

    /* renamed from: a */
    public final C8843c f2040a;

    /* renamed from: b */
    public final v0 f2041b;

    /* renamed from: c */
    public final y0 f2042c;

    public LegacyAdaptingPlatformTextInputModifier(C8843c c8843c, v0 v0Var, y0 y0Var) {
        this.f2040a = c8843c;
        this.f2041b = v0Var;
        this.f2042c = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return AbstractC4154l.m8918a(this.f2040a, legacyAdaptingPlatformTextInputModifier.f2040a) && AbstractC4154l.m8918a(this.f2041b, legacyAdaptingPlatformTextInputModifier.f2041b) && AbstractC4154l.m8918a(this.f2042c, legacyAdaptingPlatformTextInputModifier.f2042c);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C8850j(this.f2040a, this.f2041b, this.f2042c);
    }

    public final int hashCode() {
        return this.f2042c.hashCode() + ((this.f2041b.hashCode() + (this.f2040a.hashCode() * 31)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) throws Throwable {
        C8850j c8850j = (C8850j) abstractC7878q;
        if (c8850j.f37683p) {
            c8850j.f42585q.mo9095c();
            c8850j.f42585q.m16309k(c8850j);
        }
        C8843c c8843c = this.f2040a;
        c8850j.f42585q = c8843c;
        if (c8850j.f37683p) {
            if (c8843c.f42561a != null) {
                AbstractC4941a.m9886c("Expected textInputModifierNode to be null");
            }
            c8843c.f42561a = c8850j;
        }
        c8850j.f42586r = this.f2041b;
        c8850j.f42587s = this.f2042c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f2040a + ", legacyTextFieldState=" + this.f2041b + ", textFieldSelectionManager=" + this.f2042c + ')';
    }
}
