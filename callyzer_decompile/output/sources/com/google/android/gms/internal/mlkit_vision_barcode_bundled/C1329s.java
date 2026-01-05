package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s */
/* loaded from: classes.dex */
public final class C1329s extends AbstractC7149a {
    public static final Parcelable.Creator<C1329s> CREATOR = new C1316f(1);

    /* renamed from: a */
    public final int f6644a;

    /* renamed from: b */
    public final String f6645b;

    /* renamed from: c */
    public final String f6646c;

    /* renamed from: d */
    public final byte[] f6647d;

    /* renamed from: e */
    public final Point[] f6648e;

    /* renamed from: f */
    public final int f6649f;

    /* renamed from: g */
    public final C1322l f6650g;

    /* renamed from: h */
    public final C1325o f6651h;

    /* renamed from: j */
    public final C1326p f6652j;

    /* renamed from: k */
    public final C1328r f6653k;

    /* renamed from: l */
    public final C1327q f6654l;

    /* renamed from: m */
    public final C1323m f6655m;

    /* renamed from: n */
    public final C1319i f6656n;

    /* renamed from: p */
    public final C1320j f6657p;

    /* renamed from: q */
    public final C1321k f6658q;

    public C1329s(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, C1322l c1322l, C1325o c1325o, C1326p c1326p, C1328r c1328r, C1327q c1327q, C1323m c1323m, C1319i c1319i, C1320j c1320j, C1321k c1321k) {
        this.f6644a = i10;
        this.f6645b = str;
        this.f6646c = str2;
        this.f6647d = bArr;
        this.f6648e = pointArr;
        this.f6649f = i11;
        this.f6650g = c1322l;
        this.f6651h = c1325o;
        this.f6652j = c1326p;
        this.f6653k = c1328r;
        this.f6654l = c1327q;
        this.f6655m = c1323m;
        this.f6656n = c1319i;
        this.f6657p = c1320j;
        this.f6658q = c1321k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6644a);
        AbstractC5932m.m11778f(parcel, 2, this.f6645b);
        AbstractC5932m.m11778f(parcel, 3, this.f6646c);
        AbstractC5932m.m11775c(parcel, 4, this.f6647d);
        AbstractC5932m.m11781i(parcel, 5, this.f6648e, i10);
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(this.f6649f);
        AbstractC5932m.m11777e(parcel, 7, this.f6650g, i10);
        AbstractC5932m.m11777e(parcel, 8, this.f6651h, i10);
        AbstractC5932m.m11777e(parcel, 9, this.f6652j, i10);
        AbstractC5932m.m11777e(parcel, 10, this.f6653k, i10);
        AbstractC5932m.m11777e(parcel, 11, this.f6654l, i10);
        AbstractC5932m.m11777e(parcel, 12, this.f6655m, i10);
        AbstractC5932m.m11777e(parcel, 13, this.f6656n, i10);
        AbstractC5932m.m11777e(parcel, 14, this.f6657p, i10);
        AbstractC5932m.m11777e(parcel, 15, this.f6658q, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
