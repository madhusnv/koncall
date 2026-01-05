package com.amplifyframework.auth.cognito.helpers;

import android.app.Activity;
import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.exceptions.service.UserCancelledException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnCredentialAlreadyExistsException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnFailedException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnNotSupportedException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnRpMismatchException;
import com.amplifyframework.logging.Logger;
import java.lang.ref.WeakReference;
import org.objectweb.asm.Opcodes;
import p001o.ar7;
import p001o.bb4;
import p001o.bh3;
import p001o.bv8;
import p001o.e3e;
import p001o.eu4;
import p001o.fa4;
import p001o.ga4;
import p001o.ha4;
import p001o.ia4;
import p001o.id5;
import p001o.k0c;
import p001o.l75;
import p001o.m94;
import p001o.n64;
import p001o.o64;
import p001o.o94;
import p001o.oo7;
import p001o.qo7;
import p001o.r94;
import p001o.so7;
import p001o.sq8;
import p001o.t94;
import p001o.to7;
import p001o.tw5;
import p001o.uo7;
import p001o.uq8;
import p001o.v94;
import p001o.wo7;
import p001o.wre;
import p001o.yq7;
import p001o.za4;

/* loaded from: classes5.dex */
public final class WebAuthnHelper {
    private final Context context;
    private final bb4 credentialManager;
    private final Logger logger;

