package o1;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import p1.AbstractC5788a;
import s4.C6750f;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 implements h1 {

    /* renamed from: a */
    public final float f25753a;

    /* renamed from: b */
    public final float f25754b;

    /* renamed from: c */
    public final float f25755c;

    /* renamed from: d */
    public final float f25756d;

    public i1(float f6, float f10, float f11, float f12) {
        this.f25753a = f6;
        this.f25754b = f10;
        this.f25755c = f11;
        this.f25756d = f12;
        if (!((f6 >= DefinitionKt.NO_Float_VALUE) & (f10 >= DefinitionKt.NO_Float_VALUE) & (f11 >= DefinitionKt.NO_Float_VALUE)) || !(f12 >= DefinitionKt.NO_Float_VALUE)) {
            AbstractC5788a.m11338a("Padding must be non-negative");
        }
    }

    @Override // o1.h1
    /* renamed from: a */
    public final float mo10341a() {
        return this.f25756d;
    }

    @Override // o1.h1
    /* renamed from: b */
    public final float mo10342b(EnumC6757m enumC6757m) {
        return enumC6757m == EnumC6757m.Ltr ? this.f25753a : this.f25755c;
    }

    @Override // o1.h1
    /* renamed from: c */
    public final float mo10343c(EnumC6757m enumC6757m) {
        return enumC6757m == EnumC6757m.Ltr ? this.f25755c : this.f25753a;
    }

    @Override // o1.h1
    /* renamed from: d */
    public final float mo10344d() {
        return this.f25754b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return C6750f.m12935a(this.f25753a, i1Var.f25753a) && C6750f.m12935a(this.f25754b, i1Var.f25754b) && C6750f.m12935a(this.f25755c, i1Var.f25755c) && C6750f.m12935a(this.f25756d, i1Var.f25756d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f25756d) + AbstractC1452a.m4555b(this.f25755c, AbstractC1452a.m4555b(this.f25754b, Float.hashCode(this.f25753a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C6750f.m12936b(this.f25753a)) + ", top=" + ((Object) C6750f.m12936b(this.f25754b)) + ", end=" + ((Object) C6750f.m12936b(this.f25755c)) + ", bottom=" + ((Object) C6750f.m12936b(this.f25756d)) + ')';
    }
}
