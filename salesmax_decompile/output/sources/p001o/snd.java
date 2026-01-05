package p001o;

import ai.salesmax.custom.PropertyDefinitionRepository;
import com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class snd implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return PropertyDefinitionRepository.x1((CustomPropertyDefinitions) obj);
    }
}
