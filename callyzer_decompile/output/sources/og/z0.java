package og;

import android.graphics.Typeface;
import b8.C0615j;
import ex.InterfaceC2139c;
import f9.C2222e;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import uw.InterfaceC7559c;
import z7.AbstractC8894w;
import z7.C8881j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z0 {
    /* renamed from: a */
    public static final C0615j m11078a(AbstractC8894w db2, String[] strArr, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(db2, "db");
        C8881j c8881jM16391j = db2.m16391j();
        String[] tables = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC4154l.m8923f(tables, "tables");
        z7.n0 n0Var = c8881jM16391j.f42748b;
        C6361k c6361kM16383g = n0Var.m16383g(tables);
        String[] resolvedTableNames = (String[]) c6361kM16383g.f30755a;
        int[] tableIds = (int[]) c6361kM16383g.f30756b;
        AbstractC4154l.m8923f(resolvedTableNames, "resolvedTableNames");
        AbstractC4154l.m8923f(tableIds, "tableIds");
        return new C0615j(wx.c1.m15376g(new C2222e(new xm.s1(n0Var, tableIds, resolvedTableNames, (InterfaceC7559c) null, 5)), -1), db2, interfaceC2139c, 0);
    }

    /* renamed from: b */
    public abstract void mo7029b(int i10);

    /* renamed from: c */
    public abstract void mo7030c(Typeface typeface, boolean z6);
}
