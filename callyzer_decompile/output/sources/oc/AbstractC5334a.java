package oc;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import i0.m0;
import og.ud;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oc.a */
/* loaded from: classes.dex */
public abstract class AbstractC5334a {

    /* renamed from: a */
    public static final /* synthetic */ int f26232a = 0;

    static {
        m0.m7365B(TransferTable.COLUMN_STATE, ud.m10980f(), "idle");
        m0.m7365B(TransferTable.COLUMN_STATE, ud.m10980f(), "acquired");
        m0.m7365B(TransferTable.COLUMN_STATE, ud.m10980f(), "queued");
        m0.m7365B(TransferTable.COLUMN_STATE, ud.m10980f(), "in-flight");
    }
}
