package kotlin.jvm.internal;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a */
    public static final b0 f21154a;

    static {
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b0Var == null) {
            b0Var = new b0();
        }
        f21154a = b0Var;
    }

    /* renamed from: a */
    public static C4147e m8901a(Class cls) {
        f21154a.getClass();
        return new C4147e(cls);
    }
}
