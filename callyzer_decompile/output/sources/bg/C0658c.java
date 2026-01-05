package bg;

import android.content.Context;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bg.c */
/* loaded from: classes.dex */
public final class C0658c {

    /* renamed from: b */
    public static final C0658c f4201b;

    /* renamed from: a */
    public C0657b f4202a;

    static {
        C0658c c0658c = new C0658c();
        c0658c.f4202a = null;
        f4201b = c0658c;
    }

    /* renamed from: a */
    public static C0657b m1928a(Context context) {
        C0657b c0657b;
        C0658c c0658c = f4201b;
        synchronized (c0658c) {
            try {
                if (c0658c.f4202a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0658c.f4202a = new C0657b(context);
                }
                c0657b = c0658c.f4202a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0657b;
    }
}
