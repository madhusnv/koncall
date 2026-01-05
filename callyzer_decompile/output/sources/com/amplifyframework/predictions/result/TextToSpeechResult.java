package com.amplifyframework.predictions.result;

import java.io.InputStream;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TextToSpeechResult {
    private final InputStream audioData;

    private TextToSpeechResult(InputStream inputStream) {
        this.audioData = inputStream;
    }

    public static TextToSpeechResult fromAudioData(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        return new TextToSpeechResult(inputStream);
    }

    public InputStream getAudioData() {
        return this.audioData;
    }
}
