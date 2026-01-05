package ai.salesmax.model;

import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class Recordingapp {
    public static final int $stable = 8;
    private String description;
    private String id;
    private boolean isSelected;
    private String name;

    public Recordingapp() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ Recordingapp copy$default(Recordingapp recordingapp, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordingapp.id;
        }
        if ((i & 2) != 0) {
            str2 = recordingapp.description;
        }
        if ((i & 4) != 0) {
            str3 = recordingapp.name;
        }
        if ((i & 8) != 0) {
            z = recordingapp.isSelected;
        }
        return recordingapp.copy(str, str2, str3, z);
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

    public final Recordingapp copy(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str3, "name");
        return new Recordingapp(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recordingapp)) {
            return false;
        }
        Recordingapp recordingapp = (Recordingapp) obj;
        return sq8.m48644c(this.id, recordingapp.id) && sq8.m48644c(this.description, recordingapp.description) && sq8.m48644c(this.name, recordingapp.name) && this.isSelected == recordingapp.isSelected;
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
        return "Recordingapp(id=" + this.id + ", description=" + this.description + ", name=" + this.name + ", isSelected=" + this.isSelected + ")";
    }

    public Recordingapp(String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str3, "name");
        this.id = str;
        this.description = str2;
        this.name = str3;
        this.isSelected = z;
    }

    public /* synthetic */ Recordingapp(String str, String str2, String str3, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}
