package com.amplifyframework.predictions.aws.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.request.AWSComprehendRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.operation.InterpretOperation;
import com.amplifyframework.predictions.result.InterpretResult;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AWSInterpretOperation extends InterpretOperation<AWSComprehendRequest> {
    private final ExecutorService executorService;
    private final Consumer<PredictionsException> onError;
    private final Consumer<InterpretResult> onSuccess;
    private final AWSPredictionsService predictionsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSInterpretOperation(AWSPredictionsService aWSPredictionsService, ExecutorService executorService, AWSComprehendRequest aWSComprehendRequest, Consumer<InterpretResult> consumer, Consumer<PredictionsException> consumer2) {
        super(aWSComprehendRequest);
        Objects.requireNonNull(aWSComprehendRequest);
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
        this.predictionsService.comprehend(getRequest().getText(), this.onSuccess, this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.execute(new Runnable() { // from class: o.r3
            @Override // java.lang.Runnable
            public final void run() {
                this.f42791a.lambda$start$0();
            }
        });
    }
}
