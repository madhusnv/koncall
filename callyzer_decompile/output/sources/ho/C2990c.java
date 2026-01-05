package ho;

import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDate;
import kotlin.jvm.internal.AbstractC4154l;
import or.AbstractC5453p;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ho.c */
/* loaded from: classes3.dex */
public final class C2990c implements InterfaceC2988a {

    /* renamed from: a */
    public final LocalDate f16130a;

    /* renamed from: b */
    public final LocalDate f16131b;

    public C2990c(LocalDate localDate, LocalDate localDate2) {
        this.f16130a = localDate;
        this.f16131b = localDate2;
    }

    @Override // ho.InterfaceC2988a
    /* renamed from: a */
    public final C2992e mo7247a(AbstractC5453p field) {
        AbstractC4154l.m8923f(field, "field");
        if (!(field.mo11151c() instanceof Long)) {
            return new C2992e(false, Integer.valueOf(R.string.lead_field_validator_invalid), 4);
        }
        Object objMo11151c = field.mo11151c();
        AbstractC4154l.m8921d(objMo11151c, "null cannot be cast to non-null type kotlin.Long");
        if (((Long) objMo11151c).longValue() <= 0) {
            return new C2992e(true, (Integer) null, 6);
        }
        C8800o c8800o = C8800o.f42459a;
        Object objMo11151c2 = field.mo11151c();
        AbstractC4154l.m8921d(objMo11151c2, "null cannot be cast to non-null type kotlin.Long");
        LocalDate localDateM16180D = C8800o.m16180D(((Long) objMo11151c2).longValue());
        LocalDate localDate = this.f16130a;
        if (localDateM16180D.isBefore(localDate)) {
            return new C2992e(false, Integer.valueOf(R.string.lead_dynamic_date_not_earlier), (Object) C8800o.m16195d(localDate));
        }
        LocalDate localDate2 = this.f16131b;
        return localDateM16180D.isAfter(localDate2) ? new C2992e(false, Integer.valueOf(R.string.lead_dynamic_date_not_later_than), (Object) C8800o.m16195d(localDate2)) : new C2992e(true, (Integer) null, 6);
    }
}
