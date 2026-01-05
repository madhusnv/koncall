package gh;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.h0;
import l6.AbstractC4400b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gh.b */
/* loaded from: classes.dex */
public final class C2613b extends AbstractC4400b {
    public static final Parcelable.Creator<C2613b> CREATOR = new h0(2);

    /* renamed from: c */
    public boolean f14154c;

    public C2613b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C2613b.class.getClassLoader();
        }
        this.f14154c = parcel.readInt() == 1;
    }

    @Override // l6.AbstractC4400b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f14154c ? 1 : 0);
    }
}
