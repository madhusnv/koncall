package com.amplifyframework.rx;

import android.content.Context;
import com.amplifyframework.analytics.AnalyticsCategory;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.AmplifyConfiguration;
import com.amplifyframework.core.configuration.AmplifyOutputs;
import com.amplifyframework.core.plugin.Plugin;
import com.amplifyframework.logging.LoggingCategory;

/* loaded from: classes5.dex */
public final class RxAmplify {
    public static final AnalyticsCategory Analytics = Amplify.Analytics;
    public static final RxApiCategoryBehavior API = new RxApiBinding();
    public static final RxAuthCategoryBehavior Auth = new RxAuthBinding();
    public static final LoggingCategory Logging = Amplify.Logging;
    public static final RxStorageCategoryBehavior Storage = new RxStorageBinding();
    public static final RxHubCategoryBehavior Hub = new RxHubBinding();
    public static final RxDataStoreCategoryBehavior DataStore = new RxDataStoreBinding();
    public static final RxPredictionsCategoryBehavior Predictions = new RxPredictionsBinding();
    public static final RxGeoCategoryBehavior Geo = new RxGeoBinding();
    public static final RxNotificationsCategoryBehavior Notifications = new RxNotificationsBinding();

    private RxAmplify() {
    }

    public static <P extends Plugin<?>> void addPlugin(P p) {
        Amplify.addPlugin(p);
    }

    public static void configure(Context context) {
        Amplify.configure(context);
    }

    public static <P extends Plugin<?>> void removePlugin(P p) {
        Amplify.removePlugin(p);
    }

    public static void configure(AmplifyConfiguration amplifyConfiguration, Context context) {
        Amplify.configure(amplifyConfiguration, context);
    }

    public static void configure(AmplifyOutputs amplifyOutputs, Context context) {
        Amplify.configure(amplifyOutputs, context);
    }
}
