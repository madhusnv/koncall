package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import java.util.Map;
import p001o.cd7;
import p001o.h84;
import p001o.hc0;
import p001o.isa;
import p001o.jgg;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$response$1", m36648f = "ResetPasswordUseCase.kt", m36649l = {104}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ResetPasswordUseCase$execute$response$1 extends jgg implements nl7 {
    final /* synthetic */ String $encodedContextData;
    final /* synthetic */ AuthResetPasswordOptions $options;
    final /* synthetic */ String $pinpointEndpointId;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ ResetPasswordUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordUseCase$execute$response$1(ResetPasswordUseCase resetPasswordUseCase, String str, AuthResetPasswordOptions authResetPasswordOptions, String str2, String str3, n64 n64Var) {
        super(2, n64Var);
        this.this$0 = resetPasswordUseCase;
        this.$username = str;
        this.$options = authResetPasswordOptions;
        this.$encodedContextData = str2;
        this.$pinpointEndpointId = str3;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new ResetPasswordUseCase$execute$response$1(this.this$0, this.$username, this.$options, this.$encodedContextData, this.$pinpointEndpointId, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapM32681h;
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            kg3 kg3Var = this.this$0.cognitoIdentityProviderClient;
            String str = this.$username;
            AuthResetPasswordOptions authResetPasswordOptions = this.$options;
            ResetPasswordUseCase resetPasswordUseCase = this.this$0;
            String str2 = this.$encodedContextData;
            String str3 = this.$pinpointEndpointId;
            cd7.C12642a c12642a = new cd7.C12642a();
            c12642a.m20957l(str);
            AWSCognitoAuthResetPasswordOptions aWSCognitoAuthResetPasswordOptions = authResetPasswordOptions instanceof AWSCognitoAuthResetPasswordOptions ? (AWSCognitoAuthResetPasswordOptions) authResetPasswordOptions : null;
            if (aWSCognitoAuthResetPasswordOptions == null || (mapM32681h = aWSCognitoAuthResetPasswordOptions.getMetadata()) == null) {
                mapM32681h = isa.m32681h();
            }
            c12642a.m20955j(mapM32681h);
            c12642a.m20954i(resetPasswordUseCase.appClientId);
            c12642a.m20956k(AuthHelper.Companion.getSecretHash(str, resetPasswordUseCase.appClientId, resetPasswordUseCase.appClientSecret));
            if (str2 != null) {
                c12642a.m20958m(new ResetPasswordUseCase$execute$response$1$1$1$1(str2));
            }
            if (str3 != null) {
                c12642a.m20953h(hc0.f26603b.m30167a(new ResetPasswordUseCase$execute$response$1$1$2$1(str3)));
            }
            cd7 cd7VarM20946a = c12642a.m20946a();
            this.label = 1;
            obj = kg3Var.f3(cd7VarM20946a, this);
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
        return ((ResetPasswordUseCase$execute$response$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
