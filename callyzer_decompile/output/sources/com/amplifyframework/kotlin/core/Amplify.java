package com.amplifyframework.kotlin.core;

import android.content.Context;
import com.amplifyframework.analytics.AnalyticsCategory;
import com.amplifyframework.core.AmplifyConfiguration;
import com.amplifyframework.core.configuration.AmplifyOutputs;
import com.amplifyframework.core.plugin.Plugin;
import com.amplifyframework.kotlin.api.KotlinApiFacade;
import com.amplifyframework.kotlin.auth.KotlinAuthFacade;
import com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade;
import com.amplifyframework.kotlin.geo.KotlinGeoFacade;
import com.amplifyframework.kotlin.hub.KotlinHubFacade;
import com.amplifyframework.kotlin.notifications.KotlinNotificationsFacade;
import com.amplifyframework.kotlin.predictions.KotlinPredictionsFacade;
import com.amplifyframework.kotlin.storage.KotlinStorageFacade;
import com.amplifyframework.logging.LoggingCategory;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Amplify {
    private static final KotlinApiFacade API;
    private static final AnalyticsCategory Analytics;
    private static final KotlinAuthFacade Auth;
    public static final Companion Companion = new Companion(null);
    private static final KotlinDataStoreFacade DataStore;
    private static final KotlinGeoFacade Geo;
    private static final KotlinHubFacade Hub;
    private static final LoggingCategory Logging;
    private static final KotlinNotificationsFacade Notifications;
    private static final KotlinPredictionsFacade Predictions;
    private static final KotlinStorageFacade Storage;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final <P extends Plugin<?>> void addPlugin(P plugin) {
            AbstractC4154l.m8923f(plugin, "plugin");
            com.amplifyframework.core.Amplify.addPlugin(plugin);
        }

        public final void configure(Context context) {
            AbstractC4154l.m8923f(context, "context");
            com.amplifyframework.core.Amplify.configure(context);
        }

        public final KotlinApiFacade getAPI() {
            return Amplify.API;
        }

        public final AnalyticsCategory getAnalytics() {
            return Amplify.Analytics;
        }

        public final KotlinAuthFacade getAuth() {
            return Amplify.Auth;
        }

        public final KotlinDataStoreFacade getDataStore() {
            return Amplify.DataStore;
        }

        public final KotlinGeoFacade getGeo() {
            return Amplify.Geo;
        }

        public final KotlinHubFacade getHub() {
            return Amplify.Hub;
        }

        public final LoggingCategory getLogging() {
            return Amplify.Logging;
        }

        public final KotlinNotificationsFacade getNotifications() {
            return Amplify.Notifications;
        }

        public final KotlinPredictionsFacade getPredictions() {
            return Amplify.Predictions;
        }

        public final KotlinStorageFacade getStorage() {
            return Amplify.Storage;
        }

        public final <P extends Plugin<?>> void removePlugin(P plugin) {
            AbstractC4154l.m8923f(plugin, "plugin");
            com.amplifyframework.core.Amplify.removePlugin(plugin);
        }

        private Companion() {
        }

        public final void configure(AmplifyConfiguration configuration, Context context) {
            AbstractC4154l.m8923f(configuration, "configuration");
            AbstractC4154l.m8923f(context, "context");
            com.amplifyframework.core.Amplify.configure(configuration, context);
        }

        public final void configure(AmplifyOutputs amplifyOutputs, Context context) {
            AbstractC4154l.m8923f(amplifyOutputs, "amplifyOutputs");
            AbstractC4154l.m8923f(context, "context");
            com.amplifyframework.core.Amplify.configure(amplifyOutputs, context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AnalyticsCategory Analytics2 = com.amplifyframework.core.Amplify.Analytics;
        AbstractC4154l.m8922e(Analytics2, "Analytics");
        Analytics = Analytics2;
        int i10 = 1;
        API = new KotlinApiFacade(null, 1, null);
        Auth = new KotlinAuthFacade(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        Geo = new KotlinGeoFacade(null, 1, null);
        LoggingCategory Logging2 = com.amplifyframework.core.Amplify.Logging;
        AbstractC4154l.m8922e(Logging2, "Logging");
        Logging = Logging2;
        Storage = new KotlinStorageFacade(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        Hub = new KotlinHubFacade(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        DataStore = new KotlinDataStoreFacade(null, 1, null);
        Predictions = new KotlinPredictionsFacade(null, 1, null);
        Notifications = new KotlinNotificationsFacade(null, 1, null);
    }
}
