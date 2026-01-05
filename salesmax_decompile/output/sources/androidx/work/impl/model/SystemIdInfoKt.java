package androidx.work.impl.model;

import p001o.sq8;

/* loaded from: classes2.dex */
public final class SystemIdInfoKt {
    public static final SystemIdInfo systemIdInfo(WorkGenerationalId workGenerationalId, int i) {
        sq8.m48649h(workGenerationalId, "generationalId");
        return new SystemIdInfo(workGenerationalId.getWorkSpecId(), workGenerationalId.getGeneration(), i);
    }
}
