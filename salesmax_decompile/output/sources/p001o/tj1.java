package p001o;

/* loaded from: classes6.dex */
public abstract class tj1 {
    /* renamed from: a */
    public static void m49950a() {
        if (fwe.m27591j()) {
            if ((Thread.currentThread() instanceof d0c) || fwe.m27597p()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
