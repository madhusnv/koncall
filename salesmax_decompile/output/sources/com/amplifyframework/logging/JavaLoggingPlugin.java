package com.amplifyframework.logging;

import android.content.Context;
import com.amplifyframework.core.category.CategoryType;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class JavaLoggingPlugin extends LoggingPlugin<Void> {
    private static final String AMPLIFY_NAMESPACE = "amplify";
    private final LogLevel defaultLoggerThreshold;

    public JavaLoggingPlugin() {
        this(LogLevel.INFO);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) {
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void disable() {
        JavaLogger.setIsEnabled(false);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void enable() {
        JavaLogger.setIsEnabled(true);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger forNamespace(String str) {
        if (str == null) {
            str = AMPLIFY_NAMESPACE;
        }
        return logger(str);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public Void getEscapeHatch() {
        return null;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return "JavaLoggingPlugin";
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.27.1";
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(String str) {
        return new JavaLogger(str, this.defaultLoggerThreshold);
    }

    public JavaLoggingPlugin(LogLevel logLevel) {
        this.defaultLoggerThreshold = logLevel;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(CategoryType categoryType, String str) {
        return logger(str);
    }
}
