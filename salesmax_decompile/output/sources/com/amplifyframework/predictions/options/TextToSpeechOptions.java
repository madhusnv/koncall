package com.amplifyframework.predictions.options;

import com.amplifyframework.predictions.models.VoiceType;

/* loaded from: classes5.dex */
public final class TextToSpeechOptions {
    private final VoiceType voiceType;

    public static final class Builder {
        private VoiceType voiceType;

        public TextToSpeechOptions build() {
            return new TextToSpeechOptions(this);
        }

        public VoiceType getVoiceType() {
            return this.voiceType;
        }

        public Builder voiceType(VoiceType voiceType) {
            this.voiceType = voiceType;
            return this;
        }
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
