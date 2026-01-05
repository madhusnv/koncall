package com.amplifyframework.predictions.aws.request;

import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class AWSPollyRequest {
    private final String text;
    private final AWSVoiceType voiceType;

    public AWSPollyRequest(String str, AWSVoiceType aWSVoiceType) {
        Objects.requireNonNull(str);
        this.text = str;
        Objects.requireNonNull(aWSVoiceType);
        this.voiceType = aWSVoiceType;
    }

    /* renamed from: getText */
    public String m68964getText() {
        return this.text;
    }

    public AWSVoiceType getVoiceType() {
        return this.voiceType;
    }
}
