package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.http.LivenessWebSocket;
import com.amplifyframework.predictions.aws.models.ColorChallenge;
import com.amplifyframework.predictions.aws.models.ColorChallengeResponse;
import com.amplifyframework.predictions.aws.models.ColorChallengeType;
import com.amplifyframework.predictions.aws.models.ColorDisplayInformation;
import com.amplifyframework.predictions.aws.models.FaceTargetChallenge;
import com.amplifyframework.predictions.aws.models.FaceTargetChallengeResponse;
import com.amplifyframework.predictions.aws.models.FaceTargetMatchingParameters;
import com.amplifyframework.predictions.aws.models.InitialFaceDetected;
import com.amplifyframework.predictions.aws.models.RgbColor;
import com.amplifyframework.predictions.aws.models.liveness.ChallengeConfig;
import com.amplifyframework.predictions.aws.models.liveness.ColorSequence;
import com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightServerChallenge;
import com.amplifyframework.predictions.aws.models.liveness.FreshnessColor;
import com.amplifyframework.predictions.aws.models.liveness.OvalParameters;
import com.amplifyframework.predictions.aws.models.liveness.SessionInformation;
import com.amplifyframework.predictions.aws.service.RunFaceLivenessSession;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import com.amplifyframework.predictions.models.FaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSessionChallenge;
import com.amplifyframework.predictions.models.FaceLivenessSessionInformation;
import com.amplifyframework.predictions.models.VideoEvent;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import p001o.ch3;
import p001o.e9g;
import p001o.id5;
import p001o.kh3;
import p001o.qc4;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class RunFaceLivenessSession {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_BASE_DOMAIN = "amazonaws.com";
    private static final String ISO_PARTITION_BASE_DOMAIN = "csp.hci.ic.gov";
    private final qc4 credentialsProvider;
    private final String livenessEndpoint;
    private final LivenessWebSocket livenessWebSocket;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public RunFaceLivenessSession(String str, FaceLivenessSessionInformation faceLivenessSessionInformation, qc4 qc4Var, String str2, final Consumer<FaceLivenessSession> consumer, final Action action, final Consumer<PredictionsException> consumer2) {
        sq8.m48649h(str, "sessionId");
        sq8.m48649h(faceLivenessSessionInformation, "sessionInformation");
        sq8.m48649h(qc4Var, "credentialsProvider");
        sq8.m48649h(consumer, "onSessionStarted");
        sq8.m48649h(action, "onComplete");
        sq8.m48649h(consumer2, "onError");
        this.credentialsProvider = qc4Var;
        String streamingEndpointForRegion = getStreamingEndpointForRegion(faceLivenessSessionInformation.getRegion());
        this.livenessEndpoint = streamingEndpointForRegion;
        LivenessWebSocket livenessWebSocket = new LivenessWebSocket(qc4Var, streamingEndpointForRegion + "/start-face-liveness-session-websocket?session-id=" + str + "&challenge-versions=" + faceLivenessSessionInformation.getChallengeVersions() + "&video-width=" + ((int) faceLivenessSessionInformation.getVideoWidth()) + "&video-height=" + ((int) faceLivenessSessionInformation.getVideoHeight()), faceLivenessSessionInformation.getRegion(), faceLivenessSessionInformation, str2, new Consumer() { // from class: o.lve
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RunFaceLivenessSession.livenessWebSocket$lambda$0(this.f34426a, consumer, (SessionInformation) obj);
            }
        }, new Consumer() { // from class: o.nve
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RunFaceLivenessSession.livenessWebSocket$lambda$2(consumer2, (PredictionsException) obj);
            }
        }, new Action() { // from class: o.mve
            @Override // com.amplifyframework.core.Action
            public final void call() {
                RunFaceLivenessSession.livenessWebSocket$lambda$1(action);
            }
        });
        livenessWebSocket.start();
        this.livenessWebSocket = livenessWebSocket;
    }

    private final String getStreamingEndpointForRegion(String str) {
        return "wss://streaming-rekognition." + str + "." + (e9g.m24595I(str, "us-isof", true) ? ISO_PARTITION_BASE_DOMAIN : DEFAULT_BASE_DOMAIN) + ":443";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void livenessWebSocket$lambda$0(RunFaceLivenessSession runFaceLivenessSession, Consumer consumer, SessionInformation sessionInformation) {
        sq8.m48649h(runFaceLivenessSession, "this$0");
        sq8.m48649h(consumer, "$onSessionStarted");
        sq8.m48649h(sessionInformation, "sessionInformation");
        consumer.accept(new FaceLivenessSession(runFaceLivenessSession.processSessionInformation(sessionInformation), new RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$1(runFaceLivenessSession), new RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$2(runFaceLivenessSession), new RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$3(runFaceLivenessSession)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void livenessWebSocket$lambda$1(Action action) {
        sq8.m48649h(action, "$onComplete");
        action.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void livenessWebSocket$lambda$2(Consumer consumer, PredictionsException predictionsException) {
        sq8.m48649h(consumer, "$onError");
        sq8.m48649h(predictionsException, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        consumer.accept(predictionsException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processChallengeResponseEvent(ChallengeResponseEvent challengeResponseEvent) {
        if (challengeResponseEvent instanceof InitialFaceDetected) {
            InitialFaceDetected initialFaceDetected = (InitialFaceDetected) challengeResponseEvent;
            this.livenessWebSocket.sendInitialFaceDetectedEvent(initialFaceDetected.getFaceLocation(), initialFaceDetected.getTimestamp().getTime());
        } else if (challengeResponseEvent instanceof ColorChallengeResponse) {
            ColorChallengeResponse colorChallengeResponse = (ColorChallengeResponse) challengeResponseEvent;
            List listM21249n = ch3.m21249n(Integer.valueOf(colorChallengeResponse.getCurrentColor().getRed()), Integer.valueOf(colorChallengeResponse.getCurrentColor().getGreen()), Integer.valueOf(colorChallengeResponse.getCurrentColor().getBlue()));
            this.livenessWebSocket.sendColorDisplayedEvent(new FreshnessColor(listM21249n), new FreshnessColor(colorChallengeResponse.getPreviousColor() != null ? ch3.m21249n(Integer.valueOf(colorChallengeResponse.getPreviousColor().getRed()), Integer.valueOf(colorChallengeResponse.getPreviousColor().getGreen()), Integer.valueOf(colorChallengeResponse.getPreviousColor().getBlue())) : listM21249n), colorChallengeResponse.getColorSequenceIndex(), colorChallengeResponse.getCurrentColorStartTime().getTime());
        } else if (challengeResponseEvent instanceof FaceTargetChallengeResponse) {
            FaceTargetChallengeResponse faceTargetChallengeResponse = (FaceTargetChallengeResponse) challengeResponseEvent;
            this.livenessWebSocket.sendFinalEvent(faceTargetChallengeResponse.getTargetLocation(), faceTargetChallengeResponse.getFaceInTargetStartTimestamp().getTime(), faceTargetChallengeResponse.getFaceInTargetEndTimestamp().getTime());
        }
    }

    private final List<FaceLivenessSessionChallenge> processSessionInformation(SessionInformation sessionInformation) {
        FaceMovementAndLightServerChallenge faceMovementAndLightChallenge = sessionInformation.getChallenge().getFaceMovementAndLightChallenge();
        ArrayList arrayList = new ArrayList();
        OvalParameters ovalParameters = faceMovementAndLightChallenge.getOvalParameters();
        ChallengeConfig challengeConfig = faceMovementAndLightChallenge.getChallengeConfig();
        arrayList.add(new FaceTargetChallenge(ovalParameters.getWidth(), ovalParameters.getHeight(), ovalParameters.getCenterX(), ovalParameters.getCenterY(), new FaceTargetMatchingParameters(challengeConfig.getOvalIouThreshold(), challengeConfig.getOvalIouWidthThreshold(), challengeConfig.getOvalIouHeightThreshold(), challengeConfig.getFaceIouWidthThreshold(), challengeConfig.getFaceIouHeightThreshold(), challengeConfig.getOvalFitTimeout())));
        ColorChallengeType colorChallengeType = ColorChallengeType.SEQUENTIAL;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : faceMovementAndLightChallenge.getColorSequences()) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            ColorSequence colorSequence = (ColorSequence) obj;
            List<Integer> rgb = colorSequence.getFreshnessColor().getRGB();
            boolean z = true;
            RgbColor rgbColor = new RgbColor(rgb.get(0).intValue(), rgb.get(1).intValue(), rgb.get(2).intValue());
            float flatDisplayDuration = colorSequence.getFlatDisplayDuration();
            if (colorSequence.getFlatDisplayDuration() == 0.0f) {
                flatDisplayDuration = colorSequence.getDownscrollDuration();
            } else {
                z = false;
            }
            arrayList2.add(new ColorDisplayInformation(rgbColor, flatDisplayDuration, z));
            i = i2;
        }
        arrayList.add(new ColorChallenge(this.livenessWebSocket.getChallengeId$aws_predictions_release(), colorChallengeType, kh3.Q0(arrayList2)));
        return kh3.Q0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processVideoEvent(VideoEvent videoEvent) {
        this.livenessWebSocket.sendVideoEvent(videoEvent.getBytes(), videoEvent.getTimestamp().getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLivenessSession(Integer num) {
        y3i y3iVar;
        this.livenessWebSocket.setClientStoppedSession$aws_predictions_release(true);
        if (num != null) {
            this.livenessWebSocket.destroy(num.intValue());
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            LivenessWebSocket.destroy$default(this.livenessWebSocket, 0, 1, null);
        }
    }

    public final qc4 getCredentialsProvider() {
        return this.credentialsProvider;
    }
}
