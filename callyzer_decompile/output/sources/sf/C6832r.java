package sf;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import lf.C4462m;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.r */
/* loaded from: classes.dex */
public final class C6832r extends AbstractC7149a {
    public static final Parcelable.Creator<C6832r> CREATOR = new C4462m(26);

    /* renamed from: a */
    public final int f32483a;

    /* renamed from: b */
    public final Account f32484b;

    /* renamed from: c */
    public final int f32485c;

    /* renamed from: d */
    public final GoogleSignInAccount f32486d;

    public C6832r(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f32483a = i10;
        this.f32484b = account;
        this.f32485c = i11;
        this.f32486d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f32483a);
        AbstractC5932m.m11777e(parcel, 2, this.f32484b, i10);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f32485c);
        AbstractC5932m.m11777e(parcel, 4, this.f32486d, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
