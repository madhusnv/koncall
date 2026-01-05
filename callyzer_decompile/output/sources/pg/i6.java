package pg;

import aws.sdk.kotlin.runtime.AwsServiceException;
import aws.smithy.kotlin.runtime.C0489b;
import og.ud;
import uc.C7394a;
import vb.InterfaceC7695b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i6 {

    /* renamed from: a */
    public final /* synthetic */ int f28925a = 1;

    /* renamed from: a */
    public static final void m11695a(AwsServiceException awsServiceException, C7394a c7394a, InterfaceC7695b interfaceC7695b) {
        ud.m10983i(awsServiceException.mo1480b().f3503a, C0489b.f3504e, interfaceC7695b != null ? interfaceC7695b.mo9304b() : null);
        ud.m10983i(awsServiceException.mo1480b().f3503a, C0489b.f3505f, interfaceC7695b != null ? interfaceC7695b.mo9303a() : null);
        ud.m10983i(awsServiceException.mo1480b().f3503a, C0489b.f3508i, c7394a.f35159b.get("x-amz-request-id"));
        awsServiceException.mo1480b().f3503a.mo1862b(C0489b.f3507h, c7394a);
    }

    public String toString() {
        switch (this.f28925a) {
            case 1:
                return "AbstractXmlNamespace(uri=http://s3.amazonaws.com/doc/2006-03-01/, prefix=null)";
            default:
                return super.toString();
        }
    }
}
