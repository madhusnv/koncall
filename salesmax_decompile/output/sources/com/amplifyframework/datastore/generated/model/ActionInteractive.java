package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ActionInteractive {
    private final String actionName;
    private final String addressCountry;
    private final String button;
    private final List<ReplyButton> buttons;
    private final String catalog_id;
    private final String ctaUrl;
    private final String display_text;
    private final String flow_action;
    private final FlowActionPayload flow_action_payload;
    private final String flow_cta;
    private final String flow_id;
    private final String flow_message_version;
    private final String flow_mode;
    private final String flow_token;
    private final String product_retailer_id;
    private final List<String> savedAddresses;
    private final List<SectionInteractive> sections;

    public interface BuildStep {
        BuildStep actionName(String str);

        BuildStep addressCountry(String str);

        ActionInteractive build();

        BuildStep button(String str);

        BuildStep buttons(List<ReplyButton> list);

        BuildStep catalogId(String str);

        BuildStep ctaUrl(String str);

        BuildStep displayText(String str);

        BuildStep flowAction(String str);

        BuildStep flowActionPayload(FlowActionPayload flowActionPayload);

        BuildStep flowCta(String str);

        BuildStep flowId(String str);

        BuildStep flowMessageVersion(String str);

        BuildStep flowMode(String str);

        BuildStep flowToken(String str);

        BuildStep productRetailerId(String str);

        BuildStep savedAddresses(List<String> list);

        BuildStep sections(List<SectionInteractive> list);
    }

    public static class Builder implements BuildStep {
        private String actionName;
        private String addressCountry;
        private String button;
        private List<ReplyButton> buttons;
        private String catalog_id;
        private String ctaUrl;
        private String display_text;
        private String flow_action;
        private FlowActionPayload flow_action_payload;
        private String flow_cta;
        private String flow_id;
        private String flow_message_version;
        private String flow_mode;
        private String flow_token;
        private String product_retailer_id;
        private List<String> savedAddresses;
        private List<SectionInteractive> sections;

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep actionName(String str) {
            this.actionName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep addressCountry(String str) {
            this.addressCountry = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public ActionInteractive build() {
            return new ActionInteractive(this.actionName, this.display_text, this.ctaUrl, this.addressCountry, this.savedAddresses, this.button, this.buttons, this.catalog_id, this.product_retailer_id, this.sections, this.flow_mode, this.flow_message_version, this.flow_token, this.flow_id, this.flow_cta, this.flow_action, this.flow_action_payload);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep button(String str) {
            this.button = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep buttons(List<ReplyButton> list) {
            this.buttons = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep catalogId(String str) {
            this.catalog_id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep ctaUrl(String str) {
            this.ctaUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep displayText(String str) {
            this.display_text = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep flowAction(String str) {
            this.flow_action = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep flowActionPayload(FlowActionPayload flowActionPayload) {
            this.flow_action_payload = flowActionPayload;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep flowCta(String str) {
            this.flow_cta = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep flowId(String str) {
            this.flow_id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep flowMessageVersion(String str) {
            this.flow_message_version = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep flowMode(String str) {
            this.flow_mode = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep flowToken(String str) {
            this.flow_token = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep productRetailerId(String str) {
            this.product_retailer_id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep savedAddresses(List<String> list) {
            this.savedAddresses = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public BuildStep sections(List<SectionInteractive> list) {
            this.sections = list;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, List<String> list, String str5, List<ReplyButton> list2, String str6, String str7, List<SectionInteractive> list3, String str8, String str9, String str10, String str11, String str12, String str13, FlowActionPayload flowActionPayload) {
            this.actionName = str;
            this.display_text = str2;
            this.ctaUrl = str3;
            this.addressCountry = str4;
            this.savedAddresses = list;
            this.button = str5;
            this.buttons = list2;
            this.catalog_id = str6;
            this.product_retailer_id = str7;
            this.sections = list3;
            this.flow_mode = str8;
            this.flow_message_version = str9;
            this.flow_token = str10;
            this.flow_id = str11;
            this.flow_cta = str12;
            this.flow_action = str13;
            this.flow_action_payload = flowActionPayload;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public /* bridge */ /* synthetic */ BuildStep buttons(List list) {
            return buttons((List<ReplyButton>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public /* bridge */ /* synthetic */ BuildStep savedAddresses(List list) {
            return savedAddresses((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public /* bridge */ /* synthetic */ BuildStep sections(List list) {
            return sections((List<SectionInteractive>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, List<String> list, String str5, List<ReplyButton> list2, String str6, String str7, List<SectionInteractive> list3, String str8, String str9, String str10, String str11, String str12, String str13, FlowActionPayload flowActionPayload) {
            super(str, ActionInteractive.this.display_text, str3, str4, list, str5, list2, ActionInteractive.this.catalog_id, ActionInteractive.this.product_retailer_id, list3, ActionInteractive.this.flow_mode, ActionInteractive.this.flow_message_version, ActionInteractive.this.flow_token, ActionInteractive.this.flow_id, ActionInteractive.this.flow_cta, ActionInteractive.this.flow_action, ActionInteractive.this.flow_action_payload);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder actionName(String str) {
            return (CopyOfBuilder) super.actionName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder addressCountry(String str) {
            return (CopyOfBuilder) super.addressCountry(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder button(String str) {
            return (CopyOfBuilder) super.button(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder buttons(List<ReplyButton> list) {
            return (CopyOfBuilder) super.buttons(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder catalogId(String str) {
            return (CopyOfBuilder) super.catalogId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder ctaUrl(String str) {
            return (CopyOfBuilder) super.ctaUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder displayText(String str) {
            return (CopyOfBuilder) super.displayText(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder flowAction(String str) {
            return (CopyOfBuilder) super.flowAction(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder flowActionPayload(FlowActionPayload flowActionPayload) {
            return (CopyOfBuilder) super.flowActionPayload(flowActionPayload);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder flowCta(String str) {
            return (CopyOfBuilder) super.flowCta(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder flowId(String str) {
            return (CopyOfBuilder) super.flowId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder flowMessageVersion(String str) {
            return (CopyOfBuilder) super.flowMessageVersion(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder flowMode(String str) {
            return (CopyOfBuilder) super.flowMode(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder flowToken(String str) {
            return (CopyOfBuilder) super.flowToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder productRetailerId(String str) {
            return (CopyOfBuilder) super.productRetailerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder savedAddresses(List<String> list) {
            return (CopyOfBuilder) super.savedAddresses(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActionInteractive.Builder, com.amplifyframework.datastore.generated.model.ActionInteractive.BuildStep
        public CopyOfBuilder sections(List<SectionInteractive> list) {
            return (CopyOfBuilder) super.sections(list);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.actionName, this.display_text, this.ctaUrl, this.addressCountry, this.savedAddresses, this.button, this.buttons, this.catalog_id, this.product_retailer_id, this.sections, this.flow_mode, this.flow_message_version, this.flow_token, this.flow_id, this.flow_cta, this.flow_action, this.flow_action_payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActionInteractive.class != obj.getClass()) {
            return false;
        }
        ActionInteractive actionInteractive = (ActionInteractive) obj;
        return s6c.m47909a(getActionName(), actionInteractive.getActionName()) && s6c.m47909a(getDisplayText(), actionInteractive.getDisplayText()) && s6c.m47909a(getCtaUrl(), actionInteractive.getCtaUrl()) && s6c.m47909a(getAddressCountry(), actionInteractive.getAddressCountry()) && s6c.m47909a(getSavedAddresses(), actionInteractive.getSavedAddresses()) && s6c.m47909a(getButton(), actionInteractive.getButton()) && s6c.m47909a(getButtons(), actionInteractive.getButtons()) && s6c.m47909a(getCatalogId(), actionInteractive.getCatalogId()) && s6c.m47909a(getProductRetailerId(), actionInteractive.getProductRetailerId()) && s6c.m47909a(getSections(), actionInteractive.getSections()) && s6c.m47909a(getFlowMode(), actionInteractive.getFlowMode()) && s6c.m47909a(getFlowMessageVersion(), actionInteractive.getFlowMessageVersion()) && s6c.m47909a(getFlowToken(), actionInteractive.getFlowToken()) && s6c.m47909a(getFlowId(), actionInteractive.getFlowId()) && s6c.m47909a(getFlowCta(), actionInteractive.getFlowCta()) && s6c.m47909a(getFlowAction(), actionInteractive.getFlowAction()) && s6c.m47909a(getFlowActionPayload(), actionInteractive.getFlowActionPayload());
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getAddressCountry() {
        return this.addressCountry;
    }

    public String getButton() {
        return this.button;
    }

    public List<ReplyButton> getButtons() {
        return this.buttons;
    }

    public String getCatalogId() {
        return this.catalog_id;
    }

    public String getCtaUrl() {
        return this.ctaUrl;
    }

    public String getDisplayText() {
        return this.display_text;
    }

    public String getFlowAction() {
        return this.flow_action;
    }

    public FlowActionPayload getFlowActionPayload() {
        return this.flow_action_payload;
    }

    public String getFlowCta() {
        return this.flow_cta;
    }

    public String getFlowId() {
        return this.flow_id;
    }

    public String getFlowMessageVersion() {
        return this.flow_message_version;
    }

    public String getFlowMode() {
        return this.flow_mode;
    }

    public String getFlowToken() {
        return this.flow_token;
    }

    public String getProductRetailerId() {
        return this.product_retailer_id;
    }

    public List<String> getSavedAddresses() {
        return this.savedAddresses;
    }

    public List<SectionInteractive> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return (getActionName() + getDisplayText() + getCtaUrl() + getAddressCountry() + getSavedAddresses() + getButton() + getButtons() + getCatalogId() + getProductRetailerId() + getSections() + getFlowMode() + getFlowMessageVersion() + getFlowToken() + getFlowId() + getFlowCta() + getFlowAction() + getFlowActionPayload()).hashCode();
    }

    private ActionInteractive(String str, String str2, String str3, String str4, List<String> list, String str5, List<ReplyButton> list2, String str6, String str7, List<SectionInteractive> list3, String str8, String str9, String str10, String str11, String str12, String str13, FlowActionPayload flowActionPayload) {
        this.actionName = str;
        this.display_text = str2;
        this.ctaUrl = str3;
        this.addressCountry = str4;
        this.savedAddresses = list;
        this.button = str5;
        this.buttons = list2;
        this.catalog_id = str6;
        this.product_retailer_id = str7;
        this.sections = list3;
        this.flow_mode = str8;
        this.flow_message_version = str9;
        this.flow_token = str10;
        this.flow_id = str11;
        this.flow_cta = str12;
        this.flow_action = str13;
        this.flow_action_payload = flowActionPayload;
    }
}
