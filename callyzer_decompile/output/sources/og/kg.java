package og;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import s6.C6763b;
import s6.C6765d;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class kg {
    /* renamed from: a */
    public static C8302l m10741a(tx.g0 g0Var) {
        return pg.i7.m11697b(new a1.c0(21, g0Var));
    }

    /* renamed from: b */
    public static final Object m10742b(C6763b c6763b, C6765d key, Serializable serializable) {
        AbstractC4154l.m8923f(c6763b, "<this>");
        AbstractC4154l.m8923f(key, "key");
        Object objM12966c = c6763b.m12966c(key);
        return objM12966c == null ? serializable : objM12966c;
    }
}
