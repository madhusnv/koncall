package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface SignInChallengeActions {
    Action verifyChallengeAuthAction(String str, Map<String, String> map, List<AuthUserAttribute> list, AuthChallenge authChallenge, SignInMethod signInMethod);
}
