package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class InputBox {

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

    public InputBox(boolean z6, ComponentSettings componentSettings, String modelId, int i10, String label, String helpText) {
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
    public final ComponentSettings m4965a() {
        return this.componentSettings;
    }

    /* renamed from: b */
    public final int m4966b() {
        return this.displayOrder;
    }

    /* renamed from: c */
    public final String m4967c() {
        return this.helpText;
    }

    /* renamed from: d */
    public final String m4968d() {
        return this.label;
    }

    /* renamed from: e */
    public final String m4969e() {
        return this.modelId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputBox)) {
            return false;
        }
        InputBox inputBox = (InputBox) obj;
        return this.isRequired == inputBox.isRequired && AbstractC4154l.m8918a(this.componentSettings, inputBox.componentSettings) && AbstractC4154l.m8918a(this.modelId, inputBox.modelId) && this.displayOrder == inputBox.displayOrder && AbstractC4154l.m8918a(this.label, inputBox.label) && AbstractC4154l.m8918a(this.helpText, inputBox.helpText);
    }

    /* renamed from: f */
    public final boolean m4970f() {
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
        StringBuilder sb2 = new StringBuilder("InputBox(isRequired=");
        sb2.append(z6);
        sb2.append(", componentSettings=");
        sb2.append(componentSettings);
        sb2.append(", modelId=");
        AbstractC1452a.m4551B(sb2, str, ", displayOrder=", i10, ", label=");
        return AbstractC0030c.m124o(sb2, str2, ", helpText=", str3, ")");
    }
}
