package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: j$.time.zone.e */
/* loaded from: classes2.dex */
public final class C3494e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a */
    public final Month f18313a;

    /* renamed from: b */
    public final byte f18314b;

    /* renamed from: c */
    public final DayOfWeek f18315c;

    /* renamed from: d */
    public final LocalTime f18316d;

    /* renamed from: e */
    public final boolean f18317e;

    /* renamed from: f */
    public final EnumC3493d f18318f;

    /* renamed from: g */
    public final ZoneOffset f18319g;

    /* renamed from: h */
    public final ZoneOffset f18320h;

    /* renamed from: i */
    public final ZoneOffset f18321i;

    public C3494e(Month month, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z6, EnumC3493d enumC3493d, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f18313a = month;
        this.f18314b = (byte) i10;
        this.f18315c = dayOfWeek;
        this.f18316d = localTime;
        this.f18317e = z6;
        this.f18318f = enumC3493d;
        this.f18319g = zoneOffset;
        this.f18320h = zoneOffset2;
        this.f18321i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C3490a((byte) 3, this);
    }

    /* renamed from: b */
    public final void m8040b(DataOutput dataOutput) {
        int iH0 = this.f18317e ? 86400 : this.f18316d.h0();
        int i10 = this.f18319g.f18042b;
        int i11 = this.f18320h.f18042b - i10;
        int i12 = this.f18321i.f18042b - i10;
        byte b10 = iH0 % 3600 == 0 ? this.f18317e ? (byte) 24 : this.f18316d.f18028a : (byte) 31;
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f18315c;
        dataOutput.writeInt((this.f18313a.getValue() << 28) + ((this.f18314b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b10 << 14) + (this.f18318f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (b10 == 31) {
            dataOutput.writeInt(iH0);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f18320h.f18042b);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f18321i.f18042b);
        }
    }

    /* renamed from: a */
    public static C3494e m8039a(DataInput dataInput) {
        EnumC3493d enumC3493d;
        LocalTime localTimeOf;
        int i10;
        int i11;
        int i12 = dataInput.readInt();
        Month monthM7854K = Month.m7854K(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        DayOfWeek dayOfWeekOf = i14 == 0 ? null : DayOfWeek.of(i14);
        int i15 = (507904 & i12) >>> 14;
        EnumC3493d enumC3493d2 = EnumC3493d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j6 = dataInput.readInt();
            LocalTime localTime = LocalTime.MIN;
            ChronoField.SECOND_OF_DAY.a0(j6);
            int i19 = (int) (j6 / 3600);
            long j10 = j6 - (i19 * 3600);
            enumC3493d = enumC3493d2;
            localTimeOf = LocalTime.m7848C(i19, (int) (j10 / 60), (int) (j10 - (r14 * 60)), 0);
        } else {
            enumC3493d = enumC3493d2;
            localTimeOf = LocalTime.of(i15 % 24, 0);
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetOfTotalSeconds.f18042b;
        }
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetOfTotalSeconds.f18042b;
        }
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(i11);
        boolean z6 = i15 == 24;
        Objects.requireNonNull(monthM7854K, "month");
        Objects.requireNonNull(localTimeOf, "time");
        EnumC3493d enumC3493d3 = enumC3493d;
        Objects.requireNonNull(enumC3493d3, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetAfter");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z6 && !localTimeOf.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeOf.f18031d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C3494e(monthM7854K, i13, dayOfWeekOf, localTimeOf, z6, enumC3493d3, zoneOffsetOfTotalSeconds, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3494e) {
            C3494e c3494e = (C3494e) obj;
            if (this.f18313a == c3494e.f18313a && this.f18314b == c3494e.f18314b && this.f18315c == c3494e.f18315c && this.f18318f == c3494e.f18318f && this.f18316d.equals(c3494e.f18316d) && this.f18317e == c3494e.f18317e && this.f18319g.equals(c3494e.f18319g) && this.f18320h.equals(c3494e.f18320h) && this.f18321i.equals(c3494e.f18321i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iH0 = ((this.f18316d.h0() + (this.f18317e ? 1 : 0)) << 15) + (this.f18313a.ordinal() << 11) + ((this.f18314b + 32) << 5);
        DayOfWeek dayOfWeek = this.f18315c;
        return ((this.f18319g.f18042b ^ (this.f18318f.ordinal() + (iH0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f18320h.f18042b) ^ this.f18321i.f18042b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f18321i.f18042b - this.f18320h.f18042b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f18320h);
        sb2.append(" to ");
        sb2.append(this.f18321i);
        sb2.append(", ");
        DayOfWeek dayOfWeek = this.f18315c;
        if (dayOfWeek != null) {
            byte b10 = this.f18314b;
            if (b10 == -1) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f18313a.name());
            } else if (b10 < 0) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f18314b) - 1);
                sb2.append(" of ");
                sb2.append(this.f18313a.name());
            } else {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or after ");
                sb2.append(this.f18313a.name());
                sb2.append(' ');
                sb2.append((int) this.f18314b);
            }
        } else {
            sb2.append(this.f18313a.name());
            sb2.append(' ');
            sb2.append((int) this.f18314b);
        }
        sb2.append(" at ");
        sb2.append(this.f18317e ? "24:00" : this.f18316d.toString());
        sb2.append(" ");
        sb2.append(this.f18318f);
        sb2.append(", standard offset ");
        sb2.append(this.f18319g);
        sb2.append(']');
        return sb2.toString();
    }
}
