package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q */
/* loaded from: classes.dex */
public final class C1327q extends AbstractC7149a {
    public static final Parcelable.Creator<C1327q> CREATOR = new C1316f(17);

    /* renamed from: a */
    public final String f6632a;

    /* renamed from: b */
    public final String f6633b;

    public C1327q(String str, String str2) {
        this.f6632a = str;
        this.f6633b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f6632a);
        AbstractC5932m.m11778f(parcel, 2, this.f6633b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
