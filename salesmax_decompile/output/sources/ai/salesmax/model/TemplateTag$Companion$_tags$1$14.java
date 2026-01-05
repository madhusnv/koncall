package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Account;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class TemplateTag$Companion$_tags$1$14 extends kf9 implements xk7 {
    public static final TemplateTag$Companion$_tags$1$14 INSTANCE = new TemplateTag$Companion$_tags$1$14();

    public TemplateTag$Companion$_tags$1$14() {
        super(1);
    }

    @Override // p001o.xk7
    public final Object invoke(TemplateTagParams templateTagParams) {
        sq8.m48649h(templateTagParams, "it");
        Account account = templateTagParams.getAccount();
        String accountName = account != null ? account.getAccountName() : null;
        return accountName == null ? "" : accountName;
    }
}
