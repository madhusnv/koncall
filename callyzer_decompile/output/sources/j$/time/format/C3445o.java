package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.function.Consumer;

/* renamed from: j$.time.format.o */
/* loaded from: classes2.dex */
public final class C3445o extends C3439i {

    /* renamed from: h */
    public static final LocalDate f18184h = LocalDate.of(2000, 1, 1);

    /* renamed from: g */
    public final ChronoLocalDate f18185g;

    @Override // j$.time.format.C3439i
    /* renamed from: b */
    public final boolean mo7964b(C3451u c3451u) {
        if (c3451u.f18204c) {
            return super.mo7964b(c3451u);
        }
        return false;
    }

    public C3445o(TemporalField temporalField, int i10, int i11, ChronoLocalDate chronoLocalDate, int i12) {
        super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i12);
        this.f18185g = chronoLocalDate;
    }

    @Override // j$.time.format.C3439i
    /* renamed from: a */
    public final long mo7969a(C3453w c3453w, long j6) {
        long jAbs = Math.abs(j6);
        ChronoLocalDate chronoLocalDate = this.f18185g;
        long jMo7810h = chronoLocalDate != null ? Chronology.m7890s(c3453w.f18211a).mo7896J(chronoLocalDate).mo7810h(this.f18160a) : 0;
        long[] jArr = C3439i.f18159f;
        if (j6 >= jMo7810h) {
            long j10 = jArr[this.f18161b];
            if (j6 < jMo7810h + j10) {
                return jAbs % j10;
            }
        }
        return jAbs % jArr[this.f18162c];
    }

    @Override // j$.time.format.C3439i
    /* renamed from: c */
    public final int mo7970c(C3451u c3451u, long j6, int i10, int i11) {
        final C3445o c3445o;
        final C3451u c3451u2;
        final long j10;
        final int i12;
        final int i13;
        int iMo7810h;
        long j11;
        ChronoLocalDate chronoLocalDate = this.f18185g;
        if (chronoLocalDate != null) {
            Chronology chronology = c3451u.m7986c().f18138c;
            if (chronology == null && (chronology = c3451u.f18202a.f18115e) == null) {
                chronology = IsoChronology.INSTANCE;
            }
            iMo7810h = chronology.mo7896J(chronoLocalDate).mo7810h(this.f18160a);
            c3445o = this;
            c3451u2 = c3451u;
            j10 = j6;
            i12 = i10;
            i13 = i11;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f18179a.mo7970c(c3451u2, j10, i12, i13);
                }
            };
            if (c3451u2.f18206e == null) {
                c3451u2.f18206e = new ArrayList();
            }
            c3451u2.f18206e.add(consumer);
        } else {
            c3445o = this;
            c3451u2 = c3451u;
            j10 = j6;
            i12 = i10;
            i13 = i11;
            iMo7810h = 0;
        }
        int i14 = i13 - i12;
        int i15 = c3445o.f18161b;
        if (i14 != i15 || j10 < 0) {
            j11 = j10;
        } else {
            long j12 = C3439i.f18159f[i15];
            long j13 = iMo7810h;
            long j14 = j13 - (j13 % j12);
            long j15 = iMo7810h > 0 ? j14 + j10 : j14 - j10;
            j11 = j15 < j13 ? j15 + j12 : j15;
        }
        return c3451u2.m7989f(c3445o.f18160a, j11, i12, i13);
    }

    @Override // j$.time.format.C3439i
    /* renamed from: d */
    public final C3439i mo7965d() {
        if (this.f18164e == -1) {
            return this;
        }
        return new C3445o(this.f18160a, this.f18161b, this.f18162c, this.f18185g, -1);
    }

    @Override // j$.time.format.C3439i
    /* renamed from: e */
    public final C3439i mo7966e(int i10) {
        return new C3445o(this.f18160a, this.f18161b, this.f18162c, this.f18185g, this.f18164e + i10);
    }

    @Override // j$.time.format.C3439i
    public final String toString() {
        Object obj = this.f18185g;
        return "ReducedValue(" + this.f18160a + "," + this.f18161b + "," + this.f18162c + "," + (obj != null ? obj : 0) + ")";
    }
}
