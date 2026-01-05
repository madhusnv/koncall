package ai.salesmax.model;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.sq8;

/* loaded from: classes.dex */
public final class DistributionData {
    public static final int $stable = 0;
    private final String id;
    private final String name;

    public DistributionData(String str, String str2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        this.id = str;
        this.name = str2;
    }

    public static /* synthetic */ DistributionData copy$default(DistributionData distributionData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = distributionData.id;
        }
        if ((i & 2) != 0) {
            str2 = distributionData.name;
        }
        return distributionData.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final DistributionData copy(String str, String str2) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        return new DistributionData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionData)) {
            return false;
        }
        DistributionData distributionData = (DistributionData) obj;
        return sq8.m48644c(this.id, distributionData.id) && sq8.m48644c(this.name, distributionData.name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "DistributionData(id=" + this.id + ", name=" + this.name + ")";
    }
}
