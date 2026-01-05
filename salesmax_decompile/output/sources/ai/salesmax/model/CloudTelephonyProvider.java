package ai.salesmax.model;

import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CloudTelephonyProvider {
    public static final int $stable = 8;
    private String description;
    private String id;
    private boolean isSelected;
    private String name;

    public CloudTelephonyProvider() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ CloudTelephonyProvider copy$default(CloudTelephonyProvider cloudTelephonyProvider, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudTelephonyProvider.id;
        }
        if ((i & 2) != 0) {
            str2 = cloudTelephonyProvider.description;
        }
        if ((i & 4) != 0) {
            str3 = cloudTelephonyProvider.name;
        }
        if ((i & 8) != 0) {
            z = cloudTelephonyProvider.isSelected;
        }
        return cloudTelephonyProvider.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.name;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final CloudTelephonyProvider copy(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str3, "name");
        return new CloudTelephonyProvider(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudTelephonyProvider)) {
            return false;
        }
        CloudTelephonyProvider cloudTelephonyProvider = (CloudTelephonyProvider) obj;
        return sq8.m48644c(this.id, cloudTelephonyProvider.id) && sq8.m48644c(this.description, cloudTelephonyProvider.description) && sq8.m48644c(this.name, cloudTelephonyProvider.name) && this.isSelected == cloudTelephonyProvider.isSelected;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.description.hashCode()) * 31) + this.name.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "CloudTelephonyProvider(id=" + this.id + ", description=" + this.description + ", name=" + this.name + ", isSelected=" + this.isSelected + ")";
    }

    public CloudTelephonyProvider(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str3, "name");
        this.id = str;
        this.description = str2;
        this.name = str3;
        this.isSelected = z;
    }

    public /* synthetic */ CloudTelephonyProvider(String str, String str2, String str3, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}
