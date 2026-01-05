package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import java.util.Map;

/* loaded from: classes5.dex */
public interface SRPActions {
    Action initiateSRPAuthAction(SRPEvent.EventType.InitiateSRP initiateSRP);

    Action initiateSRPWithCustomAuthAction(SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom);

    Action verifyPasswordSRPAction(Map<String, String> map, Map<String, String> map2, String str, SignInMethod signInMethod);
}
