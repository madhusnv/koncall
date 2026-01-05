package com.amplifyframework.kotlin.predictions;

import android.graphics.Bitmap;
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
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Predictions {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object convertTextToSpeech$default(Predictions predictions, String str, TextToSpeechOptions textToSpeechOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertTextToSpeech");
        }
        if ((i10 & 2) != 0) {
            textToSpeechOptions = TextToSpeechOptions.defaults();
            AbstractC4154l.m8922e(textToSpeechOptions, "defaults(...)");
        }
        return predictions.convertTextToSpeech(str, textToSpeechOptions, interfaceC7559c);
    }

    static /* synthetic */ Object identify$default(Predictions predictions, IdentifyAction identifyAction, Bitmap bitmap, IdentifyOptions identifyOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 4) != 0) {
            identifyOptions = IdentifyOptions.defaults();
            AbstractC4154l.m8922e(identifyOptions, "defaults(...)");
        }
        return predictions.identify(identifyAction, bitmap, identifyOptions, interfaceC7559c);
    }

    static /* synthetic */ Object interpret$default(Predictions predictions, String str, InterpretOptions interpretOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: interpret");
        }
        if ((i10 & 2) != 0) {
            interpretOptions = InterpretOptions.defaults();
            AbstractC4154l.m8922e(interpretOptions, "defaults(...)");
        }
        return predictions.interpret(str, interpretOptions, interfaceC7559c);
    }

    static /* synthetic */ Object translateText$default(Predictions predictions, String str, TranslateTextOptions translateTextOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateText");
        }
        if ((i10 & 2) != 0) {
            translateTextOptions = TranslateTextOptions.defaults();
            AbstractC4154l.m8922e(translateTextOptions, "defaults(...)");
        }
        return predictions.translateText(str, translateTextOptions, interfaceC7559c);
    }

    Object convertTextToSpeech(String str, TextToSpeechOptions textToSpeechOptions, InterfaceC7559c<? super TextToSpeechResult> interfaceC7559c);

    Object identify(IdentifyAction identifyAction, Bitmap bitmap, IdentifyOptions identifyOptions, InterfaceC7559c<? super IdentifyResult> interfaceC7559c);

    Object interpret(String str, InterpretOptions interpretOptions, InterfaceC7559c<? super InterpretResult> interfaceC7559c);

    Object translateText(String str, LanguageType languageType, LanguageType languageType2, TranslateTextOptions translateTextOptions, InterfaceC7559c<? super TranslateTextResult> interfaceC7559c);

    Object translateText(String str, TranslateTextOptions translateTextOptions, InterfaceC7559c<? super TranslateTextResult> interfaceC7559c);

    static /* synthetic */ Object translateText$default(Predictions predictions, String str, LanguageType languageType, LanguageType languageType2, TranslateTextOptions translateTextOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateText");
        }
        if ((i10 & 8) != 0) {
            translateTextOptions = TranslateTextOptions.defaults();
            AbstractC4154l.m8922e(translateTextOptions, "defaults(...)");
        }
        return predictions.translateText(str, languageType, languageType2, translateTextOptions, interfaceC7559c);
    }
}
