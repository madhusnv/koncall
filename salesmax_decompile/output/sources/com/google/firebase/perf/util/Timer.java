package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() { // from class: com.google.firebase.perf.util.Timer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    };
    private long elapsedRealtimeMicros;
    private long wallClockMicros;

    private static long elapsedRealtimeMicros() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static Timer ofElapsedRealtime(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(wallClockMicros() + (micros - elapsedRealtimeMicros()), micros);
    }

    private static long wallClockMicros() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrentTimestampMicros() {
        return this.wallClockMicros + getDurationMicros();
    }

    public long getDurationMicros() {
        return getDurationMicros(new Timer());
    }

    public long getMicros() {
        return this.wallClockMicros;
    }

    public void reset() {
        this.wallClockMicros = wallClockMicros();
        this.elapsedRealtimeMicros = elapsedRealtimeMicros();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.wallClockMicros);
        parcel.writeLong(this.elapsedRealtimeMicros);
    }

    public Timer() {
        this(wallClockMicros(), elapsedRealtimeMicros());
    }

    public long getDurationMicros(Timer timer) {
        return timer.elapsedRealtimeMicros - this.elapsedRealtimeMicros;
    }

    @VisibleForTesting
    public Timer(long j, long j2) {
        this.wallClockMicros = j;
        this.elapsedRealtimeMicros = j2;
    }

    @VisibleForTesting
    public Timer(long j) {
        this(j, j);
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
