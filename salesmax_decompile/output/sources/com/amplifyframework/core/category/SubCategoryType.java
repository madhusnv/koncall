package com.amplifyframework.core.category;

import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;

/* loaded from: classes5.dex */
public enum SubCategoryType {
    PUSH_NOTIFICATIONS(InAppMessagePromptTypes.PUSH_PROMPT_KEY),
    INAPP_MESSAGING("inapp_messaging");

    private final String configurationKey;

    SubCategoryType(String str) {
        this.configurationKey = str;
    }

    public String getConfigurationKey() {
        return this.configurationKey;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.configurationKey;
    }
}
