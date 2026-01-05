package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class TemplateComponent {
    private final WaBody waBody;
    private final List<WaButton> waButton;
    private final WaFooter waFooter;
    private final WaHeader waHeader;

    public interface BuildStep {
        TemplateComponent build();

        BuildStep waBody(WaBody waBody);

        BuildStep waButton(List<WaButton> list);

        BuildStep waFooter(WaFooter waFooter);

        BuildStep waHeader(WaHeader waHeader);
    }

    public static class Builder implements BuildStep {
        private WaBody waBody;
        private List<WaButton> waButton;
        private WaFooter waFooter;
        private WaHeader waHeader;

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public TemplateComponent build() {
            return new TemplateComponent(this.waHeader, this.waBody, this.waFooter, this.waButton);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public BuildStep waBody(WaBody waBody) {
            this.waBody = waBody;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public BuildStep waButton(List<WaButton> list) {
            this.waButton = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public BuildStep waFooter(WaFooter waFooter) {
            this.waFooter = waFooter;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public BuildStep waHeader(WaHeader waHeader) {
            this.waHeader = waHeader;
            return this;
        }

        public Builder() {
        }

        private Builder(WaHeader waHeader, WaBody waBody, WaFooter waFooter, List<WaButton> list) {
            this.waHeader = waHeader;
            this.waBody = waBody;
            this.waFooter = waFooter;
            this.waButton = list;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.Builder, com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public /* bridge */ /* synthetic */ BuildStep waButton(List list) {
            return waButton((List<WaButton>) list);
        }

        private CopyOfBuilder(WaHeader waHeader, WaBody waBody, WaFooter waFooter, List<WaButton> list) {
            super(waHeader, waBody, waFooter, list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.Builder, com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public CopyOfBuilder waBody(WaBody waBody) {
            return (CopyOfBuilder) super.waBody(waBody);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.Builder, com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public CopyOfBuilder waButton(List<WaButton> list) {
            return (CopyOfBuilder) super.waButton(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.Builder, com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public CopyOfBuilder waFooter(WaFooter waFooter) {
            return (CopyOfBuilder) super.waFooter(waFooter);
        }

        @Override // com.amplifyframework.datastore.generated.model.TemplateComponent.Builder, com.amplifyframework.datastore.generated.model.TemplateComponent.BuildStep
        public CopyOfBuilder waHeader(WaHeader waHeader) {
            return (CopyOfBuilder) super.waHeader(waHeader);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.waHeader, this.waBody, this.waFooter, this.waButton);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TemplateComponent.class != obj.getClass()) {
            return false;
        }
        TemplateComponent templateComponent = (TemplateComponent) obj;
        return s6c.m47909a(getWaHeader(), templateComponent.getWaHeader()) && s6c.m47909a(getWaBody(), templateComponent.getWaBody()) && s6c.m47909a(getWaFooter(), templateComponent.getWaFooter()) && s6c.m47909a(getWaButton(), templateComponent.getWaButton());
    }

    public WaBody getWaBody() {
        return this.waBody;
    }

    public List<WaButton> getWaButton() {
        return this.waButton;
    }

    public WaFooter getWaFooter() {
        return this.waFooter;
    }

    public WaHeader getWaHeader() {
        return this.waHeader;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWaHeader());
        sb.append(getWaBody());
        sb.append(getWaFooter());
        sb.append(getWaButton());
        return sb.toString().hashCode();
    }

    private TemplateComponent(WaHeader waHeader, WaBody waBody, WaFooter waFooter, List<WaButton> list) {
        this.waHeader = waHeader;
        this.waBody = waBody;
        this.waFooter = waFooter;
        this.waButton = list;
    }
}
