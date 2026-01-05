package ba;

import a2.AbstractC0030c;
import al.C0182j;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.ExpiredTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.RegionDisabledException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.AliasExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeDeliveryFailureException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeMismatchException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ExpiredCodeException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidEmailRoleAccessPolicyException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidLambdaResponseException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidPasswordException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidUserPoolConfigurationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.LimitExceededException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordHistoryPolicyViolationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.SoftwareTokenMfaNotFoundException;
import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import bd.C0645a;
import eb.f2;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2264b;
import fd.InterfaceC2265c;
import hd.C2891c;
import hd.C2896h;
import kotlin.jvm.internal.AbstractC4154l;
import og.e1;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import pc.C5884l;
import pg.l6;
import qw.C6364n;
import rw.AbstractC6662l;
import sc.InterfaceC6789i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ba.g */
/* loaded from: classes.dex */
public abstract class AbstractC0637g implements InterfaceC6789i {
    /* renamed from: b */
    public static ExpiredTokenException m1830b(C0645a context, C5884l call, byte[] bArr) {
        Object objM10796a;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String str = null;
        if (bArr != null) {
            C0182j c0182jM10623e = e1.m10623e(l6.m11759c(bArr));
            while (true) {
                C0182j c0182jM418i = c0182jM10623e.m418i();
                if (c0182jM418i == null) {
                    break;
                }
                if (AbstractC4154l.m8918a(c0182jM418i.m415f(), "message")) {
                    try {
                        objM10796a = l6.m11757a(c0182jM418i);
                    } catch (Throwable th2) {
                        objM10796a = od.m10796a(th2);
                    }
                    Throwable thM12363a = C6364n.m12363a(objM10796a);
                    if (thM12363a != null) {
                        objM10796a = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#expiredIdentityTokenMessage`)", thM12363a);
                    }
                    od.m10798c(objM10796a);
                    str = (String) objM10796a;
                }
                c0182jM418i.m413d();
            }
        }
        ExpiredTokenException expiredTokenException = new ExpiredTokenException(str);
        expiredTokenException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return expiredTokenException;
    }

    /* renamed from: c */
    public static MalformedPolicyDocumentException m1831c(C0645a context, C5884l call, byte[] bArr) {
        Object objM10796a;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String str = null;
        if (bArr != null) {
            C0182j c0182jM10623e = e1.m10623e(l6.m11759c(bArr));
            while (true) {
                C0182j c0182jM418i = c0182jM10623e.m418i();
                if (c0182jM418i == null) {
                    break;
                }
                if (AbstractC4154l.m8918a(c0182jM418i.m415f(), "message")) {
                    try {
                        objM10796a = l6.m11757a(c0182jM418i);
                    } catch (Throwable th2) {
                        objM10796a = od.m10796a(th2);
                    }
                    Throwable thM12363a = C6364n.m12363a(objM10796a);
                    if (thM12363a != null) {
                        objM10796a = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#malformedPolicyDocumentMessage`)", thM12363a);
                    }
                    od.m10798c(objM10796a);
                    str = (String) objM10796a;
                }
                c0182jM418i.m413d();
            }
        }
        MalformedPolicyDocumentException malformedPolicyDocumentException = new MalformedPolicyDocumentException(str);
        malformedPolicyDocumentException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return malformedPolicyDocumentException;
    }

    /* renamed from: d */
    public static PackedPolicyTooLargeException m1832d(C0645a context, C5884l call, byte[] bArr) {
        Object objM10796a;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String str = null;
        if (bArr != null) {
            C0182j c0182jM10623e = e1.m10623e(l6.m11759c(bArr));
            while (true) {
                C0182j c0182jM418i = c0182jM10623e.m418i();
                if (c0182jM418i == null) {
                    break;
                }
                if (AbstractC4154l.m8918a(c0182jM418i.m415f(), "message")) {
                    try {
                        objM10796a = l6.m11757a(c0182jM418i);
                    } catch (Throwable th2) {
                        objM10796a = od.m10796a(th2);
                    }
                    Throwable thM12363a = C6364n.m12363a(objM10796a);
                    if (thM12363a != null) {
                        objM10796a = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#packedPolicyTooLargeMessage`)", thM12363a);
                    }
                    od.m10798c(objM10796a);
                    str = (String) objM10796a;
                }
                c0182jM418i.m413d();
            }
        }
        PackedPolicyTooLargeException packedPolicyTooLargeException = new PackedPolicyTooLargeException(str);
        packedPolicyTooLargeException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return packedPolicyTooLargeException;
    }

