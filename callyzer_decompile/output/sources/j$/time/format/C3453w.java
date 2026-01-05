package j$.time.format;

import j$.time.C3401c;
import j$.time.C3429e;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.w */
/* loaded from: classes2.dex */
public final class C3453w {

    /* renamed from: a */
    public final TemporalAccessor f18211a;

    /* renamed from: b */
    public final DateTimeFormatter f18212b;

    /* renamed from: c */
    public int f18213c;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3453w(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C3453w.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    /* renamed from: b */
    public final Object m7992b(C3429e c3429e) {
        TemporalAccessor temporalAccessor = this.f18211a;
        Object objMo7808d = temporalAccessor.mo7808d(c3429e);
        if (objMo7808d != null || this.f18213c != 0) {
            return objMo7808d;
        }
        throw new C3401c("Unable to extract " + c3429e + " from temporal " + temporalAccessor);
    }

    /* renamed from: a */
    public final Long m7991a(TemporalField temporalField) {
        int i10 = this.f18213c;
        TemporalAccessor temporalAccessor = this.f18211a;
        if (i10 <= 0 || temporalAccessor.mo7811i(temporalField)) {
            return Long.valueOf(temporalAccessor.getLong(temporalField));
        }
        return null;
    }

    public final String toString() {
        return this.f18211a.toString();
    }
}
