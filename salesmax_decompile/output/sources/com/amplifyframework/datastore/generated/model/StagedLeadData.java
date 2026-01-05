package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "StagedLeadData")
/* loaded from: classes5.dex */
public final class StagedLeadData implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "ID")
    private final String entityListId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime leadCreatedAt;

    @ModelField(targetType = "String")
    private final String logId;

    @ModelField(targetType = "String")
    private final String mailFrom;

    @ModelField(targetType = "String")
    private final String mailSubject;

    @ModelField(targetType = "String")
    private final String mailTo;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime messageDate;

    @ModelField(targetType = "String")
    private final String messageId;

    @ModelField(targetType = "String")
    private final String messageType;

    @ModelField(targetType = "String")
    private final String network;

    @ModelField(targetType = "String")
    private final String snippet;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime viewedAt;
    public static final QueryField ID = QueryField.field("StagedLeadData", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("StagedLeadData", "accountId");
    public static final QueryField NETWORK = QueryField.field("StagedLeadData", "network");
    public static final QueryField MESSAGE_TYPE = QueryField.field("StagedLeadData", "messageType");
    public static final QueryField LOG_ID = QueryField.field("StagedLeadData", "logId");
    public static final QueryField MESSAGE_ID = QueryField.field("StagedLeadData", "messageId");
    public static final QueryField MAIL_FROM = QueryField.field("StagedLeadData", "mailFrom");
    public static final QueryField MAIL_TO = QueryField.field("StagedLeadData", "mailTo");
    public static final QueryField MAIL_SUBJECT = QueryField.field("StagedLeadData", "mailSubject");
    public static final QueryField SNIPPET = QueryField.field("StagedLeadData", "snippet");
    public static final QueryField MESSAGE_DATE = QueryField.field("StagedLeadData", "messageDate");
    public static final QueryField VIEWED_AT = QueryField.field("StagedLeadData", "viewedAt");
    public static final QueryField LEAD_CREATED_AT = QueryField.field("StagedLeadData", "leadCreatedAt");
    public static final QueryField CONTACT = QueryField.field("StagedLeadData", "contactId");
    public static final QueryField TAGS = QueryField.field("StagedLeadData", "tags");
    public static final QueryField ENTITY_LIST_ID = QueryField.field("StagedLeadData", "entityListId");
    public static final QueryField CREATED_BY_ID = QueryField.field("StagedLeadData", "createdById");
    public static final QueryField CREATED_AT = QueryField.field("StagedLeadData", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("StagedLeadData", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        StagedLeadData build();

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep entityListId(String str);

        BuildStep id(String str);

        BuildStep leadCreatedAt(Temporal.DateTime dateTime);

        BuildStep logId(String str);

        BuildStep mailFrom(String str);

        BuildStep mailSubject(String str);

        BuildStep mailTo(String str);

        BuildStep messageDate(Temporal.DateTime dateTime);

        BuildStep messageId(String str);

        BuildStep messageType(String str);

        BuildStep network(String str);

        BuildStep snippet(String str);

        BuildStep tags(List<String> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep viewedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String entityListId;
        private String id;
        private Temporal.DateTime leadCreatedAt;
        private String logId;
        private String mailFrom;
        private String mailSubject;
        private String mailTo;
        private Temporal.DateTime messageDate;
        private String messageId;
        private String messageType;
        private String network;
        private String snippet;
        private List<String> tags;
        private Temporal.DateTime updatedAt;
        private Temporal.DateTime viewedAt;

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public StagedLeadData build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new StagedLeadData(string, this.accountId, this.network, this.messageType, this.logId, this.messageId, this.mailFrom, this.mailTo, this.mailSubject, this.snippet, this.messageDate, this.viewedAt, this.leadCreatedAt, this.contact, this.tags, this.entityListId, this.createdById, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep entityListId(String str) {
            this.entityListId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep leadCreatedAt(Temporal.DateTime dateTime) {
            this.leadCreatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep logId(String str) {
            this.logId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep mailFrom(String str) {
            this.mailFrom = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep mailSubject(String str) {
            this.mailSubject = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep mailTo(String str) {
            this.mailTo = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep messageDate(Temporal.DateTime dateTime) {
            this.messageDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep messageId(String str) {
            this.messageId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep messageType(String str) {
            this.messageType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep network(String str) {
            this.network = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep snippet(String str) {
            this.snippet = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public BuildStep viewedAt(Temporal.DateTime dateTime) {
            this.viewedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Contact contact, List<String> list, String str11, String str12, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5) {
            this.id = str;
            this.accountId = str2;
            this.network = str3;
            this.messageType = str4;
            this.logId = str5;
            this.messageId = str6;
            this.mailFrom = str7;
            this.mailTo = str8;
            this.mailSubject = str9;
            this.snippet = str10;
            this.messageDate = dateTime;
            this.viewedAt = dateTime2;
            this.leadCreatedAt = dateTime3;
            this.contact = contact;
            this.tags = list;
            this.entityListId = str11;
            this.createdById = str12;
            this.createdAt = dateTime4;
            this.updatedAt = dateTime5;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Contact contact, List<String> list, String str11, String str12, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5) {
            super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, dateTime, dateTime2, dateTime3, contact, list, str11, str12, dateTime4, dateTime5);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder entityListId(String str) {
            return (CopyOfBuilder) super.entityListId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder leadCreatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.leadCreatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder logId(String str) {
            return (CopyOfBuilder) super.logId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder mailFrom(String str) {
            return (CopyOfBuilder) super.mailFrom(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder mailSubject(String str) {
            return (CopyOfBuilder) super.mailSubject(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder mailTo(String str) {
            return (CopyOfBuilder) super.mailTo(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder messageDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.messageDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder messageId(String str) {
            return (CopyOfBuilder) super.messageId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder messageType(String str) {
            return (CopyOfBuilder) super.messageType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder network(String str) {
            return (CopyOfBuilder) super.network(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder snippet(String str) {
            return (CopyOfBuilder) super.snippet(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.StagedLeadData.Builder, com.amplifyframework.datastore.generated.model.StagedLeadData.BuildStep
        public CopyOfBuilder viewedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.viewedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static StagedLeadData justId(String str) {
        return new StagedLeadData(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.network, this.messageType, this.logId, this.messageId, this.mailFrom, this.mailTo, this.mailSubject, this.snippet, this.messageDate, this.viewedAt, this.leadCreatedAt, this.contact, this.tags, this.entityListId, this.createdById, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StagedLeadData.class != obj.getClass()) {
            return false;
        }
        StagedLeadData stagedLeadData = (StagedLeadData) obj;
        return s6c.m47909a(getId(), stagedLeadData.getId()) && s6c.m47909a(getAccountId(), stagedLeadData.getAccountId()) && s6c.m47909a(getNetwork(), stagedLeadData.getNetwork()) && s6c.m47909a(getMessageType(), stagedLeadData.getMessageType()) && s6c.m47909a(getLogId(), stagedLeadData.getLogId()) && s6c.m47909a(getMessageId(), stagedLeadData.getMessageId()) && s6c.m47909a(getMailFrom(), stagedLeadData.getMailFrom()) && s6c.m47909a(getMailTo(), stagedLeadData.getMailTo()) && s6c.m47909a(getMailSubject(), stagedLeadData.getMailSubject()) && s6c.m47909a(getSnippet(), stagedLeadData.getSnippet()) && s6c.m47909a(getMessageDate(), stagedLeadData.getMessageDate()) && s6c.m47909a(getViewedAt(), stagedLeadData.getViewedAt()) && s6c.m47909a(getLeadCreatedAt(), stagedLeadData.getLeadCreatedAt()) && s6c.m47909a(getContact(), stagedLeadData.getContact()) && s6c.m47909a(getTags(), stagedLeadData.getTags()) && s6c.m47909a(getEntityListId(), stagedLeadData.getEntityListId()) && s6c.m47909a(getCreatedById(), stagedLeadData.getCreatedById()) && s6c.m47909a(getCreatedAt(), stagedLeadData.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), stagedLeadData.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getEntityListId() {
        return this.entityListId;
    }

    public String getId() {
        return this.id;
    }

    public Temporal.DateTime getLeadCreatedAt() {
        return this.leadCreatedAt;
    }

    public String getLogId() {
        return this.logId;
    }

    public String getMailFrom() {
        return this.mailFrom;
    }

    public String getMailSubject() {
        return this.mailSubject;
    }

    public String getMailTo() {
        return this.mailTo;
    }

    public Temporal.DateTime getMessageDate() {
        return this.messageDate;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getNetwork() {
        return this.network;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public Temporal.DateTime getViewedAt() {
        return this.viewedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getNetwork() + getMessageType() + getLogId() + getMessageId() + getMailFrom() + getMailTo() + getMailSubject() + getSnippet() + getMessageDate() + getViewedAt() + getLeadCreatedAt() + getContact() + getTags() + getEntityListId() + getCreatedById() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StagedLeadData {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("network=" + String.valueOf(getNetwork()) + ", ");
        sb.append("messageType=" + String.valueOf(getMessageType()) + ", ");
        sb.append("logId=" + String.valueOf(getLogId()) + ", ");
        sb.append("messageId=" + String.valueOf(getMessageId()) + ", ");
        sb.append("mailFrom=" + String.valueOf(getMailFrom()) + ", ");
        sb.append("mailTo=" + String.valueOf(getMailTo()) + ", ");
        sb.append("mailSubject=" + String.valueOf(getMailSubject()) + ", ");
        sb.append("snippet=" + String.valueOf(getSnippet()) + ", ");
        sb.append("messageDate=" + String.valueOf(getMessageDate()) + ", ");
        sb.append("viewedAt=" + String.valueOf(getViewedAt()) + ", ");
        sb.append("leadCreatedAt=" + String.valueOf(getLeadCreatedAt()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("entityListId=" + String.valueOf(getEntityListId()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private StagedLeadData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Contact contact, List<String> list, String str11, String str12, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5) {
        this.id = str;
        this.accountId = str2;
        this.network = str3;
        this.messageType = str4;
        this.logId = str5;
        this.messageId = str6;
        this.mailFrom = str7;
        this.mailTo = str8;
        this.mailSubject = str9;
        this.snippet = str10;
        this.messageDate = dateTime;
        this.viewedAt = dateTime2;
        this.leadCreatedAt = dateTime3;
        this.contact = contact;
        this.tags = list;
        this.entityListId = str11;
        this.createdById = str12;
        this.createdAt = dateTime4;
        this.updatedAt = dateTime5;
    }
}
