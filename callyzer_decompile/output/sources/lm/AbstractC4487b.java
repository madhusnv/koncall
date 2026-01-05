package lm;

import android.content.Context;
import dy.AbstractC1856d;
import dy.C1855c;
import eq.C2091c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import tx.InterfaceC7266z;
import tx.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lm.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4487b {

    /* renamed from: a */
    public static final AtomicBoolean f22326a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final C1855c f22327b = AbstractC1856d.m5490a();

    /* renamed from: a */
    public static void m9333a(Context context, InterfaceC7266z scope, C4486a c4486a) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(scope, "scope");
        if (f22326a.compareAndSet(false, true)) {
            c0.m13502y(scope, null, null, new C2091c(c4486a, context, null, 1), 3);
        }
    }
}
