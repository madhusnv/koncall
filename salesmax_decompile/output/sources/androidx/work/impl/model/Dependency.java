package androidx.work.impl.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.sq8;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {OutcomeConstants.OUTCOME_ID}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {OutcomeConstants.OUTCOME_ID})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
/* loaded from: classes2.dex */
public final class Dependency {

    @ColumnInfo(name = "prerequisite_id")
    private final String prerequisiteId;

    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public Dependency(String str, String str2) {
        sq8.m48649h(str, "workSpecId");
        sq8.m48649h(str2, "prerequisiteId");
        this.workSpecId = str;
        this.prerequisiteId = str2;
    }

    public final String getPrerequisiteId() {
        return this.prerequisiteId;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
