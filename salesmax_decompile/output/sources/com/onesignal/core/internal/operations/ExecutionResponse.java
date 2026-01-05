package com.onesignal.core.internal.operations;

import java.util.List;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class ExecutionResponse {
    private final Map<String, String> idTranslations;
    private final List<Operation> operations;
    private final ExecutionResult result;
    private final Integer retryAfterSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResponse(ExecutionResult executionResult, Map<String, String> map, List<? extends Operation> list, Integer num) {
        sq8.m48649h(executionResult, "result");
        this.result = executionResult;
        this.idTranslations = map;
        this.operations = list;
        this.retryAfterSeconds = num;
    }

    public final Map<String, String> getIdTranslations() {
        return this.idTranslations;
    }

    public final List<Operation> getOperations() {
        return this.operations;
    }

    public final ExecutionResult getResult() {
        return this.result;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public /* synthetic */ ExecutionResponse(ExecutionResult executionResult, Map map, List list, Integer num, int i, id5 id5Var) {
        this(executionResult, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num);
    }
}
