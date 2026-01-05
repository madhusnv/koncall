package kk;

import java.io.IOException;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.d */
/* loaded from: classes.dex */
public final class C4084d extends AbstractC4103w {

    /* renamed from: a */
    public final /* synthetic */ int f20965a;

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        switch (this.f20965a) {
            case 0:
                if (c6564a.E0() != EnumC6565b.NULL) {
                    return Double.valueOf(c6564a.f0());
                }
                c6564a.A0();
                return null;
            case 1:
                if (c6564a.E0() != EnumC6565b.NULL) {
                    return Float.valueOf((float) c6564a.f0());
                }
                c6564a.A0();
                return null;
            default:
                c6564a.L0();
                return null;
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        switch (this.f20965a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C4088h.m8854a(dDoubleValue);
                    c6566c.a0(dDoubleValue);
                    break;
                } else {
                    c6566c.mo10029J();
                    break;
                }
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C4088h.m8854a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c6566c.t0(numberValueOf);
                    break;
                } else {
                    c6566c.mo10029J();
                    break;
                }
            default:
                c6566c.mo10029J();
                break;
        }
    }

    public String toString() {
        switch (this.f20965a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
