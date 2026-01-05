package ai.salesmax.model;

import java.util.Date;
import p001o.a81;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class TemplateTag$Companion$_tags$1$5 extends kf9 implements xk7 {
    public static final TemplateTag$Companion$_tags$1$5 INSTANCE = new TemplateTag$Companion$_tags$1$5();

    public TemplateTag$Companion$_tags$1$5() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(TemplateTagParams templateTagParams) {
        Date lastCalledTime;
        sq8.m48649h(templateTagParams, "it");
        Leads lead = templateTagParams.getLead();
        if (lead == null || (lastCalledTime = lead.getLastCalledTime()) == null) {
            return null;
        }
        return a81.m16655j(lastCalledTime);
    }
}
