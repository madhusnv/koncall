package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeviceSRPCognitoSignInActions implements DeviceSRPSignInActions {
    public static final DeviceSRPCognitoSignInActions INSTANCE = new DeviceSRPCognitoSignInActions();
    private static final String KEY_DEVICE_GROUP_KEY = "DEVICE_GROUP_KEY";
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_PASSWORD_CLAIM_SECRET_BLOCK = "PASSWORD_CLAIM_SECRET_BLOCK";
    private static final String KEY_PASSWORD_CLAIM_SIGNATURE = "PASSWORD_CLAIM_SIGNATURE";
    private static final String KEY_SALT = "SALT";
    private static final String KEY_SECRET_BLOCK = "SECRET_BLOCK";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_SRP_A = "SRP_A";
    private static final String KEY_SRP_B = "SRP_B";
    private static final String KEY_TIMESTAMP = "TIMESTAMP";
    private static final String KEY_USERNAME = "USERNAME";

    private DeviceSRPCognitoSignInActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions
    public Action respondDevicePasswordVerifier(DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new C1072x75b0e9b("RespondToDevicePasswordVerifier", event);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions
    public Action respondDeviceSRP(DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge event) {
        AbstractC4154l.m8923f(event, "event");
        Action.Companion companion = Action.Companion;
        return new DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1("RespondDeviceSRP", event);
    }
}
