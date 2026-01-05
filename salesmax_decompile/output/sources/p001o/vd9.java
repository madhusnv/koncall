package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class vd9 {

    /* renamed from: a */
    public static ka9.C14756a f50157a = ka9.C14756a.m35230a("k");

    /* renamed from: a */
    public static List m52587a(ka9 ka9Var, ama amaVar, float f, wri wriVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (ka9Var.mo22723C() == ka9.EnumC14757b.STRING) {
            amaVar.m17437a("Lottie doesn't support expressions.");
            return arrayList;
        }
        ka9Var.mo22732d();
        while (ka9Var.mo22735h()) {
            if (ka9Var.mo22724H(f50157a) != 0) {
                ka9Var.mo22726K();
            } else if (ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_ARRAY) {
                ka9Var.mo22731c();
                if (ka9Var.mo22723C() == ka9.EnumC14757b.NUMBER) {
                    arrayList.add(ud9.m51377c(ka9Var, amaVar, f, wriVar, false, z));
                } else {
                    while (ka9Var.mo22735h()) {
                        arrayList.add(ud9.m51377c(ka9Var, amaVar, f, wriVar, true, z));
                    }
                }
                ka9Var.mo22733f();
            } else {
                arrayList.add(ud9.m51377c(ka9Var, amaVar, f, wriVar, false, z));
            }
        }
        ka9Var.mo22734g();
        m52588b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m52588b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            sd9 sd9Var = (sd9) list.get(i2);
            i2++;
            sd9 sd9Var2 = (sd9) list.get(i2);
            sd9Var.f45249h = Float.valueOf(sd9Var2.f45248g);
            if (sd9Var.f45244c == null && (obj = sd9Var2.f45243b) != null) {
                sd9Var.f45244c = obj;
                if (sd9Var instanceof b0d) {
                    ((b0d) sd9Var).m18083i();
                }
            }
        }
        sd9 sd9Var3 = (sd9) list.get(i);
        if ((sd9Var3.f45243b == null || sd9Var3.f45244c == null) && list.size() > 1) {
            list.remove(sd9Var3);
        }
    }
}
