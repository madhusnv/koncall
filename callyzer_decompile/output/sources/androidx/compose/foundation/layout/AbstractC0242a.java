package androidx.compose.foundation.layout;

import o1.a1;
import o1.h1;
import o1.i1;
import s4.C6745a;
import s4.EnumC6757m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.layout.a */
/* loaded from: classes.dex */
public abstract class AbstractC0242a {
    /* renamed from: a */
    public static i1 m647a(float f6, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        float f10 = 0;
        return new i1(f6, f10, f6, f10);
    }

    /* renamed from: b */
    public static final i1 m648b(float f6, float f10, float f11, float f12) {
        return new i1(f6, f10, f11, f12);
    }

    /* renamed from: c */
    public static i1 m649c(float f6, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return new i1(f6, f10, f11, f12);
    }

    /* renamed from: d */
    public static InterfaceC7879r m650d(InterfaceC7879r interfaceC7879r) {
        return interfaceC7879r.mo14852e(new AspectRatioElement());
    }

    /* renamed from: e */
    public static final float m651e(h1 h1Var, EnumC6757m enumC6757m) {
        return enumC6757m == EnumC6757m.Ltr ? h1Var.mo10343c(enumC6757m) : h1Var.mo10342b(enumC6757m);
    }

    /* renamed from: f */
    public static final float m652f(h1 h1Var, EnumC6757m enumC6757m) {
        return enumC6757m == EnumC6757m.Ltr ? h1Var.mo10342b(enumC6757m) : h1Var.mo10343c(enumC6757m);
    }

    /* renamed from: g */
    public static final boolean m653g(int i10, int i11, long j6) {
        int iM12920k = C6745a.m12920k(j6);
        if (i10 > C6745a.m12918i(j6) || iM12920k > i10) {
            return false;
        }
        return i11 <= C6745a.m12917h(j6) && C6745a.m12919j(j6) <= i11;
    }

    /* renamed from: h */
    public static final InterfaceC7879r m654h(InterfaceC7879r interfaceC7879r, float f6, float f10) {
        return interfaceC7879r.mo14852e(new OffsetElement(f6, f10));
    }

    /* renamed from: i */
    public static final InterfaceC7879r m655i(InterfaceC7879r interfaceC7879r, h1 h1Var) {
        return interfaceC7879r.mo14852e(new PaddingValuesElement(h1Var));
    }

    /* renamed from: j */
    public static final InterfaceC7879r m656j(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(new PaddingElement(f6, f6, f6, f6));
    }

    /* renamed from: k */
    public static final InterfaceC7879r m657k(InterfaceC7879r interfaceC7879r, float f6, float f10) {
        return interfaceC7879r.mo14852e(new PaddingElement(f6, f10, f6, f10));
    }

    /* renamed from: l */
    public static InterfaceC7879r m658l(InterfaceC7879r interfaceC7879r, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        return m657k(interfaceC7879r, f6, f10);
    }

    /* renamed from: m */
    public static final InterfaceC7879r m659m(InterfaceC7879r interfaceC7879r, float f6, float f10, float f11, float f12) {
        return interfaceC7879r.mo14852e(new PaddingElement(f6, f10, f11, f12));
    }

    /* renamed from: n */
    public static InterfaceC7879r m660n(InterfaceC7879r interfaceC7879r, float f6, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return m659m(interfaceC7879r, f6, f10, f11, f12);
    }

    /* renamed from: o */
    public static final InterfaceC7879r m661o(InterfaceC7879r interfaceC7879r, a1 a1Var) {
        return interfaceC7879r.mo14852e(new IntrinsicWidthElement(a1Var));
    }
}
