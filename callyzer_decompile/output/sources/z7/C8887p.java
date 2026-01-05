package z7;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.qe;
import rw.C6670t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.p */
/* loaded from: classes.dex */
public final class C8887p {

    /* renamed from: a */
    public final AbstractC8879h f42800a;

    /* renamed from: b */
    public final int[] f42801b;

    /* renamed from: c */
    public final String[] f42802c;

    /* renamed from: d */
    public final Set f42803d;

    public C8887p(AbstractC8879h observer, int[] tableIds, String[] tableNames) {
        AbstractC4154l.m8923f(observer, "observer");
        AbstractC4154l.m8923f(tableIds, "tableIds");
        AbstractC4154l.m8923f(tableNames, "tableNames");
        this.f42800a = observer;
        this.f42801b = tableIds;
        this.f42802c = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f42803d = !(tableNames.length == 0) ? qe.m10862h(tableNames[0]) : C6670t.f31945a;
    }
}
