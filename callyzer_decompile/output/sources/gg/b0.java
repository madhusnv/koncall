package gg;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.C1275a;
import com.google.android.gms.fido.fido2.api.common.C1276b;
import com.google.android.gms.fido.fido2.api.common.C1279e;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;
import lf.C4450a;
import lf.C4451b;
import lf.C4452c;
import lf.C4453d;
import lf.C4454e;
import lf.C4455f;
import lf.C4456g;
import mg.u0;
import org.bouncycastle.iana.AEADAlgorithm;
import p007h.C2749a;
import p007h.C2759k;
import pg.AbstractC5931l;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f14086a;

    public /* synthetic */ b0(int i10) {
        this.f14086a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z6;
        boolean z10;
        switch (this.f14086a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                String strM11741f = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    char c2 = (char) i10;
                    if (c2 == 2) {
                        strM11741f = AbstractC5931l.m11741f(parcel, i10);
                    } else if (c2 != 3) {
                        AbstractC5931l.m11753r(parcel, i10);
                    } else {
                        int iM11752q = AbstractC5931l.m11752q(parcel, i10);
                        if (iM11752q == 0) {
                            numValueOf = null;
                        } else {
                            AbstractC5931l.m11755t(parcel, iM11752q, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new C1279e(strM11741f, numValueOf.intValue());
            case 1:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                String strM11741f2 = null;
                String strM11741f3 = null;
                String strM11741f4 = null;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 2) {
                        strM11741f2 = AbstractC5931l.m11741f(parcel, i11);
                    } else if (c10 == 3) {
                        strM11741f3 = AbstractC5931l.m11741f(parcel, i11);
                    } else if (c10 != 4) {
                        AbstractC5931l.m11753r(parcel, i11);
                    } else {
                        strM11741f4 = AbstractC5931l.m11741f(parcel, i11);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new C2599n(strM11741f2, strM11741f3, strM11741f4);
            case 2:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d = null;
                String strM11741f5 = null;
                String strM11741f6 = null;
                String strM11741f7 = null;
                while (parcel.dataPosition() < iM11754s3) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 2) {
                        bArrM11739d = AbstractC5931l.m11739d(parcel, i12);
                    } else if (c11 == 3) {
                        strM11741f5 = AbstractC5931l.m11741f(parcel, i12);
                    } else if (c11 == 4) {
                        strM11741f6 = AbstractC5931l.m11741f(parcel, i12);
                    } else if (c11 != 5) {
                        AbstractC5931l.m11753r(parcel, i12);
                    } else {
                        strM11741f7 = AbstractC5931l.m11741f(parcel, i12);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                return new C2600o(strM11741f5, strM11741f6, strM11741f7, bArrM11739d);
            case 3:
                int iM11754s4 = AbstractC5931l.m11754s(parcel);
                String strM11741f8 = null;
                while (parcel.dataPosition() < iM11754s4) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        AbstractC5931l.m11753r(parcel, i13);
                    } else {
                        strM11741f8 = AbstractC5931l.m11741f(parcel, i13);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s4);
                return new c0(strM11741f8);
            case 4:
                try {
                    return EnumC2602q.fromString(parcel.readString());
                } catch (TokenBinding$UnsupportedTokenBindingStatusException e2) {
                    throw new RuntimeException(e2);
                }
            case 5:
                int iM11754s5 = AbstractC5931l.m11754s(parcel);
                String strM11741f9 = null;
                String strM11741f10 = null;
                while (parcel.dataPosition() < iM11754s5) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        strM11741f9 = AbstractC5931l.m11741f(parcel, i14);
                    } else if (c12 != 3) {
                        AbstractC5931l.m11753r(parcel, i14);
                    } else {
                        strM11741f10 = AbstractC5931l.m11741f(parcel, i14);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s5);
                return new C2603r(strM11741f9, strM11741f10);
            case 6:
                int iM11754s6 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l = false;
                while (parcel.dataPosition() < iM11754s6) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        AbstractC5931l.m11753r(parcel, i15);
                    } else {
                        zM11747l = AbstractC5931l.m11747l(parcel, i15);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s6);
                return new C2604s(zM11747l);
            case 7:
                try {
                    return EnumC2605t.fromString(parcel.readString());
                } catch (zzbc e10) {
                    throw new RuntimeException(e10);
                }
            case 8:
                int iM11754s7 = AbstractC5931l.m11754s(parcel);
                ArrayList arrayListM11745j = null;
                while (parcel.dataPosition() < iM11754s7) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        AbstractC5931l.m11753r(parcel, i16);
                    } else {
                        arrayListM11745j = AbstractC5931l.m11745j(parcel, i16, C2607v.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s7);
                return new C2606u(arrayListM11745j);
            case 9:
                int iM11754s8 = AbstractC5931l.m11754s(parcel);
                int iM11750o = 0;
                short s5 = 0;
                short s10 = 0;
                while (parcel.dataPosition() < iM11754s8) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        iM11750o = AbstractC5931l.m11750o(parcel, i17);
                    } else if (c13 == 2) {
                        AbstractC5931l.m11756u(parcel, i17, 4);
                        s5 = (short) parcel.readInt();
                    } else if (c13 != 3) {
                        AbstractC5931l.m11753r(parcel, i17);
                    } else {
                        AbstractC5931l.m11756u(parcel, i17, 4);
                        s10 = (short) parcel.readInt();
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s8);
                return new C2607v(iM11750o, s5, s10);
            case 10:
                int iM11754s9 = AbstractC5931l.m11754s(parcel);
                C2606u c2606u = null;
                d0 d0Var = null;
                C2589d c2589d = null;
                e0 e0Var = null;
                String strM11741f11 = null;
                while (parcel.dataPosition() < iM11754s9) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        c2606u = (C2606u) AbstractC5931l.m11740e(parcel, i18, C2606u.CREATOR);
                    } else if (c14 == 2) {
                        d0Var = (d0) AbstractC5931l.m11740e(parcel, i18, d0.CREATOR);
                    } else if (c14 == 3) {
                        c2589d = (C2589d) AbstractC5931l.m11740e(parcel, i18, C2589d.CREATOR);
                    } else if (c14 == 4) {
                        e0Var = (e0) AbstractC5931l.m11740e(parcel, i18, e0.CREATOR);
                    } else if (c14 != 5) {
                        AbstractC5931l.m11753r(parcel, i18);
                    } else {
                        strM11741f11 = AbstractC5931l.m11741f(parcel, i18);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s9);
                return new C2588c(c2606u, d0Var, c2589d, e0Var, strM11741f11);
            case 11:
                int iM11754s10 = AbstractC5931l.m11754s(parcel);
                C2595j c2595j = null;
                g0 g0Var = null;
                C2604s c2604s = null;
                i0 i0Var = null;
                C2608w c2608w = null;
                C2609x c2609x = null;
                h0 h0Var = null;
                C2610y c2610y = null;
                C2596k c2596k = null;
                a0 a0Var = null;
                c0 c0Var = null;
                C2611z c2611z = null;
                while (parcel.dataPosition() < iM11754s10) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            c2595j = (C2595j) AbstractC5931l.m11740e(parcel, i19, C2595j.CREATOR);
                            break;
                        case 3:
                            g0Var = (g0) AbstractC5931l.m11740e(parcel, i19, g0.CREATOR);
                            break;
                        case 4:
                            c2604s = (C2604s) AbstractC5931l.m11740e(parcel, i19, C2604s.CREATOR);
                            break;
                        case 5:
                            i0Var = (i0) AbstractC5931l.m11740e(parcel, i19, i0.CREATOR);
                            break;
                        case 6:
                            c2608w = (C2608w) AbstractC5931l.m11740e(parcel, i19, C2608w.CREATOR);
                            break;
                        case 7:
                            c2609x = (C2609x) AbstractC5931l.m11740e(parcel, i19, C2609x.CREATOR);
                            break;
                        case '\b':
                            h0Var = (h0) AbstractC5931l.m11740e(parcel, i19, h0.CREATOR);
                            break;
                        case '\t':
                            c2610y = (C2610y) AbstractC5931l.m11740e(parcel, i19, C2610y.CREATOR);
                            break;
                        case '\n':
                            c2596k = (C2596k) AbstractC5931l.m11740e(parcel, i19, C2596k.CREATOR);
                            break;
                        case 11:
                            a0Var = (a0) AbstractC5931l.m11740e(parcel, i19, a0.CREATOR);
                            break;
                        case '\f':
                            c0Var = (c0) AbstractC5931l.m11740e(parcel, i19, c0.CREATOR);
                            break;
                        case '\r':
                            c2611z = (C2611z) AbstractC5931l.m11740e(parcel, i19, C2611z.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i19);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s10);
                return new C2587b(c2595j, g0Var, c2604s, i0Var, c2608w, c2609x, h0Var, c2610y, c2596k, a0Var, c0Var, c2611z);
            case 12:
                int iM11754s11 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l2 = false;
                while (parcel.dataPosition() < iM11754s11) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        AbstractC5931l.m11753r(parcel, i20);
                    } else {
                        zM11747l2 = AbstractC5931l.m11747l(parcel, i20);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s11);
                return new C2589d(zM11747l2);
            case 13:
                int iM11754s12 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d2 = null;
                byte[] bArrM11739d3 = null;
                while (parcel.dataPosition() < iM11754s12) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 1) {
                        bArrM11739d2 = AbstractC5931l.m11739d(parcel, i21);
                    } else if (c15 != 2) {
                        AbstractC5931l.m11753r(parcel, i21);
                    } else {
                        bArrM11739d3 = AbstractC5931l.m11739d(parcel, i21);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s12);
                return new d0(bArrM11739d2 == null ? null : u0.m9650k(bArrM11739d2.length, bArrM11739d2), bArrM11739d3 != null ? u0.m9650k(bArrM11739d3.length, bArrM11739d3) : null);
            case 14:
                int iM11754s13 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l3 = false;
                byte[] bArrM11739d4 = null;
                while (parcel.dataPosition() < iM11754s13) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 1) {
                        zM11747l3 = AbstractC5931l.m11747l(parcel, i22);
                    } else if (c16 != 2) {
                        AbstractC5931l.m11753r(parcel, i22);
                    } else {
                        bArrM11739d4 = AbstractC5931l.m11739d(parcel, i22);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s13);
                return new e0(zM11747l3, bArrM11739d4 != null ? u0.m9650k(bArrM11739d4.length, bArrM11739d4) : null);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iM11754s14 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d5 = null;
                byte[] bArrM11739d6 = null;
                byte[] bArrM11739d7 = null;
                byte[] bArrM11739d8 = null;
                byte[] bArrM11739d9 = null;
                while (parcel.dataPosition() < iM11754s14) {
                    int i23 = parcel.readInt();
                    char c17 = (char) i23;
                    if (c17 == 2) {
                        bArrM11739d5 = AbstractC5931l.m11739d(parcel, i23);
                    } else if (c17 == 3) {
                        bArrM11739d6 = AbstractC5931l.m11739d(parcel, i23);
                    } else if (c17 == 4) {
                        bArrM11739d7 = AbstractC5931l.m11739d(parcel, i23);
                    } else if (c17 == 5) {
                        bArrM11739d8 = AbstractC5931l.m11739d(parcel, i23);
                    } else if (c17 != 6) {
                        AbstractC5931l.m11753r(parcel, i23);
                    } else {
                        bArrM11739d9 = AbstractC5931l.m11739d(parcel, i23);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s14);
                return new C2590e(bArrM11739d5, bArrM11739d6, bArrM11739d7, bArrM11739d8, bArrM11739d9);
            case 16:
                int iM11754s15 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d10 = null;
                byte[] bArrM11739d11 = null;
                byte[] bArrM11739d12 = null;
                String[] strArrM11742g = null;
                while (parcel.dataPosition() < iM11754s15) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 2) {
                        bArrM11739d10 = AbstractC5931l.m11739d(parcel, i24);
                    } else if (c18 == 3) {
                        bArrM11739d11 = AbstractC5931l.m11739d(parcel, i24);
                    } else if (c18 == 4) {
                        bArrM11739d12 = AbstractC5931l.m11739d(parcel, i24);
                    } else if (c18 != 5) {
                        AbstractC5931l.m11753r(parcel, i24);
                    } else {
                        strArrM11742g = AbstractC5931l.m11742g(parcel, i24);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s15);
                return new C2591f(bArrM11739d10, bArrM11739d11, bArrM11739d12, strArrM11742g);
            case 17:
                int iM11754s16 = AbstractC5931l.m11754s(parcel);
                int iM11750o2 = 0;
                String strM11741f12 = null;
                int iM11750o3 = 0;
                while (parcel.dataPosition() < iM11754s16) {
                    int i25 = parcel.readInt();
                    char c19 = (char) i25;
                    if (c19 == 2) {
                        iM11750o2 = AbstractC5931l.m11750o(parcel, i25);
                    } else if (c19 == 3) {
                        strM11741f12 = AbstractC5931l.m11741f(parcel, i25);
                    } else if (c19 != 4) {
                        AbstractC5931l.m11753r(parcel, i25);
                    } else {
                        iM11750o3 = AbstractC5931l.m11750o(parcel, i25);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s16);
                return new C1275a(iM11750o2, strM11741f12, iM11750o3);
            case 18:
                int iM11754s17 = AbstractC5931l.m11754s(parcel);
                String strM11741f13 = null;
                Boolean boolValueOf = null;
                String strM11741f14 = null;
                String strM11741f15 = null;
                while (parcel.dataPosition() < iM11754s17) {
                    int i26 = parcel.readInt();
                    char c20 = (char) i26;
                    if (c20 == 2) {
                        strM11741f13 = AbstractC5931l.m11741f(parcel, i26);
                    } else if (c20 == 3) {
                        int iM11752q2 = AbstractC5931l.m11752q(parcel, i26);
                        if (iM11752q2 == 0) {
                            boolValueOf = null;
                        } else {
                            AbstractC5931l.m11755t(parcel, iM11752q2, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c20 == 4) {
                        strM11741f14 = AbstractC5931l.m11741f(parcel, i26);
                    } else if (c20 != 5) {
                        AbstractC5931l.m11753r(parcel, i26);
                    } else {
                        strM11741f15 = AbstractC5931l.m11741f(parcel, i26);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s17);
                return new C1276b(strM11741f13, boolValueOf, strM11741f14, strM11741f15);
            case 19:
                try {
                    return C2593h.m6586a(parcel.readInt());
                } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e11) {
                    throw new RuntimeException(e11);
                }
            case 20:
                int iM11754s18 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d13 = null;
                byte[] bArrM11739d14 = null;
                byte[] bArrM11739d15 = null;
                long jM11751p = 0;
                while (parcel.dataPosition() < iM11754s18) {
                    int i27 = parcel.readInt();
                    char c21 = (char) i27;
                    if (c21 == 1) {
                        jM11751p = AbstractC5931l.m11751p(parcel, i27);
                    } else if (c21 == 2) {
                        bArrM11739d13 = AbstractC5931l.m11739d(parcel, i27);
                    } else if (c21 == 3) {
                        bArrM11739d14 = AbstractC5931l.m11739d(parcel, i27);
                    } else if (c21 != 4) {
                        AbstractC5931l.m11753r(parcel, i27);
                    } else {
                        bArrM11739d15 = AbstractC5931l.m11739d(parcel, i27);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s18);
                return new f0(jM11751p, bArrM11739d13, bArrM11739d14, bArrM11739d15);
            case 21:
                int iM11754s19 = AbstractC5931l.m11754s(parcel);
                ArrayList arrayListM11745j2 = null;
                while (parcel.dataPosition() < iM11754s19) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        AbstractC5931l.m11753r(parcel, i28);
                    } else {
                        arrayListM11745j2 = AbstractC5931l.m11745j(parcel, i28, f0.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s19);
                return new g0(arrayListM11745j2);
            case 22:
                int iM11754s20 = AbstractC5931l.m11754s(parcel);
                while (parcel.dataPosition() < iM11754s20) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        AbstractC5931l.m11753r(parcel, i29);
                    } else {
                        AbstractC5931l.m11747l(parcel, i29);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s20);
                return new h0();
            case 23:
                int iM11754s21 = AbstractC5931l.m11754s(parcel);
                String strM11741f16 = null;
                while (parcel.dataPosition() < iM11754s21) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 2) {
                        AbstractC5931l.m11753r(parcel, i30);
                    } else {
                        strM11741f16 = AbstractC5931l.m11741f(parcel, i30);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s21);
                return new C2595j(strM11741f16);
            case 24:
                AbstractC4154l.m8923f(parcel, "parcel");
                return new C2749a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 25:
                AbstractC4154l.m8923f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC4154l.m8920c(parcelable);
                return new C2759k((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 26:
                AbstractC4154l.m8923f(parcel, "parcel");
                int i31 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i32 = parcel.readInt();
                EnumC8994d enumC8994dValueOf = EnumC8994d.valueOf(parcel.readString());
                LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
                long j6 = parcel.readLong();
                Boolean boolValueOf2 = null;
                EnumC8993c enumC8993cValueOf = parcel.readInt() == 0 ? null : EnumC8993c.valueOf(parcel.readString());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z6 = false;
                    z11 = true;
                    z10 = true;
                } else {
                    z6 = false;
                    z10 = true;
                }
                String string5 = parcel.readString();
                boolean z12 = z10;
                String string6 = parcel.readString();
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z12 : z6);
                }
                boolean z13 = parcel.readInt() != 0 ? z12 : z6;
                int i33 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i33);
                Boolean bool = boolValueOf2;
                int i34 = 0;
                while (i34 != i33) {
                    arrayList.add(parcel.readParcelable(C4181k.class.getClassLoader()));
                    i34++;
                    i33 = i33;
                }
                return new C4181k(i31, string, string2, i32, enumC8994dValueOf, localDateTime, j6, enumC8993cValueOf, string3, string4, z11, string5, string6, numValueOf2, bool, z13, arrayList);
            case 27:
                int iM11754s22 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l4 = false;
                int iM11750o4 = 0;
                boolean zM11747l5 = false;
                C4453d c4453d = null;
                C4450a c4450a = null;
                String strM11741f17 = null;
                C4452c c4452c = null;
                C4451b c4451b = null;
                while (parcel.dataPosition() < iM11754s22) {
                    int i35 = parcel.readInt();
                    switch ((char) i35) {
                        case 1:
                            c4453d = (C4453d) AbstractC5931l.m11740e(parcel, i35, C4453d.CREATOR);
                            break;
                        case 2:
                            c4450a = (C4450a) AbstractC5931l.m11740e(parcel, i35, C4450a.CREATOR);
                            break;
                        case 3:
                            strM11741f17 = AbstractC5931l.m11741f(parcel, i35);
                            break;
                        case 4:
                            zM11747l4 = AbstractC5931l.m11747l(parcel, i35);
                            break;
                        case 5:
                            iM11750o4 = AbstractC5931l.m11750o(parcel, i35);
                            break;
                        case 6:
                            c4452c = (C4452c) AbstractC5931l.m11740e(parcel, i35, C4452c.CREATOR);
                            break;
                        case 7:
                            c4451b = (C4451b) AbstractC5931l.m11740e(parcel, i35, C4451b.CREATOR);
                            break;
                        case '\b':
                            zM11747l5 = AbstractC5931l.m11747l(parcel, i35);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i35);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s22);
                return new C4454e(c4453d, c4450a, strM11741f17, zM11747l4, iM11750o4, c4452c, c4451b, zM11747l5);
            case 28:
                int iM11754s23 = AbstractC5931l.m11754s(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM11754s23) {
                    int i36 = parcel.readInt();
                    if (((char) i36) != 1) {
                        AbstractC5931l.m11753r(parcel, i36);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC5931l.m11740e(parcel, i36, PendingIntent.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s23);
                return new C4455f(pendingIntent);
            default:
                int iM11754s24 = AbstractC5931l.m11754s(parcel);
                int iM11750o5 = 0;
                boolean zM11747l6 = false;
                String strM11741f18 = null;
                String strM11741f19 = null;
                String strM11741f20 = null;
                String strM11741f21 = null;
                while (parcel.dataPosition() < iM11754s24) {
                    int i37 = parcel.readInt();
                    switch ((char) i37) {
                        case 1:
                            strM11741f18 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 2:
                            strM11741f19 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 3:
                            strM11741f20 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 4:
                            strM11741f21 = AbstractC5931l.m11741f(parcel, i37);
                            break;
                        case 5:
                            zM11747l6 = AbstractC5931l.m11747l(parcel, i37);
                            break;
                        case 6:
                            iM11750o5 = AbstractC5931l.m11750o(parcel, i37);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i37);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s24);
                return new C4456g(strM11741f18, iM11750o5, zM11747l6, strM11741f19, strM11741f20, strM11741f21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f14086a) {
            case 0:
                return new C1279e[i10];
            case 1:
                return new C2599n[i10];
            case 2:
                return new C2600o[i10];
            case 3:
                return new c0[i10];
            case 4:
                return new EnumC2602q[i10];
            case 5:
                return new C2603r[i10];
            case 6:
                return new C2604s[i10];
            case 7:
                return new EnumC2605t[i10];
            case 8:
                return new C2606u[i10];
            case 9:
                return new C2607v[i10];
            case 10:
                return new C2588c[i10];
            case 11:
                return new C2587b[i10];
            case 12:
                return new C2589d[i10];
            case 13:
                return new d0[i10];
            case 14:
                return new e0[i10];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C2590e[i10];
            case 16:
                return new C2591f[i10];
            case 17:
                return new C1275a[i10];
            case 18:
                return new C1276b[i10];
            case 19:
                return new C2593h[i10];
            case 20:
                return new f0[i10];
            case 21:
                return new g0[i10];
            case 22:
                return new h0[i10];
            case 23:
                return new C2595j[i10];
            case 24:
                return new C2749a[i10];
            case 25:
                return new C2759k[i10];
            case 26:
                return new C4181k[i10];
            case 27:
                return new C4454e[i10];
            case 28:
                return new C4455f[i10];
            default:
                return new C4456g[i10];
        }
    }
}
