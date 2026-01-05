package com.onesignal.inAppMessages.internal.common;

import com.google.android.gms.cast.CredentialsData;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.inAppMessages.internal.InAppMessage;
import java.util.List;
import java.util.Map;
import org.apache.http.client.config.CookieSpecs;
import p001o.ch3;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppHelper {
    public static final InAppHelper INSTANCE = new InAppHelper();
    private static final List<String> PREFERRED_VARIANT_ORDER = ch3.m21249n(CredentialsData.CREDENTIALS_TYPE_ANDROID, "app", "all");

    private InAppHelper() {
    }

    public final String variantIdForMessage(InAppMessage inAppMessage, ILanguageContext iLanguageContext) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(iLanguageContext, "languageContext");
        String language = iLanguageContext.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (inAppMessage.getVariants().containsKey(str)) {
                Map<String, String> map = inAppMessage.getVariants().get(str);
                sq8.m48646e(map);
                Map<String, String> map2 = map;
                if (!map2.containsKey(language)) {
                    language = CookieSpecs.DEFAULT;
                }
                return map2.get(language);
            }
        }
        return null;
    }
}
