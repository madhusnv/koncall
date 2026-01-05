package ai.salesmax.model;

import java.util.ArrayList;
import p001o.kf9;
import p001o.nl7;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes.dex */
public final class FormAttachCondition$getFormAttributes$x$1 extends kf9 implements nl7 {
    public static final FormAttachCondition$getFormAttributes$x$1 INSTANCE = new FormAttachCondition$getFormAttributes$x$1();

    public FormAttachCondition$getFormAttributes$x$1() {
        super(2);
    }

    @Override // p001o.nl7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ArrayList<FormField>) obj, (FormField) obj2);
        return y3i.f54824a;
    }

    public final void invoke(ArrayList<FormField> arrayList, FormField formField) {
        sq8.m48649h(arrayList, "a");
        sq8.m48649h(formField, "b");
        arrayList.add(formField);
    }
}
