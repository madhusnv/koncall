package ps;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4462m;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.a */
/* loaded from: classes3.dex */
public final class C6001a implements Parcelable {
    public static final Parcelable.Creator<C6001a> CREATOR = new C4462m(15);

    /* renamed from: a */
    public final int f29328a;

    /* renamed from: b */
    public final String f29329b;

    /* renamed from: c */
    public final int f29330c;

    public C6001a(int i10, String route, int i11) {
        AbstractC4154l.m8923f(route, "route");
        this.f29328a = i10;
        this.f29329b = route;
        this.f29330c = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6001a)) {
            return false;
        }
        C6001a c6001a = (C6001a) obj;
        return this.f29328a == c6001a.f29328a && AbstractC4154l.m8918a(this.f29329b, c6001a.f29329b) && this.f29330c == c6001a.f29330c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29330c) + AbstractC0030c.m113d(Integer.hashCode(this.f29328a) * 31, 31, this.f29329b);
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.f29330c, ")", a1.m14337q(this.f29328a, "BottomNavigationItemModel(name=", ", route=", this.f29329b, ", icon="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(this.f29328a);
        dest.writeString(this.f29329b);
        dest.writeInt(this.f29330c);
    }
}
