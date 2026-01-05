package g4;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;
import r4.C6449d;
import r4.C6450e;
import r4.C6454i;
import r4.C6456k;
import r4.C6458m;
import r4.C6463r;
import r4.C6465t;
import s4.C6759o;
import s4.C6760p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.v */
/* loaded from: classes.dex */
public final class C2506v implements InterfaceC2487c {

    /* renamed from: a */
    public final int f13719a;

    /* renamed from: b */
    public final int f13720b;

    /* renamed from: c */
    public final long f13721c;

    /* renamed from: d */
    public final C6463r f13722d;

    /* renamed from: e */
    public final C2508x f13723e;

    /* renamed from: f */
    public final C6454i f13724f;

    /* renamed from: g */
    public final int f13725g;

    /* renamed from: h */
    public final int f13726h;

    /* renamed from: i */
    public final C6465t f13727i;

    public C2506v(int i10, int i11, long j6, C6463r c6463r, C2508x c2508x, C6454i c6454i, int i12, int i13, C6465t c6465t) {
        this.f13719a = i10;
        this.f13720b = i11;
        this.f13721c = j6;
        this.f13722d = c6463r;
        this.f13723e = c2508x;
        this.f13724f = c6454i;
        this.f13725g = i12;
        this.f13726h = i13;
        this.f13727i = c6465t;
        if (C6759o.m12952a(j6, C6759o.f32213c) || C6759o.m12954c(j6) >= DefinitionKt.NO_Float_VALUE) {
            return;
        }
        AbstractC4646a.m9526b("lineHeight can't be negative (" + C6759o.m12954c(j6) + ')');
    }

    /* renamed from: a */
    public final C2506v m6483a(C2506v c2506v) {
        return c2506v == null ? this : AbstractC2507w.m6484a(this, c2506v.f13719a, c2506v.f13720b, c2506v.f13721c, c2506v.f13722d, c2506v.f13723e, c2506v.f13724f, c2506v.f13725g, c2506v.f13726h, c2506v.f13727i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2506v)) {
            return false;
        }
        C2506v c2506v = (C2506v) obj;
        return this.f13719a == c2506v.f13719a && this.f13720b == c2506v.f13720b && C6759o.m12952a(this.f13721c, c2506v.f13721c) && AbstractC4154l.m8918a(this.f13722d, c2506v.f13722d) && AbstractC4154l.m8918a(this.f13723e, c2506v.f13723e) && AbstractC4154l.m8918a(this.f13724f, c2506v.f13724f) && this.f13725g == c2506v.f13725g && this.f13726h == c2506v.f13726h && AbstractC4154l.m8918a(this.f13727i, c2506v.f13727i);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f13720b, Integer.hashCode(this.f13719a) * 31, 31);
        C6760p[] c6760pArr = C6759o.f32212b;
        int iM4557d = AbstractC1452a.m4557d(iM4556c, 31, this.f13721c);
        C6463r c6463r = this.f13722d;
        int iHashCode = (iM4557d + (c6463r != null ? c6463r.hashCode() : 0)) * 31;
        C2508x c2508x = this.f13723e;
        int iHashCode2 = (iHashCode + (c2508x != null ? c2508x.hashCode() : 0)) * 31;
        C6454i c6454i = this.f13724f;
        int iM4556c2 = AbstractC1452a.m4556c(this.f13726h, AbstractC1452a.m4556c(this.f13725g, (iHashCode2 + (c6454i != null ? c6454i.hashCode() : 0)) * 31, 31), 31);
        C6465t c6465t = this.f13727i;
        return iM4556c2 + (c6465t != null ? c6465t.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C6456k.m12444a(this.f13719a)) + ", textDirection=" + ((Object) C6458m.m12445a(this.f13720b)) + ", lineHeight=" + ((Object) C6759o.m12955d(this.f13721c)) + ", textIndent=" + this.f13722d + ", platformStyle=" + this.f13723e + ", lineHeightStyle=" + this.f13724f + ", lineBreak=" + ((Object) C6450e.m12441a(this.f13725g)) + ", hyphens=" + ((Object) C6449d.m12440a(this.f13726h)) + ", textMotion=" + this.f13727i + ')';
    }
}
