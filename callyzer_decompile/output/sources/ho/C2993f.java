package ho;

import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import or.AbstractC5453p;
import pg.a9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ho.f */
/* loaded from: classes3.dex */
public final class C2993f implements InterfaceC2988a {

    /* renamed from: a */
    public final double f16136a;

    /* renamed from: b */
    public final double f16137b;

    public C2993f(double d2, double d10) {
        this.f16136a = d2;
        this.f16137b = d10;
    }

    @Override // ho.InterfaceC2988a
    /* renamed from: a */
    public final C2992e mo7247a(AbstractC5453p field) throws NumberFormatException {
        AbstractC4154l.m8923f(field, "field");
        if (!(field.mo11151c() instanceof String)) {
            return new C2992e(false, Integer.valueOf(R.string.lead_field_validator_invalid), 4);
        }
        if (String.valueOf(field.mo11151c()).length() == 0) {
            return new C2992e(true, (Integer) null, 6);
        }
        try {
            double d2 = Double.parseDouble(String.valueOf(field.mo11151c()));
            double d10 = this.f16136a;
            if (d2 < d10) {
                return new C2992e(false, Integer.valueOf(R.string.lead_dynamic_input_value_minimum_error), (Object) a9.m11539b(d10));
            }
            double d11 = this.f16137b;
            return d2 > d11 ? new C2992e(false, Integer.valueOf(R.string.lead_dynamic_input_value_exceeds_error), (Object) a9.m11539b(d11)) : new C2992e(true, (Integer) null, 6);
        } catch (Exception unused) {
            return new C2992e(false, Integer.valueOf(R.string.lead_dynamic_input_decimal_invalid_format), 4);
        }
    }
}
