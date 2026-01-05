package lf;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import gg.C2597l;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4792c;
import nf.C5039a;
import om.C5414p;
import org.bouncycastle.iana.AEADAlgorithm;
import pf.C5902b;
import pf.C5904d;
import pf.C5917q;
import pg.AbstractC5931l;
import ps.C6001a;
import ps.C6002b;
import ps.C6003c;
import ps.C6004d;
import ps.C6005e;
import ps.C6006f;
import sf.C6820f;
import sf.C6825k;
import sf.C6827m;
import sf.C6828n;
import sf.C6832r;
import sf.C6833s;
import sf.f0;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.m */
/* loaded from: classes.dex */
public final class C4462m implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f22225a;

    public /* synthetic */ C4462m(int i10) {
        this.f22225a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f22225a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                boolean zM11747l = false;
                boolean zM11747l2 = false;
                boolean zM11747l3 = false;
                String strM11741f = null;
                String strM11741f2 = null;
                String strM11741f3 = null;
                ArrayList arrayListM11743h = null;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            zM11747l = AbstractC5931l.m11747l(parcel, i10);
                            break;
                        case 2:
                            strM11741f = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case 3:
                            strM11741f2 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case 4:
                            zM11747l2 = AbstractC5931l.m11747l(parcel, i10);
                            break;
                        case 5:
                            strM11741f3 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case 6:
                            arrayListM11743h = AbstractC5931l.m11743h(parcel, i10);
                            break;
                        case 7:
                            zM11747l3 = AbstractC5931l.m11747l(parcel, i10);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i10);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new C4450a(zM11747l, strM11741f, strM11741f2, zM11747l2, strM11741f3, arrayListM11743h, zM11747l3);
            case 1:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                String strM11741f4 = null;
                boolean zM11747l4 = false;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    char c2 = (char) i11;
                    if (c2 == 1) {
                        zM11747l4 = AbstractC5931l.m11747l(parcel, i11);
                    } else if (c2 != 2) {
                        AbstractC5931l.m11753r(parcel, i11);
                    } else {
                        strM11741f4 = AbstractC5931l.m11741f(parcel, i11);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new C4451b(zM11747l4, strM11741f4);
            case 2:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d = null;
                boolean zM11747l5 = false;
                String strM11741f5 = null;
                while (parcel.dataPosition() < iM11754s3) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        zM11747l5 = AbstractC5931l.m11747l(parcel, i12);
                    } else if (c10 == 2) {
                        bArrM11739d = AbstractC5931l.m11739d(parcel, i12);
                    } else if (c10 != 3) {
                        AbstractC5931l.m11753r(parcel, i12);
                    } else {
                        strM11741f5 = AbstractC5931l.m11741f(parcel, i12);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                return new C4452c(strM11741f5, zM11747l5, bArrM11739d);
            case 3:
                int iM11754s4 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l6 = false;
                while (parcel.dataPosition() < iM11754s4) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        AbstractC5931l.m11753r(parcel, i13);
                    } else {
                        zM11747l6 = AbstractC5931l.m11747l(parcel, i13);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s4);
                return new C4453d(zM11747l6);
            case 4:
                int iM11754s5 = AbstractC5931l.m11754s(parcel);
                int iM11750o = 0;
                C4460k c4460k = null;
                String strM11741f6 = null;
                while (parcel.dataPosition() < iM11754s5) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        c4460k = (C4460k) AbstractC5931l.m11740e(parcel, i14, C4460k.CREATOR);
                    } else if (c11 == 2) {
                        strM11741f6 = AbstractC5931l.m11741f(parcel, i14);
                    } else if (c11 != 3) {
                        AbstractC5931l.m11753r(parcel, i14);
                    } else {
                        iM11750o = AbstractC5931l.m11750o(parcel, i14);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s5);
                return new C4457h(c4460k, strM11741f6, iM11750o);
            case 5:
                int iM11754s6 = AbstractC5931l.m11754s(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM11754s6) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        AbstractC5931l.m11753r(parcel, i15);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC5931l.m11740e(parcel, i15, PendingIntent.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s6);
                return new C4458i(pendingIntent);
            case 6:
                int iM11754s7 = AbstractC5931l.m11754s(parcel);
                String strM11741f7 = null;
                String strM11741f8 = null;
                String strM11741f9 = null;
                String strM11741f10 = null;
                Uri uri = null;
                String strM11741f11 = null;
                String strM11741f12 = null;
                String strM11741f13 = null;
                C2597l c2597l = null;
                while (parcel.dataPosition() < iM11754s7) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strM11741f7 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 2:
                            strM11741f8 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 3:
                            strM11741f9 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 4:
                            strM11741f10 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 5:
                            uri = (Uri) AbstractC5931l.m11740e(parcel, i16, Uri.CREATOR);
                            break;
                        case 6:
                            strM11741f11 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case 7:
                            strM11741f12 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case '\b':
                            strM11741f13 = AbstractC5931l.m11741f(parcel, i16);
                            break;
                        case '\t':
                            c2597l = (C2597l) AbstractC5931l.m11740e(parcel, i16, C2597l.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i16);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s7);
                return new C4459j(strM11741f7, strM11741f8, strM11741f9, strM11741f10, uri, strM11741f11, strM11741f12, strM11741f13, c2597l);
            case 7:
                int iM11754s8 = AbstractC5931l.m11754s(parcel);
                String strM11741f14 = null;
                String strM11741f15 = null;
                while (parcel.dataPosition() < iM11754s8) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        strM11741f14 = AbstractC5931l.m11741f(parcel, i17);
                    } else if (c12 != 2) {
                        AbstractC5931l.m11753r(parcel, i17);
                    } else {
                        strM11741f15 = AbstractC5931l.m11741f(parcel, i17);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s8);
                return new C4460k(strM11741f14, strM11741f15);
            case 8:
                AbstractC4154l.m8923f(parcel, "parcel");
                return new C4792c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : EnumC8994d.valueOf(parcel.readString()), (LocalDateTime) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong());
            case 9:
                int iM11754s9 = AbstractC5931l.m11754s(parcel);
                Bundle bundleM11738c = null;
                int iM11750o2 = 0;
                int iM11750o3 = 0;
                while (parcel.dataPosition() < iM11754s9) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        iM11750o2 = AbstractC5931l.m11750o(parcel, i18);
                    } else if (c13 == 2) {
                        iM11750o3 = AbstractC5931l.m11750o(parcel, i18);
                    } else if (c13 != 3) {
                        AbstractC5931l.m11753r(parcel, i18);
                    } else {
                        bundleM11738c = AbstractC5931l.m11738c(parcel, i18);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s9);
                return new C5039a(iM11750o2, iM11750o3, bundleM11738c);
            case 10:
                int iM11754s10 = AbstractC5931l.m11754s(parcel);
                String strM11741f16 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iM11754s10) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 2) {
                        strM11741f16 = AbstractC5931l.m11741f(parcel, i19);
                    } else if (c14 != 5) {
                        AbstractC5931l.m11753r(parcel, i19);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) AbstractC5931l.m11740e(parcel, i19, GoogleSignInOptions.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s10);
                return new SignInConfiguration(strM11741f16, googleSignInOptions);
            case 11:
                AbstractC4154l.m8923f(parcel, "parcel");
                return new C5414p(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), EnumC8994d.valueOf(parcel.readString()), (LocalDateTime) parcel.readSerializable(), parcel.readLong(), parcel.readString());
            case 12:
                int iM11754s11 = AbstractC5931l.m11754s(parcel);
                PendingIntent pendingIntent2 = null;
                int iM11750o4 = 0;
                int iM11750o5 = 0;
                String strM11741f17 = null;
                while (parcel.dataPosition() < iM11754s11) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iM11750o4 = AbstractC5931l.m11750o(parcel, i20);
                    } else if (c15 == 2) {
                        iM11750o5 = AbstractC5931l.m11750o(parcel, i20);
                    } else if (c15 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC5931l.m11740e(parcel, i20, PendingIntent.CREATOR);
                    } else if (c15 != 4) {
                        AbstractC5931l.m11753r(parcel, i20);
                    } else {
                        strM11741f17 = AbstractC5931l.m11741f(parcel, i20);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s11);
                return new C5902b(iM11750o4, iM11750o5, pendingIntent2, strM11741f17);
            case 13:
                int iM11754s12 = AbstractC5931l.m11754s(parcel);
                long jM11751p = -1;
                int iM11750o6 = 0;
                String strM11741f18 = null;
                while (parcel.dataPosition() < iM11754s12) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 1) {
                        strM11741f18 = AbstractC5931l.m11741f(parcel, i21);
                    } else if (c16 == 2) {
                        iM11750o6 = AbstractC5931l.m11750o(parcel, i21);
                    } else if (c16 != 3) {
                        AbstractC5931l.m11753r(parcel, i21);
                    } else {
                        jM11751p = AbstractC5931l.m11751p(parcel, i21);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s12);
                return new C5904d(strM11741f18, iM11750o6, jM11751p);
            case 14:
                int iM11754s13 = AbstractC5931l.m11754s(parcel);
                boolean zM11747l7 = false;
                int iM11750o7 = 0;
                String strM11741f19 = null;
                int iM11750o8 = 0;
                while (parcel.dataPosition() < iM11754s13) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 1) {
                        zM11747l7 = AbstractC5931l.m11747l(parcel, i22);
                    } else if (c17 == 2) {
                        strM11741f19 = AbstractC5931l.m11741f(parcel, i22);
                    } else if (c17 == 3) {
                        iM11750o8 = AbstractC5931l.m11750o(parcel, i22);
                    } else if (c17 != 4) {
                        AbstractC5931l.m11753r(parcel, i22);
                    } else {
                        iM11750o7 = AbstractC5931l.m11750o(parcel, i22);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s13);
                return new C5917q(strM11741f19, iM11750o8, iM11750o7, zM11747l7);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                AbstractC4154l.m8923f(parcel, "parcel");
                return new C6001a(parcel.readInt(), parcel.readString(), parcel.readInt());
            case 16:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C6002b.f29332c;
            case 17:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C6003c.f29336c;
            case 18:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C6004d.f29341c;
            case 19:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C6005e.f29347c;
            case 20:
                AbstractC4154l.m8923f(parcel, "parcel");
                parcel.readInt();
                return C6006f.f29354c;
            case 21:
                int iM11754s14 = AbstractC5931l.m11754s(parcel);
                String strM11741f20 = null;
                int iM11750o9 = 0;
                while (parcel.dataPosition() < iM11754s14) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        iM11750o9 = AbstractC5931l.m11750o(parcel, i23);
                    } else if (c18 != 2) {
                        AbstractC5931l.m11753r(parcel, i23);
                    } else {
                        strM11741f20 = AbstractC5931l.m11741f(parcel, i23);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s14);
                return new Scope(iM11750o9, strM11741f20);
            case 22:
                int iM11754s15 = AbstractC5931l.m11754s(parcel);
                String strM11741f21 = null;
                C5902b c5902b = null;
                int iM11750o10 = 0;
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iM11754s15) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        iM11750o10 = AbstractC5931l.m11750o(parcel, i24);
                    } else if (c19 == 2) {
                        strM11741f21 = AbstractC5931l.m11741f(parcel, i24);
                    } else if (c19 == 3) {
                        pendingIntent3 = (PendingIntent) AbstractC5931l.m11740e(parcel, i24, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        AbstractC5931l.m11753r(parcel, i24);
                    } else {
                        c5902b = (C5902b) AbstractC5931l.m11740e(parcel, i24, C5902b.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s15);
                return new Status(iM11750o10, strM11741f21, pendingIntent3, c5902b);
            case 23:
                return new ParcelImpl(parcel);
            case 24:
                int iM11754s16 = AbstractC5931l.m11754s(parcel);
                ArrayList arrayListM11745j = null;
                int iM11750o11 = 0;
                while (parcel.dataPosition() < iM11754s16) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        iM11750o11 = AbstractC5931l.m11750o(parcel, i25);
                    } else if (c20 != 2) {
                        AbstractC5931l.m11753r(parcel, i25);
                    } else {
                        arrayListM11745j = AbstractC5931l.m11745j(parcel, i25, C6825k.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s16);
                return new C6828n(arrayListM11745j, iM11750o11);
            case 25:
                int iM11754s17 = AbstractC5931l.m11754s(parcel);
                int iM11750o12 = -1;
                int iM11750o13 = 0;
                int iM11750o14 = 0;
                int iM11750o15 = 0;
                int iM11750o16 = 0;
                String strM11741f22 = null;
                String strM11741f23 = null;
                long jM11751p2 = 0;
                long jM11751p3 = 0;
                while (parcel.dataPosition() < iM11754s17) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iM11750o13 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 2:
                            iM11750o14 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 3:
                            iM11750o15 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case 4:
                            jM11751p2 = AbstractC5931l.m11751p(parcel, i26);
                            break;
                        case 5:
                            jM11751p3 = AbstractC5931l.m11751p(parcel, i26);
                            break;
                        case 6:
                            strM11741f22 = AbstractC5931l.m11741f(parcel, i26);
                            break;
                        case 7:
                            strM11741f23 = AbstractC5931l.m11741f(parcel, i26);
                            break;
                        case '\b':
                            iM11750o16 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        case '\t':
                            iM11750o12 = AbstractC5931l.m11750o(parcel, i26);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i26);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s17);
                return new C6825k(iM11750o13, iM11750o14, iM11750o15, jM11751p2, jM11751p3, strM11741f22, strM11741f23, iM11750o16, iM11750o12);
            case 26:
                int iM11754s18 = AbstractC5931l.m11754s(parcel);
                Account account = null;
                int iM11750o17 = 0;
                int iM11750o18 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM11754s18) {
                    int i27 = parcel.readInt();
                    char c21 = (char) i27;
                    if (c21 == 1) {
                        iM11750o17 = AbstractC5931l.m11750o(parcel, i27);
                    } else if (c21 == 2) {
                        account = (Account) AbstractC5931l.m11740e(parcel, i27, Account.CREATOR);
                    } else if (c21 == 3) {
                        iM11750o18 = AbstractC5931l.m11750o(parcel, i27);
                    } else if (c21 != 4) {
                        AbstractC5931l.m11753r(parcel, i27);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC5931l.m11740e(parcel, i27, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s18);
                return new C6832r(iM11750o17, account, iM11750o18, googleSignInAccount);
            case 27:
                int iM11754s19 = AbstractC5931l.m11754s(parcel);
                int iM11750o19 = 0;
                boolean zM11747l8 = false;
                boolean zM11747l9 = false;
                IBinder iBinderM11749n = null;
                C5902b c5902b2 = null;
                while (parcel.dataPosition() < iM11754s19) {
                    int i28 = parcel.readInt();
                    char c22 = (char) i28;
                    if (c22 == 1) {
                        iM11750o19 = AbstractC5931l.m11750o(parcel, i28);
                    } else if (c22 == 2) {
                        iBinderM11749n = AbstractC5931l.m11749n(parcel, i28);
                    } else if (c22 == 3) {
                        c5902b2 = (C5902b) AbstractC5931l.m11740e(parcel, i28, C5902b.CREATOR);
                    } else if (c22 == 4) {
                        zM11747l8 = AbstractC5931l.m11747l(parcel, i28);
                    } else if (c22 != 5) {
                        AbstractC5931l.m11753r(parcel, i28);
                    } else {
                        zM11747l9 = AbstractC5931l.m11747l(parcel, i28);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s19);
                return new C6833s(iM11750o19, iBinderM11749n, c5902b2, zM11747l8, zM11747l9);
            case 28:
                int iM11754s20 = AbstractC5931l.m11754s(parcel);
                int iM11750o20 = 0;
                boolean zM11747l10 = false;
                boolean zM11747l11 = false;
                int iM11750o21 = 0;
                int iM11750o22 = 0;
                while (parcel.dataPosition() < iM11754s20) {
                    int i29 = parcel.readInt();
                    char c23 = (char) i29;
                    if (c23 == 1) {
                        iM11750o20 = AbstractC5931l.m11750o(parcel, i29);
                    } else if (c23 == 2) {
                        zM11747l10 = AbstractC5931l.m11747l(parcel, i29);
                    } else if (c23 == 3) {
                        zM11747l11 = AbstractC5931l.m11747l(parcel, i29);
                    } else if (c23 == 4) {
                        iM11750o21 = AbstractC5931l.m11750o(parcel, i29);
                    } else if (c23 != 5) {
                        AbstractC5931l.m11753r(parcel, i29);
                    } else {
                        iM11750o22 = AbstractC5931l.m11750o(parcel, i29);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s20);
                return new C6827m(iM11750o20, zM11747l10, zM11747l11, iM11750o21, iM11750o22);
            default:
                int iM11754s21 = AbstractC5931l.m11754s(parcel);
                Bundle bundleM11738c2 = null;
                C6820f c6820f = null;
                int iM11750o23 = 0;
                C5904d[] c5904dArr = null;
                while (parcel.dataPosition() < iM11754s21) {
                    int i30 = parcel.readInt();
                    char c24 = (char) i30;
                    if (c24 == 1) {
                        bundleM11738c2 = AbstractC5931l.m11738c(parcel, i30);
                    } else if (c24 == 2) {
                        c5904dArr = (C5904d[]) AbstractC5931l.m11744i(parcel, i30, C5904d.CREATOR);
                    } else if (c24 == 3) {
                        iM11750o23 = AbstractC5931l.m11750o(parcel, i30);
                    } else if (c24 != 4) {
                        AbstractC5931l.m11753r(parcel, i30);
                    } else {
                        c6820f = (C6820f) AbstractC5931l.m11740e(parcel, i30, C6820f.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s21);
                f0 f0Var = new f0();
                f0Var.f32410a = bundleM11738c2;
                f0Var.f32411b = c5904dArr;
                f0Var.f32412c = iM11750o23;
                f0Var.f32413d = c6820f;
                return f0Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f22225a) {
            case 0:
                return new C4450a[i10];
            case 1:
                return new C4451b[i10];
            case 2:
                return new C4452c[i10];
            case 3:
                return new C4453d[i10];
            case 4:
                return new C4457h[i10];
            case 5:
                return new C4458i[i10];
            case 6:
                return new C4459j[i10];
            case 7:
                return new C4460k[i10];
            case 8:
                return new C4792c[i10];
            case 9:
                return new C5039a[i10];
            case 10:
                return new SignInConfiguration[i10];
            case 11:
                return new C5414p[i10];
            case 12:
                return new C5902b[i10];
            case 13:
                return new C5904d[i10];
            case 14:
                return new C5917q[i10];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C6001a[i10];
            case 16:
                return new C6002b[i10];
            case 17:
                return new C6003c[i10];
            case 18:
                return new C6004d[i10];
            case 19:
                return new C6005e[i10];
            case 20:
                return new C6006f[i10];
            case 21:
                return new Scope[i10];
            case 22:
                return new Status[i10];
            case 23:
                return new ParcelImpl[i10];
            case 24:
                return new C6828n[i10];
            case 25:
                return new C6825k[i10];
            case 26:
                return new C6832r[i10];
            case 27:
                return new C6833s[i10];
            case 28:
                return new C6827m[i10];
            default:
                return new f0[i10];
        }
    }
}
