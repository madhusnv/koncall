package j$.time.format;

import j$.time.C3429e;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3485o;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.v */
/* loaded from: classes2.dex */
public final class C3452v implements TemporalAccessor {

    /* renamed from: a */
    public final /* synthetic */ ChronoLocalDate f18207a;

    /* renamed from: b */
    public final /* synthetic */ TemporalAccessor f18208b;

    /* renamed from: c */
    public final /* synthetic */ Chronology f18209c;

    /* renamed from: d */
    public final /* synthetic */ ZoneId f18210d;

    public C3452v(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f18207a = chronoLocalDate;
        this.f18208b = temporalAccessor;
        this.f18209c = chronology;
        this.f18210d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f18207a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.mo7811i(temporalField);
        }
        return this.f18208b.mo7811i(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f18207a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.mo7812l(temporalField);
        }
        return this.f18208b.mo7812l(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f18207a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.getLong(temporalField);
        }
        return this.f18208b.getLong(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18278b) {
            return this.f18209c;
        }
        if (c3429e == AbstractC3483m.f18277a) {
            return this.f18210d;
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return this.f18208b.mo7808d(c3429e);
        }
        return c3429e.m7936l(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        Chronology chronology = this.f18209c;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f18210d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f18208b + str + str2;
    }
}
