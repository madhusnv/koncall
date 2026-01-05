package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4154l;
import tx.k1;
import tx.o1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: a */
    public final transient k1 f21166a;

    public JobCancellationException(String str, Throwable th2, k1 k1Var) {
        super(str);
        this.f21166a = k1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!AbstractC4154l.m8918a(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.f21166a;
        if (obj2 == null) {
            obj2 = o1.f34663b;
        }
        Object obj3 = this.f21166a;
        if (obj3 == null) {
            obj3 = o1.f34663b;
        }
        return AbstractC4154l.m8918a(obj2, obj3) && AbstractC4154l.m8918a(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC4154l.m8920c(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f21166a;
        if (obj == null) {
            obj = o1.f34663b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f21166a;
        if (obj == null) {
            obj = o1.f34663b;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
