package p001o;

import java.util.Collections;
import java.util.List;
import p001o.irb;

/* loaded from: classes2.dex */
public final class ey7 {

    /* renamed from: a */
    public final List f22382a;

    /* renamed from: b */
    public final int f22383b;

    /* renamed from: c */
    public final int f22384c;

    /* renamed from: d */
    public final int f22385d;

    /* renamed from: e */
    public final int f22386e;

    /* renamed from: f */
    public final int f22387f;

    /* renamed from: g */
    public final int f22388g;

    /* renamed from: h */
    public final int f22389h;

    /* renamed from: i */
    public final int f22390i;

    /* renamed from: j */
    public final float f22391j;

    /* renamed from: k */
    public final int f22392k;

    /* renamed from: l */
    public final String f22393l;

    public ey7(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, String str) {
        this.f22382a = list;
        this.f22383b = i;
        this.f22384c = i2;
        this.f22385d = i3;
        this.f22386e = i4;
        this.f22387f = i5;
        this.f22388g = i6;
        this.f22389h = i7;
        this.f22390i = i8;
        this.f22391j = f;
        this.f22392k = i9;
        this.f22393l = str;
    }

    /* renamed from: a */
    public static ey7 m25845a(zwc zwcVar) throws byc {
        int i;
        int i2;
        try {
            zwcVar.m60018V(21);
            int iM60004H = zwcVar.m60004H() & 3;
            int iM60004H2 = zwcVar.m60004H();
            int iM60025f = zwcVar.m60025f();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < iM60004H2; i5++) {
                zwcVar.m60018V(1);
                int iM60010N = zwcVar.m60010N();
                for (int i6 = 0; i6 < iM60010N; i6++) {
                    int iM60010N2 = zwcVar.m60010N();
                    i4 += iM60010N2 + 4;
                    zwcVar.m60018V(iM60010N2);
                }
            }
            zwcVar.m60017U(iM60025f);
            byte[] bArr = new byte[i4];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            float f = 1.0f;
            String strM30320c = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iM60004H2) {
                int iM60004H3 = zwcVar.m60004H() & 63;
                int iM60010N3 = zwcVar.m60010N();
                int i17 = i3;
                while (i17 < iM60010N3) {
                    int iM60010N4 = zwcVar.m60010N();
                    byte[] bArr2 = irb.f29113a;
                    int i18 = iM60004H2;
                    System.arraycopy(bArr2, i3, bArr, i16, bArr2.length);
                    int length = i16 + bArr2.length;
                    System.arraycopy(zwcVar.m60024e(), zwcVar.m60025f(), bArr, length, iM60010N4);
                    if (iM60004H3 == 33 && i17 == 0) {
                        irb.C14354a c14354aM32619h = irb.m32619h(bArr, length, length + iM60010N4);
                        int i19 = c14354aM32619h.f29127k;
                        i8 = c14354aM32619h.f29128l;
                        i9 = c14354aM32619h.f29122f + 8;
                        i10 = c14354aM32619h.f29123g + 8;
                        int i20 = c14354aM32619h.f29131o;
                        int i21 = c14354aM32619h.f29132p;
                        int i22 = c14354aM32619h.f29133q;
                        float f2 = c14354aM32619h.f29129m;
                        int i23 = c14354aM32619h.f29130n;
                        i = iM60004H3;
                        i2 = iM60010N3;
                        i7 = i19;
                        strM30320c = hf3.m30320c(c14354aM32619h.f29117a, c14354aM32619h.f29118b, c14354aM32619h.f29119c, c14354aM32619h.f29120d, c14354aM32619h.f29124h, c14354aM32619h.f29125i);
                        i12 = i21;
                        i11 = i20;
                        i14 = i23;
                        f = f2;
                        i13 = i22;
                    } else {
                        i = iM60004H3;
                        i2 = iM60010N3;
                    }
                    i16 = length + iM60010N4;
                    zwcVar.m60018V(iM60010N4);
                    i17++;
                    iM60004H2 = i18;
                    iM60004H3 = i;
                    iM60010N3 = i2;
                    i3 = 0;
                }
                i15++;
                i3 = 0;
            }
            return new ey7(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iM60004H + 1, i7, i8, i9, i10, i11, i12, i13, f, i14, strM30320c);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw byc.m19921a("Error parsing HEVC config", e);
        }
    }
}
