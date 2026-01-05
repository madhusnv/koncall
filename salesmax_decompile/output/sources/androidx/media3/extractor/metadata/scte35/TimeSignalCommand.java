package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.umh;
import p001o.zwc;

/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C2263a();

    /* renamed from: a */
    public final long f8745a;

    /* renamed from: b */
    public final long f8746b;

    /* renamed from: androidx.media3.extractor.metadata.scte35.TimeSignalCommand$a */
    public class C2263a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C2263a c2263a) {
        this(j, j2);
    }

    /* renamed from: a */
    public static TimeSignalCommand m7604a(zwc zwcVar, long j, umh umhVar) {
        long jM7605b = m7605b(zwcVar, j);
        return new TimeSignalCommand(jM7605b, umhVar.m51795b(jM7605b));
    }

    /* renamed from: b */
    public static long m7605b(zwc zwcVar, long j) {
        long jM60004H = zwcVar.m60004H();
        if ((128 & jM60004H) != 0) {
            return 8589934591L & ((((jM60004H & 1) << 32) | zwcVar.m60006J()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f8745a + ", playbackPositionUs= " + this.f8746b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8745a);
        parcel.writeLong(this.f8746b);
    }

    public TimeSignalCommand(long j, long j2) {
        this.f8745a = j;
        this.f8746b = j2;
    }
}
