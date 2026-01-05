package android.support.v4.media.session;

import a2.AbstractC0030c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0220a(8);

    /* renamed from: a */
    public final int f1657a;

    /* renamed from: b */
    public final long f1658b;

    /* renamed from: c */
    public final long f1659c;

    /* renamed from: d */
    public final float f1660d;

    /* renamed from: e */
    public final long f1661e;

    /* renamed from: f */
    public final int f1662f;

    /* renamed from: g */
    public final CharSequence f1663g;

    /* renamed from: h */
    public final long f1664h;

    /* renamed from: j */
    public final ArrayList f1665j;

    /* renamed from: k */
    public final long f1666k;

    /* renamed from: l */
    public final Bundle f1667l;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0223b();

        /* renamed from: a */
        public final String f1668a;

        /* renamed from: b */
        public final CharSequence f1669b;

        /* renamed from: c */
        public final int f1670c;

        /* renamed from: d */
        public final Bundle f1671d;

        public CustomAction(Parcel parcel) {
            this.f1668a = parcel.readString();
            this.f1669b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1670c = parcel.readInt();
            this.f1671d = parcel.readBundle(AbstractC0222a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f1669b) + ", mIcon=" + this.f1670c + ", mExtras=" + this.f1671d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1668a);
            TextUtils.writeToParcel(this.f1669b, parcel, i10);
            parcel.writeInt(this.f1670c);
            parcel.writeBundle(this.f1671d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1657a = parcel.readInt();
        this.f1658b = parcel.readLong();
        this.f1660d = parcel.readFloat();
        this.f1664h = parcel.readLong();
        this.f1659c = parcel.readLong();
        this.f1661e = parcel.readLong();
        this.f1663g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1665j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1666k = parcel.readLong();
        this.f1667l = parcel.readBundle(AbstractC0222a.class.getClassLoader());
        this.f1662f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f1657a);
        sb2.append(", position=");
        sb2.append(this.f1658b);
        sb2.append(", buffered position=");
        sb2.append(this.f1659c);
        sb2.append(", speed=");
        sb2.append(this.f1660d);
        sb2.append(", updated=");
        sb2.append(this.f1664h);
        sb2.append(", actions=");
        sb2.append(this.f1661e);
        sb2.append(", error code=");
        sb2.append(this.f1662f);
        sb2.append(", error message=");
        sb2.append(this.f1663g);
        sb2.append(", custom actions=");
        sb2.append(this.f1665j);
        sb2.append(", active item id=");
        return AbstractC0030c.m116g(this.f1666k, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1657a);
        parcel.writeLong(this.f1658b);
        parcel.writeFloat(this.f1660d);
        parcel.writeLong(this.f1664h);
        parcel.writeLong(this.f1659c);
        parcel.writeLong(this.f1661e);
        TextUtils.writeToParcel(this.f1663g, parcel, i10);
        parcel.writeTypedList(this.f1665j);
        parcel.writeLong(this.f1666k);
        parcel.writeBundle(this.f1667l);
        parcel.writeInt(this.f1662f);
    }
}
