package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g */
/* loaded from: classes.dex */
public final class C1317g extends AbstractC7149a {
    public static final Parcelable.Creator<C1317g> CREATOR = new C1316f(0);

    /* renamed from: a */
    public final int f6534a;

    /* renamed from: b */
    public final String[] f6535b;

    public C1317g(String[] strArr, int i10) {
        this.f6534a = i10;
        this.f6535b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6534a);
        AbstractC5932m.m11779g(parcel, 2, this.f6535b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
