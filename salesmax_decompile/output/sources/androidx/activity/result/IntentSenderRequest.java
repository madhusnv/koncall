package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class IntentSenderRequest implements Parcelable {

    /* renamed from: a */
    public final IntentSender f5268a;

    /* renamed from: b */
    public final Intent f5269b;

    /* renamed from: c */
    public final int f5270c;

    /* renamed from: d */
    public final int f5271d;

    /* renamed from: e */
    public static final C1753c f5267e = new C1753c(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C1752b();

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    public static final class C1751a {

        /* renamed from: a */
        public final IntentSender f5272a;

        /* renamed from: b */
        public Intent f5273b;

        /* renamed from: c */
        public int f5274c;

        /* renamed from: d */
        public int f5275d;

        public C1751a(IntentSender intentSender) {
            sq8.m48649h(intentSender, "intentSender");
            this.f5272a = intentSender;
        }

        /* renamed from: a */
        public final IntentSenderRequest m3733a() {
            return new IntentSenderRequest(this.f5272a, this.f5273b, this.f5274c, this.f5275d);
        }

        /* renamed from: b */
        public final C1751a m3734b(Intent intent) {
            this.f5273b = intent;
            return this;
        }

        /* renamed from: c */
        public final C1751a m3735c(int i, int i2) {
            this.f5275d = i;
            this.f5274c = i2;
            return this;
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C1752b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "inParcel");
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$c */
    public static final class C1753c {
        public C1753c() {
        }

        public /* synthetic */ C1753c(id5 id5Var) {
            this();
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        sq8.m48649h(intentSender, "intentSender");
        this.f5268a = intentSender;
        this.f5269b = intent;
        this.f5270c = i;
        this.f5271d = i2;
    }

    /* renamed from: a */
    public final Intent m3729a() {
        return this.f5269b;
    }

    /* renamed from: b */
    public final int m3730b() {
        return this.f5270c;
    }

    /* renamed from: c */
    public final int m3731c() {
        return this.f5271d;
    }

    /* renamed from: d */
    public final IntentSender m3732d() {
        return this.f5268a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeParcelable(this.f5268a, i);
        parcel.writeParcelable(this.f5269b, i);
        parcel.writeInt(this.f5270c);
        parcel.writeInt(this.f5271d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        sq8.m48646e(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
