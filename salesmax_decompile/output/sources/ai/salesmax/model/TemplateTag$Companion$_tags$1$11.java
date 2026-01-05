package ai.salesmax.model;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class TemplateTag$Companion$_tags$1$11 extends kf9 implements xk7 {
    public static final TemplateTag$Companion$_tags$1$11 INSTANCE = new TemplateTag$Companion$_tags$1$11();

    public TemplateTag$Companion$_tags$1$11() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(TemplateTagParams templateTagParams) {
        sq8.m48649h(templateTagParams, "it");
        LeadsUser user = templateTagParams.getUser();
        String registeredNumber = user != null ? user.getRegisteredNumber() : null;
        return registeredNumber == null ? "" : registeredNumber;
    }
}
