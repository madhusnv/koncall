package ug;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w3 extends AbstractC7149a {
    public static final Parcelable.Creator<w3> CREATOR = new sf.g0(19);

    /* renamed from: a */
    public final String f35892a;

    /* renamed from: b */
    public final long f35893b;

    /* renamed from: c */
    public final int f35894c;

    public w3(String str, int i10, long j6) {
        this.f35892a = str;
        this.f35893b = j6;
        this.f35894c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f35892a);
        AbstractC5932m.m11785m(parcel, 2, 8);
        parcel.writeLong(this.f35893b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f35894c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
