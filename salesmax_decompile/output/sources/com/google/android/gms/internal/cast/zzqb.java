package com.google.android.gms.internal.cast;

import p001o.dkj;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzqb {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!dkj.m23383a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
