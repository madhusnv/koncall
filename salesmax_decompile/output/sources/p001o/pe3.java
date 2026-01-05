package p001o;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class pe3 {

    /* renamed from: o.pe3$a */
    public static final class C16078a {

        /* renamed from: a */
        public static final Pattern f39941a = Pattern.compile(".*-.*");

        /* renamed from: b */
        public static String m43506b(ko6 ko6Var) {
            op0.m42511a(ko6Var != null);
            int iM56181i = xeb.m56181i(ko6Var.mo22955q().f7943n);
            if (iM56181i == -1) {
                iM56181i = xeb.m56181i(ko6Var.mo22955q().f7942m);
            }
            if (iM56181i == 1) {
                return "a";
            }
            if (iM56181i == 2) {
                return "v";
            }
            return null;
        }

        /* renamed from: a */
        public abstract pe3 m43507a();

        /* renamed from: c */
        public abstract C16078a m43508c(long j);

        /* renamed from: d */
        public abstract C16078a m43509d(String str);

        /* renamed from: e */
        public abstract C16078a m43510e(String str);

        /* renamed from: f */
        public abstract C16078a m43511f(String str);
    }

    /* renamed from: a */
    public abstract iz4 m43505a(iz4 iz4Var);
}
