package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.sq8;
import p001o.tbd;

@dff
/* loaded from: classes5.dex */
public final class ServerChallenge {
    public static final Companion Companion = new Companion(null);
    private final FaceMovementAndLightServerChallenge faceMovementAndLightChallenge;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return ServerChallenge$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServerChallenge(int i, FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, ServerChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.faceMovementAndLightChallenge = faceMovementAndLightServerChallenge;
    }

    public static /* synthetic */ ServerChallenge copy$default(ServerChallenge serverChallenge, FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            faceMovementAndLightServerChallenge = serverChallenge.faceMovementAndLightChallenge;
        }
        return serverChallenge.copy(faceMovementAndLightServerChallenge);
    }

    public static /* synthetic */ void getFaceMovementAndLightChallenge$annotations() {
    }

    public final FaceMovementAndLightServerChallenge component1() {
        return this.faceMovementAndLightChallenge;
    }

    public final ServerChallenge copy(FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge) {
        sq8.m48649h(faceMovementAndLightServerChallenge, "faceMovementAndLightChallenge");
        return new ServerChallenge(faceMovementAndLightServerChallenge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerChallenge) && sq8.m48644c(this.faceMovementAndLightChallenge, ((ServerChallenge) obj).faceMovementAndLightChallenge);
    }

    public final FaceMovementAndLightServerChallenge getFaceMovementAndLightChallenge() {
        return this.faceMovementAndLightChallenge;
    }

    public int hashCode() {
        return this.faceMovementAndLightChallenge.hashCode();
    }

    public String toString() {
        return "ServerChallenge(faceMovementAndLightChallenge=" + this.faceMovementAndLightChallenge + ")";
    }

    public ServerChallenge(FaceMovementAndLightServerChallenge faceMovementAndLightServerChallenge) {
        sq8.m48649h(faceMovementAndLightServerChallenge, "faceMovementAndLightChallenge");
        this.faceMovementAndLightChallenge = faceMovementAndLightServerChallenge;
    }
}
