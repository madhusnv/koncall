package rh;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.h0;
import l6.AbstractC4400b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.u */
/* loaded from: classes.dex */
public final class C6542u extends AbstractC4400b {
    public static final Parcelable.Creator<C6542u> CREATOR = new h0(7);

    /* renamed from: c */
    public CharSequence f31371c;

    /* renamed from: d */
    public boolean f31372d;

    /* renamed from: e */
    public CharSequence f31373e;

    /* renamed from: f */
    public CharSequence f31374f;

    /* renamed from: g */
    public CharSequence f31375g;

    public C6542u(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f31371c = (CharSequence) creator.createFromParcel(parcel);
        this.f31372d = parcel.readInt() == 1;
        this.f31373e = (CharSequence) creator.createFromParcel(parcel);
        this.f31374f = (CharSequence) creator.createFromParcel(parcel);
        this.f31375g = (CharSequence) creator.createFromParcel(parcel);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f31371c) + " hint=" + ((Object) this.f31373e) + " helperText=" + ((Object) this.f31374f) + " placeholderText=" + ((Object) this.f31375g) + "}";
    }

    @Override // l6.AbstractC4400b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.f31371c, parcel, i10);
        parcel.writeInt(this.f31372d ? 1 : 0);
        TextUtils.writeToParcel(this.f31373e, parcel, i10);
        TextUtils.writeToParcel(this.f31374f, parcel, i10);
        TextUtils.writeToParcel(this.f31375g, parcel, i10);
    }
}