    /* renamed from: e */
    public static RegionDisabledException m1833e(C0645a context, C5884l call, byte[] bArr) {
        Object objM10796a;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        String str = null;
        if (bArr != null) {
            C0182j c0182jM10623e = e1.m10623e(l6.m11759c(bArr));
            while (true) {
                C0182j c0182jM418i = c0182jM10623e.m418i();
                if (c0182jM418i == null) {
                    break;
                }
                if (AbstractC4154l.m8918a(c0182jM418i.m415f(), "message")) {
                    try {
                        objM10796a = l6.m11757a(c0182jM418i);
                    } catch (Throwable th2) {
                        objM10796a = od.m10796a(th2);
                    }
                    Throwable thM12363a = C6364n.m12363a(objM10796a);
                    if (thM12363a != null) {
                        objM10796a = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#regionDisabledMessage`)", thM12363a);
                    }
                    od.m10798c(objM10796a);
                    str = (String) objM10796a;
                }
                c0182jM418i.m413d();
            }
        }
        RegionDisabledException regionDisabledException = new RegionDisabledException(str);
        regionDisabledException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return regionDisabledException;
    }

    /* renamed from: f */
    public static AliasExistsException m1834f(C0645a context, C5884l call, byte[] bArr) {
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
        AliasExistsException aliasExistsException = new AliasExistsException(strMo62d);
        aliasExistsException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return aliasExistsException;
    }

    /* renamed from: g */
    public static CodeDeliveryFailureException m1835g(C0645a context, C5884l call, byte[] bArr) {
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
        CodeDeliveryFailureException codeDeliveryFailureException = new CodeDeliveryFailureException(strMo62d);
        codeDeliveryFailureException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return codeDeliveryFailureException;
    }

    /* renamed from: h */
    public static CodeMismatchException m1836h(C0645a context, C5884l call, byte[] bArr) {
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
        CodeMismatchException codeMismatchException = new CodeMismatchException(strMo62d);
        codeMismatchException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return codeMismatchException;
    }

    /* renamed from: i */
    public static ExpiredCodeException m1837i(C0645a context, C5884l call, byte[] bArr) {
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
        ExpiredCodeException expiredCodeException = new ExpiredCodeException(strMo62d);
        expiredCodeException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return expiredCodeException;
    }

    /* renamed from: j */
    public static ForbiddenException m1838j(C0645a context, C5884l call, byte[] bArr) {
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
        ForbiddenException forbiddenException = new ForbiddenException(strMo62d);
        forbiddenException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return forbiddenException;
    }

