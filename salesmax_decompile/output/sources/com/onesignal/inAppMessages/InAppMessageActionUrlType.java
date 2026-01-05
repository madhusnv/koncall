package com.onesignal.inAppMessages;

import p001o.e9g;
import p001o.id5;

/* loaded from: classes6.dex */
public enum InAppMessageActionUrlType {
    IN_APP_WEBVIEW("webview"),
    BROWSER("browser"),
    REPLACE_CONTENT("replacement");

    public static final Companion Companion = new Companion(null);
    private final String text;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final InAppMessageActionUrlType fromString(String str) {
            for (InAppMessageActionUrlType inAppMessageActionUrlType : InAppMessageActionUrlType.values()) {
                if (e9g.m24606x(inAppMessageActionUrlType.text, str, true)) {
                    return inAppMessageActionUrlType;
                }
            }
            return null;
        }
    }

    InAppMessageActionUrlType(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
