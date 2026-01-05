package p001o;

import java.util.ArrayList;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class jg0 {

    /* renamed from: a */
    public static final ka9.C14756a f30378a = ka9.C14756a.m35230a("k", "x", "y");

    /* renamed from: a */
    public static ig0 m33783a(ka9 ka9Var, ama amaVar) {
        ArrayList arrayList = new ArrayList();
        if (ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_ARRAY) {
            ka9Var.mo22731c();
            while (ka9Var.mo22735h()) {
                arrayList.add(d0d.m22177a(ka9Var, amaVar));
            }
            ka9Var.mo22733f();
            vd9.m52588b(arrayList);
        } else {
            arrayList.add(new sd9(eb9.m24698e(ka9Var, hri.m31025e())));
        }
        return new ig0(arrayList);
    }

    /* renamed from: b */
    public static tg0 m33784b(ka9 ka9Var, ama amaVar) {
        ka9Var.mo22732d();
        ig0 ig0VarM33783a = null;
        fg0 fg0VarM51554e = null;
        boolean z = false;
        fg0 fg0VarM51554e2 = null;
        while (ka9Var.mo22723C() != ka9.EnumC14757b.END_OBJECT) {
            int iMo22724H = ka9Var.mo22724H(f30378a);
            if (iMo22724H == 0) {
                ig0VarM33783a = m33783a(ka9Var, amaVar);
            } else if (iMo22724H != 1) {
                if (iMo22724H != 2) {
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                } else if (ka9Var.mo22723C() == ka9.EnumC14757b.STRING) {
                    ka9Var.mo22726K();
                    z = true;
                } else {
                    fg0VarM51554e = ug0.m51554e(ka9Var, amaVar);
                }
            } else if (ka9Var.mo22723C() == ka9.EnumC14757b.STRING) {
                ka9Var.mo22726K();
                z = true;
            } else {
                fg0VarM51554e2 = ug0.m51554e(ka9Var, amaVar);
            }
        }
        ka9Var.mo22734g();
        if (z) {
            amaVar.m17437a("Lottie doesn't support expressions.");
        }
        return ig0VarM33783a != null ? ig0VarM33783a : new ng0(fg0VarM51554e2, fg0VarM51554e);
    }
}
