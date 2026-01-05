package bk;

import a9.C0073l;
import android.graphics.Bitmap;
import android.media.Image;
import b2.C0554l;
import c9.C0908c;
import gl.AbstractC2625a;
import gl.C2629e;
import hl.C2964a;
import java.util.Date;
import mg.j0;
import og.dc;
import og.ec;
import og.nb;
import og.ob;
import og.qc;
import og.sb;
import og.xg;
import org.json.JSONArray;
import org.json.JSONObject;
import p020v.x0;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.f */
/* loaded from: classes.dex */
public final class C0675f implements xg {

    /* renamed from: a */
    public long f4250a;

    /* renamed from: b */
    public Object f4251b;

    /* renamed from: c */
    public Object f4252c;

    /* renamed from: d */
    public Object f4253d;

    /* renamed from: e */
    public Object f4254e;

    /* renamed from: f */
    public Object f4255f;

    /* renamed from: a */
    public C0676g m1951a() {
        return new C0676g((JSONObject) this.f4251b, (Date) this.f4253d, (JSONArray) this.f4254e, (JSONObject) this.f4252c, this.f4250a, (JSONArray) this.f4255f);
    }

    @Override // og.xg
    public C0554l zza() {
        int iLimit;
        C2629e c2629e = (C2629e) this.f4251b;
        long j6 = this.f4250a;
        ec ecVar = (ec) this.f4252c;
        j0 j0Var = (j0) this.f4253d;
        j0 j0Var2 = (j0) this.f4254e;
        C2964a c2964a = (C2964a) this.f4255f;
        C0073l c0073l = new C0073l();
        C0073l c0073l2 = new C0073l();
        c0073l2.f264a = Long.valueOf(j6 & Long.MAX_VALUE);
        c0073l2.f265b = ecVar;
        c0073l2.f266c = Boolean.valueOf(C2629e.f14209j);
        Boolean bool = Boolean.TRUE;
        c0073l2.f267d = bool;
        c0073l2.f268e = bool;
        c0073l.f264a = new sb(c0073l2);
        c0073l.f265b = AbstractC2625a.m6597a(c2629e.f14213d);
        c0073l.f266c = j0Var.m9622c();
        c0073l.f267d = j0Var2.m9622c();
        int i10 = c2964a.f16028f;
        if (i10 == -1) {
            Bitmap bitmap = c2964a.f16023a;
            AbstractC6840z.m13036g(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else {
            if (i10 == 17 || i10 == 842094169) {
                AbstractC6840z.m13036g(null);
                throw null;
            }
            if (i10 != 35) {
                iLimit = 0;
            } else {
                Image.Plane[] planeArrM7245a = c2964a.m7245a();
                AbstractC6840z.m13036g(planeArrM7245a);
                iLimit = (planeArrM7245a[0].getBuffer().limit() * 3) / 2;
            }
        }
        C0908c c0908c = new C0908c(12, false);
        c0908c.f5574b = i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? nb.UNKNOWN_FORMAT : nb.NV21 : nb.NV16 : nb.YV12 : nb.YUV_420_888 : nb.BITMAP;
        c0908c.f5575c = Integer.valueOf(Integer.MAX_VALUE & iLimit);
        c0073l.f268e = new ob(c0908c);
        x0 x0Var = new x0(8, false);
        x0Var.f36756d = c2629e.f14218i ? dc.TYPE_THICK : dc.TYPE_THIN;
        x0Var.f36757e = new qc(c0073l);
        return new C0554l(x0Var, 0);
    }
}
