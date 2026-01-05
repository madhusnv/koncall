package p001o;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class lt5 implements Executor {

    /* renamed from: a */
    public static volatile lt5 f34358a;

    /* renamed from: a */
    public static Executor m37874a() {
        if (f34358a != null) {
            return f34358a;
        }
        synchronized (lt5.class) {
            if (f34358a == null) {
                f34358a = new lt5();
            }
        }
        return f34358a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
