package v3;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import s3.AbstractC6744a;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.o */
/* loaded from: classes.dex */
public final class C7643o {

    /* renamed from: a */
    public final float f36962a;

    /* renamed from: b */
    public final float f36963b;

    /* renamed from: c */
    public final float f36964c;

    /* renamed from: d */
    public final float f36965d;

    public C7643o(float f6, float f10, float f11, float f12) {
        this.f36962a = f6;
        this.f36963b = f10;
        this.f36964c = f11;
        this.f36965d = f12;
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            AbstractC6744a.m12906a("Left must be non-negative");
        }
        if (f10 < DefinitionKt.NO_Float_VALUE) {
            AbstractC6744a.m12906a("Top must be non-negative");
        }
        if (f11 < DefinitionKt.NO_Float_VALUE) {
            AbstractC6744a.m12906a("Right must be non-negative");
        }
        if (f12 >= DefinitionKt.NO_Float_VALUE) {
            return;
        }
        AbstractC6744a.m12906a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7643o)) {
            return false;
        }
        C7643o c7643o = (C7643o) obj;
        return C6750f.m12935a(this.f36962a, c7643o.f36962a) && C6750f.m12935a(this.f36963b, c7643o.f36963b) && C6750f.m12935a(this.f36964c, c7643o.f36964c) && C6750f.m12935a(this.f36965d, c7643o.f36965d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1452a.m4555b(this.f36965d, AbstractC1452a.m4555b(this.f36964c, AbstractC1452a.m4555b(this.f36963b, Float.hashCode(this.f36962a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) C6750f.m12936b(this.f36962a)) + ", top=" + ((Object) C6750f.m12936b(this.f36963b)) + ", end=" + ((Object) C6750f.m12936b(this.f36964c)) + ", bottom=" + ((Object) C6750f.m12936b(this.f36965d)) + ", isLayoutDirectionAware=true)";
    }
}
