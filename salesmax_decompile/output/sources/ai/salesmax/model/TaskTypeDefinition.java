package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class TaskTypeDefinition extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TaskTypeDefinition> CREATOR = new Creator();
    private int defaultDisplayOrder;
    private List<String> defaultTaskAssigneeIds;
    private String defaultTaskAssigneeType;
    private String description;
    private String id;
    private String name;
    private List<String> nextStepTaskTypesIfFailure;
    private List<String> nextStepTaskTypesIfSuccessful;
    private boolean selected;
    private List<String> taskActivityTypes;
    private Integer taskAutoCloseDays;
    private String taskCompleteFailureInputFormId;
    private String taskCompleteSuccessFormId;
    private String taskInputFormId;

    public static final class Creator implements Parcelable.Creator<TaskTypeDefinition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskTypeDefinition createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new TaskTypeDefinition(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskTypeDefinition[] newArray(int i) {
            return new TaskTypeDefinition[i];
        }
    }

    public TaskTypeDefinition() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 16383, null);
    }

    public final String component1() {
        return this.id;
    }

    public final List<String> component10() {
        return this.nextStepTaskTypesIfFailure;
    }

    public final List<String> component11() {
        return this.taskActivityTypes;
    }

    public final Integer component12() {
        return this.taskAutoCloseDays;
    }

    public final int component13() {
        return this.defaultDisplayOrder;
    }

    public final boolean component14() {
        return this.selected;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.taskInputFormId;
    }

    public final String component5() {
        return this.defaultTaskAssigneeType;
    }

    public final List<String> component6() {
        return this.defaultTaskAssigneeIds;
    }

    public final String component7() {
        return this.taskCompleteSuccessFormId;
    }

    public final String component8() {
        return this.taskCompleteFailureInputFormId;
    }

    public final List<String> component9() {
        return this.nextStepTaskTypesIfSuccessful;
    }

    public final TaskTypeDefinition copy(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, List<String> list2, List<String> list3, List<String> list4, Integer num, int i, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "taskInputFormId");
        sq8.m48649h(str5, "defaultTaskAssigneeType");
        sq8.m48649h(list, "defaultTaskAssigneeIds");
        sq8.m48649h(str6, "taskCompleteSuccessFormId");
        sq8.m48649h(str7, "taskCompleteFailureInputFormId");
        sq8.m48649h(list2, "nextStepTaskTypesIfSuccessful");
        sq8.m48649h(list3, "nextStepTaskTypesIfFailure");
        sq8.m48649h(list4, "taskActivityTypes");
        return new TaskTypeDefinition(str, str2, str3, str4, str5, list, str6, str7, list2, list3, list4, num, i, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskTypeDefinition)) {
            return false;
        }
        TaskTypeDefinition taskTypeDefinition = (TaskTypeDefinition) obj;
        return sq8.m48644c(this.id, taskTypeDefinition.id) && sq8.m48644c(this.name, taskTypeDefinition.name) && sq8.m48644c(this.description, taskTypeDefinition.description) && sq8.m48644c(this.taskInputFormId, taskTypeDefinition.taskInputFormId) && sq8.m48644c(this.defaultTaskAssigneeType, taskTypeDefinition.defaultTaskAssigneeType) && sq8.m48644c(this.defaultTaskAssigneeIds, taskTypeDefinition.defaultTaskAssigneeIds) && sq8.m48644c(this.taskCompleteSuccessFormId, taskTypeDefinition.taskCompleteSuccessFormId) && sq8.m48644c(this.taskCompleteFailureInputFormId, taskTypeDefinition.taskCompleteFailureInputFormId) && sq8.m48644c(this.nextStepTaskTypesIfSuccessful, taskTypeDefinition.nextStepTaskTypesIfSuccessful) && sq8.m48644c(this.nextStepTaskTypesIfFailure, taskTypeDefinition.nextStepTaskTypesIfFailure) && sq8.m48644c(this.taskActivityTypes, taskTypeDefinition.taskActivityTypes) && sq8.m48644c(this.taskAutoCloseDays, taskTypeDefinition.taskAutoCloseDays) && this.defaultDisplayOrder == taskTypeDefinition.defaultDisplayOrder && this.selected == taskTypeDefinition.selected;
    }

    public final int getDefaultDisplayOrder() {
        return this.defaultDisplayOrder;
    }

    public final List<String> getDefaultTaskAssigneeIds() {
        return this.defaultTaskAssigneeIds;
    }

    public final String getDefaultTaskAssigneeType() {
        return this.defaultTaskAssigneeType;
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

    public final List<String> getNextStepTaskTypesIfFailure() {
        return this.nextStepTaskTypesIfFailure;
    }

    public final List<String> getNextStepTaskTypesIfSuccessful() {
        return this.nextStepTaskTypesIfSuccessful;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final List<String> getTaskActivityTypes() {
        return this.taskActivityTypes;
    }

    public final Integer getTaskAutoCloseDays() {
        return this.taskAutoCloseDays;
    }

    public final String getTaskCompleteFailureInputFormId() {
        return this.taskCompleteFailureInputFormId;
    }

    public final String getTaskCompleteSuccessFormId() {
        return this.taskCompleteSuccessFormId;
    }

    public final String getTaskInputFormId() {
        return this.taskInputFormId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.taskInputFormId.hashCode()) * 31) + this.defaultTaskAssigneeType.hashCode()) * 31) + this.defaultTaskAssigneeIds.hashCode()) * 31) + this.taskCompleteSuccessFormId.hashCode()) * 31) + this.taskCompleteFailureInputFormId.hashCode()) * 31) + this.nextStepTaskTypesIfSuccessful.hashCode()) * 31) + this.nextStepTaskTypesIfFailure.hashCode()) * 31) + this.taskActivityTypes.hashCode()) * 31;
        Integer num = this.taskAutoCloseDays;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.defaultDisplayOrder)) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode2 + i;
    }

    public final void setDefaultDisplayOrder(int i) {
        this.defaultDisplayOrder = i;
    }

    public final void setDefaultTaskAssigneeIds(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.defaultTaskAssigneeIds = list;
    }

    public final void setDefaultTaskAssigneeType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.defaultTaskAssigneeType = str;
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

    public final void setNextStepTaskTypesIfFailure(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.nextStepTaskTypesIfFailure = list;
    }

    public final void setNextStepTaskTypesIfSuccessful(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.nextStepTaskTypesIfSuccessful = list;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setTaskActivityTypes(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.taskActivityTypes = list;
    }

    public final void setTaskAutoCloseDays(Integer num) {
        this.taskAutoCloseDays = num;
    }

    public final void setTaskCompleteFailureInputFormId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskCompleteFailureInputFormId = str;
    }

    public final void setTaskCompleteSuccessFormId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskCompleteSuccessFormId = str;
    }

    public final void setTaskInputFormId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskInputFormId = str;
    }

    public String toString() {
        return "TaskTypeDefinition(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", taskInputFormId=" + this.taskInputFormId + ", defaultTaskAssigneeType=" + this.defaultTaskAssigneeType + ", defaultTaskAssigneeIds=" + this.defaultTaskAssigneeIds + ", taskCompleteSuccessFormId=" + this.taskCompleteSuccessFormId + ", taskCompleteFailureInputFormId=" + this.taskCompleteFailureInputFormId + ", nextStepTaskTypesIfSuccessful=" + this.nextStepTaskTypesIfSuccessful + ", nextStepTaskTypesIfFailure=" + this.nextStepTaskTypesIfFailure + ", taskActivityTypes=" + this.taskActivityTypes + ", taskAutoCloseDays=" + this.taskAutoCloseDays + ", defaultDisplayOrder=" + this.defaultDisplayOrder + ", selected=" + this.selected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.taskInputFormId);
        parcel.writeString(this.defaultTaskAssigneeType);
        parcel.writeStringList(this.defaultTaskAssigneeIds);
        parcel.writeString(this.taskCompleteSuccessFormId);
        parcel.writeString(this.taskCompleteFailureInputFormId);
        parcel.writeStringList(this.nextStepTaskTypesIfSuccessful);
        parcel.writeStringList(this.nextStepTaskTypesIfFailure);
        parcel.writeStringList(this.taskActivityTypes);
        Integer num = this.taskAutoCloseDays;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.defaultDisplayOrder);
        parcel.writeInt(this.selected ? 1 : 0);
    }

    public /* synthetic */ TaskTypeDefinition(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, List list3, List list4, Integer num, int i, boolean z, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? new ArrayList() : list, (i2 & 64) != 0 ? "" : str6, (i2 & 128) == 0 ? str7 : "", (i2 & 256) != 0 ? new ArrayList() : list2, (i2 & 512) != 0 ? new ArrayList() : list3, (i2 & 1024) != 0 ? new ArrayList() : list4, (i2 & 2048) != 0 ? null : num, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) == 0 ? z : false);
    }

    public TaskTypeDefinition(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, List<String> list2, List<String> list3, List<String> list4, Integer num, int i, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "taskInputFormId");
        sq8.m48649h(str5, "defaultTaskAssigneeType");
        sq8.m48649h(list, "defaultTaskAssigneeIds");
        sq8.m48649h(str6, "taskCompleteSuccessFormId");
        sq8.m48649h(str7, "taskCompleteFailureInputFormId");
        sq8.m48649h(list2, "nextStepTaskTypesIfSuccessful");
        sq8.m48649h(list3, "nextStepTaskTypesIfFailure");
        sq8.m48649h(list4, "taskActivityTypes");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.taskInputFormId = str4;
        this.defaultTaskAssigneeType = str5;
        this.defaultTaskAssigneeIds = list;
        this.taskCompleteSuccessFormId = str6;
        this.taskCompleteFailureInputFormId = str7;
        this.nextStepTaskTypesIfSuccessful = list2;
        this.nextStepTaskTypesIfFailure = list3;
        this.taskActivityTypes = list4;
        this.taskAutoCloseDays = num;
        this.defaultDisplayOrder = i;
        this.selected = z;
    }
}
