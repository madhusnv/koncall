package ai.salesmax.model;

import java.util.List;
import java.util.stream.Stream;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class FormFields$listAllFormField$allFormFields$1 extends kf9 implements xk7 {
    public static final FormFields$listAllFormField$allFormFields$1 INSTANCE = new FormFields$listAllFormField$allFormFields$1();

    public FormFields$listAllFormField$allFormFields$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Stream<? extends FormField> invoke(List<FormField> list) {
        return list.stream();
    }
}
