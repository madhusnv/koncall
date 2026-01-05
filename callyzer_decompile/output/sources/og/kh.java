package og;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class kh extends AbstractC7149a {
    public static final Parcelable.Creator<kh> CREATOR = new C5360a(22);

    /* renamed from: a */
    public final String f26598a;

    /* renamed from: b */
    public final String f26599b;

    /* renamed from: c */
    public final String f26600c;

    /* renamed from: d */
    public final String f26601d;

    /* renamed from: e */
    public final String f26602e;

    /* renamed from: f */
    public final String f26603f;

    /* renamed from: g */
    public final String f26604g;

    public kh(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26598a = str;
        this.f26599b = str2;
        this.f26600c = str3;
        this.f26601d = str4;
        this.f26602e = str5;
        this.f26603f = str6;
        this.f26604g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f26598a);
        AbstractC5932m.m11778f(parcel, 2, this.f26599b);
        AbstractC5932m.m11778f(parcel, 3, this.f26600c);
        AbstractC5932m.m11778f(parcel, 4, this.f26601d);
        AbstractC5932m.m11778f(parcel, 5, this.f26602e);
        AbstractC5932m.m11778f(parcel, 6, this.f26603f);
        AbstractC5932m.m11778f(parcel, 7, this.f26604g);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
