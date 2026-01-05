package og;

import android.content.Context;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4154l;
import n7.C4962g;
import n7.C4964i;
import n7.C4970o;
import q7.C6138e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q1 {
    /* renamed from: a */
    public static final void m10844a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                md.m10764a(th2, th3);
            }
        }
    }

    /* renamed from: b */
    public static final l7.a0 m10845b(Context context) {
        AbstractC4154l.m8923f(context, "context");
        l7.a0 a0Var = new l7.a0(context);
        C6138e c6138e = a0Var.f21996b;
        l7.o0 o0Var = c6138e.f29925s;
        o0Var.m9232a(new C4962g(o0Var));
        l7.o0 o0Var2 = c6138e.f29925s;
        o0Var2.m9232a(new C4964i());
        o0Var2.m9232a(new C4970o());
        return a0Var;
    }
}
