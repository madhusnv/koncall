package p001o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class kb7 {

    /* renamed from: a */
    public static final ka9.C14756a f31887a = ka9.C14756a.m35230a("ch", "size", "w", "style", "fFamily", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);

    /* renamed from: b */
    public static final ka9.C14756a f31888b = ka9.C14756a.m35230a("shapes");

    /* renamed from: a */
    public static jb7 m35347a(ka9 ka9Var, ama amaVar) {
        ArrayList arrayList = new ArrayList();
        ka9Var.mo22732d();
        double dMo22737o = 0.0d;
        String strMo22740t = null;
        String strMo22740t2 = null;
        char cCharAt = 0;
        double dMo22737o2 = 0.0d;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f31887a);
            if (iMo22724H == 0) {
                cCharAt = ka9Var.mo22740t().charAt(0);
            } else if (iMo22724H == 1) {
                dMo22737o2 = ka9Var.mo22737o();
            } else if (iMo22724H == 2) {
                dMo22737o = ka9Var.mo22737o();
            } else if (iMo22724H == 3) {
                strMo22740t = ka9Var.mo22740t();
            } else if (iMo22724H == 4) {
                strMo22740t2 = ka9Var.mo22740t();
            } else if (iMo22724H != 5) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                ka9Var.mo22732d();
                while (ka9Var.mo22735h()) {
                    if (ka9Var.mo22724H(f31888b) != 0) {
                        ka9Var.mo22725J();
                        ka9Var.mo22726K();
                    } else {
                        ka9Var.mo22731c();
                        while (ka9Var.mo22735h()) {
                            arrayList.add((glf) a34.m16370a(ka9Var, amaVar));
                        }
                        ka9Var.mo22733f();
                    }
                }
                ka9Var.mo22734g();
            }
        }
        ka9Var.mo22734g();
        return new jb7(arrayList, cCharAt, dMo22737o2, dMo22737o, strMo22740t, strMo22740t2);
    }
}
