package ur;

import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.y */
/* loaded from: classes3.dex */
public final class C7532y extends f0 {

    /* renamed from: b */
    public final LocalDateTime f36277b;

    /* renamed from: c */
    public final LocalDateTime f36278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7532y() {
        super(R.string.all_time);
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeM16209r = C8800o.m16209r();
        LocalDateTime localDateTimeM16201j = C8800o.m16201j();
        this.f36277b = localDateTimeM16209r;
        this.f36278c = localDateTimeM16201j;
    }

    @Override // ur.f0
    /* renamed from: a */
    public final LocalDateTime mo14291a() {
        return this.f36278c;
    }

    @Override // ur.f0
    /* renamed from: b */
    public final LocalDateTime mo14292b() {
        return this.f36277b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7532y)) {
            return false;
        }
        C7532y c7532y = (C7532y) obj;
        return AbstractC4154l.m8918a(this.f36277b, c7532y.f36277b) && AbstractC4154l.m8918a(this.f36278c, c7532y.f36278c);
    }

    public final int hashCode() {
        return this.f36278c.hashCode() + (this.f36277b.hashCode() * 31);
    }

    public final String toString() {
        return "All(allStartDate=" + this.f36277b + ", allEndDate=" + this.f36278c + ")";
    }
}
