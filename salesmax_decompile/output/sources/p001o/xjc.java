package p001o;

import ai.salesmax.services.model.ModelBusinessConnection;
import java.util.Collections;

/* loaded from: classes.dex */
public interface xjc extends me1 {
    default ModelBusinessConnection Ov() {
        return ModelBusinessConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }
}
