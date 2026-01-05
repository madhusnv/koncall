package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.annotations.InternalAmplifyApi;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.json.JSONException;
import org.json.JSONObject;
import p020v.a1;
import pg.b8;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class IdentityPoolConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_REGION = "us-east-1";
    private final String poolId;
    private final String region;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
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

        public final Builder poolId(String poolId) {
            AbstractC4154l.m8923f(poolId, "poolId");
            this.poolId = poolId;
            return this;
        }

        public final Builder region(String region) {
            AbstractC4154l.m8923f(region, "region");
            this.region = region;
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
                boolean z6 = true;
                this.region = strOptString == null || strOptString.length() == 0 ? null : strOptString;
                String strOptString2 = jSONObject.optString(Config.POOL_ID.getKey());
                if (strOptString2 != null && strOptString2.length() != 0) {
                    z6 = false;
                }
                this.poolId = z6 ? null : strOptString2;
            }
        }

        public /* synthetic */ Builder(JSONObject jSONObject, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? null : jSONObject);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder builder() {
            return new Builder(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder fromJson(JSONObject configJson) {
            AbstractC4154l.m8923f(configJson, "configJson");
            return new Builder(configJson);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final IdentityPoolConfiguration invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            Builder builder = new Builder(null, 1, 0 == true ? 1 : 0);
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Config {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
            $ENTRIES = b8.m11548b(configArr$values);
        }

        private Config(String str, int i10, String str2) {
            this.key = str2;
        }

        public static InterfaceC8493a getEntries() {
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

    public static /* synthetic */ IdentityPoolConfiguration copy$aws_auth_cognito_release$default(IdentityPoolConfiguration identityPoolConfiguration, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = identityPoolConfiguration.region;
        }
        if ((i10 & 2) != 0) {
            str2 = identityPoolConfiguration.poolId;
        }
        return identityPoolConfiguration.copy$aws_auth_cognito_release(str, str2);
    }

    public final String component1() {
        return this.region;
    }

    public final String component2() {
        return this.poolId;
    }

    public final IdentityPoolConfiguration copy$aws_auth_cognito_release(String str, String str2) {
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
        return AbstractC4154l.m8918a(this.region, identityPoolConfiguration.region) && AbstractC4154l.m8918a(this.poolId, identityPoolConfiguration.poolId);
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
        return a1.m14333m("IdentityPoolConfiguration(region=", this.region, ", poolId=", this.poolId, ")");
    }
}
