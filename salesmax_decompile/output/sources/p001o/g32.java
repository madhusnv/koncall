package p001o;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class g32 {

    /* renamed from: o.g32$a */
    public static final class C13614a {

        /* renamed from: a */
        public Object f24497a;

        /* renamed from: b */
        public C13617d f24498b;

        /* renamed from: c */
        public qne f24499c = qne.m45706n();

        /* renamed from: d */
        public boolean f24500d;

        /* renamed from: a */
        public void m28003a(Runnable runnable, Executor executor) {
            qne qneVar = this.f24499c;
            if (qneVar != null) {
                qneVar.addListener(runnable, executor);
            }
        }

        /* renamed from: b */
        public void m28004b() {
            this.f24497a = null;
            this.f24498b = null;
            this.f24499c.set(null);
        }

        /* renamed from: c */
        public boolean m28005c(Object obj) {
            this.f24500d = true;
            C13617d c13617d = this.f24498b;
            boolean z = c13617d != null && c13617d.m28010b(obj);
            if (z) {
                m28007e();
            }
            return z;
        }

        /* renamed from: d */
        public boolean m28006d() {
            this.f24500d = true;
            C13617d c13617d = this.f24498b;
            boolean z = c13617d != null && c13617d.m28009a(true);
            if (z) {
                m28007e();
            }
            return z;
        }

        /* renamed from: e */
        public final void m28007e() {
            this.f24497a = null;
            this.f24498b = null;
            this.f24499c = null;
        }

        /* renamed from: f */
        public boolean m28008f(Throwable th) {
            this.f24500d = true;
            C13617d c13617d = this.f24498b;
            boolean z = c13617d != null && c13617d.m28011c(th);
            if (z) {
                m28007e();
            }
            return z;
        }

        public void finalize() {
            qne qneVar;
            C13617d c13617d = this.f24498b;
            if (c13617d != null && !c13617d.isDone()) {
                c13617d.m28011c(new C13615b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f24497a));
            }
            if (this.f24500d || (qneVar = this.f24499c) == null) {
                return;
            }
            qneVar.set(null);
        }
    }

    /* renamed from: o.g32$b */
    public static final class C13615b extends Throwable {
        public C13615b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: o.g32$c */
    public interface InterfaceC13616c {
        Object attachCompleter(C13614a c13614a);
    }

    /* renamed from: o.g32$d */
    public static final class C13617d implements zfa {

        /* renamed from: a */
        public final WeakReference f24501a;

        /* renamed from: b */
        public final i9 f24502b = new a();

        /* renamed from: o.g32$d$a */
        public class a extends i9 {
            public a() {
            }

            @Override // p001o.i9
            public String pendingToString() {
                C13614a c13614a = (C13614a) C13617d.this.f24501a.get();
                if (c13614a == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + c13614a.f24497a + "]";
            }
        }

        public C13617d(C13614a c13614a) {
            this.f24501a = new WeakReference(c13614a);
        }

        /* renamed from: a */
        public boolean m28009a(boolean z) {
            return this.f24502b.cancel(z);
        }

        @Override // p001o.zfa
        public void addListener(Runnable runnable, Executor executor) {
            this.f24502b.addListener(runnable, executor);
        }

        /* renamed from: b */
        public boolean m28010b(Object obj) {
            return this.f24502b.set(obj);
        }

        /* renamed from: c */
        public boolean m28011c(Throwable th) {
            return this.f24502b.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C13614a c13614a = (C13614a) this.f24501a.get();
            boolean zCancel = this.f24502b.cancel(z);
            if (zCancel && c13614a != null) {
                c13614a.m28004b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f24502b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f24502b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f24502b.isDone();
        }

        public String toString() {
            return this.f24502b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.f24502b.get(j, timeUnit);
        }
    }

    /* renamed from: a */
    public static zfa m28002a(InterfaceC13616c interfaceC13616c) {
        C13614a c13614a = new C13614a();
        C13617d c13617d = new C13617d(c13614a);
        c13614a.f24498b = c13617d;
        c13614a.f24497a = interfaceC13616c.getClass();
        try {
            Object objAttachCompleter = interfaceC13616c.attachCompleter(c13614a);
            if (objAttachCompleter != null) {
                c13614a.f24497a = objAttachCompleter;
            }
        } catch (Exception e) {
            c13617d.m28011c(e);
        }
        return c13617d;
    }
}
