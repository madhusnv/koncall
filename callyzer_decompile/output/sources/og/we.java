package og;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class we extends AbstractC7149a {
    public static final Parcelable.Creator<we> CREATOR = new C5360a(10);

    /* renamed from: a */
    public int f26897a;

    /* renamed from: b */
    public String f26898b;

    /* renamed from: c */
    public String f26899c;

    /* renamed from: d */
    public int f26900d;

    /* renamed from: e */
    public Point[] f26901e;

    /* renamed from: f */
    public g8 f26902f;

    /* renamed from: g */
    public ib f26903g;

    /* renamed from: h */
    public cc f26904h;

    /* renamed from: j */
    public xd f26905j;

    /* renamed from: k */
    public xc f26906k;

    /* renamed from: l */
    public h9 f26907l;

    /* renamed from: m */
    public d5 f26908m;

    /* renamed from: n */
    public e6 f26909n;

    /* renamed from: p */
    public f7 f26910p;

    /* renamed from: q */
    public byte[] f26911q;

    /* renamed from: r */
    public boolean f26912r;

    /* renamed from: s */
    public double f26913s;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        int i11 = this.f26897a;
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(i11);
        AbstractC5932m.m11778f(parcel, 3, this.f26898b);
        AbstractC5932m.m11778f(parcel, 4, this.f26899c);
        int i12 = this.f26900d;
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(i12);
        AbstractC5932m.m11781i(parcel, 6, this.f26901e, i10);
        AbstractC5932m.m11777e(parcel, 7, this.f26902f, i10);
        AbstractC5932m.m11777e(parcel, 8, this.f26903g, i10);
        AbstractC5932m.m11777e(parcel, 9, this.f26904h, i10);
        AbstractC5932m.m11777e(parcel, 10, this.f26905j, i10);
        AbstractC5932m.m11777e(parcel, 11, this.f26906k, i10);
        AbstractC5932m.m11777e(parcel, 12, this.f26907l, i10);
        AbstractC5932m.m11777e(parcel, 13, this.f26908m, i10);
        AbstractC5932m.m11777e(parcel, 14, this.f26909n, i10);
        AbstractC5932m.m11777e(parcel, 15, this.f26910p, i10);
        AbstractC5932m.m11775c(parcel, 16, this.f26911q);
        boolean z6 = this.f26912r;
        AbstractC5932m.m11785m(parcel, 17, 4);
        parcel.writeInt(z6 ? 1 : 0);
        double d2 = this.f26913s;
        AbstractC5932m.m11785m(parcel, 18, 8);
        parcel.writeDouble(d2);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
