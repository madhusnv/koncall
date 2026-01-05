package j$.time.temporal;

import j$.time.C3401c;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.time.temporal.i */
/* loaded from: classes2.dex */
public final class EnumC3479i implements TemporalField {
    public static final EnumC3479i JULIAN_DAY;
    public static final EnumC3479i MODIFIED_JULIAN_DAY;
    public static final EnumC3479i RATA_DIE;

    /* renamed from: d */
    public static final /* synthetic */ EnumC3479i[] f18270d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a */
    public final transient String f18271a;

    /* renamed from: b */
    public final transient C3485o f18272b;

    /* renamed from: c */
    public final transient long f18273c;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC3479i valueOf(String str) {
        return (EnumC3479i) Enum.valueOf(EnumC3479i.class, str);
    }

    public static EnumC3479i[] values() {
        return (EnumC3479i[]) f18270d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        EnumC3479i enumC3479i = new EnumC3479i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = enumC3479i;
        EnumC3479i enumC3479i2 = new EnumC3479i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = enumC3479i2;
        EnumC3479i enumC3479i3 = new EnumC3479i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = enumC3479i3;
        f18270d = new EnumC3479i[]{enumC3479i, enumC3479i2, enumC3479i3};
    }

    public EnumC3479i(String str, int i10, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j6) {
        this.f18271a = str2;
        this.f18272b = C3485o.m8013f((-365243219162L) + j6, 365241780471L + j6);
        this.f18273c = j6;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: K */
    public final C3485o mo8005K() {
        return this.f18272b;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: X */
    public final Temporal mo8007X(Temporal temporal, long j6) {
        if (!this.f18272b.m8019e(j6)) {
            throw new C3401c("Invalid value: " + this.f18271a + " " + j6);
        }
        return temporal.mo7819a(Math.subtractExact(j6, this.f18273c), ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: C */
    public final C3485o mo8004C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.mo7811i(ChronoField.EPOCH_DAY)) {
            return this.f18272b;
        }
        throw new C3401c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: t */
    public final boolean mo8008t(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo7811i(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: Q */
    public final long mo8006Q(TemporalAccessor temporalAccessor) {
        return temporalAccessor.getLong(ChronoField.EPOCH_DAY) + this.f18273c;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: I */
    public final TemporalAccessor mo8011I(Map map, a0 a0Var, b0 b0Var) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyM7890s = Chronology.m7890s(a0Var);
        b0 b0Var2 = b0.LENIENT;
        long j6 = this.f18273c;
        if (b0Var == b0Var2) {
            return chronologyM7890s.mo7903q(Math.subtractExact(jLongValue, j6));
        }
        this.f18272b.m8016b(jLongValue, this);
        return chronologyM7890s.mo7903q(jLongValue - j6);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18271a;
    }
}
