package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.gi6;
import p001o.hi6;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class IdentityPoolConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_REGION = "us-east-1";
    private final String poolId;
    private final String region;

    public static final class Builder {
        private String poolId;
        private String region;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final IdentityPoolConfiguration build() {
            return new IdentityPoolConfiguration(this.region, this.poolId);
        }

        public final String getPoolId() {
            return this.poolId;
        }

        public final String getRegion() {
            return this.region;
        }

        public final Builder poolId(String str) {
            sq8.m48649h(str, "poolId");
            this.poolId = str;
            return this;
        }

        public final Builder region(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_REGION);
            this.region = str;
            return this;
        }

        public final void setPoolId(String str) {
            this.poolId = str;
        }

        public final void setRegion(String str) {
            this.region = str;
        }

        public Builder(JSONObject jSONObject) {
            this.region = IdentityPoolConfiguration.DEFAULT_REGION;
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Config.REGION.getKey());
                this.region = Boolean.valueOf(strOptString == null || strOptString.length() == 0).booleanValue() ? null : strOptString;
                String strOptString2 = jSONObject.optString(Config.POOL_ID.getKey());
                this.poolId = Boolean.valueOf(strOptString2 == null || strOptString2.length() == 0).booleanValue() ? null : strOptString2;
            }
        }

        public /* synthetic */ Builder(JSONObject jSONObject, int i, id5 id5Var) {
            this((i & 1) != 0 ? null : jSONObject);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder builder() {
            return new Builder(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder fromJson(JSONObject jSONObject) {
            sq8.m48649h(jSONObject, "configJson");
            return new Builder(jSONObject);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final IdentityPoolConfiguration invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            Builder builder = new Builder(null, 1, 0 == true ? 1 : 0);
            xk7Var.invoke(builder);
            return builder.build();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Config {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ Config[] $VALUES;
        private final String key;
        public static final Config REGION = new Config("REGION", 0, "Region");
        public static final Config POOL_ID = new Config("POOL_ID", 1, "PoolId");

        private static final /* synthetic */ Config[] $values() {
            return new Config[]{REGION, POOL_ID};
        }

        static {
            Config[] configArr$values = $values();
            $VALUES = configArr$values;
            $ENTRIES = hi6.m30609a(configArr$values);
        }

        private Config(String str, int i, String str2) {
            this.key = str2;
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static Config valueOf(String str) {
            return (Config) Enum.valueOf(Config.class, str);
        }

        public static Config[] values() {
            return (Config[]) $VALUES.clone();
        }

        public final String getKey() {
            return this.key;
        }
    }

    public IdentityPoolConfiguration(String str, String str2) {
        this.region = str;
        this.poolId = str2;
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public static /* synthetic */ IdentityPoolConfiguration copy$default(IdentityPoolConfiguration identityPoolConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identityPoolConfiguration.region;
        }
        if ((i & 2) != 0) {
            str2 = identityPoolConfiguration.poolId;
        }
        return identityPoolConfiguration.copy(str, str2);
    }

    public final String component1() {
        return this.region;
    }

    public final String component2() {
        return this.poolId;
    }

    public final IdentityPoolConfiguration copy(String str, String str2) {
        return new IdentityPoolConfiguration(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityPoolConfiguration)) {
            return false;
        }
        IdentityPoolConfiguration identityPoolConfiguration = (IdentityPoolConfiguration) obj;
        return sq8.m48644c(this.region, identityPoolConfiguration.region) && sq8.m48644c(this.poolId, identityPoolConfiguration.poolId);
    }

    public final String getPoolId() {
        return this.poolId;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        String str = this.region;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.poolId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final JSONObject toGen1Json$aws_auth_cognito_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.region;
        if (str != null) {
            jSONObject.put(Config.REGION.getKey(), str);
        }
        String str2 = this.poolId;
        if (str2 != null) {
            jSONObject.put(Config.POOL_ID.getKey(), str2);
        }
        return jSONObject;
    }

    public String toString() {
        return "IdentityPoolConfiguration(region=" + this.region + ", poolId=" + this.poolId + ")";
    }
}
