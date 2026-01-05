package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActionInteractiveKt$convertToKotlinActionInteractive$2$2$1 extends kf9 implements xk7 {
    public static final ActionInteractiveKt$convertToKotlinActionInteractive$2$2$1 INSTANCE = new ActionInteractiveKt$convertToKotlinActionInteractive$2$2$1();

    public ActionInteractiveKt$convertToKotlinActionInteractive$2$2$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final SectionRow invoke(com.amplifyframework.datastore.generated.model.SectionRow sectionRow) {
        return new SectionRow(sectionRow.getSectionRowId(), sectionRow.getSectionRowTitle(), sectionRow.getSectionRowDescription());
    }
}
