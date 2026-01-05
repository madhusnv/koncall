package ly;

import al.C0174b;
import b2.C0554l;
import eb.w0;
import ee.C2039g;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3366c;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.AbstractC4281m;
import ky.C4278j;
import ky.InterfaceC4279k;
import p020v.a1;
import pg.y6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.s */
/* loaded from: classes3.dex */
public final class C4595s extends y6 implements InterfaceC4279k {

    /* renamed from: b */
    public final AbstractC4271c f22743b;

    /* renamed from: c */
    public final EnumC4601y f22744c;

    /* renamed from: d */
    public final C4599w f22745d;

    /* renamed from: e */
    public final C0174b f22746e;

    /* renamed from: f */
    public int f22747f;

    /* renamed from: g */
    public w0 f22748g;

    /* renamed from: h */
    public final C4278j f22749h;

    /* renamed from: i */
    public final C4584h f22750i;

    public C4595s(AbstractC4271c abstractC4271c, EnumC4601y mode, C4599w c4599w, InterfaceC3055f descriptor, w0 w0Var) {
        AbstractC4154l.m8923f(mode, "mode");
        AbstractC4154l.m8923f(descriptor, "descriptor");
        this.f22743b = abstractC4271c;
        this.f22744c = mode;
        this.f22745d = c4599w;
        this.f22746e = abstractC4271c.f21668b;
        this.f22747f = -1;
        this.f22748g = w0Var;
        C4278j c4278j = abstractC4271c.f21667a;
        this.f22749h = c4278j;
        this.f22750i = c4278j.f21682b ? null : new C4584h(descriptor);
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: A */
    public final short mo7696A() {
        C4599w c4599w = this.f22745d;
        long jM9457i = c4599w.m9457i();
        short s5 = (short) jM9457i;
        if (jM9457i == s5) {
            return s5;
        }
        C4599w.m9446n(c4599w, "Failed to parse short for input '" + jM9457i + '\'', 0, null, 6);
        throw null;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: B */
    public final float mo7697B() throws NumberFormatException {
        C4599w c4599w = this.f22745d;
        String strM9459k = c4599w.m9459k();
        try {
            float f6 = Float.parseFloat(strM9459k);
            if (!Float.isInfinite(f6) && !Float.isNaN(f6)) {
                return f6;
            }
            AbstractC4585i.m9437r(c4599w, Float.valueOf(f6));
            throw null;
        } catch (IllegalArgumentException unused) {
            C4599w.m9446n(c4599w, a1.m14328h('\'', "Failed to parse type 'float' for input '", strM9459k), 0, null, 6);
            throw null;
        }
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: D */
    public final double mo7698D() throws NumberFormatException {
        C4599w c4599w = this.f22745d;
        String strM9459k = c4599w.m9459k();
        try {
            double d2 = Double.parseDouble(strM9459k);
            if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
                return d2;
            }
            AbstractC4585i.m9437r(c4599w, Double.valueOf(d2));
            throw null;
        } catch (IllegalArgumentException unused) {
            C4599w.m9446n(c4599w, a1.m14328h('\'', "Failed to parse type 'double' for input '", strM9459k), 0, null, 6);
            throw null;
        }
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: a */
    public final C0174b mo7679a() {
        return this.f22746e;
    }

    @Override // pg.y6, iy.InterfaceC3364a
    /* renamed from: b */
    public final void mo7680b(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        if (this.f22743b.f21667a.f21681a && descriptor.mo7281f() == 0) {
            while (mo7685o(descriptor) != -1) {
            }
        }
        C4599w c4599w = this.f22745d;
        if (c4599w.m9447A()) {
            AbstractC4585i.m9432m(c4599w, "");
            throw null;
        }
        c4599w.m9456h(this.f22744c.end);
        C0554l c0554l = (C0554l) c4599w.f22766e;
        int i10 = c0554l.f3778b;
        int[] iArr = (int[]) c0554l.f3780d;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            c0554l.f3778b = i10 - 1;
        }
        int i11 = c0554l.f3778b;
        if (i11 != -1) {
            c0554l.f3778b = i11 - 1;
        }
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: c */
    public final InterfaceC3364a mo7699c(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4271c abstractC4271c = this.f22743b;
        EnumC4601y enumC4601yM9436q = AbstractC4585i.m9436q(descriptor, abstractC4271c);
        C4599w c4599w = this.f22745d;
        C0554l c0554l = (C0554l) c4599w.f22766e;
        int i10 = c0554l.f3778b + 1;
        c0554l.f3778b = i10;
        Object[] objArr = (Object[]) c0554l.f3779c;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            c0554l.f3779c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) c0554l.f3780d, i11);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            c0554l.f3780d = iArrCopyOf;
        }
        ((Object[]) c0554l.f3779c)[i10] = descriptor;
        c4599w.m9456h(enumC4601yM9436q.begin);
        if (c4599w.m9469v() != 4) {
            int i12 = AbstractC4594r.f22742a[enumC4601yM9436q.ordinal()];
            return (i12 == 1 || i12 == 2 || i12 == 3) ? new C4595s(abstractC4271c, enumC4601yM9436q, c4599w, descriptor, this.f22748g) : (this.f22744c == enumC4601yM9436q && abstractC4271c.f21667a.f21682b) ? this : new C4595s(abstractC4271c, enumC4601yM9436q, c4599w, descriptor, this.f22748g);
        }
        C4599w.m9446n(c4599w, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: e */
    public final InterfaceC3366c mo7700e(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return AbstractC4598v.m9445a(descriptor) ? new C4583g(this.f22745d, this.f22743b) : this;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: f */
    public final boolean mo7701f() {
        boolean z6;
        boolean z10;
        C4599w c4599w = this.f22745d;
        int iM9473z = c4599w.m9473z();
        String str = c4599w.f22765d;
        if (iM9473z == str.length()) {
            C4599w.m9446n(c4599w, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM9473z) == '\"') {
            iM9473z++;
            z6 = true;
        } else {
            z6 = false;
        }
        int iM9471x = c4599w.m9471x(iM9473z);
        if (iM9471x >= str.length() || iM9471x == -1) {
            C4599w.m9446n(c4599w, "EOF", 0, null, 6);
            throw null;
        }
        int i10 = iM9471x + 1;
        int iCharAt = str.charAt(iM9471x) | ' ';
        if (iCharAt == 102) {
            c4599w.m9452d(i10, "alse");
            z10 = false;
        } else {
            if (iCharAt != 116) {
                C4599w.m9446n(c4599w, "Expected valid boolean literal prefix, but had '" + c4599w.m9459k() + '\'', 0, null, 6);
                throw null;
            }
            c4599w.m9452d(i10, "rue");
            z10 = true;
        }
        if (!z6) {
            return z10;
        }
        if (c4599w.f22763b == str.length()) {
            C4599w.m9446n(c4599w, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c4599w.f22763b) == '\"') {
            c4599w.f22763b++;
            return z10;
        }
        C4599w.m9446n(c4599w, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: g */
    public final char mo7702g() {
        C4599w c4599w = this.f22745d;
        String strM9459k = c4599w.m9459k();
        if (strM9459k.length() == 1) {
            return strM9459k.charAt(0);
        }
        C4599w.m9446n(c4599w, a1.m14328h('\'', "Expected single char, but got '", strM9459k), 0, null, 6);
        throw null;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: i */
    public final int mo7703i(InterfaceC3055f enumDescriptor) {
        AbstractC4154l.m8923f(enumDescriptor, "enumDescriptor");
        C4599w c4599w = this.f22745d;
        return AbstractC4585i.m9431l(enumDescriptor, this.f22743b, c4599w.m9458j(), " at path ".concat(((C0554l) c4599w.f22766e).m1639h()));
    }

    @Override // ky.InterfaceC4279k
    /* renamed from: j */
    public final AbstractC4281m mo8990j() {
        return new C2039g(this.f22743b.f21667a, this.f22745d).m5762l();
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: k */
    public final int mo7704k() {
        C4599w c4599w = this.f22745d;
        long jM9457i = c4599w.m9457i();
        int i10 = (int) jM9457i;
        if (jM9457i == i10) {
            return i10;
        }
        C4599w.m9446n(c4599w, "Failed to parse int for input '" + jM9457i + '\'', 0, null, 6);
        throw null;
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: n */
    public final String mo7705n() {
        return this.f22745d.m9458j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        r2.m9461m(nx.AbstractC5178p.m10104O(r4.subSequence(0, r2.f22763b).toString(), r5, 0, 6), p020v.a1.m14328h('\'', "Encountered an unknown key '", r5), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // iy.InterfaceC3364a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo7685o(hy.InterfaceC3055f r21) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.C4595s.mo7685o(hy.f):int");
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: p */
    public final long mo7706p() {
        return this.f22745d.m9457i();
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: q */
    public final boolean mo7707q() {
        C4584h c4584h = this.f22750i;
        if (!(c4584h != null ? c4584h.f22715b : false)) {
            C4599w c4599w = this.f22745d;
            int iM9471x = c4599w.m9471x(c4599w.m9473z());
            String str = c4599w.f22765d;
            int length = str.length() - iM9471x;
            boolean z6 = false;
            if (length >= 4 && iM9471x != -1) {
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        if ("null".charAt(i10) != str.charAt(iM9471x + i10)) {
                            break;
                        }
                        i10++;
                    } else if (length <= 4 || AbstractC4585i.m9427h(str.charAt(iM9471x + 4)) != 0) {
                        z6 = true;
                        c4599w.f22763b = iM9471x + 4;
                    }
                }
            }
            if (!z6) {
                return true;
            }
        }
        return false;
    }

    @Override // pg.y6, iy.InterfaceC3364a
    /* renamed from: u */
    public final Object mo7689u(InterfaceC3055f descriptor, int i10, InterfaceC2401a deserializer, Object obj) {
        C0554l c0554l = (C0554l) this.f22745d.f22766e;
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(deserializer, "deserializer");
        boolean z6 = this.f22744c == EnumC4601y.MAP && (i10 & 1) == 0;
        if (z6) {
            int[] iArr = (int[]) c0554l.f3780d;
            int i11 = c0554l.f3778b;
            if (iArr[i11] == -2) {
                ((Object[]) c0554l.f3779c)[i11] = C4586j.f22718a;
            }
        }
        Object objMo7689u = super.mo7689u(descriptor, i10, deserializer, obj);
        if (z6) {
            int[] iArr2 = (int[]) c0554l.f3780d;
            int i12 = c0554l.f3778b;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                c0554l.f3778b = i13;
                Object[] objArr = (Object[]) c0554l.f3779c;
                if (i13 == objArr.length) {
                    int i14 = i13 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
                    AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
                    c0554l.f3779c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) c0554l.f3780d, i14);
                    AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
                    c0554l.f3780d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) c0554l.f3779c;
            int i15 = c0554l.f3778b;
            objArr2[i15] = objMo7689u;
            ((int[]) c0554l.f3780d)[i15] = -2;
        }
        return objMo7689u;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo7708v(fy.InterfaceC2401a r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.C4595s.mo7708v(fy.a):java.lang.Object");
    }

    @Override // pg.y6, iy.InterfaceC3366c
    /* renamed from: x */
    public final byte mo7709x() {
        C4599w c4599w = this.f22745d;
        long jM9457i = c4599w.m9457i();
        byte b10 = (byte) jM9457i;
        if (jM9457i == b10) {
            return b10;
        }
        C4599w.m9446n(c4599w, "Failed to parse byte for input '" + jM9457i + '\'', 0, null, 6);
        throw null;
    }
}
