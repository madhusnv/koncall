package p001o;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class kg1 extends bg1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg1(String str, Bundle bundle, k32 k32Var) {
        super(str, bundle, k32Var);
        sq8.m48649h(str, "type");
        sq8.m48649h(bundle, "candidateQueryData");
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("type should not be empty".toString());
        }
    }
}
