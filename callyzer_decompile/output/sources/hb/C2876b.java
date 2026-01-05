package hb;

import ec.C2011i;
import java.util.List;
import java.util.Map;
import ng.C5070u;
import og.be;
import og.pe;
import pg.d9;
import pg.f9;
import pg.g9;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hb.b */
/* loaded from: classes.dex */
public final class C2876b {

    /* renamed from: a */
    public final List f15900a;

    /* renamed from: b */
    public final Map f15901b;

    /* renamed from: c */
    public final List f15902c;

    public C2876b(List list, int i10) {
        switch (i10) {
            case 2:
                this.f15900a = list;
                this.f15901b = AbstractC6674x.m12777e(new C6361k("CreateToken", pe.m10833h(be.m10556a("smithy.api#noAuth", C2011i.f9543a))));
                this.f15902c = pe.m10833h(g9.m11667g(null, null, null, 31));
                break;
            case 3:
                this.f15900a = list;
                this.f15901b = AbstractC6674x.m12777e(new C6361k("AssumeRoleWithWebIdentity", pe.m10833h(be.m10556a("smithy.api#noAuth", C2011i.f9543a))));
                this.f15902c = pe.m10833h(g9.m11667g(null, null, null, 31));
                break;
            default:
                this.f15900a = list;
                this.f15901b = AbstractC6674x.m12777e(new C6361k("GetRoleCredentials", pe.m10833h(be.m10556a("smithy.api#noAuth", C2011i.f9543a))));
                this.f15902c = pe.m10833h(g9.m11667g(null, null, null, 31));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[LOOP:0: B:29:0x007d->B:31:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[LOOP:2: B:42:0x00e2->B:43:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m6993a(hb.C2877c r8, ww.AbstractC8193c r9) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.C2876b.m6993a(hb.c, ww.c):java.io.Serializable");
    }

    public C2876b(C5070u c5070u, List list) {
        this.f15900a = list;
        this.f15901b = AbstractC6674x.m12777e(new C6361k("WriteGetObjectResponse", pe.m10833h(g9.m11667g(null, null, null, 30))));
        this.f15902c = pe.m10834i(g9.m11667g(null, null, null, 31), f9.m11634h(null, null, null, 31), d9.m11590c(null, null, 31));
    }
}
