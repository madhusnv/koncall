package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class FormFields$listAllFormField$4$1$1$6 extends kf9 implements xk7 {
    public static final FormFields$listAllFormField$4$1$1$6 INSTANCE = new FormFields$listAllFormField$4$1$1$6();

    public FormFields$listAllFormField$4$1$1$6() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(FormField formField) {
        return Boolean.valueOf(formField.isVisible().m5959i());
    }
}
