package lf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.a */
/* loaded from: classes.dex */
public final class C4450a extends AbstractC7149a {
    public static final Parcelable.Creator<C4450a> CREATOR = new C4462m(0);

    /* renamed from: a */
    public final boolean f22182a;

    /* renamed from: b */
    public final String f22183b;

    /* renamed from: c */
    public final String f22184c;

    /* renamed from: d */
    public final boolean f22185d;

    /* renamed from: e */
    public final String f22186e;

    /* renamed from: f */
    public final ArrayList f22187f;

    /* renamed from: g */
    public final boolean f22188g;

    public C4450a(boolean z6, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        AbstractC6840z.m13030a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f22182a = z6;
        if (z6) {
            AbstractC6840z.m13037h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f22183b = str;
        this.f22184c = str2;
        this.f22185d = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f22187f = arrayList2;
        this.f22186e = str3;
        this.f22188g = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4450a)) {
            return false;
        }
        C4450a c4450a = (C4450a) obj;
        return this.f22182a == c4450a.f22182a && AbstractC6840z.m13040k(this.f22183b, c4450a.f22183b) && AbstractC6840z.m13040k(this.f22184c, c4450a.f22184c) && this.f22185d == c4450a.f22185d && AbstractC6840z.m13040k(this.f22186e, c4450a.f22186e) && AbstractC6840z.m13040k(this.f22187f, c4450a.f22187f) && this.f22188g == c4450a.f22188g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f22182a), this.f22183b, this.f22184c, Boolean.valueOf(this.f22185d), this.f22186e, this.f22187f, Boolean.valueOf(this.f22188g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f22182a ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 2, this.f22183b);
        AbstractC5932m.m11778f(parcel, 3, this.f22184c);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f22185d ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 5, this.f22186e);
        AbstractC5932m.m11780h(parcel, 6, this.f22187f);
        AbstractC5932m.m11785m(parcel, 7, 4);
        parcel.writeInt(this.f22188g ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
