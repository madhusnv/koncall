package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ContextDataAggregator {
    private List<? extends DataCollector> dataCollectors;

    public ContextDataAggregator(String deviceId) {
        AbstractC4154l.m8923f(deviceId, "deviceId");
        this.dataCollectors = pe.m10834i(new ApplicationDataCollector(), new BuildDataCollector(), new DeviceDataCollector(deviceId));
    }

    public final Map<String, String> getAggregatedData(Context context) {
        AbstractC4154l.m8923f(context, "context");
        List<? extends DataCollector> list = this.dataCollectors;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC6663m.m12765x(arrayList, ((DataCollector) it.next()).collect(context).entrySet());
        }
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(arrayList, 10));
        if (iM12776d < 16) {
            iM12776d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Map.Entry entry = (Map.Entry) obj;
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getValue();
            if (str != null && str.length() != 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
