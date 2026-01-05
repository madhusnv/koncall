package j$.time.chrono;

import j$.time.AbstractC3400b;
import j$.time.C3401c;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.InterfaceC3482l;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.f */
/* loaded from: classes2.dex */
public final class C3407f implements InterfaceC3482l, Serializable {

    /* renamed from: e */
    public static final /* synthetic */ int f18062e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a */
    public final Chronology f18063a;

    /* renamed from: b */
    public final int f18064b;

    /* renamed from: c */
    public final int f18065c;

    /* renamed from: d */
    public final int f18066d;

    static {
        AbstractC3400b.m7884c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C3407f(Chronology chronology, int i10, int i11, int i12) {
        this.f18063a = chronology;
        this.f18064b = i10;
        this.f18065c = i11;
        this.f18066d = i12;
    }

    public final String toString() {
        if (this.f18064b == 0 && this.f18065c == 0 && this.f18066d == 0) {
            return this.f18063a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18063a.toString());
        sb2.append(" P");
        int i10 = this.f18064b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f18065c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f18066d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.InterfaceC3482l
    /* renamed from: t */
    public final Temporal mo7815t(ChronoLocalDate chronoLocalDate) {
        Temporal temporalMo7820b;
        Chronology chronology = (Chronology) chronoLocalDate.mo7808d(AbstractC3483m.f18278b);
        if (chronology == null || this.f18063a.equals(chronology)) {
            if (this.f18065c != 0) {
                C3485o c3485oMo7891A = this.f18063a.mo7891A(ChronoField.MONTH_OF_YEAR);
                long j6 = (c3485oMo7891A.f18284a == c3485oMo7891A.f18285b && c3485oMo7891A.f18286c == c3485oMo7891A.f18287d && c3485oMo7891A.m8018d()) ? (c3485oMo7891A.f18287d - c3485oMo7891A.f18284a) + 1 : -1L;
                if (j6 > 0) {
                    temporalMo7820b = chronoLocalDate.mo7820b((this.f18064b * j6) + this.f18065c, (TemporalUnit) ChronoUnit.MONTHS);
                } else {
                    int i10 = this.f18064b;
                    Temporal temporalMo7820b2 = chronoLocalDate;
                    if (i10 != 0) {
                        temporalMo7820b2 = chronoLocalDate.mo7820b(i10, (TemporalUnit) ChronoUnit.YEARS);
                    }
                    temporalMo7820b = temporalMo7820b2.mo7820b(this.f18065c, ChronoUnit.MONTHS);
                }
            } else {
                int i11 = this.f18064b;
                temporalMo7820b = chronoLocalDate;
                if (i11 != 0) {
                    temporalMo7820b = chronoLocalDate.mo7820b(i11, (TemporalUnit) ChronoUnit.YEARS);
                }
            }
            int i12 = this.f18066d;
            return i12 != 0 ? temporalMo7820b.mo7820b(i12, ChronoUnit.DAYS) : temporalMo7820b;
        }
        throw new C3401c("Chronology mismatch, expected: " + this.f18063a.mo7904r() + ", actual: " + chronology.mo7904r());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3407f) {
            C3407f c3407f = (C3407f) obj;
            if (this.f18064b == c3407f.f18064b && this.f18065c == c3407f.f18065c && this.f18066d == c3407f.f18066d && this.f18063a.equals(c3407f.f18063a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f18066d, 16) + (Integer.rotateLeft(this.f18065c, 8) + this.f18064b)) ^ this.f18063a.hashCode();
    }

    public Object writeReplace() {
        return new a0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
