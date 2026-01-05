package com.amplifyframework.predictions.aws.models.liveness;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.sq8;
import p001o.tbd;

@dff
/* loaded from: classes5.dex */
public final class SessionInformation {
    public static final Companion Companion = new Companion(null);
    private final ServerChallenge challenge;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return SessionInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SessionInformation(int i, ServerChallenge serverChallenge, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, SessionInformation$$serializer.INSTANCE.getDescriptor());
        }
        this.challenge = serverChallenge;
    }

    public static /* synthetic */ SessionInformation copy$default(SessionInformation sessionInformation, ServerChallenge serverChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            serverChallenge = sessionInformation.challenge;
        }
        return sessionInformation.copy(serverChallenge);
    }

    public static /* synthetic */ void getChallenge$annotations() {
    }

    public final ServerChallenge component1() {
        return this.challenge;
    }

    public final SessionInformation copy(ServerChallenge serverChallenge) {
        sq8.m48649h(serverChallenge, ClientData.KEY_CHALLENGE);
        return new SessionInformation(serverChallenge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionInformation) && sq8.m48644c(this.challenge, ((SessionInformation) obj).challenge);
    }

    public final ServerChallenge getChallenge() {
        return this.challenge;
    }

    public int hashCode() {
        return this.challenge.hashCode();
    }

    public String toString() {
        return "SessionInformation(challenge=" + this.challenge + ")";
    }

    public SessionInformation(ServerChallenge serverChallenge) {
        sq8.m48649h(serverChallenge, ClientData.KEY_CHALLENGE);
        this.challenge = serverChallenge;
    }
}
