package i00;

import k0.ExecutorC3897g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class i0 {

    /* renamed from: a */
    public static final ExecutorC3897g f16666a;

    /* renamed from: b */
    public static final C3096a f16667b;

    /* renamed from: c */
    public static final C3096a f16668c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f16666a = null;
            f16667b = new C3096a(7);
            f16668c = new C3096a(6);
        } else if (property.equals("Dalvik")) {
            f16666a = new ExecutorC3897g(1);
            f16667b = new j0(7);
            f16668c = new C3098c(6);
        } else {
            f16666a = null;
            f16667b = new k0(7);
            f16668c = new C3098c(6);
        }
    }
}
