package ai.salesmax.model;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class TemplateTag$Companion$_tags$1$9 extends kf9 implements xk7 {
    public static final TemplateTag$Companion$_tags$1$9 INSTANCE = new TemplateTag$Companion$_tags$1$9();

    public TemplateTag$Companion$_tags$1$9() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(TemplateTagParams templateTagParams) {
        sq8.m48649h(templateTagParams, "it");
        LeadsUser user = templateTagParams.getUser();
        String designation = user != null ? user.getDesignation() : null;
        return designation == null ? "" : designation;
    }
}
