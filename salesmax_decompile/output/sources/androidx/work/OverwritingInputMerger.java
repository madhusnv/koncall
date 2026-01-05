package androidx.work;

import androidx.work.Data;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class OverwritingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public Data merge(List<Data> list) {
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().getKeyValueMap());
        }
        builder.putAll(map);
        return builder.build();
    }
}
