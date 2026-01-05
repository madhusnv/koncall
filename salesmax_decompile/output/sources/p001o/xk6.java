package p001o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class xk6 {

    /* renamed from: a */
    public static final Throwable f53863a = new C18173a();

    /* renamed from: o.xk6$a */
    public static final class C18173a extends Throwable {
        public C18173a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static boolean m56413a(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f53863a) {
                return false;
            }
        } while (!ec3.m24748a(atomicReference, th2, th2 == null ? th : new mo3(th2, th)));
        return true;
    }

    /* renamed from: b */
    public static NullPointerException m56414b(String str) {
        return new NullPointerException(m56416d(str));
    }

    /* renamed from: c */
    public static Object m56415c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw m56414b(str);
    }

    /* renamed from: d */
    public static String m56416d(String str) {
        return str + " Null values are generally not allowed in 3.x operators and sources.";
    }

    /* renamed from: e */
    public static Throwable m56417e(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f53863a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: f */
    public static Exception m56418f(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: g */
    public static String m56419g(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* renamed from: h */
    public static RuntimeException m56420h(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
