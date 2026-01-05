package p001o;

import android.graphics.Color;
import p001o.ka9;

/* loaded from: classes3.dex */
public class uh3 implements wri {

    /* renamed from: a */
    public static final uh3 f48935a = new uh3();

    @Override // p001o.wri
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo23422a(ka9 ka9Var, float f) {
        boolean z = ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_ARRAY;
        if (z) {
            ka9Var.mo22731c();
        }
        double dMo22737o = ka9Var.mo22737o();
        double dMo22737o2 = ka9Var.mo22737o();
        double dMo22737o3 = ka9Var.mo22737o();
        double dMo22737o4 = ka9Var.mo22723C() == ka9.EnumC14757b.NUMBER ? ka9Var.mo22737o() : 1.0d;
        if (z) {
            ka9Var.mo22733f();
        }
        if (dMo22737o <= 1.0d && dMo22737o2 <= 1.0d && dMo22737o3 <= 1.0d) {
            dMo22737o *= 255.0d;
            dMo22737o2 *= 255.0d;
            dMo22737o3 *= 255.0d;
            if (dMo22737o4 <= 1.0d) {
                dMo22737o4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo22737o4, (int) dMo22737o, (int) dMo22737o2, (int) dMo22737o3));
    }
}
