package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p001o.op0;
import p001o.r6c;
import p001o.sk3;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C2254a();

    /* renamed from: a */
    public final List f8705a;

    public static final class Segment implements Parcelable {

        /* renamed from: a */
        public final long f8707a;

        /* renamed from: b */
        public final long f8708b;

        /* renamed from: c */
        public final int f8709c;

        /* renamed from: d */
        public static final Comparator f8706d = new Comparator() { // from class: o.kwf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SlowMotionData.Segment.m7574b((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new C2253a();

        /* renamed from: androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment$a */
        public class C2253a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        }

        public Segment(long j, long j2, int i) {
            op0.m42511a(j < j2);
            this.f8707a = j;
            this.f8708b = j2;
            this.f8709c = i;
        }

        /* renamed from: b */
        public static /* synthetic */ int m7574b(Segment segment, Segment segment2) {
            return sk3.m48421j().mo48423e(segment.f8707a, segment2.f8707a).mo48423e(segment.f8708b, segment2.f8708b).mo48422d(segment.f8709c, segment2.f8709c).mo48427i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f8707a == segment.f8707a && this.f8708b == segment.f8708b && this.f8709c == segment.f8709c;
        }

        public int hashCode() {
            return r6c.m46256b(Long.valueOf(this.f8707a), Long.valueOf(this.f8708b), Integer.valueOf(this.f8709c));
        }

        public String toString() {
            return sqi.m48702G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f8707a), Long.valueOf(this.f8708b), Integer.valueOf(this.f8709c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8707a);
            parcel.writeLong(this.f8708b);
            parcel.writeInt(this.f8709c);
        }
    }

    /* renamed from: androidx.media3.extractor.metadata.mp4.SlowMotionData$a */
    public class C2254a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public SlowMotionData(List list) {
        this.f8705a = list;
        op0.m42511a(!m7572a(list));
    }

    /* renamed from: a */
    public static boolean m7572a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = ((Segment) list.get(0)).f8708b;
        for (int i = 1; i < list.size(); i++) {
            if (((Segment) list.get(i)).f8707a < j) {
                return true;
            }
            j = ((Segment) list.get(i)).f8708b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f8705a.equals(((SlowMotionData) obj).f8705a);
    }

    public int hashCode() {
        return this.f8705a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f8705a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8705a);
    }
}
