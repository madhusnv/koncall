package ai.salesmax.model;

import p001o.kf9;
import p001o.sq8;
import p001o.th1;
import p001o.xk7;

/* loaded from: classes.dex */
public final class TemplateTag$Companion$_tags$1$8 extends kf9 implements xk7 {
    public static final TemplateTag$Companion$_tags$1$8 INSTANCE = new TemplateTag$Companion$_tags$1$8();

    public TemplateTag$Companion$_tags$1$8() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(TemplateTagParams templateTagParams) {
        String name;
        sq8.m48649h(templateTagParams, "it");
        LeadsUser user = templateTagParams.getUser();
        String strM49850b = (user == null || (name = user.getName()) == null) ? null : th1.m49850b(name);
        return strM49850b == null ? "" : strM49850b;
    }
}
