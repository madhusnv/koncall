package p001o;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes6.dex */
public enum d3c {
    COMPLETE;

    /* renamed from: o.d3c$a */
    public static final class C12791a implements Serializable {

        /* renamed from: a */
        public final su5 f19070a;

        public C12791a(su5 su5Var) {
            this.f19070a = su5Var;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f19070a + "]";
        }
    }

    /* renamed from: o.d3c$b */
    public static final class C12792b implements Serializable {

        /* renamed from: a */
        public final Throwable f19071a;

        public C12792b(Throwable th) {
            this.f19071a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C12792b) {
                return Objects.equals(this.f19071a, ((C12792b) obj).f19071a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19071a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f19071a + "]";
        }
    }

    /* renamed from: o.d3c$c */
    public static final class C12793c implements Serializable {

        /* renamed from: a */
        public final rag f19072a;

        public C12793c(rag ragVar) {
            this.f19072a = ragVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f19072a + "]";
        }
    }

    public static <T> boolean accept(Object obj, qag qagVar) {
        if (obj == COMPLETE) {
            qagVar.onComplete();
            return true;
        }
        if (obj instanceof C12792b) {
            qagVar.onError(((C12792b) obj).f19071a);
            return true;
        }
        qagVar.mo18166e(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, qag qagVar) {
        if (obj == COMPLETE) {
            qagVar.onComplete();
            return true;
        }
        if (obj instanceof C12792b) {
            qagVar.onError(((C12792b) obj).f19071a);
            return true;
        }
        if (obj instanceof C12793c) {
            qagVar.mo18165b(((C12793c) obj).f19072a);
            return false;
        }
        qagVar.mo18166e(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(su5 su5Var) {
        return new C12791a(su5Var);
    }

    public static Object error(Throwable th) {
        return new C12792b(th);
    }

    public static su5 getDisposable(Object obj) {
        return ((C12791a) obj).f19070a;
    }

    public static Throwable getError(Object obj) {
        return ((C12792b) obj).f19071a;
    }

    public static rag getSubscription(Object obj) {
        return ((C12793c) obj).f19072a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C12791a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C12792b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C12793c;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(rag ragVar) {
        return new C12793c(ragVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, m9c m9cVar) {
        if (obj == COMPLETE) {
            m9cVar.onComplete();
            return true;
        }
        if (obj instanceof C12792b) {
            m9cVar.onError(((C12792b) obj).f19071a);
            return true;
        }
        m9cVar.mo16560e(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, m9c m9cVar) {
        if (obj == COMPLETE) {
            m9cVar.onComplete();
            return true;
        }
        if (obj instanceof C12792b) {
            m9cVar.onError(((C12792b) obj).f19071a);
            return true;
        }
        if (obj instanceof C12791a) {
            m9cVar.mo16559a(((C12791a) obj).f19070a);
            return false;
        }
        m9cVar.mo16560e(obj);
        return false;
    }
}
