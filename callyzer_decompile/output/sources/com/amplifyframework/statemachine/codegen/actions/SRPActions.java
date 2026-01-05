package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface SRPActions {
    Action initiateSRPAuthAction(SRPEvent.EventType.InitiateSRP initiateSRP);

    Action initiateSRPWithCustomAuthAction(SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom);

    Action verifyPasswordSRPAction(Map<String, String> map, Map<String, String> map2, String str, SignInMethod signInMethod);
}
