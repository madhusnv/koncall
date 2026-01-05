package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.sq8;
import p001o.tbd;

@dff
/* loaded from: classes5.dex */
public final class ServerSessionInformationEvent {
    public static final Companion Companion = new Companion(null);
    private final SessionInformation sessionInformation;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ServerSessionInformationEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServerSessionInformationEvent(int i, SessionInformation sessionInformation, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, ServerSessionInformationEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionInformation = sessionInformation;
    }

    public static /* synthetic */ ServerSessionInformationEvent copy$default(ServerSessionInformationEvent serverSessionInformationEvent, SessionInformation sessionInformation, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionInformation = serverSessionInformationEvent.sessionInformation;
        }
        return serverSessionInformationEvent.copy(sessionInformation);
    }

    public static /* synthetic */ void getSessionInformation$annotations() {
    }

    public final SessionInformation component1() {
        return this.sessionInformation;
    }

    public final ServerSessionInformationEvent copy(SessionInformation sessionInformation) {
        sq8.m48649h(sessionInformation, "sessionInformation");
        return new ServerSessionInformationEvent(sessionInformation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerSessionInformationEvent) && sq8.m48644c(this.sessionInformation, ((ServerSessionInformationEvent) obj).sessionInformation);
    }

    public final SessionInformation getSessionInformation() {
        return this.sessionInformation;
    }

    public int hashCode() {
        return this.sessionInformation.hashCode();
    }

    public String toString() {
        return "ServerSessionInformationEvent(sessionInformation=" + this.sessionInformation + ")";
    }

    public ServerSessionInformationEvent(SessionInformation sessionInformation) {
        sq8.m48649h(sessionInformation, "sessionInformation");
        this.sessionInformation = sessionInformation;
    }
}
