package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class gh extends AbstractC7149a {
    public static final Parcelable.Creator<gh> CREATOR = new C5360a(18);

    /* renamed from: a */
    public final kh f26477a;

    /* renamed from: b */
    public final String f26478b;

    /* renamed from: c */
    public final String f26479c;

    /* renamed from: d */
    public final lh[] f26480d;

    /* renamed from: e */
    public final ih[] f26481e;

    /* renamed from: f */
    public final String[] f26482f;

    /* renamed from: g */
    public final dh[] f26483g;

    public gh(kh khVar, String str, String str2, lh[] lhVarArr, ih[] ihVarArr, String[] strArr, dh[] dhVarArr) {
        this.f26477a = khVar;
        this.f26478b = str;
        this.f26479c = str2;
        this.f26480d = lhVarArr;
        this.f26481e = ihVarArr;
        this.f26482f = strArr;
        this.f26483g = dhVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f26477a, i10);
        AbstractC5932m.m11778f(parcel, 2, this.f26478b);
        AbstractC5932m.m11778f(parcel, 3, this.f26479c);
        AbstractC5932m.m11781i(parcel, 4, this.f26480d, i10);
        AbstractC5932m.m11781i(parcel, 5, this.f26481e, i10);
        AbstractC5932m.m11779g(parcel, 6, this.f26482f);
        AbstractC5932m.m11781i(parcel, 7, this.f26483g, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
