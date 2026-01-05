package v9;

import aws.sdk.kotlin.services.cognitoidentity.model.ExternalServiceException;
import aws.sdk.kotlin.services.cognitoidentity.model.InternalErrorException;
import aws.sdk.kotlin.services.cognitoidentity.model.InvalidParameterException;
import aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException;
import aws.sdk.kotlin.services.cognitoidentity.model.ResourceConflictException;
import aws.sdk.kotlin.services.cognitoidentity.model.ResourceNotFoundException;
import aws.sdk.kotlin.services.cognitoidentity.model.TooManyRequestsException;
import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import bd.C0645a;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2264b;
import fd.InterfaceC2265c;
import hd.C2891c;
import hd.C2896h;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pc.C5884l;
import rw.AbstractC6662l;
import sc.InterfaceC6789i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v9.a */
/* loaded from: classes.dex */
public abstract class AbstractC7692a implements InterfaceC6789i {
    /* renamed from: b */
    public static ExternalServiceException m14698b(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String strMo62d = null;
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(AbstractC5601a.m11252w(c2271i), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    strMo62d = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        ExternalServiceException externalServiceException = new ExternalServiceException(strMo62d);
        externalServiceException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return externalServiceException;
    }

    /* renamed from: c */
    public static InternalErrorException m14699c(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String strMo62d = null;
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(AbstractC5601a.m11252w(c2271i), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    strMo62d = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        InternalErrorException internalErrorException = new InternalErrorException(strMo62d);
        internalErrorException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Server);
        return internalErrorException;
    }

    /* renamed from: d */
    public static InvalidParameterException m14700d(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String strMo62d = null;
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(AbstractC5601a.m11252w(c2271i), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    strMo62d = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        InvalidParameterException invalidParameterException = new InvalidParameterException(strMo62d);
        invalidParameterException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return invalidParameterException;
    }

    /* renamed from: e */
    public static NotAuthorizedException m14701e(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String strMo62d = null;
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(AbstractC5601a.m11252w(c2271i), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    strMo62d = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        NotAuthorizedException notAuthorizedException = new NotAuthorizedException(strMo62d);
        notAuthorizedException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return notAuthorizedException;
    }

    /* renamed from: f */
    public static ResourceConflictException m14702f(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String strMo62d = null;
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(AbstractC5601a.m11252w(c2271i), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    strMo62d = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        ResourceConflictException resourceConflictException = new ResourceConflictException(strMo62d);
        resourceConflictException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return resourceConflictException;
    }

    /* renamed from: g */
    public static ResourceNotFoundException m14703g(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String strMo62d = null;
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(AbstractC5601a.m11252w(c2271i), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    strMo62d = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        ResourceNotFoundException resourceNotFoundException = new ResourceNotFoundException(strMo62d);
        resourceNotFoundException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return resourceNotFoundException;
    }

    /* renamed from: h */
    public static TooManyRequestsException m14704h(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String strMo62d = null;
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(AbstractC5601a.m11252w(c2271i), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    strMo62d = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        TooManyRequestsException tooManyRequestsException = new TooManyRequestsException(strMo62d);
        tooManyRequestsException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return tooManyRequestsException;
    }
}