    @l75(m36647c = "com.amplifyframework.auth.cognito.helpers.WebAuthnHelper", m36648f = "WebAuthnHelper.kt", m36649l = {Opcodes.BASTORE}, m36650m = "createCredential")
    /* renamed from: com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$createCredential$1 */
    public static final class C105211 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105211(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebAuthnHelper.this.createCredential(null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.helpers.WebAuthnHelper", m36648f = "WebAuthnHelper.kt", m36649l = {64}, m36650m = "getCredential")
    /* renamed from: com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$getCredential$1 */
    public static final class C105221 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105221(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebAuthnHelper.this.getCredential(null, null, this);
        }
    }

    public WebAuthnHelper(Context context, bb4 bb4Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(bb4Var, "credentialManager");
        this.context = context;
        this.credentialManager = bb4Var;
        this.logger = AuthLogger.authLogger(this);
    }

    private final WebAuthnCredentialAlreadyExistsException alreadyExists(ga4 ga4Var) {
        return new WebAuthnCredentialAlreadyExistsException(ga4Var);
    }

    private final WebAuthnNotSupportedException notSupported(Exception exc) {
        return new WebAuthnNotSupportedException(exc);
    }

    private final Context resolveContext(WeakReference<Activity> weakReference) {
        Activity activity = weakReference.get();
        if (activity == null) {
            this.logger.warn("No Activity context available when accessing device PassKey. This will result in the system UI appearing in a new Task. We recommend setting the callingActivity option when invoking Amplify Auth APIs if you are using WebAuthn.");
        }
        return activity != null ? activity : this.context;
    }

    private final WebAuthnRpMismatchException rpMismatch(Exception exc) {
        return new WebAuthnRpMismatchException(exc);
    }

    private final AuthException toAuthException(o94 o94Var) {
        if (o94Var instanceof m94) {
            return userCancelledException(o94Var);
        }
        if (!(o94Var instanceof r94) && !(o94Var instanceof v94)) {
            if (!(o94Var instanceof fa4)) {
                return unknownException(o94Var);
            }
            tw5 tw5VarM26341b = ((fa4) o94Var).m26341b();
            return tw5VarM26341b instanceof k0c ? userCancelledException(o94Var) : tw5VarM26341b instanceof bv8 ? alreadyExists((ga4) o94Var) : tw5VarM26341b instanceof eu4 ? rpMismatch(o94Var) : unknownException(o94Var);
        }
        return notSupported(o94Var);
    }

    private final WebAuthnFailedException unknownException(o94 o94Var) {
        return new WebAuthnFailedException("Unable to create the passkey using the Androidx CredentialManager", null, o94Var, 2, null);
    }

    private final UserCancelledException userCancelledException(Exception exc) {
        UserCancelledException userCancelledException = new UserCancelledException("User cancelled granting access to PassKey", "Re-show the previous UI and allow user to try again", exc);
        this.logger.verbose("User cancelled the PassKey authorization UI");
        return userCancelledException;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: o94 -> 0x002d, TryCatch #0 {o94 -> 0x002d, blocks: (B:12:0x0029, B:23:0x005d, B:25:0x0063, B:28:0x0069, B:30:0x006e, B:31:0x007b), top: B:36:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: o94 -> 0x002d, TryCatch #0 {o94 -> 0x002d, blocks: (B:12:0x0029, B:23:0x005d, B:25:0x0063, B:28:0x0069, B:30:0x006e, B:31:0x007b), top: B:36:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: o94 -> 0x002d, TryCatch #0 {o94 -> 0x002d, blocks: (B:12:0x0029, B:23:0x005d, B:25:0x0063, B:28:0x0069, B:30:0x006e, B:31:0x007b), top: B:36:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCredential(String str, Activity activity, n64 n64Var) throws AuthException {
        C105211 c105211;
        WebAuthnHelper webAuthnHelper;
        ia4 ia4Var;
        if (n64Var instanceof C105211) {
            c105211 = (C105211) n64Var;
            int i = c105211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105211.label = i - Integer.MIN_VALUE;
            } else {
                c105211 = new C105211(n64Var);
            }
        }
        Object objM18534b = c105211.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105211.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webAuthnHelper = (WebAuthnHelper) c105211.L$0;
            try {
                wre.m54934b(objM18534b);
                t94 t94Var = (t94) objM18534b;
                ia4Var = !(t94Var instanceof ia4) ? (ia4) t94Var : null;
                if (ia4Var == null) {
                    return ia4Var.m31786a();
                }
                throw new WebAuthnFailedException("Android created wrong credential type", AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION, null, 4, null);
            } catch (o94 e) {
                e = e;
                throw webAuthnHelper.toAuthException(e);
            }
        }
        wre.m54934b(objM18534b);
        try {
            ha4 ha4Var = new ha4(str, null, false, null, false, 30, null);
            this.logger.verbose("Prompting user to create a PassKey");
            bb4 bb4Var = this.credentialManager;
            c105211.L$0 = this;
            c105211.label = 1;
            objM18534b = bb4Var.m18534b(activity, ha4Var, c105211);
            if (objM18534b == objM51918f) {
                return objM51918f;
            }
            t94 t94Var2 = (t94) objM18534b;
            if (!(t94Var2 instanceof ia4)) {
            }
            if (ia4Var == null) {
            }
        } catch (o94 e2) {
            e = e2;
            webAuthnHelper = this;
            throw webAuthnHelper.toAuthException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[Catch: qo7 -> 0x0031, TryCatch #1 {qo7 -> 0x0031, blocks: (B:12:0x002d, B:23:0x0079, B:25:0x0083, B:28:0x0089, B:30:0x008e, B:31:0x009b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: qo7 -> 0x0031, TryCatch #1 {qo7 -> 0x0031, blocks: (B:12:0x002d, B:23:0x0079, B:25:0x0083, B:28:0x0089, B:30:0x008e, B:31:0x009b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: qo7 -> 0x0031, TryCatch #1 {qo7 -> 0x0031, blocks: (B:12:0x002d, B:23:0x0079, B:25:0x0083, B:28:0x0089, B:30:0x008e, B:31:0x009b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCredential(String str, WeakReference<Activity> weakReference, n64 n64Var) {
        C105221 c105221;
        WebAuthnHelper webAuthnHelper;
        e3e e3eVar;
        if (n64Var instanceof C105221) {
            c105221 = (C105221) n64Var;
            int i = c105221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105221.label = i - Integer.MIN_VALUE;
            } else {
                c105221 = new C105221(n64Var);
            }
        }
        Object objM18535c = c105221.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105221.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webAuthnHelper = (WebAuthnHelper) c105221.L$0;
            try {
                wre.m54934b(objM18535c);
                za4 za4VarM51844a = ((uo7) objM18535c).m51844a();
                e3eVar = !(za4VarM51844a instanceof e3e) ? (e3e) za4VarM51844a : null;
                if (e3eVar == null) {
                    return e3eVar.m24256a();
                }
                throw new WebAuthnFailedException("Android returned wrong credential type", AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION, null, 4, null);
            } catch (qo7 e) {
                e = e;
                throw webAuthnHelper.toAuthException(e);
            }
        }
        wre.m54934b(objM18535c);
        try {
            to7 to7Var = new to7(bh3.m18963e(new ar7(str, null, null, 6, null)), null, false, null, false, 30, null);
            this.logger.verbose("Prompting user for PassKey authorization");
            bb4 bb4Var = this.credentialManager;
            Context contextResolveContext = resolveContext(weakReference);
            c105221.L$0 = this;
            c105221.label = 1;
            objM18535c = bb4Var.m18535c(contextResolveContext, to7Var, c105221);
            if (objM18535c == objM51918f) {
                return objM51918f;
            }
            za4 za4VarM51844a2 = ((uo7) objM18535c).m51844a();
            if (!(za4VarM51844a2 instanceof e3e)) {
            }
            if (e3eVar == null) {
            }
        } catch (qo7 e2) {
            e = e2;
            webAuthnHelper = this;
            throw webAuthnHelper.toAuthException(e);
        }
    }

    private final WebAuthnFailedException unknownException(qo7 qo7Var) {
        return new WebAuthnFailedException("Unable to retrieve the passkey from the Androidx CredentialManager", null, qo7Var, 2, null);
    }

    public /* synthetic */ WebAuthnHelper(Context context, bb4 bb4Var, int i, id5 id5Var) {
        this(context, (i & 2) != 0 ? bb4.f15855a.m18538a(context) : bb4Var);
    }

    private final AuthException toAuthException(qo7 qo7Var) {
        if (qo7Var instanceof oo7) {
            return userCancelledException(qo7Var);
        }
        if (!(qo7Var instanceof so7) && !(qo7Var instanceof wo7)) {
            if (qo7Var instanceof yq7) {
                tw5 tw5VarM58116b = ((yq7) qo7Var).m58116b();
                return tw5VarM58116b instanceof k0c ? userCancelledException(qo7Var) : tw5VarM58116b instanceof eu4 ? rpMismatch(qo7Var) : unknownException(qo7Var);
            }
            return unknownException(qo7Var);
        }
        return notSupported(qo7Var);
    }
}
