package g6;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import android.view.View;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g6.h */
/* loaded from: classes.dex */
public final class C2533h extends View.BaseSavedState {
    public static final Parcelable.Creator<C2533h> CREATOR = new C0220a(19);

    /* renamed from: a */
    public int f13860a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return AbstractC5601a.m11233d(this.f13860a, "}", sb2);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f13860a);
    }
}
