package com.amplifyframework.datastore;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.logging.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class DataStoreConfiguration {
    static final boolean DEFAULT_DO_SYNC_RETRY = false;
    static final int DEFAULT_SYNC_MAX_CONCURRENT_MODELS = 1;
    static final int DEFAULT_SYNC_MAX_RECORDS = 10000;
    static final int DEFAULT_SYNC_PAGE_SIZE = 1000;
    static final int MAX_RECORDS = 1000;
    static final long MAX_TIME_SEC = 2;
    static final String PLUGIN_CONFIG_KEY = "awsDataStorePlugin";
    private final DataStoreConflictHandler conflictHandler;
    private final boolean doSyncRetry;
    private final DataStoreErrorHandler errorHandler;
    private final Long maxTimeLapseForObserveQuery;
    private final Integer observeQueryMaxRecords;
    private final Map<String, DataStoreSyncExpression> syncExpressions;
    private final Long syncIntervalInMinutes;
    private final Integer syncMaxConcurrentModels;
    private final Integer syncMaxRecords;
    private final Integer syncPageSize;
    static final long DEFAULT_SYNC_INTERVAL_MINUTES = TimeUnit.DAYS.toMinutes(1);
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");

    /* renamed from: com.amplifyframework.datastore.DataStoreConfiguration$1 */
    public static /* synthetic */ class C105561 {

        /* renamed from: $SwitchMap$com$amplifyframework$datastore$DataStoreConfiguration$ConfigKey */
        static final /* synthetic */ int[] f10642xfc874f7c;

        static {
            int[] iArr = new int[ConfigKey.values().length];
            f10642xfc874f7c = iArr;
            try {
                iArr[ConfigKey.SYNC_INTERVAL_IN_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10642xfc874f7c[ConfigKey.SYNC_MAX_RECORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10642xfc874f7c[ConfigKey.SYNC_PAGE_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum ConfigKey {
        SYNC_INTERVAL_IN_MINUTES("syncIntervalInMinutes"),
        SYNC_PAGE_SIZE("syncPageSize"),
        SYNC_MAX_RECORDS("syncMaxRecords");

        private final String key;

        ConfigKey(String str) {
            this.key = str;
        }

        public static ConfigKey fromString(String str) {
            for (ConfigKey configKey : values()) {
                if (configKey.toString().equals(str)) {
                    return configKey;
                }
            }
            throw new IllegalArgumentException(str + " is not a config key.");
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.key;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataStoreConfiguration defaults() {
        return builder().errorHandler(DefaultDataStoreErrorHandler.instance()).conflictHandler(DataStoreConflictHandler.alwaysApplyRemote()).syncInterval(DEFAULT_SYNC_INTERVAL_MINUTES, TimeUnit.MINUTES).syncPageSize(1000).syncMaxRecords(10000).doSyncRetry(false).observeQueryMaxTime(2L).observeQueryMaxRecords(1000).syncMaxConcurrentModels(1).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DataStoreConfiguration.class != obj.getClass()) {
            return false;
        }
        DataStoreConfiguration dataStoreConfiguration = (DataStoreConfiguration) obj;
        return s6c.m47909a(getErrorHandler(), dataStoreConfiguration.getConflictHandler()) && s6c.m47909a(getConflictHandler(), dataStoreConfiguration.getConflictHandler()) && s6c.m47909a(getSyncMaxRecords(), dataStoreConfiguration.getSyncMaxRecords()) && s6c.m47909a(getSyncPageSize(), dataStoreConfiguration.getSyncPageSize()) && s6c.m47909a(getSyncIntervalInMinutes(), dataStoreConfiguration.getSyncIntervalInMinutes()) && s6c.m47909a(getSyncExpressions(), dataStoreConfiguration.getSyncExpressions()) && s6c.m47909a(getDoSyncRetry(), dataStoreConfiguration.getDoSyncRetry()) && s6c.m47909a(getMaxTimeLapseForObserveQuery(), dataStoreConfiguration.getMaxTimeLapseForObserveQuery()) && s6c.m47909a(getObserveQueryMaxRecords(), dataStoreConfiguration.getObserveQueryMaxRecords()) && s6c.m47909a(getSyncMaxConcurrentModels(), dataStoreConfiguration.getSyncMaxConcurrentModels());
    }

    public DataStoreConflictHandler getConflictHandler() {
        return this.conflictHandler;
    }

    public Boolean getDoSyncRetry() {
        return Boolean.valueOf(this.doSyncRetry);
    }

    public DataStoreErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public Long getMaxTimeLapseForObserveQuery() {
        return this.maxTimeLapseForObserveQuery;
    }

    public Integer getObserveQueryMaxRecords() {
        return this.observeQueryMaxRecords;
    }

    public Map<String, DataStoreSyncExpression> getSyncExpressions() {
        return this.syncExpressions;
    }

    public Long getSyncIntervalInMinutes() {
        return this.syncIntervalInMinutes;
    }

    public Long getSyncIntervalMs() {
        return Long.valueOf(TimeUnit.MINUTES.toMillis(this.syncIntervalInMinutes.longValue()));
    }

    public Integer getSyncMaxConcurrentModels() {
        return this.syncMaxConcurrentModels;
    }

    public Integer getSyncMaxRecords() {
        return this.syncMaxRecords;
    }

    public Integer getSyncPageSize() {
        return this.syncPageSize;
    }

    public int hashCode() {
        return ((((((((((((((((((getErrorHandler() != null ? getErrorHandler().hashCode() : 0) * 31) + (getConflictHandler() != null ? getConflictHandler().hashCode() : 0)) * 31) + (getSyncMaxRecords() != null ? getSyncMaxRecords().hashCode() : 0)) * 31) + (getSyncPageSize() != null ? getSyncPageSize().hashCode() : 0)) * 31) + (getSyncIntervalInMinutes() != null ? getSyncIntervalInMinutes().hashCode() : 0)) * 31) + (getSyncExpressions() != null ? getSyncExpressions().hashCode() : 0)) * 31) + getDoSyncRetry().hashCode()) * 31) + (getObserveQueryMaxRecords() != null ? getObserveQueryMaxRecords().hashCode() : 0)) * 31) + getMaxTimeLapseForObserveQuery().hashCode()) * 31) + getSyncMaxConcurrentModels().hashCode();
    }

    public String toString() {
        return "DataStoreConfiguration{errorHandler=" + this.errorHandler + ", conflictHandler=" + this.conflictHandler + ", syncMaxRecords=" + this.syncMaxRecords + ", syncPageSize=" + this.syncPageSize + ", syncIntervalInMinutes=" + this.syncIntervalInMinutes + ", syncExpressions=" + this.syncExpressions + ", doSyncRetry=" + this.doSyncRetry + ", maxTimeRelapseForObserveQuery=" + this.maxTimeLapseForObserveQuery + ", observeQueryMaxRecords=" + this.observeQueryMaxRecords + ", syncMaxConcurrentModels=" + this.syncMaxConcurrentModels + '}';
    }

    public static final class Builder {
        private DataStoreConflictHandler conflictHandler;
        private boolean doSyncRetry;
        private boolean ensureDefaults;
        private DataStoreErrorHandler errorHandler;
        private long maxTimeLapseForObserveQuery;
        private Integer observeQueryMaxRecords;
        private JSONObject pluginJson;
        private Map<String, DataStoreSyncExpression> syncExpressions;
        private Long syncIntervalInMinutes;
        private Integer syncMaxConcurrentModels;
        private Integer syncMaxRecords;
        private Integer syncPageSize;
        private DataStoreConfiguration userProvidedConfiguration;

        private void applyUserProvidedConfiguration() {
            DataStoreConfiguration dataStoreConfiguration = this.userProvidedConfiguration;
            if (dataStoreConfiguration == null) {
                return;
            }
            this.errorHandler = dataStoreConfiguration.getErrorHandler();
            this.conflictHandler = this.userProvidedConfiguration.getConflictHandler();
            this.syncIntervalInMinutes = (Long) getValueOrDefault(this.userProvidedConfiguration.getSyncIntervalInMinutes(), this.syncIntervalInMinutes);
            this.syncMaxRecords = (Integer) getValueOrDefault(this.userProvidedConfiguration.getSyncMaxRecords(), this.syncMaxRecords);
            this.syncPageSize = (Integer) getValueOrDefault(this.userProvidedConfiguration.getSyncPageSize(), this.syncPageSize);
            this.syncExpressions = this.userProvidedConfiguration.getSyncExpressions();
            this.doSyncRetry = ((Boolean) getValueOrDefault(this.userProvidedConfiguration.getDoSyncRetry(), Boolean.valueOf(this.doSyncRetry))).booleanValue();
            this.syncMaxConcurrentModels = (Integer) getValueOrDefault(this.userProvidedConfiguration.getSyncMaxConcurrentModels(), this.syncMaxConcurrentModels);
            this.observeQueryMaxRecords = (Integer) getValueOrDefault(this.userProvidedConfiguration.getObserveQueryMaxRecords(), this.observeQueryMaxRecords);
            this.maxTimeLapseForObserveQuery = this.userProvidedConfiguration.getMaxTimeLapseForObserveQuery().longValue() == 0 ? this.maxTimeLapseForObserveQuery : this.userProvidedConfiguration.getMaxTimeLapseForObserveQuery().longValue();
        }

        private static <T> T getValueOrDefault(T t, T t2) {
            return t == null ? t2 : t;
        }

        private void populateSettingsFromJson() throws DataStoreException {
            JSONObject jSONObject = this.pluginJson;
            if (jSONObject == null) {
                return;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    ConfigKey configKeyFromString = ConfigKey.fromString(next);
                    try {
                        int i = C105561.f10642xfc874f7c[configKeyFromString.ordinal()];
                        if (i == 1) {
                            syncInterval(this.pluginJson.getLong(ConfigKey.SYNC_INTERVAL_IN_MINUTES.toString()), TimeUnit.MINUTES);
                        } else if (i == 2) {
                            syncMaxRecords(Integer.valueOf(this.pluginJson.getInt(ConfigKey.SYNC_MAX_RECORDS.toString())));
                        } else {
                            if (i != 3) {
                                throw new IllegalArgumentException("Unsupported config key = " + configKeyFromString.toString());
                            }
                            syncPageSize(Integer.valueOf(this.pluginJson.getInt(ConfigKey.SYNC_PAGE_SIZE.toString())));
                        }
                    } catch (JSONException e) {
                        throw new DataStoreException("Issue encountered while parsing configuration JSON", e, "Ensure your amplifyconfiguration.json is valid.");
                    }
                } catch (IllegalArgumentException unused) {
                    throw new DataStoreException("Saw unexpected config key: " + next, "Make sure your amplifyconfiguration.json is valid.");
                }
            }
        }

        public DataStoreConfiguration build() throws DataStoreException {
            populateSettingsFromJson();
            applyUserProvidedConfiguration();
            if (this.ensureDefaults) {
                this.errorHandler = (DataStoreErrorHandler) getValueOrDefault(this.errorHandler, DefaultDataStoreErrorHandler.instance());
                this.conflictHandler = (DataStoreConflictHandler) getValueOrDefault(this.conflictHandler, DataStoreConflictHandler.alwaysApplyRemote());
                this.syncIntervalInMinutes = (Long) getValueOrDefault(this.syncIntervalInMinutes, Long.valueOf(DataStoreConfiguration.DEFAULT_SYNC_INTERVAL_MINUTES));
                this.syncMaxRecords = (Integer) getValueOrDefault(this.syncMaxRecords, 10000);
                this.syncPageSize = (Integer) getValueOrDefault(this.syncPageSize, 1000);
                this.syncMaxConcurrentModels = (Integer) getValueOrDefault(this.syncMaxConcurrentModels, 1);
                this.observeQueryMaxRecords = (Integer) getValueOrDefault(this.observeQueryMaxRecords, 1000);
                long j = this.maxTimeLapseForObserveQuery;
                if (j == 0) {
                    j = 2;
                }
                this.maxTimeLapseForObserveQuery = j;
            }
            return new DataStoreConfiguration(this);
        }

        public Builder conflictHandler(DataStoreConflictHandler dataStoreConflictHandler) {
            Objects.requireNonNull(dataStoreConflictHandler);
            this.conflictHandler = dataStoreConflictHandler;
            return this;
        }

        @Deprecated
        public Builder doSyncRetry(boolean z) {
            DataStoreConfiguration.LOG.warn("The doSyncRetry configuration will be deprecated in a future version. Please discontinue use of this API.");
            this.doSyncRetry = z;
            return this;
        }

        public Builder errorHandler(DataStoreErrorHandler dataStoreErrorHandler) {
            Objects.requireNonNull(dataStoreErrorHandler);
            this.errorHandler = dataStoreErrorHandler;
            return this;
        }

        public Builder observeQueryMaxRecords(Integer num) {
            this.observeQueryMaxRecords = num;
            return this;
        }

        public Builder observeQueryMaxTime(long j) {
            this.maxTimeLapseForObserveQuery = j;
            return this;
        }

        public Builder syncExpression(Class<? extends Model> cls, DataStoreSyncExpression dataStoreSyncExpression) {
            Map<String, DataStoreSyncExpression> map = this.syncExpressions;
            Objects.requireNonNull(cls);
            String simpleName = cls.getSimpleName();
            Objects.requireNonNull(dataStoreSyncExpression);
            map.put(simpleName, dataStoreSyncExpression);
            return this;
        }

        public Builder syncInterval(long j, TimeUnit timeUnit) {
            this.syncIntervalInMinutes = Long.valueOf(timeUnit.toMinutes(j));
            return this;
        }

        public Builder syncMaxConcurrentModels(Integer num) {
            this.syncMaxConcurrentModels = num;
            return this;
        }

        public Builder syncMaxRecords(Integer num) {
            this.syncMaxRecords = num;
            return this;
        }

        public Builder syncPageSize(Integer num) {
            this.syncPageSize = num;
            return this;
        }

        private Builder() {
            this.errorHandler = DefaultDataStoreErrorHandler.instance();
            this.conflictHandler = DataStoreConflictHandler.alwaysApplyRemote();
            this.syncExpressions = new HashMap();
            this.ensureDefaults = false;
        }

        public Builder syncExpression(String str, DataStoreSyncExpression dataStoreSyncExpression) {
            Map<String, DataStoreSyncExpression> map = this.syncExpressions;
            Objects.requireNonNull(str);
            Objects.requireNonNull(dataStoreSyncExpression);
            map.put(str, dataStoreSyncExpression);
            return this;
        }

        private Builder(JSONObject jSONObject, DataStoreConfiguration dataStoreConfiguration) {
            this();
            this.pluginJson = jSONObject;
            this.userProvidedConfiguration = dataStoreConfiguration;
            this.ensureDefaults = true;
        }
    }

    private DataStoreConfiguration(Builder builder) {
        this.errorHandler = builder.errorHandler;
        this.conflictHandler = builder.conflictHandler;
        this.syncMaxRecords = builder.syncMaxRecords;
        this.syncPageSize = builder.syncPageSize;
        this.syncIntervalInMinutes = builder.syncIntervalInMinutes;
        this.syncExpressions = builder.syncExpressions;
        this.doSyncRetry = builder.doSyncRetry;
        this.syncMaxConcurrentModels = Integer.valueOf(builder.syncMaxConcurrentModels != null ? builder.syncMaxConcurrentModels.intValue() : 1);
        this.maxTimeLapseForObserveQuery = Long.valueOf(builder.maxTimeLapseForObserveQuery);
        this.observeQueryMaxRecords = builder.observeQueryMaxRecords;
    }

    public static Builder builder(JSONObject jSONObject, DataStoreConfiguration dataStoreConfiguration) {
        return new Builder(jSONObject, dataStoreConfiguration);
    }

    public static Builder builder(JSONObject jSONObject) {
        return builder(jSONObject, null);
    }
}
