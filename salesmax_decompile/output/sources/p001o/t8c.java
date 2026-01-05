package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public abstract class t8c {

    /* renamed from: o.t8c$a */
    public static final class RunnableC17028a extends AtomicInteger implements e5e, Runnable {

        /* renamed from: a */
        public final m9c f46626a;

        /* renamed from: b */
        public final Object f46627b;

        public RunnableC17028a(m9c m9cVar, Object obj) {
            this.f46626a = m9cVar;
            this.f46627b = obj;
        }

        @Override // p001o.rtf
        public void clear() {
            lazySet(3);
        }

        @Override // p001o.su5
        public void dispose() {
            set(3);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // p001o.rtf
        public boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p001o.rtf
        public Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f46627b;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f46626a.mo16560e(this.f46627b);
                if (get() == 2) {
                    lazySet(3);
                    this.f46626a.onComplete();
                }
            }
        }
    }

    /* renamed from: o.t8c$b */
    public static final class C17029b extends x6c {

        /* renamed from: a */
        public final Object f46628a;

        /* renamed from: b */
        public final rl7 f46629b;

        public C17029b(Object obj, rl7 rl7Var) {
            this.f46628a = obj;
            this.f46629b = rl7Var;
        }

        @Override // p001o.x6c
        public void x0(m9c m9cVar) {
            try {
                Object objApply = this.f46629b.apply(this.f46628a);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                x8c x8cVar = (x8c) objApply;
                if (!(x8cVar instanceof idg)) {
                    x8cVar.mo55724b(m9cVar);
                    return;
                }
                try {
                    Object obj = ((idg) x8cVar).get();
                    if (obj == null) {
                        h66.complete(m9cVar);
                        return;
                    }
                    RunnableC17028a runnableC17028a = new RunnableC17028a(m9cVar, obj);
                    m9cVar.mo16559a(runnableC17028a);
                    runnableC17028a.run();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    h66.error(th, m9cVar);
                }
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                h66.error(th2, m9cVar);
            }
        }
    }

    /* renamed from: a */
    public static x6c m49562a(Object obj, rl7 rl7Var) {
        return fwe.m27595n(new C17029b(obj, rl7Var));
    }

    /* renamed from: b */
    public static boolean m49563b(x8c x8cVar, m9c m9cVar, rl7 rl7Var) {
        if (!(x8cVar instanceof idg)) {
            return false;
        }
        try {
            Object obj = ((idg) x8cVar).get();
            if (obj == null) {
                h66.complete(m9cVar);
                return true;
            }
            try {
                Object objApply = rl7Var.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                x8c x8cVar2 = (x8c) objApply;
                if (x8cVar2 instanceof idg) {
                    try {
                        Object obj2 = ((idg) x8cVar2).get();
                        if (obj2 == null) {
                            h66.complete(m9cVar);
                            return true;
                        }
                        RunnableC17028a runnableC17028a = new RunnableC17028a(m9cVar, obj2);
                        m9cVar.mo16559a(runnableC17028a);
                        runnableC17028a.run();
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        h66.error(th, m9cVar);
                        return true;
                    }
                } else {
                    x8cVar2.mo55724b(m9cVar);
                }
                return true;
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                h66.error(th2, m9cVar);
                return true;
            }
        } catch (Throwable th3) {
            zk6.m59526b(th3);
            h66.error(th3, m9cVar);
            return true;
        }
    }
}
