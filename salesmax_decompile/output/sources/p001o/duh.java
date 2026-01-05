package p001o;

import ai.salesmax.model.TrackingUrl;
import com.amplifyframework.datastore.generated.model.LinkShare;

/* loaded from: classes.dex */
public abstract class duh {
    /* renamed from: a */
    public static x6c m23855a(TrackingUrl trackingUrl) {
        return uni.kC().TB().T1(trackingUrl).d0(new rl7() { // from class: o.cuh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((LinkShare) obj).getId();
            }
        });
    }
}
