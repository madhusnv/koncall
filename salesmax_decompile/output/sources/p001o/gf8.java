package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import p001o.p7;

/* loaded from: classes3.dex */
public class gf8 implements zfa {

    /* renamed from: b */
    public static final zfa f25070b = new gf8(null);

    /* renamed from: c */
    public static final ui9 f25071c = new ui9(gf8.class);

    /* renamed from: a */
    public final Object f25072a;

    /* renamed from: o.gf8$a */
    public static final class C13702a extends p7.AbstractC15991j {
        public C13702a(Throwable th) {
            mo43036C(th);
        }
    }

    public gf8(Object obj) {
        this.f25072a = obj;
    }

    @Override // p001o.zfa
    public void addListener(Runnable runnable, Executor executor) {
        dgd.m23063p(runnable, "Runnable was null.");
        dgd.m23063p(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f25071c.m51626a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f25072a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f25072a + "]]";
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        dgd.m23062o(timeUnit);
        return get();
    }
}
