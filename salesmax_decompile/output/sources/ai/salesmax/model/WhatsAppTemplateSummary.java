package ai.salesmax.model;

import ai.salesmax.model.WhatsAppTemplateSummary;
import com.amplifyframework.datastore.generated.model.TemplateComponent;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import com.amplifyframework.datastore.generated.model.WaBody;
import com.amplifyframework.datastore.generated.model.WaFooter;
import com.amplifyframework.datastore.generated.model.WaHeader;
import com.amplifyframework.datastore.generated.model.WhasappTemplates;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import p001o.a81;
import p001o.dh3;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class WhatsAppTemplateSummary {
    private WhasappTemplates underlyingWhatsAppTemplate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final WhasappTemplates newInstance() {
            WhasappTemplates whasappTemplatesBuild = WhasappTemplates.builder().accountId("").whatsappBusinessAccount("").id("").build();
            sq8.m48648g(whasappTemplatesBuild, "build(...)");
            return whasappTemplatesBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WhatsAppTemplateSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_archivedAt_$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_lastUsed_$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.underlyingWhatsAppTemplate.getAccountId();
    }

    public final Long getArchivedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingWhatsAppTemplate.getArchivedAt());
        final WhatsAppTemplateSummary$archivedAt$1 whatsAppTemplateSummary$archivedAt$1 = WhatsAppTemplateSummary$archivedAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.h8j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return WhatsAppTemplateSummary._get_archivedAt_$lambda$10(whatsAppTemplateSummary$archivedAt$1, obj);
            }
        }).orElse(null);
    }

    public final String getArchivedStatus() {
        return this.underlyingWhatsAppTemplate.getArchivedStatus();
    }

    public final String getCategory() {
        return this.underlyingWhatsAppTemplate.getCategory();
    }

    public final List<TemplateComponent> getComponents() {
        WaHeader waHeader;
        WaBody waBody;
        WaFooter waFooter;
        ArrayList arrayList;
        List<com.amplifyframework.datastore.generated.model.TemplateComponent> components = this.underlyingWhatsAppTemplate.getComponents();
        if (components == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(components, 10));
        for (com.amplifyframework.datastore.generated.model.TemplateComponent templateComponent : components) {
            com.amplifyframework.datastore.generated.model.WaHeader waHeader2 = templateComponent.getWaHeader();
            if (waHeader2 != null) {
                sq8.m48646e(waHeader2);
                waHeader = new WaHeader(waHeader2.getWaType(), waHeader2.getWaFormat(), waHeader2.getWaText(), waHeader2.getWaExample());
            } else {
                waHeader = null;
            }
            com.amplifyframework.datastore.generated.model.WaBody waBody2 = templateComponent.getWaBody();
            if (waBody2 != null) {
                sq8.m48646e(waBody2);
                waBody = new WaBody(waBody2.getWaType(), waBody2.getWaText(), waBody2.getWaExample());
            } else {
                waBody = null;
            }
            com.amplifyframework.datastore.generated.model.WaFooter waFooter2 = templateComponent.getWaFooter();
            if (waFooter2 != null) {
                sq8.m48646e(waFooter2);
                waFooter = new WaFooter(waFooter2.getWaType(), waFooter2.getWaText());
            } else {
                waFooter = null;
            }
            List<com.amplifyframework.datastore.generated.model.WaButton> waButton = templateComponent.getWaButton();
            if (waButton != null) {
                sq8.m48646e(waButton);
                arrayList = new ArrayList(dh3.m23088v(waButton, 10));
                for (com.amplifyframework.datastore.generated.model.WaButton waButton2 : waButton) {
                    arrayList.add(new WaButton(waButton2.getWaType(), waButton2.getWaText(), waButton2.getWaUrl(), waButton2.getWaNumber()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new TemplateComponent(waHeader, waBody, waFooter, arrayList));
        }
        return arrayList2;
    }

    public final Long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingWhatsAppTemplate.getCreatedAt());
        final WhatsAppTemplateSummary$createdAt$1 whatsAppTemplateSummary$createdAt$1 = WhatsAppTemplateSummary$createdAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.g8j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return WhatsAppTemplateSummary._get_createdAt_$lambda$15(whatsAppTemplateSummary$createdAt$1, obj);
            }
        }).orElse(null);
    }

    public final FileData getDefaultMedia() {
        UploadedFile defaultMedia = this.underlyingWhatsAppTemplate.getDefaultMedia();
        if (defaultMedia != null) {
            return new UploadedFileSummary(defaultMedia).toFileData();
        }
        return null;
    }

    public final List<MappedVariable> getDefaultVariableMap() {
        List<com.amplifyframework.datastore.generated.model.MappedVariable> defaultVariableMap = this.underlyingWhatsAppTemplate.getDefaultVariableMap();
        if (defaultVariableMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(defaultVariableMap, 10));
        for (com.amplifyframework.datastore.generated.model.MappedVariable mappedVariable : defaultVariableMap) {
            arrayList.add(new MappedVariable(mappedVariable.getTaType(), mappedVariable.getVariableId(), mappedVariable.getMappedObject(), mappedVariable.getMappedProperty(), mappedVariable.getFallBackValue(), null, null, 96, null));
        }
        return arrayList;
    }

    public final String getId() {
        return this.underlyingWhatsAppTemplate.getId();
    }

    public final String getLanguage() {
        return this.underlyingWhatsAppTemplate.getLanguage();
    }

    public final Long getLastUsed() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingWhatsAppTemplate.getLastUsed());
        final WhatsAppTemplateSummary$lastUsed$1 whatsAppTemplateSummary$lastUsed$1 = WhatsAppTemplateSummary$lastUsed$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.j8j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return WhatsAppTemplateSummary._get_lastUsed_$lambda$12(whatsAppTemplateSummary$lastUsed$1, obj);
            }
        }).orElse(null);
    }

    public final String getName() {
        return this.underlyingWhatsAppTemplate.getName();
    }

    public final String getPlatform() {
        return this.underlyingWhatsAppTemplate.getPlatform();
    }

    public final String getStatus() {
        return this.underlyingWhatsAppTemplate.getStatus();
    }

    public final List<String> getTags() {
        return this.underlyingWhatsAppTemplate.getTags();
    }

    public final String getTemplateId() {
        return this.underlyingWhatsAppTemplate.getTemplateId();
    }

    public final WhasappTemplates getUnderlyingWhatsAppTemplate() {
        return this.underlyingWhatsAppTemplate;
    }

    public final Long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingWhatsAppTemplate.getUpdatedAt());
        final WhatsAppTemplateSummary$updatedAt$1 whatsAppTemplateSummary$updatedAt$1 = WhatsAppTemplateSummary$updatedAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.i8j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return WhatsAppTemplateSummary._get_updatedAt_$lambda$14(whatsAppTemplateSummary$updatedAt$1, obj);
            }
        }).orElse(null);
    }

    public final String getWhatsappBusinessAccount() {
        return this.underlyingWhatsAppTemplate.getWhatsappBusinessAccount();
    }

    public final void setAccountId(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().accountId(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setArchivedAt(Long l) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().archivedAt(l != null ? a81.m16658m(Long.valueOf(l.longValue())) : null).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setArchivedStatus(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().archivedStatus(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setCategory(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().category(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setComponents(List<TemplateComponent> list) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(dh3.m23088v(list, 10));
            for (TemplateComponent templateComponent : list) {
                TemplateComponent.BuildStep buildStepBuilder = com.amplifyframework.datastore.generated.model.TemplateComponent.builder();
                WaHeader.BuildStep buildStepBuilder2 = com.amplifyframework.datastore.generated.model.WaHeader.builder();
                WaBody waBody = templateComponent.getWaBody();
                WaHeader.BuildStep buildStepWaText = buildStepBuilder2.waText(waBody != null ? waBody.getWaText() : null);
                WaBody waBody2 = templateComponent.getWaBody();
                WaHeader.BuildStep buildStepWaType = buildStepWaText.waType(waBody2 != null ? waBody2.getWaType() : null);
                WaBody waBody3 = templateComponent.getWaBody();
                TemplateComponent.BuildStep buildStepWaHeader = buildStepBuilder.waHeader(buildStepWaType.waText(waBody3 != null ? waBody3.getWaExample() : null).build());
                List<WaButton> waButton = templateComponent.getWaButton();
                if (waButton != null) {
                    arrayList = new ArrayList(dh3.m23088v(waButton, 10));
                    for (WaButton waButton2 : waButton) {
                        arrayList.add(com.amplifyframework.datastore.generated.model.WaButton.builder().waType(waButton2.getWaType()).waText(waButton2.getWaText()).waUrl(waButton2.getWaUrl()).waNumber(waButton2.getWaNumber()).build());
                    }
                } else {
                    arrayList = null;
                }
                TemplateComponent.BuildStep buildStepWaButton = buildStepWaHeader.waButton(arrayList);
                WaBody.BuildStep buildStepBuilder3 = com.amplifyframework.datastore.generated.model.WaBody.builder();
                WaBody waBody4 = templateComponent.getWaBody();
                WaBody.BuildStep buildStepWaText2 = buildStepBuilder3.waText(waBody4 != null ? waBody4.getWaText() : null);
                WaBody waBody5 = templateComponent.getWaBody();
                WaBody.BuildStep buildStepWaType2 = buildStepWaText2.waType(waBody5 != null ? waBody5.getWaType() : null);
                WaBody waBody6 = templateComponent.getWaBody();
                TemplateComponent.BuildStep buildStepWaBody = buildStepWaButton.waBody(buildStepWaType2.waExample(waBody6 != null ? waBody6.getWaExample() : null).build());
                WaFooter.BuildStep buildStepBuilder4 = com.amplifyframework.datastore.generated.model.WaFooter.builder();
                WaFooter waFooter = templateComponent.getWaFooter();
                WaFooter.BuildStep buildStepWaText3 = buildStepBuilder4.waText(waFooter != null ? waFooter.getWaText() : null);
                WaFooter waFooter2 = templateComponent.getWaFooter();
                arrayList3.add(buildStepWaBody.waFooter(buildStepWaText3.waType(waFooter2 != null ? waFooter2.getWaType() : null).build()).build());
            }
            arrayList2 = arrayList3;
        }
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().components((List<com.amplifyframework.datastore.generated.model.TemplateComponent>) arrayList2).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setDefaultMedia(FileData fileData) {
        UploadedFileSummary uploadedFileSummary;
        WhasappTemplates.CopyOfBuilder copyOfBuilder = this.underlyingWhatsAppTemplate.copyOfBuilder();
        UploadedFile underlyingUploadedFile = null;
        if (fileData != null && (uploadedFileSummary = fileData.toUploadedFileSummary(null)) != null) {
            underlyingUploadedFile = uploadedFileSummary.getUnderlyingUploadedFile();
        }
        WhasappTemplates whasappTemplatesBuild = copyOfBuilder.defaultMedia(underlyingUploadedFile).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setDefaultVariableMap(List<MappedVariable> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(dh3.m23088v(list, 10));
            for (MappedVariable mappedVariable : list) {
                arrayList.add(com.amplifyframework.datastore.generated.model.MappedVariable.builder().variableId(mappedVariable.getVariableId()).fallBackValue(mappedVariable.getFallBackValue()).mappedObject(mappedVariable.getMappedObject()).mappedProperty(mappedVariable.getMappedProperty()).taType(mappedVariable.getTaType()).build());
            }
        } else {
            arrayList = null;
        }
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().defaultVariableMap((List<com.amplifyframework.datastore.generated.model.MappedVariable>) arrayList).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setId(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().id(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setLanguage(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().language(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setLastUsed(Long l) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().lastUsed(l != null ? a81.m16658m(Long.valueOf(l.longValue())) : null).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setName(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().name(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setPlatform(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().platform(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setStatus(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().status(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setTags(List<String> list) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().tags(list).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setTemplateId(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().templateId(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final void setUnderlyingWhatsAppTemplate(WhasappTemplates whasappTemplates) {
        sq8.m48649h(whasappTemplates, "<set-?>");
        this.underlyingWhatsAppTemplate = whasappTemplates;
    }

    public final void setWhatsappBusinessAccount(String str) {
        WhasappTemplates whasappTemplatesBuild = this.underlyingWhatsAppTemplate.copyOfBuilder().whatsappBusinessAccount(str).build();
        sq8.m48648g(whasappTemplatesBuild, "build(...)");
        this.underlyingWhatsAppTemplate = whasappTemplatesBuild;
    }

    public final WhatsAppTemplates toWhatsAppTemplates() {
        String id = getId();
        String str = id == null ? "" : id;
        String accountId = getAccountId();
        return new WhatsAppTemplates(str, accountId == null ? "" : accountId, getName(), getWhatsappBusinessAccount(), getPlatform(), getCategory(), getStatus(), getTags(), getTemplateId(), getLanguage(), getDefaultVariableMap(), getComponents(), getDefaultMedia(), getArchivedStatus(), getArchivedAt(), getLastUsed(), false, false, false, false, null, getUpdatedAt(), getCreatedAt(), 2031616, null);
    }

    public WhatsAppTemplateSummary(WhasappTemplates whasappTemplates) {
        sq8.m48649h(whasappTemplates, "underlyingWhatsAppTemplate");
        this.underlyingWhatsAppTemplate = whasappTemplates;
    }

    public /* synthetic */ WhatsAppTemplateSummary(WhasappTemplates whasappTemplates, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : whasappTemplates);
    }
}
