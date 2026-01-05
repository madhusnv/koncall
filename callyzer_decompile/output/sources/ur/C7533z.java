package ur;

import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.z */
/* loaded from: classes3.dex */
public final class C7533z extends f0 {

    /* renamed from: b */
    public final LocalDateTime f36279b;

    /* renamed from: c */
    public final LocalDateTime f36280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7533z(LocalDateTime customStartDate, LocalDateTime customEndDate) {
        super(R.string.custom);
        AbstractC4154l.m8923f(customStartDate, "customStartDate");
        AbstractC4154l.m8923f(customEndDate, "customEndDate");
        this.f36279b = customStartDate;
        this.f36280c = customEndDate;
    }

    @Override // ur.f0
    /* renamed from: a */
    public final LocalDateTime mo14291a() {
        return this.f36280c;
    }

    @Override // ur.f0
    /* renamed from: b */
    public final LocalDateTime mo14292b() {
        return this.f36279b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7533z)) {
            return false;
        }
        C7533z c7533z = (C7533z) obj;
        return AbstractC4154l.m8918a(this.f36279b, c7533z.f36279b) && AbstractC4154l.m8918a(this.f36280c, c7533z.f36280c);
    }

    public final int hashCode() {
        return this.f36280c.hashCode() + (this.f36279b.hashCode() * 31);
    }

    public final String toString() {
        return "CustomDate(customStartDate=" + this.f36279b + ", customEndDate=" + this.f36280c + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7533z() {
        this(C8800o.m16209r(), C8800o.m16201j());
        C8800o c8800o = C8800o.f42459a;
    }
}
