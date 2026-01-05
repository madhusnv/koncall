package ai.salesmax.model;

import com.google.firebase.messaging.Constants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public abstract class Result {
    public static final int $stable = 0;

    public static final class Failure extends Result {
        public static final int $stable = 8;
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable th) {
            super(null);
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.error = th;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.error;
            }
            return failure.copy(th);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final Failure copy(Throwable th) {
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            return new Failure(th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && sq8.m48644c(this.error, ((Failure) obj).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ")";
        }
    }

    public static final class Success<T> extends Result {
        public static final int $stable = 0;
        private final T entity;

        public Success(T t) {
            super(null);
            this.entity = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.entity;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.entity;
        }

        public final Success<T> copy(T t) {
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && sq8.m48644c(this.entity, ((Success) obj).entity);
        }

        public final T getEntity() {
            return this.entity;
        }

        public int hashCode() {
            T t = this.entity;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(entity=" + this.entity + ")";
        }
    }

    private Result() {
    }

    public /* synthetic */ Result(id5 id5Var) {
        this();
    }
}
