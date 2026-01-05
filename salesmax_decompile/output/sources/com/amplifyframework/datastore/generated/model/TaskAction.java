package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "contactId"}, name = SQLiteCommandFactory.UNDEFINED)
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "TaskActions")
/* loaded from: classes5.dex */
public final class TaskAction implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ActionCategory")
    private final ActionCategory actionCategory;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime dueDate;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User owner;

    @ModelField(targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team primaryTeam;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "Priority")
    private final Priority priority;

    @ModelField(targetType = "ID")
    private final String relatedTaskId;
    public static final QueryField ID = QueryField.field("TaskAction", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("TaskAction", "accountId");
    public static final QueryField CONTACT = QueryField.field("TaskAction", "contactId");
    public static final QueryField ACTION_CATEGORY = QueryField.field("TaskAction", "actionCategory");
    public static final QueryField RELATED_TASK_ID = QueryField.field("TaskAction", "relatedTaskId");
    public static final QueryField PRIORITY = QueryField.field("TaskAction", "priority");
    public static final QueryField DUE_DATE = QueryField.field("TaskAction", "dueDate");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("TaskAction", "primaryTeamId");
    public static final QueryField OWNER_ID = QueryField.field("TaskAction", "ownerId");
    public static final QueryField CREATED_AT = QueryField.field("TaskAction", "createdAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep actionCategory(ActionCategory actionCategory);

        TaskAction build();

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep dueDate(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep ownerId(String str);

        BuildStep primaryTeamId(String str);

        BuildStep priority(Priority priority);

        BuildStep relatedTaskId(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private ActionCategory actionCategory;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private Temporal.DateTime dueDate;
        private String id;
        private String ownerId;
        private String primaryTeamId;
        private Priority priority;
        private String relatedTaskId;

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep actionCategory(ActionCategory actionCategory) {
            this.actionCategory = actionCategory;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public TaskAction build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new TaskAction(string, this.accountId, this.contact, this.actionCategory, this.relatedTaskId, this.priority, this.dueDate, this.primaryTeamId, this.ownerId, this.createdAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep dueDate(Temporal.DateTime dateTime) {
            this.dueDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public BuildStep relatedTaskId(String str) {
            this.relatedTaskId = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Contact contact, ActionCategory actionCategory, String str3, Priority priority, Temporal.DateTime dateTime, String str4, String str5, Temporal.DateTime dateTime2) {
            super.id(str);
            super.accountId(str2).contact(contact).actionCategory(actionCategory).relatedTaskId(str3).priority(priority).dueDate(dateTime).primaryTeamId(str4).ownerId(str5).createdAt(dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder actionCategory(ActionCategory actionCategory) {
            return (CopyOfBuilder) super.actionCategory(actionCategory);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder dueDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.dueDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder priority(Priority priority) {
            return (CopyOfBuilder) super.priority(priority);
        }

        @Override // com.amplifyframework.datastore.generated.model.TaskAction.Builder, com.amplifyframework.datastore.generated.model.TaskAction.BuildStep
        public CopyOfBuilder relatedTaskId(String str) {
            return (CopyOfBuilder) super.relatedTaskId(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static TaskAction justId(String str) {
        return new TaskAction(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contact, this.actionCategory, this.relatedTaskId, this.priority, this.dueDate, this.primaryTeamId, this.ownerId, this.createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TaskAction.class != obj.getClass()) {
            return false;
        }
        TaskAction taskAction = (TaskAction) obj;
        return s6c.m47909a(getId(), taskAction.getId()) && s6c.m47909a(getAccountId(), taskAction.getAccountId()) && s6c.m47909a(getContact(), taskAction.getContact()) && s6c.m47909a(getActionCategory(), taskAction.getActionCategory()) && s6c.m47909a(getRelatedTaskId(), taskAction.getRelatedTaskId()) && s6c.m47909a(getPriority(), taskAction.getPriority()) && s6c.m47909a(getDueDate(), taskAction.getDueDate()) && s6c.m47909a(getPrimaryTeamId(), taskAction.getPrimaryTeamId()) && s6c.m47909a(getOwnerId(), taskAction.getOwnerId()) && s6c.m47909a(getCreatedAt(), taskAction.getCreatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ActionCategory getActionCategory() {
        return this.actionCategory;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Temporal.DateTime getDueDate() {
        return this.dueDate;
    }

    public String getId() {
        return this.id;
    }

    public User getOwner() {
        return this.owner;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public Team getPrimaryTeam() {
        return this.primaryTeam;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public String getRelatedTaskId() {
        return this.relatedTaskId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getContact() + getActionCategory() + getRelatedTaskId() + getPriority() + getDueDate() + getPrimaryTeamId() + getOwnerId() + getCreatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TaskAction {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("actionCategory=" + String.valueOf(getActionCategory()) + ", ");
        sb.append("relatedTaskId=" + String.valueOf(getRelatedTaskId()) + ", ");
        sb.append("priority=" + String.valueOf(getPriority()) + ", ");
        sb.append("dueDate=" + String.valueOf(getDueDate()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createdAt=");
        sb2.append(String.valueOf(getCreatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private TaskAction(String str, String str2, Contact contact, ActionCategory actionCategory, String str3, Priority priority, Temporal.DateTime dateTime, String str4, String str5, Temporal.DateTime dateTime2) {
        this.primaryTeam = null;
        this.owner = null;
        this.id = str;
        this.accountId = str2;
        this.contact = contact;
        this.actionCategory = actionCategory;
        this.relatedTaskId = str3;
        this.priority = priority;
        this.dueDate = dateTime;
        this.primaryTeamId = str4;
        this.ownerId = str5;
        this.createdAt = dateTime2;
    }
}
