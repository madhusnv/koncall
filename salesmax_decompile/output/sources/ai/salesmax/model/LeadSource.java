package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Locale;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class LeadSource extends yfe implements Parcelable {
    private String description;
    private String displayName;
    private String id;
    private boolean isSelected;
    private String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LeadSource> CREATOR = new Creator();
    private static final String LEADSOURCE_NAME_FACEBOOK = "FACEBOOK";
    private static final String LEADSOURCE_NAME_INSTAGRAM = "INSTAGRAM";
    private static final String LEADSOURCE_NAME_INDIAMART = "indiamart";
    private static final String LEADSOURCE_NAME_CONTACT_FORM = "WEBFORM";
    private static final String LEADSOURCE_NAME_WHATSAPP_BUSINESS = "WHATSAPP_BUSINESS_LOGIN";
    private static final String LEADSOURCE_NAME_WHATSAPP = "WHATSAPP";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final String getLEADSOURCE_NAME_CONTACT_FORM() {
            return LeadSource.LEADSOURCE_NAME_CONTACT_FORM;
        }

        public final String getLEADSOURCE_NAME_FACEBOOK() {
            return LeadSource.LEADSOURCE_NAME_FACEBOOK;
        }

        public final String getLEADSOURCE_NAME_INDIAMART() {
            return LeadSource.LEADSOURCE_NAME_INDIAMART;
        }

        public final String getLEADSOURCE_NAME_INSTAGRAM() {
            return LeadSource.LEADSOURCE_NAME_INSTAGRAM;
        }

        public final String getLEADSOURCE_NAME_WHATSAPP() {
            return LeadSource.LEADSOURCE_NAME_WHATSAPP;
        }

        public final String getLEADSOURCE_NAME_WHATSAPP_BUSINESS() {
            return LeadSource.LEADSOURCE_NAME_WHATSAPP_BUSINESS;
        }

        public final List<String> relatedLeadSources(String str) {
            sq8.m48649h(str, "leadSource");
            String leadsource_name_facebook = getLEADSOURCE_NAME_FACEBOOK();
            Locale locale = Locale.ROOT;
            String lowerCase = leadsource_name_facebook.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(locale);
            sq8.m48648g(lowerCase2, "toLowerCase(...)");
            if (!lowerCase.equals(lowerCase2)) {
                String lowerCase3 = getLEADSOURCE_NAME_INSTAGRAM().toLowerCase(locale);
                sq8.m48648g(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = str.toLowerCase(locale);
                sq8.m48648g(lowerCase4, "toLowerCase(...)");
                if (!lowerCase3.equals(lowerCase4)) {
                    String lowerCase5 = getLEADSOURCE_NAME_WHATSAPP_BUSINESS().toLowerCase(locale);
                    sq8.m48648g(lowerCase5, "toLowerCase(...)");
                    String lowerCase6 = str.toLowerCase(locale);
                    sq8.m48648g(lowerCase6, "toLowerCase(...)");
                    return lowerCase5.equals(lowerCase6) ? ch3.m21242g(getLEADSOURCE_NAME_WHATSAPP()) : ch3.m21242g(str);
                }
            }
            return ch3.m21242g(getLEADSOURCE_NAME_FACEBOOK(), getLEADSOURCE_NAME_INSTAGRAM());
        }
    }

    public static final class Creator implements Parcelable.Creator<LeadSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadSource createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new LeadSource(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadSource[] newArray(int i) {
            return new LeadSource[i];
        }
    }

    public LeadSource() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ LeadSource copy$default(LeadSource leadSource, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadSource.id;
        }
        if ((i & 2) != 0) {
            str2 = leadSource.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = leadSource.displayName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = leadSource.description;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = leadSource.isSelected;
        }
        return leadSource.copy(str, str5, str6, str7, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.displayName;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.isSelected;
    }

    public final LeadSource copy(String str, String str2, String str3, String str4, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, "displayName");
        sq8.m48649h(str4, MediaTrack.ROLE_DESCRIPTION);
        return new LeadSource(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadSource)) {
            return false;
        }
        LeadSource leadSource = (LeadSource) obj;
        return sq8.m48644c(this.id, leadSource.id) && sq8.m48644c(this.name, leadSource.name) && sq8.m48644c(this.displayName, leadSource.displayName) && sq8.m48644c(this.description, leadSource.description) && this.isSelected == leadSource.isSelected;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.description.hashCode()) * 31;
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

    public final void setDisplayName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.displayName = str;
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
        return "LeadSource(id=" + this.id + ", name=" + this.name + ", displayName=" + this.displayName + ", description=" + this.description + ", isSelected=" + this.isSelected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.displayName);
        parcel.writeString(this.description);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ LeadSource(String str, String str2, String str3, String str4, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z);
    }

    public LeadSource(String str, String str2, String str3, String str4, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, "displayName");
        sq8.m48649h(str4, MediaTrack.ROLE_DESCRIPTION);
        this.id = str;
        this.name = str2;
        this.displayName = str3;
        this.description = str4;
        this.isSelected = z;
    }
}
