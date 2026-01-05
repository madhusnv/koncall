package p001o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class rt5 {

    /* renamed from: a */
    public final Map f44044a = new HashMap();

    /* renamed from: b */
    public final C16662b f44045b = new C16662b();

    /* renamed from: o.rt5$a */
    public static class C16661a {

        /* renamed from: a */
        public final Lock f44046a = new ReentrantLock();

        /* renamed from: b */
        public int f44047b;
    }

    /* renamed from: o.rt5$b */
    public static class C16662b {

        /* renamed from: a */
        public final Queue f44048a = new ArrayDeque();

        /* renamed from: a */
        public C16661a m47144a() {
            C16661a c16661a;
            synchronized (this.f44048a) {
                c16661a = (C16661a) this.f44048a.poll();
            }
            return c16661a == null ? new C16661a() : c16661a;
        }

        /* renamed from: b */
        public void m47145b(C16661a c16661a) {
            synchronized (this.f44048a) {
                if (this.f44048a.size() < 10) {
                    this.f44048a.offer(c16661a);
                }
            }
        }
    }

    /* renamed from: a */
    public void m47142a(String str) {
        C16661a c16661aM47144a;
        synchronized (this) {
            c16661aM47144a = (C16661a) this.f44044a.get(str);
            if (c16661aM47144a == null) {
                c16661aM47144a = this.f44045b.m47144a();
                this.f44044a.put(str, c16661aM47144a);
            }
            c16661aM47144a.f44047b++;
        }
        c16661aM47144a.f44046a.lock();
    }

    /* renamed from: b */
    public void m47143b(String str) {
        C16661a c16661a;
        synchronized (this) {
            c16661a = (C16661a) bgd.m18886d(this.f44044a.get(str));
            int i = c16661a.f44047b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c16661a.f44047b);
            }
            int i2 = i - 1;
            c16661a.f44047b = i2;
            if (i2 == 0) {
                C16661a c16661a2 = (C16661a) this.f44044a.remove(str);
                if (!c16661a2.equals(c16661a)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c16661a + ", but actually removed: " + c16661a2 + ", safeKey: " + str);
                }
                this.f44045b.m47145b(c16661a2);
            }
        }
        c16661a.f44046a.unlock();
    }
}
