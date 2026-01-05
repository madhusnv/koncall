package ai.salesmax.model;

import java.util.ArrayList;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class AutoCompleteListModel {
    public static final int $stable = 8;
    private String selectedTeam;
    private ArrayList<String> teamList;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoCompleteListModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoCompleteListModel copy$default(AutoCompleteListModel autoCompleteListModel, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoCompleteListModel.selectedTeam;
        }
        if ((i & 2) != 0) {
            arrayList = autoCompleteListModel.teamList;
        }
        return autoCompleteListModel.copy(str, arrayList);
    }

    public final String component1() {
        return this.selectedTeam;
    }

    public final ArrayList<String> component2() {
        return this.teamList;
    }

    public final AutoCompleteListModel copy(String str, ArrayList<String> arrayList) {
        sq8.m48649h(str, "selectedTeam");
        sq8.m48649h(arrayList, "teamList");
        return new AutoCompleteListModel(str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCompleteListModel)) {
            return false;
        }
        AutoCompleteListModel autoCompleteListModel = (AutoCompleteListModel) obj;
        return sq8.m48644c(this.selectedTeam, autoCompleteListModel.selectedTeam) && sq8.m48644c(this.teamList, autoCompleteListModel.teamList);
    }

    public final String getSelectedTeam() {
        return this.selectedTeam;
    }

    public final ArrayList<String> getTeamList() {
        return this.teamList;
    }

    public int hashCode() {
        return (this.selectedTeam.hashCode() * 31) + this.teamList.hashCode();
    }

    public final void setSelectedTeam(String str) {
        sq8.m48649h(str, "<set-?>");
        this.selectedTeam = str;
    }

    public final void setTeamList(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.teamList = arrayList;
    }

    public String toString() {
        return "AutoCompleteListModel(selectedTeam=" + this.selectedTeam + ", teamList=" + this.teamList + ")";
    }

    public AutoCompleteListModel(String str, ArrayList<String> arrayList) {
        sq8.m48649h(str, "selectedTeam");
        sq8.m48649h(arrayList, "teamList");
        this.selectedTeam = str;
        this.teamList = arrayList;
    }

    public /* synthetic */ AutoCompleteListModel(String str, ArrayList arrayList, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
