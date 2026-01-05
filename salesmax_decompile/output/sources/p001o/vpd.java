package p001o;

import ai.salesmax.model.PropertyDefinition;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class vpd implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ PropertyDefinition f50704a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f50704a.setSystemProperty(((Boolean) obj).booleanValue());
    }
}
