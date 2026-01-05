package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2182b;
import java.util.Arrays;
import java.util.List;
import p001o.sqi;
import p001o.tla;

/* loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C2179a();

    /* renamed from: a */
    public final Entry[] f7896a;

    /* renamed from: b */
    public final long f7897b;

    public interface Entry extends Parcelable {
        /* renamed from: T */
        default C2181a mo6698T() {
            return null;
        }

        default void Y1(C2182b.b bVar) {
        }

        default byte[] g3() {
            return null;
        }
    }

    /* renamed from: androidx.media3.common.Metadata$a */
    public class C2179a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    /* renamed from: a */
    public Metadata m6693a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.f7897b, (Entry[]) sqi.R0(this.f7896a, entryArr));
    }

    /* renamed from: b */
    public Metadata m6694b(Metadata metadata) {
        return metadata == null ? this : m6693a(metadata.f7896a);
    }

    /* renamed from: c */
    public Metadata m6695c(long j) {
        return this.f7897b == j ? this : new Metadata(j, this.f7896a);
    }

    /* renamed from: d */
    public Entry m6696d(int i) {
        return this.f7896a[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m6697e() {
        return this.f7896a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.f7896a, metadata.f7896a) && this.f7897b == metadata.f7897b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f7896a) * 31) + tla.m50160b(this.f7897b);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f7896a));
        if (this.f7897b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f7897b;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7896a.length);
        for (Entry entry : this.f7896a) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f7897b);
    }

    public Metadata(long j, Entry... entryArr) {
        this.f7897b = j;
        this.f7896a = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j, List list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f7896a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f7896a;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.f7897b = parcel.readLong();
                return;
            }
        }
    }
}
