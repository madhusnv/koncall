package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5931l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f */
/* loaded from: classes.dex */
public final class C1316f implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f6524a;

    public /* synthetic */ C1316f(int i10) {
        this.f6524a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6524a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                String[] strArrM11742g = null;
                int iM11750o = 0;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    char c2 = (char) i10;
                    if (c2 == 1) {
                        iM11750o = AbstractC5931l.m11750o(parcel, i10);
                    } else if (c2 != 2) {
                        AbstractC5931l.m11753r(parcel, i10);
                    } else {
                        strArrM11742g = AbstractC5931l.m11742g(parcel, i10);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new C1317g(strArrM11742g, iM11750o);
            case 1:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                String strM11741f = null;
                String strM11741f2 = null;
                byte[] bArrM11739d = null;
                Point[] pointArr = null;
                C1322l c1322l = null;
                C1325o c1325o = null;
                C1326p c1326p = null;
                C1328r c1328r = null;
                C1327q c1327q = null;
                C1323m c1323m = null;
                C1319i c1319i = null;
                C1320j c1320j = null;
                C1321k c1321k = null;
                int iM11750o2 = 0;
                int iM11750o3 = 0;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iM11750o2 = AbstractC5931l.m11750o(parcel, i11);
                            break;
                        case 2:
                            strM11741f = AbstractC5931l.m11741f(parcel, i11);
                            break;
                        case 3:
                            strM11741f2 = AbstractC5931l.m11741f(parcel, i11);
                            break;
                        case 4:
                            bArrM11739d = AbstractC5931l.m11739d(parcel, i11);
                            break;
                        case 5:
                            pointArr = (Point[]) AbstractC5931l.m11744i(parcel, i11, Point.CREATOR);
                            break;
                        case 6:
                            iM11750o3 = AbstractC5931l.m11750o(parcel, i11);
                            break;
                        case 7:
                            c1322l = (C1322l) AbstractC5931l.m11740e(parcel, i11, C1322l.CREATOR);
                            break;
                        case '\b':
                            c1325o = (C1325o) AbstractC5931l.m11740e(parcel, i11, C1325o.CREATOR);
                            break;
                        case '\t':
                            c1326p = (C1326p) AbstractC5931l.m11740e(parcel, i11, C1326p.CREATOR);
                            break;
                        case '\n':
                            c1328r = (C1328r) AbstractC5931l.m11740e(parcel, i11, C1328r.CREATOR);
                            break;
                        case 11:
                            c1327q = (C1327q) AbstractC5931l.m11740e(parcel, i11, C1327q.CREATOR);
                            break;
                        case '\f':
                            c1323m = (C1323m) AbstractC5931l.m11740e(parcel, i11, C1323m.CREATOR);
                            break;
                        case '\r':
                            c1319i = (C1319i) AbstractC5931l.m11740e(parcel, i11, C1319i.CREATOR);
                            break;
                        case 14:
                            c1320j = (C1320j) AbstractC5931l.m11740e(parcel, i11, C1320j.CREATOR);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            c1321k = (C1321k) AbstractC5931l.m11740e(parcel, i11, C1321k.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i11);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new C1329s(iM11750o2, strM11741f, strM11741f2, bArrM11739d, pointArr, iM11750o3, c1322l, c1325o, c1326p, c1328r, c1327q, c1323m, c1319i, c1320j, c1321k);
            case 2:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                int iM11750o4 = 0;
                boolean zM11747l = false;
                while (parcel.dataPosition() < iM11754s3) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iM11750o4 = AbstractC5931l.m11750o(parcel, i12);
                    } else if (c10 != 2) {
                        AbstractC5931l.m11753r(parcel, i12);
                    } else {
                        zM11747l = AbstractC5931l.m11747l(parcel, i12);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                return new C1331u(iM11750o4, zM11747l);
            case 3:
                int iM11754s4 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l2 = false;
                c0 c0Var = null;
                d0 d0Var = null;
                while (parcel.dataPosition() < iM11754s4) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        c0Var = (c0) AbstractC5931l.m11740e(parcel, i13, c0.CREATOR);
                    } else if (c11 == 2) {
                        d0Var = (d0) AbstractC5931l.m11740e(parcel, i13, d0.CREATOR);
                    } else if (c11 == 3) {
                        AbstractC5931l.m11747l(parcel, i13);
                    } else if (c11 != 4) {
                        AbstractC5931l.m11753r(parcel, i13);
                    } else {
                        zM11747l2 = AbstractC5931l.m11747l(parcel, i13);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s4);
                return new C1332v(c0Var, d0Var, zM11747l2);
            case 4:
                int iM11754s5 = AbstractC5931l.m11754s(parcel);
                b0 b0Var = null;
                while (parcel.dataPosition() < iM11754s5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        AbstractC5931l.m11753r(parcel, i14);
                    } else {
                        b0Var = (b0) AbstractC5931l.m11740e(parcel, i14, b0.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s5);
                return new C1333w(b0Var);
            case 5:
                int iM11754s6 = AbstractC5931l.m11754s(parcel);
                String strM11741f3 = null;
                int iM11750o5 = 0;
                int iM11750o6 = 0;
                int iM11750o7 = 0;
                int iM11750o8 = 0;
                boolean zM11747l3 = false;
                int iM11750o9 = 0;
                int iM11750o10 = 0;
                while (parcel.dataPosition() < iM11754s6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iM11750o5 = AbstractC5931l.m11750o(parcel, i15);
                            break;
                        case 2:
                            iM11750o6 = AbstractC5931l.m11750o(parcel, i15);
                            break;
                        case 3:
                            iM11750o7 = AbstractC5931l.m11750o(parcel, i15);
                            break;
                        case 4:
                            iM11750o8 = AbstractC5931l.m11750o(parcel, i15);
                            break;
                        case 5:
                            iM11750o9 = AbstractC5931l.m11750o(parcel, i15);
                            break;
                        case 6:
                            iM11750o10 = AbstractC5931l.m11750o(parcel, i15);
                            break;
                        case 7:
                            zM11747l3 = AbstractC5931l.m11747l(parcel, i15);
                            break;
                        case '\b':
                            strM11741f3 = AbstractC5931l.m11741f(parcel, i15);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i15);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s6);
                return new C1318h(strM11741f3, iM11750o5, iM11750o6, iM11750o7, iM11750o8, zM11747l3, iM11750o9, iM11750o10);
            case 6:
                int iM11754s7 = AbstractC5931l.m11754s(parcel);
                String strM11741f4 = null;
                String strM11741f5 = null;
                String strM11741f6 = null;
                String strM11741f7 = null;
                String strM11741f8 = null;
                C1318h c1318h = null;
                C1318h c1318h2 = null;
                while (parcel.dataPosition() < iM11754s7) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strM11741f4 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 2:
                            strM11741f5 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 3:
                            strM11741f6 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 4:
                            strM11741f7 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 5:
                            strM11741f8 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 6:
                            c1318h = (C1318h) AbstractC5931l.m11740e(parcel, i16, C1318h.CREATOR);
                            break;
                        case 7:
                            c1318h2 = (C1318h) AbstractC5931l.m11740e(parcel, i16, C1318h.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i16);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s7);
                return new C1319i(strM11741f4, strM11741f5, strM11741f6, strM11741f7, strM11741f8, c1318h, c1318h2);
            case 7:
                int iM11754s8 = AbstractC5931l.m11754s(parcel);
                C1324n c1324n = null;
                String strM11741f9 = null;
                String strM11741f10 = null;
                C1325o[] c1325oArr = null;
                C1322l[] c1322lArr = null;
                String[] strArrM11742g2 = null;
                C1317g[] c1317gArr = null;
                while (parcel.dataPosition() < iM11754s8) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            c1324n = (C1324n) AbstractC5931l.m11740e(parcel, i17, C1324n.CREATOR);
                            break;
                        case 2:
                            strM11741f9 = AbstractC5931l.m11741f(parcel, i17);
                            break;
                        case 3:
                            strM11741f10 = AbstractC5931l.m11741f(parcel, i17);
                            break;
                        case 4:
                            c1325oArr = (C1325o[]) AbstractC5931l.m11744i(parcel, i17, C1325o.CREATOR);
                            break;
                        case 5:
                            c1322lArr = (C1322l[]) AbstractC5931l.m11744i(parcel, i17, C1322l.CREATOR);
                            break;
                        case 6:
                            strArrM11742g2 = AbstractC5931l.m11742g(parcel, i17);
                            break;
                        case 7:
                            c1317gArr = (C1317g[]) AbstractC5931l.m11744i(parcel, i17, C1317g.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i17);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s8);
                return new C1320j(c1324n, strM11741f9, strM11741f10, c1325oArr, c1322lArr, strArrM11742g2, c1317gArr);
            case 8:
                int iM11754s9 = AbstractC5931l.m11754s(parcel);
                String strM11741f11 = null;
                String strM11741f12 = null;
                String strM11741f13 = null;
                String strM11741f14 = null;
                String strM11741f15 = null;
                String strM11741f16 = null;
                String strM11741f17 = null;
                String strM11741f18 = null;
                String strM11741f19 = null;
                String strM11741f20 = null;
                String strM11741f21 = null;
                String strM11741f22 = null;
                String strM11741f23 = null;
                String strM11741f24 = null;
                while (parcel.dataPosition() < iM11754s9) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strM11741f11 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 2:
                            strM11741f12 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 3:
                            strM11741f13 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 4:
                            strM11741f14 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 5:
                            strM11741f15 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 6:
                            strM11741f16 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 7:
                            strM11741f17 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case '\b':
                            strM11741f18 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case '\t':
                            strM11741f19 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case '\n':
                            strM11741f20 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 11:
                            strM11741f21 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case '\f':
                            strM11741f22 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case '\r':
                            strM11741f23 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 14:
                            strM11741f24 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i18);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s9);
                return new C1321k(strM11741f11, strM11741f12, strM11741f13, strM11741f14, strM11741f15, strM11741f16, strM11741f17, strM11741f18, strM11741f19, strM11741f20, strM11741f21, strM11741f22, strM11741f23, strM11741f24);
            case 9:
                int iM11754s10 = AbstractC5931l.m11754s(parcel);
                String strM11741f25 = null;
                String strM11741f26 = null;
                int iM11750o11 = 0;
                String strM11741f27 = null;
                while (parcel.dataPosition() < iM11754s10) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        iM11750o11 = AbstractC5931l.m11750o(parcel, i19);
                    } else if (c12 == 2) {
                        strM11741f25 = AbstractC5931l.m11741f(parcel, i19);
                    } else if (c12 == 3) {
                        strM11741f27 = AbstractC5931l.m11741f(parcel, i19);
                    } else if (c12 != 4) {
                        AbstractC5931l.m11753r(parcel, i19);
                    } else {
                        strM11741f26 = AbstractC5931l.m11741f(parcel, i19);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s10);
                return new C1322l(strM11741f25, iM11750o11, strM11741f27, strM11741f26);
            case 10:
                int iM11754s11 = AbstractC5931l.m11754s(parcel);
                double dM11748m = 0.0d;
                double dM11748m2 = 0.0d;
                while (parcel.dataPosition() < iM11754s11) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        dM11748m = AbstractC5931l.m11748m(parcel, i20);
                    } else if (c13 != 2) {
                        AbstractC5931l.m11753r(parcel, i20);
                    } else {
                        dM11748m2 = AbstractC5931l.m11748m(parcel, i20);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s11);
                return new C1323m(dM11748m, dM11748m2);
            case 11:
                int iM11754s12 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l4 = false;
                boolean zM11747l5 = false;
                boolean zM11747l6 = false;
                float f6 = 0.0f;
                byte[] bArrM11739d2 = null;
                while (parcel.dataPosition() < iM11754s12) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        zM11747l4 = AbstractC5931l.m11747l(parcel, i21);
                    } else if (c14 == 2) {
                        bArrM11739d2 = AbstractC5931l.m11739d(parcel, i21);
                    } else if (c14 == 3) {
                        zM11747l5 = AbstractC5931l.m11747l(parcel, i21);
                    } else if (c14 == 4) {
                        AbstractC5931l.m11756u(parcel, i21, 4);
                        f6 = parcel.readFloat();
                    } else if (c14 != 5) {
                        AbstractC5931l.m11753r(parcel, i21);
                    } else {
                        zM11747l6 = AbstractC5931l.m11747l(parcel, i21);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s12);
                return new b0(zM11747l4, bArrM11739d2, zM11747l5, f6, zM11747l6);
            case 12:
                int iM11754s13 = AbstractC5931l.m11754s(parcel);
                int iM11750o12 = 0;
                boolean zM11747l7 = false;
                while (true) {
                    float[] fArr = null;
                    while (parcel.dataPosition() < iM11754s13) {
                        int i22 = parcel.readInt();
                        char c15 = (char) i22;
                        if (c15 == 1) {
                            int iM11752q = AbstractC5931l.m11752q(parcel, i22);
                            int iDataPosition = parcel.dataPosition();
                            if (iM11752q == 0) {
                                break;
                            }
                            float[] fArrCreateFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition + iM11752q);
                            fArr = fArrCreateFloatArray;
                        } else if (c15 == 2) {
                            iM11750o12 = AbstractC5931l.m11750o(parcel, i22);
                        } else if (c15 != 3) {
                            AbstractC5931l.m11753r(parcel, i22);
                        } else {
                            zM11747l7 = AbstractC5931l.m11747l(parcel, i22);
                        }
                    }
                    AbstractC5931l.m11746k(parcel, iM11754s13);
                    return new c0(fArr, iM11750o12, zM11747l7);
                    break;
                }
            case 13:
                int iM11754s14 = AbstractC5931l.m11754s(parcel);
                while (true) {
                    float[] fArr2 = null;
                    while (parcel.dataPosition() < iM11754s14) {
                        int i23 = parcel.readInt();
                        if (((char) i23) != 1) {
                            AbstractC5931l.m11753r(parcel, i23);
                        } else {
                            int iM11752q2 = AbstractC5931l.m11752q(parcel, i23);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM11752q2 == 0) {
                                break;
                            }
                            float[] fArrCreateFloatArray2 = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition2 + iM11752q2);
                            fArr2 = fArrCreateFloatArray2;
                        }
                    }
                    AbstractC5931l.m11746k(parcel, iM11754s14);
                    return new d0(fArr2);
                    break;
                }
            case 14:
                int iM11754s15 = AbstractC5931l.m11754s(parcel);
                String strM11741f28 = null;
                String strM11741f29 = null;
                String strM11741f30 = null;
                String strM11741f31 = null;
                String strM11741f32 = null;
                String strM11741f33 = null;
                String strM11741f34 = null;
                while (parcel.dataPosition() < iM11754s15) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strM11741f28 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 2:
                            strM11741f29 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 3:
                            strM11741f30 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 4:
                            strM11741f31 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 5:
                            strM11741f32 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 6:
                            strM11741f33 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 7:
                            strM11741f34 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i24);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s15);
                return new C1324n(strM11741f28, strM11741f29, strM11741f30, strM11741f31, strM11741f32, strM11741f33, strM11741f34);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iM11754s16 = AbstractC5931l.m11754s(parcel);
                String strM11741f35 = null;
                int iM11750o13 = 0;
                while (parcel.dataPosition() < iM11754s16) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        iM11750o13 = AbstractC5931l.m11750o(parcel, i25);
                    } else if (c16 != 2) {
                        AbstractC5931l.m11753r(parcel, i25);
                    } else {
                        strM11741f35 = AbstractC5931l.m11741f(parcel, i25);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s16);
                return new C1325o(iM11750o13, strM11741f35);
            case 16:
                int iM11754s17 = AbstractC5931l.m11754s(parcel);
                String strM11741f36 = null;
                String strM11741f37 = null;
                while (parcel.dataPosition() < iM11754s17) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        strM11741f36 = AbstractC5931l.m11741f(parcel, i26);
                    } else if (c17 != 2) {
                        AbstractC5931l.m11753r(parcel, i26);
                    } else {
                        strM11741f37 = AbstractC5931l.m11741f(parcel, i26);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s17);
                return new C1326p(strM11741f36, strM11741f37);
            case 17:
                int iM11754s18 = AbstractC5931l.m11754s(parcel);
                String strM11741f38 = null;
                String strM11741f39 = null;
                while (parcel.dataPosition() < iM11754s18) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        strM11741f38 = AbstractC5931l.m11741f(parcel, i27);
                    } else if (c18 != 2) {
                        AbstractC5931l.m11753r(parcel, i27);
                    } else {
                        strM11741f39 = AbstractC5931l.m11741f(parcel, i27);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s18);
                return new C1327q(strM11741f38, strM11741f39);
            case 18:
                int iM11754s19 = AbstractC5931l.m11754s(parcel);
                int iM11750o14 = 0;
                String strM11741f40 = null;
                String strM11741f41 = null;
                while (parcel.dataPosition() < iM11754s19) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        strM11741f40 = AbstractC5931l.m11741f(parcel, i28);
                    } else if (c19 == 2) {
                        strM11741f41 = AbstractC5931l.m11741f(parcel, i28);
                    } else if (c19 != 3) {
                        AbstractC5931l.m11753r(parcel, i28);
                    } else {
                        iM11750o14 = AbstractC5931l.m11750o(parcel, i28);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s19);
                return new C1328r(strM11741f40, strM11741f41, iM11750o14);
            default:
                int iM11754s20 = AbstractC5931l.m11754s(parcel);
                long jM11751p = 0;
                int iM11750o15 = 0;
                int iM11750o16 = 0;
                int iM11750o17 = 0;
                int iM11750o18 = 0;
                while (parcel.dataPosition() < iM11754s20) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 1) {
                        iM11750o15 = AbstractC5931l.m11750o(parcel, i29);
                    } else if (c20 == 2) {
                        iM11750o16 = AbstractC5931l.m11750o(parcel, i29);
                    } else if (c20 == 3) {
                        iM11750o17 = AbstractC5931l.m11750o(parcel, i29);
                    } else if (c20 == 4) {
                        iM11750o18 = AbstractC5931l.m11750o(parcel, i29);
                    } else if (c20 != 5) {
                        AbstractC5931l.m11753r(parcel, i29);
                    } else {
                        jM11751p = AbstractC5931l.m11751p(parcel, i29);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s20);
                return new f0(iM11750o15, iM11750o16, iM11750o17, iM11750o18, jM11751p);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f6524a) {
            case 0:
                return new C1317g[i10];
            case 1:
                return new C1329s[i10];
            case 2:
                return new C1331u[i10];
            case 3:
                return new C1332v[i10];
            case 4:
                return new C1333w[i10];
            case 5:
                return new C1318h[i10];
            case 6:
                return new C1319i[i10];
            case 7:
                return new C1320j[i10];
            case 8:
                return new C1321k[i10];
            case 9:
                return new C1322l[i10];
            case 10:
                return new C1323m[i10];
            case 11:
                return new b0[i10];
            case 12:
                return new c0[i10];
            case 13:
                return new d0[i10];
            case 14:
                return new C1324n[i10];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C1325o[i10];
            case 16:
                return new C1326p[i10];
            case 17:
                return new C1327q[i10];
            case 18:
                return new C1328r[i10];
            default:
                return new f0[i10];
        }
    }
}
