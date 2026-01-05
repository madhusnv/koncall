package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Account;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class TemplateTag$Companion$_tags$1$13 extends kf9 implements xk7 {
    public static final TemplateTag$Companion$_tags$1$13 INSTANCE = new TemplateTag$Companion$_tags$1$13();

    public TemplateTag$Companion$_tags$1$13() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(TemplateTagParams templateTagParams) {
        sq8.m48649h(templateTagParams, "it");
        Account account = templateTagParams.getAccount();
        String nameOfBusiness = account != null ? account.getNameOfBusiness() : null;
        return nameOfBusiness == null ? "" : nameOfBusiness;
    }
}
