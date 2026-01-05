package z8;

import a9.AbstractC0067f;
import c9.C0922q;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7059e;
import uw.C7565i;
import vx.EnumC7799a;
import wx.C8202c;
import yt.C8769a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z8.c */
/* loaded from: classes.dex */
public abstract class AbstractC8900c implements InterfaceC8902e {

    /* renamed from: a */
    public final AbstractC0067f f42862a;

    public AbstractC8900c(AbstractC0067f tracker) {
        AbstractC4154l.m8923f(tracker, "tracker");
        this.f42862a = tracker;
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: b */
    public final C8202c mo15951b(C7059e constraints) {
        AbstractC4154l.m8923f(constraints, "constraints");
        return new C8202c(new C8769a(this, null, 6), C7565i.f36440a, -2, EnumC7799a.SUSPEND);
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: c */
    public final boolean mo15952c(C0922q c0922q) {
        return mo15950a(c0922q) && mo16405e(this.f42862a.mo182c());
    }

    /* renamed from: d */
    public abstract int mo16404d();

    /* renamed from: e */
    public abstract boolean mo16405e(Object obj);
}
