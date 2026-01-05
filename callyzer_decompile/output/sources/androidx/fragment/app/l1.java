package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 implements Parcelable {
    public static final Parcelable.Creator<l1> CREATOR = new C0220a(12);

    /* renamed from: a */
    public ArrayList f2614a;

    /* renamed from: b */
    public ArrayList f2615b;

    /* renamed from: c */
    public C0337b[] f2616c;

    /* renamed from: d */
    public int f2617d;

    /* renamed from: e */
    public String f2618e;

    /* renamed from: f */
    public ArrayList f2619f;

    /* renamed from: g */
    public ArrayList f2620g;

    /* renamed from: h */
    public ArrayList f2621h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2614a);
        parcel.writeStringList(this.f2615b);
        parcel.writeTypedArray(this.f2616c, i10);
        parcel.writeInt(this.f2617d);
        parcel.writeString(this.f2618e);
        parcel.writeStringList(this.f2619f);
        parcel.writeTypedList(this.f2620g);
        parcel.writeTypedList(this.f2621h);
    }
}
