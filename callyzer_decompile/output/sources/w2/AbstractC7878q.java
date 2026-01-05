package w2;

import a3.C0043b;
import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import i1.f0;
import s3.AbstractC6744a;
import tx.C7263w;
import tx.InterfaceC7266z;
import tx.c0;
import tx.e1;
import tx.f1;
import v3.AbstractC7634f;
import v3.InterfaceC7641m;
import v3.h1;
import v3.m1;
import w3.C7904v;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.q */
/* loaded from: classes.dex */
public abstract class AbstractC7878q implements InterfaceC7641m {

    /* renamed from: b */
    public C8810d f37671b;

    /* renamed from: c */
    public int f37672c;

    /* renamed from: e */
    public AbstractC7878q f37674e;

    /* renamed from: f */
    public AbstractC7878q f37675f;

    /* renamed from: g */
    public m1 f37676g;

    /* renamed from: h */
    public h1 f37677h;

    /* renamed from: j */
    public boolean f37678j;

    /* renamed from: k */
    public boolean f37679k;

    /* renamed from: l */
    public boolean f37680l;

    /* renamed from: m */
    public boolean f37681m;

    /* renamed from: n */
    public C0043b f37682n;

    /* renamed from: p */
    public boolean f37683p;

    /* renamed from: a */
    public AbstractC7878q f37670a = this;

    /* renamed from: d */
    public int f37673d = -1;

    public boolean A0() {
        return !(this instanceof f0);
    }

    public void B0() {
        if (this.f37683p) {
            AbstractC6744a.m12907b("node attached multiple times");
        }
        if (this.f37677h == null) {
            AbstractC6744a.m12907b("attach invoked on a node without a coordinator");
        }
        this.f37683p = true;
        this.f37680l = true;
    }

    public void C0() {
        if (!this.f37683p) {
            AbstractC6744a.m12907b("Cannot detach a node that is not attached");
        }
        if (this.f37680l) {
            AbstractC6744a.m12907b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f37681m) {
            AbstractC6744a.m12907b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f37683p = false;
        C8810d c8810d = this.f37671b;
        if (c8810d != null) {
            c0.m13485h(c8810d, new ModifierNodeDetachedCancellationException());
            this.f37671b = null;
        }
    }

    public void G0() {
        if (!this.f37683p) {
            AbstractC6744a.m12907b("reset() called on an unattached node");
        }
        F0();
    }

    public void H0() {
        if (!this.f37683p) {
            AbstractC6744a.m12907b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f37680l) {
            AbstractC6744a.m12907b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f37680l = false;
        D0();
        this.f37681m = true;
    }

    public void I0() {
        if (!this.f37683p) {
            AbstractC6744a.m12907b("node detached multiple times");
        }
        if (this.f37677h == null) {
            AbstractC6744a.m12907b("detach invoked on a node without a coordinator");
        }
        if (!this.f37681m) {
            AbstractC6744a.m12907b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f37681m = false;
        C0043b c0043b = this.f37682n;
        if (c0043b != null) {
            c0043b.invoke();
        }
        E0();
    }

    public void J0(AbstractC7878q abstractC7878q) {
        this.f37670a = abstractC7878q;
    }

    public void K0(h1 h1Var) {
        this.f37677h = h1Var;
    }

    public final InterfaceC7266z z0() {
        C8810d c8810d = this.f37671b;
        if (c8810d != null) {
            return c8810d;
        }
        C8810d c8810dM13479b = c0.m13479b(((C7904v) AbstractC7634f.m14564y(this)).getCoroutineContext().t0(new f1((e1) ((C7904v) AbstractC7634f.m14564y(this)).getCoroutineContext().o0(C7263w.f34689b))));
        this.f37671b = c8810dM13479b;
        return c8810dM13479b;
    }

    public void D0() {
    }

    public void E0() {
    }

    public void F0() {
    }
}
