package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.step.AuthNextResetPasswordStep;
import com.amplifyframework.auth.result.step.AuthResetPasswordStep;
import com.amplifyframework.core.Consumer;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.dd7;
import p001o.eu5;
import p001o.h84;
import p001o.isa;
import p001o.jgg;
import p001o.jpa;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;
import p001o.z74;

/* loaded from: classes5.dex */
public final class ResetPasswordUseCase {
    private final String appClientId;
    private final String appClientSecret;
    private final kg3 cognitoIdentityProviderClient;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase", m36648f = "ResetPasswordUseCase.kt", m36649l = {53, TypeReference.METHOD_REFERENCE, Opcodes.AASTORE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$1 */
    public static final class C105351 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C105351(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResetPasswordUseCase.this.execute(null, null, null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$2", m36648f = "ResetPasswordUseCase.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$2 */
    public static final class C105362 extends jgg implements nl7 {
        final /* synthetic */ Consumer<AuthResetPasswordResult> $onSuccess;
        final /* synthetic */ dd7 $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105362(Consumer<AuthResetPasswordResult> consumer, dd7 dd7Var, n64 n64Var) {
            super(2, n64Var);
            this.$onSuccess = consumer;
            this.$response = dd7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C105362(this.$onSuccess, this.$response, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.$onSuccess.accept(new AuthResetPasswordResult(false, new AuthNextResetPasswordStep(AuthResetPasswordStep.CONFIRM_RESET_PASSWORD_WITH_CODE, isa.m32681h(), ResetPasswordUseCaseKt.toAuthCodeDeliveryDetails(this.$response.m22811a()))));
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C105362) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$3", m36648f = "ResetPasswordUseCase.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$3 */
    public static final class C105373 extends jgg implements nl7 {
        final /* synthetic */ Exception $ex;
        final /* synthetic */ Consumer<AuthException> $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105373(Consumer<AuthException> consumer, Exception exc, n64 n64Var) {
            super(2, n64Var);
            this.$onError = consumer;
            this.$ex = exc;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C105373(this.$onError, this.$ex, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(this.$ex, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION));
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C105373) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public ResetPasswordUseCase(kg3 kg3Var, String str, String str2) {
        sq8.m48649h(kg3Var, "cognitoIdentityProviderClient");
        sq8.m48649h(str, "appClientId");
        this.cognitoIdentityProviderClient = kg3Var;
        this.appClientId = str;
        this.appClientSecret = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, AuthResetPasswordOptions authResetPasswordOptions, String str2, String str3, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2, n64 n64Var) {
        C105351 c105351;
        Consumer<AuthException> consumer3;
        Consumer<AuthResetPasswordResult> consumer4;
        jpa jpaVarM25612c;
        C105373 c105373;
        jpa jpaVarM25612c2;
        C105362 c105362;
        z74 z74VarM25611b;
        ResetPasswordUseCase$execute$response$1 resetPasswordUseCase$execute$response$1;
        if (n64Var instanceof C105351) {
            c105351 = (C105351) n64Var;
            int i = c105351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105351.label = i - Integer.MIN_VALUE;
            } else {
                c105351 = new C105351(n64Var);
            }
        }
        Object objM43867g = c105351.result;
        Object objM51918f = uq8.m51918f();
        ?? r2 = c105351.label;
        if (r2 != 0) {
            try {
                if (r2 == 1) {
                    Consumer<AuthException> consumer5 = (Consumer) c105351.L$1;
                    Consumer<AuthResetPasswordResult> consumer6 = (Consumer) c105351.L$0;
                    wre.m54934b(objM43867g);
                    consumer3 = consumer5;
                    consumer4 = consumer6;
                    jpaVarM25612c2 = eu5.m25612c();
                    c105362 = new C105362(consumer4, (dd7) objM43867g, null);
                    c105351.L$0 = consumer3;
                    c105351.L$1 = null;
                    c105351.label = 2;
                    if (pm1.m43867g(jpaVarM25612c2, c105362, c105351) == objM51918f) {
                        return objM51918f;
                    }
                } else if (r2 == 2) {
                    wre.m54934b(objM43867g);
                } else {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objM43867g);
                }
            } catch (Exception e) {
                e = e;
                consumer3 = r2;
                jpaVarM25612c = eu5.m25612c();
                c105373 = new C105373(consumer3, e, null);
                c105351.L$0 = null;
                c105351.L$1 = null;
                c105351.label = 3;
                if (pm1.m43867g(jpaVarM25612c, c105373, c105351) == objM51918f) {
                }
                return y3i.f54824a;
            }
        } else {
            wre.m54934b(objM43867g);
            try {
                z74VarM25611b = eu5.m25611b();
                resetPasswordUseCase$execute$response$1 = new ResetPasswordUseCase$execute$response$1(this, str, authResetPasswordOptions, str2, str3, null);
                consumer4 = consumer;
                c105351.L$0 = consumer4;
                consumer3 = consumer2;
            } catch (Exception e2) {
                e = e2;
                consumer3 = consumer2;
                jpaVarM25612c = eu5.m25612c();
                c105373 = new C105373(consumer3, e, null);
                c105351.L$0 = null;
                c105351.L$1 = null;
                c105351.label = 3;
                if (pm1.m43867g(jpaVarM25612c, c105373, c105351) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            try {
                c105351.L$1 = consumer3;
                c105351.label = 1;
                objM43867g = pm1.m43867g(z74VarM25611b, resetPasswordUseCase$execute$response$1, c105351);
                if (objM43867g == objM51918f) {
                    return objM51918f;
                }
                jpaVarM25612c2 = eu5.m25612c();
                c105362 = new C105362(consumer4, (dd7) objM43867g, null);
                c105351.L$0 = consumer3;
                c105351.L$1 = null;
                c105351.label = 2;
                if (pm1.m43867g(jpaVarM25612c2, c105362, c105351) == objM51918f) {
                }
            } catch (Exception e3) {
                e = e3;
                jpaVarM25612c = eu5.m25612c();
                c105373 = new C105373(consumer3, e, null);
                c105351.L$0 = null;
                c105351.L$1 = null;
                c105351.label = 3;
                if (pm1.m43867g(jpaVarM25612c, c105373, c105351) == objM51918f) {
                }
                return y3i.f54824a;
            }
        }
        return y3i.f54824a;
    }
}
