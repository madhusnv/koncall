package p001o;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class lth {

    /* renamed from: a */
    public static final Logger f34367a = Logger.getLogger(lth.class.getName());

    /* renamed from: b */
    public static final ath f34368b = m37886c(ath.class.getClassLoader());

    /* renamed from: a */
    public static dp6 m37884a() {
        return f34368b.mo17830a();
    }

    /* renamed from: b */
    public static ith m37885b() {
        return f34368b.mo17831b();
    }

    /* renamed from: c */
    public static ath m37886c(ClassLoader classLoader) {
        try {
            return (ath) l2e.m36460a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), ath.class);
        } catch (ClassNotFoundException e) {
            f34367a.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (ath) l2e.m36460a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), ath.class);
            } catch (ClassNotFoundException e2) {
                f34367a.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e2);
                return ath.m17829c();
            }
        }
    }
}
