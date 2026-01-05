package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "botType"}, name = "botsByAccountId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ChatBots")
/* loaded from: classes5.dex */
public final class ChatBot implements Model {

    @ModelField(targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "BotActionMapping")
    @HasMany(associatedWith = "botId", type = BotActionMapping.class)
    private final List<BotActionMapping> botActions;

    @ModelField(targetType = "String")
    private final String botType;

    @ModelField(targetType = "MasterBotSpecializedBot")
    @HasMany(associatedWith = "masterBotId", type = MasterBotSpecializedBot.class)
    private final List<MasterBotSpecializedBot> childBots;

    @ModelField(targetType = "ChildIntent")
    private final List<ChildIntent> childIntentList;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(targetType = "String")
    private final String fallBackResponse;

    @ModelField(targetType = "String")
    private final String generatedPrompt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String intent;

    @ModelField(targetType = "ID")
    private final List<String> linkedFiles;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "String")
    private final String nickName;

    @ModelField(targetType = "String")
    private final String preferredModel;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "String")
    private final String systemContext;

    @ModelField(targetType = "ID")
    private final String testChannelId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "String")
    private final String userContext;
    public static final QueryField ID = QueryField.field("ChatBot", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ChatBot", "accountId");
    public static final QueryField NAME = QueryField.field("ChatBot", "name");
    public static final QueryField NICK_NAME = QueryField.field("ChatBot", "nickName");
    public static final QueryField DESCRIPTION = QueryField.field("ChatBot", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField INTENT = QueryField.field("ChatBot", "intent");
    public static final QueryField BOT_TYPE = QueryField.field("ChatBot", "botType");
    public static final QueryField CHILD_INTENT_LIST = QueryField.field("ChatBot", "childIntentList");
    public static final QueryField USER_CONTEXT = QueryField.field("ChatBot", "userContext");
    public static final QueryField SYSTEM_CONTEXT = QueryField.field("ChatBot", "systemContext");
    public static final QueryField GENERATED_PROMPT = QueryField.field("ChatBot", "generatedPrompt");
    public static final QueryField FALL_BACK_RESPONSE = QueryField.field("ChatBot", "fallBackResponse");
    public static final QueryField STATUS = QueryField.field("ChatBot", "status");
    public static final QueryField LINKED_FILES = QueryField.field("ChatBot", "linkedFiles");
    public static final QueryField CREATED_BY_ID = QueryField.field("ChatBot", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("ChatBot", "updatedById");
    public static final QueryField TEST_CHANNEL_ID = QueryField.field("ChatBot", "testChannelId");
    public static final QueryField PREFERRED_MODEL = QueryField.field("ChatBot", "preferredModel");
    public static final QueryField CREATED_AT = QueryField.field("ChatBot", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ChatBot", "updatedAt");

    public interface BuildStep {
        BuildStep accountId(String str);

        BuildStep botType(String str);

        ChatBot build();

        BuildStep childIntentList(List<ChildIntent> list);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep description(String str);

        BuildStep fallBackResponse(String str);

        BuildStep generatedPrompt(String str);

        BuildStep id(String str);

        BuildStep intent(String str);

        BuildStep linkedFiles(List<String> list);

        BuildStep name(String str);

        BuildStep nickName(String str);

        BuildStep preferredModel(String str);

        BuildStep status(String str);

        BuildStep systemContext(String str);

        BuildStep testChannelId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep userContext(String str);
    }

    public static class Builder implements BuildStep {
        private String accountId;
        private String botType;
        private List<ChildIntent> childIntentList;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String description;
        private String fallBackResponse;
        private String generatedPrompt;
        private String id;
        private String intent;
        private List<String> linkedFiles;
        private String name;
        private String nickName;
        private String preferredModel;
        private String status;
        private String systemContext;
        private String testChannelId;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String userContext;

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep accountId(String str) {
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep botType(String str) {
            this.botType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public ChatBot build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ChatBot(string, this.accountId, this.name, this.nickName, this.description, this.intent, this.botType, this.childIntentList, this.userContext, this.systemContext, this.generatedPrompt, this.fallBackResponse, this.status, this.linkedFiles, this.createdById, this.updatedById, this.testChannelId, this.preferredModel, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep childIntentList(List<ChildIntent> list) {
            this.childIntentList = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep fallBackResponse(String str) {
            this.fallBackResponse = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep generatedPrompt(String str) {
            this.generatedPrompt = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep intent(String str) {
            this.intent = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep linkedFiles(List<String> list) {
            this.linkedFiles = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep nickName(String str) {
            this.nickName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep preferredModel(String str) {
            this.preferredModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep systemContext(String str) {
            this.systemContext = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep testChannelId(String str) {
            this.testChannelId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public BuildStep userContext(String str) {
            this.userContext = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ChildIntent> list, String str8, String str9, String str10, String str11, String str12, List<String> list2, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.nickName = str4;
            this.description = str5;
            this.intent = str6;
            this.botType = str7;
            this.childIntentList = list;
            this.userContext = str8;
            this.systemContext = str9;
            this.generatedPrompt = str10;
            this.fallBackResponse = str11;
            this.status = str12;
            this.linkedFiles = list2;
            this.createdById = str13;
            this.updatedById = str14;
            this.testChannelId = str15;
            this.preferredModel = str16;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public /* bridge */ /* synthetic */ BuildStep childIntentList(List list) {
            return childIntentList((List<ChildIntent>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public /* bridge */ /* synthetic */ BuildStep linkedFiles(List list) {
            return linkedFiles((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ChildIntent> list, String str8, String str9, String str10, String str11, String str12, List<String> list2, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, str11, str12, list2, str13, str14, str15, str16, dateTime, dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder botType(String str) {
            return (CopyOfBuilder) super.botType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder childIntentList(List<ChildIntent> list) {
            return (CopyOfBuilder) super.childIntentList(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder fallBackResponse(String str) {
            return (CopyOfBuilder) super.fallBackResponse(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder generatedPrompt(String str) {
            return (CopyOfBuilder) super.generatedPrompt(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder intent(String str) {
            return (CopyOfBuilder) super.intent(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder linkedFiles(List<String> list) {
            return (CopyOfBuilder) super.linkedFiles(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder nickName(String str) {
            return (CopyOfBuilder) super.nickName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder preferredModel(String str) {
            return (CopyOfBuilder) super.preferredModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder systemContext(String str) {
            return (CopyOfBuilder) super.systemContext(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder testChannelId(String str) {
            return (CopyOfBuilder) super.testChannelId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatBot.Builder, com.amplifyframework.datastore.generated.model.ChatBot.BuildStep
        public CopyOfBuilder userContext(String str) {
            return (CopyOfBuilder) super.userContext(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static ChatBot justId(String str) {
        return new ChatBot(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.nickName, this.description, this.intent, this.botType, this.childIntentList, this.userContext, this.systemContext, this.generatedPrompt, this.fallBackResponse, this.status, this.linkedFiles, this.createdById, this.updatedById, this.testChannelId, this.preferredModel, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChatBot.class != obj.getClass()) {
            return false;
        }
        ChatBot chatBot = (ChatBot) obj;
        return s6c.m47909a(getId(), chatBot.getId()) && s6c.m47909a(getAccountId(), chatBot.getAccountId()) && s6c.m47909a(getName(), chatBot.getName()) && s6c.m47909a(getNickName(), chatBot.getNickName()) && s6c.m47909a(getDescription(), chatBot.getDescription()) && s6c.m47909a(getIntent(), chatBot.getIntent()) && s6c.m47909a(getBotType(), chatBot.getBotType()) && s6c.m47909a(getChildIntentList(), chatBot.getChildIntentList()) && s6c.m47909a(getUserContext(), chatBot.getUserContext()) && s6c.m47909a(getSystemContext(), chatBot.getSystemContext()) && s6c.m47909a(getGeneratedPrompt(), chatBot.getGeneratedPrompt()) && s6c.m47909a(getFallBackResponse(), chatBot.getFallBackResponse()) && s6c.m47909a(getStatus(), chatBot.getStatus()) && s6c.m47909a(getLinkedFiles(), chatBot.getLinkedFiles()) && s6c.m47909a(getCreatedById(), chatBot.getCreatedById()) && s6c.m47909a(getUpdatedById(), chatBot.getUpdatedById()) && s6c.m47909a(getTestChannelId(), chatBot.getTestChannelId()) && s6c.m47909a(getPreferredModel(), chatBot.getPreferredModel()) && s6c.m47909a(getCreatedAt(), chatBot.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), chatBot.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public List<BotActionMapping> getBotActions() {
        return this.botActions;
    }

    public String getBotType() {
        return this.botType;
    }

    public List<MasterBotSpecializedBot> getChildBots() {
        return this.childBots;
    }

    public List<ChildIntent> getChildIntentList() {
        return this.childIntentList;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFallBackResponse() {
        return this.fallBackResponse;
    }

    public String getGeneratedPrompt() {
        return this.generatedPrompt;
    }

    public String getId() {
        return this.id;
    }

    public String getIntent() {
        return this.intent;
    }

    public List<String> getLinkedFiles() {
        return this.linkedFiles;
    }

    public String getName() {
        return this.name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getPreferredModel() {
        return this.preferredModel;
    }

    public String getStatus() {
        return this.status;
    }

    public String getSystemContext() {
        return this.systemContext;
    }

    public String getTestChannelId() {
        return this.testChannelId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public String getUserContext() {
        return this.userContext;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getNickName() + getDescription() + getIntent() + getBotType() + getChildIntentList() + getUserContext() + getSystemContext() + getGeneratedPrompt() + getFallBackResponse() + getStatus() + getLinkedFiles() + getCreatedById() + getUpdatedById() + getTestChannelId() + getPreferredModel() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatBot {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("nickName=" + String.valueOf(getNickName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("intent=" + String.valueOf(getIntent()) + ", ");
        sb.append("botType=" + String.valueOf(getBotType()) + ", ");
        sb.append("childIntentList=" + String.valueOf(getChildIntentList()) + ", ");
        sb.append("userContext=" + String.valueOf(getUserContext()) + ", ");
        sb.append("systemContext=" + String.valueOf(getSystemContext()) + ", ");
        sb.append("generatedPrompt=" + String.valueOf(getGeneratedPrompt()) + ", ");
        sb.append("fallBackResponse=" + String.valueOf(getFallBackResponse()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("linkedFiles=" + String.valueOf(getLinkedFiles()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("updatedById=" + String.valueOf(getUpdatedById()) + ", ");
        sb.append("testChannelId=" + String.valueOf(getTestChannelId()) + ", ");
        sb.append("preferredModel=" + String.valueOf(getPreferredModel()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ChatBot(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ChildIntent> list, String str8, String str9, String str10, String str11, String str12, List<String> list2, String str13, String str14, String str15, String str16, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.childBots = null;
        this.botActions = null;
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.nickName = str4;
        this.description = str5;
        this.intent = str6;
        this.botType = str7;
        this.childIntentList = list;
        this.userContext = str8;
        this.systemContext = str9;
        this.generatedPrompt = str10;
        this.fallBackResponse = str11;
        this.status = str12;
        this.linkedFiles = list2;
        this.createdById = str13;
        this.updatedById = str14;
        this.testChannelId = str15;
        this.preferredModel = str16;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
