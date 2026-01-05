package og;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ph extends AbstractC7149a {
    public static final Parcelable.Creator<ph> CREATOR = new C5360a(15);

    /* renamed from: a */
    public final int f26734a;

    /* renamed from: b */
    public final String f26735b;

    /* renamed from: c */
    public final String f26736c;

    /* renamed from: d */
    public final byte[] f26737d;

    /* renamed from: e */
    public final Point[] f26738e;

    /* renamed from: f */
    public final int f26739f;

    /* renamed from: g */
    public final ih f26740g;

    /* renamed from: h */
    public final lh f26741h;

    /* renamed from: j */
    public final mh f26742j;

    /* renamed from: k */
    public final oh f26743k;

    /* renamed from: l */
    public final nh f26744l;

    /* renamed from: m */
    public final jh f26745m;

    /* renamed from: n */
    public final fh f26746n;

    /* renamed from: p */
    public final gh f26747p;

    /* renamed from: q */
    public final hh f26748q;

    public ph(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, ih ihVar, lh lhVar, mh mhVar, oh ohVar, nh nhVar, jh jhVar, fh fhVar, gh ghVar, hh hhVar) {
        this.f26734a = i10;
        this.f26735b = str;
        this.f26736c = str2;
        this.f26737d = bArr;
        this.f26738e = pointArr;
        this.f26739f = i11;
        this.f26740g = ihVar;
        this.f26741h = lhVar;
        this.f26742j = mhVar;
        this.f26743k = ohVar;
        this.f26744l = nhVar;
        this.f26745m = jhVar;
        this.f26746n = fhVar;
        this.f26747p = ghVar;
        this.f26748q = hhVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f26734a);
        AbstractC5932m.m11778f(parcel, 2, this.f26735b);
        AbstractC5932m.m11778f(parcel, 3, this.f26736c);
        AbstractC5932m.m11775c(parcel, 4, this.f26737d);
        AbstractC5932m.m11781i(parcel, 5, this.f26738e, i10);
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(this.f26739f);
        AbstractC5932m.m11777e(parcel, 7, this.f26740g, i10);
        AbstractC5932m.m11777e(parcel, 8, this.f26741h, i10);
        AbstractC5932m.m11777e(parcel, 9, this.f26742j, i10);
        AbstractC5932m.m11777e(parcel, 10, this.f26743k, i10);
        AbstractC5932m.m11777e(parcel, 11, this.f26744l, i10);
        AbstractC5932m.m11777e(parcel, 12, this.f26745m, i10);
        AbstractC5932m.m11777e(parcel, 13, this.f26746n, i10);
        AbstractC5932m.m11777e(parcel, 14, this.f26747p, i10);
        AbstractC5932m.m11777e(parcel, 15, this.f26748q, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
