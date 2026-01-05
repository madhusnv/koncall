package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC7149a {
    public static final Parcelable.Creator<f0> CREATOR = new C1316f(19);

    /* renamed from: a */
    public final int f6525a;

    /* renamed from: b */
    public final int f6526b;

    /* renamed from: c */
    public final int f6527c;

    /* renamed from: d */
    public final int f6528d;

    /* renamed from: e */
    public final long f6529e;

    public f0(int i10, int i11, int i12, int i13, long j6) {
        this.f6525a = i10;
        this.f6526b = i11;
        this.f6527c = i12;
        this.f6528d = i13;
        this.f6529e = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6525a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f6526b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f6527c);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f6528d);
        AbstractC5932m.m11785m(parcel, 5, 8);
        parcel.writeLong(this.f6529e);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
