package p001o;

import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult;
import com.amplifyframework.auth.cognito.result.GlobalSignOutError;
import com.amplifyframework.auth.cognito.result.HostedUIError;
import com.amplifyframework.auth.cognito.result.RevokeTokenError;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import p001o.vre;
import p001o.yne;

/* loaded from: classes.dex */
public final class j01 {

    /* renamed from: d */
    public static final C14405a f29455d = new C14405a(null);

    /* renamed from: e */
    public static final int f29456e = 8;

    /* renamed from: f */
    public static final j01 f29457f = new j01();

    /* renamed from: g */
    public static final ReentrantLock f29458g = new ReentrantLock();

    /* renamed from: b */
    public AWSCognitoAuthSession f29460b;

    /* renamed from: a */
    public final nqb f29459a = tqb.m50340b(false, 1, null);

    /* renamed from: c */
    public final h84 f29461c = p74.f39487a.m43082j();

    /* renamed from: o.j01$a */
    public static final class C14405a {
        public C14405a() {
        }

        public /* synthetic */ C14405a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final j01 m32992a() {
            return j01.f29457f;
        }
    }

    /* renamed from: o.j01$b */
    public static final class C14406b extends jgg implements nl7 {

        /* renamed from: a */
        public int f29462a;

        /* renamed from: b */
        public /* synthetic */ Object f29463b;

