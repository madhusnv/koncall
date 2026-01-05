package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class AccountStats {
    private final Integer bulkActionsPreviousSeventDays;
    private final Integer bulkActionsSeventDays;
    private final Integer bulkActionsSeventDays_BULK_UPDATE;
    private final Integer bulkActionsSeventDays_BULK_UPLOAD;
    private final Integer bulkActionsSeventDays_CAMPAIGN_WITH_RULE;
    private final Integer bulkActionsSeventDays_CREATE_TAG;
    private final Integer bulkActionsSeventDays_GENERATE_REPORT;
    private final Integer bulkActionsSeventDays_REMOVE_USER;
    private final Integer callPreviousSevenDays;
    private final Integer callSevenDays;
    private final Integer contactCreatedPreviousSevenDays;
    private final Integer onboardingStepsDone;
    private final Integer paymentSevenDays;
    private final Integer taskSevenDays;
    private final Integer wabaBroadcastSevenDays;
    private final Integer wabaConversationPreviousSevenDays;
    private final Integer wabaConversationSevenDays;

    public interface BuildStep {
        AccountStats build();

        BuildStep bulkActionsPreviousSeventDays(Integer num);

        BuildStep bulkActionsSeventDays(Integer num);

        BuildStep bulkActionsSeventDaysBulkUpdate(Integer num);

        BuildStep bulkActionsSeventDaysBulkUpload(Integer num);

        BuildStep bulkActionsSeventDaysCampaignWithRule(Integer num);

        BuildStep bulkActionsSeventDaysCreateTag(Integer num);

        BuildStep bulkActionsSeventDaysGenerateReport(Integer num);

        BuildStep bulkActionsSeventDaysRemoveUser(Integer num);

        BuildStep callPreviousSevenDays(Integer num);

        BuildStep callSevenDays(Integer num);

        BuildStep contactCreatedPreviousSevenDays(Integer num);

        BuildStep onboardingStepsDone(Integer num);

        BuildStep paymentSevenDays(Integer num);

        BuildStep taskSevenDays(Integer num);

        BuildStep wabaBroadcastSevenDays(Integer num);

        BuildStep wabaConversationPreviousSevenDays(Integer num);

        BuildStep wabaConversationSevenDays(Integer num);
    }

    public static class Builder implements BuildStep {
        private Integer bulkActionsPreviousSeventDays;
        private Integer bulkActionsSeventDays;
        private Integer bulkActionsSeventDays_BULK_UPDATE;
        private Integer bulkActionsSeventDays_BULK_UPLOAD;
        private Integer bulkActionsSeventDays_CAMPAIGN_WITH_RULE;
        private Integer bulkActionsSeventDays_CREATE_TAG;
        private Integer bulkActionsSeventDays_GENERATE_REPORT;
        private Integer bulkActionsSeventDays_REMOVE_USER;
        private Integer callPreviousSevenDays;
        private Integer callSevenDays;
        private Integer contactCreatedPreviousSevenDays;
        private Integer onboardingStepsDone;
        private Integer paymentSevenDays;
        private Integer taskSevenDays;
        private Integer wabaBroadcastSevenDays;
        private Integer wabaConversationPreviousSevenDays;
        private Integer wabaConversationSevenDays;

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public AccountStats build() {
            return new AccountStats(this.callSevenDays, this.wabaConversationSevenDays, this.wabaBroadcastSevenDays, this.paymentSevenDays, this.taskSevenDays, this.callPreviousSevenDays, this.wabaConversationPreviousSevenDays, this.contactCreatedPreviousSevenDays, this.bulkActionsSeventDays, this.bulkActionsSeventDays_BULK_UPLOAD, this.bulkActionsSeventDays_CREATE_TAG, this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE, this.bulkActionsSeventDays_BULK_UPDATE, this.bulkActionsSeventDays_GENERATE_REPORT, this.bulkActionsSeventDays_REMOVE_USER, this.bulkActionsPreviousSeventDays, this.onboardingStepsDone);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsPreviousSeventDays(Integer num) {
            this.bulkActionsPreviousSeventDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsSeventDays(Integer num) {
            this.bulkActionsSeventDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsSeventDaysBulkUpdate(Integer num) {
            this.bulkActionsSeventDays_BULK_UPDATE = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsSeventDaysBulkUpload(Integer num) {
            this.bulkActionsSeventDays_BULK_UPLOAD = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsSeventDaysCampaignWithRule(Integer num) {
            this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsSeventDaysCreateTag(Integer num) {
            this.bulkActionsSeventDays_CREATE_TAG = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsSeventDaysGenerateReport(Integer num) {
            this.bulkActionsSeventDays_GENERATE_REPORT = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep bulkActionsSeventDaysRemoveUser(Integer num) {
            this.bulkActionsSeventDays_REMOVE_USER = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep callPreviousSevenDays(Integer num) {
            this.callPreviousSevenDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep callSevenDays(Integer num) {
            this.callSevenDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep contactCreatedPreviousSevenDays(Integer num) {
            this.contactCreatedPreviousSevenDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep onboardingStepsDone(Integer num) {
            this.onboardingStepsDone = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep paymentSevenDays(Integer num) {
            this.paymentSevenDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep taskSevenDays(Integer num) {
            this.taskSevenDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep wabaBroadcastSevenDays(Integer num) {
            this.wabaBroadcastSevenDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep wabaConversationPreviousSevenDays(Integer num) {
            this.wabaConversationPreviousSevenDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public BuildStep wabaConversationSevenDays(Integer num) {
            this.wabaConversationSevenDays = num;
            return this;
        }

        public Builder() {
        }

        private Builder(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17) {
            this.callSevenDays = num;
            this.wabaConversationSevenDays = num2;
            this.wabaBroadcastSevenDays = num3;
            this.paymentSevenDays = num4;
            this.taskSevenDays = num5;
            this.callPreviousSevenDays = num6;
            this.wabaConversationPreviousSevenDays = num7;
            this.contactCreatedPreviousSevenDays = num8;
            this.bulkActionsSeventDays = num9;
            this.bulkActionsSeventDays_BULK_UPLOAD = num10;
            this.bulkActionsSeventDays_CREATE_TAG = num11;
            this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE = num12;
            this.bulkActionsSeventDays_BULK_UPDATE = num13;
            this.bulkActionsSeventDays_GENERATE_REPORT = num14;
            this.bulkActionsSeventDays_REMOVE_USER = num15;
            this.bulkActionsPreviousSeventDays = num16;
            this.onboardingStepsDone = num17;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17) {
            super(num, num2, num3, num4, num5, num6, num7, num8, num9, AccountStats.this.bulkActionsSeventDays_BULK_UPLOAD, AccountStats.this.bulkActionsSeventDays_CREATE_TAG, AccountStats.this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE, AccountStats.this.bulkActionsSeventDays_BULK_UPDATE, AccountStats.this.bulkActionsSeventDays_GENERATE_REPORT, AccountStats.this.bulkActionsSeventDays_REMOVE_USER, num16, num17);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsPreviousSeventDays(Integer num) {
            return (CopyOfBuilder) super.bulkActionsPreviousSeventDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsSeventDays(Integer num) {
            return (CopyOfBuilder) super.bulkActionsSeventDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsSeventDaysBulkUpdate(Integer num) {
            return (CopyOfBuilder) super.bulkActionsSeventDaysBulkUpdate(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsSeventDaysBulkUpload(Integer num) {
            return (CopyOfBuilder) super.bulkActionsSeventDaysBulkUpload(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsSeventDaysCampaignWithRule(Integer num) {
            return (CopyOfBuilder) super.bulkActionsSeventDaysCampaignWithRule(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsSeventDaysCreateTag(Integer num) {
            return (CopyOfBuilder) super.bulkActionsSeventDaysCreateTag(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsSeventDaysGenerateReport(Integer num) {
            return (CopyOfBuilder) super.bulkActionsSeventDaysGenerateReport(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder bulkActionsSeventDaysRemoveUser(Integer num) {
            return (CopyOfBuilder) super.bulkActionsSeventDaysRemoveUser(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder callPreviousSevenDays(Integer num) {
            return (CopyOfBuilder) super.callPreviousSevenDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder callSevenDays(Integer num) {
            return (CopyOfBuilder) super.callSevenDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder contactCreatedPreviousSevenDays(Integer num) {
            return (CopyOfBuilder) super.contactCreatedPreviousSevenDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder onboardingStepsDone(Integer num) {
            return (CopyOfBuilder) super.onboardingStepsDone(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder paymentSevenDays(Integer num) {
            return (CopyOfBuilder) super.paymentSevenDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder taskSevenDays(Integer num) {
            return (CopyOfBuilder) super.taskSevenDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder wabaBroadcastSevenDays(Integer num) {
            return (CopyOfBuilder) super.wabaBroadcastSevenDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder wabaConversationPreviousSevenDays(Integer num) {
            return (CopyOfBuilder) super.wabaConversationPreviousSevenDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountStats.Builder, com.amplifyframework.datastore.generated.model.AccountStats.BuildStep
        public CopyOfBuilder wabaConversationSevenDays(Integer num) {
            return (CopyOfBuilder) super.wabaConversationSevenDays(num);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.callSevenDays, this.wabaConversationSevenDays, this.wabaBroadcastSevenDays, this.paymentSevenDays, this.taskSevenDays, this.callPreviousSevenDays, this.wabaConversationPreviousSevenDays, this.contactCreatedPreviousSevenDays, this.bulkActionsSeventDays, this.bulkActionsSeventDays_BULK_UPLOAD, this.bulkActionsSeventDays_CREATE_TAG, this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE, this.bulkActionsSeventDays_BULK_UPDATE, this.bulkActionsSeventDays_GENERATE_REPORT, this.bulkActionsSeventDays_REMOVE_USER, this.bulkActionsPreviousSeventDays, this.onboardingStepsDone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountStats.class != obj.getClass()) {
            return false;
        }
        AccountStats accountStats = (AccountStats) obj;
        return s6c.m47909a(getCallSevenDays(), accountStats.getCallSevenDays()) && s6c.m47909a(getWabaConversationSevenDays(), accountStats.getWabaConversationSevenDays()) && s6c.m47909a(getWabaBroadcastSevenDays(), accountStats.getWabaBroadcastSevenDays()) && s6c.m47909a(getPaymentSevenDays(), accountStats.getPaymentSevenDays()) && s6c.m47909a(getTaskSevenDays(), accountStats.getTaskSevenDays()) && s6c.m47909a(getCallPreviousSevenDays(), accountStats.getCallPreviousSevenDays()) && s6c.m47909a(getWabaConversationPreviousSevenDays(), accountStats.getWabaConversationPreviousSevenDays()) && s6c.m47909a(getContactCreatedPreviousSevenDays(), accountStats.getContactCreatedPreviousSevenDays()) && s6c.m47909a(getBulkActionsSeventDays(), accountStats.getBulkActionsSeventDays()) && s6c.m47909a(getBulkActionsSeventDaysBulkUpload(), accountStats.getBulkActionsSeventDaysBulkUpload()) && s6c.m47909a(getBulkActionsSeventDaysCreateTag(), accountStats.getBulkActionsSeventDaysCreateTag()) && s6c.m47909a(getBulkActionsSeventDaysCampaignWithRule(), accountStats.getBulkActionsSeventDaysCampaignWithRule()) && s6c.m47909a(getBulkActionsSeventDaysBulkUpdate(), accountStats.getBulkActionsSeventDaysBulkUpdate()) && s6c.m47909a(getBulkActionsSeventDaysGenerateReport(), accountStats.getBulkActionsSeventDaysGenerateReport()) && s6c.m47909a(getBulkActionsSeventDaysRemoveUser(), accountStats.getBulkActionsSeventDaysRemoveUser()) && s6c.m47909a(getBulkActionsPreviousSeventDays(), accountStats.getBulkActionsPreviousSeventDays()) && s6c.m47909a(getOnboardingStepsDone(), accountStats.getOnboardingStepsDone());
    }

    public Integer getBulkActionsPreviousSeventDays() {
        return this.bulkActionsPreviousSeventDays;
    }

    public Integer getBulkActionsSeventDays() {
        return this.bulkActionsSeventDays;
    }

    public Integer getBulkActionsSeventDaysBulkUpdate() {
        return this.bulkActionsSeventDays_BULK_UPDATE;
    }

    public Integer getBulkActionsSeventDaysBulkUpload() {
        return this.bulkActionsSeventDays_BULK_UPLOAD;
    }

    public Integer getBulkActionsSeventDaysCampaignWithRule() {
        return this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE;
    }

    public Integer getBulkActionsSeventDaysCreateTag() {
        return this.bulkActionsSeventDays_CREATE_TAG;
    }

    public Integer getBulkActionsSeventDaysGenerateReport() {
        return this.bulkActionsSeventDays_GENERATE_REPORT;
    }

    public Integer getBulkActionsSeventDaysRemoveUser() {
        return this.bulkActionsSeventDays_REMOVE_USER;
    }

    public Integer getCallPreviousSevenDays() {
        return this.callPreviousSevenDays;
    }

    public Integer getCallSevenDays() {
        return this.callSevenDays;
    }

    public Integer getContactCreatedPreviousSevenDays() {
        return this.contactCreatedPreviousSevenDays;
    }

    public Integer getOnboardingStepsDone() {
        return this.onboardingStepsDone;
    }

    public Integer getPaymentSevenDays() {
        return this.paymentSevenDays;
    }

    public Integer getTaskSevenDays() {
        return this.taskSevenDays;
    }

    public Integer getWabaBroadcastSevenDays() {
        return this.wabaBroadcastSevenDays;
    }

    public Integer getWabaConversationPreviousSevenDays() {
        return this.wabaConversationPreviousSevenDays;
    }

    public Integer getWabaConversationSevenDays() {
        return this.wabaConversationSevenDays;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCallSevenDays());
        sb.append(getWabaConversationSevenDays());
        sb.append(getWabaBroadcastSevenDays());
        sb.append(getPaymentSevenDays());
        sb.append(getTaskSevenDays());
        sb.append(getCallPreviousSevenDays());
        sb.append(getWabaConversationPreviousSevenDays());
        sb.append(getContactCreatedPreviousSevenDays());
        sb.append(getBulkActionsSeventDays());
        sb.append(getBulkActionsSeventDaysBulkUpload());
        sb.append(getBulkActionsSeventDaysCreateTag());
        sb.append(getBulkActionsSeventDaysCampaignWithRule());
        sb.append(getBulkActionsSeventDaysBulkUpdate());
        sb.append(getBulkActionsSeventDaysGenerateReport());
        sb.append(getBulkActionsSeventDaysRemoveUser());
        sb.append(getBulkActionsPreviousSeventDays());
        sb.append(getOnboardingStepsDone());
        return sb.toString().hashCode();
    }

    private AccountStats(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17) {
        this.callSevenDays = num;
        this.wabaConversationSevenDays = num2;
        this.wabaBroadcastSevenDays = num3;
        this.paymentSevenDays = num4;
        this.taskSevenDays = num5;
        this.callPreviousSevenDays = num6;
        this.wabaConversationPreviousSevenDays = num7;
        this.contactCreatedPreviousSevenDays = num8;
        this.bulkActionsSeventDays = num9;
        this.bulkActionsSeventDays_BULK_UPLOAD = num10;
        this.bulkActionsSeventDays_CREATE_TAG = num11;
        this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE = num12;
        this.bulkActionsSeventDays_BULK_UPDATE = num13;
        this.bulkActionsSeventDays_GENERATE_REPORT = num14;
        this.bulkActionsSeventDays_REMOVE_USER = num15;
        this.bulkActionsPreviousSeventDays = num16;
        this.onboardingStepsDone = num17;
    }
}
