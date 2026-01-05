package com.amplifyframework.util;

import android.annotation.SuppressLint;
import android.os.Build;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UserAgent {
    private static final Logger LOG = Amplify.Logging.logger("amplify:core");
    private static UserAgent instance = null;
    private final Map<String, String> extras;
    private final String libraryName;
    private final String libraryVersion;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Platform {
        ANDROID("amplify-android"),
        FLUTTER("amplify-flutter");

        private final String libraryName;

        Platform(String str) {
            this.libraryName = str;
        }

        public String getLibraryName() {
            return this.libraryName;
        }
    }

    private UserAgent(String str, String str2, Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.extras = linkedHashMap;
        this.libraryName = str;
        this.libraryVersion = str2;
        linkedHashMap.putAll(map);
        String strEscape = escape(sanitize(Build.MANUFACTURER));
        String strEscape2 = escape(sanitize(Build.MODEL));
        String strSanitize = sanitize(System.getProperty("user.language"));
        String strSanitize2 = sanitize(System.getProperty("user.region"));
        linkedHashMap.put(strEscape, strEscape2);
        linkedHashMap.put("locale", strSanitize + "_" + strSanitize2);
    }

    public static synchronized void configure(Map<Platform, String> map) {
        String libraryName;
        String strSanitize;
        try {
            if (instance != null) {
                throw new AmplifyException("User-Agent was already configured successfully.", "User-Agent is configured internally during Amplify configuration. This method should not be called externally.");
            }
            HashMap map2 = new HashMap();
            Platform platform = Platform.FLUTTER;
            if (map.containsKey(platform)) {
                libraryName = platform.getLibraryName();
                strSanitize = map.get(platform);
                map2.put(Platform.ANDROID.getLibraryName(), sanitize("2.29.2"));
            } else {
                libraryName = Platform.ANDROID.getLibraryName();
                strSanitize = sanitize("2.29.2");
            }
            UserAgent userAgent = new UserAgent(libraryName, strSanitize, map2);
            instance = userAgent;
            userAgent.setMetaData();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String escape(String str) {
        return str.replace(" ", "_");
    }

    private String getExtrasString() {
        final StringBuilder sb2 = new StringBuilder();
        this.extras.forEach(new BiConsumer() { // from class: com.amplifyframework.util.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                UserAgent.lambda$getExtrasString$1(sb2, (String) obj, (String) obj2);
            }
        });
        return sb2.toString();
    }

    public static boolean isFlutter() {
        return string().contains(Platform.FLUTTER.libraryName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getExtrasString$1(StringBuilder sb2, String str, String str2) {
        sb2.append(" md/" + str + "/" + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setMetaData$0(String str, String str2) {
        System.setProperty("aws.customMetadata." + str, str2);
    }

    public static synchronized void reset() {
        instance = null;
    }

    private static String sanitize(String str) {
        return str != null ? str : "UNKNOWN";
    }

    private void setMetaData() {
        System.setProperty("aws.frameworkMetadata", this.libraryName + ":" + this.libraryVersion);
        this.extras.forEach(new C1272c());
    }

    @SuppressLint({"SyntheticAccessor"})
    public static String string() {
        UserAgent userAgent = instance;
        if (userAgent != null) {
            return userAgent.toString();
        }
        LOG.debug("User-Agent is not yet configured. Returning default Android user-agent.");
        return new UserAgent(Platform.ANDROID.getLibraryName(), "2.29.2", new HashMap()).toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.libraryName + ":" + this.libraryVersion);
        sb2.append(getExtrasString());
        return sb2.toString();
    }
}
