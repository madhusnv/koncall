package com.amplifyframework.predictions.models;

/* loaded from: classes5.dex */
public enum LabelType implements IdentifyAction {
    LABELS,
    MODERATION_LABELS,
    ALL;

    @Override // com.amplifyframework.predictions.models.IdentifyAction
    public final IdentifyActionType getType() {
        return IdentifyActionType.DETECT_LABELS;
    }
}
