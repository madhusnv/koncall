package fb;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyFailedAttemptsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnexpectedLambdaException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedOperationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserLambdaValidationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UsernameExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.WebAuthnNotEnabledException;
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
/* renamed from: fb.z */
/* loaded from: classes.dex */
public abstract class AbstractC2252z implements InterfaceC6789i {
    /* renamed from: b */
    public static TooManyFailedAttemptsException m5951b(C0645a context, C5884l call, byte[] bArr) {
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
        TooManyFailedAttemptsException tooManyFailedAttemptsException = new TooManyFailedAttemptsException(strMo62d);
        tooManyFailedAttemptsException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return tooManyFailedAttemptsException;
    }

    /* renamed from: c */
    public static TooManyRequestsException m5952c(C0645a context, C5884l call, byte[] bArr) {
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

    /* renamed from: d */
    public static UnexpectedLambdaException m5953d(C0645a context, C5884l call, byte[] bArr) {
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
        UnexpectedLambdaException unexpectedLambdaException = new UnexpectedLambdaException(strMo62d);
        unexpectedLambdaException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return unexpectedLambdaException;
    }

    /* renamed from: e */
    public static UnsupportedOperationException m5954e(C0645a context, C5884l call, byte[] bArr) {
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
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(strMo62d);
        unsupportedOperationException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return unsupportedOperationException;
    }

    /* renamed from: f */
    public static UserLambdaValidationException m5955f(C0645a context, C5884l call, byte[] bArr) {
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
        UserLambdaValidationException userLambdaValidationException = new UserLambdaValidationException(strMo62d);
        userLambdaValidationException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return userLambdaValidationException;
    }

    /* renamed from: g */
    public static UserNotConfirmedException m5956g(C0645a context, C5884l call, byte[] bArr) {
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
        UserNotConfirmedException userNotConfirmedException = new UserNotConfirmedException(strMo62d);
        userNotConfirmedException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return userNotConfirmedException;
    }

    /* renamed from: h */
    public static UserNotFoundException m5957h(C0645a context, C5884l call, byte[] bArr) {
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
        UserNotFoundException userNotFoundException = new UserNotFoundException(strMo62d);
        userNotFoundException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return userNotFoundException;
    }

    /* renamed from: i */
    public static UsernameExistsException m5958i(C0645a context, C5884l call, byte[] bArr) {
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
        UsernameExistsException usernameExistsException = new UsernameExistsException(strMo62d);
        usernameExistsException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return usernameExistsException;
    }

    /* renamed from: j */
    public static WebAuthnNotEnabledException m5959j(C0645a context, C5884l call, byte[] bArr) {
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
        WebAuthnNotEnabledException webAuthnNotEnabledException = new WebAuthnNotEnabledException(strMo62d);
        webAuthnNotEnabledException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return webAuthnNotEnabledException;
    }
}
