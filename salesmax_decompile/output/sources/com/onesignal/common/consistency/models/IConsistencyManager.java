package com.onesignal.common.consistency.models;

import com.onesignal.common.consistency.RywData;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IConsistencyManager {
    Object getRywDataFromAwaitableCondition(ICondition iCondition, n64 n64Var);

    Object resolveConditionsWithID(String str, n64 n64Var);

    Object setRywData(String str, IConsistencyKeyEnum iConsistencyKeyEnum, RywData rywData, n64 n64Var);
}
