package ov;

import android.content.Context;
import bq.C0724d;
import d7.q0;
import d7.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nv.C5150b;
import pg.o6;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ov.h */
/* loaded from: classes3.dex */
public final class C5757h extends w0 {

    /* renamed from: b */
    public final Context f28324b;

    /* renamed from: c */
    public final y5 f28325c;

    /* renamed from: d */
    public final C7806h f28326d;

    /* renamed from: e */
    public final C8203d f28327e;

    /* renamed from: f */
    public final m1 f28328f;

    /* renamed from: g */
    public final wx.w0 f28329g;

    public C5757h(Context context, y5 userSIMRepository) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f28324b = context;
        this.f28325c = userSIMRepository;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f28326d = c7806hM11805a;
        this.f28327e = c1.m15389t(c7806hM11805a);
        m1 m1VarM15372c = c1.m15372c(new C5150b(C6668r.f31943a, false));
        this.f28328f = m1VarM15372c;
        this.f28329g = new wx.w0(m1VarM15372c);
        c0.m13502y(q0.m5340g(this), null, null, new C0724d(this, (InterfaceC7559c) null, 11), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r10.m15397i(r9, nv.C5150b.m10058a(r8, (java.util.List) r1, 2)) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006a -> B:20:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m11287e(ov.C5757h r17, ww.AbstractC8193c r18) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov.C5757h.m11287e(ov.h, ww.c):java.io.Serializable");
    }

    /* renamed from: f */
    public final void m11288f(AbstractC5753d event) {
        m1 m1Var;
        Object value;
        AbstractC4154l.m8923f(event, "event");
        InterfaceC7559c interfaceC7559c = null;
        if (event instanceof C5752c) {
            do {
                m1Var = this.f28328f;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C5150b.m10058a((C5150b) value, null, 1)));
            c0.m13502y(q0.m5340g(this), null, null, new C5754e(this, interfaceC7559c, 0), 3);
            return;
        }
        if (event instanceof C5751b) {
            c0.m13502y(q0.m5340g(this), null, null, new C5754e(this, interfaceC7559c, 2), 3);
        } else if (!(event instanceof C5750a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11289g(ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov.C5757h.m11289g(ww.c):java.lang.Object");
    }
}
