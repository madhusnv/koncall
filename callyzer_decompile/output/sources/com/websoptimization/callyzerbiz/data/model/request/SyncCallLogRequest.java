package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.db.SyncCallLog;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SyncCallLogRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7363b;

    /* renamed from: c */
    public final int f7364c;

    @InterfaceC4485b("callLogs")
    private final List<SyncCallLog> callLogs;

    @InterfaceC4485b("totalInCompleteCall")
    private final Integer totalIncompleteCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCallLogRequest(C4802m userSim, List<SyncCallLog> callLogs, int i10) {
        super(userSim);
        AbstractC4154l.m8923f(userSim, "userSim");
        AbstractC4154l.m8923f(callLogs, "callLogs");
        this.f7363b = userSim;
        this.callLogs = callLogs;
        this.f7364c = i10;
        this.totalIncompleteCall = i10 > -1 ? Integer.valueOf(i10) : null;
    }

    /* renamed from: N */
    public final List m4689N() {
        return this.callLogs;
    }

    /* renamed from: O */
    public final String m4690O() {
        String string;
        String str = this.f7363b.f23891c;
        if (this.callLogs.isEmpty()) {
            string = "callLogs is empty";
        } else {
            int size = this.callLogs.size();
            String strM4619a = ((SyncCallLog) AbstractC6663m.m12742F(this.callLogs)).m4619a();
            String strM4619a2 = ((SyncCallLog) AbstractC6663m.m12750N(this.callLogs)).m4619a();
            StringBuilder sbM14337q = a1.m14337q(size, "size of callLogs:=", ", first callLog dateTime:= ", strM4619a, " , last callLog dateTime := ");
            sbM14337q.append(strM4619a2);
            string = sbM14337q.toString();
        }
        return "simNumber := " + str + " >>> callLogs Details := " + ((Object) string);
    }

    /* renamed from: P */
    public final boolean m4691P() {
        List<SyncCallLog> list = this.callLogs;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC4154l.m8918a(((SyncCallLog) it.next()).f7333c, "CallLogVerification")) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncCallLogRequest)) {
            return false;
        }
        SyncCallLogRequest syncCallLogRequest = (SyncCallLogRequest) obj;
        return AbstractC4154l.m8918a(this.f7363b, syncCallLogRequest.f7363b) && AbstractC4154l.m8918a(this.callLogs, syncCallLogRequest.callLogs) && this.f7364c == syncCallLogRequest.f7364c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7364c) + AbstractC1452a.m4559f(this.callLogs, this.f7363b.hashCode() * 31, 31);
    }

    public final String toString() {
        List<SyncCallLog> list = this.callLogs;
        StringBuilder sb2 = new StringBuilder("SyncCallLogRequest(userSim=");
        sb2.append(this.f7363b);
        sb2.append(", callLogs=");
        sb2.append(list);
        sb2.append(", totalIncompleteCallCount=");
        return AbstractC5601a.m11233d(this.f7364c, ")", sb2);
    }

    public /* synthetic */ SyncCallLogRequest(C4802m c4802m, List list, int i10, int i11, AbstractC4148f abstractC4148f) {
        this(c4802m, list, (i11 & 4) != 0 ? -1 : i10);
    }
}
