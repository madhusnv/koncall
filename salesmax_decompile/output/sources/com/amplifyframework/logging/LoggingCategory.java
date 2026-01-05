package com.amplifyframework.logging;

import android.content.Context;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.Resources;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryConfiguration;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.util.Environment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class LoggingCategory extends Category<LoggingPlugin<?>> implements LoggingCategoryBehavior {
    private final LoggingPlugin<?> defaultPlugin;

    public LoggingCategory() {
        this(Environment.isJUnitTest() ? new JavaLoggingPlugin() : new AndroidLoggingPlugin());
    }

    private Set<LoggingPlugin<?>> getPluginsWithDefault() {
        HashSet hashSet = new HashSet(getPlugins());
        hashSet.add(this.defaultPlugin);
        return hashSet;
    }

    private JSONObject readConfigFile(Context context) {
        try {
            return Resources.readJsonResourceFromId(context, Resources.getRawResourceId(context, "amplifyconfiguration_logging"));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.amplifyframework.core.category.Category
    public synchronized void configure(CategoryConfiguration categoryConfiguration, Context context) {
        super.configure(categoryConfiguration, context);
        configure(context);
    }

    @Override // com.amplifyframework.core.category.Category
    public boolean configureFromDefaultConfigFile() {
        return false;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void disable() {
        Iterator<LoggingPlugin<?>> it = getPluginsWithDefault().iterator();
        while (it.hasNext()) {
            it.next().disable();
        }
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void enable() {
        Iterator<LoggingPlugin<?>> it = getPluginsWithDefault().iterator();
        while (it.hasNext()) {
            it.next().enable();
        }
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger forNamespace(String str) {
        return logger(str);
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.LOGGING;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(String str) {
        Set<LoggingPlugin<?>> pluginsWithDefault = getPluginsWithDefault();
        ArrayList arrayList = new ArrayList();
        Iterator<LoggingPlugin<?>> it = pluginsWithDefault.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().logger(str));
        }
        return new BroadcastLogger(arrayList);
    }

    public LoggingCategory(LoggingPlugin<?> loggingPlugin) {
        this.defaultPlugin = loggingPlugin;
    }

    @Override // com.amplifyframework.core.category.Category
    public LoggingPlugin<?> getSelectedPlugin() {
        throw new UnsupportedOperationException("Getting the selected logging plugin is not supported.");
    }

    @Override // com.amplifyframework.core.category.Category
    @InternalAmplifyApi
    public synchronized void configure(AmplifyOutputsData amplifyOutputsData, Context context) {
        configure(context);
    }

    private void configure(Context context) {
        JSONObject configFile = readConfigFile(context);
        HashSet hashSet = new HashSet(getPlugins());
        hashSet.add(this.defaultPlugin);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((LoggingPlugin) it.next()).configure(configFile, context);
        }
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(CategoryType categoryType, String str) {
        Set<LoggingPlugin<?>> pluginsWithDefault = getPluginsWithDefault();
        ArrayList arrayList = new ArrayList();
        Iterator<LoggingPlugin<?>> it = pluginsWithDefault.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().logger(categoryType, str));
        }
        return new BroadcastLogger(arrayList);
    }
}
