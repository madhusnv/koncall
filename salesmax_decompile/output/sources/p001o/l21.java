package p001o;

import com.amazonaws.util.StringUtils;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class l21 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(StringUtils.isBlank((String) obj));
    }
}
