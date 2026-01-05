package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class FormFields$listAllFormField$allFormFields$2 extends kf9 implements xk7 {
    public static final FormFields$listAllFormField$allFormFields$2 INSTANCE = new FormFields$listAllFormField$allFormFields$2();

    public FormFields$listAllFormField$allFormFields$2() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(FormField formField) {
        return Boolean.valueOf(formField.initVisibility());
    }
}
