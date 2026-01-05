package p001o;

import ai.salesmax.model.WhatsAppTemplateSummary;
import com.amplifyframework.datastore.generated.model.WhasappTemplates;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class q7j implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new WhatsAppTemplateSummary((WhasappTemplates) obj);
    }
}
