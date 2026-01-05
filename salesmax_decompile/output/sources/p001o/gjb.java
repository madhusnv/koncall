package p001o;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public interface gjb {

    /* renamed from: o.gjb$a */
    public static class C13758a {

        /* renamed from: a */
        public final ic9 f25337a;

        /* renamed from: b */
        public final List f25338b;

        /* renamed from: c */
        public final lu4 f25339c;

        public C13758a(ic9 ic9Var, lu4 lu4Var) {
            this(ic9Var, Collections.emptyList(), lu4Var);
        }

        public C13758a(ic9 ic9Var, List list, lu4 lu4Var) {
            this.f25337a = (ic9) bgd.m18886d(ic9Var);
            this.f25338b = (List) bgd.m18886d(list);
            this.f25339c = (lu4) bgd.m18886d(lu4Var);
        }
    }

    /* renamed from: a */
    boolean mo18149a(Object obj);

    /* renamed from: b */
    C13758a mo18150b(Object obj, int i, int i2, rec recVar);
}
