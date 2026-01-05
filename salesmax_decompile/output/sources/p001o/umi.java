package p001o;

import android.content.Context;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class umi implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Context) obj).getApplicationContext();
    }
}
