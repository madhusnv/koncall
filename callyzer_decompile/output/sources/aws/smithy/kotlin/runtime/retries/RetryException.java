package aws.smithy.kotlin.runtime.retries;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.internal.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class RetryException extends ClientException {

    /* renamed from: b */
    public final int f3510b;

    /* renamed from: c */
    public final Object f3511c;

    /* renamed from: d */
    public final Throwable f3512d;

    public RetryException(String str, Throwable th2, int i10, Object obj, Throwable th3) {
        super(str, th2);
        this.f3510b = i10;
        this.f3511c = obj;
        this.f3512d = th3;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a0.m8901a(getClass()).m8914c());
        sb2.append("(message=");
        sb2.append(getMessage());
        sb2.append(",attempts=");
        sb2.append(this.f3510b);
        Throwable th2 = this.f3512d;
        if (th2 != null) {
            sb2.append(",lastException=");
            sb2.append(th2);
        } else {
            Object obj = this.f3511c;
            if (obj != null) {
                sb2.append(",lastResponse=");
                sb2.append(obj);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
