package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.Condition;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class BooleanCondition extends Condition {
    public BooleanCondition(String str, boolean z) {
        this.f58084type = "Bool";
        this.conditionKey = str;
        this.values = Arrays.asList(Boolean.toString(z));
    }
}
