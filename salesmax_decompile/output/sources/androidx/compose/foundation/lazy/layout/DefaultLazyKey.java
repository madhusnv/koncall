package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final class DefaultLazyKey implements Parcelable {

    /* renamed from: a */
    public final int f6218a;

    /* renamed from: b */
    public static final C1913b f6217b = new C1913b(null);
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new C1912a();

    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$a */
    public static final class C1912a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$b */
    public static final class C1913b {
        public C1913b() {
        }

        public /* synthetic */ C1913b(id5 id5Var) {
            this();
        }
    }

    public DefaultLazyKey(int i) {
        this.f6218a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f6218a == ((DefaultLazyKey) obj).f6218a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f6218a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f6218a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "parcel");
        parcel.writeInt(this.f6218a);
    }
}
