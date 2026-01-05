package p001o;

import com.amplifyframework.datastore.generated.model.UploadedFile;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class lr2 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((UploadedFile) obj).getId();
    }
}
