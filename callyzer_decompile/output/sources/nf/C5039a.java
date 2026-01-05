package nf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import lf.C4462m;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.a */
/* loaded from: classes.dex */
public final class C5039a extends AbstractC7149a {
    public static final Parcelable.Creator<C5039a> CREATOR = new C4462m(9);

    /* renamed from: a */
    public final int f24796a;

    /* renamed from: b */
    public final int f24797b;

    /* renamed from: c */
    public final Bundle f24798c;

    public C5039a(int i10, int i11, Bundle bundle) {
        this.f24796a = i10;
        this.f24797b = i11;
        this.f24798c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f24796a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f24797b);
        AbstractC5932m.m11774b(parcel, 3, this.f24798c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
