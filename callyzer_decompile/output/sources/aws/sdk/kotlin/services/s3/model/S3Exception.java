package aws.sdk.kotlin.services.s3.model;

import aws.sdk.kotlin.runtime.AwsServiceException;
import aws.smithy.kotlin.runtime.C0488a;
import aws.smithy.kotlin.runtime.C0489b;
import g9.C2548a;
import mb.q2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class S3Exception extends AwsServiceException {

    /* renamed from: d */
    public final q2 f3497d;

    public S3Exception() {
        this.f3497d = new q2();
    }

    @Override // aws.sdk.kotlin.runtime.AwsServiceException, aws.smithy.kotlin.runtime.ServiceException, aws.smithy.kotlin.runtime.SdkBaseException
    /* renamed from: a */
    public final C0488a mo1480b() {
        return this.f3497d;
    }

    @Override // aws.sdk.kotlin.runtime.AwsServiceException, aws.smithy.kotlin.runtime.ServiceException
    /* renamed from: b */
    public final C0489b mo1480b() {
        return this.f3497d;
    }

    @Override // aws.sdk.kotlin.runtime.AwsServiceException
    /* renamed from: c */
    public final C2548a mo1479a() {
        return this.f3497d;
    }

    public S3Exception(String str) {
        super(str);
        this.f3497d = new q2();
    }
}
