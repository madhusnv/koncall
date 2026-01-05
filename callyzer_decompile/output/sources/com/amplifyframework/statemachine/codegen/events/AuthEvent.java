package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class CachedCredentialsFailed extends EventType {
            public static final CachedCredentialsFailed INSTANCE = new CachedCredentialsFailed();

            private CachedCredentialsFailed() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ConfigureAuth extends EventType {
            private final AuthConfiguration configuration;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuth(AuthConfiguration configuration) {
                super(null);
                AbstractC4154l.m8923f(configuration, "configuration");
                this.configuration = configuration;
            }

            public static /* synthetic */ ConfigureAuth copy$default(ConfigureAuth configureAuth, AuthConfiguration authConfiguration, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authConfiguration = configureAuth.configuration;
                }
                return configureAuth.copy(authConfiguration);
            }

            public final AuthConfiguration component1() {
                return this.configuration;
            }

            public final ConfigureAuth copy(AuthConfiguration configuration) {
                AbstractC4154l.m8923f(configuration, "configuration");
                return new ConfigureAuth(configuration);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfigureAuth) && AbstractC4154l.m8918a(this.configuration, ((ConfigureAuth) obj).configuration);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public int hashCode() {
                return this.configuration.hashCode();
            }

            public String toString() {
                return "ConfigureAuth(configuration=" + this.configuration + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ConfigureAuthentication extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuthentication(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                super(null);
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                this.configuration = configuration;
                this.storedCredentials = storedCredentials;
            }

            public static /* synthetic */ ConfigureAuthentication copy$default(ConfigureAuthentication configureAuthentication, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authConfiguration = configureAuthentication.configuration;
                }
                if ((i10 & 2) != 0) {
                    amplifyCredential = configureAuthentication.storedCredentials;
                }
                return configureAuthentication.copy(authConfiguration, amplifyCredential);
            }

            public final AuthConfiguration component1() {
                return this.configuration;
            }

            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            public final ConfigureAuthentication copy(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                return new ConfigureAuthentication(configuration, storedCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfigureAuthentication)) {
                    return false;
                }
                ConfigureAuthentication configureAuthentication = (ConfigureAuthentication) obj;
                return AbstractC4154l.m8918a(this.configuration, configureAuthentication.configuration) && AbstractC4154l.m8918a(this.storedCredentials, configureAuthentication.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return this.storedCredentials.hashCode() + (this.configuration.hashCode() * 31);
            }

            public String toString() {
                return "ConfigureAuthentication(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ConfigureAuthorization extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuthorization(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                super(null);
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                this.configuration = configuration;
                this.storedCredentials = storedCredentials;
            }

            public static /* synthetic */ ConfigureAuthorization copy$default(ConfigureAuthorization configureAuthorization, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authConfiguration = configureAuthorization.configuration;
                }
                if ((i10 & 2) != 0) {
                    amplifyCredential = configureAuthorization.storedCredentials;
                }
                return configureAuthorization.copy(authConfiguration, amplifyCredential);
            }

            public final AuthConfiguration component1() {
                return this.configuration;
            }

            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            public final ConfigureAuthorization copy(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                return new ConfigureAuthorization(configuration, storedCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfigureAuthorization)) {
                    return false;
                }
                ConfigureAuthorization configureAuthorization = (ConfigureAuthorization) obj;
                return AbstractC4154l.m8918a(this.configuration, configureAuthorization.configuration) && AbstractC4154l.m8918a(this.storedCredentials, configureAuthorization.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return this.storedCredentials.hashCode() + (this.configuration.hashCode() * 31);
            }

            public String toString() {
                return "ConfigureAuthorization(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ConfiguredAuthentication extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfiguredAuthentication(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                super(null);
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                this.configuration = configuration;
                this.storedCredentials = storedCredentials;
            }

            public static /* synthetic */ ConfiguredAuthentication copy$default(ConfiguredAuthentication configuredAuthentication, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authConfiguration = configuredAuthentication.configuration;
                }
                if ((i10 & 2) != 0) {
                    amplifyCredential = configuredAuthentication.storedCredentials;
                }
                return configuredAuthentication.copy(authConfiguration, amplifyCredential);
            }

            public final AuthConfiguration component1() {
                return this.configuration;
            }

            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            public final ConfiguredAuthentication copy(AuthConfiguration configuration, AmplifyCredential storedCredentials) {
                AbstractC4154l.m8923f(configuration, "configuration");
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                return new ConfiguredAuthentication(configuration, storedCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfiguredAuthentication)) {
                    return false;
                }
                ConfiguredAuthentication configuredAuthentication = (ConfiguredAuthentication) obj;
                return AbstractC4154l.m8918a(this.configuration, configuredAuthentication.configuration) && AbstractC4154l.m8918a(this.storedCredentials, configuredAuthentication.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return this.storedCredentials.hashCode() + (this.configuration.hashCode() * 31);
            }

            public String toString() {
                return "ConfiguredAuthentication(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ConfiguredAuthorization extends EventType {
            public static final ConfiguredAuthorization INSTANCE = new ConfiguredAuthorization();

            private ConfiguredAuthorization() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ReceivedCachedCredentials extends EventType {
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedCachedCredentials(AmplifyCredential storedCredentials) {
                super(null);
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                this.storedCredentials = storedCredentials;
            }

            public static /* synthetic */ ReceivedCachedCredentials copy$default(ReceivedCachedCredentials receivedCachedCredentials, AmplifyCredential amplifyCredential, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    amplifyCredential = receivedCachedCredentials.storedCredentials;
                }
                return receivedCachedCredentials.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.storedCredentials;
            }

            public final ReceivedCachedCredentials copy(AmplifyCredential storedCredentials) {
                AbstractC4154l.m8923f(storedCredentials, "storedCredentials");
                return new ReceivedCachedCredentials(storedCredentials);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReceivedCachedCredentials) && AbstractC4154l.m8918a(this.storedCredentials, ((ReceivedCachedCredentials) obj).storedCredentials);
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return this.storedCredentials.hashCode();
            }

            public String toString() {
                return "ReceivedCachedCredentials(storedCredentials=" + this.storedCredentials + ")";
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public AuthEvent(EventType eventType, Date date) {
        AbstractC4154l.m8923f(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        this.type = eventType.getClass().getSimpleName();
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return super.getId();
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.type;
    }

    public /* synthetic */ AuthEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
