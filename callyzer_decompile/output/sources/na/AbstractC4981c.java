package na;

import hq.C3008m;
import og.nd;
import og.od;
import qw.C6363m;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.c */
/* loaded from: classes.dex */
public abstract class AbstractC4981c {

    /* renamed from: a */
    public static final C6366p f24717a = nd.m10782c(new C3008m(28));

    /* renamed from: a */
    public static String m9895a(String str) {
        Object objM10796a;
        try {
            objM10796a = System.getProperty(str);
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        if (objM10796a instanceof C6363m) {
            objM10796a = "unknown";
        }
        return (String) objM10796a;
    }
}
