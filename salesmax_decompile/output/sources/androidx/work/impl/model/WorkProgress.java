package androidx.work.impl.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.work.Data;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.sq8;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {OutcomeConstants.OUTCOME_ID})})
/* loaded from: classes2.dex */
public final class WorkProgress {

    @ColumnInfo(name = "progress")
    private final Data progress;

    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public WorkProgress(String str, Data data) {
        sq8.m48649h(str, "workSpecId");
        sq8.m48649h(data, "progress");
        this.workSpecId = str;
        this.progress = data;
    }

    public final Data getProgress() {
        return this.progress;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
