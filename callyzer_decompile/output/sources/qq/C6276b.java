package qq;

import android.annotation.SuppressLint;
import android.content.Context;
import d7.q0;
import d7.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.va;
import oq.C5436a;
import oq.C5437b;
import p020v.x0;
import pg.o6;
import pq.C5997b;
import rn.h0;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8803r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"StaticFieldLeak"})
/* renamed from: qq.b */
/* loaded from: classes3.dex */
public final class C6276b extends w0 {

    /* renamed from: b */
    public final Context f30488b;

    /* renamed from: c */
    public final h0 f30489c;

    /* renamed from: d */
    public final x0 f30490d;

    /* renamed from: e */
    public final C8803r f30491e;

    /* renamed from: f */
    public final m1 f30492f;

    /* renamed from: g */
    public final wx.w0 f30493g;

    /* renamed from: h */
    public boolean f30494h;

    /* renamed from: i */
    public final C7806h f30495i;

    /* renamed from: j */
    public final C8203d f30496j;

    public C6276b(Context context, h0 callRecordingUseCase, x0 x0Var, C8803r networkObserver) {
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(networkObserver, "networkObserver");
        this.f30488b = context;
        this.f30489c = callRecordingUseCase;
        this.f30490d = x0Var;
        this.f30491e = networkObserver;
        m1 m1VarM15372c = c1.m15372c(new C5997b(null, true, -1, false, C6668r.f31943a, null, null));
        this.f30492f = m1VarM15372c;
        this.f30493g = new wx.w0(m1VarM15372c);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f30495i = c7806hM11805a;
        this.f30496j = c1.m15389t(c7806hM11805a);
    }

    /* renamed from: e */
    public final void m12279e(va vaVar) {
        m1 m1Var;
        Object value;
        if (vaVar instanceof C5436a) {
            do {
                m1Var = this.f30492f;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C5997b.m12030a((C5997b) value, null, ((C5436a) vaVar).f27344a, null, null, null, 115)));
        } else {
            if (!(vaVar instanceof C5437b)) {
                throw new NoWhenBranchMatchedException();
            }
            c0.m13502y(q0.m5340g(this), null, null, new ps.c0(this, (InterfaceC7559c) null, 5), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12280f(android.content.Intent r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qq.C6276b.m12280f(android.content.Intent, ww.c):java.lang.Object");
    }
}
