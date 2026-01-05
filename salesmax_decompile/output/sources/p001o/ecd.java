package p001o;

import android.graphics.PointF;
import p001o.ka9;

/* loaded from: classes3.dex */
public class ecd implements wri {

    /* renamed from: a */
    public static final ecd f21395a = new ecd();

    @Override // p001o.wri
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF mo23422a(ka9 ka9Var, float f) {
        ka9.EnumC14757b enumC14757bMo22723C = ka9Var.mo22723C();
        if (enumC14757bMo22723C == ka9.EnumC14757b.BEGIN_ARRAY) {
            return eb9.m24698e(ka9Var, f);
        }
        if (enumC14757bMo22723C == ka9.EnumC14757b.BEGIN_OBJECT) {
            return eb9.m24698e(ka9Var, f);
        }
        if (enumC14757bMo22723C == ka9.EnumC14757b.NUMBER) {
            PointF pointF = new PointF(((float) ka9Var.mo22737o()) * f, ((float) ka9Var.mo22737o()) * f);
            while (ka9Var.mo22735h()) {
                ka9Var.mo22726K();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + enumC14757bMo22723C);
    }
}
