package androidx.compose.foundation.layout;

import com.skydoves.balloon.internals.DefinitionKt;
import cp.C1475f;
import g2.a7;
import kotlin.jvm.internal.AbstractC4154l;
import o1.EnumC5267z;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w2.C7871j;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.layout.d */
/* loaded from: classes.dex */
public abstract class AbstractC0245d {

    /* renamed from: a */
    public static final FillElement f1969a;

    /* renamed from: b */
    public static final FillElement f1970b;

    /* renamed from: c */
    public static final FillElement f1971c;

    /* renamed from: d */
    public static final WrapContentElement f1972d;

    /* renamed from: e */
    public static final WrapContentElement f1973e;

    /* renamed from: f */
    public static final WrapContentElement f1974f;

    /* renamed from: g */
    public static final WrapContentElement f1975g;

    /* renamed from: h */
    public static final WrapContentElement f1976h;

    /* renamed from: i */
    public static final WrapContentElement f1977i;

    static {
        EnumC5267z enumC5267z = EnumC5267z.Horizontal;
        f1969a = new FillElement(enumC5267z, 1.0f);
        EnumC5267z enumC5267z2 = EnumC5267z.Vertical;
        f1970b = new FillElement(enumC5267z2, 1.0f);
        EnumC5267z enumC5267z3 = EnumC5267z.Both;
        f1971c = new FillElement(enumC5267z3, 1.0f);
        C7869h c7869h = C7864c.f37655p;
        int i10 = 16;
        f1972d = new WrapContentElement(enumC5267z, new C1475f(i10, c7869h), c7869h);
        C7869h c7869h2 = C7864c.f37654n;
        f1973e = new WrapContentElement(enumC5267z, new C1475f(i10, c7869h2), c7869h2);
        C7870i c7870i = C7864c.f37652l;
        int i11 = 14;
        f1974f = new WrapContentElement(enumC5267z2, new C1475f(i11, c7870i), c7870i);
        C7870i c7870i2 = C7864c.f37651k;
        f1975g = new WrapContentElement(enumC5267z2, new C1475f(i11, c7870i2), c7870i2);
        C7871j c7871j = C7864c.f37646e;
        int i12 = 15;
        f1976h = new WrapContentElement(enumC5267z3, new C1475f(i12, c7871j), c7871j);
        C7871j c7871j2 = C7864c.f37642a;
        f1977i = new WrapContentElement(enumC5267z3, new C1475f(i12, c7871j2), c7871j2);
    }

    /* renamed from: a */
    public static final InterfaceC7879r m664a(InterfaceC7879r interfaceC7879r, float f6, float f10) {
        return interfaceC7879r.mo14852e(new UnspecifiedConstraintsElement(f6, f10));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC7879r m665b(InterfaceC7879r interfaceC7879r, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return m664a(interfaceC7879r, f6, f10);
    }

    /* renamed from: c */
    public static final InterfaceC7879r m666c(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(f6 == 1.0f ? f1970b : new FillElement(EnumC5267z.Vertical, f6));
    }

    /* renamed from: d */
    public static InterfaceC7879r m667d(InterfaceC7879r interfaceC7879r) {
        return interfaceC7879r.mo14852e(f1971c);
    }

    /* renamed from: e */
    public static final InterfaceC7879r m668e(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(f6 == 1.0f ? f1969a : new FillElement(EnumC5267z.Horizontal, f6));
    }

    /* renamed from: g */
    public static final InterfaceC7879r m670g(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(new SizeElement(DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, f6, true, 5));
    }

    /* renamed from: h */
    public static final InterfaceC7879r m671h(InterfaceC7879r interfaceC7879r, float f6, float f10) {
        return interfaceC7879r.mo14852e(new SizeElement(DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, f10, true, 5));
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC7879r m672i(InterfaceC7879r interfaceC7879r, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return m671h(interfaceC7879r, f6, f10);
    }

    /* renamed from: j */
    public static final InterfaceC7879r m673j(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(new SizeElement(DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, f6, false, 5));
    }

    /* renamed from: k */
    public static final InterfaceC7879r m674k(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, f6, f6, f6, false));
    }

    /* renamed from: l */
    public static final InterfaceC7879r m675l(InterfaceC7879r interfaceC7879r, float f6, float f10) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, f10, f6, f10, false));
    }

    /* renamed from: m */
    public static InterfaceC7879r m676m(InterfaceC7879r interfaceC7879r, float f6, float f10, float f11, float f12, int i10) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? Float.NaN : f11, (i10 & 8) != 0 ? Float.NaN : f12, false));
    }

    /* renamed from: n */
    public static final InterfaceC7879r m677n(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, false, 10));
    }

    /* renamed from: o */
    public static final InterfaceC7879r m678o(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, f6, f6, f6, true));
    }

    /* renamed from: p */
    public static final InterfaceC7879r m679p(InterfaceC7879r interfaceC7879r, float f6, float f10) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, f10, f6, f10, true));
    }

    /* renamed from: q */
    public static final InterfaceC7879r m680q(InterfaceC7879r interfaceC7879r, float f6, float f10, float f11, float f12) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, f10, f11, f12, true));
    }

    /* renamed from: r */
    public static /* synthetic */ InterfaceC7879r m681r(InterfaceC7879r interfaceC7879r, float f6, float f10, int i10) {
        float f11 = a7.f11171b;
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        return m680q(interfaceC7879r, f6, f11, f10, Float.NaN);
    }

    /* renamed from: s */
    public static final InterfaceC7879r m682s(InterfaceC7879r interfaceC7879r, float f6) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, true, 10));
    }

    /* renamed from: t */
    public static final InterfaceC7879r m683t(InterfaceC7879r interfaceC7879r, float f6, float f10) {
        return interfaceC7879r.mo14852e(new SizeElement(f6, DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, true, 10));
    }

    /* renamed from: u */
    public static /* synthetic */ InterfaceC7879r m684u(InterfaceC7879r interfaceC7879r, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return m683t(interfaceC7879r, f6, f10);
    }

    /* renamed from: v */
    public static InterfaceC7879r m685v(InterfaceC7879r interfaceC7879r, int i10) {
        C7870i c7870i = C7864c.f37652l;
        return interfaceC7879r.mo14852e(c7870i.equals(c7870i) ? f1974f : c7870i.equals(C7864c.f37651k) ? f1975g : new WrapContentElement(EnumC5267z.Vertical, new C1475f(14, c7870i), c7870i));
    }

    /* renamed from: w */
    public static InterfaceC7879r m686w(InterfaceC7879r interfaceC7879r, C7871j c7871j, int i10) {
        C7871j c7871j2 = C7864c.f37646e;
        if ((i10 & 1) != 0) {
            c7871j = c7871j2;
        }
        return interfaceC7879r.mo14852e(c7871j.equals(c7871j2) ? f1976h : c7871j.equals(C7864c.f37642a) ? f1977i : new WrapContentElement(EnumC5267z.Both, new C1475f(15, c7871j), c7871j));
    }

    /* renamed from: x */
    public static InterfaceC7879r m687x(InterfaceC7879r interfaceC7879r) {
        C7869h c7869h = C7864c.f37655p;
        return interfaceC7879r.mo14852e(AbstractC4154l.m8918a(c7869h, c7869h) ? f1972d : AbstractC4154l.m8918a(c7869h, C7864c.f37654n) ? f1973e : new WrapContentElement(EnumC5267z.Horizontal, new C1475f(16, c7869h), c7869h));
    }
}
