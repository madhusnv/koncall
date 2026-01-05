package p001o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class vwe extends AtomicLong implements ThreadFactory {

    /* renamed from: a */
    public final String f50962a;

    /* renamed from: b */
    public final int f50963b;

    /* renamed from: c */
    public final boolean f50964c;

    /* renamed from: o.vwe$a */
    public static final class C17684a extends Thread implements d0c {
        public C17684a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public vwe(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f50962a + '-' + incrementAndGet();
        Thread c17684a = this.f50964c ? new C17684a(runnable, str) : new Thread(runnable, str);
        c17684a.setPriority(this.f50963b);
        c17684a.setDaemon(true);
        return c17684a;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f50962a + "]";
    }

    public vwe(String str, int i) {
        this(str, i, false);
    }

    public vwe(String str, int i, boolean z) {
        this.f50962a = str;
        this.f50963b = i;
        this.f50964c = z;
    }
}
