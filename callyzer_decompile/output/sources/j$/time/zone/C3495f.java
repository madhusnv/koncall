package j$.time.zone;

import com.sun.mail.imap.IMAPStore;
import j$.time.AbstractC3400b;
import j$.time.C3399a;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAdjusters;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: j$.time.zone.f */
/* loaded from: classes2.dex */
public final class C3495f implements Serializable {

    /* renamed from: i */
    public static final long[] f18322i = new long[0];

    /* renamed from: j */
    public static final C3494e[] f18323j = new C3494e[0];

    /* renamed from: k */
    public static final LocalDateTime[] f18324k = new LocalDateTime[0];

    /* renamed from: l */
    public static final C3491b[] f18325l = new C3491b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a */
    public final long[] f18326a;

    /* renamed from: b */
    public final ZoneOffset[] f18327b;

    /* renamed from: c */
    public final long[] f18328c;

    /* renamed from: d */
    public final LocalDateTime[] f18329d;

    /* renamed from: e */
    public final ZoneOffset[] f18330e;

    /* renamed from: f */
    public final C3494e[] f18331f;

    /* renamed from: g */
    public final TimeZone f18332g;

    /* renamed from: h */
    public final transient ConcurrentMap f18333h = new ConcurrentHashMap();

    /* renamed from: a */
    public static Object m8041a(LocalDateTime localDateTime, C3491b c3491b) {
        LocalDateTime localDateTime2 = c3491b.f18308b;
        if (c3491b.m8038t()) {
            if (localDateTime.isBefore(localDateTime2)) {
                return c3491b.f18309c;
            }
            if (!localDateTime.isBefore(c3491b.f18308b.plusSeconds(c3491b.f18310d.f18042b - c3491b.f18309c.f18042b))) {
                return c3491b.f18310d;
            }
        } else {
            if (!localDateTime.isBefore(localDateTime2)) {
                return c3491b.f18310d;
            }
            if (localDateTime.isBefore(c3491b.f18308b.plusSeconds(c3491b.f18310d.f18042b - c3491b.f18309c.f18042b))) {
                return c3491b.f18309c;
            }
        }
        return c3491b;
    }

