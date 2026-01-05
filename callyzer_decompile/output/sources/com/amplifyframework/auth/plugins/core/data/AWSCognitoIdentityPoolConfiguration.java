package com.amplifyframework.auth.plugins.core.data;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoIdentityPoolConfiguration {
    private final String poolId;
    private final String region;

    public AWSCognitoIdentityPoolConfiguration(String poolId, String region) {
        AbstractC4154l.m8923f(poolId, "poolId");
        AbstractC4154l.m8923f(region, "region");
        this.poolId = poolId;
        this.region = region;
    }

    public static /* synthetic */ AWSCognitoIdentityPoolConfiguration copy$default(AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aWSCognitoIdentityPoolConfiguration.poolId;
        }
        if ((i10 & 2) != 0) {
            str2 = aWSCognitoIdentityPoolConfiguration.region;
        }
        return aWSCognitoIdentityPoolConfiguration.copy(str, str2);
    }

    public final String component1() {
        return this.poolId;
    }

    public final String component2() {
        return this.region;
    }

    public final AWSCognitoIdentityPoolConfiguration copy(String poolId, String region) {
        AbstractC4154l.m8923f(poolId, "poolId");
        AbstractC4154l.m8923f(region, "region");
        return new AWSCognitoIdentityPoolConfiguration(poolId, region);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoIdentityPoolConfiguration)) {
            return false;
        }
        AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration = (AWSCognitoIdentityPoolConfiguration) obj;
        return AbstractC4154l.m8918a(this.poolId, aWSCognitoIdentityPoolConfiguration.poolId) && AbstractC4154l.m8918a(this.region, aWSCognitoIdentityPoolConfiguration.region);
    }

    public final String getPoolId() {
        return this.poolId;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode() + (this.poolId.hashCode() * 31);
    }

    public String toString() {
        return a1.m14333m("AWSCognitoIdentityPoolConfiguration(poolId=", this.poolId, ", region=", this.region, ")");
    }

    public /* synthetic */ AWSCognitoIdentityPoolConfiguration(String str, String str2, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? "us-east-1" : str2);
    }
}
