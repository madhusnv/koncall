package sf;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import pf.C5904d;
import pg.AbstractC5931l;
import pg.AbstractC5932m;
import tq.C7189a;
import tq.C7190b;
import tq.C7191c;
import tq.C7192d;
import tq.C7193e;
import tq.C7194f;
import tq.C7195g;
import tq.C7196h;
import tq.C7197i;
import tq.C7198j;
import tq.C7199k;
import tq.C7200l;
import ug.C7433d;
import ug.C7434e;
import ug.C7438i;
import ug.C7448s;
import ug.C7449t;
import ug.a4;
import ug.b4;
import ug.j4;
import ug.n4;
import ug.w3;
import ug.z3;
import wf.C8025a;
import wf.C8026b;
import wf.C8027c;
import wg.C8029b;
import wg.C8032e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f32430a;

    public /* synthetic */ g0(int i10) {
        this.f32430a = i10;
    }

    /* renamed from: a */
    public static void m13011a(C6821g c6821g, Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int i11 = c6821g.f32416a;
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = c6821g.f32417b;
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = c6821g.f32418c;
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(i13);
        AbstractC5932m.m11778f(parcel, 4, c6821g.f32419d);
        AbstractC5932m.m11776d(parcel, 5, c6821g.f32420e);
        AbstractC5932m.m11781i(parcel, 6, c6821g.f32421f, i10);
        AbstractC5932m.m11774b(parcel, 7, c6821g.f32422g);
        AbstractC5932m.m11777e(parcel, 8, c6821g.f32423h, i10);
        AbstractC5932m.m11781i(parcel, 10, c6821g.f32424j, i10);
        AbstractC5932m.m11781i(parcel, 11, c6821g.f32425k, i10);
        boolean z6 = c6821g.f32426l;
        AbstractC5932m.m11785m(parcel, 12, 4);
        parcel.writeInt(z6 ? 1 : 0);
        int i14 = c6821g.f32427m;
        AbstractC5932m.m11785m(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z10 = c6821g.f32428n;
        AbstractC5932m.m11785m(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 15, c6821g.f32429p);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    /* renamed from: b */
    public static void m13012b(C7449t c7449t, Parcel parcel, int i10) {
        String str = c7449t.f35827a;
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, str);
        AbstractC5932m.m11777e(parcel, 3, c7449t.f35828b, i10);
        AbstractC5932m.m11778f(parcel, 4, c7449t.f35829c);
        long j6 = c7449t.f35830d;
        AbstractC5932m.m11785m(parcel, 5, 8);
        parcel.writeLong(j6);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    /* renamed from: c */
    public static void m13013c(j4 j4Var, Parcel parcel) {
        int i10 = j4Var.f35548a;
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC5932m.m11778f(parcel, 2, j4Var.f35549b);
        long j6 = j4Var.f35550c;
        AbstractC5932m.m11785m(parcel, 3, 8);
        parcel.writeLong(j6);
        Long l9 = j4Var.f35551d;
        if (l9 != null) {
            AbstractC5932m.m11785m(parcel, 4, 8);
            parcel.writeLong(l9.longValue());
        }
        AbstractC5932m.m11778f(parcel, 6, j4Var.f35552e);
        AbstractC5932m.m11778f(parcel, 7, j4Var.f35553f);
        Double d2 = j4Var.f35554g;
        if (d2 != null) {
            AbstractC5932m.m11785m(parcel, 8, 8);
            parcel.writeDouble(d2.doubleValue());
        }
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Long lValueOf;
        switch (this.f32430a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                C6827m c6827m = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zM11747l = false;
                boolean zM11747l2 = false;
                int iM11750o = 0;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            c6827m = (C6827m) AbstractC5931l.m11740e(parcel, i10, C6827m.CREATOR);
                            break;
                        case 2:
                            zM11747l = AbstractC5931l.m11747l(parcel, i10);
                            break;
                        case 3:
                            zM11747l2 = AbstractC5931l.m11747l(parcel, i10);
                            break;
                        case 4:
                            int iM11752q = AbstractC5931l.m11752q(parcel, i10);
                            int iDataPosition = parcel.dataPosition();
                            if (iM11752q == 0) {
                                iArrCreateIntArray = null;
                                break;
                            } else {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iM11752q);
                                break;
                            }
                        case 5:
                            iM11750o = AbstractC5931l.m11750o(parcel, i10);
                            break;
                        case 6:
                            int iM11752q2 = AbstractC5931l.m11752q(parcel, i10);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM11752q2 == 0) {
                                iArrCreateIntArray2 = null;
                                break;
                            } else {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iM11752q2);
                                break;
                            }
                        default:
                            AbstractC5931l.m11753r(parcel, i10);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new C6820f(c6827m, zM11747l, zM11747l2, iArrCreateIntArray, iM11750o, iArrCreateIntArray2);
            case 1:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = C6821g.f32414q;
                String strM11741f = null;
                IBinder iBinderM11749n = null;
                Account account = null;
                String strM11741f2 = null;
                int iM11750o2 = 0;
                int iM11750o3 = 0;
                int iM11750o4 = 0;
                boolean zM11747l3 = false;
                int iM11750o5 = 0;
                boolean zM11747l4 = false;
                C5904d[] c5904dArr = C6821g.f32415r;
                C5904d[] c5904dArr2 = c5904dArr;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iM11750o2 = AbstractC5931l.m11750o(parcel, i11);
                            break;
                        case 2:
                            iM11750o3 = AbstractC5931l.m11750o(parcel, i11);
                            break;
                        case 3:
                            iM11750o4 = AbstractC5931l.m11750o(parcel, i11);
                            break;
                        case 4:
                            strM11741f = AbstractC5931l.m11741f(parcel, i11);
                            break;
                        case 5:
                            iBinderM11749n = AbstractC5931l.m11749n(parcel, i11);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC5931l.m11744i(parcel, i11, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = AbstractC5931l.m11738c(parcel, i11);
                            break;
                        case '\b':
                            account = (Account) AbstractC5931l.m11740e(parcel, i11, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC5931l.m11753r(parcel, i11);
                            break;
                        case '\n':
                            c5904dArr = (C5904d[]) AbstractC5931l.m11744i(parcel, i11, C5904d.CREATOR);
                            break;
                        case 11:
                            c5904dArr2 = (C5904d[]) AbstractC5931l.m11744i(parcel, i11, C5904d.CREATOR);
                            break;
                        case '\f':
                            zM11747l3 = AbstractC5931l.m11747l(parcel, i11);
                            break;
                        case '\r':
                            iM11750o5 = AbstractC5931l.m11750o(parcel, i11);
                            break;
                        case 14:
                            zM11747l4 = AbstractC5931l.m11747l(parcel, i11);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            strM11741f2 = AbstractC5931l.m11741f(parcel, i11);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new C6821g(iM11750o2, iM11750o3, iM11750o4, strM11741f, iBinderM11749n, scopeArr, bundle, account, c5904dArr, c5904dArr2, zM11747l3, iM11750o5, zM11747l4, strM11741f2);
            case 2:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7189a.f34479e;
            case 3:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7190b.f34480e;
            case 4:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7191c.f34481e;
            case 5:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7192d.f34482e;
            case 6:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7193e.f34483e;
            case 7:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7194f.f34484e;
            case 8:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7195g.f34485e;
            case 9:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7196h.f34486e;
            case 10:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7197i.f34487e;
            case 11:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7198j.f34488e;
            case 12:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7199k.f34489e;
            case 13:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C7200l.f34490e;
            case 14:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                long jM11751p = 0;
                long jM11751p2 = 0;
                int iM11750o6 = 0;
                while (parcel.dataPosition() < iM11754s3) {
                    int i12 = parcel.readInt();
                    char c2 = (char) i12;
                    if (c2 == 1) {
                        jM11751p = AbstractC5931l.m11751p(parcel, i12);
                    } else if (c2 == 2) {
                        iM11750o6 = AbstractC5931l.m11750o(parcel, i12);
                    } else if (c2 != 3) {
                        AbstractC5931l.m11753r(parcel, i12);
                    } else {
                        jM11751p2 = AbstractC5931l.m11751p(parcel, i12);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                return new C7433d(iM11750o6, jM11751p, jM11751p2);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iM11754s4 = AbstractC5931l.m11754s(parcel);
                String strM11741f3 = null;
                String strM11741f4 = null;
                j4 j4Var = null;
                String strM11741f5 = null;
                C7449t c7449t = null;
                C7449t c7449t2 = null;
                C7449t c7449t3 = null;
                long jM11751p3 = 0;
                long jM11751p4 = 0;
                long jM11751p5 = 0;
                boolean zM11747l5 = false;
                while (parcel.dataPosition() < iM11754s4) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strM11741f3 = AbstractC5931l.m11741f(parcel, i13);
                            break;
                        case 3:
                            strM11741f4 = AbstractC5931l.m11741f(parcel, i13);
                            break;
                        case 4:
                            j4Var = (j4) AbstractC5931l.m11740e(parcel, i13, j4.CREATOR);
                            break;
                        case 5:
                            jM11751p3 = AbstractC5931l.m11751p(parcel, i13);
                            break;
                        case 6:
                            zM11747l5 = AbstractC5931l.m11747l(parcel, i13);
                            break;
                        case 7:
                            strM11741f5 = AbstractC5931l.m11741f(parcel, i13);
                            break;
                        case '\b':
                            c7449t = (C7449t) AbstractC5931l.m11740e(parcel, i13, C7449t.CREATOR);
                            break;
                        case '\t':
                            jM11751p4 = AbstractC5931l.m11751p(parcel, i13);
                            break;
                        case '\n':
                            c7449t2 = (C7449t) AbstractC5931l.m11740e(parcel, i13, C7449t.CREATOR);
                            break;
                        case 11:
                            jM11751p5 = AbstractC5931l.m11751p(parcel, i13);
                            break;
                        case '\f':
                            c7449t3 = (C7449t) AbstractC5931l.m11740e(parcel, i13, C7449t.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i13);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s4);
                return new C7434e(strM11741f3, strM11741f4, j4Var, jM11751p3, zM11747l5, strM11741f5, c7449t, jM11751p4, c7449t2, jM11751p5, c7449t3);
            case 16:
                int iM11754s5 = AbstractC5931l.m11754s(parcel);
                Bundle bundleM11738c = null;
                while (parcel.dataPosition() < iM11754s5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        AbstractC5931l.m11753r(parcel, i14);
                    } else {
                        bundleM11738c = AbstractC5931l.m11738c(parcel, i14);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s5);
                return new C7438i(bundleM11738c);
            case 17:
                int iM11754s6 = AbstractC5931l.m11754s(parcel);
                Bundle bundleM11738c2 = null;
                while (parcel.dataPosition() < iM11754s6) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        AbstractC5931l.m11753r(parcel, i15);
                    } else {
                        bundleM11738c2 = AbstractC5931l.m11738c(parcel, i15);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s6);
                return new C7448s(bundleM11738c2);
            case 18:
                int iM11754s7 = AbstractC5931l.m11754s(parcel);
                long jM11751p6 = 0;
                String strM11741f6 = null;
                C7448s c7448s = null;
                String strM11741f7 = null;
                while (parcel.dataPosition() < iM11754s7) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        strM11741f6 = AbstractC5931l.m11741f(parcel, i16);
                    } else if (c10 == 3) {
                        c7448s = (C7448s) AbstractC5931l.m11740e(parcel, i16, C7448s.CREATOR);
                    } else if (c10 == 4) {
                        strM11741f7 = AbstractC5931l.m11741f(parcel, i16);
                    } else if (c10 != 5) {
                        AbstractC5931l.m11753r(parcel, i16);
                    } else {
                        jM11751p6 = AbstractC5931l.m11751p(parcel, i16);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s7);
                return new C7449t(strM11741f6, c7448s, strM11741f7, jM11751p6);
            case 19:
                int iM11754s8 = AbstractC5931l.m11754s(parcel);
                int iM11750o7 = 0;
                long jM11751p7 = 0;
                String strM11741f8 = null;
                while (parcel.dataPosition() < iM11754s8) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        strM11741f8 = AbstractC5931l.m11741f(parcel, i17);
                    } else if (c11 == 2) {
                        jM11751p7 = AbstractC5931l.m11751p(parcel, i17);
                    } else if (c11 != 3) {
                        AbstractC5931l.m11753r(parcel, i17);
                    } else {
                        iM11750o7 = AbstractC5931l.m11750o(parcel, i17);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s8);
                return new w3(strM11741f8, iM11750o7, jM11751p7);
            case 20:
                int iM11754s9 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d = null;
                String strM11741f9 = null;
                Bundle bundleM11738c3 = null;
                String strM11741f10 = null;
                long jM11751p8 = 0;
                long jM11751p9 = 0;
                int iM11750o8 = 0;
                while (parcel.dataPosition() < iM11754s9) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            jM11751p8 = AbstractC5931l.m11751p(parcel, i18);
                            break;
                        case 2:
                            bArrM11739d = AbstractC5931l.m11739d(parcel, i18);
                            break;
                        case 3:
                            strM11741f9 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        case 4:
                            bundleM11738c3 = AbstractC5931l.m11738c(parcel, i18);
                            break;
                        case 5:
                            iM11750o8 = AbstractC5931l.m11750o(parcel, i18);
                            break;
                        case 6:
                            jM11751p9 = AbstractC5931l.m11751p(parcel, i18);
                            break;
                        case 7:
                            strM11741f10 = AbstractC5931l.m11741f(parcel, i18);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i18);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s9);
                return new z3(jM11751p8, bArrM11739d, strM11741f9, bundleM11738c3, iM11750o8, jM11751p9, strM11741f10);
            case 21:
                int iM11754s10 = AbstractC5931l.m11754s(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < iM11754s10) {
                        int i19 = parcel.readInt();
                        if (((char) i19) != 1) {
                            AbstractC5931l.m11753r(parcel, i19);
                        } else {
                            int iM11752q3 = AbstractC5931l.m11752q(parcel, i19);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iM11752q3 == 0) {
                                break;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i20 = parcel.readInt();
                            for (int i21 = 0; i21 < i20; i21++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition3 + iM11752q3);
                            arrayList = arrayList2;
                        }
                    }
                    AbstractC5931l.m11746k(parcel, iM11754s10);
                    return new a4(arrayList);
                    break;
                }
            case 22:
                int iM11754s11 = AbstractC5931l.m11754s(parcel);
                ArrayList arrayListM11745j = null;
                while (parcel.dataPosition() < iM11754s11) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        AbstractC5931l.m11753r(parcel, i22);
                    } else {
                        arrayListM11745j = AbstractC5931l.m11745j(parcel, i22, z3.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s11);
                return new b4(arrayListM11745j);
            case 23:
                int iM11754s12 = AbstractC5931l.m11754s(parcel);
                String strM11741f11 = null;
                Long l9 = null;
                Float fValueOf = null;
                String strM11741f12 = null;
                String strM11741f13 = null;
                Double dValueOf = null;
                long jM11751p10 = 0;
                int iM11750o9 = 0;
                while (parcel.dataPosition() < iM11754s12) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iM11750o9 = AbstractC5931l.m11750o(parcel, i23);
                            break;
                        case 2:
                            strM11741f11 = AbstractC5931l.m11741f(parcel, i23);
                            break;
                        case 3:
                            jM11751p10 = AbstractC5931l.m11751p(parcel, i23);
                            break;
                        case 4:
                            int iM11752q4 = AbstractC5931l.m11752q(parcel, i23);
                            if (iM11752q4 == 0) {
                                lValueOf = null;
                            } else {
                                AbstractC5931l.m11755t(parcel, iM11752q4, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            l9 = lValueOf;
                            break;
                        case 5:
                            int iM11752q5 = AbstractC5931l.m11752q(parcel, i23);
                            if (iM11752q5 == 0) {
                                fValueOf = null;
                                break;
                            } else {
                                AbstractC5931l.m11755t(parcel, iM11752q5, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 6:
                            strM11741f12 = AbstractC5931l.m11741f(parcel, i23);
                            break;
                        case 7:
                            strM11741f13 = AbstractC5931l.m11741f(parcel, i23);
                            break;
                        case '\b':
                            int iM11752q6 = AbstractC5931l.m11752q(parcel, i23);
                            if (iM11752q6 == 0) {
                                dValueOf = null;
                                break;
                            } else {
                                AbstractC5931l.m11755t(parcel, iM11752q6, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            AbstractC5931l.m11753r(parcel, i23);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s12);
                return new j4(iM11750o9, strM11741f11, jM11751p10, l9, fValueOf, strM11741f12, strM11741f13, dValueOf);
            case 24:
                int iM11754s13 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l6 = false;
                int iM11750o10 = 0;
                boolean zM11747l7 = false;
                boolean zM11747l8 = false;
                int iM11750o11 = 0;
                int iM11750o12 = 0;
                long jM11751p11 = 0;
                long jM11751p12 = 0;
                long jM11751p13 = 0;
                long jM11751p14 = 0;
                long jM11751p15 = 0;
                long jM11751p16 = 0;
                long jM11751p17 = 0;
                String strM11741f14 = "";
                String strM11741f15 = strM11741f14;
                String strM11741f16 = strM11741f15;
                String strM11741f17 = strM11741f16;
                String strM11741f18 = null;
                String strM11741f19 = null;
                String strM11741f20 = null;
                String strM11741f21 = null;
                String strM11741f22 = null;
                String strM11741f23 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListM11743h = null;
                String strM11741f24 = null;
                String strM11741f25 = null;
                int iM11750o13 = 100;
                boolean zM11747l9 = true;
                boolean zM11747l10 = true;
                long jM11751p18 = -2147483648L;
                while (parcel.dataPosition() < iM11754s13) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            strM11741f18 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 3:
                            strM11741f19 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 4:
                            strM11741f20 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 5:
                            strM11741f21 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 6:
                            jM11751p11 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case 7:
                            jM11751p12 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case '\b':
                            strM11741f22 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case '\t':
                            zM11747l9 = AbstractC5931l.m11747l(parcel, i24);
                            break;
                        case '\n':
                            zM11747l6 = AbstractC5931l.m11747l(parcel, i24);
                            break;
                        case 11:
                            jM11751p18 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case '\f':
                            strM11741f23 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case BERTags.DATE_TIME /* 33 */:
                        default:
                            AbstractC5931l.m11753r(parcel, i24);
                            break;
                        case 14:
                            jM11751p13 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            iM11750o10 = AbstractC5931l.m11750o(parcel, i24);
                            break;
                        case 16:
                            zM11747l10 = AbstractC5931l.m11747l(parcel, i24);
                            break;
                        case 18:
                            zM11747l7 = AbstractC5931l.m11747l(parcel, i24);
                            break;
                        case 21:
                            int iM11752q7 = AbstractC5931l.m11752q(parcel, i24);
                            if (iM11752q7 == 0) {
                                boolValueOf = null;
                                break;
                            } else {
                                AbstractC5931l.m11755t(parcel, iM11752q7, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            }
                        case 22:
                            jM11751p14 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case 23:
                            arrayListM11743h = AbstractC5931l.m11743h(parcel, i24);
                            break;
                        case 25:
                            strM11741f14 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 26:
                            strM11741f15 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 27:
                            strM11741f24 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case 28:
                            zM11747l8 = AbstractC5931l.m11747l(parcel, i24);
                            break;
                        case 29:
                            jM11751p15 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case 30:
                            iM11750o13 = AbstractC5931l.m11750o(parcel, i24);
                            break;
                        case BERTags.DATE /* 31 */:
                            strM11741f16 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case ' ':
                            iM11750o11 = AbstractC5931l.m11750o(parcel, i24);
                            break;
                        case BERTags.DURATION /* 34 */:
                            jM11751p16 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                            strM11741f25 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case BERTags.RELATIVE_OID_IRI /* 36 */:
                            strM11741f17 = AbstractC5931l.m11741f(parcel, i24);
                            break;
                        case '%':
                            jM11751p17 = AbstractC5931l.m11751p(parcel, i24);
                            break;
                        case '&':
                            iM11750o12 = AbstractC5931l.m11750o(parcel, i24);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s13);
                return new n4(strM11741f18, strM11741f19, strM11741f20, strM11741f21, jM11751p11, jM11751p12, strM11741f22, zM11747l9, zM11747l6, jM11751p18, strM11741f23, jM11751p13, iM11750o10, zM11747l10, zM11747l7, boolValueOf, jM11751p14, arrayListM11743h, strM11741f14, strM11741f15, strM11741f24, zM11747l8, jM11751p15, iM11750o13, strM11741f16, iM11750o11, jM11751p16, strM11741f25, strM11741f17, jM11751p17, iM11750o12);
            case 25:
                int iM11754s14 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l11 = false;
                int iM11750o14 = 0;
                while (parcel.dataPosition() < iM11754s14) {
                    int i25 = parcel.readInt();
                    char c12 = (char) i25;
                    if (c12 == 1) {
                        zM11747l11 = AbstractC5931l.m11747l(parcel, i25);
                    } else if (c12 != 2) {
                        AbstractC5931l.m11753r(parcel, i25);
                    } else {
                        iM11750o14 = AbstractC5931l.m11750o(parcel, i25);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s14);
                return new C8025a(zM11747l11, iM11750o14);
            case 26:
                int iM11754s15 = AbstractC5931l.m11754s(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM11754s15) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        AbstractC5931l.m11753r(parcel, i26);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC5931l.m11740e(parcel, i26, PendingIntent.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s15);
                return new C8026b(pendingIntent);
            case 27:
                int iM11754s16 = AbstractC5931l.m11754s(parcel);
                int iM11750o15 = 0;
                boolean zM11747l12 = false;
                while (parcel.dataPosition() < iM11754s16) {
                    int i27 = parcel.readInt();
                    char c13 = (char) i27;
                    if (c13 == 1) {
                        iM11750o15 = AbstractC5931l.m11750o(parcel, i27);
                    } else if (c13 != 2) {
                        AbstractC5931l.m11753r(parcel, i27);
                    } else {
                        zM11747l12 = AbstractC5931l.m11747l(parcel, i27);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s16);
                return new C8027c(iM11750o15, zM11747l12);
            case 28:
                int iM11754s17 = AbstractC5931l.m11754s(parcel);
                Intent intent = null;
                int iM11750o16 = 0;
                int iM11750o17 = 0;
                while (parcel.dataPosition() < iM11754s17) {
                    int i28 = parcel.readInt();
                    char c14 = (char) i28;
                    if (c14 == 1) {
                        iM11750o16 = AbstractC5931l.m11750o(parcel, i28);
                    } else if (c14 == 2) {
                        iM11750o17 = AbstractC5931l.m11750o(parcel, i28);
                    } else if (c14 != 3) {
                        AbstractC5931l.m11753r(parcel, i28);
                    } else {
                        intent = (Intent) AbstractC5931l.m11740e(parcel, i28, Intent.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s17);
                return new C8029b(iM11750o16, iM11750o17, intent);
            default:
                int iM11754s18 = AbstractC5931l.m11754s(parcel);
                ArrayList arrayListM11743h2 = null;
                String strM11741f26 = null;
                while (parcel.dataPosition() < iM11754s18) {
                    int i29 = parcel.readInt();
                    char c15 = (char) i29;
                    if (c15 == 1) {
                        arrayListM11743h2 = AbstractC5931l.m11743h(parcel, i29);
                    } else if (c15 != 2) {
                        AbstractC5931l.m11753r(parcel, i29);
                    } else {
                        strM11741f26 = AbstractC5931l.m11741f(parcel, i29);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s18);
                return new C8032e(strM11741f26, arrayListM11743h2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f32430a) {
            case 0:
                return new C6820f[i10];
            case 1:
                return new C6821g[i10];
            case 2:
                return new C7189a[i10];
            case 3:
                return new C7190b[i10];
            case 4:
                return new C7191c[i10];
            case 5:
                return new C7192d[i10];
            case 6:
                return new C7193e[i10];
            case 7:
                return new C7194f[i10];
            case 8:
                return new C7195g[i10];
            case 9:
                return new C7196h[i10];
            case 10:
                return new C7197i[i10];
            case 11:
                return new C7198j[i10];
            case 12:
                return new C7199k[i10];
            case 13:
                return new C7200l[i10];
            case 14:
                return new C7433d[i10];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C7434e[i10];
            case 16:
                return new C7438i[i10];
            case 17:
                return new C7448s[i10];
            case 18:
                return new C7449t[i10];
            case 19:
                return new w3[i10];
            case 20:
                return new z3[i10];
            case 21:
                return new a4[i10];
            case 22:
                return new b4[i10];
            case 23:
                return new j4[i10];
            case 24:
                return new n4[i10];
            case 25:
                return new C8025a[i10];
            case 26:
                return new C8026b[i10];
            case 27:
                return new C8027c[i10];
            case 28:
                return new C8029b[i10];
            default:
                return new C8032e[i10];
        }
    }
}
