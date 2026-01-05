package androidx.compose.foundation.layout;

import com.sun.mail.util.AbstractC1452a;
import o1.f1;
import s4.C6750f;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class OffsetElement extends a1 {

    /* renamed from: a */
    public final float f1948a;

    /* renamed from: b */
    public final float f1949b;

    public OffsetElement(float f6, float f10) {
        this.f1948a = f6;
        this.f1949b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && C6750f.m12935a(this.f1948a, offsetElement.f1948a) && C6750f.m12935a(this.f1949b, offsetElement.f1949b);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        f1 f1Var = new f1();
        f1Var.f25726q = this.f1948a;
        f1Var.f25727r = this.f1949b;
        f1Var.f25728s = true;
        return f1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1452a.m4555b(this.f1949b, Float.hashCode(this.f1948a) * 31, 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        f1 f1Var = (f1) abstractC7878q;
        float f6 = f1Var.f25726q;
        float f10 = this.f1948a;
        boolean zM12935a = C6750f.m12935a(f6, f10);
        float f11 = this.f1949b;
        if (!zM12935a || !C6750f.m12935a(f1Var.f25727r, f11) || !f1Var.f25728s) {
            AbstractC7634f.m14563x(f1Var).m14590V(false);
        }
        f1Var.f25726q = f10;
        f1Var.f25727r = f11;
        f1Var.f25728s = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) C6750f.m12936b(this.f1948a)) + ", y=" + ((Object) C6750f.m12936b(this.f1949b)) + ", rtlAware=true)";
    }
}
