package kr;

import g2.z9;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.g */
/* loaded from: classes3.dex */
public final class C4192g implements z9 {

    /* renamed from: a */
    public final /* synthetic */ LocalDateTime f21250a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f21251b;

    public C4192g(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f21250a = localDateTime;
        this.f21251b = localDateTime2;
    }

    @Override // g2.z9
    /* renamed from: a */
    public final boolean mo1460a(long j6) {
        long epochMilli;
        long epochMilli2;
        LocalDateTime localDateTime = this.f21250a;
        if (localDateTime != null) {
            C8800o c8800o = C8800o.f42459a;
            epochMilli = localDateTime.atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
        } else {
            epochMilli = Long.MIN_VALUE;
        }
        LocalDateTime localDateTime2 = this.f21251b;
        if (localDateTime2 != null) {
            C8800o c8800o2 = C8800o.f42459a;
            epochMilli2 = localDateTime2.atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
        } else {
            epochMilli2 = Long.MAX_VALUE;
        }
        return epochMilli <= j6 && j6 <= epochMilli2;
    }
}
