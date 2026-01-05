package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u */
/* loaded from: classes.dex */
public final class C1331u extends AbstractC7149a {
    public static final Parcelable.Creator<C1331u> CREATOR = new C1316f(2);

    /* renamed from: a */
    public final int f6667a;

    /* renamed from: b */
    public final boolean f6668b;

    public C1331u(int i10, boolean z6) {
        this.f6667a = i10;
        this.f6668b = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6667a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f6668b ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
