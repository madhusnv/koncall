package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.j9;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzpz {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!j9.m33417a(atomicReferenceFieldUpdater, obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
