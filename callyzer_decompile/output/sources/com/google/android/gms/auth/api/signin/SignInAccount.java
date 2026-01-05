package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import mf.C4721d;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SignInAccount extends AbstractC7149a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C4721d(2);

    /* renamed from: a */
    public final String f5986a;

    /* renamed from: b */
    public final GoogleSignInAccount f5987b;

    /* renamed from: c */
    public final String f5988c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5987b = googleSignInAccount;
        AbstractC6840z.m13034e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5986a = str;
        AbstractC6840z.m13034e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f5988c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 4, this.f5986a);
        AbstractC5932m.m11777e(parcel, 7, this.f5987b, i10);
        AbstractC5932m.m11778f(parcel, 8, this.f5988c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
