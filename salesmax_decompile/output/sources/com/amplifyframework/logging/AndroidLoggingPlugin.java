package com.amplifyframework.logging;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AndroidLoggingPlugin extends LoggingPlugin<Void> {
    private static final String AMPLIFY_NAMESPACE = "amplify";
    private final LogLevel defaultLoggerThreshold;

    public AndroidLoggingPlugin() {
        this(LogLevel.INFO);
    }

    private boolean readConfigFile(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("consoleLoggingPlugin").getBoolean("enable");
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) {
        AndroidLogger.setIsEnabled(readConfigFile(jSONObject));
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void disable() {
        AndroidLogger.setIsEnabled(false);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void enable() {
        AndroidLogger.setIsEnabled(true);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger forNamespace(String str) {
        if (str == null) {
            str = AMPLIFY_NAMESPACE;
        }
        return new AndroidLogger(str, this.defaultLoggerThreshold);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public Void getEscapeHatch() {
        return null;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return "AndroidLoggingPlugin";
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.27.1";
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(String str) {
        return new AndroidLogger(str, this.defaultLoggerThreshold);
    }

    public AndroidLoggingPlugin(LogLevel logLevel) {
        this.defaultLoggerThreshold = logLevel;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(CategoryType categoryType, String str) {
        return new AndroidLogger(str, this.defaultLoggerThreshold);
    }
}
