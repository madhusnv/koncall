package y7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import wg.C8034g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable {
    public static final Parcelable.Creator<a1> CREATOR = new C8034g(5);

    /* renamed from: a */
    public int f41565a;

    /* renamed from: b */
    public int f41566b;

    /* renamed from: c */
    public int f41567c;

    /* renamed from: d */
    public int[] f41568d;

    /* renamed from: e */
    public int f41569e;

    /* renamed from: f */
    public int[] f41570f;

    /* renamed from: g */
    public ArrayList f41571g;

    /* renamed from: h */
    public boolean f41572h;

    /* renamed from: j */
    public boolean f41573j;

    /* renamed from: k */
    public boolean f41574k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41565a);
        parcel.writeInt(this.f41566b);
        parcel.writeInt(this.f41567c);
        if (this.f41567c > 0) {
            parcel.writeIntArray(this.f41568d);
        }
        parcel.writeInt(this.f41569e);
        if (this.f41569e > 0) {
            parcel.writeIntArray(this.f41570f);
        }
        parcel.writeInt(this.f41572h ? 1 : 0);
        parcel.writeInt(this.f41573j ? 1 : 0);
        parcel.writeInt(this.f41574k ? 1 : 0);
        parcel.writeList(this.f41571g);
    }
}
