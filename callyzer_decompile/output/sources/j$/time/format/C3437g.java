package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* renamed from: j$.time.format.g */
/* loaded from: classes2.dex */
public final class C3437g implements InterfaceC3435e {
    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        Long lM7991a = c3453w.m7991a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = c3453w.f18211a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.mo7811i(chronoField) ? Long.valueOf(temporalAccessor.getLong(chronoField)) : null;
        int i10 = 0;
        if (lM7991a == null) {
            return false;
        }
        long jLongValue = lM7991a.longValue();
        int iM8015a = chronoField.f18248b.m8015a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
        if (jLongValue >= -62167219200L) {
            long j6 = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j6, 315569520000L) + 1;
            LocalDateTime localDateTimeM7839I = LocalDateTime.m7839I(Math.floorMod(j6, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb2.append('+');
                sb2.append(jFloorDiv);
            }
            sb2.append(localDateTimeM7839I);
            if (localDateTimeM7839I.getSecond() == 0) {
                sb2.append(":00");
            }
        } else {
            long j10 = jLongValue + 62167219200L;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            LocalDateTime localDateTimeM7839I2 = LocalDateTime.m7839I(j12 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(localDateTimeM7839I2);
            if (localDateTimeM7839I2.getSecond() == 0) {
                sb2.append(":00");
            }
            if (j11 < 0) {
                if (localDateTimeM7839I2.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb2.insert(length, j11);
                } else {
                    sb2.insert(length + 1, Math.abs(j11));
                }
            }
        }
        if (iM8015a > 0) {
            sb2.append('.');
            int i11 = 100000000;
            while (true) {
                if (iM8015a <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = iM8015a / i11;
                sb2.append((char) (i12 + 48));
                iM8015a -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return true;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m7939a(DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i13 = 0;
        dateTimeFormatterBuilderAppendValue.m7940b(chronoField4, 0, 9, true);
        C3434d c3434d = dateTimeFormatterBuilderAppendValue.appendLiteral(Matrix.MATRIX_TYPE_ZERO).toFormatter().f18111a;
        if (c3434d.f18155b) {
            c3434d = new C3434d(c3434d.f18154a, false);
        }
        C3451u c3451u2 = new C3451u(c3451u.f18202a);
        c3451u2.f18203b = c3451u.f18203b;
        c3451u2.f18204c = c3451u.f18204c;
        int iMo7962C = c3434d.mo7962C(c3451u2, charSequence, i10);
        if (iMo7962C < 0) {
            return iMo7962C;
        }
        long jLongValue = c3451u2.m7987d(ChronoField.YEAR).longValue();
        int iIntValue = c3451u2.m7987d(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = c3451u2.m7987d(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = c3451u2.m7987d(chronoField).intValue();
        int iIntValue4 = c3451u2.m7987d(chronoField2).intValue();
        Long lM7987d = c3451u2.m7987d(chronoField3);
        Long lM7987d2 = c3451u2.m7987d(chronoField4);
        int iIntValue5 = lM7987d != null ? lM7987d.intValue() : 0;
        int iIntValue6 = lM7987d2 != null ? lM7987d2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i11 = 0;
            i12 = iIntValue5;
            i13 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            c3451u.m7986c().f18139d = true;
            i11 = iIntValue3;
            i12 = 59;
        } else {
            i11 = iIntValue3;
            i12 = iIntValue5;
        }
        try {
            return c3451u.m7989f(chronoField4, iIntValue6, i10, c3451u.m7989f(ChronoField.INSTANT_SECONDS, LocalDateTime.of(((int) jLongValue) % 10000, iIntValue, iIntValue2, i11, iIntValue4, i12, 0).plusDays(i13).toEpochSecond(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i10, iMo7962C));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
