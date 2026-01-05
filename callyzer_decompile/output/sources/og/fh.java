package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class fh extends AbstractC7149a {
    public static final Parcelable.Creator<fh> CREATOR = new C5360a(17);

    /* renamed from: a */
    public final String f26442a;

    /* renamed from: b */
    public final String f26443b;

    /* renamed from: c */
    public final String f26444c;

    /* renamed from: d */
    public final String f26445d;

    /* renamed from: e */
    public final String f26446e;

    /* renamed from: f */
    public final eh f26447f;

    /* renamed from: g */
    public final eh f26448g;

    public fh(String str, String str2, String str3, String str4, String str5, eh ehVar, eh ehVar2) {
        this.f26442a = str;
        this.f26443b = str2;
        this.f26444c = str3;
        this.f26445d = str4;
        this.f26446e = str5;
        this.f26447f = ehVar;
        this.f26448g = ehVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f26442a);
        AbstractC5932m.m11778f(parcel, 2, this.f26443b);
        AbstractC5932m.m11778f(parcel, 3, this.f26444c);
        AbstractC5932m.m11778f(parcel, 4, this.f26445d);
        AbstractC5932m.m11778f(parcel, 5, this.f26446e);
        AbstractC5932m.m11777e(parcel, 6, this.f26447f, i10);
        AbstractC5932m.m11777e(parcel, 7, this.f26448g, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
