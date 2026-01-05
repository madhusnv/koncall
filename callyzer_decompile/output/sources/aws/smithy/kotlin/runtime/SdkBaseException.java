package aws.smithy.kotlin.runtime;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SdkBaseException extends RuntimeException {

    /* renamed from: a */
    public final C0488a f3498a;

    public SdkBaseException() {
        this.f3498a = new C0488a();
    }

    /* renamed from: a */
    public C0488a mo1479a() {
        return this.f3498a;
    }

    public SdkBaseException(String str) {
        super(str);
        this.f3498a = new C0488a();
    }

    public SdkBaseException(String str, Throwable th2) {
        super(str, th2);
        this.f3498a = new C0488a();
    }

    public SdkBaseException(Exception exc) {
        super(exc);
        this.f3498a = new C0488a();
    }
}
