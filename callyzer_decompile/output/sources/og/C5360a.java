package og;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5931l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.a */
/* loaded from: classes.dex */
public final class C5360a implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f26307a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f26307a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                String strM11741f = null;
                String strM11741f2 = null;
                int iM11750o = 0;
                String strM11741f3 = null;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    char c2 = (char) i10;
                    if (c2 == 2) {
                        iM11750o = AbstractC5931l.m11750o(parcel, i10);
                    } else if (c2 == 3) {
                        strM11741f = AbstractC5931l.m11741f(parcel, i10);
                    } else if (c2 == 4) {
                        strM11741f3 = AbstractC5931l.m11741f(parcel, i10);
                    } else if (c2 != 5) {
                        AbstractC5931l.m11753r(parcel, i10);
                    } else {
                        strM11741f2 = AbstractC5931l.m11741f(parcel, i10);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                g8 g8Var = new g8();
                g8Var.f26463a = iM11750o;
                g8Var.f26464b = strM11741f;
                g8Var.f26465c = strM11741f3;
                g8Var.f26466d = strM11741f2;
                return g8Var;
            case 1:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                double dM11748m = 0.0d;
                double dM11748m2 = 0.0d;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 2) {
                        dM11748m = AbstractC5931l.m11748m(parcel, i11);
                    } else if (c10 != 3) {
                        AbstractC5931l.m11753r(parcel, i11);
                    } else {
                        dM11748m2 = AbstractC5931l.m11748m(parcel, i11);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                h9 h9Var = new h9();
                h9Var.f26496a = dM11748m;
                h9Var.f26497b = dM11748m2;
                return h9Var;
            case 2:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                String strM11741f4 = null;
                String strM11741f5 = null;
                String strM11741f6 = null;
                String strM11741f7 = null;
                String strM11741f8 = null;
                String strM11741f9 = null;
                String strM11741f10 = null;
                while (parcel.dataPosition() < iM11754s3) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            strM11741f4 = AbstractC5931l.m11741f(parcel, i12);
                            break;
                        case 3:
                            strM11741f5 = AbstractC5931l.m11741f(parcel, i12);
                            break;
                        case 4:
                            strM11741f6 = AbstractC5931l.m11741f(parcel, i12);
                            break;
                        case 5:
                            strM11741f7 = AbstractC5931l.m11741f(parcel, i12);
                            break;
                        case 6:
                            strM11741f8 = AbstractC5931l.m11741f(parcel, i12);
                            break;
                        case 7:
                            strM11741f9 = AbstractC5931l.m11741f(parcel, i12);
                            break;
                        case '\b':
                            strM11741f10 = AbstractC5931l.m11741f(parcel, i12);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i12);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                ha haVar = new ha();
                haVar.f26498a = strM11741f4;
                haVar.f26499b = strM11741f5;
                haVar.f26500c = strM11741f6;
                haVar.f26501d = strM11741f7;
                haVar.f26502e = strM11741f8;
                haVar.f26503f = strM11741f9;
                haVar.f26504g = strM11741f10;
                return haVar;
            case 3:
                int iM11754s4 = AbstractC5931l.m11754s(parcel);
                String strM11741f11 = null;
                int iM11750o2 = 0;
                while (parcel.dataPosition() < iM11754s4) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        iM11750o2 = AbstractC5931l.m11750o(parcel, i13);
                    } else if (c11 != 3) {
                        AbstractC5931l.m11753r(parcel, i13);
                    } else {
                        strM11741f11 = AbstractC5931l.m11741f(parcel, i13);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s4);
                ib ibVar = new ib();
                ibVar.f26539a = iM11750o2;
                ibVar.f26540b = strM11741f11;
                return ibVar;
            case 4:
                int iM11754s5 = AbstractC5931l.m11754s(parcel);
                String strM11741f12 = null;
                String strM11741f13 = null;
                while (parcel.dataPosition() < iM11754s5) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        strM11741f12 = AbstractC5931l.m11741f(parcel, i14);
                    } else if (c12 != 3) {
                        AbstractC5931l.m11753r(parcel, i14);
                    } else {
                        strM11741f13 = AbstractC5931l.m11741f(parcel, i14);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s5);
                cc ccVar = new cc();
                ccVar.f26361a = strM11741f12;
                ccVar.f26362b = strM11741f13;
                return ccVar;
            case 5:
                int iM11754s6 = AbstractC5931l.m11754s(parcel);
                String strM11741f14 = null;
                String strM11741f15 = null;
                while (parcel.dataPosition() < iM11754s6) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 2) {
                        strM11741f14 = AbstractC5931l.m11741f(parcel, i15);
                    } else if (c13 != 3) {
                        AbstractC5931l.m11753r(parcel, i15);
                    } else {
                        strM11741f15 = AbstractC5931l.m11741f(parcel, i15);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s6);
                xc xcVar = new xc();
                xcVar.f26946a = strM11741f14;
                xcVar.f26947b = strM11741f15;
                return xcVar;
            case 6:
                int iM11754s7 = AbstractC5931l.m11754s(parcel);
                int iM11750o3 = 0;
                String strM11741f16 = null;
                String strM11741f17 = null;
                while (parcel.dataPosition() < iM11754s7) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 2) {
                        strM11741f16 = AbstractC5931l.m11741f(parcel, i16);
                    } else if (c14 == 3) {
                        strM11741f17 = AbstractC5931l.m11741f(parcel, i16);
                    } else if (c14 != 4) {
                        AbstractC5931l.m11753r(parcel, i16);
                    } else {
                        iM11750o3 = AbstractC5931l.m11750o(parcel, i16);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s7);
                xd xdVar = new xd();
                xdVar.f26948a = strM11741f16;
                xdVar.f26949b = strM11741f17;
                xdVar.f26950c = iM11750o3;
                return xdVar;
            case 7:
                int iM11754s8 = AbstractC5931l.m11754s(parcel);
                int iM11750o4 = 0;
                boolean zM11747l = false;
                while (parcel.dataPosition() < iM11754s8) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 2) {
                        iM11750o4 = AbstractC5931l.m11750o(parcel, i17);
                    } else if (c15 != 3) {
                        AbstractC5931l.m11753r(parcel, i17);
                    } else {
                        zM11747l = AbstractC5931l.m11747l(parcel, i17);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s8);
                C5361b c5361b = new C5361b();
                c5361b.f26326a = iM11750o4;
                c5361b.f26327b = zM11747l;
                return c5361b;
            case 8:
                int iM11754s9 = AbstractC5931l.m11754s(parcel);
                int iM11750o5 = 0;
                int iM11750o6 = 0;
                int iM11750o7 = 0;
                int iM11750o8 = 0;
                long jM11751p = 0;
                while (parcel.dataPosition() < iM11754s9) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 2) {
                        iM11750o5 = AbstractC5931l.m11750o(parcel, i18);
                    } else if (c16 == 3) {
                        iM11750o6 = AbstractC5931l.m11750o(parcel, i18);
                    } else if (c16 == 4) {
                        iM11750o7 = AbstractC5931l.m11750o(parcel, i18);
                    } else if (c16 == 5) {
                        jM11751p = AbstractC5931l.m11751p(parcel, i18);
                    } else if (c16 != 6) {
                        AbstractC5931l.m11753r(parcel, i18);
                    } else {
                        iM11750o8 = AbstractC5931l.m11750o(parcel, i18);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s9);
                return new C5366g(iM11750o5, iM11750o6, iM11750o7, iM11750o8, jM11751p);
            case 9:
                int iM11754s10 = AbstractC5931l.m11754s(parcel);
                String[] strArrM11742g = null;
                int iM11750o9 = 0;
                while (parcel.dataPosition() < iM11754s10) {
                    int i19 = parcel.readInt();
                    char c17 = (char) i19;
                    if (c17 == 2) {
                        iM11750o9 = AbstractC5931l.m11750o(parcel, i19);
                    } else if (c17 != 3) {
                        AbstractC5931l.m11753r(parcel, i19);
                    } else {
                        strArrM11742g = AbstractC5931l.m11742g(parcel, i19);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s10);
                b3 b3Var = new b3();
                b3Var.f26330a = iM11750o9;
                b3Var.f26331b = strArrM11742g;
                return b3Var;
            case 10:
                int iM11754s11 = AbstractC5931l.m11754s(parcel);
                double dM11748m3 = 0.0d;
                int iM11750o10 = 0;
                boolean zM11747l2 = false;
                String strM11741f18 = null;
                String strM11741f19 = null;
                Point[] pointArr = null;
                g8 g8Var2 = null;
                ib ibVar2 = null;
                cc ccVar2 = null;
                xd xdVar2 = null;
                byte[] bArrM11739d = null;
                h9 h9Var2 = null;
                xc xcVar2 = null;
                d5 d5Var = null;
                e6 e6Var = null;
                f7 f7Var = null;
                int iM11750o11 = 0;
                while (parcel.dataPosition() < iM11754s11) {
                    int i20 = parcel.readInt();
                    xd xdVar3 = xdVar2;
                    switch ((char) i20) {
                        case 2:
                            iM11750o10 = AbstractC5931l.m11750o(parcel, i20);
                            break;
                        case 3:
                            strM11741f18 = AbstractC5931l.m11741f(parcel, i20);
                            break;
                        case 4:
                            strM11741f19 = AbstractC5931l.m11741f(parcel, i20);
                            break;
                        case 5:
                            iM11750o11 = AbstractC5931l.m11750o(parcel, i20);
                            break;
                        case 6:
                            pointArr = (Point[]) AbstractC5931l.m11744i(parcel, i20, Point.CREATOR);
                            break;
                        case 7:
                            g8Var2 = (g8) AbstractC5931l.m11740e(parcel, i20, g8.CREATOR);
                            break;
                        case '\b':
                            ibVar2 = (ib) AbstractC5931l.m11740e(parcel, i20, ib.CREATOR);
                            break;
                        case '\t':
                            ccVar2 = (cc) AbstractC5931l.m11740e(parcel, i20, cc.CREATOR);
                            break;
                        case '\n':
                            xdVar2 = (xd) AbstractC5931l.m11740e(parcel, i20, xd.CREATOR);
                            continue;
                        case 11:
                            xcVar2 = (xc) AbstractC5931l.m11740e(parcel, i20, xc.CREATOR);
                            break;
                        case '\f':
                            h9Var2 = (h9) AbstractC5931l.m11740e(parcel, i20, h9.CREATOR);
                            break;
                        case '\r':
                            d5Var = (d5) AbstractC5931l.m11740e(parcel, i20, d5.CREATOR);
                            break;
                        case 14:
                            e6Var = (e6) AbstractC5931l.m11740e(parcel, i20, e6.CREATOR);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            f7Var = (f7) AbstractC5931l.m11740e(parcel, i20, f7.CREATOR);
                            break;
                        case 16:
                            bArrM11739d = AbstractC5931l.m11739d(parcel, i20);
                            break;
                        case 17:
                            zM11747l2 = AbstractC5931l.m11747l(parcel, i20);
                            break;
                        case 18:
                            dM11748m3 = AbstractC5931l.m11748m(parcel, i20);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i20);
                            break;
                    }
                    xdVar2 = xdVar3;
                }
                AbstractC5931l.m11746k(parcel, iM11754s11);
                we weVar = new we();
                weVar.f26897a = iM11750o10;
                weVar.f26898b = strM11741f18;
                weVar.f26911q = bArrM11739d;
                weVar.f26899c = strM11741f19;
                weVar.f26900d = iM11750o11;
                weVar.f26901e = pointArr;
                weVar.f26912r = zM11747l2;
                weVar.f26913s = dM11748m3;
                weVar.f26902f = g8Var2;
                weVar.f26903g = ibVar2;
                weVar.f26904h = ccVar2;
                weVar.f26905j = xdVar2;
                weVar.f26906k = xcVar2;
                weVar.f26907l = h9Var2;
                weVar.f26908m = d5Var;
                weVar.f26909n = e6Var;
                weVar.f26910p = f7Var;
                return weVar;
            case 11:
                int iM11754s12 = AbstractC5931l.m11754s(parcel);
                String strM11741f20 = null;
                int iM11750o12 = 0;
                int iM11750o13 = 0;
                int iM11750o14 = 0;
                int iM11750o15 = 0;
                int iM11750o16 = 0;
                int iM11750o17 = 0;
                boolean zM11747l3 = false;
                while (parcel.dataPosition() < iM11754s12) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            iM11750o12 = AbstractC5931l.m11750o(parcel, i21);
                            break;
                        case 3:
                            iM11750o13 = AbstractC5931l.m11750o(parcel, i21);
                            break;
                        case 4:
                            iM11750o14 = AbstractC5931l.m11750o(parcel, i21);
                            break;
                        case 5:
                            iM11750o15 = AbstractC5931l.m11750o(parcel, i21);
                            break;
                        case 6:
                            iM11750o16 = AbstractC5931l.m11750o(parcel, i21);
                            break;
                        case 7:
                            iM11750o17 = AbstractC5931l.m11750o(parcel, i21);
                            break;
                        case '\b':
                            zM11747l3 = AbstractC5931l.m11747l(parcel, i21);
                            break;
                        case '\t':
                            strM11741f20 = AbstractC5931l.m11741f(parcel, i21);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i21);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s12);
                c4 c4Var = new c4();
                c4Var.f26347a = iM11750o12;
                c4Var.f26348b = iM11750o13;
                c4Var.f26349c = iM11750o14;
                c4Var.f26350d = iM11750o15;
                c4Var.f26351e = iM11750o16;
                c4Var.f26352f = iM11750o17;
                c4Var.f26353g = zM11747l3;
                c4Var.f26354h = strM11741f20;
                return c4Var;
            case 12:
                int iM11754s13 = AbstractC5931l.m11754s(parcel);
                String strM11741f21 = null;
                String strM11741f22 = null;
                String strM11741f23 = null;
                String strM11741f24 = null;
                String strM11741f25 = null;
                c4 c4Var2 = null;
                c4 c4Var3 = null;
                while (parcel.dataPosition() < iM11754s13) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strM11741f21 = AbstractC5931l.m11741f(parcel, i22);
                            break;
                        case 3:
                            strM11741f22 = AbstractC5931l.m11741f(parcel, i22);
                            break;
                        case 4:
                            strM11741f23 = AbstractC5931l.m11741f(parcel, i22);
                            break;
                        case 5:
                            strM11741f24 = AbstractC5931l.m11741f(parcel, i22);
                            break;
                        case 6:
                            strM11741f25 = AbstractC5931l.m11741f(parcel, i22);
                            break;
                        case 7:
                            c4Var2 = (c4) AbstractC5931l.m11740e(parcel, i22, c4.CREATOR);
                            break;
                        case '\b':
                            c4Var3 = (c4) AbstractC5931l.m11740e(parcel, i22, c4.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i22);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s13);
                d5 d5Var2 = new d5();
                d5Var2.f26370a = strM11741f21;
                d5Var2.f26371b = strM11741f22;
                d5Var2.f26372c = strM11741f23;
                d5Var2.f26373d = strM11741f24;
                d5Var2.f26374e = strM11741f25;
                d5Var2.f26375f = c4Var2;
                d5Var2.f26376g = c4Var3;
                return d5Var2;
            case 13:
                int iM11754s14 = AbstractC5931l.m11754s(parcel);
                String[] strArrM11742g2 = null;
                int iM11750o18 = 0;
                while (parcel.dataPosition() < iM11754s14) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        iM11750o18 = AbstractC5931l.m11750o(parcel, i23);
                    } else if (c18 != 2) {
                        AbstractC5931l.m11753r(parcel, i23);
                    } else {
                        strArrM11742g2 = AbstractC5931l.m11742g(parcel, i23);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s14);
                return new dh(strArrM11742g2, iM11750o18);
            case 14:
                int iM11754s15 = AbstractC5931l.m11754s(parcel);
                ha haVar2 = null;
                String strM11741f26 = null;
                String strM11741f27 = null;
                ib[] ibVarArr = null;
                g8[] g8VarArr = null;
                String[] strArrM11742g3 = null;
                b3[] b3VarArr = null;
                while (parcel.dataPosition() < iM11754s15) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            haVar2 = (ha) AbstractC5931l.m11740e(parcel, i24, ha.CREATOR);
                            break;
                        case 3:
                            strM11741f26 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 4:
                            strM11741f27 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 5:
                            ibVarArr = (ib[]) AbstractC5931l.m11744i(parcel, i24, ib.CREATOR);
                            break;
                        case 6:
                            g8VarArr = (g8[]) AbstractC5931l.m11744i(parcel, i24, g8.CREATOR);
                            break;
                        case 7:
                            strArrM11742g3 = AbstractC5931l.m11742g(parcel, i24);
                            break;
                        case '\b':
                            b3VarArr = (b3[]) AbstractC5931l.m11744i(parcel, i24, b3.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i24);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s15);
                e6 e6Var2 = new e6();
                e6Var2.f26398a = haVar2;
                e6Var2.f26399b = strM11741f26;
                e6Var2.f26400c = strM11741f27;
                e6Var2.f26401d = ibVarArr;
                e6Var2.f26402e = g8VarArr;
                e6Var2.f26403f = strArrM11742g3;
                e6Var2.f26404g = b3VarArr;
                return e6Var2;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iM11754s16 = AbstractC5931l.m11754s(parcel);
                String strM11741f28 = null;
                String strM11741f29 = null;
                byte[] bArrM11739d2 = null;
                Point[] pointArr2 = null;
                ih ihVar = null;
                lh lhVar = null;
                mh mhVar = null;
                oh ohVar = null;
                nh nhVar = null;
                jh jhVar = null;
                fh fhVar = null;
                gh ghVar = null;
                hh hhVar = null;
                int iM11750o19 = 0;
                int iM11750o20 = 0;
                while (parcel.dataPosition() < iM11754s16) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iM11750o19 = AbstractC5931l.m11750o(parcel, i25);
                            break;
                        case 2:
                            strM11741f28 = AbstractC5931l.m11741f(parcel, i25);
                            break;
                        case 3:
                            strM11741f29 = AbstractC5931l.m11741f(parcel, i25);
                            break;
                        case 4:
                            bArrM11739d2 = AbstractC5931l.m11739d(parcel, i25);
                            break;
                        case 5:
                            pointArr2 = (Point[]) AbstractC5931l.m11744i(parcel, i25, Point.CREATOR);
                            break;
                        case 6:
                            iM11750o20 = AbstractC5931l.m11750o(parcel, i25);
                            break;
                        case 7:
                            ihVar = (ih) AbstractC5931l.m11740e(parcel, i25, ih.CREATOR);
                            break;
                        case '\b':
                            lhVar = (lh) AbstractC5931l.m11740e(parcel, i25, lh.CREATOR);
                            break;
                        case '\t':
                            mhVar = (mh) AbstractC5931l.m11740e(parcel, i25, mh.CREATOR);
                            break;
                        case '\n':
                            ohVar = (oh) AbstractC5931l.m11740e(parcel, i25, oh.CREATOR);
                            break;
                        case 11:
                            nhVar = (nh) AbstractC5931l.m11740e(parcel, i25, nh.CREATOR);
                            break;
                        case '\f':
                            jhVar = (jh) AbstractC5931l.m11740e(parcel, i25, jh.CREATOR);
                            break;
                        case '\r':
                            fhVar = (fh) AbstractC5931l.m11740e(parcel, i25, fh.CREATOR);
                            break;
                        case 14:
                            ghVar = (gh) AbstractC5931l.m11740e(parcel, i25, gh.CREATOR);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            hhVar = (hh) AbstractC5931l.m11740e(parcel, i25, hh.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i25);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s16);
                return new ph(iM11750o19, strM11741f28, strM11741f29, bArrM11739d2, pointArr2, iM11750o20, ihVar, lhVar, mhVar, ohVar, nhVar, jhVar, fhVar, ghVar, hhVar);
            case 16:
                int iM11754s17 = AbstractC5931l.m11754s(parcel);
                String strM11741f30 = null;
                int iM11750o21 = 0;
                int iM11750o22 = 0;
                int iM11750o23 = 0;
                int iM11750o24 = 0;
                boolean zM11747l4 = false;
                int iM11750o25 = 0;
                int iM11750o26 = 0;
                while (parcel.dataPosition() < iM11754s17) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iM11750o21 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 2:
                            iM11750o22 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 3:
                            iM11750o23 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 4:
                            iM11750o24 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 5:
                            iM11750o25 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 6:
                            iM11750o26 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 7:
                            zM11747l4 = AbstractC5931l.m11747l(parcel, i26);
                            break;
                        case '\b':
                            strM11741f30 = AbstractC5931l.m11741f(parcel, i26);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i26);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s17);
                return new eh(strM11741f30, iM11750o21, iM11750o22, iM11750o23, iM11750o24, zM11747l4, iM11750o25, iM11750o26);
            case 17:
                int iM11754s18 = AbstractC5931l.m11754s(parcel);
                String strM11741f31 = null;
                String strM11741f32 = null;
                String strM11741f33 = null;
                String strM11741f34 = null;
                String strM11741f35 = null;
                eh ehVar = null;
                eh ehVar2 = null;
                while (parcel.dataPosition() < iM11754s18) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            strM11741f31 = AbstractC5931l.m11741f(parcel, i27);
                            break;
                        case 2:
                            strM11741f32 = AbstractC5931l.m11741f(parcel, i27);
                            break;
                        case 3:
                            strM11741f33 = AbstractC5931l.m11741f(parcel, i27);
                            break;
                        case 4:
                            strM11741f34 = AbstractC5931l.m11741f(parcel, i27);
                            break;
                        case 5:
                            strM11741f35 = AbstractC5931l.m11741f(parcel, i27);
                            break;
                        case 6:
                            ehVar = (eh) AbstractC5931l.m11740e(parcel, i27, eh.CREATOR);
                            break;
                        case 7:
                            ehVar2 = (eh) AbstractC5931l.m11740e(parcel, i27, eh.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i27);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s18);
                return new fh(strM11741f31, strM11741f32, strM11741f33, strM11741f34, strM11741f35, ehVar, ehVar2);
            case 18:
                int iM11754s19 = AbstractC5931l.m11754s(parcel);
                kh khVar = null;
                String strM11741f36 = null;
                String strM11741f37 = null;
                lh[] lhVarArr = null;
                ih[] ihVarArr = null;
                String[] strArrM11742g4 = null;
                dh[] dhVarArr = null;
                while (parcel.dataPosition() < iM11754s19) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            khVar = (kh) AbstractC5931l.m11740e(parcel, i28, kh.CREATOR);
                            break;
                        case 2:
                            strM11741f36 = AbstractC5931l.m11741f(parcel, i28);
                            break;
                        case 3:
                            strM11741f37 = AbstractC5931l.m11741f(parcel, i28);
                            break;
                        case 4:
                            lhVarArr = (lh[]) AbstractC5931l.m11744i(parcel, i28, lh.CREATOR);
                            break;
                        case 5:
                            ihVarArr = (ih[]) AbstractC5931l.m11744i(parcel, i28, ih.CREATOR);
                            break;
                        case 6:
                            strArrM11742g4 = AbstractC5931l.m11742g(parcel, i28);
                            break;
                        case 7:
                            dhVarArr = (dh[]) AbstractC5931l.m11744i(parcel, i28, dh.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i28);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s19);
                return new gh(khVar, strM11741f36, strM11741f37, lhVarArr, ihVarArr, strArrM11742g4, dhVarArr);
            case 19:
                int iM11754s20 = AbstractC5931l.m11754s(parcel);
                String strM11741f38 = null;
                String strM11741f39 = null;
                String strM11741f40 = null;
                String strM11741f41 = null;
                String strM11741f42 = null;
                String strM11741f43 = null;
                String strM11741f44 = null;
                String strM11741f45 = null;
                String strM11741f46 = null;
                String strM11741f47 = null;
                String strM11741f48 = null;
                String strM11741f49 = null;
                String strM11741f50 = null;
                String strM11741f51 = null;
                while (parcel.dataPosition() < iM11754s20) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            strM11741f38 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 2:
                            strM11741f39 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 3:
                            strM11741f40 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 4:
                            strM11741f41 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 5:
                            strM11741f42 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 6:
                            strM11741f43 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 7:
                            strM11741f44 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case '\b':
                            strM11741f45 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case '\t':
                            strM11741f46 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case '\n':
                            strM11741f47 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 11:
                            strM11741f48 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case '\f':
                            strM11741f49 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case '\r':
                            strM11741f50 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        case 14:
                            strM11741f51 = AbstractC5931l.m11741f(parcel, i29);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i29);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s20);
                return new hh(strM11741f38, strM11741f39, strM11741f40, strM11741f41, strM11741f42, strM11741f43, strM11741f44, strM11741f45, strM11741f46, strM11741f47, strM11741f48, strM11741f49, strM11741f50, strM11741f51);
            case 20:
                int iM11754s21 = AbstractC5931l.m11754s(parcel);
                String strM11741f52 = null;
                String strM11741f53 = null;
                int iM11750o27 = 0;
                String strM11741f54 = null;
                while (parcel.dataPosition() < iM11754s21) {
                    int i30 = parcel.readInt();
                    char c19 = (char) i30;
                    if (c19 == 1) {
                        iM11750o27 = AbstractC5931l.m11750o(parcel, i30);
                    } else if (c19 == 2) {
                        strM11741f52 = AbstractC5931l.m11741f(parcel, i30);
                    } else if (c19 == 3) {
                        strM11741f54 = AbstractC5931l.m11741f(parcel, i30);
                    } else if (c19 != 4) {
                        AbstractC5931l.m11753r(parcel, i30);
                    } else {
                        strM11741f53 = AbstractC5931l.m11741f(parcel, i30);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s21);
                return new ih(strM11741f52, iM11750o27, strM11741f54, strM11741f53);
            case 21:
                int iM11754s22 = AbstractC5931l.m11754s(parcel);
                double dM11748m4 = 0.0d;
                double dM11748m5 = 0.0d;
                while (parcel.dataPosition() < iM11754s22) {
                    int i31 = parcel.readInt();
                    char c20 = (char) i31;
                    if (c20 == 1) {
                        dM11748m4 = AbstractC5931l.m11748m(parcel, i31);
                    } else if (c20 != 2) {
                        AbstractC5931l.m11753r(parcel, i31);
                    } else {
                        dM11748m5 = AbstractC5931l.m11748m(parcel, i31);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s22);
                return new jh(dM11748m4, dM11748m5);
            case 22:
                int iM11754s23 = AbstractC5931l.m11754s(parcel);
                String strM11741f55 = null;
                String strM11741f56 = null;
                String strM11741f57 = null;
                String strM11741f58 = null;
                String strM11741f59 = null;
                String strM11741f60 = null;
                String strM11741f61 = null;
                while (parcel.dataPosition() < iM11754s23) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 1:
                            strM11741f55 = AbstractC5931l.m11741f(parcel, i32);
                            break;
                        case 2:
                            strM11741f56 = AbstractC5931l.m11741f(parcel, i32);
                            break;
                        case 3:
                            strM11741f57 = AbstractC5931l.m11741f(parcel, i32);
                            break;
                        case 4:
                            strM11741f58 = AbstractC5931l.m11741f(parcel, i32);
                            break;
                        case 5:
                            strM11741f59 = AbstractC5931l.m11741f(parcel, i32);
                            break;
                        case 6:
                            strM11741f60 = AbstractC5931l.m11741f(parcel, i32);
                            break;
                        case 7:
                            strM11741f61 = AbstractC5931l.m11741f(parcel, i32);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i32);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s23);
                return new kh(strM11741f55, strM11741f56, strM11741f57, strM11741f58, strM11741f59, strM11741f60, strM11741f61);
            case 23:
                int iM11754s24 = AbstractC5931l.m11754s(parcel);
                String strM11741f62 = null;
                int iM11750o28 = 0;
                while (parcel.dataPosition() < iM11754s24) {
                    int i33 = parcel.readInt();
                    char c21 = (char) i33;
                    if (c21 == 1) {
                        iM11750o28 = AbstractC5931l.m11750o(parcel, i33);
                    } else if (c21 != 2) {
                        AbstractC5931l.m11753r(parcel, i33);
                    } else {
                        strM11741f62 = AbstractC5931l.m11741f(parcel, i33);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s24);
                return new lh(iM11750o28, strM11741f62);
            case 24:
                int iM11754s25 = AbstractC5931l.m11754s(parcel);
                String strM11741f63 = null;
                String strM11741f64 = null;
                while (parcel.dataPosition() < iM11754s25) {
                    int i34 = parcel.readInt();
                    char c22 = (char) i34;
                    if (c22 == 1) {
                        strM11741f63 = AbstractC5931l.m11741f(parcel, i34);
                    } else if (c22 != 2) {
                        AbstractC5931l.m11753r(parcel, i34);
                    } else {
                        strM11741f64 = AbstractC5931l.m11741f(parcel, i34);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s25);
                return new mh(strM11741f63, strM11741f64);
            case 25:
                int iM11754s26 = AbstractC5931l.m11754s(parcel);
                String strM11741f65 = null;
                String strM11741f66 = null;
                while (parcel.dataPosition() < iM11754s26) {
                    int i35 = parcel.readInt();
                    char c23 = (char) i35;
                    if (c23 == 1) {
                        strM11741f65 = AbstractC5931l.m11741f(parcel, i35);
                    } else if (c23 != 2) {
                        AbstractC5931l.m11753r(parcel, i35);
                    } else {
                        strM11741f66 = AbstractC5931l.m11741f(parcel, i35);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s26);
                return new nh(strM11741f65, strM11741f66);
            case 26:
                int iM11754s27 = AbstractC5931l.m11754s(parcel);
                int iM11750o29 = 0;
                String strM11741f67 = null;
                String strM11741f68 = null;
                while (parcel.dataPosition() < iM11754s27) {
                    int i36 = parcel.readInt();
                    char c24 = (char) i36;
                    if (c24 == 1) {
                        strM11741f67 = AbstractC5931l.m11741f(parcel, i36);
                    } else if (c24 == 2) {
                        strM11741f68 = AbstractC5931l.m11741f(parcel, i36);
                    } else if (c24 != 3) {
                        AbstractC5931l.m11753r(parcel, i36);
                    } else {
                        iM11750o29 = AbstractC5931l.m11750o(parcel, i36);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s27);
                return new oh(strM11741f67, strM11741f68, iM11750o29);
            default:
                int iM11754s28 = AbstractC5931l.m11754s(parcel);
                String strM11741f69 = null;
                String strM11741f70 = null;
                String strM11741f71 = null;
                String strM11741f72 = null;
                String strM11741f73 = null;
                String strM11741f74 = null;
                String strM11741f75 = null;
                String strM11741f76 = null;
                String strM11741f77 = null;
                String strM11741f78 = null;
                String strM11741f79 = null;
                String strM11741f80 = null;
                String strM11741f81 = null;
                String strM11741f82 = null;
                while (parcel.dataPosition() < iM11754s28) {
                    int i37 = parcel.readInt();
                    String str = strM11741f81;
                    switch ((char) i37) {
                        case 2:
                            strM11741f69 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 3:
                            strM11741f70 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 4:
                            strM11741f71 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 5:
                            strM11741f72 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 6:
                            strM11741f73 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 7:
                            strM11741f74 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case '\b':
                            strM11741f75 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case '\t':
                            strM11741f76 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case '\n':
                            strM11741f77 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 11:
                            strM11741f78 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case '\f':
                            strM11741f79 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case '\r':
                            strM11741f80 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 14:
                            strM11741f81 = AbstractC5931l.m11741f(parcel, i37);
                            continue;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            strM11741f82 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i37);
                            break;
                    }
                    strM11741f81 = str;
                }
                AbstractC5931l.m11746k(parcel, iM11754s28);
                f7 f7Var2 = new f7();
                f7Var2.f26425a = strM11741f69;
                f7Var2.f26426b = strM11741f70;
                f7Var2.f26427c = strM11741f71;
                f7Var2.f26428d = strM11741f72;
                f7Var2.f26429e = strM11741f73;
                f7Var2.f26430f = strM11741f74;
                f7Var2.f26431g = strM11741f75;
                f7Var2.f26432h = strM11741f76;
                f7Var2.f26433j = strM11741f77;
                f7Var2.f26434k = strM11741f78;
                f7Var2.f26435l = strM11741f79;
                f7Var2.f26436m = strM11741f80;
                f7Var2.f26437n = strM11741f81;
                f7Var2.f26438p = strM11741f82;
                return f7Var2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f26307a) {
            case 0:
                return new g8[i10];
            case 1:
                return new h9[i10];
            case 2:
                return new ha[i10];
            case 3:
                return new ib[i10];
            case 4:
                return new cc[i10];
            case 5:
                return new xc[i10];
            case 6:
                return new xd[i10];
            case 7:
                return new C5361b[i10];
            case 8:
                return new C5366g[i10];
            case 9:
                return new b3[i10];
            case 10:
                return new we[i10];
            case 11:
                return new c4[i10];
            case 12:
                return new d5[i10];
            case 13:
                return new dh[i10];
            case 14:
                return new e6[i10];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new ph[i10];
            case 16:
                return new eh[i10];
            case 17:
                return new fh[i10];
            case 18:
                return new gh[i10];
            case 19:
                return new hh[i10];
            case 20:
                return new ih[i10];
            case 21:
                return new jh[i10];
            case 22:
                return new kh[i10];
            case 23:
                return new lh[i10];
            case 24:
                return new mh[i10];
            case 25:
                return new nh[i10];
            case 26:
                return new oh[i10];
            default:
                return new f7[i10];
        }
    }
}
