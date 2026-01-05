package ly;

import al.C0174b;
import hy.InterfaceC3055f;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import nx.AbstractC5185w;
import og.fa;
import p020v.a1;
import pg.y6;
import qw.C6370t;
import qw.C6372v;
import qw.C6375y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.g */
/* loaded from: classes3.dex */
public final class C4583g extends y6 {

    /* renamed from: b */
    public final C4599w f22712b;

    /* renamed from: c */
    public final C0174b f22713c;

    public C4583g(C4599w c4599w, AbstractC4271c json) {
        AbstractC4154l.m8923f(json, "json");
        this.f22712b = c4599w;
        this.f22713c = json.f21668b;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: A */
    public final short mo7696A() {
        C4599w c4599w = this.f22712b;
        String strM9459k = c4599w.m9459k();
        try {
            AbstractC4154l.m8923f(strM9459k, "<this>");
            C6375y c6375yM10646e = fa.m10646e(10, strM9459k);
            if (c6375yM10646e != null) {
                return c6375yM10646e.f30775a;
            }
            AbstractC5185w.m10132n(strM9459k);
            throw null;
        } catch (IllegalArgumentException unused) {
            C4599w.m9446n(c4599w, a1.m14328h('\'', "Failed to parse type 'UShort' for input '", strM9459k), 0, null, 6);
            throw null;
        }
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: a */
    public final C0174b mo7679a() {
        return this.f22713c;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: k */
    public final int mo7704k() {
        C4599w c4599w = this.f22712b;
        String strM9459k = c4599w.m9459k();
        try {
            AbstractC4154l.m8923f(strM9459k, "<this>");
            C6370t c6370tM10644c = fa.m10644c(10, strM9459k);
            if (c6370tM10644c != null) {
                return c6370tM10644c.f30770a;
            }
            AbstractC5185w.m10132n(strM9459k);
            throw null;
        } catch (IllegalArgumentException unused) {
            C4599w.m9446n(c4599w, a1.m14328h('\'', "Failed to parse type 'UInt' for input '", strM9459k), 0, null, 6);
            throw null;
        }
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: o */
    public final int mo7685o(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: p */
    public final long mo7706p() {
        C4599w c4599w = this.f22712b;
        String strM9459k = c4599w.m9459k();
        try {
            AbstractC4154l.m8923f(strM9459k, "<this>");
            C6372v c6372vM10645d = fa.m10645d(strM9459k);
            if (c6372vM10645d != null) {
                return c6372vM10645d.f30772a;
            }
            AbstractC5185w.m10132n(strM9459k);
            throw null;
        } catch (IllegalArgumentException unused) {
            C4599w.m9446n(c4599w, a1.m14328h('\'', "Failed to parse type 'ULong' for input '", strM9459k), 0, null, 6);
            throw null;
        }
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: x */
    public final byte mo7709x() {
        C4599w c4599w = this.f22712b;
        String strM9459k = c4599w.m9459k();
        try {
            return fa.m10643b(strM9459k);
        } catch (IllegalArgumentException unused) {
            C4599w.m9446n(c4599w, a1.m14328h('\'', "Failed to parse type 'UByte' for input '", strM9459k), 0, null, 6);
            throw null;
        }
    }
}
