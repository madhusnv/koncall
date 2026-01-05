package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.sq8;
import p001o.tbd;

@dff
/* loaded from: classes5.dex */
public final class ClientChallenge {
    public static final Companion Companion = new Companion(null);
    private final FaceMovementAndLightClientChallenge faceMovementAndLightChallenge;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ClientChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ClientChallenge(int i, FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, ClientChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.faceMovementAndLightChallenge = faceMovementAndLightClientChallenge;
    }

    public static /* synthetic */ ClientChallenge copy$default(ClientChallenge clientChallenge, FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            faceMovementAndLightClientChallenge = clientChallenge.faceMovementAndLightChallenge;
        }
        return clientChallenge.copy(faceMovementAndLightClientChallenge);
    }

    public static /* synthetic */ void getFaceMovementAndLightChallenge$annotations() {
    }

    public final FaceMovementAndLightClientChallenge component1() {
        return this.faceMovementAndLightChallenge;
    }

    public final ClientChallenge copy(FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge) {
        sq8.m48649h(faceMovementAndLightClientChallenge, "faceMovementAndLightChallenge");
        return new ClientChallenge(faceMovementAndLightClientChallenge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientChallenge) && sq8.m48644c(this.faceMovementAndLightChallenge, ((ClientChallenge) obj).faceMovementAndLightChallenge);
    }

    public final FaceMovementAndLightClientChallenge getFaceMovementAndLightChallenge() {
        return this.faceMovementAndLightChallenge;
    }

    public int hashCode() {
        return this.faceMovementAndLightChallenge.hashCode();
    }

    public String toString() {
        return "ClientChallenge(faceMovementAndLightChallenge=" + this.faceMovementAndLightChallenge + ")";
    }

    public ClientChallenge(FaceMovementAndLightClientChallenge faceMovementAndLightClientChallenge) {
        sq8.m48649h(faceMovementAndLightClientChallenge, "faceMovementAndLightChallenge");
        this.faceMovementAndLightChallenge = faceMovementAndLightClientChallenge;
    }
}
