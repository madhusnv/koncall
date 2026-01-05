package com.amplifyframework.auth.cognito.actions;

import a2.AbstractC0030c;
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
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialStoreCognitoActions implements CredentialStoreActions {
    public static final CredentialStoreCognitoActions INSTANCE = new CredentialStoreCognitoActions();

    private CredentialStoreCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action clearCredentialStoreAction(final CredentialType credentialType) {
        AbstractC4154l.m8923f(credentialType, "credentialType");
        Action.Companion companion = Action.Companion;
        final String str = "ClearCredentialStore";
        return new Action(str, credentialType) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$clearCredentialStoreAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43730id;

            {
                this.$credentialType$inlined = credentialType;
                this.f43730id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                CredentialStoreEvent credentialStoreEvent;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", credentialStoreEnvironment.getLogger());
                int i10 = 2;
                Date date = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (AbstractC4154l.m8918a(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().deleteCredential();
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        credentialStoreEnvironment.getCredentialStore().deleteDeviceKeyCredential(((CredentialType.Device) this.$credentialType$inlined).getUsername());
                    } else {
                        if (!AbstractC4154l.m8918a(credentialType2, CredentialType.ASF.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        credentialStoreEnvironment.getCredentialStore().deleteASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(AmplifyCredential.Empty.INSTANCE), date, i10, objArr3 == true ? 1 : 0);
                } catch (CredentialStoreError e2) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e2), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
                }
                AbstractC0030c.m132w(id2, " Sending event ", credentialStoreEvent.getType(), credentialStoreEnvironment.getLogger());
                eventDispatcher.send(credentialStoreEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43730id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action loadCredentialStoreAction(final CredentialType credentialType) {
        AbstractC4154l.m8923f(credentialType, "credentialType");
        Action.Companion companion = Action.Companion;
        final String str = "LoadCredentialStore";
        return new Action(str, credentialType) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$loadCredentialStoreAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43731id;

            {
                this.$credentialType$inlined = credentialType;
                this.f43731id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                CredentialStoreEvent credentialStoreEvent;
                AmplifyCredential amplifyCredentialRetrieveASFDevice;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", credentialStoreEnvironment.getLogger());
                int i10 = 2;
                Date date = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (AbstractC4154l.m8918a(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        amplifyCredentialRetrieveASFDevice = credentialStoreEnvironment.getCredentialStore().retrieveCredential();
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        amplifyCredentialRetrieveASFDevice = new AmplifyCredential.DeviceData(credentialStoreEnvironment.getCredentialStore().retrieveDeviceMetadata(((CredentialType.Device) this.$credentialType$inlined).getUsername()));
                    } else {
                        if (!AbstractC4154l.m8918a(credentialType2, CredentialType.ASF.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        amplifyCredentialRetrieveASFDevice = credentialStoreEnvironment.getCredentialStore().retrieveASFDevice();
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(amplifyCredentialRetrieveASFDevice), date, i10, objArr3 == true ? 1 : 0);
                } catch (CredentialStoreError e2) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e2), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
                }
                AbstractC0030c.m132w(id2, " Sending event ", credentialStoreEvent.getType(), credentialStoreEnvironment.getLogger());
                eventDispatcher.send(credentialStoreEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43731id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action migrateLegacyCredentialStoreAction() {
        Action.Companion companion = Action.Companion;
        final String str = "MigrateLegacyCredentials";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$migrateLegacyCredentialStoreAction$$inlined$invoke$1

            /* renamed from: id, reason: collision with root package name */
            private final String f43732id;

            {
                this.f43732id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                CredentialStoreEvent credentialStoreEvent;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", credentialStoreEnvironment.getLogger());
                int i10 = 2;
                Date date = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                try {
                    AmplifyCredential amplifyCredentialRetrieveCredential = credentialStoreEnvironment.getLegacyCredentialStore().retrieveCredential();
                    if (!AbstractC4154l.m8918a(amplifyCredentialRetrieveCredential, AmplifyCredential.Empty.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().saveCredential(amplifyCredentialRetrieveCredential);
                        credentialStoreEnvironment.getLegacyCredentialStore().deleteCredential();
                    }
                    for (String str2 : credentialStoreEnvironment.getLegacyCredentialStore().retrieveDeviceMetadataUsernameList()) {
                        DeviceMetadata deviceMetadataRetrieveDeviceMetadata = credentialStoreEnvironment.getLegacyCredentialStore().retrieveDeviceMetadata(str2);
                        DeviceMetadata.Empty empty = DeviceMetadata.Empty.INSTANCE;
                        if (!AbstractC4154l.m8918a(deviceMetadataRetrieveDeviceMetadata, empty)) {
                            credentialStoreEnvironment.getCredentialStore().retrieveDeviceMetadata(str2);
                            if (AbstractC4154l.m8918a(credentialStoreEnvironment.getCredentialStore().retrieveDeviceMetadata(str2), empty)) {
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
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.LoadCredentialStore(CredentialType.Amplify.INSTANCE), date, i10, objArr3 == true ? 1 : 0);
                } catch (CredentialStoreError e2) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e2), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
                }
                AbstractC0030c.m132w(id2, " Sending event ", credentialStoreEvent.getType(), credentialStoreEnvironment.getLogger());
                eventDispatcher.send(credentialStoreEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43732id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action moveToIdleStateAction() {
        Action.Companion companion = Action.Companion;
        final String str = "MoveToIdleState";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$moveToIdleStateAction$$inlined$invoke$1

            /* renamed from: id, reason: collision with root package name */
            private final String f43733id;

            {
                this.f43733id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                credentialStoreEnvironment.getLogger().verbose(id2 + " Starting execution");
                CredentialStoreEvent credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.MoveToIdleState(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                AbstractC0030c.m132w(id2, " Sending event ", credentialStoreEvent.getType(), credentialStoreEnvironment.getLogger());
                eventDispatcher.send(credentialStoreEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43733id;
            }
        };
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions
    public Action storeCredentialsAction(final CredentialType credentialType, final AmplifyCredential credentials) {
        AbstractC4154l.m8923f(credentialType, "credentialType");
        AbstractC4154l.m8923f(credentials, "credentials");
        Action.Companion companion = Action.Companion;
        final String str = "StoreCredentials";
        return new Action(str, credentialType, credentials) { // from class: com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions$storeCredentialsAction$$inlined$invoke$1
            final /* synthetic */ CredentialType $credentialType$inlined;
            final /* synthetic */ AmplifyCredential $credentials$inlined;

            /* renamed from: id, reason: collision with root package name */
            private final String f43734id;

            {
                this.$credentialType$inlined = credentialType;
                this.$credentials$inlined = credentials;
                this.f43734id = str == null ? super.getId() : str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.amplifyframework.statemachine.Action
            public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
                CredentialStoreEvent credentialStoreEvent;
                AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
                String id2 = getId();
                CredentialStoreEnvironment credentialStoreEnvironment = (CredentialStoreEnvironment) environment;
                AbstractC0030c.m131v(id2, " Starting execution", credentialStoreEnvironment.getLogger());
                int i10 = 2;
                Date date = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                try {
                    CredentialType credentialType2 = this.$credentialType$inlined;
                    if (AbstractC4154l.m8918a(credentialType2, CredentialType.Amplify.INSTANCE)) {
                        credentialStoreEnvironment.getCredentialStore().saveCredential(this.$credentials$inlined);
                    } else if (credentialType2 instanceof CredentialType.Device) {
                        AmplifyCredential amplifyCredential = this.$credentials$inlined;
                        AmplifyCredential.DeviceMetaDataTypeCredential deviceMetaDataTypeCredential = amplifyCredential instanceof AmplifyCredential.DeviceMetaDataTypeCredential ? (AmplifyCredential.DeviceMetaDataTypeCredential) amplifyCredential : null;
                        if (deviceMetaDataTypeCredential != null) {
                            credentialStoreEnvironment.getCredentialStore().saveDeviceMetadata(((CredentialType.Device) this.$credentialType$inlined).getUsername(), deviceMetaDataTypeCredential.getDeviceMetadata());
                        }
                    } else {
                        if (!AbstractC4154l.m8918a(credentialType2, CredentialType.ASF.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AmplifyCredential amplifyCredential2 = this.$credentials$inlined;
                        AmplifyCredential.ASFDevice aSFDevice = amplifyCredential2 instanceof AmplifyCredential.ASFDevice ? (AmplifyCredential.ASFDevice) amplifyCredential2 : null;
                        if (aSFDevice != null && aSFDevice.getId() != null) {
                            credentialStoreEnvironment.getCredentialStore().saveASFDevice(aSFDevice);
                        }
                    }
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.CompletedOperation(this.$credentials$inlined), date, i10, objArr3 == true ? 1 : 0);
                } catch (CredentialStoreError e2) {
                    credentialStoreEvent = new CredentialStoreEvent(new CredentialStoreEvent.EventType.ThrowError(e2), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
                }
                AbstractC0030c.m132w(id2, " Sending event ", credentialStoreEvent.getType(), credentialStoreEnvironment.getLogger());
                eventDispatcher.send(credentialStoreEvent);
                return a0.f30746a;
            }

            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.f43734id;
            }
        };
    }
}
