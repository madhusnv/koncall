package mm;

import j$.time.LocalDateTime;
import java.util.EnumSet;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.n */
/* loaded from: classes3.dex */
public final class C4803n {

    /* renamed from: a */
    public final int f23912a;

    /* renamed from: b */
    public final C4792c f23913b;

    /* renamed from: c */
    public final EnumSet f23914c;

    /* renamed from: d */
    public LocalDateTime f23915d;

    /* renamed from: e */
    public String f23916e;

    /* renamed from: f */
    public String f23917f;

    /* renamed from: g */
    public String f23918g;

    /* renamed from: h */
    public LocalDateTime f23919h;

    public C4803n(int i10, C4792c callLogDetails, EnumSet callLogSyncStatus, LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(callLogDetails, "callLogDetails");
        AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
        this.f23912a = i10;
        this.f23913b = callLogDetails;
        this.f23914c = callLogSyncStatus;
        this.f23915d = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4803n)) {
            return false;
        }
        C4803n c4803n = (C4803n) obj;
        return this.f23912a == c4803n.f23912a && AbstractC4154l.m8918a(this.f23913b, c4803n.f23913b) && AbstractC4154l.m8918a(this.f23914c, c4803n.f23914c) && AbstractC4154l.m8918a(this.f23915d, c4803n.f23915d);
    }

    public final int hashCode() {
        int iHashCode = (this.f23914c.hashCode() + ((this.f23913b.hashCode() + (Integer.hashCode(this.f23912a) * 31)) * 31)) * 31;
        LocalDateTime localDateTime = this.f23915d;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }

    public final String toString() {
        return "VerificationCallLog(id=" + this.f23912a + ", callLogDetails=" + this.f23913b + ", callLogSyncStatus=" + this.f23914c + ", modifyTime=" + this.f23915d + ")";
    }
}
