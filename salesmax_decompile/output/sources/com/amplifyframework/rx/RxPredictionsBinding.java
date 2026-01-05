package com.amplifyframework.rx;

import android.graphics.Bitmap;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsCategoryBehavior;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.options.IdentifyOptions;
import com.amplifyframework.predictions.options.InterpretOptions;
import com.amplifyframework.predictions.options.TextToSpeechOptions;
import com.amplifyframework.predictions.options.TranslateTextOptions;
import com.amplifyframework.rx.RxAdapters;
import java.util.Objects;
import p001o.wtf;

/* loaded from: classes5.dex */
final class RxPredictionsBinding implements RxPredictionsCategoryBehavior {
    private final PredictionsCategoryBehavior delegate;

    public RxPredictionsBinding() {
        this(Amplify.Predictions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convertTextToSpeech$0(String str, Consumer consumer, Consumer consumer2) {
        this.delegate.convertTextToSpeech(str, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convertTextToSpeech$1(String str, TextToSpeechOptions textToSpeechOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.convertTextToSpeech(str, textToSpeechOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$identify$6(IdentifyAction identifyAction, Bitmap bitmap, Consumer consumer, Consumer consumer2) {
        this.delegate.identify(identifyAction, bitmap, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$identify$7(IdentifyAction identifyAction, Bitmap bitmap, IdentifyOptions identifyOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.identify(identifyAction, bitmap, identifyOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$interpret$8(String str, Consumer consumer, Consumer consumer2) {
        this.delegate.interpret(str, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$interpret$9(String str, InterpretOptions interpretOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.interpret(str, interpretOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateText$2(String str, Consumer consumer, Consumer consumer2) {
        this.delegate.translateText(str, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateText$3(String str, TranslateTextOptions translateTextOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.translateText(str, translateTextOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateText$4(String str, LanguageType languageType, LanguageType languageType2, Consumer consumer, Consumer consumer2) {
        this.delegate.translateText(str, languageType, languageType2, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$translateText$5(String str, LanguageType languageType, LanguageType languageType2, TranslateTextOptions translateTextOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.translateText(str, languageType, languageType2, translateTextOptions, consumer, consumer2);
    }

    private static <T> wtf toSingle(RxAdapters.VoidBehaviors.ResultEmitter<T, PredictionsException> resultEmitter) {
        return RxAdapters.VoidBehaviors.toSingle(resultEmitter);
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf convertTextToSpeech(final String str) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.k3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10953a.lambda$convertTextToSpeech$0(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf identify(final IdentifyAction identifyAction, final Bitmap bitmap) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.l3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10968a.lambda$identify$6(identifyAction, bitmap, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf interpret(final String str) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.i3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10918a.lambda$interpret$8(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf translateText(final String str) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.m3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10985a.lambda$translateText$2(str, consumer, consumer2);
            }
        });
    }

    public RxPredictionsBinding(PredictionsCategoryBehavior predictionsCategoryBehavior) {
        Objects.requireNonNull(predictionsCategoryBehavior);
        this.delegate = predictionsCategoryBehavior;
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf convertTextToSpeech(final String str, final TextToSpeechOptions textToSpeechOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.e3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10861a.lambda$convertTextToSpeech$1(str, textToSpeechOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf identify(final IdentifyAction identifyAction, final Bitmap bitmap, final IdentifyOptions identifyOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.h3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10903a.lambda$identify$7(identifyAction, bitmap, identifyOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf interpret(final String str, final InterpretOptions interpretOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.f3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10873a.lambda$interpret$9(str, interpretOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf translateText(final String str, final TranslateTextOptions translateTextOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.j3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10938a.lambda$translateText$3(str, translateTextOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf translateText(final String str, final LanguageType languageType, final LanguageType languageType2) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.g3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10889a.lambda$translateText$4(str, languageType, languageType2, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPredictionsCategoryBehavior
    public wtf translateText(final String str, final LanguageType languageType, final LanguageType languageType2, final TranslateTextOptions translateTextOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.d3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10844a.lambda$translateText$5(str, languageType, languageType2, translateTextOptions, consumer, consumer2);
            }
        });
    }
}
