package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 implements s1 {

    /* renamed from: b */
    public static final z0 f6704b = new z0(0);

    /* renamed from: a */
    public final /* synthetic */ int f6705a;

    public /* synthetic */ z0(int i10) {
        this.f6705a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r13[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008c, code lost:
    
        if (r13[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009b A[ADDED_TO_REGION, LOOP:1: B:62:0x009b->B:124:0x009b, LOOP_START, PHI: r12
      0x009b: PHI (r12v3 int) = (r12v2 int), (r12v7 int) binds: [B:60:0x0098, B:124:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m4008c(int r11, int r12, byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0.m4008c(int, int, byte[], int):int");
    }

    /* renamed from: d */
    public static final q1 m4009d(Object obj, Object obj2) {
        q1 q1Var = (q1) obj;
        q1 q1Var2 = (q1) obj2;
        if (!q1Var2.isEmpty()) {
            if (!q1Var.f6636a) {
                if (q1Var.isEmpty()) {
                    q1Var = new q1();
                } else {
                    q1 q1Var3 = new q1(q1Var);
                    q1Var3.f6636a = true;
                    q1Var = q1Var3;
                }
            }
            q1Var.m3943d();
            if (!q1Var2.isEmpty()) {
                q1Var.putAll(q1Var2);
            }
        }
        return q1Var;
    }

    /* renamed from: e */
    public static void m4010e(p1 p1Var, Map.Entry entry) {
        c1 c1Var = (c1) entry.getKey();
        q2 q2Var = q2.zza;
        c1Var.getClass();
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1
    /* renamed from: a */
    public a2 mo3932a(Class cls) {
        switch (this.f6705a) {
            case 0:
                if (!e1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (a2) e1.m3831e(cls.asSubclass(e1.class)).mo3803m(3, null);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1
    /* renamed from: b */
    public boolean mo3933b(Class cls) {
        switch (this.f6705a) {
            case 0:
                return e1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
