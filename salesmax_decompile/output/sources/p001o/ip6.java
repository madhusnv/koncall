package p001o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ip6 {

    /* renamed from: a */
    public static final Object f29054a = new Object();

    /* renamed from: b */
    public static final Map f29055b = new HashMap();

    /* renamed from: a */
    public static w82 m32533a(Object obj) {
        w82 w82Var;
        synchronized (f29054a) {
            w82Var = (w82) f29055b.get(obj);
        }
        return w82Var == null ? w82.f51595a : w82Var;
    }
}
