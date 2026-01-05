package dt;

import ab.C0084b;
import android.content.Context;
import at.C0433d;
import d7.w0;
import kotlin.NoWhenBranchMatchedException;
import pg.o6;
import qn.C6263l;
import td.AbstractC7136m;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yx.C8810d;
import zs.C9056u;
import zs.C9057v;
import zs.C9058w;
import zs.C9059x;
import zs.C9060y;
import zs.C9061z;
import zs.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.x */
/* loaded from: classes3.dex */
public final class C1818x extends w0 {

    /* renamed from: b */
    public final C6263l f8788b;

    /* renamed from: c */
    public final Context f8789c;

    /* renamed from: d */
    public final C8810d f8790d;

    /* renamed from: e */
    public final Context f8791e;

    /* renamed from: f */
    public final m1 f8792f;

    /* renamed from: g */
    public final wx.w0 f8793g;

    /* renamed from: h */
    public final C7806h f8794h;

    /* renamed from: i */
    public final C8203d f8795i;

    public C1818x(C6263l c6263l, Context context, C8810d c8810d, Context context2) {
        this.f8788b = c6263l;
        this.f8789c = context;
        this.f8790d = c8810d;
        this.f8791e = context2;
        m1 m1VarM15372c = c1.m15372c(new C0433d(false, false, false, false, "", null, false));
        this.f8792f = m1VarM15372c;
        this.f8793g = new wx.w0(m1VarM15372c);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f8794h = c7806hM11805a;
        this.f8795i = c1.m15389t(c7806hM11805a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r2 == r4) goto L48;
     */
    /* JADX WARN: Path cross not found for [B:41:0x00d0, B:35:0x00c3], limit reached: 54 */
    /* JADX WARN: Path cross not found for [B:41:0x00d0, B:37:0x00c7], limit reached: 54 */
    /* JADX WARN: Path cross not found for [B:43:0x00d3, B:45:0x00d7], limit reached: 54 */
    /* JADX WARN: Path cross not found for [B:45:0x00d7, B:43:0x00d3], limit reached: 54 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f1 -> B:14:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5480e(int r23, ww.AbstractC8193c r24) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.C1818x.m5480e(int, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void m5481f(AbstractC7136m abstractC7136m) {
        Object value;
        Object value2;
        Object value3;
        boolean z6 = abstractC7136m instanceof C9056u;
        C8810d c8810d = this.f8790d;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C1816v(this, abstractC7136m, interfaceC7559c, 0), 3);
            return;
        }
        if (abstractC7136m instanceof C9058w) {
            c0.m13502y(c8810d, null, null, new C1816v(this, abstractC7136m, interfaceC7559c, 1), 3);
            return;
        }
        boolean z10 = abstractC7136m instanceof C9059x;
        m1 m1Var = this.f8792f;
        if (z10) {
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, C0433d.m1455a((C0433d) value3, ((C9059x) abstractC7136m).f43569a, false, false, false, null, null, false, 126)));
            return;
        }
        if (abstractC7136m instanceof C9060y) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C0433d.m1455a((C0433d) value2, false, false, false, false, null, ((C9060y) abstractC7136m).f43570a, false, 95)));
        } else {
            if (abstractC7136m instanceof C9057v) {
                c0.m13502y(c8810d, null, null, new C0084b(this, interfaceC7559c, 10), 3);
                return;
            }
            if (abstractC7136m instanceof a0) {
                c0.m13502y(c8810d, null, null, new C1816v(this, abstractC7136m, interfaceC7559c, 2), 3);
            } else {
                if (!abstractC7136m.equals(C9061z.f43571a)) {
                    throw new NoWhenBranchMatchedException();
                }
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C0433d.m1455a((C0433d) value, false, false, false, false, null, null, !((C0433d) this.f8793g.f39340a.getValue()).f3198g, 63)));
            }
        }
    }
}
