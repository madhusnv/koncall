package fh;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.fragment.app.h0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import l6.AbstractC4400b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fh.d */
/* loaded from: classes.dex */
public final class C2289d extends AbstractC4400b {
    public static final Parcelable.Creator<C2289d> CREATOR = new h0(1);

    /* renamed from: c */
    public final int f10324c;

    /* renamed from: d */
    public final int f10325d;

    /* renamed from: e */
    public final boolean f10326e;

    /* renamed from: f */
    public final boolean f10327f;

    /* renamed from: g */
    public final boolean f10328g;

    public C2289d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10324c = parcel.readInt();
        this.f10325d = parcel.readInt();
        this.f10326e = parcel.readInt() == 1;
        this.f10327f = parcel.readInt() == 1;
        this.f10328g = parcel.readInt() == 1;
    }

    @Override // l6.AbstractC4400b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f10324c);
        parcel.writeInt(this.f10325d);
        parcel.writeInt(this.f10326e ? 1 : 0);
        parcel.writeInt(this.f10327f ? 1 : 0);
        parcel.writeInt(this.f10328g ? 1 : 0);
    }

    public C2289d(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f10324c = bottomSheetBehavior.f6738F;
        this.f10325d = bottomSheetBehavior.f6759d;
        this.f10326e = bottomSheetBehavior.f6757b;
        this.f10327f = bottomSheetBehavior.f6735C;
        this.f10328g = bottomSheetBehavior.f6736D;
    }
}
