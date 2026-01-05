package ai.salesmax.model;

import java.util.ArrayList;
import java.util.List;
import p001o.kf9;
import p001o.nl7;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes.dex */
public final class FormAttachCondition$getFormAttributes$y$1 extends kf9 implements nl7 {
    public static final FormAttachCondition$getFormAttributes$y$1 INSTANCE = new FormAttachCondition$getFormAttributes$y$1();

    public FormAttachCondition$getFormAttributes$y$1() {
        super(2);
    }

    @Override // p001o.nl7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ArrayList<List<FormField>>) obj, (List<FormField>) obj2);
        return y3i.f54824a;
    }

    public final void invoke(ArrayList<List<FormField>> arrayList, List<FormField> list) {
        sq8.m48649h(arrayList, "a");
        sq8.m48649h(list, "b");
        arrayList.add(list);
    }
}
