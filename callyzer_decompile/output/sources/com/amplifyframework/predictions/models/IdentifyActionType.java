package com.amplifyframework.predictions.models;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum IdentifyActionType implements IdentifyAction {
    DETECT_CELEBRITIES,
    DETECT_LABELS,
    DETECT_ENTITIES,
    DETECT_TEXT;

    @Override // com.amplifyframework.predictions.models.IdentifyAction
    public final IdentifyActionType getType() {
        return this;
    }
}
