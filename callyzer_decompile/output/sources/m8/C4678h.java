package m8;

import android.content.Context;
import aw.C0465e;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import l8.AbstractC4428b;
import l8.InterfaceC4427a;
import l8.InterfaceC4431e;
import og.nd;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m8.h */
/* loaded from: classes.dex */
public final class C4678h implements InterfaceC4431e {

    /* renamed from: a */
    public final Context f23129a;

    /* renamed from: b */
    public final String f23130b;

    /* renamed from: c */
    public final AbstractC4428b f23131c;

    /* renamed from: d */
    public final boolean f23132d;

    /* renamed from: e */
    public final boolean f23133e;

    /* renamed from: f */
    public final C6366p f23134f;

    /* renamed from: g */
    public boolean f23135g;

    public C4678h(Context context, String str, AbstractC4428b callback, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(callback, "callback");
        this.f23129a = context;
        this.f23130b = str;
        this.f23131c = callback;
        this.f23132d = z6;
        this.f23133e = z10;
        this.f23134f = nd.m10782c(new C0465e(23, this));
    }

    @Override // l8.InterfaceC4431e
    /* renamed from: K */
    public final InterfaceC4427a mo9272K() {
        return ((C4677g) this.f23134f.getValue()).m9571h(false);
    }

    @Override // l8.InterfaceC4431e
    /* renamed from: O */
    public final InterfaceC4427a mo9273O() {
        return ((C4677g) this.f23134f.getValue()).m9571h(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C6366p c6366p = this.f23134f;
        if (c6366p.isInitialized()) {
            ((C4677g) c6366p.getValue()).close();
        }
    }

    @Override // l8.InterfaceC4431e
    public final String getDatabaseName() {
        return this.f23130b;
    }

    @Override // l8.InterfaceC4431e
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        C6366p c6366p = this.f23134f;
        if (c6366p.isInitialized()) {
            ((C4677g) c6366p.getValue()).setWriteAheadLoggingEnabled(z6);
        }
        this.f23135g = z6;
    }
}
