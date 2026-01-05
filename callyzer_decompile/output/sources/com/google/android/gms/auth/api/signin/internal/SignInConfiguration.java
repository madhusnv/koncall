package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import lf.C4462m;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC7149a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C4462m(10);

    /* renamed from: a */
    public final String f5989a;

    /* renamed from: b */
    public final GoogleSignInOptions f5990b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        AbstractC6840z.m13033d(str);
        this.f5989a = str;
        this.f5990b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.f5990b;
        if (this.f5989a.equals(signInConfiguration.f5989a)) {
            GoogleSignInOptions googleSignInOptions2 = this.f5990b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1 * 31;
        String str = this.f5989a;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f5990b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f5989a);
        AbstractC5932m.m11777e(parcel, 5, this.f5990b, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
