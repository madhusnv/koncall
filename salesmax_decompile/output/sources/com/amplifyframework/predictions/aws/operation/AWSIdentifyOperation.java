package com.amplifyframework.predictions.aws.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.request.AWSImageIdentifyRequest;
import com.amplifyframework.predictions.aws.service.AWSPredictionsService;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.IdentifyActionType;
import com.amplifyframework.predictions.operation.IdentifyOperation;
import com.amplifyframework.predictions.result.IdentifyResult;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AWSIdentifyOperation extends IdentifyOperation<AWSImageIdentifyRequest> {
    private final ExecutorService executorService;
    private final Consumer<PredictionsException> onError;
    private final Consumer<IdentifyResult> onSuccess;
    private final AWSPredictionsService predictionsService;

    /* renamed from: com.amplifyframework.predictions.aws.operation.AWSIdentifyOperation$1 */
    public static /* synthetic */ class C106151 {

        /* renamed from: $SwitchMap$com$amplifyframework$predictions$models$IdentifyActionType */
        static final /* synthetic */ int[] f10799xbbd0b25f;

        static {
            int[] iArr = new int[IdentifyActionType.values().length];
            f10799xbbd0b25f = iArr;
            try {
                iArr[IdentifyActionType.DETECT_CELEBRITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10799xbbd0b25f[IdentifyActionType.DETECT_LABELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10799xbbd0b25f[IdentifyActionType.DETECT_ENTITIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10799xbbd0b25f[IdentifyActionType.DETECT_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSIdentifyOperation(AWSPredictionsService aWSPredictionsService, ExecutorService executorService, IdentifyAction identifyAction, AWSImageIdentifyRequest aWSImageIdentifyRequest, Consumer<IdentifyResult> consumer, Consumer<PredictionsException> consumer2) {
        super(identifyAction, aWSImageIdentifyRequest);
        Objects.requireNonNull(aWSImageIdentifyRequest);
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
    public /* synthetic */ void lambda$startCelebritiesDetection$0() throws PredictionsException {
        this.predictionsService.recognizeCelebrities(getRequest().getImageData(), this.onSuccess, this.onError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startEntitiesDetection$2() {
        this.predictionsService.detectEntities(getRequest().getImageData(), this.onSuccess, this.onError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startLabelsDetection$1() {
        this.predictionsService.detectLabels(getIdentifyAction(), getRequest().getImageData(), this.onSuccess, this.onError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTextDetection$3() {
        this.predictionsService.detectText(getIdentifyAction(), getRequest().getImageData(), this.onSuccess, this.onError);
    }

    private void startCelebritiesDetection() {
        this.executorService.execute(new Runnable() { // from class: o.n3
            @Override // java.lang.Runnable
            public final void run() throws PredictionsException {
                this.f36290a.lambda$startCelebritiesDetection$0();
            }
        });
    }

    private void startEntitiesDetection() {
        this.executorService.execute(new Runnable() { // from class: o.o3
            @Override // java.lang.Runnable
            public final void run() {
                this.f37683a.lambda$startEntitiesDetection$2();
            }
        });
    }

    private void startLabelsDetection() {
        this.executorService.execute(new Runnable() { // from class: o.q3
            @Override // java.lang.Runnable
            public final void run() {
                this.f41181a.lambda$startLabelsDetection$1();
            }
        });
    }

    private void startTextDetection() {
        this.executorService.execute(new Runnable() { // from class: o.p3
            @Override // java.lang.Runnable
            public final void run() {
                this.f39272a.lambda$startTextDetection$3();
            }
        });
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        int i = C106151.f10799xbbd0b25f[getIdentifyAction().getType().ordinal()];
        if (i == 1) {
            startCelebritiesDetection();
            return;
        }
        if (i == 2) {
            startLabelsDetection();
        } else if (i == 3) {
            startEntitiesDetection();
        } else {
            if (i != 4) {
                return;
            }
            startTextDetection();
        }
    }
}
