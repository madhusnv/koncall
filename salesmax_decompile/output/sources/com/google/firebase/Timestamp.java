package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import j$.time.Instant;
import java.util.Date;
import p001o.hwc;
import p001o.id5;
import p001o.sq8;
import p001o.uk3;
import p001o.vyh;
import p001o.wrd;

/* loaded from: classes5.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new Timestamp(parcel.readLong(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i) {
            return new Timestamp[i];
        }
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final hwc toPreciseTime(Date date) {
            long j = 1000;
            long time = date.getTime() / j;
            int time2 = (int) ((date.getTime() % j) * 1000000);
            return time2 < 0 ? vyh.m53620a(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : vyh.m53620a(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long j, int i) {
            if (!(i >= 0 && i < 1000000000)) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i).toString());
            }
            if (-62135596800L <= j && j < 253402300800L) {
                return;
            }
            throw new IllegalArgumentException(("Timestamp seconds out of range: " + j).toString());
        }

        public final Timestamp now() {
            return new Timestamp(new Date());
        }
    }

    public Timestamp(long j, int i) {
        Companion.validateRange(j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0);
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 37 * 37) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * 1000) + (this.nanoseconds / 1000000));
    }

    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        sq8.m48648g(instantOfEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instantOfEpochSecond;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeLong(this.seconds);
        parcel.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp timestamp) {
        sq8.m48649h(timestamp, "other");
        return uk3.m51675e(this, timestamp, new wrd() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // p001o.cc9
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new wrd() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // p001o.cc9
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        });
    }

    public Timestamp(Date date) {
        sq8.m48649h(date, "date");
        Companion companion = Companion;
        hwc preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.m31227a()).longValue();
        int iIntValue = ((Number) preciseTime.m31228b()).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(Instant instant) {
        this(instant.getEpochSecond(), instant.getNano());
        sq8.m48649h(instant, InfluenceConstants.TIME);
    }
}
