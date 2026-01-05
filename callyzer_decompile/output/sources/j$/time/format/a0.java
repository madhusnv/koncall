package j$.time.format;

import j$.time.AbstractC3428d;
import j$.time.C3401c;
import j$.time.C3429e;
import j$.time.C3466p;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a0 implements TemporalAccessor {

    /* renamed from: b */
    public ZoneId f18137b;

    /* renamed from: c */
    public Chronology f18138c;

    /* renamed from: d */
    public boolean f18139d;

    /* renamed from: e */
    public b0 f18140e;

    /* renamed from: f */
    public ChronoLocalDate f18141f;

    /* renamed from: g */
    public LocalTime f18142g;

    /* renamed from: a */
    public final Map f18136a = new HashMap();

    /* renamed from: h */
    public C3466p f18143h = C3466p.f18234d;

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        if (((HashMap) this.f18136a).containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f18141f;
        if (chronoLocalDate != null && chronoLocalDate.mo7811i(temporalField)) {
            return true;
        }
        LocalTime localTime = this.f18142g;
        if (localTime == null || !localTime.mo7811i(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.mo8008t(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l9 = (Long) ((HashMap) this.f18136a).get(temporalField);
        if (l9 != null) {
            return l9.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f18141f;
        if (chronoLocalDate != null && chronoLocalDate.mo7811i(temporalField)) {
            return this.f18141f.getLong(temporalField);
        }
        LocalTime localTime = this.f18142g;
        if (localTime != null && localTime.mo7811i(temporalField)) {
            return this.f18142g.getLong(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
        return temporalField.mo8006Q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18277a) {
            return this.f18137b;
        }
        if (c3429e == AbstractC3483m.f18278b) {
            return this.f18138c;
        }
        if (c3429e == AbstractC3483m.f18282f) {
            ChronoLocalDate chronoLocalDate = this.f18141f;
            if (chronoLocalDate != null) {
                return LocalDate.m7825I(chronoLocalDate);
            }
            return null;
        }
        if (c3429e == AbstractC3483m.f18283g) {
            return this.f18142g;
        }
        if (c3429e == AbstractC3483m.f18280d) {
            Long l9 = (Long) ((HashMap) this.f18136a).get(ChronoField.OFFSET_SECONDS);
            if (l9 != null) {
                return ZoneOffset.ofTotalSeconds(l9.intValue());
            }
            ZoneId zoneId = this.f18137b;
            return zoneId instanceof ZoneOffset ? zoneId : c3429e.m7936l(this);
        }
        if (c3429e == AbstractC3483m.f18281e) {
            return c3429e.m7936l(this);
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return null;
        }
        return c3429e.m7936l(this);
    }

    /* renamed from: A */
    public final void m7954A(TemporalField temporalField, ChronoField chronoField, Long l9) {
        Long l10 = (Long) ((HashMap) this.f18136a).put(chronoField, l9);
        if (l10 == null || l10.longValue() == l9.longValue()) {
            return;
        }
        throw new C3401c("Conflict found: " + chronoField + " " + l10 + " differs from " + chronoField + " " + l9 + " while resolving  " + temporalField);
    }

    /* renamed from: r */
    public final void m7956r() {
        if (((HashMap) this.f18136a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f18137b;
            if (zoneId != null) {
                m7957s(zoneId);
                return;
            }
            Long l9 = (Long) ((HashMap) this.f18136a).get(ChronoField.OFFSET_SECONDS);
            if (l9 != null) {
                m7957s(ZoneOffset.ofTotalSeconds(l9.intValue()));
            }
        }
    }

    /* renamed from: s */
    public final void m7957s(ZoneId zoneId) {
        Map map = this.f18136a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        m7961x(this.f18138c.mo7901U(Instant.ofEpochSecond(((Long) ((HashMap) map).remove(chronoField)).longValue()), zoneId).mo7878m());
        m7954A(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.mo7877k().h0()));
    }

    /* renamed from: x */
    public final void m7961x(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f18141f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new C3401c("Conflict found: Fields resolved to two different dates: " + this.f18141f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f18138c.equals(chronoLocalDate.mo7834g())) {
                throw new C3401c("ChronoLocalDate must use the effective parsed chronology: " + this.f18138c);
            }
            this.f18141f = chronoLocalDate;
        }
    }

    /* renamed from: v */
    public final void m7959v() {
        Map map = this.f18136a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long jLongValue = ((Long) ((HashMap) this.f18136a).remove(chronoField)).longValue();
            b0 b0Var = this.f18140e;
            if (b0Var == b0.STRICT || (b0Var == b0.SMART && jLongValue != 0)) {
                chronoField.a0(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            m7954A(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f18136a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f18136a).remove(chronoField3)).longValue();
            b0 b0Var2 = this.f18140e;
            if (b0Var2 == b0.STRICT || (b0Var2 == b0.SMART && jLongValue2 != 0)) {
                chronoField3.a0(jLongValue2);
            }
            m7954A(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f18136a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.f18136a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f18136a).remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f18136a).remove(chronoField5)).longValue();
                if (this.f18140e == b0.LENIENT) {
                    m7954A(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.a0(jLongValue3);
                    chronoField5.a0(jLongValue3);
                    m7954A(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f18136a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f18136a).remove(chronoField6)).longValue();
            if (this.f18140e != b0.LENIENT) {
                chronoField6.a0(jLongValue5);
            }
            m7954A(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            m7954A(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            m7954A(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            m7954A(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f18136a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f18136a).remove(chronoField7)).longValue();
            if (this.f18140e != b0.LENIENT) {
                chronoField7.a0(jLongValue6);
            }
            m7954A(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            m7954A(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f18136a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f18136a).remove(chronoField8)).longValue();
            if (this.f18140e != b0.LENIENT) {
                chronoField8.a0(jLongValue7);
            }
            m7954A(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            m7954A(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f18136a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f18136a).remove(chronoField9)).longValue();
            if (this.f18140e != b0.LENIENT) {
                chronoField9.a0(jLongValue8);
            }
            m7954A(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            m7954A(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            m7954A(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f18136a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f18136a).remove(chronoField10)).longValue();
            if (this.f18140e != b0.LENIENT) {
                chronoField10.a0(jLongValue9);
            }
            m7954A(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            m7954A(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f18136a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f18136a).get(chronoField11)).longValue();
            b0 b0Var3 = this.f18140e;
            b0 b0Var4 = b0.LENIENT;
            if (b0Var3 != b0Var4) {
                chronoField11.a0(jLongValue10);
            }
            Map map11 = this.f18136a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f18136a).remove(chronoField12)).longValue();
                if (this.f18140e != b0Var4) {
                    chronoField12.a0(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                m7954A(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f18136a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f18136a).remove(chronoField13)).longValue();
                if (this.f18140e != b0Var4) {
                    chronoField13.a0(jLongValue12);
                }
                m7954A(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f18136a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.f18136a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.f18136a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.f18136a).containsKey(chronoField11)) {
                    m7958t(((Long) ((HashMap) this.f18136a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.f18136a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.f18136a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.f18136a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    /* renamed from: t */
    public final void m7958t(long j6, long j10, long j11, long j12) {
        if (this.f18140e == b0.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j6, 3600000000000L), Math.multiplyExact(j10, 60000000000L)), Math.multiplyExact(j11, 1000000000L)), j12);
            m7960w(LocalTime.m7851X(Math.floorMod(jAddExact, 86400000000000L)), C3466p.m7998a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iM8015a = chronoField.f18248b.m8015a(j10, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iM8015a2 = chronoField2.f18248b.m8015a(j12, chronoField2);
        if (this.f18140e == b0.SMART && j6 == 24 && iM8015a == 0 && j11 == 0 && iM8015a2 == 0) {
            m7960w(LocalTime.MIDNIGHT, C3466p.m7998a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iM8015a3 = chronoField3.f18248b.m8015a(j6, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        m7960w(LocalTime.m7850Q(iM8015a3, iM8015a, chronoField4.f18248b.m8015a(j11, chronoField4), iM8015a2), C3466p.f18234d);
    }

    /* renamed from: w */
    public final void m7960w(LocalTime localTime, C3466p c3466p) {
        LocalTime localTime2 = this.f18142g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new C3401c("Conflict found: Fields resolved to different times: " + this.f18142g + " " + localTime);
            }
            C3466p c3466p2 = this.f18143h;
            c3466p2.getClass();
            C3466p c3466p3 = C3466p.f18234d;
            if (c3466p2 != c3466p3 && c3466p != c3466p3 && !this.f18143h.equals(c3466p)) {
                throw new C3401c("Conflict found: Fields resolved to different excess periods: " + this.f18143h + " " + c3466p);
            }
            this.f18143h = c3466p;
            return;
        }
        this.f18142g = localTime;
        this.f18143h = c3466p;
    }

    /* renamed from: q */
    public final void m7955q(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f18136a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.mo7811i(temporalField)) {
                try {
                    long j6 = temporalAccessor.getLong(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (j6 != jLongValue) {
                        throw new C3401c("Conflict found: Field " + temporalField + " " + j6 + " differs from " + temporalField + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f18136a);
        sb2.append(',');
        sb2.append(this.f18138c);
        if (this.f18137b != null) {
            sb2.append(',');
            sb2.append(this.f18137b);
        }
        if (this.f18141f != null || this.f18142g != null) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f18141f;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f18142g != null) {
                    sb2.append('T');
                    sb2.append(this.f18142g);
                }
            } else {
                sb2.append(this.f18142g);
            }
        }
        return sb2.toString();
    }
}
