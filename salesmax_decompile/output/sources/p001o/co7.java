package p001o;

import java.io.IOException;
import java.util.Random;

/* loaded from: classes5.dex */
public abstract class co7 {

    /* renamed from: a */
    public static t1i f18455a;

    /* renamed from: a */
    public static synchronized t1i m21551a() {
        if (f18455a == null) {
            try {
                f18455a = new t1i(new Random(System.currentTimeMillis()), null);
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to create UUIDTimer with specified synchronizer: " + e.getMessage(), e);
            }
        }
        return f18455a;
    }

    /* renamed from: b */
    public static slh m21552b() {
        return m21553c(null);
    }

    /* renamed from: c */
    public static slh m21553c(vj6 vj6Var) {
        return m21554d(vj6Var, null);
    }

    /* renamed from: d */
    public static slh m21554d(vj6 vj6Var, t1i t1iVar) {
        if (t1iVar == null) {
            t1iVar = m21551a();
        }
        return new slh(vj6Var, t1iVar);
    }
}
