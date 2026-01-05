package ai.salesmax.model;

import p001o.kf9;
import p001o.sq8;
import p001o.th1;
import p001o.xk7;

/* loaded from: classes.dex */
public final class TemplateTag$Companion$_tags$1$7 extends kf9 implements xk7 {
    public static final TemplateTag$Companion$_tags$1$7 INSTANCE = new TemplateTag$Companion$_tags$1$7();

    public TemplateTag$Companion$_tags$1$7() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(TemplateTagParams templateTagParams) {
        String company;
        sq8.m48649h(templateTagParams, "it");
        Leads lead = templateTagParams.getLead();
        String strM49850b = (lead == null || (company = lead.getCompany()) == null) ? null : th1.m49850b(company);
        return strM49850b == null ? "" : strM49850b;
    }
}
