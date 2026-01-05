package com.amplifyframework.auth.plugins.core.data;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSCognitoIdentityPoolConfiguration {
    private final String poolId;
    private final String region;

    public AWSCognitoIdentityPoolConfiguration(String str, String str2) {
        sq8.m48649h(str, "poolId");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        this.poolId = str;
        this.region = str2;
    }

    public static /* synthetic */ AWSCognitoIdentityPoolConfiguration copy$default(AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSCognitoIdentityPoolConfiguration.poolId;
        }
        if ((i & 2) != 0) {
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

    public final AWSCognitoIdentityPoolConfiguration copy(String str, String str2) {
        sq8.m48649h(str, "poolId");
        sq8.m48649h(str2, TransferTable.COLUMN_REGION);
        return new AWSCognitoIdentityPoolConfiguration(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoIdentityPoolConfiguration)) {
            return false;
        }
        AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration = (AWSCognitoIdentityPoolConfiguration) obj;
        return sq8.m48644c(this.poolId, aWSCognitoIdentityPoolConfiguration.poolId) && sq8.m48644c(this.region, aWSCognitoIdentityPoolConfiguration.region);
    }

    public final String getPoolId() {
        return this.poolId;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (this.poolId.hashCode() * 31) + this.region.hashCode();
    }

    public String toString() {
        return "AWSCognitoIdentityPoolConfiguration(poolId=" + this.poolId + ", region=" + this.region + ")";
    }

    public /* synthetic */ AWSCognitoIdentityPoolConfiguration(String str, String str2, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? "us-east-1" : str2);
    }
}
