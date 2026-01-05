package p001o;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ri9 {
    private final Map zza = new HashMap();

    public abstract Object create(Object obj);

    @KeepForSdk
    public Object get(Object obj) {
        synchronized (this.zza) {
            if (this.zza.containsKey(obj)) {
                return this.zza.get(obj);
            }
            Object objCreate = create(obj);
            this.zza.put(obj, objCreate);
            return objCreate;
        }
    }
}
