package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001o.p7;

/* loaded from: classes3.dex */
public abstract class l67 extends tv7 {

    /* renamed from: o.l67$a */
    public static abstract class AbstractC15003a extends l67 implements p7.InterfaceC15990i {
        @Override // p001o.p7, p001o.zfa
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }
    }
}
