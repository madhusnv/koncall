package mf;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import nf.C5039a;
import pg.AbstractC5931l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mf.d */
/* loaded from: classes.dex */
public final class C4721d implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f23623a;

    public /* synthetic */ C4721d(int i10) {
        this.f23623a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f23623a) {
            case 0:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                String strM11741f = null;
                String strM11741f2 = null;
                String strM11741f3 = null;
                String strM11741f4 = null;
                Uri uri = null;
                String strM11741f5 = null;
                String strM11741f6 = null;
                ArrayList arrayListM11745j = null;
                String strM11741f7 = null;
                String strM11741f8 = null;
                long jM11751p = 0;
                int iM11750o = 0;
                while (parcel.dataPosition() < iM11754s) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iM11750o = AbstractC5931l.m11750o(parcel, i10);
                            break;
                        case 2:
                            strM11741f = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case 3:
                            strM11741f2 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case 4:
                            strM11741f3 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case 5:
                            strM11741f4 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case 6:
                            uri = (Uri) AbstractC5931l.m11740e(parcel, i10, Uri.CREATOR);
                            break;
                        case 7:
                            strM11741f5 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case '\b':
                            jM11751p = AbstractC5931l.m11751p(parcel, i10);
                            break;
                        case '\t':
                            strM11741f6 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case '\n':
                            arrayListM11745j = AbstractC5931l.m11745j(parcel, i10, Scope.CREATOR);
                            break;
                        case 11:
                            strM11741f7 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        case '\f':
                            strM11741f8 = AbstractC5931l.m11741f(parcel, i10);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i10);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new GoogleSignInAccount(iM11750o, strM11741f, strM11741f2, strM11741f3, strM11741f4, uri, strM11741f5, jM11751p, strM11741f6, arrayListM11745j, strM11741f7, strM11741f8);
            case 1:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                ArrayList arrayListM11745j2 = null;
                ArrayList arrayListM11745j3 = null;
                Account account = null;
                String strM11741f9 = null;
                String strM11741f10 = null;
                String strM11741f11 = null;
                int iM11750o2 = 0;
                boolean zM11747l = false;
                boolean zM11747l2 = false;
                boolean zM11747l3 = false;
                while (parcel.dataPosition() < iM11754s2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iM11750o2 = AbstractC5931l.m11750o(parcel, i11);
                            break;
                        case 2:
                            arrayListM11745j3 = AbstractC5931l.m11745j(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) AbstractC5931l.m11740e(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zM11747l = AbstractC5931l.m11747l(parcel, i11);
                            break;
                        case 5:
                            zM11747l2 = AbstractC5931l.m11747l(parcel, i11);
                            break;
                        case 6:
                            zM11747l3 = AbstractC5931l.m11747l(parcel, i11);
                            break;
                        case 7:
                            strM11741f9 = AbstractC5931l.m11741f(parcel, i11);
                            break;
                        case '\b':
                            strM11741f10 = AbstractC5931l.m11741f(parcel, i11);
                            break;
                        case '\t':
                            arrayListM11745j2 = AbstractC5931l.m11745j(parcel, i11, C5039a.CREATOR);
                            break;
                        case '\n':
                            strM11741f11 = AbstractC5931l.m11741f(parcel, i11);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i11);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new GoogleSignInOptions(iM11750o2, arrayListM11745j3, account, zM11747l, zM11747l2, zM11747l3, strM11741f9, strM11741f10, GoogleSignInOptions.m3088c(arrayListM11745j2), strM11741f11);
            default:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                String strM11741f12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strM11741f13 = "";
                while (parcel.dataPosition() < iM11754s3) {
                    int i12 = parcel.readInt();
                    char c2 = (char) i12;
                    if (c2 == 4) {
                        strM11741f12 = AbstractC5931l.m11741f(parcel, i12);
                    } else if (c2 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC5931l.m11740e(parcel, i12, GoogleSignInAccount.CREATOR);
                    } else if (c2 != '\b') {
                        AbstractC5931l.m11753r(parcel, i12);
                    } else {
                        strM11741f13 = AbstractC5931l.m11741f(parcel, i12);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                return new SignInAccount(strM11741f12, googleSignInAccount, strM11741f13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f23623a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
