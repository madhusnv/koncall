package ef;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import hf.AbstractC2919a;
import p020v.C7599i;
import p020v.InterfaceC7598h;
import ue.EnumC7422d;
import x4.C8299i;
import x4.InterfaceC8300j;
import xe.C8357i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ef.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C2046f implements InterfaceC2047g, InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ long f9618a;

    /* renamed from: b */
    public final /* synthetic */ Object f9619b;

    public /* synthetic */ C2046f(long j6, C8357i c8357i) {
        this.f9618a = j6;
        this.f9619b = c8357i;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(final C8299i c8299i) {
        C7599i c7599i = (C7599i) this.f9619b;
        final long j6 = this.f9618a;
        c7599i.m14393h(new InterfaceC7598h() { // from class: v.f
            /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
            @Override // p020v.InterfaceC7598h
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean mo14373a(android.hardware.camera2.TotalCaptureResult r5) {
                /*
                    r4 = this;
                    android.hardware.camera2.CaptureRequest r0 = r5.getRequest()
                    if (r0 != 0) goto L7
                    goto L2e
                L7:
                    android.hardware.camera2.CaptureRequest r5 = r5.getRequest()
                    java.lang.Object r5 = r5.getTag()
                    boolean r0 = r5 instanceof i0.r2
                    if (r0 == 0) goto L2e
                    i0.r2 r5 = (i0.r2) r5
                    java.lang.String r0 = "CameraControlSessionUpdateId"
                    android.util.ArrayMap r5 = r5.f16577a
                    java.lang.Object r5 = r5.get(r0)
                    java.lang.Long r5 = (java.lang.Long) r5
                    if (r5 != 0) goto L22
                    goto L2e
                L22:
                    long r0 = r5.longValue()
                    long r2 = r1
                    int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r5 < 0) goto L2e
                    r5 = 1
                    goto L2f
                L2e:
                    r5 = 0
                L2f:
                    if (r5 == 0) goto L39
                    r5 = 0
                    x4.i r0 = r3
                    r0.m15507b(r5)
                    r5 = 1
                    return r5
                L39:
                    r5 = 0
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p020v.C7596f.mo14373a(android.hardware.camera2.TotalCaptureResult):boolean");
            }
        });
        return "waitForSessionUpdateId:" + j6;
    }

    @Override // ef.InterfaceC2047g
    public Object apply(Object obj) {
        C8357i c8357i = (C8357i) this.f9619b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f9618a));
        String str = c8357i.f39998a;
        EnumC7422d enumC7422d = c8357i.f40000c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC2919a.m7025a(enumC7422d))}) < 1) {
            contentValues.put("backend_name", c8357i.f39998a);
            contentValues.put("priority", Integer.valueOf(AbstractC2919a.m7025a(enumC7422d)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public /* synthetic */ C2046f(C7599i c7599i, long j6) {
        this.f9619b = c7599i;
        this.f9618a = j6;
    }
}
