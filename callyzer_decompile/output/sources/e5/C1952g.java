package e5;

import com.skydoves.balloon.internals.DefinitionKt;
import d5.C1603g;
import d5.EnumC1608l;
import f5.C2204a;
import g5.AbstractC2523m;
import java.util.HashSet;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e5.g */
/* loaded from: classes.dex */
public final class C1952g extends C1603g {
    public int A0;

    /* renamed from: n0, reason: collision with root package name */
    public C2204a f44208n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f44209o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f44210p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f44211q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f44212r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f44213s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f44214t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f44215u0;

    /* renamed from: v0, reason: collision with root package name */
    public float f44216v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f44217w0;

    /* renamed from: x0, reason: collision with root package name */
    public String f44218x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f44219y0;

    /* renamed from: z0, reason: collision with root package name */
    public String f44220z0;

    public C1952g(C8553n c8553n, EnumC1608l enumC1608l) {
        super(c8553n, enumC1608l);
        this.f44209o0 = 0;
        this.f44210p0 = 0;
        this.f44211q0 = 0;
        if (enumC1608l == EnumC1608l.ROW) {
            this.f44213s0 = 1;
        } else if (enumC1608l == EnumC1608l.COLUMN) {
            this.f44214t0 = 1;
        }
    }

    @Override // d5.C1603g, d5.C1598b, d5.InterfaceC1604h
    public final void apply() throws NumberFormatException {
        mo5258s();
        C2204a c2204a = this.f44208n0;
        int i10 = this.f44212r0;
        c2204a.getClass();
        if ((i10 == 0 || i10 == 1) && c2204a.E0 != i10) {
            c2204a.E0 = i10;
        }
        int i11 = this.f44213s0;
        if (i11 != 0) {
            C2204a c2204a2 = this.f44208n0;
            if (i11 > 50) {
                c2204a2.getClass();
            } else if (c2204a2.f44225v0 != i11) {
                c2204a2.f44225v0 = i11;
                c2204a2.m5925W();
                c2204a2.m5922S();
            }
        }
        int i12 = this.f44214t0;
        if (i12 != 0) {
            C2204a c2204a3 = this.f44208n0;
            if (i12 > 50) {
                c2204a3.getClass();
            } else if (c2204a3.f44227x0 != i12) {
                c2204a3.f44227x0 = i12;
                c2204a3.m5925W();
                c2204a3.m5922S();
            }
        }
        float f6 = this.f44215u0;
        if (f6 != DefinitionKt.NO_Float_VALUE) {
            C2204a c2204a4 = this.f44208n0;
            if (f6 < DefinitionKt.NO_Float_VALUE) {
                c2204a4.getClass();
            } else if (c2204a4.f44228y0 != f6) {
                c2204a4.f44228y0 = f6;
            }
        }
        float f10 = this.f44216v0;
        if (f10 != DefinitionKt.NO_Float_VALUE) {
            C2204a c2204a5 = this.f44208n0;
            if (f10 < DefinitionKt.NO_Float_VALUE) {
                c2204a5.getClass();
            } else if (c2204a5.f44229z0 != f10) {
                c2204a5.f44229z0 = f10;
            }
        }
        String str = this.f44217w0;
        if (str != null && !str.isEmpty()) {
            C2204a c2204a6 = this.f44208n0;
            String str2 = this.f44217w0;
            String str3 = c2204a6.A0;
            if (str3 == null || !str3.equals(str2)) {
                c2204a6.A0 = str2;
            }
        }
        String str4 = this.f44218x0;
        if (str4 != null && !str4.isEmpty()) {
            C2204a c2204a7 = this.f44208n0;
            String str5 = this.f44218x0;
            String str6 = c2204a7.B0;
            if (str6 == null || !str6.equals(str5)) {
                c2204a7.B0 = str5;
            }
        }
        String str7 = this.f44219y0;
        if (str7 != null && !str7.isEmpty()) {
            C2204a c2204a8 = this.f44208n0;
            String str8 = this.f44219y0;
            String str9 = c2204a8.C0;
            if (str9 == null || !str9.equals(str8.toString())) {
                c2204a8.f44223t0 = false;
                c2204a8.C0 = str8.toString();
            }
        }
        String str10 = this.f44220z0;
        if (str10 != null && !str10.isEmpty()) {
            C2204a c2204a9 = this.f44208n0;
            String str11 = this.f44220z0;
            String str12 = c2204a9.D0;
            if (str12 == null || !str12.equals(str11)) {
                c2204a9.f44223t0 = false;
                c2204a9.D0 = str11;
            }
        }
        C2204a c2204a10 = this.f44208n0;
        c2204a10.J0 = this.A0;
        int i13 = this.f44209o0;
        c2204a10.f44279k0 = i13;
        c2204a10.f44280l0 = i13;
        c2204a10.f44277i0 = this.f44210p0;
        c2204a10.f44278j0 = this.f44211q0;
        m5257r();
    }

    @Override // d5.C1603g
    /* renamed from: s */
    public final AbstractC2523m mo5258s() {
        int[][] iArrM5924U;
        int[][] iArrM5924U2;
        boolean[][] zArr;
        if (this.f44208n0 == null) {
            C2204a c2204a = new C2204a();
            c2204a.f44223t0 = false;
            c2204a.F0 = 0;
            c2204a.H0 = new HashSet();
            c2204a.L0 = 0;
            c2204a.m5925W();
            int[][] iArr = c2204a.I0;
            boolean z6 = iArr != null && iArr.length == c2204a.f44276h0 && (zArr = c2204a.G0) != null && zArr.length == c2204a.f44224u0 && zArr[0].length == c2204a.f44226w0;
            if (!z6) {
                c2204a.m5922S();
            }
            if (z6) {
                for (int i10 = 0; i10 < c2204a.G0.length; i10++) {
                    int i11 = 0;
                    while (true) {
                        boolean[][] zArr2 = c2204a.G0;
                        if (i11 < zArr2[0].length) {
                            zArr2[i10][i11] = true;
                            i11++;
                        }
                    }
                }
                for (int i12 = 0; i12 < c2204a.I0.length; i12++) {
                    int i13 = 0;
                    while (true) {
                        int[][] iArr2 = c2204a.I0;
                        if (i13 < iArr2[0].length) {
                            iArr2[i12][i13] = -1;
                            i13++;
                        }
                    }
                }
            }
            c2204a.F0 = 0;
            String str = c2204a.D0;
            if (str != null && !str.trim().isEmpty() && (iArrM5924U2 = c2204a.m5924U(c2204a.D0, false)) != null) {
                c2204a.m5920Q(iArrM5924U2);
            }
            String str2 = c2204a.C0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrM5924U = c2204a.m5924U(c2204a.C0, true)) != null) {
                c2204a.m5921R(iArrM5924U);
            }
            this.f44208n0 = c2204a;
        }
        return this.f44208n0;
    }
}
