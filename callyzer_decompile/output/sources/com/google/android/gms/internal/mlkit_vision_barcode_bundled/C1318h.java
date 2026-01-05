package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h */
/* loaded from: classes.dex */
public final class C1318h extends AbstractC7149a {
    public static final Parcelable.Creator<C1318h> CREATOR = new C1316f(5);

    /* renamed from: a */
    public final int f6543a;

    /* renamed from: b */
    public final int f6544b;

    /* renamed from: c */
    public final int f6545c;

    /* renamed from: d */
    public final int f6546d;

    /* renamed from: e */
    public final int f6547e;

    /* renamed from: f */
    public final int f6548f;

    /* renamed from: g */
    public final boolean f6549g;

    /* renamed from: h */
    public final String f6550h;

    public C1318h(String str, int i10, int i11, int i12, int i13, boolean z6, int i14, int i15) {
        this.f6543a = i10;
        this.f6544b = i11;
        this.f6545c = i12;
        this.f6546d = i13;
        this.f6547e = i14;
        this.f6548f = i15;
        this.f6549g = z6;
        this.f6550h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6543a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f6544b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f6545c);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f6546d);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f6547e);
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(this.f6548f);
        AbstractC5932m.m11785m(parcel, 7, 4);
        parcel.writeInt(this.f6549g ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 8, this.f6550h);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
