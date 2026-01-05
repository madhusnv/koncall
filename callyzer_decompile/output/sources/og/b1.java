package og;

import a2.AbstractC0030c;
import aa.C0078e;
import aa.C0079f;
import al.C0182j;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6364n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a */
    public static final /* synthetic */ int f26329a = 0;

    /* renamed from: a */
    public static final C0079f m10542a(C0182j c0182j) {
        Object objM10796a;
        Object objM10796a2;
        C0078e c0078e = new C0078e();
        while (true) {
            C0182j c0182jM418i = c0182j.m418i();
            if (c0182jM418i == null) {
                break;
            }
            String strM415f = c0182jM418i.m415f();
            if (AbstractC4154l.m8918a(strM415f, "AssumedRoleId")) {
                try {
                    objM10796a = pg.l6.m11757a(c0182jM418i);
                } catch (Throwable th2) {
                    objM10796a = od.m10796a(th2);
                }
                Throwable thM12363a = C6364n.m12363a(objM10796a);
                if (thM12363a != null) {
                    objM10796a = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#assumedRoleIdType`)", thM12363a);
                }
                od.m10798c(objM10796a);
                c0078e.f292b = (String) objM10796a;
            } else if (AbstractC4154l.m8918a(strM415f, "Arn")) {
                try {
                    objM10796a2 = pg.l6.m11757a(c0182jM418i);
                } catch (Throwable th3) {
                    objM10796a2 = od.m10796a(th3);
                }
                Throwable thM12363a2 = C6364n.m12363a(objM10796a2);
                if (thM12363a2 != null) {
                    objM10796a2 = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#arnType`)", thM12363a2);
                }
                od.m10798c(objM10796a2);
                c0078e.f291a = (String) objM10796a2;
            }
            c0182jM418i.m413d();
        }
        if (c0078e.f291a == null) {
            c0078e.f291a = "";
        }
        if (c0078e.f292b == null) {
            c0078e.f292b = "";
        }
        return new C0079f(c0078e);
    }
}
