package aws.smithy.kotlin.runtime.http;

import aws.smithy.kotlin.runtime.C0488a;
import aws.smithy.kotlin.runtime.SdkBaseException;
import java.io.IOException;
import jc.b0;
import jc.c0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HttpException extends SdkBaseException {

    /* renamed from: b */
    public final b0 f3509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(IOException iOException, b0 errorCode) {
        super(iOException);
        AbstractC4154l.m8923f(errorCode, "errorCode");
        this.f3509b = errorCode;
        this.f3498a.f3503a.mo1862b(C0488a.f3501c, true);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string = super.toString();
        int[] iArr = c0.f19555a;
        b0 b0Var = this.f3509b;
        if (iArr[b0Var.ordinal()] == 3) {
            return string;
        }
        return string + "; HttpErrorCode(" + b0Var + ')';
    }
}
