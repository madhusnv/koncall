package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58119type;

    public static abstract class EventType {

        public static final class CachedCredentialsFailed extends EventType {
            public static final CachedCredentialsFailed INSTANCE = new CachedCredentialsFailed();

            private CachedCredentialsFailed() {
                super(null);
            }
        }

        public static final class ConfigureAuth extends EventType {
            private final AuthConfiguration configuration;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuth(AuthConfiguration authConfiguration) {
                super(null);
                sq8.m48649h(authConfiguration, "configuration");
                this.configuration = authConfiguration;
            }

            public static /* synthetic */ ConfigureAuth copy$default(ConfigureAuth configureAuth, AuthConfiguration authConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configureAuth.configuration;
                }
                return configureAuth.copy(authConfiguration);
            }

            public final AuthConfiguration component1() {
                return this.configuration;
            }

            public final ConfigureAuth copy(AuthConfiguration authConfiguration) {
                sq8.m48649h(authConfiguration, "configuration");
                return new ConfigureAuth(authConfiguration);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfigureAuth) && sq8.m48644c(this.configuration, ((ConfigureAuth) obj).configuration);
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

        public static final class ConfigureAuthentication extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuthentication(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }

            public static /* synthetic */ ConfigureAuthentication copy$default(ConfigureAuthentication configureAuthentication, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configureAuthentication.configuration;
                }
                if ((i & 2) != 0) {
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

            public final ConfigureAuthentication copy(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                return new ConfigureAuthentication(authConfiguration, amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfigureAuthentication)) {
                    return false;
                }
                ConfigureAuthentication configureAuthentication = (ConfigureAuthentication) obj;
                return sq8.m48644c(this.configuration, configureAuthentication.configuration) && sq8.m48644c(this.storedCredentials, configureAuthentication.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            public String toString() {
                return "ConfigureAuthentication(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        public static final class ConfigureAuthorization extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigureAuthorization(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }

            public static /* synthetic */ ConfigureAuthorization copy$default(ConfigureAuthorization configureAuthorization, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configureAuthorization.configuration;
                }
                if ((i & 2) != 0) {
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

            public final ConfigureAuthorization copy(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                return new ConfigureAuthorization(authConfiguration, amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfigureAuthorization)) {
                    return false;
                }
                ConfigureAuthorization configureAuthorization = (ConfigureAuthorization) obj;
                return sq8.m48644c(this.configuration, configureAuthorization.configuration) && sq8.m48644c(this.storedCredentials, configureAuthorization.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            public String toString() {
                return "ConfigureAuthorization(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        public static final class ConfiguredAuthentication extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfiguredAuthentication(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }

            public static /* synthetic */ ConfiguredAuthentication copy$default(ConfiguredAuthentication configuredAuthentication, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configuredAuthentication.configuration;
                }
                if ((i & 2) != 0) {
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

            public final ConfiguredAuthentication copy(AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential) {
                sq8.m48649h(authConfiguration, "configuration");
                sq8.m48649h(amplifyCredential, "storedCredentials");
                return new ConfiguredAuthentication(authConfiguration, amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfiguredAuthentication)) {
                    return false;
                }
                ConfiguredAuthentication configuredAuthentication = (ConfiguredAuthentication) obj;
                return sq8.m48644c(this.configuration, configuredAuthentication.configuration) && sq8.m48644c(this.storedCredentials, configuredAuthentication.storedCredentials);
            }

            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            public String toString() {
                return "ConfiguredAuthentication(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }
        }

        public static final class ConfiguredAuthorization extends EventType {
            public static final ConfiguredAuthorization INSTANCE = new ConfiguredAuthorization();

            private ConfiguredAuthorization() {
                super(null);
            }
        }

        public static final class ReceivedCachedCredentials extends EventType {
            private final AmplifyCredential storedCredentials;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedCachedCredentials(AmplifyCredential amplifyCredential) {
                super(null);
                sq8.m48649h(amplifyCredential, "storedCredentials");
                this.storedCredentials = amplifyCredential;
            }

            public static /* synthetic */ ReceivedCachedCredentials copy$default(ReceivedCachedCredentials receivedCachedCredentials, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = receivedCachedCredentials.storedCredentials;
                }
                return receivedCachedCredentials.copy(amplifyCredential);
            }

            public final AmplifyCredential component1() {
                return this.storedCredentials;
            }

            public final ReceivedCachedCredentials copy(AmplifyCredential amplifyCredential) {
                sq8.m48649h(amplifyCredential, "storedCredentials");
                return new ReceivedCachedCredentials(amplifyCredential);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReceivedCachedCredentials) && sq8.m48644c(this.storedCredentials, ((ReceivedCachedCredentials) obj).storedCredentials);
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

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public AuthEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58119type = simpleName;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.f58119type;
    }

    public /* synthetic */ AuthEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
