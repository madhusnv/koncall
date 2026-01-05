package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class ClientSessionInformationEvent {
    public static final Companion Companion = new Companion(null);
    private final ClientChallenge challenge;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ClientSessionInformationEvent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClientSessionInformationEvent() {
        this((ClientChallenge) null, 1, (id5) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ClientSessionInformationEvent copy$default(ClientSessionInformationEvent clientSessionInformationEvent, ClientChallenge clientChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            clientChallenge = clientSessionInformationEvent.challenge;
        }
        return clientSessionInformationEvent.copy(clientChallenge);
    }

    public static /* synthetic */ void getChallenge$annotations() {
    }

    public static final /* synthetic */ void write$Self(ClientSessionInformationEvent clientSessionInformationEvent, lo3 lo3Var, uef uefVar) {
        boolean z = true;
        if (!lo3Var.mo37569r(uefVar, 0) && clientSessionInformationEvent.challenge == null) {
            z = false;
        }
        if (z) {
            lo3Var.mo37571z(uefVar, 0, ClientChallenge$$serializer.INSTANCE, clientSessionInformationEvent.challenge);
        }
    }

    public final ClientChallenge component1() {
        return this.challenge;
    }

    public final ClientSessionInformationEvent copy(ClientChallenge clientChallenge) {
        return new ClientSessionInformationEvent(clientChallenge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientSessionInformationEvent) && sq8.m48644c(this.challenge, ((ClientSessionInformationEvent) obj).challenge);
    }

    public final ClientChallenge getChallenge() {
        return this.challenge;
    }

    public int hashCode() {
        ClientChallenge clientChallenge = this.challenge;
        if (clientChallenge == null) {
            return 0;
        }
        return clientChallenge.hashCode();
    }

    public String toString() {
        return "ClientSessionInformationEvent(challenge=" + this.challenge + ")";
    }

    public /* synthetic */ ClientSessionInformationEvent(int i, ClientChallenge clientChallenge, fff fffVar) {
        if ((i & 0) != 0) {
            tbd.m49692a(i, 0, ClientSessionInformationEvent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.challenge = null;
        } else {
            this.challenge = clientChallenge;
        }
    }

    public ClientSessionInformationEvent(ClientChallenge clientChallenge) {
        this.challenge = clientChallenge;
    }

    public /* synthetic */ ClientSessionInformationEvent(ClientChallenge clientChallenge, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : clientChallenge);
    }
}
