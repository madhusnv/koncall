package com.amplifyframework.kotlin.predictions;

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
import com.amplifyframework.predictions.result.IdentifyResult;
import com.amplifyframework.predictions.result.InterpretResult;
import com.amplifyframework.predictions.result.TextToSpeechResult;
import com.amplifyframework.predictions.result.TranslateTextResult;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinPredictionsFacade implements Predictions {
    private final PredictionsCategoryBehavior delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinPredictionsFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.amplifyframework.kotlin.predictions.Predictions
    public Object convertTextToSpeech(String str, TextToSpeechOptions textToSpeechOptions, InterfaceC7559c<? super TextToSpeechResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.convertTextToSpeech(str, textToSpeechOptions, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$convertTextToSpeech$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(TextToSpeechResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$convertTextToSpeech$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PredictionsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.predictions.Predictions
    public Object identify(IdentifyAction identifyAction, Bitmap bitmap, IdentifyOptions identifyOptions, InterfaceC7559c<? super IdentifyResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.identify(identifyAction, bitmap, identifyOptions, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$identify$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(IdentifyResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$identify$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PredictionsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.predictions.Predictions
    public Object interpret(String str, InterpretOptions interpretOptions, InterfaceC7559c<? super InterpretResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.interpret(str, interpretOptions, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$interpret$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(InterpretResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$interpret$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PredictionsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.predictions.Predictions
    public Object translateText(String str, TranslateTextOptions translateTextOptions, InterfaceC7559c<? super TranslateTextResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.translateText(str, translateTextOptions, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$translateText$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(TranslateTextResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$translateText$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PredictionsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public KotlinPredictionsFacade(PredictionsCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinPredictionsFacade(PredictionsCategoryBehavior Predictions, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            Predictions = Amplify.Predictions;
            AbstractC4154l.m8922e(Predictions, "Predictions");
        }
        this(Predictions);
    }

    @Override // com.amplifyframework.kotlin.predictions.Predictions
    public Object translateText(String str, LanguageType languageType, LanguageType languageType2, TranslateTextOptions translateTextOptions, InterfaceC7559c<? super TranslateTextResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.translateText(str, languageType, languageType2, translateTextOptions, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$translateText$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(TranslateTextResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade$translateText$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PredictionsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }
}
