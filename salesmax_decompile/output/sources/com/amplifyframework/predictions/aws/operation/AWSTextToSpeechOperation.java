package com.amplifyframework.predictions.aws.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.request.AWSPollyRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.operation.TextToSpeechOperation;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AWSTextToSpeechOperation extends TextToSpeechOperation<AWSPollyRequest> {
    private final ExecutorService executorService;
    private final Consumer<PredictionsException> onError;
    private final Consumer<TextToSpeechResult> onSuccess;
    private final AWSPredictionsService predictionsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTextToSpeechOperation(AWSPredictionsService aWSPredictionsService, ExecutorService executorService, AWSPollyRequest aWSPollyRequest, Consumer<TextToSpeechResult> consumer, Consumer<PredictionsException> consumer2) {
        super(aWSPollyRequest);
        Objects.requireNonNull(aWSPollyRequest);
        Objects.requireNonNull(aWSPredictionsService);
        this.predictionsService = aWSPredictionsService;
        Objects.requireNonNull(executorService);
        this.executorService = executorService;
        Objects.requireNonNull(consumer);
        this.onSuccess = consumer;
        Objects.requireNonNull(consumer2);
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        this.predictionsService.synthesizeSpeech(getRequest().m68964getText(), getRequest().getVoiceType(), this.onSuccess, this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.execute(new Runnable() { // from class: o.s5
            @Override // java.lang.Runnable
            public final void run() {
                this.f44820a.lambda$start$0();
            }
        });
    }
}
