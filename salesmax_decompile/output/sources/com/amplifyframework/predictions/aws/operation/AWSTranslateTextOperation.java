package com.amplifyframework.predictions.aws.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.request.AWSTranslateRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.operation.TranslateTextOperation;
import com.amplifyframework.predictions.result.TranslateTextResult;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AWSTranslateTextOperation extends TranslateTextOperation<AWSTranslateRequest> {
    private final ExecutorService executorService;
    private final Consumer<PredictionsException> onError;
    private final Consumer<TranslateTextResult> onSuccess;
    private final AWSPredictionsService predictionsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTranslateTextOperation(AWSPredictionsService aWSPredictionsService, ExecutorService executorService, AWSTranslateRequest aWSTranslateRequest, Consumer<TranslateTextResult> consumer, Consumer<PredictionsException> consumer2) {
        super(aWSTranslateRequest);
        Objects.requireNonNull(aWSTranslateRequest);
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
        this.predictionsService.translate(getRequest().m68965getText(), getRequest().getSourceLanguage(), getRequest().getTargetLanguage(), this.onSuccess, this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.execute(new Runnable() { // from class: o.v5
            @Override // java.lang.Runnable
            public final void run() {
                this.f49878a.lambda$start$0();
            }
        });
    }
}
