package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface SignInChallengeActions {
    Action verifyChallengeAuthAction(String str, Map<String, String> map, List<AuthUserAttribute> list, AuthChallenge authChallenge, SignInMethod signInMethod);
}
