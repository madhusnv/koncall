package ai.salesmax.model;

import com.amazonaws.util.StringUtils;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class FormFields$listAllFormField$allFormFieldsPublishable$1 extends kf9 implements xk7 {
    public static final FormFields$listAllFormField$allFormFieldsPublishable$1 INSTANCE = new FormFields$listAllFormField$allFormFieldsPublishable$1();

    public FormFields$listAllFormField$allFormFieldsPublishable$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(FormField formField) {
        return Boolean.valueOf(!StringUtils.isBlank(formField.getFieldName()));
    }
}
