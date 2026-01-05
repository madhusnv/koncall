package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DropDownBox {

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

    public DropDownBox(boolean z6, ComponentSettings componentSettings, String helpText, String modelId, int i10, String label) {
        AbstractC4154l.m8923f(componentSettings, "componentSettings");
        AbstractC4154l.m8923f(helpText, "helpText");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.isRequired = z6;
        this.componentSettings = componentSettings;
        this.helpText = helpText;
        this.modelId = modelId;
        this.displayOrder = i10;
        this.label = label;
    }

    /* renamed from: a */
    public final ComponentSettings m4955a() {
        return this.componentSettings;
    }

    /* renamed from: b */
    public final int m4956b() {
        return this.displayOrder;
    }

    /* renamed from: c */
    public final String m4957c() {
        return this.helpText;
    }

    /* renamed from: d */
    public final String m4958d() {
        return this.label;
    }

    /* renamed from: e */
    public final String m4959e() {
        return this.modelId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropDownBox)) {
            return false;
        }
        DropDownBox dropDownBox = (DropDownBox) obj;
        return this.isRequired == dropDownBox.isRequired && AbstractC4154l.m8918a(this.componentSettings, dropDownBox.componentSettings) && AbstractC4154l.m8918a(this.helpText, dropDownBox.helpText) && AbstractC4154l.m8918a(this.modelId, dropDownBox.modelId) && this.displayOrder == dropDownBox.displayOrder && AbstractC4154l.m8918a(this.label, dropDownBox.label);
    }

    /* renamed from: f */
    public final boolean m4960f() {
        return this.isRequired;
    }

    public final int hashCode() {
        return this.label.hashCode() + AbstractC1452a.m4556c(this.displayOrder, AbstractC0030c.m113d(AbstractC0030c.m113d((this.componentSettings.hashCode() + (Boolean.hashCode(this.isRequired) * 31)) * 31, 31, this.helpText), 31, this.modelId), 31);
    }

    public final String toString() {
        boolean z6 = this.isRequired;
        ComponentSettings componentSettings = this.componentSettings;
        String str = this.helpText;
        String str2 = this.modelId;
        int i10 = this.displayOrder;
        String str3 = this.label;
        StringBuilder sb2 = new StringBuilder("DropDownBox(isRequired=");
        sb2.append(z6);
        sb2.append(", componentSettings=");
        sb2.append(componentSettings);
        sb2.append(", helpText=");
        a1.m14319B(sb2, str, ", modelId=", str2, ", displayOrder=");
        sb2.append(i10);
        sb2.append(", label=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }
}
