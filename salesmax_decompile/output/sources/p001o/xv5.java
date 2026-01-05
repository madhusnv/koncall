package p001o;

import p001o.ka9;
import p001o.wv5;

/* loaded from: classes3.dex */
public class xv5 implements wri {

    /* renamed from: a */
    public static final xv5 f54325a = new xv5();

    /* renamed from: b */
    public static final ka9.C14756a f54326b = ka9.C14756a.m35230a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // p001o.wri
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wv5 mo23422a(ka9 ka9Var, float f) {
        wv5.EnumC17969a enumC17969a = wv5.EnumC17969a.CENTER;
        ka9Var.mo22732d();
        wv5.EnumC17969a enumC17969a2 = enumC17969a;
        String strMo22740t = null;
        String strMo22740t2 = null;
        float fMo22737o = 0.0f;
        float fMo22737o2 = 0.0f;
        float fMo22737o3 = 0.0f;
        float fMo22737o4 = 0.0f;
        int iMo22738r = 0;
        int iM24697d = 0;
        int iM24697d2 = 0;
        boolean zMo22736k = true;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f54326b)) {
                case 0:
                    strMo22740t = ka9Var.mo22740t();
                    break;
                case 1:
                    strMo22740t2 = ka9Var.mo22740t();
                    break;
                case 2:
                    fMo22737o = (float) ka9Var.mo22737o();
                    break;
                case 3:
                    int iMo22738r2 = ka9Var.mo22738r();
                    enumC17969a2 = wv5.EnumC17969a.CENTER;
                    if (iMo22738r2 <= enumC17969a2.ordinal() && iMo22738r2 >= 0) {
                        enumC17969a2 = wv5.EnumC17969a.values()[iMo22738r2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case 4:
                    iMo22738r = ka9Var.mo22738r();
                    break;
                case 5:
                    fMo22737o2 = (float) ka9Var.mo22737o();
                    break;
                case 6:
                    fMo22737o3 = (float) ka9Var.mo22737o();
                    break;
                case 7:
                    iM24697d = eb9.m24697d(ka9Var);
                    break;
                case 8:
                    iM24697d2 = eb9.m24697d(ka9Var);
                    break;
                case 9:
                    fMo22737o4 = (float) ka9Var.mo22737o();
                    break;
                case 10:
                    zMo22736k = ka9Var.mo22736k();
                    break;
                default:
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                    break;
            }
        }
        ka9Var.mo22734g();
        return new wv5(strMo22740t, strMo22740t2, fMo22737o, enumC17969a2, iMo22738r, fMo22737o2, fMo22737o3, iM24697d, iM24697d2, fMo22737o4, zMo22736k);
    }
}
