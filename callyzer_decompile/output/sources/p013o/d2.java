package p013o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.h0;
import l6.AbstractC4400b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d2 extends AbstractC4400b {
    public static final Parcelable.Creator<d2> CREATOR = new h0(5);

    /* renamed from: c */
    public int f25463c;

    /* renamed from: d */
    public boolean f25464d;

    public d2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f25463c = parcel.readInt();
        this.f25464d = parcel.readInt() != 0;
    }

    @Override // l6.AbstractC4400b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f25463c);
        parcel.writeInt(this.f25464d ? 1 : 0);
    }
}
