package androidx.compose.foundation.layout;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import o1.g1;
import p1.AbstractC5788a;
import s4.C6750f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class PaddingElement extends a1 {

    /* renamed from: a */
    public final float f1950a;

    /* renamed from: b */
    public final float f1951b;

    /* renamed from: c */
    public final float f1952c;

    /* renamed from: d */
    public final float f1953d;

    public PaddingElement(float f6, float f10, float f11, float f12) {
        this.f1950a = f6;
        this.f1951b = f10;
        this.f1952c = f11;
        this.f1953d = f12;
        boolean z6 = true;
        boolean z10 = (f6 >= DefinitionKt.NO_Float_VALUE || Float.isNaN(f6)) & (f10 >= DefinitionKt.NO_Float_VALUE || Float.isNaN(f10)) & (f11 >= DefinitionKt.NO_Float_VALUE || Float.isNaN(f11));
        if (f12 < DefinitionKt.NO_Float_VALUE && !Float.isNaN(f12)) {
            z6 = false;
        }
        if (!z10 || !z6) {
            AbstractC5788a.m11338a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && C6750f.m12935a(this.f1950a, paddingElement.f1950a) && C6750f.m12935a(this.f1951b, paddingElement.f1951b) && C6750f.m12935a(this.f1952c, paddingElement.f1952c) && C6750f.m12935a(this.f1953d, paddingElement.f1953d);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        g1 g1Var = new g1();
        g1Var.f25735q = this.f1950a;
        g1Var.f25736r = this.f1951b;
        g1Var.f25737s = this.f1952c;
        g1Var.f25738t = this.f1953d;
        g1Var.f25739v = true;
        return g1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1452a.m4555b(this.f1953d, AbstractC1452a.m4555b(this.f1952c, AbstractC1452a.m4555b(this.f1951b, Float.hashCode(this.f1950a) * 31, 31), 31), 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        g1 g1Var = (g1) abstractC7878q;
        g1Var.f25735q = this.f1950a;
        g1Var.f25736r = this.f1951b;
        g1Var.f25737s = this.f1952c;
        g1Var.f25738t = this.f1953d;
        g1Var.f25739v = true;
    }
}
