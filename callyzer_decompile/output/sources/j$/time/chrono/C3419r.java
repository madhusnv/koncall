package j$.time.chrono;

import j$.time.AbstractC3400b;
import j$.time.C3401c;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjusters;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: j$.time.chrono.r */
/* loaded from: classes2.dex */
public final class C3419r extends AbstractC3402a implements Serializable {

    /* renamed from: d */
    public static final C3419r f18092d = new C3419r();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.Chronology
    /* renamed from: r */
    public final String mo7904r() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: v */
    public final String mo7905v() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: R */
    public final ChronoLocalDate mo7899R(int i10, int i11, int i12) {
        return new C3421t(LocalDate.of(i10, i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: x */
    public final ChronoLocalDate mo7907x(int i10, int i11) {
        return new C3421t(LocalDate.e0(i10, i11));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: q */
    public final ChronoLocalDate mo7903q(long j6) {
        return new C3421t(LocalDate.d0(j6));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: N */
    public final ChronoLocalDate mo7897N() {
        return new C3421t(LocalDate.m7825I(LocalDate.c0(AbstractC3400b.m7885d())));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: J */
    public final ChronoLocalDate mo7896J(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C3421t) {
            return (C3421t) temporalAccessor;
        }
        return new C3421t(LocalDate.m7825I(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: B */
    public final List mo7892B() {
        C3422u[] c3422uArr = C3422u.f18099e;
        return AbstractC3400b.m7884c((C3422u[]) Arrays.copyOf(c3422uArr, c3422uArr.length));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: Y */
    public final boolean mo7902Y(long j6) {
        return IsoChronology.INSTANCE.mo7902Y(j6);
    }

    private C3419r() {
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: F */
    public final int mo7895F(InterfaceC3411j interfaceC3411j, int i10) {
        if (!(interfaceC3411j instanceof C3422u)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        C3422u c3422u = (C3422u) interfaceC3411j;
        int year = (c3422u.f18101b.getYear() + i10) - 1;
        if (i10 != 1 && (year < -999999999 || year > 999999999 || year < c3422u.f18101b.getYear() || interfaceC3411j != C3422u.m7931q(LocalDate.of(year, 1, 1)))) {
            throw new C3401c("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: D */
    public final InterfaceC3411j mo7893D(int i10) {
        return C3422u.m7932s(i10);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: A */
    public final C3485o mo7891A(ChronoField chronoField) {
        switch (AbstractC3418q.f18091a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C3484n("Unsupported field: " + chronoField);
            case 5:
                C3422u[] c3422uArr = C3422u.f18099e;
                int year = c3422uArr[c3422uArr.length - 1].f18101b.getYear();
                int year2 = 1000000000 - c3422uArr[c3422uArr.length - 1].f18101b.getYear();
                int year3 = c3422uArr[0].f18101b.getYear();
                int i10 = 1;
                while (true) {
                    C3422u[] c3422uArr2 = C3422u.f18099e;
                    if (i10 >= c3422uArr2.length) {
                        return C3485o.m8014g(1L, year2, 999999999 - year);
                    }
                    C3422u c3422u = c3422uArr2[i10];
                    year2 = Math.min(year2, (c3422u.f18101b.getYear() - year3) + 1);
                    year3 = c3422u.f18101b.getYear();
                    i10++;
                }
            case 6:
                C3422u c3422u2 = C3422u.f18098d;
                long j6 = ChronoField.DAY_OF_YEAR.f18248b.f18286c;
                long jMin = j6;
                for (C3422u c3422u3 : C3422u.f18099e) {
                    long jMin2 = Math.min(jMin, (c3422u3.f18101b.mo7831V() - c3422u3.f18101b.m7829Q()) + 1);
                    jMin = c3422u3.m7933r() != null ? Math.min(jMin2, c3422u3.m7933r().f18101b.m7829Q() - 1) : jMin2;
                }
                return C3485o.m8014g(1L, jMin, ChronoField.DAY_OF_YEAR.f18248b.f18287d);
            case 7:
                return C3485o.m8013f(C3421t.f18094d.getYear(), 999999999L);
            case 8:
                long j10 = C3422u.f18098d.f18100a;
                C3422u[] c3422uArr3 = C3422u.f18099e;
                return C3485o.m8013f(j10, c3422uArr3[c3422uArr3.length - 1].f18100a);
            default:
                return chronoField.f18248b;
        }
    }

    @Override // j$.time.chrono.AbstractC3402a, j$.time.chrono.Chronology
    /* renamed from: T */
    public final ChronoLocalDate mo7900T(Map map, j$.time.format.b0 b0Var) {
        return (C3421t) super.mo7900T(map, b0Var);
    }

    @Override // j$.time.chrono.AbstractC3402a
    public final ChronoLocalDate a0(Map map, j$.time.format.b0 b0Var) {
        C3421t c3421tC0;
        ChronoField chronoField = ChronoField.ERA;
        Long l9 = (Long) map.get(chronoField);
        C3422u c3422uM7932s = l9 != null ? C3422u.m7932s(mo7891A(chronoField).m8015a(l9.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l10 = (Long) map.get(chronoField2);
        int iM8015a = l10 != null ? mo7891A(chronoField2).m8015a(l10.longValue(), chronoField2) : 0;
        if (c3422uM7932s == null && l10 != null && !map.containsKey(ChronoField.YEAR) && b0Var != j$.time.format.b0.STRICT) {
            C3422u[] c3422uArr = C3422u.f18099e;
            c3422uM7932s = ((C3422u[]) Arrays.copyOf(c3422uArr, c3422uArr.length))[((C3422u[]) Arrays.copyOf(c3422uArr, c3422uArr.length)).length - 1];
        }
        if (l10 != null && c3422uM7932s != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return new C3421t(LocalDate.of((c3422uM7932s.f18101b.getYear() + iM8015a) - 1, 1, 1)).m7930X(Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).m7930X(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iM8015a2 = mo7891A(chronoField3).m8015a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iM8015a3 = mo7891A(chronoField4).m8015a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (b0Var != j$.time.format.b0.SMART) {
                        LocalDate localDate = C3421t.f18094d;
                        LocalDate localDateOf = LocalDate.of((c3422uM7932s.f18101b.getYear() + iM8015a) - 1, iM8015a2, iM8015a3);
                        if (localDateOf.isBefore(c3422uM7932s.f18101b) || c3422uM7932s != C3422u.m7931q(localDateOf)) {
                            throw new C3401c("year, month, and day not valid for Era");
                        }
                        return new C3421t(c3422uM7932s, iM8015a, localDateOf);
                    }
                    if (iM8015a < 1) {
                        throw new C3401c("Invalid YearOfEra: " + iM8015a);
                    }
                    int year = (c3422uM7932s.f18101b.getYear() + iM8015a) - 1;
                    try {
                        c3421tC0 = new C3421t(LocalDate.of(year, iM8015a2, iM8015a3));
                    } catch (C3401c unused) {
                        c3421tC0 = new C3421t(LocalDate.of(year, iM8015a2, 1)).c0(TemporalAdjusters.lastDayOfMonth());
                    }
                    if (c3421tC0.f18096b == c3422uM7932s || c3421tC0.mo7810h(ChronoField.YEAR_OF_ERA) <= 1 || iM8015a <= 1) {
                        return c3421tC0;
                    }
                    throw new C3401c("Invalid YearOfEra for Era: " + c3422uM7932s + " " + iM8015a);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (b0Var == j$.time.format.b0.LENIENT) {
                    return new C3421t(LocalDate.e0((c3422uM7932s.f18101b.getYear() + iM8015a) - 1, 1)).m7930X(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iM8015a4 = mo7891A(chronoField5).m8015a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = C3421t.f18094d;
                LocalDate localDateE0 = iM8015a == 1 ? LocalDate.e0(c3422uM7932s.f18101b.getYear(), (c3422uM7932s.f18101b.m7829Q() + iM8015a4) - 1) : LocalDate.e0((c3422uM7932s.f18101b.getYear() + iM8015a) - 1, iM8015a4);
                if (localDateE0.isBefore(c3422uM7932s.f18101b) || c3422uM7932s != C3422u.m7931q(localDateE0)) {
                    throw new C3401c("Invalid parameters");
                }
                return new C3421t(c3422uM7932s, iM8015a, localDateE0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: U */
    public final ChronoZonedDateTime mo7901U(Instant instant, ZoneId zoneId) {
        return C3410i.m7927I(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new a0((byte) 1, this);
    }
}