    /* renamed from: k */
    public static InternalErrorException m1839k(C0645a context, C5884l call, byte[] bArr) {
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

    /* renamed from: l */
    public static InvalidEmailRoleAccessPolicyException m1840l(C0645a context, C5884l call, byte[] bArr) {
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
        InvalidEmailRoleAccessPolicyException invalidEmailRoleAccessPolicyException = new InvalidEmailRoleAccessPolicyException(strMo62d);
        invalidEmailRoleAccessPolicyException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return invalidEmailRoleAccessPolicyException;
    }

    /* renamed from: m */
    public static InvalidLambdaResponseException m1841m(C0645a context, C5884l call, byte[] bArr) {
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
        InvalidLambdaResponseException invalidLambdaResponseException = new InvalidLambdaResponseException(strMo62d);
        invalidLambdaResponseException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return invalidLambdaResponseException;
    }

    /* renamed from: n */
    public static InvalidParameterException m1842n(C0645a context, C5884l call, byte[] bArr) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(call, "call");
        f2 f2Var = new f2();
        if (bArr != null) {
            C2891c c2891c = new C2891c(bArr);
            C2274l c2274l = C2274l.f10291i;
            C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("message")}), 0);
            C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("reasonCode")}), 0);
            InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(a1.m14343w(c2271i, c2271i2), c2891c);
            while (true) {
                Integer numMo71n = interfaceC2264bM11231b.mo71n();
                int i10 = c2271i.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i10) {
                    int i11 = c2271i2.f10279b;
                    if (numMo71n == null || numMo71n.intValue() != i11) {
                        if (numMo71n == null) {
                            break;
                        }
                        interfaceC2264bM11231b.mo63e();
                    } else {
                        f2Var.f9312b = interfaceC2264bM11231b.mo62d();
                    }
                } else {
                    f2Var.f9311a = interfaceC2264bM11231b.mo62d();
                }
            }
        }
        return new InvalidParameterException(f2Var);
    }

    /* renamed from: o */
    public static InvalidPasswordException m1843o(C0645a context, C5884l call, byte[] bArr) {
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
        InvalidPasswordException invalidPasswordException = new InvalidPasswordException(strMo62d);
        invalidPasswordException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return invalidPasswordException;
    }

    /* renamed from: p */
    public static InvalidSmsRoleAccessPolicyException m1844p(C0645a context, C5884l call, byte[] bArr) {
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
        InvalidSmsRoleAccessPolicyException invalidSmsRoleAccessPolicyException = new InvalidSmsRoleAccessPolicyException(strMo62d);
        invalidSmsRoleAccessPolicyException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return invalidSmsRoleAccessPolicyException;
    }

    /* renamed from: q */
    public static InvalidSmsRoleTrustRelationshipException m1845q(C0645a context, C5884l call, byte[] bArr) {
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
        InvalidSmsRoleTrustRelationshipException invalidSmsRoleTrustRelationshipException = new InvalidSmsRoleTrustRelationshipException(strMo62d);
        invalidSmsRoleTrustRelationshipException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return invalidSmsRoleTrustRelationshipException;
    }

    /* renamed from: r */
    public static InvalidUserPoolConfigurationException m1846r(C0645a context, C5884l call, byte[] bArr) {
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
        InvalidUserPoolConfigurationException invalidUserPoolConfigurationException = new InvalidUserPoolConfigurationException(strMo62d);
        invalidUserPoolConfigurationException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return invalidUserPoolConfigurationException;
    }

    /* renamed from: s */
    public static LimitExceededException m1847s(C0645a context, C5884l call, byte[] bArr) {
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
        LimitExceededException limitExceededException = new LimitExceededException(strMo62d);
        limitExceededException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return limitExceededException;
    }

    /* renamed from: t */
    public static NotAuthorizedException m1848t(C0645a context, C5884l call, byte[] bArr) {
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

    /* renamed from: u */
    public static PasswordHistoryPolicyViolationException m1849u(C0645a context, C5884l call, byte[] bArr) {
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
        PasswordHistoryPolicyViolationException passwordHistoryPolicyViolationException = new PasswordHistoryPolicyViolationException(strMo62d);
        passwordHistoryPolicyViolationException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return passwordHistoryPolicyViolationException;
    }

    /* renamed from: v */
    public static PasswordResetRequiredException m1850v(C0645a context, C5884l call, byte[] bArr) {
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
        PasswordResetRequiredException passwordResetRequiredException = new PasswordResetRequiredException(strMo62d);
        passwordResetRequiredException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return passwordResetRequiredException;
    }

    /* renamed from: w */
    public static ResourceNotFoundException m1851w(C0645a context, C5884l call, byte[] bArr) {
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

    /* renamed from: x */
    public static SoftwareTokenMfaNotFoundException m1852x(C0645a context, C5884l call, byte[] bArr) {
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
        SoftwareTokenMfaNotFoundException softwareTokenMfaNotFoundException = new SoftwareTokenMfaNotFoundException(strMo62d);
        softwareTokenMfaNotFoundException.f3470c.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
        return softwareTokenMfaNotFoundException;
    }
}
