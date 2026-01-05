package p001o;

import java.util.Collections;
import java.util.Map;
import p001o.wn7;

/* loaded from: classes6.dex */
public class qp6 {

    /* renamed from: b */
    public static boolean f42265b = true;

    /* renamed from: c */
    public static volatile qp6 f42266c;

    /* renamed from: d */
    public static final qp6 f42267d = new qp6(true);

    /* renamed from: a */
    public final Map f42268a = Collections.emptyMap();

    /* renamed from: o.qp6$a */
    public static final class C16440a {

        /* renamed from: a */
        public final Object f42269a;

        /* renamed from: b */
        public final int f42270b;

        public C16440a(Object obj, int i) {
            this.f42269a = obj;
            this.f42270b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C16440a)) {
                return false;
            }
            C16440a c16440a = (C16440a) obj;
            return this.f42269a == c16440a.f42269a && this.f42270b == c16440a.f42270b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f42269a) * 65535) + this.f42270b;
        }
    }

    public qp6(boolean z) {
    }

    /* renamed from: c */
    public static qp6 m45750c() {
        qp6 qp6VarM40901a = f42266c;
        if (qp6VarM40901a == null) {
            synchronized (qp6.class) {
                qp6VarM40901a = f42266c;
                if (qp6VarM40901a == null) {
                    qp6VarM40901a = f42265b ? np6.m40901a() : f42267d;
                    f42266c = qp6VarM40901a;
                }
            }
        }
        return qp6VarM40901a;
    }

    /* renamed from: a */
    public final void m45751a(wn7.C17939f c17939f) {
        this.f42268a.put(new C16440a(c17939f.m54740b(), c17939f.m54743e()), c17939f);
    }

    /* renamed from: b */
    public wn7.C17939f m45752b(scb scbVar, int i) {
        return (wn7.C17939f) this.f42268a.get(new C16440a(scbVar, i));
    }
}
