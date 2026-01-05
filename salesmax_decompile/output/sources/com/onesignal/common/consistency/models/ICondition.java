package com.onesignal.common.consistency.models;

import com.onesignal.common.consistency.RywData;
import java.util.Map;

/* loaded from: classes6.dex */
public interface ICondition {
    String getId();

    RywData getRywData(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> map);

    boolean isMet(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> map);
}
