package hq;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import g1.C2433m;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4171a;
import l7.C4409i;
import l8.InterfaceC4433g;
import m8.C4679i;
import sq.g2;
import vv.AbstractC7792d;
import w2.C7876o;
import wr.C8146b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3011p implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f16271a;

    /* renamed from: b */
    public final /* synthetic */ Object f16272b;

    public /* synthetic */ C3011p(int i10, Object obj) {
        this.f16271a = i10;
        this.f16272b = obj;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f16271a) {
            case 0:
                C4171a c4171a = (C4171a) this.f16272b;
                InterfaceC0246a stickyHeader = (InterfaceC0246a) obj;
                ((Integer) obj2).getClass();
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                AbstractC4154l.m8923f(stickyHeader, "$this$stickyHeader");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 129) != 128)) {
                    g2.m13125C(48, c4171a.f21175a, c3966o, AbstractC0242a.m656j(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 10));
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 1:
                InterfaceC4433g interfaceC4433g = (InterfaceC4433g) this.f16272b;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                AbstractC4154l.m8920c(sQLiteQuery);
                interfaceC4433g.mo5739h(new C4679i(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f16272b;
                C2433m composable = (C2433m) obj;
                C4409i it = (C4409i) obj2;
                ((Integer) obj4).getClass();
                AbstractC4154l.m8923f(composable, "$this$composable");
                AbstractC4154l.m8923f(it, "it");
                C3966o c3966o2 = (C3966o) ((InterfaceC3962k) obj3);
                boolean zM8614g = c3966o2.m8614g(interfaceC2139c);
                Object objM8596M = c3966o2.m8596M();
                if (zM8614g || objM8596M == C3961j.f20408a) {
                    objM8596M = new C8146b(10, interfaceC2139c);
                    c3966o2.j0(objM8596M);
                }
                AbstractC7792d.m14749a((InterfaceC2139c) objM8596M, c3966o2, 0);
                return qw.a0.f30746a;
        }
    }
}
