package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.InterfaceC3482l;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: j$.time.p */
/* loaded from: classes2.dex */
public final class C3466p implements InterfaceC3482l, Serializable {

    /* renamed from: d */
    public static final C3466p f18234d = new C3466p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a */
    public final int f18235a;

    /* renamed from: b */
    public final int f18236b;

    /* renamed from: c */
    public final int f18237c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC3400b.m7884c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    /* renamed from: a */
    public static C3466p m7998a(int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return f18234d;
        }
        return new C3466p(i10, i11, i12);
    }

    public C3466p(int i10, int i11, int i12) {
        this.f18235a = i10;
        this.f18236b = i11;
        this.f18237c = i12;
    }

    @Override // j$.time.temporal.InterfaceC3482l
    /* renamed from: t */
    public final Temporal mo7815t(ChronoLocalDate chronoLocalDate) {
        Temporal temporalMo7820b;
        Chronology chronology = (Chronology) chronoLocalDate.mo7808d(AbstractC3483m.f18278b);
        if (chronology == null || IsoChronology.INSTANCE.equals(chronology)) {
            int i10 = this.f18236b;
            if (i10 != 0) {
                long j6 = (this.f18235a * 12) + i10;
                temporalMo7820b = chronoLocalDate;
                if (j6 != 0) {
                    temporalMo7820b = chronoLocalDate.mo7820b(j6, (TemporalUnit) ChronoUnit.MONTHS);
                }
            } else {
                int i11 = this.f18235a;
                temporalMo7820b = chronoLocalDate;
                if (i11 != 0) {
                    temporalMo7820b = chronoLocalDate.mo7820b(i11, (TemporalUnit) ChronoUnit.YEARS);
                }
            }
            int i12 = this.f18237c;
            return i12 != 0 ? temporalMo7820b.mo7820b(i12, ChronoUnit.DAYS) : temporalMo7820b;
        }
        throw new C3401c("Chronology mismatch, expected: ISO, actual: " + chronology.mo7904r());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3466p) {
            C3466p c3466p = (C3466p) obj;
            if (this.f18235a == c3466p.f18235a && this.f18236b == c3466p.f18236b && this.f18237c == c3466p.f18237c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f18237c, 16) + Integer.rotateLeft(this.f18236b, 8) + this.f18235a;
    }

    public final String toString() {
        if (this == f18234d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f18235a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f18236b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f18237c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C3467q((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
