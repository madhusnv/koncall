package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.cast.MediaTrack;
import java.util.Map;

/* loaded from: classes6.dex */
public final class si1 extends pzf {

    /* renamed from: e */
    public static final si1 f45452e = new si1();

    public si1() {
        super(szf.f46164f, null);
    }

    @Override // p001o.pzf
    /* renamed from: b */
    public void mo44562b(String str, Map map) {
        kri.m36136b(str, MediaTrack.ROLE_DESCRIPTION);
        kri.m36136b(map, "attributes");
    }

    @Override // p001o.pzf
    /* renamed from: c */
    public void mo44563c(kcb kcbVar) {
        kri.m36136b(kcbVar, "messageEvent");
    }

    @Override // p001o.pzf
    /* renamed from: e */
    public void mo44565e(z76 z76Var) {
        kri.m36136b(z76Var, "options");
    }

    @Override // p001o.pzf
    /* renamed from: g */
    public void mo44567g(String str, ox0 ox0Var) {
        kri.m36136b(str, TransferTable.COLUMN_KEY);
        kri.m36136b(ox0Var, "value");
    }

    public String toString() {
        return "BlankSpan";
    }
}
