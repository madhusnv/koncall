package androidx.work.impl.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.sq8;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {OutcomeConstants.OUTCOME_ID})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
/* loaded from: classes2.dex */
public final class WorkTag {

    @ColumnInfo(name = "tag")
    private final String tag;

    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public WorkTag(String str, String str2) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(str2, "workSpecId");
        this.tag = str;
        this.workSpecId = str2;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
