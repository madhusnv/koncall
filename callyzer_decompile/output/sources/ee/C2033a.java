package ee;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ee.a */
/* loaded from: classes.dex */
public final class C2033a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C2033a> CREATOR = new C0220a(18);

    /* renamed from: a */
    public final String f9589a;

    /* renamed from: b */
    public final Map f9590b;

    public C2033a(String str, Map map) {
        this.f9589a = str;
        this.f9590b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2033a)) {
            return false;
        }
        C2033a c2033a = (C2033a) obj;
        return AbstractC4154l.m8918a(this.f9589a, c2033a.f9589a) && AbstractC4154l.m8918a(this.f9590b, c2033a.f9590b);
    }

    public final int hashCode() {
        return this.f9590b.hashCode() + (this.f9589a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f9589a + ", extras=" + this.f9590b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9589a);
        Map map = this.f9590b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
