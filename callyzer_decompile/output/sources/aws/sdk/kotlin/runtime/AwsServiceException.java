package aws.sdk.kotlin.runtime;

import aws.smithy.kotlin.runtime.ServiceException;
import g9.C2548a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AwsServiceException extends ServiceException {

    /* renamed from: c */
    public final C2548a f3470c;

    public AwsServiceException() {
        this.f3470c = new C2548a();
    }

    @Override // aws.smithy.kotlin.runtime.ServiceException
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2548a mo1480b() {
        return this.f3470c;
    }

    public AwsServiceException(String str) {
        super(str);
        this.f3470c = new C2548a();
    }

    public AwsServiceException(String str, Exception exc) {
        super(str, exc);
        this.f3470c = new C2548a();
    }
}
