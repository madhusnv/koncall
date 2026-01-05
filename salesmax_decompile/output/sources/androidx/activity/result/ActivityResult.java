package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C1750a();

    /* renamed from: a */
    public final int f5265a;

    /* renamed from: b */
    public final Intent f5266b;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    public class C1750a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f5265a = i;
        this.f5266b = intent;
    }

    /* renamed from: c */
    public static String m3724c(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m3725a() {
        return this.f5266b;
    }

    /* renamed from: b */
    public int m3726b() {
        return this.f5265a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m3724c(this.f5265a) + ", data=" + this.f5266b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5265a);
        parcel.writeInt(this.f5266b == null ? 0 : 1);
        Intent intent = this.f5266b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f5265a = parcel.readInt();
        this.f5266b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
