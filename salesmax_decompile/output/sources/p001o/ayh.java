package p001o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes6.dex */
public interface ayh extends uri, Serializable {

    /* renamed from: o.ayh$b */
    public static final class C12271b implements ayh, Serializable {

        /* renamed from: a */
        public final Throwable f15381a;

        public String P0() {
            return "Failure";
        }

        @Override // p001o.ayh
        /* renamed from: X */
        public boolean mo18029X() {
            return true;
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof C12271b) && Arrays.deepEquals(this.f15381a.getStackTrace(), ((C12271b) obj).f15381a.getStackTrace()));
        }

        @Override // p001o.ayh, p001o.uri
        public Object get() {
            return byh.m19927a(this.f15381a);
        }

        @Override // p001o.ayh
        public Throwable getCause() {
            return this.f15381a;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f15381a.getStackTrace());
        }

        @Override // p001o.uri
        public boolean isEmpty() {
            return true;
        }

        @Override // p001o.ayh
        public boolean isSuccess() {
            return false;
        }

        public String toString() {
            return P0() + "(" + this.f15381a + ")";
        }

        public C12271b(Throwable th) throws Throwable {
            Objects.requireNonNull(th, "cause is null");
            if (byh.m19928b(th)) {
                byh.m19927a(th);
            }
            this.f15381a = th;
        }
    }

    /* renamed from: o.ayh$c */
    public static final class C12272c implements ayh, Serializable {

        /* renamed from: a */
        public final Object f15382a;

        public String P0() {
            return "Success";
        }

        @Override // p001o.ayh
        /* renamed from: X */
        public boolean mo18029X() {
            return false;
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof C12272c) && Objects.equals(this.f15382a, ((C12272c) obj).f15382a));
        }

        @Override // p001o.ayh, p001o.uri
        public Object get() {
            return this.f15382a;
        }

        @Override // p001o.ayh
        public Throwable getCause() {
            throw new UnsupportedOperationException("getCause on Success");
        }

        public int hashCode() {
            return Objects.hashCode(this.f15382a);
        }

        @Override // p001o.uri
        public boolean isEmpty() {
            return false;
        }

        @Override // p001o.ayh
        public boolean isSuccess() {
            return true;
        }

        public String toString() {
            return P0() + "(" + this.f15382a + ")";
        }

        public C12272c(Object obj) {
            this.f15382a = obj;
        }
    }

    static ayh H1(n83 n83Var) {
        Objects.requireNonNull(n83Var, "supplier is null");
        try {
            return new C12272c(n83Var.apply());
        } catch (Throwable th) {
            return new C12271b(th);
        }
    }

    static ayh Z2(o83 o83Var) {
        Objects.requireNonNull(o83Var, "runnable is null");
        C12270a c12270a = null;
        try {
            o83Var.run();
            return new C12272c(c12270a);
        } catch (Throwable th) {
            return new C12271b(th);
        }
    }

    /* renamed from: D */
    default Object m18027D(Function function) {
        Objects.requireNonNull(function, "other is null");
        return mo18029X() ? function.apply(getCause()) : get();
    }

    default ayh J1(Consumer consumer) {
        Objects.requireNonNull(consumer, "action is null");
        if (isSuccess()) {
            consumer.accept(get());
        }
        return this;
    }

    /* renamed from: K */
    default ayh m18028K(o83 o83Var) {
        Objects.requireNonNull(o83Var, "runnable is null");
        try {
            o83Var.run();
            return this;
        } catch (Throwable th) {
            return new C12271b(th);
        }
    }

    /* renamed from: X */
    boolean mo18029X();

    @Override // p001o.uri
    Object get();

    Throwable getCause();

    default ayh h3(final Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable is null");
        return m18028K(new o83() { // from class: o.zxh
            @Override // p001o.o83
            public final void run() {
                runnable.run();
            }
        });
    }

    boolean isSuccess();

    default ayh q1(Consumer consumer) {
        Objects.requireNonNull(consumer, "action is null");
        if (mo18029X()) {
            consumer.accept(getCause());
        }
        return this;
    }

    @Override // java.lang.Iterable
    default b69 iterator() {
        return isSuccess() ? b69.of(get()) : b69.m18196c();
    }
}
