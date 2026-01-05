package com.amplifyframework.rx;

import android.graphics.Bitmap;
import com.amplifyframework.predictions.models.IdentifyAction;
import com.amplifyframework.predictions.models.LanguageType;
import com.amplifyframework.predictions.options.IdentifyOptions;
import com.amplifyframework.predictions.options.InterpretOptions;
import com.amplifyframework.predictions.options.TextToSpeechOptions;
import com.amplifyframework.predictions.options.TranslateTextOptions;
import p001o.wtf;

/* loaded from: classes5.dex */
public interface RxPredictionsCategoryBehavior {
    wtf convertTextToSpeech(String str);

    wtf convertTextToSpeech(String str, TextToSpeechOptions textToSpeechOptions);

    wtf identify(IdentifyAction identifyAction, Bitmap bitmap);

    wtf identify(IdentifyAction identifyAction, Bitmap bitmap, IdentifyOptions identifyOptions);

    wtf interpret(String str);

    wtf interpret(String str, InterpretOptions interpretOptions);

    wtf translateText(String str);

    wtf translateText(String str, LanguageType languageType, LanguageType languageType2);

    wtf translateText(String str, LanguageType languageType, LanguageType languageType2, TranslateTextOptions translateTextOptions);

    wtf translateText(String str, TranslateTextOptions translateTextOptions);
}
