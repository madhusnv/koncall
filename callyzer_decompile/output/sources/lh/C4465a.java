package lh;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.h0;
import l6.AbstractC4400b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lh.a */
/* loaded from: classes.dex */
public final class C4465a extends AbstractC4400b {
    public static final Parcelable.Creator<C4465a> CREATOR = new h0(4);

    /* renamed from: c */
    public boolean f22227c;

    public C4465a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22227c = parcel.readInt() == 1;
    }

    @Override // l6.AbstractC4400b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f22227c ? 1 : 0);
    }
}