    public C3495f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, C3494e[] c3494eArr) {
        this.f18326a = jArr;
        this.f18327b = zoneOffsetArr;
        this.f18328c = jArr2;
        this.f18330e = zoneOffsetArr2;
        this.f18331f = c3494eArr;
        if (jArr2.length == 0) {
            this.f18329d = f18324k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                C3491b c3491b = new C3491b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (c3491b.m8038t()) {
                    arrayList.add(c3491b.f18308b);
                    arrayList.add(c3491b.f18308b.plusSeconds(c3491b.f18310d.f18042b - c3491b.f18309c.f18042b));
                } else {
                    arrayList.add(c3491b.f18308b.plusSeconds(c3491b.f18310d.f18042b - c3491b.f18309c.f18042b));
                    arrayList.add(c3491b.f18308b);
                }
                i10 = i11;
            }
            this.f18329d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f18332g = null;
    }

    public C3495f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f18327b = zoneOffsetArr;
        long[] jArr = f18322i;
        this.f18326a = jArr;
        this.f18328c = jArr;
        this.f18329d = f18324k;
        this.f18330e = zoneOffsetArr;
        this.f18331f = f18323j;
        this.f18332g = null;
    }

    public C3495f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {m8043i(timeZone.getRawOffset())};
        this.f18327b = zoneOffsetArr;
        long[] jArr = f18322i;
        this.f18326a = jArr;
        this.f18328c = jArr;
        this.f18329d = f18324k;
        this.f18330e = zoneOffsetArr;
        this.f18331f = f18323j;
        this.f18332g = timeZone;
    }

    /* renamed from: i */
    public static ZoneOffset m8043i(int i10) {
        return ZoneOffset.ofTotalSeconds(i10 / IMAPStore.RESPONSE);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C3490a(this.f18332g != null ? (byte) 100 : (byte) 1, this);
    }

    /* renamed from: c */
    public static int m8042c(long j6, ZoneOffset zoneOffset) {
        return LocalDate.d0(Math.floorDiv(j6 + zoneOffset.f18042b, 86400)).getYear();
    }

    /* renamed from: h */
    public final boolean m8049h() {
        C3491b c3491b;
        TimeZone timeZone = this.f18332g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.f18332g.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            C3491b c3491b2 = null;
            if (this.f18332g != null) {
                long epochSecond = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int iM8042c = m8042c(epochSecond, m8045d(instantNow));
                C3491b[] c3491bArrM8044b = m8044b(iM8042c);
                int length = c3491bArrM8044b.length - 1;
                while (true) {
                    if (length >= 0) {
                        c3491b = c3491bArrM8044b[length];
                        if (epochSecond > c3491b.f18307a) {
                            break;
                        }
                        length--;
                    } else if (iM8042c > 1800) {
                        C3491b[] c3491bArrM8044b2 = m8044b(iM8042c - 1);
                        for (int length2 = c3491bArrM8044b2.length - 1; length2 >= 0; length2--) {
                            c3491b = c3491bArrM8044b2[length2];
                            if (epochSecond <= c3491b.f18307a) {
                            }
                        }
                        C3399a.f18047b.getClass();
                        long jMin = Math.min(epochSecond - 31104000, (System.currentTimeMillis() / 1000) + 31968000);
                        int offset = this.f18332g.getOffset((epochSecond - 1) * 1000);
                        long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                        while (true) {
                            if (epochDay > jMin) {
                                break;
                            }
                            int offset2 = this.f18332g.getOffset(jMin * 1000);
                            if (offset != offset2) {
                                int iM8042c2 = m8042c(jMin, m8043i(offset2));
                                C3491b[] c3491bArrM8044b3 = m8044b(iM8042c2 + 1);
                                int length3 = c3491bArrM8044b3.length - 1;
                                while (true) {
                                    if (length3 < 0) {
                                        C3491b[] c3491bArrM8044b4 = m8044b(iM8042c2);
                                        c3491b2 = c3491bArrM8044b4[c3491bArrM8044b4.length - 1];
                                        break;
                                    }
                                    c3491b2 = c3491bArrM8044b3[length3];
                                    if (epochSecond > c3491b2.f18307a) {
                                        break;
                                    }
                                    length3--;
                                }
                            } else {
                                jMin -= 7776000;
                            }
                        }
                    }
                }
                c3491b2 = c3491b;
            } else if (this.f18328c.length != 0) {
                long epochSecond2 = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.f18328c;
                long j6 = jArr[jArr.length - 1];
                if (this.f18331f.length <= 0 || epochSecond2 <= j6) {
                    int iBinarySearch = Arrays.binarySearch(this.f18328c, epochSecond2);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    if (iBinarySearch > 0) {
                        int i10 = iBinarySearch - 1;
                        long j10 = this.f18328c[i10];
                        ZoneOffset[] zoneOffsetArr = this.f18330e;
                        c3491b2 = new C3491b(j10, zoneOffsetArr[i10], zoneOffsetArr[iBinarySearch]);
                    }
                } else {
                    ZoneOffset[] zoneOffsetArr2 = this.f18330e;
                    ZoneOffset zoneOffset = zoneOffsetArr2[zoneOffsetArr2.length - 1];
                    int iM8042c3 = m8042c(epochSecond2, zoneOffset);
                    C3491b[] c3491bArrM8044b5 = m8044b(iM8042c3);
                    int length4 = c3491bArrM8044b5.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i11 = iM8042c3 - 1;
                            if (i11 > m8042c(j6, zoneOffset)) {
                                C3491b[] c3491bArrM8044b6 = m8044b(i11);
                                c3491b2 = c3491bArrM8044b6[c3491bArrM8044b6.length - 1];
                            }
                        } else {
                            C3491b c3491b3 = c3491bArrM8044b5[length4];
                            if (epochSecond2 > c3491b3.f18307a) {
                                c3491b2 = c3491b3;
                                break;
                            }
                            length4--;
                        }
                    }
                }
            }
            if (c3491b2 != null) {
                return false;
            }
        } else if (this.f18328c.length != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final ZoneOffset m8045d(Instant instant) {
        TimeZone timeZone = this.f18332g;
        if (timeZone != null) {
            return m8043i(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f18328c.length == 0) {
            return this.f18327b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f18331f.length > 0) {
            if (epochSecond > this.f18328c[r7.length - 1]) {
                C3491b[] c3491bArrM8044b = m8044b(m8042c(epochSecond, this.f18330e[r7.length - 1]));
                C3491b c3491b = null;
                for (int i10 = 0; i10 < c3491bArrM8044b.length; i10++) {
                    c3491b = c3491bArrM8044b[i10];
                    if (epochSecond < c3491b.f18307a) {
                        return c3491b.f18309c;
                    }
                }
                return c3491b.f18310d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f18328c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f18330e[iBinarySearch + 1];
    }

    /* renamed from: f */
    public final List m8047f(LocalDateTime localDateTime) {
        Object objM8046e = m8046e(localDateTime);
        if (!(objM8046e instanceof C3491b)) {
            return Collections.singletonList((ZoneOffset) objM8046e);
        }
        C3491b c3491b = (C3491b) objM8046e;
        return c3491b.m8038t() ? Collections.EMPTY_LIST : AbstractC3400b.m7884c(new Object[]{c3491b.f18309c, c3491b.f18310d});
    }

    /* renamed from: e */
    public final Object m8046e(LocalDateTime localDateTime) {
        Object obj = null;
        int i10 = 0;
        if (this.f18332g != null) {
            C3491b[] c3491bArrM8044b = m8044b(localDateTime.getYear());
            if (c3491bArrM8044b.length == 0) {
                return m8043i(this.f18332g.getOffset(localDateTime.toEpochSecond(this.f18327b[0]) * 1000));
            }
            int length = c3491bArrM8044b.length;
            while (i10 < length) {
                C3491b c3491b = c3491bArrM8044b[i10];
                Object objM8041a = m8041a(localDateTime, c3491b);
                if ((objM8041a instanceof C3491b) || objM8041a.equals(c3491b.f18309c)) {
                    return objM8041a;
                }
                i10++;
                obj = objM8041a;
            }
            return obj;
        }
        if (this.f18328c.length == 0) {
            return this.f18327b[0];
        }
        if (this.f18331f.length > 0) {
            if (localDateTime.isAfter(this.f18329d[r0.length - 1])) {
                C3491b[] c3491bArrM8044b2 = m8044b(localDateTime.getYear());
                int length2 = c3491bArrM8044b2.length;
                while (i10 < length2) {
                    C3491b c3491b2 = c3491bArrM8044b2[i10];
                    Object objM8041a2 = m8041a(localDateTime, c3491b2);
                    if ((objM8041a2 instanceof C3491b) || objM8041a2.equals(c3491b2.f18309c)) {
                        return objM8041a2;
                    }
                    i10++;
                    obj = objM8041a2;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f18329d, localDateTime);
        if (iBinarySearch == -1) {
            return this.f18330e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f18329d;
            if (iBinarySearch < objArr.length - 1) {
                int i11 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i11])) {
                    iBinarySearch = i11;
                }
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime[] localDateTimeArr = this.f18329d;
            LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f18330e;
            int i12 = iBinarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i12];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i12 + 1];
            if (zoneOffset2.f18042b > zoneOffset.f18042b) {
                return new C3491b(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new C3491b(localDateTime3, zoneOffset, zoneOffset2);
        }
        return this.f18330e[(iBinarySearch / 2) + 1];
    }

    /* renamed from: b */
    public final C3491b[] m8044b(int i10) {
        LocalDate localDateM7824C;
        C3491b[] c3491bArr = f18325l;
        Integer numValueOf = Integer.valueOf(i10);
        C3491b[] c3491bArr2 = (C3491b[]) ((ConcurrentHashMap) this.f18333h).get(numValueOf);
        if (c3491bArr2 != null) {
            return c3491bArr2;
        }
        int i11 = 0;
        if (this.f18332g != null) {
            if (i10 < 1800) {
                return c3491bArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f18023c;
            long epochSecond = new LocalDateTime(LocalDate.of(i10 - 1, 12, 31), LocalTime.of(0, 0)).toEpochSecond(this.f18327b[0]);
            long j6 = 1000;
            int offset = this.f18332g.getOffset(epochSecond * 1000);
            long j10 = 31968000 + epochSecond;
            while (epochSecond < j10) {
                long j11 = epochSecond + 7776000;
                long j12 = j6;
                if (offset != this.f18332g.getOffset(j11 * j12)) {
                    while (j11 - epochSecond > 1) {
                        long j13 = epochSecond;
                        long jFloorDiv = Math.floorDiv(j11 + epochSecond, 2L);
                        if (this.f18332g.getOffset(jFloorDiv * j12) == offset) {
                            epochSecond = jFloorDiv;
                        } else {
                            j11 = jFloorDiv;
                            epochSecond = j13;
                        }
                    }
                    long j14 = epochSecond;
                    epochSecond = this.f18332g.getOffset(j14 * j12) != offset ? j14 : j11;
                    ZoneOffset zoneOffsetM8043i = m8043i(offset);
                    int offset2 = this.f18332g.getOffset(epochSecond * j12);
                    ZoneOffset zoneOffsetM8043i2 = m8043i(offset2);
                    if (m8042c(epochSecond, zoneOffsetM8043i2) == i10) {
                        c3491bArr = (C3491b[]) Arrays.copyOf(c3491bArr, c3491bArr.length + 1);
                        c3491bArr[c3491bArr.length - 1] = new C3491b(epochSecond, zoneOffsetM8043i, zoneOffsetM8043i2);
                    }
                    offset = offset2;
                } else {
                    epochSecond = j11;
                }
                j6 = j12;
            }
            if (1916 <= i10 && i10 < 2100) {
                ((ConcurrentHashMap) this.f18333h).putIfAbsent(numValueOf, c3491bArr);
            }
            return c3491bArr;
        }
        int i12 = 1;
        C3494e[] c3494eArr = this.f18331f;
        C3491b[] c3491bArr3 = new C3491b[c3494eArr.length];
        while (i11 < c3494eArr.length) {
            C3494e c3494e = c3494eArr[i11];
            byte b10 = c3494e.f18314b;
            if (b10 < 0) {
                Month month = c3494e.f18313a;
                long j15 = i10;
                int iM7855C = month.m7855C(IsoChronology.INSTANCE.mo7902Y(j15)) + 1 + c3494e.f18314b;
                LocalDate localDate = LocalDate.MIN;
                ChronoField.YEAR.a0(j15);
                ChronoField.DAY_OF_MONTH.a0(iM7855C);
                localDateM7824C = LocalDate.m7824C(i10, month.getValue(), iM7855C);
                DayOfWeek dayOfWeek = c3494e.f18315c;
                if (dayOfWeek != null) {
                    localDateM7824C = localDateM7824C.mo7844j(TemporalAdjusters.previousOrSame(dayOfWeek));
                }
            } else {
                Month month2 = c3494e.f18313a;
                LocalDate localDate2 = LocalDate.MIN;
                ChronoField.YEAR.a0(i10);
                ChronoField.DAY_OF_MONTH.a0(b10);
                localDateM7824C = LocalDate.m7824C(i10, month2.getValue(), b10);
                DayOfWeek dayOfWeek2 = c3494e.f18315c;
                if (dayOfWeek2 != null) {
                    localDateM7824C = localDateM7824C.mo7844j(TemporalAdjusters.nextOrSame(dayOfWeek2));
                }
            }
            if (c3494e.f18317e) {
                localDateM7824C = localDateM7824C.plusDays(1L);
            }
            LocalDateTime localDateTimeOf = LocalDateTime.of(localDateM7824C, c3494e.f18316d);
            EnumC3493d enumC3493d = c3494e.f18318f;
            ZoneOffset zoneOffset = c3494e.f18319g;
            ZoneOffset zoneOffset2 = c3494e.f18320h;
            int i13 = AbstractC3492c.f18311a[enumC3493d.ordinal()];
            int i14 = i12;
            if (i13 == i14) {
                localDateTimeOf = localDateTimeOf.plusSeconds(zoneOffset2.f18042b - ZoneOffset.UTC.f18042b);
            } else if (i13 == 2) {
                localDateTimeOf = localDateTimeOf.plusSeconds(zoneOffset2.f18042b - zoneOffset.f18042b);
            }
            c3491bArr3[i11] = new C3491b(localDateTimeOf, c3494e.f18320h, c3494e.f18321i);
            i11++;
            i12 = i14;
        }
        if (i10 < 2100) {
            ((ConcurrentHashMap) this.f18333h).putIfAbsent(numValueOf, c3491bArr3);
        }
        return c3491bArr3;
    }

    /* renamed from: g */
    public final boolean m8048g(Instant instant) {
        ZoneOffset zoneOffsetM8043i;
        TimeZone timeZone = this.f18332g;
        if (timeZone != null) {
            zoneOffsetM8043i = m8043i(timeZone.getRawOffset());
        } else if (this.f18328c.length == 0) {
            zoneOffsetM8043i = this.f18327b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f18326a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetM8043i = this.f18327b[iBinarySearch + 1];
        }
        return !zoneOffsetM8043i.equals(m8045d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3495f) {
            C3495f c3495f = (C3495f) obj;
            if (Objects.equals(this.f18332g, c3495f.f18332g) && Arrays.equals(this.f18326a, c3495f.f18326a) && Arrays.equals(this.f18327b, c3495f.f18327b) && Arrays.equals(this.f18328c, c3495f.f18328c) && Arrays.equals(this.f18330e, c3495f.f18330e) && Arrays.equals(this.f18331f, c3495f.f18331f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f18332g) ^ Arrays.hashCode(this.f18326a)) ^ Arrays.hashCode(this.f18327b)) ^ Arrays.hashCode(this.f18328c)) ^ Arrays.hashCode(this.f18330e)) ^ Arrays.hashCode(this.f18331f);
    }

    public final String toString() {
        TimeZone timeZone = this.f18332g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f18327b[r0.length - 1] + "]";
    }
}
