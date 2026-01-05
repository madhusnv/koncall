package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import p001o.sq8;

/* loaded from: classes5.dex */
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
    public Action respondDevicePasswordVerifier(DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier respondDevicePasswordVerifier) {
        sq8.m48649h(respondDevicePasswordVerifier, "event");
        Action.Companion companion = Action.Companion;
        return new C10456x75b0e9b("RespondToDevicePasswordVerifier", respondDevicePasswordVerifier);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeviceSRPSignInActions
    public Action respondDeviceSRP(DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge respondDeviceSRPChallenge) {
        sq8.m48649h(respondDeviceSRPChallenge, "event");
        Action.Companion companion = Action.Companion;
        return new DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1("RespondDeviceSRP", respondDeviceSRPChallenge);
    }
}
