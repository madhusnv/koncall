package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.CredentialStoreEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import p001o.n64;
import p001o.sq8;
import p001o.szb;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class CredentialStoreCognitoActions implements CredentialStoreActions {
    public static final CredentialStoreCognitoActions INSTANCE = new CredentialStoreCognitoActions();

    private CredentialStoreCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action clearCredentialStoreAction(final CredentialType credentialType) {
        sq8.m48649h(credentialType, "credentialType");
        Action.Companion companion = Action.Companion;
        final String str = "ClearCredentialStore";
        return new Action(str, credentialType) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$clearCredentialStoreAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;
            private final String id;

            {
                this.$credentialType$inlined = credentialType;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                CredentialStoreEvent credentialStoreEvent;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (sq8.m48644c(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().deleteCredential();
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        credentialStoreEnvironment.getCredentialStore().deleteDeviceKeyCredential(((CredentialType.Device) this.$credentialType$inlined).getUsername());
                    } else if (sq8.m48644c(credentialType2, CredentialType.ASF.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().deleteASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(AmplifyCredential.Empty.INSTANCE), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action loadCredentialStoreAction(final CredentialType credentialType) {
        sq8.m48649h(credentialType, "credentialType");
        Action.Companion companion = Action.Companion;
        final String str = "LoadCredentialStore";
        return new Action(str, credentialType) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$loadCredentialStoreAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;
            private final String id;

            {
                this.$credentialType$inlined = credentialType;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                CredentialStoreEvent credentialStoreEvent;
                AmplifyCredential amplifyCredentialRetrieveASFDevice;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (sq8.m48644c(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        amplifyCredentialRetrieveASFDevice = credentialStoreEnvironment.getCredentialStore().retrieveCredential();
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        amplifyCredentialRetrieveASFDevice = new AmplifyCredential.DeviceData(credentialStoreEnvironment.getCredentialStore().retrieveDeviceMetadata(((CredentialType.Device) this.$credentialType$inlined).getUsername()));
                    } else {
                        if (!sq8.m48644c(credentialType2, CredentialType.ASF.INSTANCE)) {
                            throw new szb();
                        }
                        amplifyCredentialRetrieveASFDevice = credentialStoreEnvironment.getCredentialStore().retrieveASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(amplifyCredentialRetrieveASFDevice), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action migrateLegacyCredentialStoreAction() {
        Action.Companion companion = Action.Companion;
        final String str = "MigrateLegacyCredentials";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$migrateLegacyCredentialStoreAction$$inlined$invoke$1
            private final String id;

            {
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                CredentialStoreEvent credentialStoreEvent;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    AmplifyCredential amplifyCredentialRetrieveCredential = credentialStoreEnvironment.getLegacyCredentialStore().retrieveCredential();
                    if (!sq8.m48644c(amplifyCredentialRetrieveCredential, AmplifyCredential.Empty.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().saveCredential(amplifyCredentialRetrieveCredential);
                        credentialStoreEnvironment.getLegacyCredentialStore().deleteCredential();
                    }
                    for (String str2 : credentialStoreEnvironment.getLegacyCredentialStore().retrieveDeviceMetadataUsernameList()) {
                        DeviceMetadata deviceMetadataRetrieveDeviceMetadata = credentialStoreEnvironment.getLegacyCredentialStore().retrieveDeviceMetadata(str2);
                        DeviceMetadata.Empty empty = DeviceMetadata.Empty.INSTANCE;
                        if (!sq8.m48644c(deviceMetadataRetrieveDeviceMetadata, empty)) {
                            credentialStoreEnvironment.getCredentialStore().retrieveDeviceMetadata(str2);
                            if (sq8.m48644c(credentialStoreEnvironment.getCredentialStore().retrieveDeviceMetadata(str2), empty)) {
                                credentialStoreEnvironment.getCredentialStore().saveDeviceMetadata(str2, deviceMetadataRetrieveDeviceMetadata);
                            }
                            credentialStoreEnvironment.getLegacyCredentialStore().deleteDeviceKeyCredential(str2);
                        }
                    }
                    AmplifyCredential.ASFDevice aSFDeviceRetrieveASFDevice = credentialStoreEnvironment.getLegacyCredentialStore().retrieveASFDevice();
                    if (aSFDeviceRetrieveASFDevice.getId() != null) {
                        credentialStoreEnvironment.getCredentialStore().saveASFDevice(aSFDeviceRetrieveASFDevice);
                        credentialStoreEnvironment.getLegacyCredentialStore().deleteASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.LoadCredentialStore(CredentialType.Amplify.INSTANCE), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action moveToIdleStateAction() {
        Action.Companion companion = Action.Companion;
        final String str = "MoveToIdleState";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$moveToIdleStateAction$$inlined$invoke$1
            private final String id;

            {
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                CredentialStoreEvent credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.MoveToIdleState(null, 1, null), null, 2, null);
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action storeCredentialsAction(final CredentialType credentialType, final AmplifyCredential amplifyCredential) {
        sq8.m48649h(credentialType, "credentialType");
        sq8.m48649h(amplifyCredential, "credentials");
        Action.Companion companion = Action.Companion;
        final String str = "StoreCredentials";
        return new Action(str, credentialType, amplifyCredential) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$storeCredentialsAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;
            final /* synthetic */ AmplifyCredential $credentials$inlined;
            private final String id;

            {
                this.$credentialType$inlined = credentialType;
                this.$credentials$inlined = amplifyCredential;
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
                CredentialStoreEvent credentialStoreEvent;
                sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id + " Starting execution");
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (sq8.m48644c(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().saveCredential(this.$credentials$inlined);
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        Object obj = this.$credentials$inlined;
                        AmplifyCredential.DeviceMetaDataTypeCredential deviceMetaDataTypeCredential = obj instanceof AmplifyCredential.DeviceMetaDataTypeCredential ? (AmplifyCredential.DeviceMetaDataTypeCredential) obj : null;
                        if (deviceMetaDataTypeCredential != null) {
                            credentialStoreEnvironment.getCredentialStore().saveDeviceMetadata(((CredentialType.Device) this.$credentialType$inlined).getUsername(), deviceMetaDataTypeCredential.getDeviceMetadata());
                        }
                    } else if (sq8.m48644c(credentialType2, CredentialType.ASF.INSTANCE)) {
                        AmplifyCredential amplifyCredential2 = this.$credentials$inlined;
                        AmplifyCredential.ASFDevice aSFDevice = amplifyCredential2 instanceof AmplifyCredential.ASFDevice ? (AmplifyCredential.ASFDevice) amplifyCredential2 : null;
                        if (aSFDevice != null && aSFDevice.getId() != null) {
                            credentialStoreEnvironment.getCredentialStore().saveASFDevice(aSFDevice);
                        }
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(this.$credentials$inlined), null, 2, null);
                } catch (CredentialStoreError e) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e), null, 2, null);
                }
                credentialStoreEnvironment.getLogger().verbose(id + " Sending event " + credentialStoreEvent.getType());
                eventDispatcher.send(credentialStoreEvent);
                return y3i.f54824a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }
        };
    }
}
