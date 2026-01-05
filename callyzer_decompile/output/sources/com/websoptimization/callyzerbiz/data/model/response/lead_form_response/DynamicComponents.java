package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DynamicComponents {

    @InterfaceC4485b("checkBox")
    private final List<CheckBox> checkBox;

    @InterfaceC4485b("dropDownBox")
    private final List<DropDownBox> dropDownBox;

    @InterfaceC4485b("inputBox")
    private final List<InputBox> inputBox;

    @InterfaceC4485b("radioBox")
    private final List<RadioBox> radioBox;

    public DynamicComponents(List<InputBox> inputBox, List<CheckBox> checkBox, List<RadioBox> radioBox, List<DropDownBox> dropDownBox) {
        AbstractC4154l.m8923f(inputBox, "inputBox");
        AbstractC4154l.m8923f(checkBox, "checkBox");
        AbstractC4154l.m8923f(radioBox, "radioBox");
        AbstractC4154l.m8923f(dropDownBox, "dropDownBox");
        this.inputBox = inputBox;
        this.checkBox = checkBox;
        this.radioBox = radioBox;
        this.dropDownBox = dropDownBox;
    }

    /* renamed from: a */
    public final List m4961a() {
        return this.checkBox;
    }

    /* renamed from: b */
    public final List m4962b() {
        return this.dropDownBox;
    }

    /* renamed from: c */
    public final List m4963c() {
        return this.inputBox;
    }

    /* renamed from: d */
    public final List m4964d() {
        return this.radioBox;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicComponents)) {
            return false;
        }
        DynamicComponents dynamicComponents = (DynamicComponents) obj;
        return AbstractC4154l.m8918a(this.inputBox, dynamicComponents.inputBox) && AbstractC4154l.m8918a(this.checkBox, dynamicComponents.checkBox) && AbstractC4154l.m8918a(this.radioBox, dynamicComponents.radioBox) && AbstractC4154l.m8918a(this.dropDownBox, dynamicComponents.dropDownBox);
    }

    public final int hashCode() {
        return this.dropDownBox.hashCode() + AbstractC1452a.m4559f(this.radioBox, AbstractC1452a.m4559f(this.checkBox, this.inputBox.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DynamicComponents(inputBox=" + this.inputBox + ", checkBox=" + this.checkBox + ", radioBox=" + this.radioBox + ", dropDownBox=" + this.dropDownBox + ")";
    }
}
