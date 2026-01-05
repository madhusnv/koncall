package pg;

import v3.AbstractC7634f;
import v3.C7649u;
import z2.C8860e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o9 {

    /* renamed from: a */
    public static final /* synthetic */ int f29011a = 0;

    /* renamed from: a */
    public static final boolean m11811a(C8860e c8860e, long j6) {
        if (!c8860e.f37670a.f37683p) {
            return false;
        }
        C7649u c7649u = (C7649u) AbstractC7634f.m14563x(c8860e).f36832K.f22539c;
        if (!c7649u.f37016V.f37683p) {
            return false;
        }
        long jMo13299V = c7649u.mo13299V(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo13299V >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo13299V & 4294967295L));
        long j10 = c8860e.f42641s;
        float f6 = ((int) (j10 >> 32)) + fIntBitsToFloat;
        float f10 = ((int) (j10 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f6) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f10;
    }
}
