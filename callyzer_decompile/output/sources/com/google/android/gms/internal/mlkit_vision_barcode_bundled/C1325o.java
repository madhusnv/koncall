package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o */
/* loaded from: classes.dex */
public final class C1325o extends AbstractC7149a {
    public static final Parcelable.Creator<C1325o> CREATOR = new C1316f(15);

    /* renamed from: a */
    public final int f6621a;

    /* renamed from: b */
    public final String f6622b;

    public C1325o(int i10, String str) {
        this.f6621a = i10;
        this.f6622b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6621a);
        AbstractC5932m.m11778f(parcel, 2, this.f6622b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