        public C14406b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14406b c14406b = j01.this.new C14406b(n64Var);
            c14406b.f29463b = obj;
            return c14406b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14406b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            boolean zBooleanValue;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f29462a;
            boolean z = true;
            try {
            } catch (Throwable th) {
                r1.getClass();
                yne yneVarM58028a = yne.f55736e.m58028a(ml1.m39301a(false), "Couldn't refresh auth session", th);
                this.f29463b = null;
                this.f29462a = 4;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29463b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29463b = ogaVar2;
                this.f29462a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 == 3) {
                            wre.m54934b(obj);
                        } else {
                            if (r1 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            wre.m54934b(obj);
                        }
                        return y3i.f54824a;
                    }
                    ogaVar = (oga) this.f29463b;
                    wre.m54934b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    yne.C18447a c18447a = yne.f55736e;
                    if (zBooleanValue) {
                        z = false;
                    }
                    yneVarM58030d = c18447a.m58030d(ml1.m39301a(z));
                    this.f29463b = ogaVar;
                    this.f29462a = 3;
                    if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f29463b;
                wre.m54934b(obj);
            }
            j01 j01Var = j01.this;
            this.f29463b = ogaVar;
            this.f29462a = 2;
            obj = j01Var.m32985n(this);
            if (obj == objM51918f) {
                return objM51918f;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            yne.C18447a c18447a2 = yne.f55736e;
            if (zBooleanValue) {
            }
            yneVarM58030d = c18447a2.m58030d(ml1.m39301a(z));
            this.f29463b = ogaVar;
            this.f29462a = 3;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j01$c */
    public static final class C14407c extends jgg implements nl7 {

        /* renamed from: a */
        public Object f29465a;

        /* renamed from: b */
        public Object f29466b;

        /* renamed from: c */
        public int f29467c;

        /* renamed from: e */
        public final /* synthetic */ AtomicReference f29469e;

        /* renamed from: o.j01$c$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public Object f29470a;

            /* renamed from: b */
            public Object f29471b;

            /* renamed from: c */
            public Object f29472c;

            /* renamed from: d */
            public int f29473d;

            /* renamed from: e */
            public final /* synthetic */ j01 f29474e;

            /* renamed from: f */
            public final /* synthetic */ AtomicReference f29475f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j01 j01Var, AtomicReference atomicReference, n64 n64Var) {
                super(2, n64Var);
                this.f29474e = j01Var;
                this.f29475f = atomicReference;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f29474e, this.f29475f, n64Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:17:0x0055, B:19:0x005b), top: B:27:0x0055 }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AtomicReference atomicReference;
                nqb nqbVar;
                j01 j01Var;
                Object objM51918f = uq8.m51918f();
                int i = this.f29473d;
                if (i == 0) {
                    wre.m54934b(obj);
                    j01 j01Var2 = this.f29474e;
                    this.f29473d = 1;
                    if (j01Var2.m32987p(true, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        atomicReference = (AtomicReference) this.f29472c;
                        j01Var = (j01) this.f29471b;
                        nqbVar = (nqb) this.f29470a;
                        wre.m54934b(obj);
                        try {
                            AWSCognitoAuthSession aWSCognitoAuthSession = j01Var.f29460b;
                            AWSCognitoAuthSession aWSCognitoAuthSessionCopy$default = aWSCognitoAuthSession == null ? AWSCognitoAuthSession.copy$default(aWSCognitoAuthSession, false, null, null, null, null, 31, null) : null;
                            nqbVar.mo40923c(null);
                            atomicReference.set(aWSCognitoAuthSessionCopy$default);
                            return y3i.f54824a;
                        } catch (Throwable th) {
                            nqbVar.mo40923c(null);
                            throw th;
                        }
                    }
                    wre.m54934b(obj);
                }
                AtomicReference atomicReference2 = this.f29475f;
                nqb nqbVar2 = this.f29474e.f29459a;
                j01 j01Var3 = this.f29474e;
                this.f29470a = nqbVar2;
                this.f29471b = j01Var3;
                this.f29472c = atomicReference2;
                this.f29473d = 2;
                if (nqbVar2.mo40922b(null, this) == objM51918f) {
                    return objM51918f;
                }
                atomicReference = atomicReference2;
                nqbVar = nqbVar2;
                j01Var = j01Var3;
                AWSCognitoAuthSession aWSCognitoAuthSession2 = j01Var.f29460b;
                if (aWSCognitoAuthSession2 == null) {
                }
                nqbVar.mo40923c(null);
                atomicReference.set(aWSCognitoAuthSessionCopy$default);
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14407c(AtomicReference atomicReference, n64 n64Var) {
            super(2, n64Var);
            this.f29469e = atomicReference;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return j01.this.new C14407c(this.f29469e, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j01 j01Var;
            nqb nqbVar;
            AWSCognitoUserPoolTokens value;
            Object objM51918f = uq8.m51918f();
            int i = this.f29467c;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    nqb nqbVar2 = j01.this.f29459a;
                    j01Var = j01.this;
                    this.f29465a = nqbVar2;
                    this.f29466b = j01Var;
                    this.f29467c = 1;
                    if (nqbVar2.mo40922b(null, this) == objM51918f) {
                        return objM51918f;
                    }
                    nqbVar = nqbVar2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    j01Var = (j01) this.f29466b;
                    nqbVar = (nqb) this.f29465a;
                    wre.m54934b(obj);
                }
                AWSCognitoAuthSession aWSCognitoAuthSession = j01Var.f29460b;
                AWSCognitoAuthSession aWSCognitoAuthSessionCopy$default = aWSCognitoAuthSession != null ? AWSCognitoAuthSession.copy$default(aWSCognitoAuthSession, false, null, null, null, null, 31, null) : null;
                nqbVar.mo40923c(null);
                this.f29469e.set(aWSCognitoAuthSessionCopy$default);
                if (aWSCognitoAuthSessionCopy$default == null || !aWSCognitoAuthSessionCopy$default.isSignedIn()) {
                    a aVar = new a(j01.this, this.f29469e, null);
                    this.f29465a = null;
                    this.f29466b = null;
                    this.f29467c = 2;
                    if (rmh.m46984c(60000L, aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult = aWSCognitoAuthSessionCopy$default.getUserPoolTokensResult();
                    if ((userPoolTokensResult != null ? userPoolTokensResult.getValue() : null) != null) {
                        AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult2 = aWSCognitoAuthSessionCopy$default.getUserPoolTokensResult();
                        if (sq8.m48644c((userPoolTokensResult2 == null || (value = userPoolTokensResult2.getValue()) == null) ? null : value.getIdToken(), "")) {
                        }
                    }
                }
                return y3i.f54824a;
            } catch (Throwable th) {
                nqbVar.mo40923c(null);
                throw th;
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14407c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.j01$d */
    public static final class C14408d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ xb2 f29476a;

        public C14408d(xb2 xb2Var) {
            this.f29476a = xb2Var;
        }

        @Override // com.amplifyframework.core.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AuthSession authSession) {
            sq8.m48649h(authSession, OutcomeEventsTable.COLUMN_NAME_SESSION);
            this.f29476a.resumeWith(vre.m53351b(authSession));
        }
    }

    /* renamed from: o.j01$e */
    public static final class C14409e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ xb2 f29477a;

        public C14409e(xb2 xb2Var) {
            this.f29477a = xb2Var;
        }

        @Override // com.amplifyframework.core.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AuthException authException) {
            sq8.m48649h(authException, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            xb2 xb2Var = this.f29477a;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(authException)));
        }
    }

    /* renamed from: o.j01$f */
    public static final class C14410f extends jgg implements nl7 {

        /* renamed from: a */
        public int f29478a;

        public C14410f(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return j01.this.new C14410f(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f29478a;
            if (i == 0) {
                wre.m54934b(obj);
                j01 j01Var = j01.this;
                this.f29478a = 1;
                obj = j01Var.m32982i(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14410f) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.j01$g */
    public static final class C14411g extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f29480a;

        /* renamed from: c */
        public int f29482c;

        public C14411g(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f29480a = obj;
            this.f29482c |= Integer.MIN_VALUE;
            return j01.this.m32985n(this);
        }
    }

    /* renamed from: o.j01$h */
    public static final class C14412h extends jgg implements nl7 {

        /* renamed from: a */
        public int f29483a;

        public C14412h(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return j01.this.new C14412h(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f29483a;
            if (i == 0) {
                wre.m54934b(obj);
                j01 j01Var = j01.this;
                this.f29483a = 1;
                obj = j01Var.m32985n(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14412h) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.j01$i */
    public static final class C14413i extends o64 {

        /* renamed from: a */
        public Object f29485a;

        /* renamed from: b */
        public Object f29486b;

        /* renamed from: c */
        public Object f29487c;

        /* renamed from: d */
        public /* synthetic */ Object f29488d;

        /* renamed from: f */
        public int f29490f;

        public C14413i(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f29488d = obj;
            this.f29490f |= Integer.MIN_VALUE;
            return j01.this.m32987p(false, this);
        }
    }

    /* renamed from: o.j01$j */
    public static final class C14414j extends jgg implements nl7 {

        /* renamed from: a */
        public int f29491a;

        /* renamed from: c */
        public final /* synthetic */ AuthFetchSessionOptions f29493c;

        /* renamed from: o.j01$j$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f29494a;

            /* renamed from: b */
            public final /* synthetic */ j01 f29495b;

            /* renamed from: c */
            public final /* synthetic */ AuthFetchSessionOptions f29496c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j01 j01Var, AuthFetchSessionOptions authFetchSessionOptions, n64 n64Var) {
                super(2, n64Var);
                this.f29495b = j01Var;
                this.f29496c = authFetchSessionOptions;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f29495b, this.f29496c, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f29494a;
                if (i == 0) {
                    wre.m54934b(obj);
                    j01 j01Var = this.f29495b;
                    AuthFetchSessionOptions authFetchSessionOptions = this.f29496c;
                    this.f29494a = 1;
                    obj = j01Var.m32983l(authFetchSessionOptions, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                sq8.m48647f(obj, "null cannot be cast to non-null type com.amplifyframework.auth.cognito.AWSCognitoAuthSession");
                return (AWSCognitoAuthSession) obj;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14414j(AuthFetchSessionOptions authFetchSessionOptions, n64 n64Var) {
            super(2, n64Var);
            this.f29493c = authFetchSessionOptions;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return j01.this.new C14414j(this.f29493c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f29491a;
            if (i == 0) {
                wre.m54934b(obj);
                z74 z74VarM25611b = eu5.m25611b();
                a aVar = new a(j01.this, this.f29493c, null);
                this.f29491a = 1;
                obj = pm1.m43867g(z74VarM25611b, aVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14414j) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.j01$k */
    public static final class C14415k extends jgg implements nl7 {

        /* renamed from: a */
        public int f29497a;

        /* renamed from: b */
        public /* synthetic */ Object f29498b;

        public C14415k(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14415k c14415k = j01.this.new C14415k(n64Var);
            c14415k.f29498b = obj;
            return c14415k;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14415k) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, o.oga] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            boolean zBooleanValue;
            yne yneVarM58030d;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f29497a;
            boolean z = true;
            try {
            } catch (Throwable th) {
                r1.getClass();
                yne yneVarM58028a = yne.f55736e.m58028a(ml1.m39301a(false), "Couldn't refresh auth session", th);
                this.f29498b = null;
                this.f29497a = 5;
                if (r1.emit(yneVarM58028a, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f29498b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f29498b = ogaVar2;
                this.f29497a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        ogaVar = (oga) this.f29498b;
                        wre.m54934b(obj);
                        j01 j01Var = j01.this;
                        this.f29498b = ogaVar;
                        this.f29497a = 3;
                        obj = j01Var.m32985n(this);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        yne.C18447a c18447a = yne.f55736e;
                        if (!zBooleanValue) {
                        }
                        yneVarM58030d = c18447a.m58030d(ml1.m39301a(z));
                        this.f29498b = ogaVar;
                        this.f29497a = 4;
                        if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                        }
                        return y3i.f54824a;
                    }
                    if (r1 != 3) {
                        if (r1 == 4) {
                            wre.m54934b(obj);
                        } else {
                            if (r1 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            wre.m54934b(obj);
                        }
                        return y3i.f54824a;
                    }
                    ogaVar = (oga) this.f29498b;
                    wre.m54934b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    yne.C18447a c18447a2 = yne.f55736e;
                    if (!zBooleanValue) {
                        z = false;
                    }
                    yneVarM58030d = c18447a2.m58030d(ml1.m39301a(z));
                    this.f29498b = ogaVar;
                    this.f29497a = 4;
                    if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                ogaVar = (oga) this.f29498b;
                wre.m54934b(obj);
            }
            j01 j01Var2 = j01.this;
            this.f29498b = ogaVar;
            this.f29497a = 2;
            if (j01Var2.m32987p(true, this) == objM51918f) {
                return objM51918f;
            }
            j01 j01Var3 = j01.this;
            this.f29498b = ogaVar;
            this.f29497a = 3;
            obj = j01Var3.m32985n(this);
            if (obj == objM51918f) {
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            yne.C18447a c18447a22 = yne.f55736e;
            if (!zBooleanValue) {
            }
            yneVarM58030d = c18447a22.m58030d(ml1.m39301a(z));
            this.f29498b = ogaVar;
            this.f29497a = 4;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.j01$l */
    public static final class C14416l extends jgg implements nl7 {

        /* renamed from: a */
        public Object f29500a;

        /* renamed from: b */
        public Object f29501b;

        /* renamed from: c */
        public int f29502c;

        public C14416l(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return j01.this.new C14416l(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            nqb nqbVar;
            j01 j01Var;
            Object objM51918f = uq8.m51918f();
            int i = this.f29502c;
            if (i == 0) {
                wre.m54934b(obj);
                nqbVar = j01.this.f29459a;
                j01 j01Var2 = j01.this;
                this.f29500a = nqbVar;
                this.f29501b = j01Var2;
                this.f29502c = 1;
                if (nqbVar.mo40922b(null, this) == objM51918f) {
                    return objM51918f;
                }
                j01Var = j01Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j01Var = (j01) this.f29501b;
                nqbVar = (nqb) this.f29500a;
                wre.m54934b(obj);
            }
            try {
                j01Var.f29460b = null;
                y3i y3iVar = y3i.f54824a;
                nqbVar.mo40923c(null);
                return y3i.f54824a;
            } catch (Throwable th) {
                nqbVar.mo40923c(null);
                throw th;
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14416l) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.j01$m */
    public static final class C14417m extends jgg implements xk7 {

        /* renamed from: a */
        public Object f29504a;

        /* renamed from: b */
        public Object f29505b;

        /* renamed from: c */
        public Object f29506c;

        /* renamed from: d */
        public int f29507d;

        /* renamed from: f */
        public final /* synthetic */ uk7 f29509f;

        /* renamed from: o.j01$m$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f29510a;

            /* renamed from: b */
            public final /* synthetic */ uk7 f29511b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uk7 uk7Var, n64 n64Var) {
                super(2, n64Var);
                this.f29511b = uk7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f29511b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f29510a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                uk7 uk7Var = this.f29511b;
                if (uk7Var == null) {
                    return null;
                }
                uk7Var.invoke();
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14417m(uk7 uk7Var, n64 n64Var) {
            super(1, n64Var);
            this.f29509f = uk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return j01.this.new C14417m(this.f29509f, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:16:0x004d, B:17:0x0051, B:23:0x0064, B:25:0x006c, B:20:0x0058), top: B:52:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[PHI: r5
          0x00d1: PHI (r5v8 java.lang.Object) = (r5v5 java.lang.Object), (r5v0 java.lang.Object) binds: [B:42:0x00ce, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            nqb nqbVar;
            j01 j01Var;
            j01 j01Var2;
            Object objM51918f = uq8.m51918f();
            try {
            } catch (Throwable unused) {
                nqbVar = j01.this.f29459a;
                j01Var = j01.this;
                this.f29504a = nqbVar;
                this.f29505b = j01Var;
                this.f29507d = 4;
                if (nqbVar.mo40922b(null, this) == objM51918f) {
                    return objM51918f;
                }
            }
            switch (this.f29507d) {
                case 0:
                    wre.m54934b(obj);
                    j01 j01Var3 = j01.this;
                    this.f29507d = 1;
                    obj = j01Var3.m32985n(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        j01 j01Var4 = j01.this;
                        this.f29507d = 2;
                        if (j01Var4.m32991t(this) == objM51918f) {
                            return objM51918f;
                        }
                    }
                    nqbVar = j01.this.f29459a;
                    j01Var2 = j01.this;
                    this.f29504a = nqbVar;
                    this.f29505b = j01Var2;
                    this.f29507d = 3;
                    if (nqbVar.mo40922b(null, this) == objM51918f) {
                        return objM51918f;
                    }
                    try {
                        j01Var2.f29460b = null;
                        y3i y3iVar = y3i.f54824a;
                        jpa jpaVarM25612c = eu5.m25612c();
                        a aVar = new a(this.f29509f, null);
                        this.f29504a = null;
                        this.f29505b = null;
                        this.f29507d = 6;
                        obj = pm1.m43867g(jpaVarM25612c, aVar, this);
                        return obj == objM51918f ? objM51918f : obj;
                    } finally {
                    }
                case 1:
                    wre.m54934b(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                    nqbVar = j01.this.f29459a;
                    j01Var2 = j01.this;
                    this.f29504a = nqbVar;
                    this.f29505b = j01Var2;
                    this.f29507d = 3;
                    if (nqbVar.mo40922b(null, this) == objM51918f) {
                    }
                    j01Var2.f29460b = null;
                    y3i y3iVar2 = y3i.f54824a;
                    jpa jpaVarM25612c2 = eu5.m25612c();
                    a aVar2 = new a(this.f29509f, null);
                    this.f29504a = null;
                    this.f29505b = null;
                    this.f29507d = 6;
                    obj = pm1.m43867g(jpaVarM25612c2, aVar2, this);
                    if (obj == objM51918f) {
                    }
                    break;
                case 2:
                    wre.m54934b(obj);
                    nqbVar = j01.this.f29459a;
                    j01Var2 = j01.this;
                    this.f29504a = nqbVar;
                    this.f29505b = j01Var2;
                    this.f29507d = 3;
                    if (nqbVar.mo40922b(null, this) == objM51918f) {
                    }
                    j01Var2.f29460b = null;
                    y3i y3iVar22 = y3i.f54824a;
                    jpa jpaVarM25612c22 = eu5.m25612c();
                    a aVar22 = new a(this.f29509f, null);
                    this.f29504a = null;
                    this.f29505b = null;
                    this.f29507d = 6;
                    obj = pm1.m43867g(jpaVarM25612c22, aVar22, this);
                    if (obj == objM51918f) {
                    }
                    break;
                case 3:
                    j01Var2 = (j01) this.f29505b;
                    nqbVar = (nqb) this.f29504a;
                    wre.m54934b(obj);
                    j01Var2.f29460b = null;
                    y3i y3iVar222 = y3i.f54824a;
                    jpa jpaVarM25612c222 = eu5.m25612c();
                    a aVar222 = new a(this.f29509f, null);
                    this.f29504a = null;
                    this.f29505b = null;
                    this.f29507d = 6;
                    obj = pm1.m43867g(jpaVarM25612c222, aVar222, this);
                    if (obj == objM51918f) {
                    }
                    break;
                case 4:
                    j01Var = (j01) this.f29505b;
                    nqbVar = (nqb) this.f29504a;
                    wre.m54934b(obj);
                    try {
                        j01Var.f29460b = null;
                        y3i y3iVar3 = y3i.f54824a;
                        jpa jpaVarM25612c2222 = eu5.m25612c();
                        a aVar2222 = new a(this.f29509f, null);
                        this.f29504a = null;
                        this.f29505b = null;
                        this.f29507d = 6;
                        obj = pm1.m43867g(jpaVarM25612c2222, aVar2222, this);
                        if (obj == objM51918f) {
                        }
                    } finally {
                    }
                    break;
                case 5:
                    j01 j01Var5 = (j01) this.f29506c;
                    nqb nqbVar2 = (nqb) this.f29505b;
                    Throwable th = (Throwable) this.f29504a;
                    wre.m54934b(obj);
                    try {
                        j01Var5.f29460b = null;
                        y3i y3iVar4 = y3i.f54824a;
                        throw th;
                    } finally {
                        nqbVar2.mo40923c(null);
                    }
                case 6:
                    wre.m54934b(obj);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C14417m) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.j01$n */
    public static final class C14418n implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ xb2 f29512a;

        /* renamed from: b */
        public final /* synthetic */ j01 f29513b;

        /* renamed from: o.j01$n$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public Object f29514a;

            /* renamed from: b */
            public Object f29515b;

            /* renamed from: c */
            public int f29516c;

            /* renamed from: d */
            public final /* synthetic */ j01 f29517d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j01 j01Var, n64 n64Var) {
                super(2, n64Var);
                this.f29517d = j01Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f29517d, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                nqb nqbVar;
                j01 j01Var;
                Object objM51918f = uq8.m51918f();
                int i = this.f29516c;
                if (i == 0) {
                    wre.m54934b(obj);
                    nqbVar = this.f29517d.f29459a;
                    j01 j01Var2 = this.f29517d;
                    this.f29514a = nqbVar;
                    this.f29515b = j01Var2;
                    this.f29516c = 1;
                    if (nqbVar.mo40922b(null, this) == objM51918f) {
                        return objM51918f;
                    }
                    j01Var = j01Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j01Var = (j01) this.f29515b;
                    nqbVar = (nqb) this.f29514a;
                    wre.m54934b(obj);
                }
                try {
                    j01Var.f29460b = null;
                    y3i y3iVar = y3i.f54824a;
                    nqbVar.mo40923c(null);
                    return y3i.f54824a;
                } catch (Throwable th) {
                    nqbVar.mo40923c(null);
                    throw th;
                }
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C14418n(xb2 xb2Var, j01 j01Var) {
            this.f29512a = xb2Var;
            this.f29513b = j01Var;
        }

        @Override // com.amplifyframework.core.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AuthSignOutResult authSignOutResult) {
            sq8.m48649h(authSignOutResult, "signOutResult");
            if (authSignOutResult instanceof AWSCognitoAuthSignOutResult.CompleteSignOut) {
                qm1.m45641b(null, new a(this.f29513b, null), 1, null);
                this.f29512a.resumeWith(vre.m53351b(authSignOutResult));
                return;
            }
            if (!(authSignOutResult instanceof AWSCognitoAuthSignOutResult.PartialSignOut)) {
                if (authSignOutResult instanceof AWSCognitoAuthSignOutResult.FailedSignOut) {
                    AWSCognitoAuthSignOutResult.FailedSignOut failedSignOut = (AWSCognitoAuthSignOutResult.FailedSignOut) authSignOutResult;
                    failedSignOut.getException();
                    xb2 xb2Var = this.f29512a;
                    vre.C17665a c17665a = vre.f50797b;
                    xb2Var.resumeWith(vre.m53351b(wre.m54933a(failedSignOut.getException())));
                    return;
                }
                return;
            }
            AWSCognitoAuthSignOutResult.PartialSignOut partialSignOut = (AWSCognitoAuthSignOutResult.PartialSignOut) authSignOutResult;
            HostedUIError hostedUIError = partialSignOut.getHostedUIError();
            if (hostedUIError != null) {
                hostedUIError.getException();
            }
            GlobalSignOutError globalSignOutError = partialSignOut.getGlobalSignOutError();
            if (globalSignOutError != null) {
                globalSignOutError.getException();
            }
            RevokeTokenError revokeTokenError = partialSignOut.getRevokeTokenError();
            if (revokeTokenError != null) {
                revokeTokenError.getException();
            }
            this.f29512a.resumeWith(vre.m53351b(authSignOutResult));
        }
    }

    /* renamed from: j */
    public static final void m32978j(j01 j01Var, AtomicReference atomicReference) {
        sq8.m48649h(j01Var, "this$0");
        sq8.m48649h(atomicReference, "$session");
        qm1.m45641b(null, j01Var.new C14407c(atomicReference, null), 1, null);
    }

    /* renamed from: k */
    public static final void m32979k() {
        f29458g.unlock();
    }

    /* renamed from: g */
    public final Optional m32980g() {
        Optional optionalEmpty;
        AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult;
        AWSCognitoUserPoolTokens value;
        String idToken;
        Boolean boolValueOf = Boolean.valueOf(m32984m());
        Optional optional = null;
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            boolValueOf.booleanValue();
            AWSCognitoAuthSession aWSCognitoAuthSession = this.f29460b;
            AWSCognitoAuthSession aWSCognitoAuthSessionCopy$default = aWSCognitoAuthSession != null ? AWSCognitoAuthSession.copy$default(aWSCognitoAuthSession, false, null, null, null, null, 31, null) : null;
            if (aWSCognitoAuthSessionCopy$default == null || (userPoolTokensResult = aWSCognitoAuthSessionCopy$default.getUserPoolTokensResult()) == null || (value = userPoolTokensResult.getValue()) == null || (idToken = value.getIdToken()) == null || (optionalEmpty = Optional.of(idToken)) == null) {
                optionalEmpty = Optional.empty();
            }
            optional = optionalEmpty;
        }
        if (optional != null) {
            return optional;
        }
        Optional optionalEmpty2 = Optional.empty();
        sq8.m48648g(optionalEmpty2, "empty(...)");
        return optionalEmpty2;
    }

    /* renamed from: h */
    public final AbstractC2145n m32981h() {
        return e84.m24521b(eu5.m25611b(), 0L, new C14406b(null), 2, null);
    }

    /* renamed from: i */
    public final Object m32982i(n64 n64Var) {
        final AtomicReference atomicReference = new AtomicReference();
        f29458g.lock();
        ayh.Z2(new o83() { // from class: o.h01
            @Override // p001o.o83
            public final void run() {
                j01.m32978j(this.f26035a, atomicReference);
            }
        }).h3(new Runnable() { // from class: o.i01
            @Override // java.lang.Runnable
            public final void run() {
                j01.m32979k();
            }
        });
        return atomicReference.get();
    }

    /* renamed from: l */
    public final Object m32983l(AuthFetchSessionOptions authFetchSessionOptions, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        Amplify.Auth.fetchAuthSession(authFetchSessionOptions, new C14408d(zb2Var), new C14409e(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m32984m() {
        AWSCognitoAuthSession aWSCognitoAuthSessionCopy$default;
        boolean z;
        AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult;
        AWSCognitoUserPoolTokens value;
        AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult2;
        AWSCognitoAuthSession aWSCognitoAuthSession = this.f29460b;
        String idToken = null;
        if (aWSCognitoAuthSession == null || (aWSCognitoAuthSessionCopy$default = AWSCognitoAuthSession.copy$default(aWSCognitoAuthSession, false, null, null, null, null, 31, null)) == null) {
            aWSCognitoAuthSessionCopy$default = (AWSCognitoAuthSession) qm1.m45641b(null, new C14410f(null), 1, null);
        }
        boolean z2 = aWSCognitoAuthSessionCopy$default != null && aWSCognitoAuthSessionCopy$default.isSignedIn();
        if (((aWSCognitoAuthSessionCopy$default == null || (userPoolTokensResult2 = aWSCognitoAuthSessionCopy$default.getUserPoolTokensResult()) == null) ? null : userPoolTokensResult2.getValue()) == null) {
            z = false;
        } else {
            if (aWSCognitoAuthSessionCopy$default != null && (userPoolTokensResult = aWSCognitoAuthSessionCopy$default.getUserPoolTokensResult()) != null && (value = userPoolTokensResult.getValue()) != null) {
                idToken = value.getIdToken();
            }
            if (!sq8.m48644c(idToken, "")) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Checking isSignedIn: isSessionSignedIn=");
        sb.append(z2);
        sb.append(", isTokenPresent=");
        sb.append(z);
        return z2 && z;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m32985n(n64 n64Var) {
        C14411g c14411g;
        boolean z;
        AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult;
        AWSCognitoUserPoolTokens value;
        AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult2;
        if (n64Var instanceof C14411g) {
            c14411g = (C14411g) n64Var;
            int i = c14411g.f29482c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14411g.f29482c = i - Integer.MIN_VALUE;
            } else {
                c14411g = new C14411g(n64Var);
            }
        }
        Object objM32982i = c14411g.f29480a;
        Object objM51918f = uq8.m51918f();
        int i2 = c14411g.f29482c;
        if (i2 == 0) {
            wre.m54934b(objM32982i);
            c14411g.f29482c = 1;
            objM32982i = m32982i(c14411g);
            if (objM32982i == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objM32982i);
        }
        AWSCognitoAuthSession aWSCognitoAuthSession = (AWSCognitoAuthSession) objM32982i;
        boolean z2 = aWSCognitoAuthSession != null && aWSCognitoAuthSession.isSignedIn();
        String idToken = null;
        if (((aWSCognitoAuthSession == null || (userPoolTokensResult2 = aWSCognitoAuthSession.getUserPoolTokensResult()) == null) ? null : userPoolTokensResult2.getValue()) == null) {
            z = false;
        } else {
            if (aWSCognitoAuthSession != null && (userPoolTokensResult = aWSCognitoAuthSession.getUserPoolTokensResult()) != null && (value = userPoolTokensResult.getValue()) != null) {
                idToken = value.getIdToken();
            }
            if (!sq8.m48644c(idToken, "")) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Checking isSignedIn: isSessionSignedIn=");
        sb.append(z2);
        sb.append(", isTokenPresent=");
        sb.append(z);
        return ml1.m39301a(z2 && z);
    }

    /* renamed from: o */
    public final x6c m32986o() {
        x6c x6cVarY0 = mwe.m39737b(eu5.m25611b(), new C14412h(null)).m55027y().y0(i5f.m31599c());
        sq8.m48648g(x6cVarY0, "subscribeOn(...)");
        return x6cVarY0;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m32987p(boolean z, n64 n64Var) {
        C14413i c14413i;
        j01 j01Var;
        AWSCognitoAuthSession aWSCognitoAuthSession;
        j01 j01Var2;
        nqb nqbVar;
        nqb nqbVar2;
        j01 j01Var3;
        nqb nqbVar3;
        if (n64Var instanceof C14413i) {
            c14413i = (C14413i) n64Var;
            int i = c14413i.f29490f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14413i.f29490f = i - Integer.MIN_VALUE;
            } else {
                c14413i = new C14413i(n64Var);
            }
        }
        Object objM46984c = c14413i.f29488d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14413i.f29490f;
        if (i2 == 0) {
            wre.m54934b(objM46984c);
            try {
                C14414j c14414j = new C14414j(AuthFetchSessionOptions.Companion.builder().forceRefresh(z).build(), null);
                c14413i.f29485a = this;
                c14413i.f29490f = 1;
                objM46984c = rmh.m46984c(30000L, c14414j, c14413i);
                if (objM46984c == objM51918f) {
                    return objM51918f;
                }
                j01Var = this;
            } catch (Throwable unused) {
                j01Var = this;
                j01Var.getClass();
                nqbVar2 = j01Var.f29459a;
                c14413i.f29485a = j01Var;
                c14413i.f29486b = nqbVar2;
                c14413i.f29487c = null;
                c14413i.f29490f = 3;
                if (nqbVar2.mo40922b(null, c14413i) == objM51918f) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nqbVar3 = (nqb) c14413i.f29486b;
                    j01Var3 = (j01) c14413i.f29485a;
                    wre.m54934b(objM46984c);
                    try {
                        j01Var3.f29460b = null;
                        y3i y3iVar = y3i.f54824a;
                        return y3i.f54824a;
                    } finally {
                    }
                }
                nqbVar = (nqb) c14413i.f29487c;
                aWSCognitoAuthSession = (AWSCognitoAuthSession) c14413i.f29486b;
                j01Var2 = (j01) c14413i.f29485a;
                try {
                    wre.m54934b(objM46984c);
                    try {
                        j01Var2.f29460b = aWSCognitoAuthSession;
                        y3i y3iVar2 = y3i.f54824a;
                        nqbVar.mo40923c(null);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    j01Var = j01Var2;
                    j01Var.getClass();
                    nqbVar2 = j01Var.f29459a;
                    c14413i.f29485a = j01Var;
                    c14413i.f29486b = nqbVar2;
                    c14413i.f29487c = null;
                    c14413i.f29490f = 3;
                    if (nqbVar2.mo40922b(null, c14413i) == objM51918f) {
                        return objM51918f;
                    }
                    j01Var3 = j01Var;
                    nqbVar3 = nqbVar2;
                    j01Var3.f29460b = null;
                    y3i y3iVar3 = y3i.f54824a;
                    return y3i.f54824a;
                }
                return y3i.f54824a;
            }
            j01Var = (j01) c14413i.f29485a;
            try {
                wre.m54934b(objM46984c);
            } catch (Throwable unused3) {
                j01Var.getClass();
                nqbVar2 = j01Var.f29459a;
                c14413i.f29485a = j01Var;
                c14413i.f29486b = nqbVar2;
                c14413i.f29487c = null;
                c14413i.f29490f = 3;
                if (nqbVar2.mo40922b(null, c14413i) == objM51918f) {
                }
            }
        }
        aWSCognitoAuthSession = (AWSCognitoAuthSession) objM46984c;
        nqb nqbVar4 = j01Var.f29459a;
        c14413i.f29485a = j01Var;
        c14413i.f29486b = aWSCognitoAuthSession;
        c14413i.f29487c = nqbVar4;
        c14413i.f29490f = 2;
        if (nqbVar4.mo40922b(null, c14413i) == objM51918f) {
            return objM51918f;
        }
        j01Var2 = j01Var;
        nqbVar = nqbVar4;
        j01Var2.f29460b = aWSCognitoAuthSession;
        y3i y3iVar22 = y3i.f54824a;
        nqbVar.mo40923c(null);
        return y3i.f54824a;
    }

    /* renamed from: q */
    public final AbstractC2145n m32988q() {
        return e84.m24521b(eu5.m25611b(), 0L, new C14415k(null), 2, null);
    }

    /* renamed from: r */
    public final void m32989r() {
        qm1.m45641b(null, new C14416l(null), 1, null);
    }

    /* renamed from: s */
    public final void m32990s(uk7 uk7Var) {
        p74.f39487a.m43078f(this.f29461c, new C14417m(uk7Var, null));
    }

    /* renamed from: t */
    public final Object m32991t(n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        Amplify.Auth.signOut(new C14418n(zb2Var, this));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }
}
