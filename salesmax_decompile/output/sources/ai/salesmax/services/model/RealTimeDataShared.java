package ai.salesmax.services.model;

import ai.salesmax.services.model.RealTimeDataShared;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import p001o.jm;
import p001o.z9b;

/* loaded from: classes.dex */
public class RealTimeDataShared<K, V> extends z9b {
    private final Function<Map<K, V>, String> messageFormatter;
    private jm onClear = new jm() { // from class: o.jde
        @Override // p001o.jm
        public final void run() {
            RealTimeDataShared.lambda$new$0();
        }
    };
    private final Map<K, V> items = Collections.synchronizedMap(new LinkedHashMap());

    public RealTimeDataShared(Function<Map<K, V>, String> function) {
        this.messageFormatter = function;
    }

    private void changeValue(final Map<K, V> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.kde
            @Override // java.lang.Runnable
            public final void run() {
                this.f31995a.lambda$changeValue$1(map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeValue$1(Map map) {
        setValue(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }

    public void clear() {
        try {
            this.items.clear();
            this.onClear.run();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public void doOnClear(jm jmVar) {
        this.onClear = jmVar;
    }

    public String getRealtimeAlert() {
        return this.messageFormatter.apply(this.items);
    }

    public List<V> popAll() {
        ArrayList arrayList = new ArrayList(this.items.values());
        this.items.clear();
        changeValue(this.items);
        return arrayList;
    }

    public void pushSingle(K k, V v) {
        if (this.items.containsKey(k)) {
            this.items.put(k, v);
        } else {
            this.items.put(k, v);
            changeValue(this.items);
        }
    }
}
