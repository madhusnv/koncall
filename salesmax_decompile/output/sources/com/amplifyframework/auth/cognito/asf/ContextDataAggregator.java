package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.bce;
import p001o.ch3;
import p001o.dh3;
import p001o.hh3;
import p001o.hsa;
import p001o.hwc;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes5.dex */
public final class ContextDataAggregator {
    private List<? extends DataCollector> dataCollectors;

    public ContextDataAggregator(String str) {
        sq8.m48649h(str, "deviceId");
        this.dataCollectors = ch3.m21249n(new ApplicationDataCollector(), new BuildDataCollector(), new DeviceDataCollector(str));
    }

    public final Map<String, String> getAggregatedData(Context context) {
        sq8.m48649h(context, "context");
        List<? extends DataCollector> list = this.dataCollectors;
        ArrayList<Map.Entry> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList, ((DataCollector) it.next()).collect(context).entrySet());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(arrayList, 10)), 16));
        for (Map.Entry entry : arrayList) {
            hwc hwcVarM53620a = vyh.m53620a(entry.getKey(), entry.getValue());
            linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getValue();
            if (!(str == null || str.length() == 0)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
