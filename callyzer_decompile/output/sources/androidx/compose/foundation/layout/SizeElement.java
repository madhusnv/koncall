package androidx.compose.foundation.layout;

import com.sun.mail.util.AbstractC1452a;
import o1.q1;
import s4.C6750f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class SizeElement extends a1 {

    /* renamed from: a */
    public final float f1955a;

    /* renamed from: b */
    public final float f1956b;

    /* renamed from: c */
    public final float f1957c;

    /* renamed from: d */
    public final float f1958d;

    /* renamed from: e */
    public final boolean f1959e;

    public SizeElement(float f6, float f10, float f11, float f12, boolean z6) {
        this.f1955a = f6;
        this.f1956b = f10;
        this.f1957c = f11;
        this.f1958d = f12;
        this.f1959e = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return C6750f.m12935a(this.f1955a, sizeElement.f1955a) && C6750f.m12935a(this.f1956b, sizeElement.f1956b) && C6750f.m12935a(this.f1957c, sizeElement.f1957c) && C6750f.m12935a(this.f1958d, sizeElement.f1958d) && this.f1959e == sizeElement.f1959e;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        q1 q1Var = new q1();
        q1Var.f25821q = this.f1955a;
        q1Var.f25822r = this.f1956b;
        q1Var.f25823s = this.f1957c;
        q1Var.f25824t = this.f1958d;
        q1Var.f25825v = this.f1959e;
        return q1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1959e) + AbstractC1452a.m4555b(this.f1958d, AbstractC1452a.m4555b(this.f1957c, AbstractC1452a.m4555b(this.f1956b, Float.hashCode(this.f1955a) * 31, 31), 31), 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        q1 q1Var = (q1) abstractC7878q;
        q1Var.f25821q = this.f1955a;
        q1Var.f25822r = this.f1956b;
        q1Var.f25823s = this.f1957c;
        q1Var.f25824t = this.f1958d;
        q1Var.f25825v = this.f1959e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SizeElement(float f6, float f10, float f11, float f12, boolean z6, int i10) {
        boolean z10;
        float f13;
        f6 = (i10 & 1) != 0 ? Float.NaN : f6;
        f10 = (i10 & 2) != 0 ? Float.NaN : f10;
        f11 = (i10 & 4) != 0 ? Float.NaN : f11;
        if ((i10 & 8) != 0) {
            z10 = z6;
            f13 = Float.NaN;
        } else {
            z10 = z6;
            f13 = f12;
        }
        this(f6, f10, f11, f13, z10);
    }
}
