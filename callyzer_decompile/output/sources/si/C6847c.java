package si;

import java.util.Collections;
import java.util.Map;
import ji.C3773g;
import qi.RunnableC6224g;
import wi.C8066p;
import wi.RunnableC8064n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: si.c */
/* loaded from: classes.dex */
public final class C6847c {

    /* renamed from: a */
    public final C8066p f32512a;

    public C6847c(C8066p c8066p) {
        this.f32512a = c8066p;
    }

    /* renamed from: a */
    public static C6847c m13044a() {
        C6847c c6847c = (C6847c) C3773g.m8291c().m8294b(C6847c.class);
        if (c6847c != null) {
            return c6847c;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* renamed from: b */
    public final void m13045b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C8066p c8066p = this.f32512a;
        c8066p.f38638o.f40063a.m15551a(new RunnableC8064n(c8066p, jCurrentTimeMillis - c8066p.f38627d, str, 0));
    }

    /* renamed from: c */
    public final void m13046c(Exception exc) {
        if (exc == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        C8066p c8066p = this.f32512a;
        c8066p.f38638o.f40063a.m15551a(new RunnableC6224g(c8066p, exc));
    }
}
