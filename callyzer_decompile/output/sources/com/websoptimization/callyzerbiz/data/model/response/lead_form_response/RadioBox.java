package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class RadioBox {

    @InterfaceC4485b("componentSettings")
    private final ComponentSettings componentSettings;

    @InterfaceC4485b("displayOrder")
    private final int displayOrder;

    @InterfaceC4485b("helpText")
    private final String helpText;

    @InterfaceC4485b("isRequired")
    private final boolean isRequired;

    @InterfaceC4485b(AnnotatedPrivateKey.LABEL)
    private final String label;

    @InterfaceC4485b("modelId")
    private final String modelId;

    public RadioBox(boolean z6, ComponentSettings componentSettings, String modelId, int i10, String label, String helpText) {
        AbstractC4154l.m8923f(componentSettings, "componentSettings");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        AbstractC4154l.m8923f(helpText, "helpText");
        this.isRequired = z6;
        this.componentSettings = componentSettings;
        this.modelId = modelId;
        this.displayOrder = i10;
        this.label = label;
        this.helpText = helpText;
    }

    /* renamed from: a */
    public final ComponentSettings m4976a() {
        return this.componentSettings;
    }

    /* renamed from: b */
    public final int m4977b() {
        return this.displayOrder;
    }

    /* renamed from: c */
    public final String m4978c() {
        return this.helpText;
    }

    /* renamed from: d */
    public final String m4979d() {
        return this.label;
    }

    /* renamed from: e */
    public final String m4980e() {
        return this.modelId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioBox)) {
            return false;
        }
        RadioBox radioBox = (RadioBox) obj;
        return this.isRequired == radioBox.isRequired && AbstractC4154l.m8918a(this.componentSettings, radioBox.componentSettings) && AbstractC4154l.m8918a(this.modelId, radioBox.modelId) && this.displayOrder == radioBox.displayOrder && AbstractC4154l.m8918a(this.label, radioBox.label) && AbstractC4154l.m8918a(this.helpText, radioBox.helpText);
    }

    /* renamed from: f */
    public final boolean m4981f() {
        return this.isRequired;
    }

    public final int hashCode() {
        return this.helpText.hashCode() + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.displayOrder, AbstractC0030c.m113d((this.componentSettings.hashCode() + (Boolean.hashCode(this.isRequired) * 31)) * 31, 31, this.modelId), 31), 31, this.label);
    }

    public final String toString() {
        boolean z6 = this.isRequired;
        ComponentSettings componentSettings = this.componentSettings;
        String str = this.modelId;
        int i10 = this.displayOrder;
        String str2 = this.label;
        String str3 = this.helpText;
        StringBuilder sb2 = new StringBuilder("RadioBox(isRequired=");
        sb2.append(z6);
        sb2.append(", componentSettings=");
        sb2.append(componentSettings);
        sb2.append(", modelId=");
        AbstractC1452a.m4551B(sb2, str, ", displayOrder=", i10, ", label=");
        return AbstractC0030c.m124o(sb2, str2, ", helpText=", str3, ")");
    }
}
