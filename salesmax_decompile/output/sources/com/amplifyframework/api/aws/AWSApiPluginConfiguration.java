package com.amplifyframework.api.aws;

import android.annotation.SuppressLint;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSApiPluginConfiguration {
    private final Map<String, ApiConfiguration> apiDetails;

    public static final class Builder {
        private Map<String, ApiConfiguration> apiDetails;

        public Builder addApi(String str, ApiConfiguration apiConfiguration) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(apiConfiguration);
            this.apiDetails.put(str, apiConfiguration);
            return this;
        }

        @SuppressLint({"SyntheticAccessor"})
        public AWSApiPluginConfiguration build() {
            return new AWSApiPluginConfiguration(this.apiDetails);
        }

        private Builder() {
            this.apiDetails = new HashMap();
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSApiPluginConfiguration.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(this.apiDetails, ((AWSApiPluginConfiguration) obj).apiDetails);
    }

    public ApiConfiguration getApi(String str) {
        return this.apiDetails.get(str);
    }

    public Map<String, ApiConfiguration> getApis() {
        return Immutable.of(this.apiDetails);
    }

    public int hashCode() {
        return this.apiDetails.hashCode();
    }

    private AWSApiPluginConfiguration(Map<String, ApiConfiguration> map) {
        HashMap map2 = new HashMap();
        this.apiDetails = map2;
        map2.putAll(map);
    }
}
