package ai.salesmax.model;

import p001o.sq8;

/* loaded from: classes.dex */
public final class AdHocTaskResponse {
    public static final int $stable = 0;
    private final String actionItem;
    private final String dueDate;
    private final String label;
    private final String person;
    private final String place;

    public AdHocTaskResponse(String str, String str2, String str3, String str4, String str5) {
        sq8.m48649h(str, "actionItem");
        sq8.m48649h(str2, "dueDate");
        this.actionItem = str;
        this.dueDate = str2;
        this.person = str3;
        this.label = str4;
        this.place = str5;
    }

    public static /* synthetic */ AdHocTaskResponse copy$default(AdHocTaskResponse adHocTaskResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adHocTaskResponse.actionItem;
        }
        if ((i & 2) != 0) {
            str2 = adHocTaskResponse.dueDate;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = adHocTaskResponse.person;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = adHocTaskResponse.label;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = adHocTaskResponse.place;
        }
        return adHocTaskResponse.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.actionItem;
    }

    public final String component2() {
        return this.dueDate;
    }

    public final String component3() {
        return this.person;
    }

    public final String component4() {
        return this.label;
    }

    public final String component5() {
        return this.place;
    }

    public final AdHocTaskResponse copy(String str, String str2, String str3, String str4, String str5) {
        sq8.m48649h(str, "actionItem");
        sq8.m48649h(str2, "dueDate");
        return new AdHocTaskResponse(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdHocTaskResponse)) {
            return false;
        }
        AdHocTaskResponse adHocTaskResponse = (AdHocTaskResponse) obj;
        return sq8.m48644c(this.actionItem, adHocTaskResponse.actionItem) && sq8.m48644c(this.dueDate, adHocTaskResponse.dueDate) && sq8.m48644c(this.person, adHocTaskResponse.person) && sq8.m48644c(this.label, adHocTaskResponse.label) && sq8.m48644c(this.place, adHocTaskResponse.place);
    }

    public final String getActionItem() {
        return this.actionItem;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPerson() {
        return this.person;
    }

    public final String getPlace() {
        return this.place;
    }

    public int hashCode() {
        int iHashCode = ((this.actionItem.hashCode() * 31) + this.dueDate.hashCode()) * 31;
        String str = this.person;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.place;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AdHocTaskResponse(actionItem=" + this.actionItem + ", dueDate=" + this.dueDate + ", person=" + this.person + ", label=" + this.label + ", place=" + this.place + ")";
    }
}
