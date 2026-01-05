package lf;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import gg.C2597l;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.j */
/* loaded from: classes.dex */
public final class C4459j extends AbstractC7149a {
    public static final Parcelable.Creator<C4459j> CREATOR = new C4462m(6);

    /* renamed from: a */
    public final String f22214a;

    /* renamed from: b */
    public final String f22215b;

    /* renamed from: c */
    public final String f22216c;

    /* renamed from: d */
    public final String f22217d;

    /* renamed from: e */
    public final Uri f22218e;

    /* renamed from: f */
    public final String f22219f;

    /* renamed from: g */
    public final String f22220g;

    /* renamed from: h */
    public final String f22221h;

    /* renamed from: j */
    public final C2597l f22222j;

    public C4459j(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C2597l c2597l) {
        AbstractC6840z.m13036g(str);
        this.f22214a = str;
        this.f22215b = str2;
        this.f22216c = str3;
        this.f22217d = str4;
        this.f22218e = uri;
        this.f22219f = str5;
        this.f22220g = str6;
        this.f22221h = str7;
        this.f22222j = c2597l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4459j)) {
            return false;
        }
        C4459j c4459j = (C4459j) obj;
        return AbstractC6840z.m13040k(this.f22214a, c4459j.f22214a) && AbstractC6840z.m13040k(this.f22215b, c4459j.f22215b) && AbstractC6840z.m13040k(this.f22216c, c4459j.f22216c) && AbstractC6840z.m13040k(this.f22217d, c4459j.f22217d) && AbstractC6840z.m13040k(this.f22218e, c4459j.f22218e) && AbstractC6840z.m13040k(this.f22219f, c4459j.f22219f) && AbstractC6840z.m13040k(this.f22220g, c4459j.f22220g) && AbstractC6840z.m13040k(this.f22221h, c4459j.f22221h) && AbstractC6840z.m13040k(this.f22222j, c4459j.f22222j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22214a, this.f22215b, this.f22216c, this.f22217d, this.f22218e, this.f22219f, this.f22220g, this.f22221h, this.f22222j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f22214a);
        AbstractC5932m.m11778f(parcel, 2, this.f22215b);
        AbstractC5932m.m11778f(parcel, 3, this.f22216c);
        AbstractC5932m.m11778f(parcel, 4, this.f22217d);
        AbstractC5932m.m11777e(parcel, 5, this.f22218e, i10);
        AbstractC5932m.m11778f(parcel, 6, this.f22219f);
        AbstractC5932m.m11778f(parcel, 7, this.f22220g);
        AbstractC5932m.m11778f(parcel, 8, this.f22221h);
        AbstractC5932m.m11777e(parcel, 9, this.f22222j, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
