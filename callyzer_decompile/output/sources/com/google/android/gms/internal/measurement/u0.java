package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends AbstractC7149a {
    public static final Parcelable.Creator<u0> CREATOR = new v0(0);

    /* renamed from: a */
    public final long f6402a;

    /* renamed from: b */
    public final long f6403b;

    /* renamed from: c */
    public final boolean f6404c;

    /* renamed from: d */
    public final Bundle f6405d;

    /* renamed from: e */
    public final String f6406e;

    public u0(long j6, long j10, boolean z6, Bundle bundle, String str) {
        this.f6402a = j6;
        this.f6403b = j10;
        this.f6404c = z6;
        this.f6405d = bundle;
        this.f6406e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 8);
        parcel.writeLong(this.f6402a);
        AbstractC5932m.m11785m(parcel, 2, 8);
        parcel.writeLong(this.f6403b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f6404c ? 1 : 0);
        AbstractC5932m.m11774b(parcel, 7, this.f6405d);
        AbstractC5932m.m11778f(parcel, 8, this.f6406e);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
