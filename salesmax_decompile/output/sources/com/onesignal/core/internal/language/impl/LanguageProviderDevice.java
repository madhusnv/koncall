package com.onesignal.core.internal.language.impl;

import java.util.Locale;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class LanguageProviderDevice {
    private static final String CHINESE = "zh";
    public static final Companion Companion = new Companion(null);
    private static final String HEBREW_CORRECTED = "he";
    private static final String HEBREW_INCORRECT = "iw";
    private static final String INDONESIAN_CORRECTED = "id";
    private static final String INDONESIAN_INCORRECT = "in";
    private static final String YIDDISH_CORRECTED = "yi";
    private static final String YIDDISH_INCORRECT = "ji";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public final String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        if (language != null) {
            int iHashCode = language.hashCode();
            if (iHashCode != 3365) {
                if (iHashCode != 3374) {
                    if (iHashCode != 3391) {
                        if (iHashCode == 3886 && language.equals(CHINESE)) {
                            return language + '-' + Locale.getDefault().getCountry();
                        }
                    } else if (language.equals(YIDDISH_INCORRECT)) {
                        return YIDDISH_CORRECTED;
                    }
                } else if (language.equals(HEBREW_INCORRECT)) {
                    return HEBREW_CORRECTED;
                }
            } else if (language.equals(INDONESIAN_INCORRECT)) {
                return "id";
            }
        }
        sq8.m48648g(language, "language");
        return language;
    }
}
