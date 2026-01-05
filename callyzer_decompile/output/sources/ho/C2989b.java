package ho;

import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import or.AbstractC5453p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ho.b */
/* loaded from: classes3.dex */
public final class C2989b implements InterfaceC2988a {

    /* renamed from: a */
    public final int f16128a;

    /* renamed from: b */
    public final int f16129b;

    public C2989b(int i10, int i11) {
        this.f16128a = i10;
        this.f16129b = i11;
    }

    @Override // ho.InterfaceC2988a
    /* renamed from: a */
    public final C2992e mo7247a(AbstractC5453p field) {
        AbstractC4154l.m8923f(field, "field");
        if (!(field.mo11151c() instanceof String)) {
            return new C2992e(false, Integer.valueOf(R.string.lead_field_validator_invalid), 4);
        }
        Object objMo11151c = field.mo11151c();
        AbstractC4154l.m8921d(objMo11151c, "null cannot be cast to non-null type kotlin.String");
        String str = (String) objMo11151c;
        if (str.length() == 0) {
            return new C2992e(true, (Integer) null, 4);
        }
        int length = str.length();
        int i10 = this.f16128a;
        if (length < i10) {
            return new C2992e(false, Integer.valueOf(R.string.lead_dynamic_input_min_char_allowed), (Object) Integer.valueOf(i10));
        }
        int length2 = str.length();
        int i11 = this.f16129b;
        return length2 > i11 ? new C2992e(false, Integer.valueOf(R.string.lead_dynamic_input_max_char_allowed), (Object) Integer.valueOf(i11)) : new C2992e(true, (Integer) null, 4);
    }
}
