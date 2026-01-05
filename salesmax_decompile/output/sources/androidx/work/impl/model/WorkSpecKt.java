package androidx.work.impl.model;

import p001o.sq8;

/* loaded from: classes2.dex */
public final class WorkSpecKt {
    public static final WorkGenerationalId generationalId(WorkSpec workSpec) {
        sq8.m48649h(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.id, workSpec.getGeneration());
    }
}
