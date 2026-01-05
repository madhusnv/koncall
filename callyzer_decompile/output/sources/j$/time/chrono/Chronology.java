package j$.time.chrono;

import j$.time.C3401c;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public interface Chronology extends Comparable<Chronology> {
    /* renamed from: A */
    C3485o mo7891A(ChronoField chronoField);

    /* renamed from: B */
    List mo7892B();

    /* renamed from: D */
    InterfaceC3411j mo7893D(int i10);

    @Override // java.lang.Comparable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);

    /* renamed from: F */
    int mo7895F(InterfaceC3411j interfaceC3411j, int i10);

    /* renamed from: J */
    ChronoLocalDate mo7896J(TemporalAccessor temporalAccessor);

    /* renamed from: N */
    ChronoLocalDate mo7897N();

    /* renamed from: R */
    ChronoLocalDate mo7899R(int i10, int i11, int i12);

    /* renamed from: T */
    ChronoLocalDate mo7900T(Map map, j$.time.format.b0 b0Var);

    /* renamed from: Y */
    boolean mo7902Y(long j6);

    boolean equals(Object obj);

    int hashCode();

    /* renamed from: q */
    ChronoLocalDate mo7903q(long j6);

    /* renamed from: r */
    String mo7904r();

    String toString();

    /* renamed from: v */
    String mo7905v();

    /* renamed from: x */
    ChronoLocalDate mo7907x(int i10, int i11);

    /* renamed from: s */
    static Chronology m7890s(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.mo7808d(AbstractC3483m.f18278b);
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(isoChronology, "defaultObj");
        return isoChronology;
    }

    static Chronology ofLocale(Locale locale) {
        return AbstractC3402a.ofLocale(locale);
    }

    static Chronology of(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC3402a.f18049a;
        Objects.requireNonNull(str, "id");
        do {
            Chronology chronology = (Chronology) AbstractC3402a.f18049a.get(str);
            if (chronology == null) {
                chronology = (Chronology) AbstractC3402a.f18050b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (AbstractC3402a.m7910C());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (str.equals(chronology2.mo7904r()) || str.equals(chronology2.mo7905v())) {
                return chronology2;
            }
        }
        throw new C3401c("Unknown chronology: ".concat(str));
    }

    /* renamed from: O */
    default ChronoLocalDateTime mo7898O(TemporalAccessor temporalAccessor) {
        try {
            return mo7896J(temporalAccessor).mo7827M(LocalTime.m7849I(temporalAccessor));
        } catch (C3401c e2) {
            throw new C3401c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    /* renamed from: w */
    default ChronoZonedDateTime mo7906w(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdM7864t = ZoneId.m7864t(temporalAccessor);
            try {
                temporalAccessor = mo7901U(Instant.from(temporalAccessor), zoneIdM7864t);
                return temporalAccessor;
            } catch (C3401c unused) {
                return C3410i.m7926C(zoneIdM7864t, null, C3406e.m7919t(this, mo7898O(temporalAccessor)));
            }
        } catch (C3401c e2) {
            throw new C3401c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e2);
        }
    }

    /* renamed from: U */
    default ChronoZonedDateTime mo7901U(Instant instant, ZoneId zoneId) {
        return C3410i.m7927I(this, instant, zoneId);
    }
}
