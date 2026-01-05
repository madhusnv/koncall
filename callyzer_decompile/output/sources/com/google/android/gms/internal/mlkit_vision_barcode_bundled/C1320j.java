package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j */
/* loaded from: classes.dex */
public final class C1320j extends AbstractC7149a {
    public static final Parcelable.Creator<C1320j> CREATOR = new C1316f(7);

    /* renamed from: a */
    public final C1324n f6567a;

    /* renamed from: b */
    public final String f6568b;

    /* renamed from: c */
    public final String f6569c;

    /* renamed from: d */
    public final C1325o[] f6570d;

    /* renamed from: e */
    public final C1322l[] f6571e;

    /* renamed from: f */
    public final String[] f6572f;

    /* renamed from: g */
    public final C1317g[] f6573g;

    public C1320j(C1324n c1324n, String str, String str2, C1325o[] c1325oArr, C1322l[] c1322lArr, String[] strArr, C1317g[] c1317gArr) {
        this.f6567a = c1324n;
        this.f6568b = str;
        this.f6569c = str2;
        this.f6570d = c1325oArr;
        this.f6571e = c1322lArr;
        this.f6572f = strArr;
        this.f6573g = c1317gArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f6567a, i10);
        AbstractC5932m.m11778f(parcel, 2, this.f6568b);
        AbstractC5932m.m11778f(parcel, 3, this.f6569c);
        AbstractC5932m.m11781i(parcel, 4, this.f6570d, i10);
        AbstractC5932m.m11781i(parcel, 5, this.f6571e, i10);
        AbstractC5932m.m11779g(parcel, 6, this.f6572f);
        AbstractC5932m.m11781i(parcel, 7, this.f6573g, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
