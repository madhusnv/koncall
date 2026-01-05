package com.amplifyframework.predictions.options;

import com.amplifyframework.predictions.models.VoiceType;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TextToSpeechOptions {
    private final VoiceType voiceType;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private VoiceType voiceType;

        public TextToSpeechOptions build() {
            return new TextToSpeechOptions(this, 0);
        }

        public VoiceType getVoiceType() {
            return this.voiceType;
        }

        public Builder voiceType(VoiceType voiceType) {
            this.voiceType = voiceType;
            return this;
        }
    }

    public /* synthetic */ TextToSpeechOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextToSpeechOptions defaults() {
        return new TextToSpeechOptions(builder());
    }

    public VoiceType getVoiceType() {
        return this.voiceType;
    }

    private TextToSpeechOptions(Builder builder) {
        this.voiceType = builder.getVoiceType();
    }
}
