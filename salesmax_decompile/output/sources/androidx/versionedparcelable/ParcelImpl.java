package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import p001o.wti;
import p001o.xti;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C2527a();

    /* renamed from: a */
    public final xti f10444a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C2527a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(xti xtiVar) {
        this.f10444a = xtiVar;
    }

    /* renamed from: a */
    public xti m9961a() {
        return this.f10444a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new wti(parcel).m53423L(this.f10444a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f10444a = new wti(parcel).m53446u();
    }
}
